package xyz.derkades.prisonglade.mines.stone;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonMine;
import xyz.derkades.prisonglade.mines.PrisonMineFactory;

public class StoneE extends StoneLevel {

	@Override
	public char getChar() {
		return 'E';
	}

	@Override
	public PrisonMine getMine() {
		return new PrisonMineFactory(this.getWorld(), 0, 0, 0, 0, 0, 0, Material.STONE)
				.addBlock(Material.COBBLESTONE, 0.2f)
				.addBlock(Material.STONE, 5, 0.15f)
				.addBlock(Material.STONE, 1, 0.07f)
				.addBlock(Material.STONE, 3, 0.07f)
				.addBlock(Material.GRAVEL, 0.07f)
				.addBlock(Material.MOSSY_COBBLESTONE, 0.04f)
				.addBlock(Material.DIRT, 0.03f)
				.addBlock(Material.WOOD, 0, 0.04f)
				.addBlock(Material.WEB, 0.035f)
				.addBlock(Material.COAL_ORE, 0.025f)
				.addBlock(Material.IRON_ORE, 0.01f)
				.create();
	}

}
