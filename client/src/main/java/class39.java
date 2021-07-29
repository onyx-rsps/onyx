import java.util.Random;

public class class39 {
   static int[] field323;
   static int[] field325;
   static int[] field333;
   static int[] field341;
   static int[] field342;
   static int[] field346;
   static int[] field347;
   static int[] field348;
   class25 field324;
   class25 field326;
   class25 field328;
   class25 field329;
   class25 field330;
   class25 field335;
   class25 field337;
   class25 field340;
   class25 field344;
   class38 field336;
   int field327;
   int field334;
   int field339;
   int field343;
   int[] field331;
   int[] field332;
   int[] field338;

   static {
      field346 = new int['\u8000'];
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field346[var1] = (var0.nextInt() & 2) - 1;
      }

      field342 = new int['\u8000'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field342[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field325 = new int[220500];
      field333 = new int[5];
      field323 = new int[5];
      field341 = new int[5];
      field347 = new int[5];
      field348 = new int[5];
   }

   class39() {
      this.field331 = new int[]{0, 0, 0, 0, 0};
      this.field332 = new int[]{0, 0, 0, 0, 0};
      this.field338 = new int[]{0, 0, 0, 0, 0};
      this.field334 = 0;
      this.field327 = 100;
      this.field343 = 500;
      this.field339 = 0;
   }

   final void method826(Buffer var1) {
      this.field340 = new class25();
      this.field340.method512(var1);
      this.field324 = new class25();
      this.field324.method512(var1);
      int var2 = var1.method6560();
      if (var2 != 0) {
         var1.field4181 -= 99;
         this.field344 = new class25();
         this.field344.method512(var1);
         this.field326 = new class25();
         this.field326.method512(var1);
      }

      var2 = var1.method6560();
      if (var2 != 0) {
         var1.field4181 -= 99;
         this.field329 = new class25();
         this.field329.method512(var1);
         this.field328 = new class25();
         this.field328.method512(var1);
      }

      var2 = var1.method6560();
      if (var2 != 0) {
         var1.field4181 -= 99;
         this.field335 = new class25();
         this.field335.method512(var1);
         this.field330 = new class25();
         this.field330.method512(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method6574();
         if (var4 == 0) {
            break;
         }

         this.field331[var3] = var4;
         this.field332[var3] = var1.method6573();
         this.field338[var3] = var1.method6574();
      }

      this.field334 = var1.method6574();
      this.field327 = var1.method6574();
      this.field343 = var1.method6655();
      this.field339 = var1.method6655();
      this.field336 = new class38();
      this.field337 = new class25();
      this.field336.method812(var1, this.field337);
   }

   final int[] method835(int var1, int var2) {
      class308.method5546(field325, 0, var1);
      if (var2 < 10) {
         return field325;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field340.method514();
         this.field324.method514();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field344 != null) {
            this.field344.method514();
            this.field326.method514();
            var5 = (int)((double)(this.field344.field206 - this.field344.field207) * 32.768D / var3);
            var6 = (int)((double)this.field344.field207 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field329 != null) {
            this.field329.method514();
            this.field328.method514();
            var8 = (int)((double)(this.field329.field206 - this.field329.field207) * 32.768D / var3);
            var9 = (int)((double)this.field329.field207 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.field331[var11] != 0) {
               field333[var11] = 0;
               field323[var11] = (int)((double)this.field338[var11] * var3);
               field341[var11] = (this.field331[var11] << 14) / 100;
               field347[var11] = (int)((double)(this.field340.field206 - this.field340.field207) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field332[var11]) / var3);
               field348[var11] = (int)((double)this.field340.field207 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field340.method515(var1);
            var13 = this.field324.method515(var1);
            if (this.field344 != null) {
               var14 = this.field344.method515(var1);
               var15 = this.field326.method515(var1);
               var12 += this.method825(var7, var15, this.field344.field212) >> 1;
               var7 = var7 + var6 + (var14 * var5 >> 16);
            }

            if (this.field329 != null) {
               var14 = this.field329.method515(var1);
               var15 = this.field328.method515(var1);
               var13 = var13 * ((this.method825(var10, var15, this.field329.field212) >> 1) + '\u8000') >> 15;
               var10 = var10 + var9 + (var14 * var8 >> 16);
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.field331[var14] != 0) {
                  var15 = field323[var14] + var11;
                  if (var15 < var1) {
                     var10000 = field325;
                     var10000[var15] += this.method825(field333[var14], var13 * field341[var14] >> 15, this.field340.field212);
                     var10000 = field333;
                     var10000[var14] += (var12 * field347[var14] >> 16) + field348[var14];
                  }
               }
            }
         }

         int var16;
         if (this.field335 != null) {
            this.field335.method514();
            this.field330.method514();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field335.method515(var1);
               var16 = this.field330.method515(var1);
               if (var20) {
                  var12 = (var15 * (this.field335.field206 - this.field335.field207) >> 8) + this.field335.field207;
               } else {
                  var12 = (var16 * (this.field335.field206 - this.field335.field207) >> 8) + this.field335.field207;
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  field325[var14] = 0;
               }
            }
         }

         if (this.field334 > 0 && this.field327 > 0) {
            var11 = (int)((double)this.field334 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = field325;
               var10000[var12] += field325[var12 - var11] * this.field327 / 100;
            }
         }

         if (this.field336.field320[0] > 0 || this.field336.field320[1] > 0) {
            this.field337.method514();
            var11 = this.field337.method515(var1 + 1);
            var12 = this.field336.method820(0, (float)var11 / 65536.0F);
            var13 = this.field336.method820(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field325[var14 + var12] * (long)class38.field319 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field325[var14 + var12 - 1 - var17] * (long)class38.field317[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field325[var14 - 1 - var17] * (long)class38.field317[1][var17] >> 16);
                  }

                  field325[var14] = var16;
                  var11 = this.field337.method515(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field325[var14 + var12] * (long)class38.field319 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field325[var14 + var12 - 1 - var18] * (long)class38.field317[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field325[var14 - 1 - var18] * (long)class38.field317[1][var18] >> 16);
                     }

                     field325[var14] = var17;
                     var11 = this.field337.method515(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field325[var14 + var12 - 1 - var18] * (long)class38.field317[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field325[var14 - 1 - var18] * (long)class38.field317[1][var18] >> 16);
                        }

                        field325[var14] = var17;
                        this.field337.method515(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field336.method820(0, (float)var11 / 65536.0F);
                  var13 = this.field336.method820(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (field325[var11] < -32768) {
               field325[var11] = -32768;
            }

            if (field325[var11] > 32767) {
               field325[var11] = 32767;
            }
         }

         return field325;
      }
   }

   final int method825(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field342[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return (var2 * (var1 & 32767) >> 14) - var2;
      } else {
         return var3 == 4 ? var2 * field346[var1 / 2607 & 32767] : 0;
      }
   }
}
