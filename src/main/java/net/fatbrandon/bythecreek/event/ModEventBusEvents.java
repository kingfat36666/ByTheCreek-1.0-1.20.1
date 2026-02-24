package net.fatbrandon.bythecreek.event;

import net.fatbrandon.bythecreek.ByTheCreek;
import net.fatbrandon.bythecreek.entity.ModEntities;
import net.fatbrandon.bythecreek.entity.custom.BubbleEyeGoldfishEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ByTheCreek.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

 @SubscribeEvent

    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BUBBLEEYEGOLDFISH.get(), BubbleEyeGoldfishEntity.createAttributes().build());
    }
}
