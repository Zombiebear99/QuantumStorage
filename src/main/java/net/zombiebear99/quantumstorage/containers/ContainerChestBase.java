package net.zombiebear99.quantumstorage.containers;

import net.minecraft.world.level.block.piston.PistonMovingBlockEntity;
import net.minecraftforge.event.world.PistonEvent;
import net.zombiebear99.quantumstorage.containers.prefab.ContainerQS;
import net.zombiebear99.quantumstorage.inventory.slot.SlotAntiCrate;
import net.zombiebear99.quantumstorage.tiles.chests.TileChestBase;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

import javax.annotation.Nullable;

public class ContainerChestBase extends ContainerQS {
    public ContainerChestBase(@Nullable MenuType<?> containerType, int id){
        super(containerType, id);
    }

    public static PistonEvent.PistonMoveType moveType = PistonEvent.PistonMoveType.EXTEND;
    public void addSlots(TileChestBase te, int columns, Inventory playerInv){
        int row = 0;

        for (int slot = 0; slot < te.inventory.getSlots(); ++row)
            for (int column = 0; column < columns && slot < te.inventory.getSlots(); ++column, slot++)
                addSlot(new SlotAntiCrate(te.inventory, slot, 14 + column * 18, 18 + row * 18));


        final int playerInventoryPosY = row*18 + 35;
        final int playerInventoryPosX = 14 + ((columns - 9) * 18 / 2);

        drawPlayersInv(playerInv, playerInventoryPosX, playerInventoryPosY);
        drawPlayersHotBar(playerInv, playerInventoryPosX, playerInventoryPosY + 58);
    }
}
