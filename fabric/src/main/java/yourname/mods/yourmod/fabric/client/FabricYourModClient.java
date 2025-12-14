package yourname.mods.yourmod.fabric.client;

import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.fabric.platform.runtime.FabricLoadContext;
import net.fabricmc.api.ClientModInitializer;
import yourname.mods.yourmod.YourMod;
import yourname.mods.yourmod.client.YourModClient;

public class FabricYourModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(YourMod.MOD_ID, FabricLoadContext.INSTANCE, YourModClient::initialize);
    }
}
