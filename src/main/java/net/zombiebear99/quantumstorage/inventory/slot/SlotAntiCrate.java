package net.zombiebear99.quantumstorage.inventory.slot;

import net.zombiebear99.quantumstorage.init.ModItems;
import net.zombiebear99.quantumstorage.util.inventory.ItemUtils;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class SlotAntiCrate extends SlotItemHandler
{
    public SlotAntiCrate(IItemHandler itemHandler, int index, int xPosition, int yPosition)
    {
        super(itemHandler, index, xPosition, yPosition);
    }
    
    @Override
    public boolean mayPlace(@NotNull ItemStack stack)
    {
        if (ItemUtils.isItemEqual(stack, new ItemStack(ModItems.CHEST_IRON_ITEM.get()), false)) return false;
        if (ItemUtils.isItemEqual(stack, new ItemStack(ModItems.CHEST_GOLD_ITEM.get()), false)) return false;
        if (ItemUtils.isItemEqual(stack, new ItemStack(ModItems.CHEST_DIAMOND_ITEM.get()), false)) return false;

        return true;
    }
}
