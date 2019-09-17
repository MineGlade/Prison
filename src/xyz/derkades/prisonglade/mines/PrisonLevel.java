package xyz.derkades.prisonglade.mines;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;

import com.mineglade.moda.lib.derkutils.bukkit.VoidGenerator;

import xyz.derkades.prisonglade.themes.Themeable;
import xyz.derkades.prisonglade.xp.ExpSettings;

public abstract class PrisonLevel implements Themeable {

	private World world = null;

	public abstract char getChar();

	public abstract PrisonMine getMine();

	public abstract ExpSettings getExpSettings();

	public Environment getEnvironment() {
		return Environment.NORMAL;
	}

	public String getWorldName() {
		return this.getTheme().getName() + "/" + this.getChar();
	}

	public World getWorld() {
		if (this.world == null) {
			this.loadWorld();
		}
		return this.world;
	}

	public Location getSpawnLocation() {
		return this.getWorld().getSpawnLocation().add(0.5, 0, 0.5);
	}

	public void loadWorld() {
		System.out.println("[Worlds] Loading " + this.toString());
		final WorldCreator creator = new WorldCreator(this.getWorldName());
		creator.generateStructures(false);
		creator.type(WorldType.FLAT);

		creator.generator(new VoidGenerator());
		creator.environment(this.getEnvironment());

		final World world = Bukkit.getServer().createWorld(creator);
		world.setGameRuleValue("doWeatherCycle", "false");
		world.setGameRuleValue("doDaylightCycle", "false");
		world.setTime(6000);
		world.setGameRuleValue("spectatorsGenerateChunks", "false");
		world.setGameRuleValue("spawnRadius", "0");
		world.setGameRuleValue("doMobSpawning", "false");
		world.setGameRuleValue("doFireTick", "false");
		world.setGameRuleValue("randomTickSpeed", "0");
		world.setGameRuleValue("announceAdvancements", "false");
		world.setGameRuleValue("doEntityDrops", "false");
		world.setGameRuleValue("doMobLoot", "true");
		world.setGameRuleValue("maxEntityCramming", "0");
		world.setGameRuleValue("doTileDrops", "true");
		world.setGameRuleValue("keepInventory", "false");
		world.setGameRuleValue("mobGriefing", "false");

		world.setDifficulty(Difficulty.NORMAL);

		world.setSpawnLocation(0, 65, 0);

		this.world = world;
	}

	public void unloadWorld() {
		if (this.world == null) {
			Bukkit.broadcastMessage("[Worlds] " + this.world.getName() + " is already unloaded");
		} else {
			System.out.println("[Worlds] Unloading " + this.toString());
			Bukkit.unloadWorld(this.getWorld(), true);
		}
	}

	@Override
	public String toString() {
		return this.getTheme() + "_" + this.getChar();
	}

}
