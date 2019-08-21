package xyz.derkades.prisonglade.mines.nether;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonMine;
import xyz.derkades.prisonglade.mines.PrisonMineFactory;

public class NetherB extends NetherLevel {

	@Override
	public char getChar() {
		return 'B';
	}

	@Override
	public PrisonMine getMine() {
		return new PrisonMineFactory(this.getWorld(), 0, 0, 0, 0, 0, 0, Material.NETHERRACK)
				.addBlock(Material.SOUL_SAND, 0.15f)
				.addBlock(Material.GRAVEL, 0.05f)
				.addBlock(Material.GLOWSTONE, 0.15f)
				.addBlock(Material.OBSIDIAN, 0.08f)
				.addBlock(Material.LAVA, 0.06f)
				.addBlock(Material.NETHER_BRICK, 0.06f)
				.addBlock(Material.NETHER_FENCE, 0.07f)
				.create();
	}

}
