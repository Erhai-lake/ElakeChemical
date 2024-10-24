package top.elake.elakechemical.registers.block;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import top.elake.elakechemical.utils.Registers;
import top.elake.elakechemical.registers.ModCreativeModeTab;
import top.elake.elakechemical.registers.block.custom.Test;

/**
 * @author Erhai-lake
 */
public class ModBlock {
    /**
     * 测试方块
     */
    public static final DeferredBlock<Block> TEST_BLOCK = Registers.registerBlock("test_block",
            () -> new Test(BlockBehaviour.Properties
                    // 复制方块属性
                    .ofFullCopy(Blocks.STONE)
                    // 设置声音类型
                    .sound(SoundType.WOOD)
                    // 设置硬度和爆炸抗性(分别为2和6)
                    .strength(2f, 6f)
                    // 这边是一个比较运算符, 当条件符合ON的时候返回15的亮度,否则为3
                    .lightLevel(state -> state.getValue(Test.ON) ? 15 : 3)
            )
    );

    /**
     * 注册
     */
    public static void register() {
        // 测试方块
        ModCreativeModeTab.addAll(Registers.registerBlockItem("test_block", TEST_BLOCK, new Item.Properties()));
        // 测试方块(实体)
        ModCreativeModeTab.addAll(Registers.registerBlockItem("test_block_entity",
                Registers.registerBlock("test_block_entity",
                        () -> new Test(BlockBehaviour.Properties
                                // 复制方块属性
                                .ofFullCopy(Blocks.STONE)
                                // 设置声音类型
                                .sound(SoundType.WOOD)
                                // 设置硬度和爆炸抗性(分别为2和6)
                                .strength(2f, 6f)
                        )
                ), new Item.Properties()
        ));
    }
}