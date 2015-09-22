package ru.vovamaster99.abp;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.vovamaster99.abp.init.ABPBlocks;
import ru.vovamaster99.abp.init.ABPItems;
import ru.vovamaster99.abp.proxy.CommonProxy;

@Mod(modid = Info.MODID, version = Info.VERSION, name = Info.NAME)
public class ApocalypseBuildPack {
	
	@SidedProxy(clientSide = Info.CLIENT_PROXY, serverSide = Info.SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static ABPTab tabABP = new ABPTab("tabABP");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ABPBlocks.init();
		ABPBlocks.register();
		ABPItems.init();
		ABPItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
