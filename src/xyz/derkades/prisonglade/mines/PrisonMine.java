package xyz.derkades.prisonglade.mines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.util.Vector;

public class PrisonMine {

	private final Vector vectorA;
	private final Vector vectorB;
	private final List<ChanceBlock> blocks;
	private final Material fillBlock;

	public PrisonMine(final Vector vectorA, final Vector vectorB, final List<ChanceBlock> blocks, final Material fillBlock) {
		this.vectorA = vectorA;
		this.vectorB = vectorB;
		this.blocks = blocks;
		this.fillBlock = fillBlock;
	}

	public void fill(final World world) {
		final int minX = Math.min(this.vectorA.getBlockX(), this.vectorB.getBlockX());
		final int maxX = Math.max(this.vectorA.getBlockX(), this.vectorB.getBlockX());
		final int minY = Math.min(this.vectorA.getBlockY(), this.vectorB.getBlockY());
		final int maxY = Math.max(this.vectorA.getBlockY(), this.vectorB.getBlockY());
		final int minZ = Math.min(this.vectorA.getBlockZ(), this.vectorB.getBlockZ());
		final int maxZ = Math.max(this.vectorA.getBlockZ(), this.vectorB.getBlockZ());

		final List<Location> locations = new ArrayList<>();

		for (int x = minX; x <= maxX; x++) {
			for (int y = minY; x <= maxY; y++) {
				for (int z = minZ; z <= maxZ; z++) {
					locations.add(new Location(world, x, y, z));
				}
			}
		}

		final List<Location> fill = new ArrayList<>();

		for (final Location location : locations) {
			Collections.shuffle(this.blocks);
			for (final ChanceBlock block : this.blocks) {
				if (block.place(location)) {
					continue;
				}
			}

			fill.add(location);
		}

		fill.forEach((b) -> b.getBlock().setType(this.fillBlock));
	}

}
