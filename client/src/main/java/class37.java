public class class37 {
   static class274 field301;
   static class274 field306;
   static class75 field307;
   static class83 field310;
   int field303;
   int field304;
   int[][] field300;

   public class37(int var1, int var2) {
      if (var2 != var1) {
         int var3 = class177.method3571(var1, var2);
         var1 /= var3;
         var2 /= var3;
         this.field303 = var1;
         this.field304 = var2;
         this.field300 = new int[var1][14];

         for(int var4 = 0; var4 < var1; ++var4) {
            int[] var5 = this.field300[var4];
            double var6 = 6.0D + (double)var4 / (double)var1;
            int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
            if (var8 < 0) {
               var8 = 0;
            }

            int var9 = (int)Math.ceil(7.0D + var6);
            if (var9 > 14) {
               var9 = 14;
            }

            for(double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
               double var12 = ((double)var8 - var6) * 3.141592653589793D;
               double var14 = var10;
               if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
                  var14 = var10 * (Math.sin(var12) / var12);
               }

               var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
               var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D);
            }
         }

      }
   }

   byte[] method807(byte[] var1) {
      if (this.field300 != null) {
         int var3 = (int)((long)var1.length * (long)this.field304 / (long)this.field303) + 14;
         int[] var4 = new int[var3];
         int var5 = 0;
         int var6 = 0;

         int var7;
         for(var7 = 0; var7 < var1.length; ++var7) {
            byte var8 = var1[var7];
            int[] var9 = this.field300[var6];

            int var10;
            for(var10 = 0; var10 < 14; ++var10) {
               var4[var10 + var5] += var9[var10] * var8;
            }

            var6 += this.field304;
            var10 = var6 / this.field303;
            var5 += var10;
            var6 -= var10 * this.field303;
         }

         var1 = new byte[var3];

         for(var7 = 0; var7 < var3; ++var7) {
            int var11 = var4[var7] + '\u8000' >> 16;
            if (var11 < -128) {
               var1[var7] = -128;
            } else if (var11 > 127) {
               var1[var7] = 127;
            } else {
               var1[var7] = (byte)var11;
            }
         }
      }

      return var1;
   }

   int method800(int var1) {
      if (this.field300 != null) {
         var1 = (int)((long)this.field304 * (long)var1 / (long)this.field303);
      }

      return var1;
   }

   int method801(int var1) {
      if (this.field300 != null) {
         var1 = (int)((long)this.field304 * (long)var1 / (long)this.field303) + 6;
      }

      return var1;
   }

   static final void method806(class248 var0) {
      int var2 = var0.field2961;
      if (var2 == 324) {
         if (client.field674 == -1) {
            client.field674 = var0.field3083;
            client.field675 = var0.field3005;
         }

         if (client.field597.field2930) {
            var0.field3083 = client.field674;
         } else {
            var0.field3083 = client.field675;
         }

      } else if (var2 == 325) {
         if (client.field674 == -1) {
            client.field674 = var0.field3083;
            client.field675 = var0.field3005;
         }

         if (client.field597.field2930) {
            var0.field3083 = client.field675;
         } else {
            var0.field3083 = client.field674;
         }

      } else if (var2 == 327) {
         var0.field3008 = 150;
         var0.field3009 = (int)(Math.sin((double)client.field451 / 40.0D) * 256.0D) & 2047;
         var0.field2949 = 5;
         var0.field3001 = 0;
      } else if (var2 == 328) {
         var0.field3008 = 150;
         var0.field3009 = (int)(Math.sin((double)client.field451 / 40.0D) * 256.0D) & 2047;
         var0.field2949 = 5;
         var0.field3001 = 1;
      }
   }
}
