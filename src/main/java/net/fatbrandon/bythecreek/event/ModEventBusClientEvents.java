package net.fatbrandon.bythecreek.event;

import net.fatbrandon.bythecreek.ByTheCreek;
import net.fatbrandon.bythecreek.entity.client.BubbleEyeGoldfish;
import net.fatbrandon.bythecreek.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ByTheCreek.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT )
public class ModEventBusClientEvents {

    @SubscribeEvent

    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.BUBBLEEYEGOLDFISH_LAYER, BubbleEyeGoldfish::createBodyLayer);
    }

}
