package xyz.derkades.prisonglade.mines;

import org.bukkit.entity.Player;

import xyz.derkades.prisonglade.mines.cold.ColdA;
import xyz.derkades.prisonglade.mines.cold.ColdB;
import xyz.derkades.prisonglade.mines.cold.ColdC;
import xyz.derkades.prisonglade.mines.cold.ColdD;
import xyz.derkades.prisonglade.mines.cold.ColdE;
import xyz.derkades.prisonglade.mines.desert.DesertA;
import xyz.derkades.prisonglade.mines.desert.DesertB;
import xyz.derkades.prisonglade.mines.desert.DesertC;
import xyz.derkades.prisonglade.mines.desert.DesertD;
import xyz.derkades.prisonglade.mines.desert.DesertE;
import xyz.derkades.prisonglade.mines.end.EndA;
import xyz.derkades.prisonglade.mines.end.EndB;
import xyz.derkades.prisonglade.mines.end.EndC;
import xyz.derkades.prisonglade.mines.end.EndD;
import xyz.derkades.prisonglade.mines.end.EndE;
import xyz.derkades.prisonglade.mines.farm.FarmA;
import xyz.derkades.prisonglade.mines.farm.FarmB;
import xyz.derkades.prisonglade.mines.farm.FarmC;
import xyz.derkades.prisonglade.mines.farm.FarmD;
import xyz.derkades.prisonglade.mines.farm.FarmE;
import xyz.derkades.prisonglade.mines.farm.FarmF;
import xyz.derkades.prisonglade.mines.farm.FarmG;
import xyz.derkades.prisonglade.mines.farm.FarmH;
import xyz.derkades.prisonglade.mines.farm.FarmI;
import xyz.derkades.prisonglade.mines.farm.FarmJ;
import xyz.derkades.prisonglade.mines.nether.NetherA;
import xyz.derkades.prisonglade.mines.nether.NetherB;
import xyz.derkades.prisonglade.mines.nether.NetherC;
import xyz.derkades.prisonglade.mines.nether.NetherD;
import xyz.derkades.prisonglade.mines.nether.NetherE;
import xyz.derkades.prisonglade.mines.nether.NetherF;
import xyz.derkades.prisonglade.mines.nether.NetherG;
import xyz.derkades.prisonglade.mines.nether.NetherH;
import xyz.derkades.prisonglade.mines.nether.NetherI;
import xyz.derkades.prisonglade.mines.nether.NetherJ;
import xyz.derkades.prisonglade.mines.stone.StoneA;
import xyz.derkades.prisonglade.mines.stone.StoneB;
import xyz.derkades.prisonglade.mines.stone.StoneC;
import xyz.derkades.prisonglade.mines.stone.StoneD;
import xyz.derkades.prisonglade.mines.stone.StoneE;
import xyz.derkades.prisonglade.mines.water.WaterA;
import xyz.derkades.prisonglade.mines.water.WaterB;
import xyz.derkades.prisonglade.mines.water.WaterC;
import xyz.derkades.prisonglade.mines.water.WaterD;
import xyz.derkades.prisonglade.mines.water.WaterE;

public class PrisonLevels {

	public static final PrisonLevel[] LEVELS = {
			new FarmA(),
			new FarmB(),
			new FarmC(),
			new FarmD(),
			new FarmE(),
			new FarmF(),
			new FarmG(),
			new FarmH(),
			new FarmI(),
			new FarmJ(),

			new NetherA(),
			new NetherB(),
			new NetherC(),
			new NetherD(),
			new NetherE(),
			new NetherF(),
			new NetherG(),
			new NetherH(),
			new NetherI(),
			new NetherJ(),

			new EndA(),
			new EndB(),
			new EndC(),
			new EndD(),
			new EndE(),

			new DesertA(),
			new DesertB(),
			new DesertC(),
			new DesertD(),
			new DesertE(),

			new ColdA(),
			new ColdB(),
			new ColdC(),
			new ColdD(),
			new ColdE(),

			new WaterA(),
			new WaterB(),
			new WaterC(),
			new WaterD(),
			new WaterE(),

			new StoneA(),
			new StoneB(),
			new StoneC(),
			new StoneD(),
			new StoneE(),
	};
	
	public static PrisonLevel getLevel(final Player player) {
		for (final PrisonLevel level : PrisonLevels.LEVELS) {
			if (player.getWorld().getName().contentEquals(level.getWorldName())) {
				return level;
			}
		}
		return null;
	}

}
