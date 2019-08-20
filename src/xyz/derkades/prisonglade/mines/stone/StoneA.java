package xyz.derkades.prisonglade.mines.stone;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonMine;
import xyz.derkades.prisonglade.mines.PrisonMineFactory;

public class StoneA extends StoneLevel {

	@Override
	public char getChar() {
		return 'A';
	}

	@Override
	public PrisonMine getMine() {
		return new PrisonMineFactory(this.getWorld(), 0, 0, 0, 0, 0, 0, Material.STONE)
				.addBlock(Material.COBBLESTONE, 0.2f)
				.addBlock(Material.STONE, 5, 0.15f)
				.addBlock(Material.STONE, 1, 0.07f)
				.addBlock(Material.STONE, 3, 0.07f)
				.addBlock(Material.GRAVEL, 0.07f)
				.addBlock(Material.MOSSY_COBBLESTONE, 0.05f)
				.addBlock(Material.DIRT, 0.03f)
				.addBlock(Material.WOOD, 0, 0.05f)
				.addBlock(Material.WEB, 0.06f)
				.create();
	}

}

