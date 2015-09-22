package ru.vovamaster99.abp.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.vovamaster99.abp.ApocalypseBuildPack;
import ru.vovamaster99.abp.Info;
import ru.vovamaster99.abp.blocks.Asphalt;

public class ABPBlocks {
	
	public static Block asphalt_normal;
	public static Block asphalt_broken;
	public static Block asphalt_lined;
	public static Block asphalt_double_lined;

	public static void init() {
		asphalt_normal = new Asphalt(Material.rock).setUnlocalizedName("asphalt_normal").setCreativeTab(ApocalypseBuildPack.tabABP).setStepSound(Block.soundTypeStone);
		asphalt_broken = new Asphalt(Material.ground).setUnlocalizedName("asphalt_broken").setCreativeTab(ApocalypseBuildPack.tabABP).setStepSound(Block.soundTypeGravel);
		asphalt_lined = new Asphalt(Material.rock).setUnlocalizedName("asphalt_lined").setCreativeTab(ApocalypseBuildPack.tabABP).setStepSound(Block.soundTypeStone);
		asphalt_double_lined = new Asphalt(Material.rock).setUnlocalizedName("asphalt_double_lined").setCreativeTab(ApocalypseBuildPack.tabABP).setStepSound(Block.soundTypeStone);
	}

	public static void register() {
		GameRegistry.registerBlock(asphalt_normal, asphalt_normal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(asphalt_broken, asphalt_broken.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(asphalt_lined, asphalt_lined.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(asphalt_double_lined, asphalt_double_lined.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		registerRender(asphalt_normal);
		registerRender(asphalt_broken);
		registerRender(asphalt_lined);
		registerRender(asphalt_double_lined);
	}

	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Info.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
