package net.zombiebear99.quantumstorage.client;

import net.zombiebear99.quantumstorage.QuantumStorage;
import net.zombiebear99.quantumstorage.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * Created by Gigabit101 on 27/01/2017.
 */
public class CreativeTabQuantumStorage extends CreativeModeTab
{
    public static CreativeTabQuantumStorage INSTANCE = new CreativeTabQuantumStorage();

    public CreativeTabQuantumStorage()
    {
        super(QuantumStorage.MOD_ID);
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(ModItems.QSU_ITEM.get());
    }
}
