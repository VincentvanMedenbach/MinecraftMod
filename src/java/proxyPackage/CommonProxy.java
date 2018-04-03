package proxyPackage;

import Blocks.Modblock;
import Vin.Moon.World;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import item.Crafting;
import item.ModItems;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
	}

	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent event) {
		Modblock.init();
		ModItems.init();
		Crafting.init();
	}
}
