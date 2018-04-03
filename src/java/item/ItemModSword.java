package item;


import Vin.Moon.Main;
import net.minecraft.item.ItemSword;

public class ItemModSword extends ItemSword {

	public ItemModSword(String unlocalizedName, ToolMaterial Pedobearium) {
		super(Pedobearium);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);

	}
}
