package xyz.derkades.prisonglade.shops;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.mines.PrisonLevels;

public class ClickListener implements Listener {

	@EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
	public void onClick(final PlayerInteractEntityEvent event) {
		final Entity entity = event.getRightClicked();

		if (entity.getType() != EntityType.VILLAGER)
			return;

		final PrisonLevel level = PrisonLevels.getLevel((LivingEntity) entity);
	}

}
