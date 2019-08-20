package xyz.derkades.prisonglade.mines.stone;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;

public abstract class StoneLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.STONE;
	}

}
