package JinRyuu.DragonBC.common.Villages;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.Npcs.EntityNamekian01;
import JinRyuu.DragonBC.common.Npcs.EntityNamekian03;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class NamekianHouse1 extends WorldGenerator {
   public NamekianHouse1() {
   }

   public boolean generate(World var1, Random var2, int var3, int var4, int var5) {
      Block var6 = BlocksDBC.BlockNamekGrass;
      if(var1.getBlock(var3, var4, var5) == var6 && var1.getBlock(var3, var4 + 1, var5).getMaterial() == Material.air && var1.getBlock(var3 + 7, var4, var5) == var6 && var1.getBlock(var3 + 7, var4, var5 + 7) == var6 && var1.getBlock(var3, var4, var5 + 7) == var6 && var1.getBlock(var3 + 7, var4 + 1, var5).getMaterial() == Material.air && var1.getBlock(var3 + 7, var4 + 1, var5 + 7).getMaterial() == Material.air && var1.getBlock(var3, var4 + 1, var5 + 7).getMaterial() == Material.air) {
         this.setBlock(var1, var3 + 0, var4 + 0, var5 + 8, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 0, var4 + 0, var5 + 7, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 0, var4 + 0, var5 + 6, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 0, var4 + 0, var5 + 5, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 0, var4 + 0, var5 + 4, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 0, var4 + 0, var5 + 3, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 0, var4 + 0, var5 + 2, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 0, var4 + 0, var5 + 1, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 0, var4 + 0, var5 + 0, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 1, var4 + 0, var5 + 8, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 1, var4 + 0, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 0, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 0, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 0, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 0, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 0, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 0, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 0, var5 + 0, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 2, var4 + 0, var5 + 8, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 2, var4 + 0, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 0, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 0, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 0, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 0, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 0, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 0, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 0, var5 + 0, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 3, var4 + 0, var5 + 8, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 3, var4 + 0, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 0, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 0, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 0, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 0, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 0, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 0, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 0, var5 + 0, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 4, var4 + 0, var5 + 8, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 4, var4 + 0, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 0, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 0, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 0, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 0, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 0, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 0, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 0, var5 + 0, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 5, var4 + 0, var5 + 8, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 5, var4 + 0, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 0, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 0, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 0, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 0, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 0, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 0, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 0, var5 + 0, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 6, var4 + 0, var5 + 8, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 6, var4 + 0, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 0, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 0, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 0, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 0, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 0, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 0, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 0, var5 + 0, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 7, var4 + 0, var5 + 8, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 7, var4 + 0, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 0, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 0, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 0, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 0, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 0, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 0, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 0, var5 + 0, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 8, var4 + 0, var5 + 8, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 8, var4 + 0, var5 + 7, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 8, var4 + 0, var5 + 6, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 8, var4 + 0, var5 + 5, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 8, var4 + 0, var5 + 4, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 8, var4 + 0, var5 + 3, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 8, var4 + 0, var5 + 2, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 8, var4 + 0, var5 + 1, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 8, var4 + 0, var5 + 0, BlocksDBC.BlockNamekGrass);
         this.setBlock(var1, var3 + 0, var4 + 1, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 0, var4 + 1, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 0, var4 + 1, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 0, var4 + 1, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 0, var4 + 1, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 1, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 1, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 1, var5 + 8, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 1, var5 + 0, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 1, var5 + 8, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 1, var5 + 0, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 1, var5 + 8, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 1, var5 + 8, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 1, var5 + 0, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 1, var5 + 8, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 1, var5 + 0, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 1, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 1, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 8, var4 + 1, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 8, var4 + 1, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 8, var4 + 1, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 8, var4 + 1, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 8, var4 + 1, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 0, var4 + 2, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 0, var4 + 2, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 0, var4 + 2, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 0, var4 + 2, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 2, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 2, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 2, var5 + 8, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 2, var5 + 0, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 2, var5 + 8, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 2, var5 + 0, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 2, var5 + 8, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 2, var5 + 0, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 2, var5 + 8, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 2, var5 + 0, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 2, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 2, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 8, var4 + 2, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 8, var4 + 2, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 8, var4 + 2, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 8, var4 + 2, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 3, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 3, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 3, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 3, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 1, var4 + 3, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 3, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 3, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 3, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 3, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 3, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 3, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 3, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 3, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 3, var5 + 7, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 3, var5 + 1, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 3, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 3, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 3, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 3, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 7, var4 + 3, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 4, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 4, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 4, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 4, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 2, var4 + 4, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 4, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 4, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 4, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 4, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 4, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 4, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 4, var5 + 6, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 4, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 4, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 4, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 6, var4 + 4, var5 + 2, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 5, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 5, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 3, var4 + 5, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 5, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 5, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 5, var5 + 5, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 5, var5 + 4, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 5, var4 + 5, var5 + 3, BlocksDBC.BlockNamekStone);
         this.setBlock(var1, var3 + 4, var4 + 5, var5 + 4, BlocksDBC.BlockNamekStone);
         EntityNamekian03 var7 = new EntityNamekian03(var1);
         var7.initCreature();

         for(int var8 = 0; var8 < 3; ++var8) {
            EntityNamekian01 var9 = new EntityNamekian01(var1);
            var9.setLocationAndAngles((double)var3 - 4.0D + (double)var2.nextInt(5) - (double)var2.nextInt(5), (double)(var4 + 2), (double)var5 - 4.0D + (double)var2.nextInt(5) - (double)var2.nextInt(5), 0.0F, 0.0F);
            var1.spawnEntityInWorld(var9);
         }

         var7.setLocationAndAngles((double)var3 + 4.0D, (double)(var4 + 2), (double)var5 + 4.0D, 0.0F, 0.0F);
         var1.spawnEntityInWorld(var7);
      }

      return true;
   }

   private void setBlock(World var1, int var2, int var3, int var4, Block var5) {
      this.setBlockAndNotifyAdequately(var1, var2, var3, var4, var5, 0);
   }
}
