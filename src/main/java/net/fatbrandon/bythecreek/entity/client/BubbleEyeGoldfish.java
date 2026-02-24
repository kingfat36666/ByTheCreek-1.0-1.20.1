package net.fatbrandon.bythecreek.entity.client;// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.fatbrandon.bythecreek.entity.animations.ModAnimationDefinitions;
import net.fatbrandon.bythecreek.entity.custom.BubbleEyeGoldfishEntity;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class BubbleEyeGoldfish<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart bubbleeyegoldfish;
	private final ModelPart body;
	private final ModelPart reye;
	private final ModelPart leye;
	private final ModelPart rfin;
	private final ModelPart lfin;
	private final ModelPart analfin;
	private final ModelPart tail;
	private final ModelPart rfiniforgorthenameof;
	private final ModelPart lfiniforgorthenameof;
	private final ModelPart dorsalfin;

	public BubbleEyeGoldfish(ModelPart root) {
		this.bubbleeyegoldfish = root.getChild("bubbleeyegoldfish");
		this.body = this.bubbleeyegoldfish.getChild("body");
		this.reye = this.body.getChild("reye");
		this.leye = this.body.getChild("leye");
		this.rfin = this.body.getChild("rfin");
		this.lfin = this.body.getChild("lfin");
		this.analfin = this.body.getChild("analfin");
		this.tail = this.body.getChild("tail");
		this.rfiniforgorthenameof = this.body.getChild("rfiniforgorthenameof");
		this.lfiniforgorthenameof = this.body.getChild("lfiniforgorthenameof");
		this.dorsalfin = this.body.getChild("dorsalfin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bubbleeyegoldfish = partdefinition.addOrReplaceChild("bubbleeyegoldfish", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, -3.0F));

		PartDefinition body = bubbleeyegoldfish.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition reye = body.addOrReplaceChild("reye", CubeListBuilder.create().texOffs(12, 9).addBox(-2.0F, -3.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.4F, -1.4F, -2.4F));

		PartDefinition leye = body.addOrReplaceChild("leye", CubeListBuilder.create().texOffs(12, 15).addBox(-1.0F, -3.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.4F, -1.4F, -2.4F));

		PartDefinition rfin = body.addOrReplaceChild("rfin", CubeListBuilder.create(), PartPose.offset(-4.0F, -3.0F, 5.0F));

		PartDefinition cube_r1 = rfin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 4).addBox(0.0F, -4.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.2958F, -0.4079F, -0.338F));

		PartDefinition lfin = body.addOrReplaceChild("lfin", CubeListBuilder.create(), PartPose.offset(4.0F, -3.0F, 5.0F));

		PartDefinition cube_r2 = lfin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 21).addBox(0.0F, -4.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.2958F, 0.4079F, 0.338F));

		PartDefinition analfin = body.addOrReplaceChild("analfin", CubeListBuilder.create().texOffs(16, 21).addBox(0.0F, -5.0F, 2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 9).addBox(0.0F, -6.0F, -1.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));

		PartDefinition rfiniforgorthenameof = body.addOrReplaceChild("rfiniforgorthenameof", CubeListBuilder.create().texOffs(20, 21).addBox(0.0F, -5.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 5.0F, -1.0F));

		PartDefinition lfiniforgorthenameof = body.addOrReplaceChild("lfiniforgorthenameof", CubeListBuilder.create().texOffs(22, 4).addBox(0.0F, -5.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 5.0F, -1.0F));

		PartDefinition dorsalfin = body.addOrReplaceChild("dorsalfin", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -5.0F, 1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.animateWalk(ModAnimationDefinitions.swim, limbSwing, limbSwingAmount,2f,2.5f);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bubbleeyegoldfish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return bubbleeyegoldfish ;
	}
}