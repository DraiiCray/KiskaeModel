package net.minecraft.src;

public class ModelKiskae extends ModelBase
{
  //fields
    ModelRenderer hat;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
  public ModelKiskae()
  {
    textureWidth = 105;
    textureHeight = 58;
    
      hat = new ModelRenderer(this, 65, 1);
      hat.addBox(-5F, -9F, -5F, 10, 9, 10);
      hat.setRotationPoint(0F, 0F, 0F);
      hat.setTextureSize(105, 58);
      hat.mirror = true;
      setRotation(hat, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 26);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(105, 58);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 42);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(105, 58);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 42);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(105, 58);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm.mirror = true;
      leftarm = new ModelRenderer(this, 40, 42);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(105, 58);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      leftarm.mirror = false;
      rightleg = new ModelRenderer(this, 0, 42);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(105, 58);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg.mirror = true;
      leftleg = new ModelRenderer(this, 0, 42);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(105, 58);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      leftleg.mirror = false;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    hat.render(f5);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
