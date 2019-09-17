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
				.addBlock(Material.DIRT, 1)
				.addBlock(Material.WOOD, 2)
				;
	}

}
