package yourname.mods.yourmod.fabric;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.fabric.platform.runtime.FabricLoadContext;
import net.fabricmc.api.ModInitializer;
import yourname.mods.yourmod.YourMod;

public class FabricYourMod implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(YourMod.MOD_ID, FabricLoadContext.INSTANCE, YourMod::initialize);
    }
}
