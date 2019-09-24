package xyz.derkades.prisonglade.mines.end;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;
import xyz.derkades.prisonglade.xp.ExpSettings;

public abstract class EndLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.END;
	}
	public ExpSettings getExpSettings() {
		return new ExpSettings()
				.addBlock(Material.GRAVEL, 1);
}
}