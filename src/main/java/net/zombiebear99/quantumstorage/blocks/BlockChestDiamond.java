package net.zombiebear99.quantumstorage.blocks;

import net.zombiebear99.quantumstorage.tiles.chests.TileChestDiamond;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockChestDiamond extends BlockChestBase
{
    @org.jetbrains.annotations.Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState)
    {
        return new TileChestDiamond(blockPos, blockState);
    }
}
