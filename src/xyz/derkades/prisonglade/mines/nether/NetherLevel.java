package xyz.derkades.prisonglade.mines.nether;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;
import xyz.derkades.prisonglade.xp.ExpSettings;

public abstract class NetherLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.NETHER;
	}
	public ExpSettings getExpSettings() {
		return new ExpSettings()
				.addBlock(Material.SOUL_SAND, 1)
				.addBlock(Material.GRAVEL, 1)
				.addBlock(Material.GLOWSTONE, 2)
				.addBlock(Material.OBSIDIAN, 10)
				.addBlock(Material.NETHER_BRICK, 2)
				.addBlock(Material.NETHER_FENCE, 2)
				.addBlock(Material.NETHER_WART_BLOCK, 3)
				.addBlock(Material.NETHERRACK, 1)
				.addBlock(Material.QUARTZ_ORE, 4);

}
}
