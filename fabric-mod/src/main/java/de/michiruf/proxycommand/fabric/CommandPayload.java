package de.michiruf.proxycommand.fabric;

import de.michiruf.proxycommand.common.ProxyCommandConstants;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record CommandPayload(String command) implements CustomPayload {
    public static final Id<CommandPayload> ID = new Id<>(Identifier.of(ProxyCommandConstants.COMMAND_NAMESPACE,ProxyCommandConstants.COMMAND_PACKET_PATH));
    public static final PacketCodec<RegistryByteBuf, CommandPayload> CODEC =  PacketCodec.tuple(PacketCodecs.STRING, CommandPayload::command, CommandPayload::new);

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
