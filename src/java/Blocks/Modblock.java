package Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Modblock {
	public static Block PedoBlock;
	public static Block PedoStone;
	public static Block PedoGrass;
	public static Block PedoDirt;
	public static Block PedoStoneBrick;


	public static final void init() {
		GameRegistry.registerBlock(PedoBlock = new BasicBlock("PedoBlock", Material.sand, "shovel", 0), "PedoBlock");
		GameRegistry.registerBlock(PedoStone = new BasicBlock("PedoStone", Material.rock, "pickaxe", 1), "PedoStone");
		GameRegistry.registerBlock(PedoGrass = new PedoGrass("PedoGrass", Material.grass, "shovel", 0), "PedoGrass");
		GameRegistry.registerBlock(PedoDirt = new BasicBlock("PedoDirt", Material.ground, "shovel", 0), "PedoDirt");
		GameRegistry.registerBlock(PedoStoneBrick = new BasicBlock("PedoStoneBrick", Material.rock, "pickaxe", 2), "PedoStoneBrick");
		
	}
	

}
