package xyz.derkades.prisonglade.mines.water;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;

public abstract class WaterLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.WATER;
	}

}