package yourname.mods.yourmod.forge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.forge.ForgeLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import yourname.mods.yourmod.YourMod;
import yourname.mods.yourmod.forge.client.ForgeYourModClient;

@Mod(YourMod.MOD_ID)
public class ForgeYourMod {

    public ForgeYourMod(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModEventBus());
        Balm.initializeMod(YourMod.MOD_ID, loadContext, new YourMod());
        if (FMLEnvironment.dist.isClient()) {
            BalmClient.initializeMod(YourMod.MOD_ID, loadContext, ForgeYourModClient::initialize);
        }
    }

}
