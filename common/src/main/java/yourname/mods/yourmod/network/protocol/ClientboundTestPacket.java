package yourname.mods.yourmod.network.protocol;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.world.entity.player.Player;

import static yourname.mods.yourmod.YourMod.id;

public record ClientboundTestPacket(int example) implements CustomPacketPayload {

    public static final Type<ClientboundTestPacket> TYPE = new Type<>(id("hello_client"));
    public static final StreamCodec<RegistryFriendlyByteBuf, ClientboundTestPacket> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.INT,
            ClientboundTestPacket::example,
            ClientboundTestPacket::new
    );

    public static void handle(final Player player, ClientboundTestPacket message) {
        player.displayClientMessage(Component.literal("Hello, I received: " + message.example), true);
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
