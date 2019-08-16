package xyz.derkades.prisonglade.mines.nether;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;

public abstract class NetherLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.NETHER;
	}

}
