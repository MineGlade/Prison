package xyz.derkades.prisonglade;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import xyz.derkades.prisonglade.mines.PrisonLevel;
import xyz.derkades.prisonglade.mines.PrisonLevels;

public class MineCommand extends Command {

	protected MineCommand() {
		super("mine", "Teleport to mine", "/<command> list|<theme> [level]", Arrays.asList());
	}

	@Override
	public boolean execute(final CommandSender sender, final String label, final String[] args) {
		if (args.length == 1 && args[0].equalsIgnoreCase("list")) {
			for (final PrisonLevel level : PrisonLevels.LEVELS) {
				sender.sendMessage(level.getTheme() + " : " + level.getChar());
			}
			return true;
		} else if (args.length == 1 && args[0].equalsIgnoreCase("reset") && sender.hasPermission("prison.reset")) {
			Bukkit.broadcastMessage("Resetting all mines, expect lag");
			for (final PrisonLevel level : PrisonLevels.LEVELS) {
				if (level.getMine() != null) {
					level.getMine().getLocations().forEach((l) -> l.getBlock().setType(Material.AIR));
				}
			}
			return true;
		} else if (args.length == 2) {
			final Player player = (Player) sender;

			final String themeString = args[0];
			final String levelString = args[1];

			for (final PrisonLevel level : PrisonLevels.LEVELS) {
				if (level.getTheme().getName().equalsIgnoreCase(themeString) && levelString.equalsIgnoreCase(level.getChar() + "")) {
					player.teleport(level.getWorld().getSpawnLocation());
				}
			}
			return true;
		} else {
			sender.sendMessage("test");
			return false;
		}
	}

}
