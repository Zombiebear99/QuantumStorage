package net.zombiebear99.quantumstorage.containers.slots;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotGhost extends SlotItemHandler
{
    public SlotGhost(IItemHandler inventoryIn, int index, int xPosition, int yPosition)
    {
        super(inventoryIn, index, xPosition, yPosition);
    }

    @Override
    public int getMaxStackSize()
    {
        return 1;
    }

    @Override
    public boolean mayPickup(Player playerIn)
    {
        return false;
    }
}
