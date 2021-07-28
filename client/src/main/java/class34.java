public class class34 extends class353 {
   static boolean field264;
   static boolean[] field281;
   static byte[] field287;
   static class23[] field276;
   static class28[] field269;
   static class31[] field278;
   static class33[] field275;
   static float[] field277;
   static float[] field286;
   static float[] field288;
   static float[] field289;
   static float[] field290;
   static float[] field291;
   static float[] field294;
   static int field271;
   static int field273;
   static int field274;
   static int field279;
   static int[] field266;
   static int[] field267;
   static int[] field280;
   boolean field270;
   boolean field292;
   byte[] field295;
   byte[][] field285;
   float[] field282;
   int field265;
   int field268;
   int field272;
   int field283;
   int field284;
   int field293;
   int field296;
   int field297;

   static {
      field264 = false;
   }

   class34(byte[] var1) {
      this.method753(var1);
   }

   void method753(byte[] var1) {
      class384 var2 = new class384(var1);
      this.field265 = var2.method6784();
      this.field272 = var2.method6784();
      this.field293 = var2.method6784();
      this.field268 = var2.method6784();
      if (this.field268 < 0) {
         this.field268 = ~this.field268;
         this.field270 = true;
      }

      int var3 = var2.method6784();
      this.field285 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method6560();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method6572(var7, 0, var5);
         this.field285[var4] = var7;
      }

   }

   class22 method757(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field295 == null) {
            this.field283 = 0;
            this.field282 = new float[field274];
            this.field295 = new byte[this.field272];
            this.field296 = 0;
            this.field297 = 0;
         }

         for(; this.field297 < this.field285.length; ++this.field297) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method755(this.field297);
            if (var2 != null) {
               int var3 = this.field296;
               int var4 = var2.length;
               if (var4 > this.field272 - var3) {
                  var4 = this.field272 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field295[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field296;
               }

               this.field296 = var3;
            }
         }

         this.field282 = null;
         byte[] var7 = this.field295;
         this.field295 = null;
         return new class22(this.field265, var7, this.field293, this.field268, this.field270);
      }
   }

   float[] method755(int var1) {
      method749(this.field285[var1], 0);
      method769();
      int var2 = method752(class191.method3717(field280.length - 1));
      boolean var3 = field281[var2];
      int var4 = var3 ? field274 : field273;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method769() != 0;
         var6 = method769() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field273 >> 2);
         var9 = (field273 >> 2) + (var4 >> 2);
         var10 = field273 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field273 >> 2);
         var12 = (field273 >> 2) + (var4 - (var4 >> 2));
         var13 = field273 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class31 var14 = field278[field280[var2]];
      int var16 = var14.field255;
      int var17 = var14.field254[var16];
      boolean var15 = !field276[var17].method445();
      boolean var45 = var15;

      for(var17 = 0; var17 < var14.field256; ++var17) {
         class28 var18 = field269[var14.field257[var17]];
         float[] var19 = field286;
         var18.method544(var19, var4 >> 1, var45);
      }

      int var40;
      if (!var15) {
         var17 = var14.field255;
         var40 = var14.field254[var17];
         field276[var40].method429(field286, var4 >> 1);
      }

      int var42;
      if (var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field286[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var40 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var43 = field286;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var43[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var43[var21] = -var43[var4 - var21 - 1];
         }

         float[] var44 = var3 ? field290 : field294;
         float[] var22 = var3 ? field291 : field288;
         float[] var23 = var3 ? field277 : field289;
         int[] var24 = var3 ? field267 : field266;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var40; ++var25) {
            var26 = var43[var25 * 4] - var43[var4 - var25 * 4 - 1];
            var27 = var43[var25 * 4 + 2] - var43[var4 - var25 * 4 - 3];
            var28 = var44[var25 * 2];
            var29 = var44[var25 * 2 + 1];
            var43[var4 - var25 * 4 - 1] = var26 * var28 - var27 * var29;
            var43[var4 - var25 * 4 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var42; ++var25) {
            var26 = var43[var17 + var25 * 4 + 3];
            var27 = var43[var17 + var25 * 4 + 1];
            var28 = var43[var25 * 4 + 3];
            var29 = var43[var25 * 4 + 1];
            var43[var17 + var25 * 4 + 3] = var26 + var28;
            var43[var17 + var25 * 4 + 1] = var27 + var29;
            var30 = var44[var17 - 4 - var25 * 4];
            var31 = var44[var17 - 3 - var25 * 4];
            var43[var25 * 4 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var43[var25 * 4 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = class191.method3717(var4 - 1);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * var50 * 2;
               int var52 = var4 - var48 * (var50 * 2 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = var32 * 4;
                  float var34 = var43[var51 - 1 - var33];
                  float var35 = var43[var51 - 3 - var33];
                  float var36 = var43[var52 - 1 - var33];
                  float var37 = var43[var52 - 3 - var33];
                  var43[var51 - 1 - var33] = var34 + var36;
                  var43[var51 - 3 - var33] = var35 + var37;
                  float var38 = var44[var32 * var49];
                  float var39 = var44[var32 * var49 + 1];
                  var43[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var43[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var42 - 1; ++var47) {
            var48 = var24[var47];
            if (var47 < var48) {
               var49 = var47 * 8;
               var50 = var48 * 8;
               var30 = var43[var49 + 1];
               var43[var49 + 1] = var43[var50 + 1];
               var43[var50 + 1] = var30;
               var30 = var43[var49 + 3];
               var43[var49 + 3] = var43[var50 + 3];
               var43[var50 + 3] = var30;
               var30 = var43[var49 + 5];
               var43[var49 + 5] = var43[var50 + 5];
               var43[var50 + 5] = var30;
               var30 = var43[var49 + 7];
               var43[var49 + 7] = var43[var50 + 7];
               var43[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var43[var47] = var43[var47 * 2 + 1];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var43[var4 - 1 - var47 * 2] = var43[var47 * 4];
            var43[var4 - 2 - var47 * 2] = var43[var47 * 4 + 1];
            var43[var4 - var40 - 1 - var47 * 2] = var43[var47 * 4 + 2];
            var43[var4 - var40 - 2 - var47 * 2] = var43[var47 * 4 + 3];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var27 = var23[var47 * 2];
            var28 = var23[var47 * 2 + 1];
            var29 = var43[var17 + var47 * 2];
            var30 = var43[var17 + var47 * 2 + 1];
            var31 = var43[var4 - 2 - var47 * 2];
            float var53 = var43[var4 - 1 - var47 * 2];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var43[var17 + var47 * 2] = (var29 + var31 + var54) * 0.5F;
            var43[var4 - 2 - var47 * 2] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var43[var17 + var47 * 2 + 1] = (var30 - var53 + var54) * 0.5F;
            var43[var4 - 1 - var47 * 2] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var47] = var43[var17 + var47 * 2] * var22[var47 * 2] + var43[var17 + var47 * 2 + 1] * var22[var47 * 2 + 1];
            var43[var17 - 1 - var47] = var43[var17 + var47 * 2] * var22[var47 * 2 + 1] - var43[var17 + var47 * 2 + 1] * var22[var47 * 2];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var47 + (var4 - var40)] = -var43[var47];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var47] = var43[var40 + var47];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var40 + var47] = -var43[var40 - var47 - 1];
         }

         for(var47 = 0; var47 < var40; ++var47) {
            var43[var17 + var47] = var43[var4 - var47 - 1];
         }

         float[] var10000;
         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            var10000 = field286;
            var10000[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            var10000 = field286;
            var10000[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var41 = null;
      if (this.field283 > 0) {
         var40 = var4 + this.field283 >> 2;
         var41 = new float[var40];
         int var20;
         if (!this.field292) {
            for(var42 = 0; var42 < this.field284; ++var42) {
               var20 = var42 + (this.field283 >> 1);
               var41[var42] += this.field282[var20];
            }
         }

         if (!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var20 = var41.length - (var4 >> 1) + var42;
               var41[var20] += field286[var42];
            }
         }
      }

      float[] var46 = this.field282;
      this.field282 = field286;
      field286 = var46;
      this.field283 = var4;
      this.field284 = var12 - (var4 >> 1);
      this.field292 = var15;
      return var41;
   }

   static int method769() {
      int var0 = field287[field271] >> field279 & 1;
      ++field279;
      field271 += field279 >> 3;
      field279 &= 7;
      return var0;
   }

   static int method752(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field279; var0 -= var3) {
         var3 = 8 - field279;
         int var4 = (1 << var3) - 1;
         var1 += (field287[field271] >> field279 & var4) << var2;
         field279 = 0;
         ++field271;
         var2 += var3;
      }

      if (var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field287[field271] >> field279 & var3) << var2;
         field279 += var0;
      }

      return var1;
   }

   static void method749(byte[] var0, int var1) {
      field287 = var0;
      field271 = var1;
      field279 = 0;
   }

   static boolean method751(class276 var0) {
      if (!field264) {
         byte[] var1 = var0.method4920(0, 0);
         if (var1 == null) {
            return false;
         }

         method750(var1);
         field264 = true;
      }

      return true;
   }

   static class34 method767(class276 var0, int var1, int var2) {
      if (!method751(var0)) {
         var0.method5008(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.method4920(var1, var2);
         return var3 == null ? null : new class34(var3);
      }
   }

   static void method750(byte[] var0) {
      method749(var0, 0);
      field273 = 1 << method752(4);
      field274 = 1 << method752(4);
      field286 = new float[field274];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0 ? field274 : field273;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
            var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
         }

         float[] var12 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var12[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
            var12[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
         }

         float[] var13 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var13[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2);
            var13[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var14 = new int[var5];
         int var10 = class191.method3717(var5 - 1);

         for(int var11 = 0; var11 < var5; ++var11) {
            var14[var11] = class58.method1656(var11, var10);
         }

         if (var1 != 0) {
            field290 = var6;
            field291 = var12;
            field277 = var13;
            field267 = var14;
         } else {
            field294 = var6;
            field288 = var12;
            field289 = var13;
            field266 = var14;
         }
      }

      var1 = method752(8) + 1;
      field275 = new class33[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         field275[var2] = new class33();
      }

      var2 = method752(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method752(16);
      }

      var2 = method752(6) + 1;
      field276 = new class23[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field276[var3] = new class23();
      }

      var3 = method752(6) + 1;
      field269 = new class28[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field269[var4] = new class28();
      }

      var4 = method752(6) + 1;
      field278 = new class31[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field278[var5] = new class31();
      }

      var5 = method752(6) + 1;
      field281 = new boolean[var5];
      field280 = new int[var5];

      for(int var15 = 0; var15 < var5; ++var15) {
         field281[var15] = method769() != 0;
         method752(16);
         method752(16);
         field280[var15] = method752(8);
      }

   }

   static float method763(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }
}
