package xyz.derkades.prisonglade.mechanics;

import org.bukkit.CropState;
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
				event.getClickedBlock().getType() == Material.DIRT, 0) { // TODO farmland data value
			event.setCancelled(true);
		}
	}

	@EventHandler(ignoreCancelled = false, priority = EventPriority.HIGH)
	public void onBreak(final BlockBreakEvent event) {
		final Block block = event.getBlock();
		final Material type = block.getType();
		if (type == Material.CARROT || type == Material.CROPS || type == Material.POTATO || type == Material.BEETROOT_BLOCK) {
			event.setCancelled(false); // allow the crop to be destroyed
			
			// slowly grow back the crop
			Prison.instance.getScheduler().interval(0, 20, new Runnable() {
				public void run() {
					block.getState().`
				}
			});
		}

	}

}
