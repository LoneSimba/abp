package ru.vovamaster99.abp.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.vovamaster99.abp.Info;

public class ABPItems {
	
	public static Item apocalypseItem;

	public static void init() {
		apocalypseItem = new Item().setUnlocalizedName("apocalypseItem");
	}

	public static void register() {
		GameRegistry.registerItem(apocalypseItem, apocalypseItem.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		registerRender(apocalypseItem);
	}

	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Info.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
