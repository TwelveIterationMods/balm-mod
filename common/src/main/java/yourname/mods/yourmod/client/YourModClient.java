package yourname.mods.yourmod.client;

import net.blay09.mods.balm.client.platform.module.BalmClientModule;
import net.blay09.mods.balm.client.BalmKeyMappingRegistrar;
import net.minecraft.resources.Identifier;

import static yourname.mods.yourmod.YourMod.id;

public class YourModClient implements BalmClientModule {
    @Override
    public Identifier getId() {
        return id("client");
    }

    @Override
    public void registerKeyMappings(BalmKeyMappingRegistrar keyMappings) {
        ModKeyMappings.initialize();
    }

}
