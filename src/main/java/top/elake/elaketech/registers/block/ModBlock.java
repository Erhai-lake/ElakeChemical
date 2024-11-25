package top.elake.elaketech.registers.block;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import top.elake.elaketech.registers.ModCreativeModeTab;
import top.elake.elaketech.registers.block.custom.box.AlcoholLamp;
import top.elake.elaketech.utils.Registers;

/**
 * @author Erhai-lake Qi-Month
 */
public class ModBlock {
    /**
     * 酒精灯
     */
    public static final DeferredBlock<Block> ALCOHOL_LAMP = Registers.registerBlock("alcohol_lamp",
            () -> new AlcoholLamp(BlockBehaviour.Properties
                    .ofFullCopy(Blocks.GLASS)
                    .strength(0.3F)
                    .sound(SoundType.GLASS)
            )
    );

    /**
     * 注册
     */
    public static void register() {
        // 物品
        ModCreativeModeTab.addAll(Registers.registerBlockItem("alcohol_lamp", ALCOHOL_LAMP, new Item.Properties()));
    }
}