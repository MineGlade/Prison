package xyz.derkades.prisonglade.mines;

import java.util.function.Consumer;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

import com.mineglade.moda.lib.derkutils.Random;

public class ChanceBlock {

	private final Material material;
	private final int data;
	private final float chance;
	private final Consumer<Block> postPlace;

	public ChanceBlock(final Material material, final float chance) {
		this.material = material;
		this.data = 0;
		this.chance = chance;
		this.postPlace = null;
	}

	public ChanceBlock(final Material material, final float chance, final Consumer<Block> postPlace) {
		this.material = material;
		this.data = 0;
		this.chance = chance;
		this.postPlace = postPlace;
	}

	public ChanceBlock(final Material material, final int data, final float chance) {
		this.material = material;
		this.data = data;
		this.chance = chance;
		this.postPlace = null;
	}

	public ChanceBlock(final Material material, final int data, final float chance, final Consumer<Block> postPlace) {
		this.material = material;
		this.data = data;
		this.chance = chance;
		this.postPlace = postPlace;
	}

	public boolean calculate() {
		return Random.getRandomFloat() < this.chance;
	}

	@SuppressWarnings("deprecation")
	public boolean place(final Location location) {
		if (!this.calculate()) {
			return false;
		}

		final Block block = location.getBlock();
		//final BlockState state = block.getState();
		block.setType(this.material);
		block.setData((byte) this.data);
		if (this.postPlace != null) this.postPlace.accept(block);
		return true;
	}

}
