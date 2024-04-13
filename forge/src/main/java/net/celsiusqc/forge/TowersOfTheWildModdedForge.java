package net.celsiusqc.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(net.celsiusqc.TowersOfTheWildModded.MOD_ID)
public class TowersOfTheWildModdedForge {
    public TowersOfTheWildModdedForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(net.celsiusqc.TowersOfTheWildModded.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        net.celsiusqc.TowersOfTheWildModded.init();
    }
}
