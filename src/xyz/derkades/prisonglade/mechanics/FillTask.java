package xyz.derkades.prisonglade.mechanics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;

import xyz.derkades.prisonglade.Prison;
import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.mines.PrisonLevels;

public class FillTask implements Runnable {

	public static List<PrisonLevel> levelsToFill = new ArrayList<>();

	public FillTask() {
		Prison.instance.getScheduler().interval(10*20, 10*20, this);
	}

	@Override
	public void run() {
		if (levelsToFill.isEmpty()) {
			levelsToFill.addAll(Arrays.asList(PrisonLevels.LEVELS));
		}

		final PrisonLevel level = levelsToFill.remove(0);

		if (level.getMine() == null) {
			Prison.instance.getLogger().info("Skipped filling %s (no mine specified)", level);
			return;
		}

		final boolean shouldFill = level.getMine().shouldFill();

		if (!shouldFill) {
			//Bukkit.broadcastMessage("Skipped filling " + level + " (not enough air)");
			return;
		}

		level.getMine().fill();
		Bukkit.broadcastMessage("Filled " + level);
	}

}
