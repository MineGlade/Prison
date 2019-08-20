package xyz.derkades.prisonglade.mines.farm;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonMine;
import xyz.derkades.prisonglade.mines.PrisonMineFactory;

public class FarmI extends FarmLevel {

	@Override
	public char getChar() {
		return 'I';
	}

	@Override
	public PrisonMine getMine() {
		return new PrisonMineFactory(this.getWorld(), 10, 43, 7, -10, 63, 27, Material.DIRT)
				.addBlock(Material.GRAVEL, 0.2f)
				.addBlock(Material.CLAY, 0.1f)
				.addBlock(Material.LEAVES, 0, 0.01f)
				.addBlock(Material.LEAVES, 2, 0.01f)
				.addBlock(Material.LEAVES, 1, 0.01f)
				.addBlock(Material.LEAVES, 3, 0.01f)
				.addBlock(Material.LEAVES_2, 0, 0.01f)
				.addBlock(Material.LEAVES_2, 1, 0.01f)
				.addBlock(Material.WOOD, 0, 0.01f)
				.addBlock(Material.WOOD, 2, 0.005f)
				.addBlock(Material.WOOD, 1, 0.01f)
				.addBlock(Material.WOOD, 3, 0.01f)
				.addBlock(Material.WOOD, 4, 0.01f)
				.addBlock(Material.WOOD, 5, 0.01f)
				.addBlock(Material.LOG, 0, 0.04f)
				.addBlock(Material.LOG, 2, 0.04f)
				.addBlock(Material.LOG, 1, 0.035f)
				.addBlock(Material.LOG, 3, 0.03f)
				.addBlock(Material.LOG, 4, 0.025f)
				.addBlock(Material.LOG, 5, 0.02f)
				.create();
	}

}
