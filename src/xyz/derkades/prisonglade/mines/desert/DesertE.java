package xyz.derkades.prisonglade.mines.desert;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonMine;
import xyz.derkades.prisonglade.mines.PrisonMineFactory;

public class DesertE extends DesertLevel {

	@Override
	public char getChar() {
		return 'E';
	}

	@Override
	public PrisonMine getMine() {
		return new PrisonMineFactory(this.getWorld(), 0, 0, 0, 0, 0, 0, Material.SAND)
				.addBlock(Material.SAND, 1, 0.1f)
				.addBlock(Material.GRAVEL, 0, 0.03f)
				.addBlock(Material.SANDSTONE, 0, 0.05f)
				.addBlock(Material.SANDSTONE, 1, 0.06f)
				.addBlock(Material.SANDSTONE, 2, 0.07f)
				.addBlock(Material.WEB, 1, 0.015f)
				.addBlock(Material.LOG_2, 0, 0.17f)
				.addBlock(Material.LEAVES_2, 0, 0.14f)
				.addBlock(Material.RED_SANDSTONE, 0, 0.065f)
				.addBlock(Material.RED_SANDSTONE, 1, 0.075f)
				.addBlock(Material.RED_SANDSTONE, 2, 0.085f)
				.addBlock(Material.GOLD_ORE, 0, 0.005f)
				.create();
	}

}
