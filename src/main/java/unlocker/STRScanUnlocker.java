package unlocker;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import got.common.command.GOTCommandStrScan;

@Mod(modid = "unlocker", dependencies = "required-after:got")
public class STRScanUnlocker {
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent e) {
		e.registerServerCommand(new GOTCommandStrScan());
	}
}
