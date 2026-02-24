package net.fatbrandon.bythecreek.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fatbrandon.bythecreek.ByTheCreek;
import net.fatbrandon.bythecreek.entity.custom.BubbleEyeGoldfishEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BubbleEyeGoldfishRenderer extends MobRenderer<BubbleEyeGoldfishEntity, BubbleEyeGoldfish<BubbleEyeGoldfishEntity>> {
    public BubbleEyeGoldfishRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BubbleEyeGoldfish<>(pContext.bakeLayer(ModModelLayers.BUBBLEEYEGOLDFISH_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(BubbleEyeGoldfishEntity pEntity) {
        return new ResourceLocation(ByTheCreek.MOD_ID,"textures/entity/bubbleeyegoldfish.png");
    }

    @Override
    public void render(BubbleEyeGoldfishEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
