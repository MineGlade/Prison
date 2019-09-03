package xyz.derkades.prisonglade.storage;

import org.bukkit.OfflinePlayer;

import moda.plugin.moda.utils.storage.ModuleStorageHandler;
import xyz.derkades.prisonglade.themes.Theme;

public interface PrisonStorageHandler extends ModuleStorageHandler {
	
	public int getXp(OfflinePlayer player, Theme theme);
	
	public void setXp(OfflinePlayer player, Theme theme, int xp);
	
	public void addXp(OfflinePlayer player, Theme theme, int xp);

}
