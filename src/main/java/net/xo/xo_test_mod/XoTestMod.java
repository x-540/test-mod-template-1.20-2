package net.xo.xo_test_mod;

import net.fabricmc.api.ModInitializer;

import net.xo.xo_test_mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XoTestMod implements ModInitializer {
	public static final String MOD_ID = "xo_test_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Custom mod loaded");
		ModItems.registerModItems();
	}
}