package xyz.derkades.prisonglade.shops;

import org.bukkit.Location;
import org.bukkit.entity.Villager;

import xyz.derkades.prisonglade.Prison;
import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.mines.PrisonLevels;

public class VillagerSpawner {

	public static final String VILLAGER_NAME = "%s %s shop";

	public void spawnVillagers() {
		for (final PrisonLevel level : PrisonLevels.LEVELS) {
			final Location location = level.getShopLocation();

			if (location == null) {
				Prison.instance.getLogger().warning("Level %s does not have a shop location", level);
				continue;
			}

			this.spawnVillager(location, String.format(VILLAGER_NAME, level.getTheme(), level.getChar()));
		}
	}

	private void spawnVillager(final Location location, final String name) {
		final Villager villager = location.getWorld().spawn(location, Villager.class);
		villager.setAI(false);
		villager.setInvulnerable(true);
		villager.setAdult();
		// TODO Possibly need to set facing direction afterwards?
	}

}
