package top.elake.elakechemical.client.datagen.translation;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredItem;
import top.elake.elakechemical.ElakeChemical;
import top.elake.elakechemical.registers.ModCreativeModeTab;
import top.elake.elakechemical.registers.item.Materials;
import top.elake.elakechemical.registers.tool.Hammer;
import top.elake.elakechemical.registers.tool.tier.Flint;

/**
 * @author Erhai-lake Qi-Month
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
public class en_us extends LanguageProvider {
    public en_us(PackOutput output) {
        super(output, ElakeChemical.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // 元素
        for (DeferredItem<? extends Item> element : ModCreativeModeTab.REGISTERED_ELEMENTS) {
            add(element.get(), element.getRegisteredName().replace(ElakeChemical.MODID + ":", ""));
        }
        // 材料
        // 草纤维
        add(Materials.GRASS_FIBER.get(), "Grass Fiber");
        // 草绳
        add(Materials.GRASS_STRING.get(), "Grass String");
        // 铜板
        add(Materials.COPPER_PLATE.get(), "Copper Plate");
        // 铜线
        add(Materials.COPPER_WIRE.get(), "Copper Wire");
        // 铜简易单闸线圈
        add(Materials.SIMPLE_COPPER_SINGLE_SOLENOID.get(), "Simple Copper Single Solenoid");
        // 石墨
        add(Materials.GRAPHITE.get(), "Graphite");
        // 燧石剑
        add(Flint.FLINT_SWORD.get(), "Flint Sword");
        // 燧石镐
        add(Flint.FLINT_PICKAXE.get(), "Flint Pickaxe");
        // 燧石斧
        add(Flint.FLINT_AXE.get(), "Flint Axe");
        // 燧石手斧
        add(Flint.FLINT_HANDAXE.get(), "Flint Handaxe");
        // 燧石锹
        add(Flint.FLINT_SHOVEL.get(), "Flint Shovel");
        // 燧石锄
        add(Flint.FLINT_HOE.get(), "Flint Hoe");
        // 石锤
        add(Hammer.STONE_HAMMER.get(), "Stone Hammer");
    }
}
