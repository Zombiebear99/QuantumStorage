package net.zombiebear99.quantumstorage.api;

import net.minecraft.world.item.ItemStack;

public interface IColorable
{
    int getColor(ItemStack stack, int tint);
}
