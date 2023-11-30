package net.zombiebear99.quantumstorage.inventory.slot;

import net.zombiebear99.quantumstorage.items.ItemUpgrade;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Gigabit101 on 30/07/2017.
 */
public class SlotUpgrade extends SlotItemHandler
{
    public SlotUpgrade(IItemHandler itemHandler, int index, int xPosition, int yPosition)
    {
        super(itemHandler, index, xPosition, yPosition);
    }
    
    @Override
    public boolean mayPlace(@NotNull ItemStack stack)
    {
        if (stack.getItem() instanceof ItemUpgrade)
        {
            return true;
        }
        return false;
    }
}
