package yourname.mods.yourmod.neoforge.client;

import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.neoforge.platform.runtime.NeoForgeLoadContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import yourname.mods.yourmod.YourMod;
import yourname.mods.yourmod.client.YourModClient;

@Mod(value = YourMod.MOD_ID, dist = Dist.CLIENT)
public class NeoForgeYourModClient {

    public NeoForgeYourModClient(ModContainer modContainer, IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modContainer, modEventBus);
        BalmClient.initializeMod(YourMod.MOD_ID, context, YourModClient::initialize);
    }
}
