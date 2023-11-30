package net.zombiebear99.quantumstorage.proxy;

import net.zombiebear99.quantumstorage.client.render.RenderDsu;
import net.zombiebear99.quantumstorage.init.ModBlocks;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

/**
 * Created by Gigabit101 on 07/03/2017.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        //TODO
//        RenderTypeLookup.setRenderLayer(ModBlocks.QSU.get(), RenderType.getCutoutMipped());
//        RenderTypeLookup.setRenderLayer(ModBlocks.TANK.get(), RenderType.getCutoutMipped());
//        RenderTypeLookup.setRenderLayer(ModBlocks.TRASH_CAN.get(), RenderType.getCutout());

        //TODO
        BlockEntityRenderers.register(ModBlocks.QSU_TILE.get(), p_173571_ -> new RenderDsu());
//        BlockEntityRenderers.register(ModBlocks.TANK_TILE.get(), RenderDsu::new);
    }
    
    @Override
    public void registerColors()
    {
        //TODO
//        Minecraft.getInstance().getItemColors().register(new IItemColor() {
//            @Override
//            public int getColor(ItemStack stack, int tintIndex) {
//                return ((IColorable) stack.getItem()).getColor(stack, tintIndex);
//            }
//        }, QuantumStorage.BAGS.values().toArray(new Item[0]));
    }
    
    @Override
    public void registerKeybindings()
    {
//        ClientRegistry.registerKeyBinding(KeyBindings.openBag);
//        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
    }

}
