package yourname.mods.yourmod.network.protocol;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.level.ServerPlayer;

import static yourname.mods.yourmod.YourMod.id;

public record ServerboundTestPacket(int example) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<ServerboundTestPacket> TYPE = new CustomPacketPayload.Type<>(id("hello_server"));
    public static final StreamCodec<RegistryFriendlyByteBuf, ServerboundTestPacket> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.INT,
            ServerboundTestPacket::example,
            ServerboundTestPacket::new
    );

    public static void handle(final ServerPlayer player, ServerboundTestPacket message) {
        player.sendSystemMessage(Component.literal("Hello, I received: " + message.example));
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
