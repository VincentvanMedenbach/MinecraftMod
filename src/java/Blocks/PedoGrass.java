package Blocks;

import Vin.Moon.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class PedoGrass extends Block{
	 protected PedoGrass(String unlocalizedName, Material material,String tool, int mininglevel) 
	    { 
	        super(material);
	        this.setBlockName(unlocalizedName);
	        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
	        this.setCreativeTab(CreativeTabs.tabBlock);
	        this.setHardness(2.0F);
	        this.setResistance(6.0F);
	        this.setStepSound(soundTypeGrass);
	        
	    }
	 @Override
	public void registerBlockIcons(IIconRegister reg) {
		    for (int i = 0; i < 6; i ++) {
		        this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
		    }
		    
	}
	public IIcon[] icons = new IIcon[6];
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}
	 
}
