package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDino01;
import JinRyuu.DragonBC.common.Worlds.BiomeDecoratorDBC;
import JinRyuu.DragonBC.common.Worlds.BiomeGenBaseDBC;
import java.awt.Color;
import java.util.Random;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;

public class x0BiomeGenNamek extends BiomeGenBaseDBC {
   BiomeDecoratorDBC customBiomeDecorator;

   public x0BiomeGenNamek(int var1) {
      super(var1);
      this.setBiomeName("Namek");
      this.topBlock = BlocksDBC.BlockNamekGrass;
      this.fillerBlock = BlocksDBC.BlockNamekDirt;
      this.theBiomeDecorator = new BiomeDecoratorDBC();
      this.customBiomeDecorator = (BiomeDecoratorDBC)this.theBiomeDecorator;
      this.customBiomeDecorator.NamekTreePerChunk = 2;
      this.customBiomeDecorator.NamekMedMossPerChunk = 2;
      this.customBiomeDecorator.WarenaiOrePerChunk = 10;
      this.customBiomeDecorator.NamekianHouseChunk = 60;
      this.customBiomeDecorator.NamekFreezaSoldiersChunk = 8;
      this.setColor(8368696);
      this.setMinMaxHeight(-0.3F, 0.4F);
      this.setTemperatureRainfall(0.8F, 0.9F);
      this.temperature = 0.5F;
      this.waterColorMultiplier = '\uff33';
      this.spawnableMonsterList.clear();
      this.spawnableCreatureList.clear();
      this.spawnableWaterCreatureList.clear();
      this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 100, 1, 4));
      this.spawnableMonsterList.add(new SpawnListEntry(EntitySpider.class, 100, 1, 4));
      this.spawnableMonsterList.add(new SpawnListEntry(EntityDino01.class, 100, 1, 1));
   }

   public void decorate(World var1, Random var2, int var3, int var4) {
      super.decorate(var1, var2, var3, var4);
   }

   public String getTextureFile() {
      return "jinryuudragonbc:watercolor.png";
   }

   public BiomeGenBase setTemperatureRainfall(float var1, float var2) {
      if(var1 > 0.1F && var1 < 0.2F) {
         throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
      } else {
         this.temperature = var1;
         this.rainfall = var2;
         return this;
      }
   }

   public BiomeGenBase setMinMaxHeight(float var1, float var2) {
      this.rootHeight = var1;
      this.heightVariation = var2;
      return this;
   }

   public final int getIntTemperature2() {
      return (int)(this.temperature * 65536.0F);
   }

   public final float getFloatTemperature2() {
      return this.temperature;
   }

   public BiomeGenBase setColor(int var1) {
      this.color = var1;
      return this;
   }

   public int getSkyColorByTemp(float var1) {
      var1 = var1 / 3.0F;
      if(var1 < -1.0F) {
         var1 = -1.0F;
      }

      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      return Color.getHSBColor(0.42F - var1 * 0.05F, 0.5F + var1 * 0.1F, 1.0F).getRGB();
   }

   public int getBiomeFoliageColor() {
      double var1 = (double)MathHelper.clamp_float(this.getFloatTemperature2(), 0.0F, 1.0F);
      double var3 = (double)MathHelper.clamp_float(this.getFloatRainfall(), 0.0F, 1.0F);
      return ColorizerFoliage.getFoliageColor(var1, var3);
   }
}
