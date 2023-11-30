package net.zombiebear99.quantumstorage.guis;

import net.zombiebear99.quantumstorage.containers.ContainerChestGold;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class GuiChestGold extends GuiChestBase<ContainerChestGold>
{
    public GuiChestGold(ContainerChestGold container, Inventory playerinv, Component title)
    {
        super(container, playerinv, title, 190, 225);
    }
}
