package xyz.derkades.prisonglade.mines.farm;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;

public abstract class FarmLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.FARM;
	}

}
