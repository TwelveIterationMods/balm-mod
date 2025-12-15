package yourname.mods.yourmod.forge;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.forge.platform.runtime.ForgeLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import yourname.mods.yourmod.YourMod;
import yourname.mods.yourmod.client.YourModClient;

@Mod(YourMod.MOD_ID)
public class ForgeYourMod {

    public ForgeYourMod(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModBusGroup());
        Balm.initializeMod(YourMod.MOD_ID, loadContext, YourMod::initialize);
        if (FMLEnvironment.dist.isClient()) {
            BalmClient.initializeMod(YourMod.MOD_ID, loadContext, YourModClient::initialize);
        }
    }

}
