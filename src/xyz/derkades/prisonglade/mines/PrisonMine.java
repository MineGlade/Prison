package xyz.derkades.prisonglade.mines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;

public class PrisonMine {

	private final Location a;
	private final Location b;
	private final List<ChanceBlock> blocks;
	private final Material fillBlock;

	public PrisonMine(final Location a, final Location b, final List<ChanceBlock> blocks, final Material fillBlock) {
		this.a = a;
		this.b = b;
		this.blocks = blocks;
		this.fillBlock = fillBlock;
	}

	public Location getCornerA() {
		return this.a;
	}

	public Location getCornerB() {
		return this.b;
	}

	public List<Location> getLocations(){
		final int minX = Math.min(this.a.getBlockX(), this.b.getBlockX());
		final int maxX = Math.max(this.a.getBlockX(), this.b.getBlockX());
		final int minY = Math.min(this.a.getBlockY(), this.b.getBlockY());
		final int maxY = Math.max(this.a.getBlockY(), this.b.getBlockY());
		final int minZ = Math.min(this.a.getBlockZ(), this.b.getBlockZ());
		final int maxZ = Math.max(this.a.getBlockZ(), this.b.getBlockZ());

		final List<Location> locations = new ArrayList<>();

		for (int x = minX; x <= maxX; x++) {
			for (int y = minY; y <= maxY; y++) {
				for (int z = minZ; z <= maxZ; z++) {
					locations.add(new Location(this.a.getWorld(), x, y, z));
				}
			}
		}

		return locations;
	}

	public boolean shouldFill(){
		int empty = 0;
		int block = 0;
		for (final Location location : this.getLocations()) {
			if (location.getBlock().getType() == Material.AIR) {
				empty++;
			} else {
				block++;
			}
		}

		return block < empty;
	}

	public void fill() {
		final List<Location> fill = new ArrayList<>();

		locloop: for (final Location location : this.getLocations()) {
			Collections.shuffle(this.blocks);
			for (final ChanceBlock block : this.blocks) {
				if (block.place(location)) {
					continue locloop;
				}
			}

			fill.add(location);
		}

		fill.forEach((b) -> b.getBlock().setType(this.fillBlock));
	}

}
