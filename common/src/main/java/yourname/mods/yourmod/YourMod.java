package yourname.mods.yourmod;

import net.blay09.mods.balm.api.Balm;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yourname.mods.yourmod.block.ModBlocks;
import yourname.mods.yourmod.item.ModItems;
import yourname.mods.yourmod.network.ModNetworking;

public class YourMod {

    public static final Logger logger = LoggerFactory.getLogger(YourMod.class);

    public static final String MOD_ID = "yourmod";

    public static void initialize() {
        YourModConfig.initialize();
        ModNetworking.initialize(Balm.getNetworking());
        ModBlocks.initialize(Balm.getBlocks());
        ModItems.initialize(Balm.getItems());
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
