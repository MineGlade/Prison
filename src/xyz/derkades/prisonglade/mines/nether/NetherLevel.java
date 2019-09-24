package xyz.derkades.prisonglade.mines.nether;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;
import xyz.derkades.prisonglade.xp.ExpSettings;

public abstract class NetherLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.NETHER;
	}
	public ExpSettings getExpSettings() {
		return new ExpSettings()
				.addBlock(Material.GRAVEL, 1);

}
}
