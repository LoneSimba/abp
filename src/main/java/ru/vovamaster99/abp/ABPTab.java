package ru.vovamaster99.abp;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.vovamaster99.abp.init.ABPItems;

public class ABPTab extends CreativeTabs {

	public ABPTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Item getTabIconItem() {
		return ABPItems.apocalypseItem;
	}

}
