package xyz.derkades.prisonglade.xp;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ComponentBuilder;
import xyz.derkades.prisonglade.Prison;
import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.mines.PrisonLevels;
import xyz.derkades.prisonglade.themes.Theme;

public class ExperienceGiveListener implements Listener {

	@EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
	public void onBreak(final BlockBreakEvent event) {
		final Player player = event.getPlayer();
		final PrisonLevel level = PrisonLevels.getLevel(player);

		if (level == null)
			return;

		final Theme theme = level.getTheme();

		final int xp = level.getExpSettings().getXp(event.getBlock());
		if (xp > 0) {
			Prison.instance.getStorage().addXp(player, theme, xp);
			player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new ComponentBuilder("+" + xp + " xp").color(ChatColor.GRAY).create());
		}
	}

}
