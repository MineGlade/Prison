package xyz.derkades.prisonglade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;

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
			Bukkit.broadcastMessage("Levels to fill empty");
			levelsToFill.addAll(Arrays.asList(PrisonLevels.LEVELS));
		}

		final PrisonLevel level = levelsToFill.remove(0);

		if (level.getMine() == null) {
			Bukkit.broadcastMessage("Skipped filling " + level + " (no mine specified)");
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
