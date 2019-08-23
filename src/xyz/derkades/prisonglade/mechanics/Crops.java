package xyz.derkades.prisonglade.mechanics;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import xyz.derkades.prisonglade.Prison;

public class Crops implements Listener {

	public Crops() {
		Prison.instance.registerListener(this);
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onTrample(final PlayerInteractEvent event) {
		if (event.getAction() == Action.PHYSICAL &&
				event.getClickedBlock().getType() != Material.STONE_PLATE &&
				event.getClickedBlock().getType() != Material.STONE_BUTTON) {
			event.setCancelled(true);
		}
	}

	@EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
	public void onBreak(final BlockBreakEvent event) {
		final Block block = event.getBlock();
		final Material type = block.getType();
		if (type == Material.CARROT || type == Material.CROPS || type == Material.POTATO || type == Material.BEETROOT_BLOCK) {

		}

	}

}
