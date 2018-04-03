package Vin.Moon;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldChunkManagerSpace;
import net.minecraft.world.biome.BiomeGenBase;

public class WorldChunkManagerVin extends WorldChunkManagerSpace{
	 
    
    public BiomeGenBase getBiome() {
        return BiomeGenBase.desert;
    }
}
