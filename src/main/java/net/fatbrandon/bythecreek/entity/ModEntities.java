package net.fatbrandon.bythecreek.entity;

import net.fatbrandon.bythecreek.ByTheCreek;
import net.fatbrandon.bythecreek.entity.custom.BubbleEyeGoldfishEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities  {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ByTheCreek.MOD_ID);

public static final RegistryObject<EntityType<BubbleEyeGoldfishEntity >> BUBBLEEYEGOLDFISH =
    ENTITY_TYPES.register("bubbleeyegoldfishmodel", () -> EntityType.Builder.of(BubbleEyeGoldfishEntity::new, MobCategory.WATER_AMBIENT)
            .sized(1f, 0.5f).build("bubbleeyegoldfishmodel"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
