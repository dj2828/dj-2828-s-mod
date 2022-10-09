// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgolem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "golem"), "main");
	private final ModelPart gambasx;
	private final ModelPart gambadx;
	private final ModelPart busto;
	private final ModelPart testa;
	private final ModelPart manodx;
	private final ModelPart manosx;
	private final ModelPart bb_main;

	public Modelgolem(ModelPart root) {
		this.gambasx = root.getChild("gambasx");
		this.gambadx = root.getChild("gambadx");
		this.busto = root.getChild("busto");
		this.testa = root.getChild("testa");
		this.manodx = root.getChild("manodx");
		this.manosx = root.getChild("manosx");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gambasx = partdefinition.addOrReplaceChild("gambasx", CubeListBuilder.create().texOffs(18, 18)
				.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 21.0F, 1.0F));

		PartDefinition gambadx = partdefinition.addOrReplaceChild("gambadx", CubeListBuilder.create().texOffs(10, 17)
				.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 21.0F, 1.0F));

		PartDefinition busto = partdefinition.addOrReplaceChild("busto",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.5F, -3.0F, -3.0F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-1.5F, -4.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, 1.0F));

		PartDefinition testa = partdefinition.addOrReplaceChild("testa",
				CubeListBuilder.create().texOffs(16, 15)
						.addBox(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-2.5F, -4.0F, -3.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, 1.0F));

		PartDefinition bocca = testa.addOrReplaceChild("bocca", CubeListBuilder.create().texOffs(14, 10).addBox(-2.5F,
				0.0F, -3.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition manodx = partdefinition.addOrReplaceChild("manodx", CubeListBuilder.create().texOffs(22, 3)
				.addBox(0.0F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 16.0F, 1.0F));

		PartDefinition manosx = partdefinition.addOrReplaceChild("manosx", CubeListBuilder.create().texOffs(0, 22)
				.addBox(-1.0F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 16.0F, 1.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 17)
				.addBox(-2.0F, -8.0F, 2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		gambasx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gambadx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		busto.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		testa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manodx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manosx.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.manosx.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.gambasx.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.gambadx.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.manodx.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.testa.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.testa.xRot = headPitch / (180F / (float) Math.PI);
	}
}