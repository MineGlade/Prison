package xyz.derkades.prisonglade.mines.water;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;
import xyz.derkades.prisonglade.xp.ExpSettings;

public abstract class WaterLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.WATER;
	}
	public ExpSettings getExpSettings() {
		return new ExpSettings()
				.addBlock(Material.GRAVEL, 1);

}
}