package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.Npcs.EntityAuraLightning;
import JinRyuu.DragonBC.common.Npcs.ModelLightning;
import JinRyuu.DragonBC.common.Npcs.RenderDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderAuraLightning extends RenderDBC {
   private ModelLightning aModel = new ModelLightning();

   public RenderAuraLightning() {
      super(new ModelLightning(), 0.5F);
   }

   public void renderAuraLightning(EntityAuraLightning var1, double var2, double var4, double var6, float var8, float var9) {
      this.shadowSize = 0.0F;
      GL11.glPushMatrix();
      GL11.glPushMatrix();
      float var10 = this.handleRotationFloat(var1, var9);
      this.handleSizeFloat(var1, var9);
      Random var12 = new Random();
      float var13 = (float)((double)var12.nextInt(5) * 0.1D);
      float var14 = 2.0F;
      GL11.glTranslatef((float)var2 + 0.0F, (float)var4 + 1.6F, (float)var6 + 0.0F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.15F);
      ResourceLocation var15 = new ResourceLocation("jinryuudragonbc:lightning.png");
      this.renderManager.renderEngine.bindTexture(var15);
      GL11.glDepthMask(false);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glAlphaFunc(516, 0.003921569F);
      GL11.glScalef(var14, var14, var14);
      this.aModel.renderModel(var1, 0.0F, 0.0F, 0.0625F, var10);
      GL11.glDisable(3042);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glPopMatrix();
      GL11.glDepthMask(true);
      GL11.glPopMatrix();
   }

   protected float handleRotationFloat(Entity var1, float var2) {
      return (float)var1.ticksExisted + var2;
   }

   protected float handleSizeFloat(Entity var1, float var2) {
      float var3 = ((float)var1.ticksExisted + var2) / 2.0F;
      return var3;
   }

   public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9) {
      this.renderAuraLightning((EntityAuraLightning)var1, var2, var4, var6, var8, var9);
   }
}
