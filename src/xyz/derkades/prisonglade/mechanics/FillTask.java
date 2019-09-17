package xyz.derkades.prisonglade.mechanics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.scheduler.BukkitRunnable;

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
			Prison.instance.getLogger().warning("No mine specified for %s", level);
			return;
		}

		final boolean shouldFill = level.getMine().shouldFill();

		if (!shouldFill) {
			return;
		}

		Prison.instance.getScheduler().interval(0, 20, new BukkitRunnable() {

			int secondsLeft = 30;

			@Override
			public void run() {
				Prison.instance.getLogger().debug("Refilling level %s in %s seconds", level, this.secondsLeft);

				if (this.secondsLeft == 30 || this.secondsLeft == 10 || this.secondsLeft == 5) {
					level.getWorld().getPlayers().forEach((p) -> p.sendMessage(
							String.format("Your mine will be refilled in %s seconds.", this.secondsLeft)));
				}

				if (this.secondsLeft == 0) {
					level.getWorld().getPlayers().forEach((p) -> {
						p.teleport(level.getSpawnLocation());
					});
					level.getMine().fill();
					this.cancel();
					return;
				}

				this.secondsLeft--;
			}

		});
	}

}
