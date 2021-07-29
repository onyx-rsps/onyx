public class class38 {
   static float field311;
   static float[][] field318;
   static int field319;
   static int[][] field317;
   int[] field315;
   int[] field320;
   int[][][] field313;
   int[][][] field314;

   static {
      field318 = new float[2][8];
      field317 = new int[2][8];
   }

   class38() {
      this.field320 = new int[2];
      this.field313 = new int[2][2][4];
      this.field314 = new int[2][2][4];
      this.field315 = new int[2];
   }

   float method822(int var1, int var2, float var3) {
      float var4 = (float)this.field314[var1][0][var2] + var3 * (float)(this.field314[var1][1][var2] - this.field314[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   float method809(int var1, int var2, float var3) {
      float var4 = (float)this.field313[var1][0][var2] + var3 * (float)(this.field313[var1][1][var2] - this.field313[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method810(var4);
   }

   int method820(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.field315[0] + (float)(this.field315[1] - this.field315[0]) * var2;
         var3 *= 0.0030517578F;
         field311 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         field319 = (int)(field311 * 65536.0F);
      }

      if (this.field320[var1] == 0) {
         return 0;
      } else {
         var3 = this.method822(var1, 0, var2);
         field318[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method809(var1, 0, var2));
         field318[var1][1] = var3 * var3;

         float[] var10000;
         int var4;
         for(var4 = 1; var4 < this.field320[var1]; ++var4) {
            var3 = this.method822(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method809(var1, var4, var2));
            float var6 = var3 * var3;
            field318[var1][var4 * 2 + 1] = field318[var1][var4 * 2 - 1] * var6;
            field318[var1][var4 * 2] = field318[var1][var4 * 2 - 1] * var5 + field318[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               var10000 = field318[var1];
               var10000[var7] += field318[var1][var7 - 1] * var5 + field318[var1][var7 - 2] * var6;
            }

            var10000 = field318[var1];
            var10000[1] += field318[var1][0] * var5 + var6;
            var10000 = field318[var1];
            var10000[0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.field320[0] * 2; ++var4) {
               var10000 = field318[0];
               var10000[var4] *= field311;
            }
         }

         for(var4 = 0; var4 < this.field320[var1] * 2; ++var4) {
            field317[var1][var4] = (int)(field318[var1][var4] * 65536.0F);
         }

         return this.field320[var1] * 2;
      }
   }

   final void method812(Buffer var1, class25 var2) {
      int var3 = var1.method6560();
      this.field320[0] = var3 >> 4;
      this.field320[1] = var3 & 15;
      if (var3 != 0) {
         this.field315[0] = var1.method6655();
         this.field315[1] = var1.method6655();
         int var4 = var1.method6560();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field320[var5]; ++var6) {
               this.field313[var5][0][var6] = var1.method6655();
               this.field314[var5][0][var6] = var1.method6655();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field320[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field313[var5][1][var6] = var1.method6655();
                  this.field314[var5][1][var6] = var1.method6655();
               } else {
                  this.field313[var5][1][var6] = this.field313[var5][0][var6];
                  this.field314[var5][1][var6] = this.field314[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.field315[1] != this.field315[0]) {
            var2.method522(var1);
         }
      } else {
         int[] var7 = this.field315;
         this.field315[1] = 0;
         var7[0] = 0;
      }

   }

   static float method810(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}
