package item;

import Vin.Moon.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {
	public static Item pedoBear;
	public static Item pedoBearSword;
	public static Item pedoPowder;
	public static ToolMaterial Pedobearium = EnumHelper.addToolMaterial("Pedobearium", 3, 90000, 40F, 6.0F, 50);

	public static final void init() {

		pedoBear = new Item().setUnlocalizedName("pedoBear").setCreativeTab(CreativeTabs.tabMisc)
				.setTextureName(Main.MODID + ":pedoBear");
		GameRegistry.registerItem(pedoBear, "pedoBear");
		GameRegistry.registerItem(pedoBearSword = new ItemModSword("PedoBear_Sword", Pedobearium), "PedoBear_Sword");
	}
}