package xyz.derkades.prisonglade.mines.desert;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;
import xyz.derkades.prisonglade.xp.ExpSettings;

public abstract class DesertLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.DESERT;
	}
	public ExpSettings getExpSettings() {
		return new ExpSettings()
				.addBlock(Material.SAND, 1, 1)
				.addBlock(Material.GRAVEL, 0, 1)
				.addBlock(Material.SANDSTONE, 0, 2)
				.addBlock(Material.SANDSTONE, 1, 2)
				.addBlock(Material.SANDSTONE, 2, 3)
				.addBlock(Material.WEB, 1, 2)
				.addBlock(Material.LOG_2, 0, 2)
				.addBlock(Material.LEAVES_2, 0, 1)
				.addBlock(Material.RED_SANDSTONE, 0, 3)
				.addBlock(Material.RED_SANDSTONE, 1, 4)
				.addBlock(Material.RED_SANDSTONE, 2, 5)
				.addBlock(Material.GOLD_ORE, 0, 7);

}
}