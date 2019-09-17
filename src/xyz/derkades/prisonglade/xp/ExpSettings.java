package xyz.derkades.prisonglade.xp;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Material;

import xyz.derkades.prisonglade.Prison;

public class ExpSettings {

	private final Map<Material, Integer> map = new HashMap<>();

	public ExpSettings() {}

	public ExpSettings addBlock(final Material type, final int xp) {
		this.map.put(type, xp);
		return this;
	}

	public Map<Material, Integer> getMap(){
		return this.map;
	}

	public int getXp(final Material type) {
		if (this.map.containsKey(type))
			return this.map.get(type);
		else {
			Prison.instance.getLogger().warning("XP not set for material %s", type);
			return 0;
		}
	}

}
