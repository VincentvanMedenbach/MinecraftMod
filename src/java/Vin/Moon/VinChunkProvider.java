package Vin.Moon;

import java.util.ArrayList;
import java.util.List;

import Blocks.Modblock;
import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.ChunkProviderSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.MapGenBaseMeta;
import micdoodle8.mods.galacticraft.core.blocks.GCBlocks;
import micdoodle8.mods.galacticraft.core.entities.EntityAlienVillager;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedCreeper;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSkeleton;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedZombie;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;
import net.minecraft.world.chunk.IChunkProvider;

public class VinChunkProvider extends ChunkProviderSpace {

	public VinChunkProvider(World par1World, long seed, boolean mapFeaturesEnabled) {
		super(par1World, seed, mapFeaturesEnabled);
	}

	
	protected BiomeDecoratorSpace getBiomeGenerator() {

		return new BiomeDecoratorVin();
	}

	
	protected BiomeGenBase[] getBiomesForGeneration() {

		return new BiomeGenBase[] { BiomeGenBase.desert };
	}

	
	public int getCraterProbability() {
		return 64;
	}

	
	protected SpawnListEntry[] getCreatures() {
		SpawnListEntry villager = new SpawnListEntry(EntityAlienVillager.class, 10, 2, 2);
		return new SpawnListEntry[] { villager };
	}

	
	protected BlockMetaPair getDirtBlock() {

		return new BlockMetaPair(Blocks.Modblock.PedoDirt, (byte) 3);
	}

	
	protected BlockMetaPair getGrassBlock() {
		return new BlockMetaPair(Blocks.Modblock.PedoGrass, (byte) 5);
	}

	
	public double getHeightModifier() {

		return 10;
	}

	
	protected SpawnListEntry[] getMonsters() {
		SpawnListEntry skele = new SpawnListEntry(EntityEvolvedSkeleton.class, 100, 4, 4);
		SpawnListEntry creeper = new SpawnListEntry(EntityEvolvedCreeper.class, 100, 4, 4);
		SpawnListEntry zombie = new SpawnListEntry(EntityEvolvedZombie.class, 100, 4, 4);

		return new SpawnListEntry[] { skele, creeper, zombie };
	}

	
	public double getMountainHeightModifier() {
		return 0;
	}

	
	protected int getSeaLevel() {
		return 56;
	}

	
	public double getSmallFeatureHeightModifier() {
		return 0;
	}

	
	protected BlockMetaPair getStoneBlock() {

		return new BlockMetaPair(Modblock.PedoStone, (byte) 4);
	}

	
	public double getValleyHeightModifier() {
		return 0;
	}

	
	protected List<MapGenBaseMeta> getWorldGenerators() {

		return new ArrayList<MapGenBaseMeta>();
	}

	
	public void onChunkProvide(int arg0, int arg1, Block[] arg2, byte[] arg3) {
	}

	
	public void onPopulate(IChunkProvider arg0, int arg1, int arg2) {
	}

	
	public boolean chunkExists(int x, int y) {
		return false;
	}

}
