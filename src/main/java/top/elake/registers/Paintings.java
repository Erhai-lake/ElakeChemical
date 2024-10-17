package top.elake.registers;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.elake.ElakeChemical;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

/**
 * @author Erhai_lake
 */
public class Paintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(Registries.PAINTING_VARIANT, ElakeChemical.MODID);

    public static final Supplier<PaintingVariant> PERIODIC_TABLE_OF_CHEMICAL_ELEMENTS = PAINTING_VARIANTS.register("periodic_table_of_chemical_elements", () -> {
        ResourceLocation texture = requireNonNull(ResourceLocation.tryBuild(ElakeChemical.MODID, "textures/painting/periodic_table_of_chemical_elements.png"));
        return new PaintingVariant(64 * 2, 64, texture);
    });

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
