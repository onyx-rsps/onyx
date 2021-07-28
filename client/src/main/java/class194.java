public class class194 extends class353 {
   static int[] field2210;
   boolean field2201;
   boolean field2209;
   int field2196;
   int field2200;
   int field2208;
   int[] field2199;
   int[] field2204;
   int[] field2205;
   int[] field2206;
   int[] field2207;

   class194(class384 var1) {
      this.field2209 = false;
      this.field2200 = var1.method6655();
      this.field2201 = var1.method6560() == 1;
      int var2 = var1.method6560();
      if (var2 >= 1 && var2 <= 4) {
         this.field2205 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field2205[var3] = var1.method6655();
         }

         if (var2 > 1) {
            this.field2207 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field2207[var3] = var1.method6560();
            }
         }

         if (var2 > 1) {
            this.field2204 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field2204[var3] = var1.method6560();
            }
         }

         this.field2199 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field2199[var3] = var1.method6784();
         }

         this.field2196 = var1.method6560();
         this.field2208 = var1.method6560();
         this.field2206 = null;
      } else {
         throw new RuntimeException();
      }
   }

   void method3806() {
      this.field2206 = null;
   }

   boolean method3815(double var1, int var3, class276 var4) {
      int var5;
      for(var5 = 0; var5 < this.field2205.length; ++var5) {
         if (var4.method4987(this.field2205[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field2206 = new int[var5];

      for(int var6 = 0; var6 < this.field2205.length; ++var6) {
         class396 var7 = class155.method2977(var4, this.field2205[var6]);
         var7.method6976();
         byte[] var8 = var7.field4261;
         int[] var9 = var7.field4260;
         int var10 = this.field2199[var6];
         if ((var10 & -16777216) == 16777216) {
         }

         if ((var10 & -16777216) == 33554432) {
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if ((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for(var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if (var14 >> 8 == (var14 & '\uffff')) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
               }
            }
         }

         for(var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = class197.method3826(var9[var11], var1);
         }

         if (var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field2207[var6 - 1];
         }

         if (var11 == 0) {
            if (var3 == var7.field4262) {
               for(var12 = 0; var12 < var5; ++var12) {
                  this.field2206[var12] = var9[var8[var12] & 255];
               }
            } else if (var7.field4262 == 64 && var3 == 128) {
               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field2206[var12++] = var9[var8[(var13 >> 1 << 6) + (var14 >> 1)] & 255];
                  }
               }
            } else {
               if (var7.field4262 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for(var13 = 0; var13 < var3; ++var13) {
                  for(var14 = 0; var14 < var3; ++var14) {
                     this.field2206[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var11 == 1) {
         }

         if (var11 == 2) {
         }

         if (var11 == 3) {
         }
      }

      return true;
   }

   void method3807(int var1) {
      if (this.field2206 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.field2196 == 1 || this.field2196 == 3) {
            if (field2210 == null || field2210.length < this.field2206.length) {
               field2210 = new int[this.field2206.length];
            }

            if (this.field2206.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field2206.length;
            var4 = var2 * this.field2208 * var1;
            var5 = var3 - 1;
            if (this.field2196 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field2210[var6] = this.field2206[var7];
            }

            var10 = this.field2206;
            this.field2206 = field2210;
            field2210 = var10;
         }

         if (this.field2196 == 2 || this.field2196 == 4) {
            if (field2210 == null || field2210.length < this.field2206.length) {
               field2210 = new int[this.field2206.length];
            }

            if (this.field2206.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field2206.length;
            var4 = this.field2208 * var1;
            var5 = var2 - 1;
            if (this.field2196 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field2210[var8] = this.field2206[var9];
               }
            }

            var10 = this.field2206;
            this.field2206 = field2210;
            field2210 = var10;
         }

      }
   }
}
