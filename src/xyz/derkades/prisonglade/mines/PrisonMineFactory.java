package xyz.derkades.prisonglade.mines;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.util.Vector;

public class PrisonMineFactory {

	private final Vector a;
	private final Vector b;
	private final Material fill;
	private final List<ChanceBlock> blocks;

	private PrisonMineFactory(final int x1, final int y1, final int z1, final int x2, final int y2, final int z2, final Material fill) {
		this.a = new Vector(x1, y1, z1);
		this.b = new Vector(x2, y2, z2);
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

	public PrisonMine create() {
		return new PrisonMine(this.a, this.b, this.blocks, this.fill);
	}

	public static PrisonMineFactory newInstance(final int x1, final int y1, final int z1, final int x2, final int y2, final int z2, final Material fill) {
		return new PrisonMineFactory(x1, y1, z1, x2, y2, y2, fill);
	}

}
