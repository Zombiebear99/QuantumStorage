package net.zombiebear99.quantumstorage.containers;

import net.zombiebear99.quantumstorage.init.ModContainers;
import net.zombiebear99.quantumstorage.tiles.chests.TileChestGold;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;

import java.util.Objects;

public class ContainerChestGold extends ContainerChestBase {

    public ContainerChestGold(int id, Inventory playerInv, FriendlyByteBuf extraData) {
        this(id, playerInv, (TileChestGold) Objects.requireNonNull(Minecraft.getInstance().level.getBlockEntity(extraData.readBlockPos())));
    }

    public ContainerChestGold(int id, Inventory playerInv, TileChestGold te) {
        super(ModContainers.CHEST_GOLD_CONTAINER.get(), id);

        addSlots(te, 9, playerInv);
    }


}
