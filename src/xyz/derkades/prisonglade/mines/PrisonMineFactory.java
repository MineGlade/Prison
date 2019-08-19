package xyz.derkades.prisonglade.mines;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class PrisonMineFactory {

	private final Location a;
	private final Location b;
	private final Material fill;
	private final List<ChanceBlock> blocks;

	public PrisonMineFactory(final World world, final int x1, final int y1, final int z1, final int x2, final int y2, final int z2, final Material fill) {
		this.a = new Location(world, x1, y1, z1);
		this.b = new Location(world, x2, y2, z2);
		this.fill = fill;
		this.blocks = new ArrayList<>();
	}

	public PrisonMineFactory addBlock(final ChanceBlock block) {
		this.blocks.add(block);
		return this;
	}

	public PrisonMineFactory addBlock(final Material material, final float chance) {
		return this.addBlock(new ChanceBlock(material, chance));
	}

	public PrisonMineFactory addBlock(final Material material, final float chance, final Consumer<Block> postPlace) {
		return this.addBlock(new ChanceBlock(material, chance, postPlace));
	}

	public PrisonMineFactory addBlock(final Material material, final int data, final float chance) {
		return this.addBlock(new ChanceBlock(material, data, chance));
	}

	public PrisonMineFactory addBlock(final Material material, final int data, final float chance, final Consumer<Block> postPlace) {
		return this.addBlock(new ChanceBlock(material, data, chance, postPlace));
	}

	public PrisonMine create() {
		return new PrisonMine(this.a, this.b, this.blocks, this.fill);
	}

}
