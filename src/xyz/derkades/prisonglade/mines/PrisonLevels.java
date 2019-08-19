package xyz.derkades.prisonglade.mines;

import xyz.derkades.prisonglade.mines.end.EndA;
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
	};

}
