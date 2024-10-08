package net.zombiebear99.quantumstorage.tiles.chests;

import net.zombiebear99.quantumstorage.containers.ContainerChestDiamond;
import net.zombiebear99.quantumstorage.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

/**
 * Created by Gigabit101 on 03/04/2017.
 */
public class TileChestDiamond extends TileChestBase {
    public TileChestDiamond(BlockPos blockPos, BlockState blockState)
    {
        super(ModBlocks.CHEST_DIAMOND_TILE.get(), blockPos, blockState, 108);
    }

    @Override
    public Component getDisplayName()
    {
        return new TextComponent("tile.chestdiamond.name");
    }


    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory playerInventory)
    {
        return new ContainerChestDiamond(id, playerInventory, this);
    }

    @Override
    public ItemStack getDropWithNBT()
    {
        CompoundTag tileEntityNBT = new CompoundTag();
        ItemStack dropStack = new ItemStack(ModBlocks.CHEST_DIAMOND.get(), 1);
        writeToNBTWithoutCoords(tileEntityNBT);
        dropStack.getOrCreateTag().put("tileEntity", tileEntityNBT);
        return dropStack;
    }
}
