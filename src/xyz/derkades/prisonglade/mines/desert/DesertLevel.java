package xyz.derkades.prisonglade.mines.desert;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;

public abstract class DesertLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.DESERT;
	}

}
