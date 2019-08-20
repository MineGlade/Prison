package xyz.derkades.prisonglade.mines.cold;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;

public abstract class ColdLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.COLD;
	}

}
