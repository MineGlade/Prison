package xyz.derkades.prisonglade.mechanics;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
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

}
