package top.elake.elakechemical.registers.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CustomTestBlockEntity extends AbstractFurnaceBlockEntity {
    public CustomTestBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntity.CUSTOM_GUI.get(), pos, state, RecipeType.SMOKING);
    }

    @Override
    protected @NotNull Component getDefaultName() {
        return Component.translatable("container.custom_gui");
    }

    @Override
    protected @NotNull AbstractContainerMenu createMenu(int id, Inventory inventory) {
        return createMenuInternal(id, inventory, null);
    }

    @Nullable
    public AbstractContainerMenu createMenuInternal(int i, Inventory inventory, Player player) {
        return new FurnaceMenu(i, inventory, this, this.dataAccess) {
            @Override
            public boolean stillValid(@NotNull Player player) {
                return CustomTestBlockEntity.this.stillValid(player);
            }
        };
    }

    public boolean stillValid(@NotNull Player player) {
        if (this.level.getBlockEntity(this.worldPosition) != this) {
            return false;
        } else {
            return player.distanceToSqr(
                    (double) this.worldPosition.getX() + 0.5D,
                    (double) this.worldPosition.getY() + 0.5D,
                    (double) this.worldPosition.getZ() + 0.5D
            ) <= 64.0D;
        }
    }
}