package xyz.derkades.prisonglade.mines.end;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;

public abstract class EndLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.END;
	}

}
