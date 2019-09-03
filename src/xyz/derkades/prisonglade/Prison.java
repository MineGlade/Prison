package xyz.derkades.prisonglade;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import moda.plugin.moda.modules.IMessage;
import moda.plugin.moda.modules.Module;
import moda.plugin.moda.utils.storage.DatabaseStorageHandler;
import moda.plugin.moda.utils.storage.FileStorageHandler;
import xyz.derkades.prisonglade.mechanics.FillTask;
import xyz.derkades.prisonglade.mechanics.GriefProtection;
import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.mines.PrisonLevels;
import xyz.derkades.prisonglade.storage.PrisonFileStorageHandler;
import xyz.derkades.prisonglade.storage.PrisonStorageHandler;
import xyz.derkades.prisonglade.xp.ExperienceGiveListener;

public class Prison extends Module<PrisonStorageHandler> implements Listener {

	public static Prison instance;

	public Prison() {
		instance = this;
	}

	@Override
	public DatabaseStorageHandler getDatabaseStorageHandler() {
		return null;
	}

	@Override
	public FileStorageHandler getFileStorageHandler() {
		return new PrisonFileStorageHandler(this);
	}

	@Override
	public IMessage[] getMessages() {
		return null;
	}

	@Override
	public String getName() {
		return "Prison";
	}

	@Override
	public void onEnable() {
		this.registerCommand(new MineCommand());
		this.registerCommand(new LobbyCommand());

		for (final PrisonLevel level : PrisonLevels.LEVELS) {
			level.loadWorld();
		}

		new FillTask();
		new GriefProtection();

		this.registerListener(this);
		this.registerListener(new ExperienceGiveListener());
	}

	@EventHandler
	public void onMove(final PlayerMoveEvent event) {
		if (event.getTo().getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.SLIME_BLOCK)) {
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 30, 16, true, false));
		}
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onDamage(final EntityDamageEvent event) {
		if (event.getEntityType() == EntityType.PLAYER && event.getCause() == DamageCause.FALL) {
			event.setCancelled(true);
		}
	}

}
