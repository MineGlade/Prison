package xyz.derkades.prisonglade.mechanics;

import org.bukkit.block.Block;
import org.bukkit.scheduler.BukkitRunnable;

public class RegrowTimer extends BukkitRunnable {
	
	private Block crop;
	private int fullData;
	
	RegrowTimer(Block crop, int fullData){
		this.crop = crop;
		this.fullData = fullData;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		byte data = crop.getData();

		if (data >= 7 || data >= fullData) {
			this.cancel();
			return;
		}

		crop.setData((byte) (data + 1));
	}

}
