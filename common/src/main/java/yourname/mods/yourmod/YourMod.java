package yourname.mods.yourmod;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.config.BalmConfig;
import net.blay09.mods.balm.api.module.BalmModule;
import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yourname.mods.yourmod.block.ModBlocks;
import yourname.mods.yourmod.item.ModItems;

public class YourMod implements BalmModule {

    public static final Logger logger = LoggerFactory.getLogger(YourMod.class);

    public static final String MOD_ID = "yourmod";

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static YourModConfig config() {
        return Balm.config().getActiveConfig(YourModConfig.class);
    }

    @Override
    public void registerConfig(BalmConfig config) {
        config.registerConfig(YourModConfig.class);
    }

    @Override
    public void registerBlocks(BalmBlockRegistrar blocks) {
        ModBlocks.initialize(blocks);
    }

    @Override
    public void registerItems(BalmItemRegistrar items) {
        ModItems.initialize(items);
    }

    @Override
    public void registerCreativeModeTabs(BalmCreativeModeTabRegistrar creativeModeTabs) {
        ModItems.initialize(creativeModeTabs);
    }

    @Override
    public ResourceLocation getId() {
        return id("common");
    }

}
