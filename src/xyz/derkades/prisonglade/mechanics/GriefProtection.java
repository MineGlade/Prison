package xyz.derkades.prisonglade.mechanics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import net.md_5.bungee.api.ChatColor;
import xyz.derkades.prisonglade.Prison;
import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.mines.PrisonLevels;
import xyz.derkades.prisonglade.mines.PrisonMine;

public class GriefProtection implements Listener {

	public GriefProtection(){
		Prison.instance.registerListener(this);
	}

	@EventHandler
	public void onBreak(final BlockBreakEvent event) {
		final Player player = event.getPlayer();

		if (player.getGameMode() == GameMode.CREATIVE) {
			return;
		}

		final List<PrisonLevel> levels = Arrays.asList(PrisonLevels.LEVELS).stream()
				.filter((l) -> l.getWorld().equals(player.getWorld()))
				.collect(Collectors.toList());

		if (levels.isEmpty()) {
			//Player is probably in lobby
			event.setCancelled(true);
			player.sendMessage(ChatColor.GRAY + "You cannot break blocks here");
		} else if (levels.size() > 2) {
			event.setCancelled(true);
			Prison.instance.getLogger().severe("Multiple mines with the same world??");
		}

		final PrisonMine mine = levels.get(0).getMine();

		if (isIn2dBounds(player.getLocation(), mine.getCornerA(), mine.getCornerB())) {
			event.setCancelled(false);
		} else {
			event.setCancelled(true);
			player.sendMessage(ChatColor.GRAY + "You can only harvest crops outside of mines, not break other blocks.");
		}

	}

	private static boolean isIn2dBounds(final Location location, final Location cornerOne, final Location cornerTwo) {
		if (!location.getWorld().equals(cornerOne.getWorld())) {
			return false;
		}

		final int maxX = Math.max(cornerOne.getBlockX(), cornerTwo.getBlockX());
		final int minX = Math.min(cornerOne.getBlockX(), cornerTwo.getBlockX());
		final int maxZ = Math.max(cornerOne.getBlockZ(), cornerTwo.getBlockZ());
		final int minZ = Math.min(cornerOne.getBlockZ(), cornerTwo.getBlockZ());

		final int x = location.getBlockX();
		final int z = location.getBlockZ();

		return x > minX && x < maxX &&
				z > minZ && z < maxZ;
	}

}
