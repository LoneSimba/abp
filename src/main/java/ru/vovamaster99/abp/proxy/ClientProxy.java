package ru.vovamaster99.abp.proxy;

import ru.vovamaster99.abp.init.ABPItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		ABPItems.registerRenders();
	}
}
