package xyz.derkades.prisonglade.mines.end;

import org.bukkit.Material;
import org.bukkit.World.Environment;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;
import xyz.derkades.prisonglade.xp.ExpSettings;

public abstract class EndLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.END;
	}

	@Override
	public Environment getEnvironment() {
		return Environment.THE_END;
	}

	@Override
	public ExpSettings getExpSettings() {
		return new ExpSettings()
				.addBlock(Material.GRAVEL, 1);
}
}