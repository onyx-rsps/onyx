public class class33 {
   float[][] field262;
   int field259;
   int field260;
   int[] field258;
   int[] field261;
   int[] field263;

   class33() {
      class34.method752(24);
      this.field260 = class34.method752(16);
      this.field259 = class34.method752(24);
      this.field258 = new int[this.field259];
      boolean var1 = class34.method769() != 0;
      int var2;
      int var3;
      int var5;
      if (var1) {
         var2 = 0;

         for(var3 = class34.method752(5) + 1; var2 < this.field259; ++var3) {
            int var4 = class34.method752(class191.method3717(this.field259 - var2));

            for(var5 = 0; var5 < var4; ++var5) {
               this.field258[var2++] = var3;
            }
         }
      } else {
         boolean var14 = class34.method769() != 0;

         for(var3 = 0; var3 < this.field259; ++var3) {
            if (var14 && class34.method769() == 0) {
               this.field258[var3] = 0;
            } else {
               this.field258[var3] = class34.method752(5) + 1;
            }
         }
      }

      this.method735();
      var2 = class34.method752(4);
      if (var2 > 0) {
         float var15 = class34.method763(class34.method752(32));
         float var16 = class34.method763(class34.method752(32));
         var5 = class34.method752(4) + 1;
         boolean var6 = class34.method769() != 0;
         int var7;
         if (var2 == 1) {
            var7 = method737(this.field259, this.field260);
         } else {
            var7 = this.field259 * this.field260;
         }

         this.field263 = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this.field263[var8] = class34.method752(var5);
         }

         this.field262 = new float[this.field259][this.field260];
         float var9;
         int var10;
         int var11;
         if (var2 == 1) {
            for(var8 = 0; var8 < this.field259; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this.field260; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this.field263[var12] * var16 + var15 + var9;
                  this.field262[var8][var11] = var13;
                  if (var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this.field259; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this.field260;

               for(var11 = 0; var11 < this.field260; ++var11) {
                  float var17 = (float)this.field263[var10] * var16 + var15 + var9;
                  this.field262[var8][var11] = var17;
                  if (var6) {
                     var9 = var17;
                  }

                  ++var10;
               }
            }
         }
      }

   }

   int method736() {
      int var1;
      for(var1 = 0; this.field261[var1] >= 0; var1 = class34.method769() != 0 ? this.field261[var1] : var1 + 1) {
      }

      return ~this.field261[var1];
   }

   float[] method744() {
      return this.field262[this.method736()];
   }

   void method735() {
      int[] var1 = new int[this.field259];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.field259; ++var3) {
         var4 = this.field258[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var12;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var12 = var2[var8];
                  if (var12 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var12 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var12 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var12 = var2[var8];
               if (var12 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field261 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.field259; ++var3) {
         var4 = this.field258[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.field261[var6] == 0) {
                     this.field261[var6] = var11;
                  }

                  var6 = this.field261[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.field261.length) {
                  int[] var9 = new int[this.field261.length * 2];

                  for(var10 = 0; var10 < this.field261.length; ++var10) {
                     var9[var10] = this.field261[var10];
                  }

                  this.field261 = var9;
               }

               var8 >>>= 1;
            }

            this.field261[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   static int method737(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var4 = var2;
         int var5 = var1;

         int var6;
         for(var6 = 1; var5 > 1; var5 >>= 1) {
            if ((var5 & 1) != 0) {
               var6 *= var4;
            }

            var4 *= var4;
         }

         int var3;
         if (var5 == 1) {
            var3 = var4 * var6;
         } else {
            var3 = var6;
         }

         if (var3 <= var0) {
            return var2;
         }

         --var2;
      }
   }
}
