package xyz.derkades.prisonglade.storage;

import org.bukkit.OfflinePlayer;

import moda.plugin.moda.modules.Module;
import moda.plugin.moda.utils.storage.FileStorageHandler;
import moda.plugin.moda.utils.storage.ModuleStorageHandler;
import xyz.derkades.prisonglade.themes.Theme;

public class PrisonFileStorageHandler extends FileStorageHandler implements PrisonStorageHandler {

	public PrisonFileStorageHandler(Module<? extends ModuleStorageHandler> module) {
		super(module);
	}

	@Override
	public int getXp(OfflinePlayer player, Theme theme) {
		return file.getInt(player.getUniqueId() + ".xp." + theme.getName(), 0);
	}

	@Override
	public void setXp(OfflinePlayer player, Theme theme, int xp) {
		file.set(player.getUniqueId() + ".xp." + theme.getName(), xp);
	}

	@Override
	public void addXp(OfflinePlayer player, Theme theme, int xp) {
		if (xp < 0) {
			throw new IllegalArgumentException("xp < 0");
		}
		
		this.setXp(player, theme, this.getXp(player, theme) + xp);		
	}

}
