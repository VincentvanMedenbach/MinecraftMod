package Blocks;

import Vin.Moon.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block {

	protected BasicBlock(String unlocalizedName, Material material, String tool, int mininglevel) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(30.0F);
		this.setResistance(200.0F);
		this.setLightLevel(1.0F);
		this.setHarvestLevel(tool, mininglevel);
		this.setStepSound(soundTypeSand);
		this.isOpaqueCube();
	}
}
