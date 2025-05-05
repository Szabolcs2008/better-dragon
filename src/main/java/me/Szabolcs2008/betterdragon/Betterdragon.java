package me.Szabolcs2008.betterdragon;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Betterdragon implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Betterdragon");

    public static final String MOD_ID = "betterdragon";

    @Override
    public void onInitialize() {
        ModItems.initialize();
    }
}
