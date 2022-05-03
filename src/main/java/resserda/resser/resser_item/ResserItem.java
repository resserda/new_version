package resserda.resser.resser_item;

import net.fabricmc.api.ModInitializer;
import resserda.resser.resser_item.init.ModItems;

public class ResserItem implements ModInitializer {
	// MOD ID
	public static final String MOD_ID = "resser_item";

    @Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//Items & etc...
		ModItems.init();

		
	}
}
