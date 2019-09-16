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

	@SuppressWarnings("deprecation")
	@EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
	public void onTrample(final PlayerInteractEvent event){
	    if (event.getAction() != Action.PHYSICAL){
	    	return;
	    }

		final Block soil = event.getClickedBlock();
		if (soil == null || soil.getType() != Material.SOIL) {
			return;
		}

		//event.setUseInteractedBlock(PlayerInteractEvent.Result.DENY);
		event.setCancelled(true);

		// Dehydrate soil and hydrate after a while
		soil.setType(Material.SOIL);
		soil.setData((byte) 0);
		Prison.instance.getScheduler().delay(40, () -> soil.setData((byte) 7));
	}

	@SuppressWarnings("deprecation")
	@EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
	public void onBreak(final BlockBreakEvent event){
		final Material type = event.getBlock().getType();

		if (type != Material.CROPS && type != Material.CARROT && type != Material.BEETROOT_BLOCK && type != Material.POTATO) {
			return;
		}

		event.setCancelled(true);
		event.getBlock().setData((byte) 0);
		Prison.instance.getScheduler().interval(0, 20, new RegrowTimer(event.getBlock(), 7));
	}

}
