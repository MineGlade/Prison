package xyz.derkades.prisonglade.mines.stone;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.themes.Theme;
import xyz.derkades.prisonglade.xp.ExpSettings;

public abstract class StoneLevel extends PrisonLevel {

	@Override
	public Theme getTheme() {
		return Theme.STONE;
	}
	public ExpSettings getExpSettings() {
		return new ExpSettings()
				.addBlock(Material.COBBLESTONE, 1)
				.addBlock(Material.STONE, 1, 2)
				.addBlock(Material.STONE, 3, 2)
				.addBlock(Material.GRAVEL, 0, 1)
				.addBlock(Material.MOSSY_COBBLESTONE, 3)
				.addBlock(Material.DIRT, 1)
				.addBlock(Material.WOOD, 0, 1)
				.addBlock(Material.WEB, 0, 4)
				.addBlock(Material.COAL_ORE, 4)
				.addBlock(Material.IRON_ORE, 5)
				.addBlock(Material.STONE, 0, 1);

}
}