package yourname.mods.yourmod.client;

import net.blay09.mods.balm.api.client.keymappings.BalmKeyMappings;
import net.blay09.mods.balm.api.client.module.BalmClientModule;
import net.blay09.mods.balm.api.client.rendering.BalmModels;
import net.blay09.mods.balm.api.client.rendering.BalmRenderers;
import net.blay09.mods.balm.api.client.screen.BalmScreens;
import net.minecraft.resources.ResourceLocation;

import static yourname.mods.yourmod.YourMod.id;

public class YourModClient implements BalmClientModule {
    @Override
    public ResourceLocation getId() {
        return id("client");
    }

    @Override
    public void registerScreens(BalmScreens screens) {
        ModScreens.initialize(screens);
    }

    @Override
    public void registerRenderers(BalmRenderers renderers) {
        ModRenderers.initialize(renderers);
    }

    @Override
    public void registerModels(BalmModels models) {
        ModModels.initialize(models);
    }

    @Override
    public void registerKeyMappings(BalmKeyMappings keyMappings) {
        ModKeyMappings.initialize();
    }

}
