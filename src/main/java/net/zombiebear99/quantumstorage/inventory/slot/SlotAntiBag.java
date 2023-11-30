package net.zombiebear99.quantumstorage.inventory.slot;

import net.zombiebear99.quantumstorage.items.backpack.ItemQuantumBag;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class SlotAntiBag extends SlotItemHandler
{
    public SlotAntiBag(IItemHandler itemHandler, int index, int xPosition, int yPosition)
    {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack stack)
    {
        if(stack.getItem() instanceof ItemQuantumBag) return false;
        return true;
    }
}
