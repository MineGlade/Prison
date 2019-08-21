package xyz.derkades.prisonglade.mines.nether;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonMine;
import xyz.derkades.prisonglade.mines.PrisonMineFactory;

public class NetherF extends NetherLevel {

	@Override
	public char getChar() {
		return 'F';
	}

	@Override
	public PrisonMine getMine() {
		return new PrisonMineFactory(this.getWorld(), 0, 58, 5, 12, 41, 17, Material.NETHERRACK)
				.addBlock(Material.SOUL_SAND, 0.1f)
				.addBlock(Material.GRAVEL, 0.05f)
				.addBlock(Material.GLOWSTONE, 0.1f)
				.addBlock(Material.OBSIDIAN, 0.06f)
				.addBlock(Material.LAVA, 0.04f)
				.addBlock(Material.NETHER_BRICK, 0.095f)
				.addBlock(Material.NETHER_FENCE, 0.065f)
				.addBlock(Material.NETHER_WART_BLOCK, 0.03f)
				.addBlock(Material.QUARTZ_ORE, 0.02f)
				.create();
	}

}
