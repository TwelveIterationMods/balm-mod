package yourname.mods.yourmod.forge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import yourname.mods.yourmod.YourMod;
import yourname.mods.yourmod.client.YourModClient;

@Mod(YourMod.MOD_ID)
public class ForgeYourMod {

    public ForgeYourMod(FMLJavaModLoadingContext context) {
        Balm.initializeMod(YourMod.MOD_ID, EmptyLoadContext.INSTANCE, YourMod::initialize);
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> BalmClient.initializeMod(YourMod.MOD_ID, EmptyLoadContext.INSTANCE, YourModClient::initialize));
    }

}
