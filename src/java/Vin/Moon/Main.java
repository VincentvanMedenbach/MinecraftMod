package Vin.Moon;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Moon;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import net.minecraft.util.ResourceLocation;
import proxyPackage.CommonProxy;
@Mod(modid = Main.MODID, version = Main.VERSION, dependencies = "required-after:GalacticraftCore",
name = Main.NAME)

public class Main {
	public static final String MODID = "VinMOON";
    public static final String VERSION = "1.0";
    public static final String NAME = "Vinic00kie's moon";
    public static final String ASSETPREFIX = "VinMOON";
    public static final String TEXTUREPREFIX = ASSETPREFIX + ":";
    public static final String MOONTEXTURE = "vinmoon";
   
    public static Moon harry;
    public static SolarSystem Vinisgalaxy;
    public static Planet Tatooine;
    public static Planet Mustafar;
    
    @Instance(value = MODID)
    public static Main instance;
   
    @SidedProxy(clientSide="proxyPackage.ClientProxy", serverSide="proxyPackage.ServerProxy")
    public static CommonProxy proxy;
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	//World ore_gen = new World();    	
		proxy.preInit(event);
    }
   
    @EventHandler
    public void init(FMLInitializationEvent event)
    {       
        harry = (Moon) new Moon("Harry!!!").setParentPlanet(GalacticraftCore.planetOverworld).setRelativeSize(0.017F).setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(6F, 6F));
        harry.setRelativeOrbitTime(100F).setTierRequired(1).setBodyIcon(new ResourceLocation(MOONTEXTURE, "textures/items/pedoBear.png"));
        harry.setDimensionInfo(38, VinWorldProvider.class);
        //Main.Vinisgalaxy = new SolarSystem("ViniStar", "Vini's galaxy").setMapPosition(new Vector3(10.0F, 10.0F));
        //Star ViniStar = (Star) new Star("Vinistar").setParentSolarSystem(Main.Vinisgalaxy).setTierRequired(1);
        GalaxyRegistry.registerMoon(harry);
        GalacticraftRegistry.registerTeleportType(VinWorldProvider.class, new VinWorldProvider());
    	//ViniStar.setBodyIcon(new ResourceLocation(GalacticraftCore.ASSET_PREFIX, "textures/gui/celestialbodies.sun.png"));
    	//Main.Vinisgalaxy.setMainStar(ViniStar);
    	//GalaxyRegistry.registerSolarSystem(Main.Vinisgalaxy);
    	//GalaxyRegistry.registerPlanet(Main.Mustafar);
    	//GalaxyRegistry.registerPlanet(Main.Tatooine);
        proxy.init(event);
    }
   
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    }
   
}
