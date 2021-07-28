public class class28 {
   int field229;
   int field230;
   int field231;
   int field232;
   int field233;
   int field234;
   int[] field228;

   class28() {
      this.field233 = class34.method752(16);
      this.field229 = class34.method752(24);
      this.field230 = class34.method752(24);
      this.field231 = class34.method752(24) + 1;
      this.field232 = class34.method752(6) + 1;
      this.field234 = class34.method752(8);
      int[] var1 = new int[this.field232];

      int var2;
      for(var2 = 0; var2 < this.field232; ++var2) {
         int var3 = 0;
         int var4 = class34.method752(3);
         boolean var5 = class34.method769() != 0;
         if (var5) {
            var3 = class34.method752(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.field228 = new int[this.field232 * 8];

      for(var2 = 0; var2 < this.field232 * 8; ++var2) {
         this.field228[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? class34.method752(8) : -1;
      }

   }

   void method544(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         var4 = class34.field275[this.field234].field260;
         int var5 = this.field230 - this.field229;
         int var6 = var5 / this.field231;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if (var8 == 0) {
                  var10 = class34.field275[this.field234].method736();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if (var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.field232;
                     }

                     var10 /= this.field232;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.field228[var8 + var11 * 8];
                  if (var12 >= 0) {
                     int var13 = var9 * this.field231 + this.field229;
                     class33 var14 = class34.field275[var12];
                     int var15;
                     if (this.field233 == 0) {
                        var15 = this.field231 / var14.field260;

                        for(int var16 = 0; var16 < var15; ++var16) {
                           float[] var17 = var14.method744();

                           for(int var18 = 0; var18 < var14.field260; ++var18) {
                              var1[var13 + var16 + var18 * var15] += var17[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.field231) {
                           float[] var19 = var14.method744();

                           for(int var20 = 0; var20 < var14.field260; ++var20) {
                              var1[var13 + var15] += var19[var20];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if (var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }
}
