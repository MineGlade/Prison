package xyz.derkades.prisonglade.shops;

import org.bukkit.entity.Player;

import com.mineglade.moda.lib.derkutils.bukkit.menu.OptionClickEvent;

import moda.plugin.moda.utils.IconMenu;
import xyz.derkades.prisonglade.Prison;
import xyz.derkades.prisonglade.mines.PrisonLevel;

public class ShopGui extends IconMenu {

	private static final String MENU_TITLE = "%s %s shop";
	private static final int MENU_SIZE = 6*9;

	private final PrisonLevel level;

	public ShopGui(final PrisonLevel level, final Player player) {
		super(Prison.instance, String.format(MENU_TITLE, level.getTheme(), level.getChar()), MENU_SIZE, player);

		this.level = level;
	}

	@Override
	public boolean onOptionClick(final OptionClickEvent event) {
		return false;
	}

}
