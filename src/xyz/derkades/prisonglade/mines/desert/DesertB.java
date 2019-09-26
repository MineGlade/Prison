package xyz.derkades.prisonglade.mines.desert;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonMine;
import xyz.derkades.prisonglade.mines.PrisonMineFactory;

public class DesertB extends DesertLevel {

	@Override
	public char getChar() {
		return 'B';
	}

	@Override
	public PrisonMine getMine() {
		return new PrisonMineFactory(this.getWorld(), 0, 0, 0, 0, 0, 0, Material.SAND)
				.addBlock(Material.SAND, 1, 0.3f)
				.addBlock(Material.GRAVEL, 0, 0.04f)
				.addBlock(Material.SANDSTONE, 0, 0.06f)
				.addBlock(Material.SANDSTONE, 1, 0.07f)
				.addBlock(Material.SANDSTONE, 2, 0.08f)
				.addBlock(Material.WEB, 1, 0.02f)
				.addBlock(Material.LOG_2, 0, 0.14f)
				.addBlock(Material.LEAVES_2, 0, 0.12f)
				.addBlock(Material.RED_SANDSTONE, 0, 0.055f)
				.addBlock(Material.RED_SANDSTONE, 1, 0.065f)
				.addBlock(Material.RED_SANDSTONE, 2, 0.075f)
				.create();
	}

}

