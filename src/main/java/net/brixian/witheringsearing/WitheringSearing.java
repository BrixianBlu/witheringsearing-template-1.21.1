package net.brixian.witheringsearing;

import net.brixian.witheringsearing.block.WSBlocks;
import net.brixian.witheringsearing.item.WSItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WitheringSearing implements ModInitializer {
	public static final String MOD_ID = "witheringsearing";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		WSBlocks.registerModBlocks();
		WSItems.registerWitheredSearingItems();
	}
}