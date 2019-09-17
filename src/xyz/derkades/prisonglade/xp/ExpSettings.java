package xyz.derkades.prisonglade.xp;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.block.Block;

import xyz.derkades.prisonglade.Prison;

public class ExpSettings {

	private final Map<Material, Integer> map = new HashMap<>();
	private final Map<Material, Map<Integer, Integer>> dataMap = new HashMap<>();

	public ExpSettings() {}

	public ExpSettings addBlock(final Material type, final int xp) {
		this.map.put(type, xp);
		return this;
	}

	public ExpSettings addBlock(final Material type, final int data, final int xp) {
		if (this.dataMap.containsKey(type)) {
			final Map<Integer, Integer> map = this.dataMap.get(type);
			map.put(data, xp);
			this.dataMap.put(type, map);
		} else {
			final Map<Integer, Integer> map = new HashMap<>();
			map.put(data, xp);
			this.dataMap.put(type, map);
		}
		return this;
	}

	public Map<Material, Integer> getMap(){
		return this.map;
	}

	public int getXp(final Block block) {
		final Material type = block.getType();
		final int data = block.getData();

		if (this.dataMap.containsKey(type)) {
			final Map<Integer, Integer> map = this.dataMap.get(type);
			if (this.dataMap.containsKey(data)) {
				return map.get(data);
			}
		}

		if (this.map.containsKey(type))
			return this.map.get(type);
		else {
			Prison.instance.getLogger().warning("XP not set for material %s", type);
			return 0;
		}
	}

}
