package yourname.mods.yourmod;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.core.BalmRegistrars;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yourname.mods.yourmod.block.ModBlocks;
import yourname.mods.yourmod.item.ModItems;

public class YourMod {

    public static final Logger logger = LoggerFactory.getLogger(YourMod.class);

    public static final String MOD_ID = "yourmod";

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    public static YourModConfig config() {
        return Balm.config().getActiveConfig(YourModConfig.class);
    }

    public static void initialize(BalmRegistrars registrars) {
        Balm.config().registerConfig(YourModConfig.class);

        registrars.blocks(ModBlocks::initialize);
        registrars.items(ModItems::initialize);
        registrars.creativeModeTabs(ModItems::initialize);
    }

}
