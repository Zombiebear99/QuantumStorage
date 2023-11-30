package net.zombiebear99.quantumstorage.blocks;

import net.zombiebear99.quantumstorage.tiles.chests.TileChestIron;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class BlockChestIron extends BlockChestBase
{
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState)
    {
        return new TileChestIron(blockPos, blockState);
    }

}
