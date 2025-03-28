package yourname.mods.yourmod.network;

import net.blay09.mods.balm.api.network.BalmNetworking;
import net.blay09.mods.balm.api.network.SyncConfigMessage;
import yourname.mods.yourmod.YourModConfig;
import yourname.mods.yourmod.network.protocol.ClientboundConfigMessage;

import static yourname.mods.yourmod.YourMod.id;

public class ModNetworking {

    public static void initialize(BalmNetworking networking) {
        SyncConfigMessage.register(id("config"),
                ClientboundConfigMessage.class,
                ClientboundConfigMessage::new,
                YourModConfig.class,
                YourModConfig::new);
    }
}
