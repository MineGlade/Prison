package xyz.derkades.prisonglade;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LobbyCommand extends Command {

	protected LobbyCommand() {
		super("lobby", "Go to lobby", "/<command>", Arrays.asList());
	}

	@Override
	public boolean execute(final CommandSender sender, final String label, final String[] args) {
		final Player player = (Player) sender;
		player.teleport(Bukkit.getWorld("world").getSpawnLocation());
		return false;
	}

}
