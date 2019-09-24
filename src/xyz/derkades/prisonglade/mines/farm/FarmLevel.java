package xyz.derkades.prisonglade.mines.farm;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;
import xyz.derkades.prisonglade.xp.ExpSettings;

public abstract class FarmLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.FARM;
	}

	@Override
	public ExpSettings getExpSettings() {
		return new ExpSettings()
				.addBlock(Material.GRAVEL, 1)
				.addBlock(Material.CLAY, 1)
				.addBlock(Material.LEAVES, 0, 1)
				.addBlock(Material.LEAVES, 2, 1)
				.addBlock(Material.LEAVES, 1, 2)
				.addBlock(Material.LEAVES, 3, 2)
				.addBlock(Material.LEAVES_2, 0, 3)
				.addBlock(Material.LEAVES_2, 1, 3)
				.addBlock(Material.WOOD, 0, 1)
				.addBlock(Material.WOOD, 1, 1)
				.addBlock(Material.WOOD, 3, 2)
				.addBlock(Material.WOOD, 4, 3)
				.addBlock(Material.WOOD, 5, 3)
				.addBlock(Material.LOG, 0, 2)
				.addBlock(Material.LOG, 2, 3)
				.addBlock(Material.LOG, 1, 4)
				.addBlock(Material.LOG, 3, 4)
				.addBlock(Material.LOG_2, 0, 5)
				.addBlock(Material.LOG_2, 1, 5)
				.addBlock(Material.DIRT, 0, 1);
	}

}
