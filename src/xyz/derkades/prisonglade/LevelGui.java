package xyz.derkades.prisonglade;

import org.bukkit.entity.Player;

import moda.plugin.moda.utils.IconMenu;

public abstract class LevelGui extends IconMenu {

	public LevelGui(Player player) {
		super(Prison.instance, "Themes", 1*9, player);
	}

}
