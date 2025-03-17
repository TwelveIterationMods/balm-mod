package yourname.mods.yourmod.network;

import net.blay09.mods.balm.api.network.BalmNetworking;
import yourname.mods.yourmod.network.protocol.ClientboundTestPacket;
import yourname.mods.yourmod.network.protocol.ServerboundTestPacket;

public class ModNetworking {

    public static void initialize(BalmNetworking networking) {
        networking.registerServerboundPacket(ServerboundTestPacket.TYPE,
                ServerboundTestPacket.class,
                ServerboundTestPacket.STREAM_CODEC,
                ServerboundTestPacket::handle);
        networking.registerClientboundPacket(ClientboundTestPacket.TYPE,
                ClientboundTestPacket.class,
                ClientboundTestPacket.STREAM_CODEC,
                ClientboundTestPacket::handle);
    }
}
