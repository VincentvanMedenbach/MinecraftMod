package Vin.Moon;
//
//import java.util.Random;
//
//import Blocks.Modblock;
//import cpw.mods.fml.common.IWorldGenerator;
//import net.minecraft.block.Block;
//import net.minecraft.init.Blocks;
//import net.minecraft.world.chunk.IChunkProvider;
//import net.minecraft.world.gen.feature.WorldGenMinable;
//import net.minecraft.world.gen.feature.WorldGenerator;
//
public class World{}
//		public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
//		{
//		switch(world.provider.dimensionId)
//		{
//		case -1:
//		generateNether(world, random, chunkX * 16, chunkZ * 16);
//		break;
//		case 0:
//		generateSurface(world, random, chunkX * 16, chunkZ * 16);
//		break;
//		case 1:
//		generateEnd(world, random, chunkX * 16, chunkZ * 16);
//		break;
//		default:
//		}
//		}
//
//		private void generateEnd(World world, Random random, int x, int z)
//		{
//		...
//		}
//
//		private void generateSurface(World world, Random random, int x, int z)
//		{
//		...
//		}
//
//		private void generateNether(World world, Random random, int x, int z)
//		{
//		...
//		}
//
//		public void generateOre(Block block, World world, Random random, int chunk_x, int chunk_z, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY, Block generateIn)
//		{
//
//
//		int heightRange = maxY - minY;
//		WorldGenMinable worldgenminable = new WorldGenMinable(block, maxVeinSize, generateIn);
//		for (int k1 = 0; k1 < chancesToSpawn; ++k1)
//		{
//		int xrand = random.nextInt(16);
//		int yrand = random.nextInt(heightRange) + minY;
//		int zrand = random.nextInt(16);
//		worldgenminable.generate(world, random, chunk_x+xrand, y, chunk_z+zrand);
//		}
//		}
//
//		@Override
//		public void generate(Random random, int chunkX, int chunkZ, net.minecraft.world.World world,
//				IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
//			// TODO Auto-generated method stub
//			
//		}
//		}
