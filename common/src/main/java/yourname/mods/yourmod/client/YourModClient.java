package yourname.mods.yourmod.client;

import net.blay09.mods.balm.api.client.module.BalmClientModule;
import net.blay09.mods.balm.client.BalmKeyMappingRegistrar;
import net.minecraft.resources.ResourceLocation;

import static yourname.mods.yourmod.YourMod.id;

public class YourModClient implements BalmClientModule {
    @Override
    public ResourceLocation getId() {
        return id("client");
    }

    @Override
    public void registerKeyMappings(BalmKeyMappingRegistrar keyMappings) {
        ModKeyMappings.initialize();
    }

}
