package item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Crafting {
	public static final void init() {
		GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.pedoBear), 100.0F);
		GameRegistry.addSmelting(Items.cookie, new ItemStack(ModItems.pedoBear), 1.0F);
		GameRegistry.addRecipe(new ItemStack(ModItems.pedoBearSword),
				new Object[] { " # ", " # ", " I ", '#', ModItems.pedoBear, 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Blocks.Modblock.PedoBlock),
				new Object[] { "###", "###", "###", '#', ModItems.pedoBear, });
		GameRegistry.addRecipe(new ItemStack (Blocks.Modblock.PedoStoneBrick), new Object[] {"ZZ ", "ZZ ", "   ", 'Z', Blocks.Modblock.PedoStone});
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.PedoPortal),
		//		new Object[] { "ZXZ", "XZX", "ZXZ", 'X', ModBlocks.PedoBlock, 'Z', Items.glowstone_dust });
		 //GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pedoBear), new
		 //Object[] { ModBlocks.PedoBlock });
	}
}
