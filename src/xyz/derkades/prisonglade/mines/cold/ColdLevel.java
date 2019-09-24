package xyz.derkades.prisonglade.mines.cold;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;
import xyz.derkades.prisonglade.xp.ExpSettings;

public abstract class ColdLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.COLD;
	}
	public ExpSettings getExpSettings() {
		return new ExpSettings()
				.addBlock(Material.GRAVEL, 1);
}
}