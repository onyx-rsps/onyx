public class class239 extends class31 {
   static class136 field2879;
   class21 field2878;
   class236 field2880;
   class296 field2877;

   class239(class236 var1) {
      this.field2877 = new class296();
      this.field2878 = new class21();
      this.field2880 = var1;
   }

   protected class31 method643() {
      class241 var1 = (class241)this.field2877.method4687();
      if (null == var1) {
         return null;
      } else {
         return (class31)(var1.field2901 != null ? var1.field2901 : this.method631());
      }
   }

   protected class31 method631() {
      class241 var1;
      do {
         var1 = (class241)this.field2877.method4678();
         if (null == var1) {
            return null;
         }
      } while(var1.field2901 == null);

      return var1.field2901;
   }

   protected int method632() {
      return 0;
   }

   protected void method641(int[] var1, int var2, int var3) {
      this.field2878.method641(var1, var2, var3);

      for(class241 var6 = (class241)this.field2877.method4687(); var6 != null; var6 = (class241)this.field2877.method4678()) {
         if (!this.field2880.method3993(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field2902) {
                  this.method4121(var6, var1, var4, var5, var5 + var4);
                  var6.field2902 -= var5;
                  break;
               }

               this.method4121(var6, var1, var4, var6.field2902, var5 + var4);
               var4 += var6.field2902;
               var5 -= var6.field2902;
            } while(!this.field2880.method3994(var6, var1, var4, var5));
         }
      }

   }

   protected void method635(int var1) {
      this.field2878.method635(var1);

      for(class241 var3 = (class241)this.field2877.method4687(); null != var3; var3 = (class241)this.field2877.method4678()) {
         if (!this.field2880.method3993(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field2902) {
                  this.method4120(var3, var2);
                  var3.field2902 -= var2;
                  break;
               }

               this.method4120(var3, var3.field2902);
               var2 -= var3.field2902;
            } while(!this.field2880.method3994(var3, (int[])null, 0, var2));
         }
      }

   }

   void method4121(class241 var1, int[] var2, int var3, int var4, int var5) {
      if ((this.field2880.field2831[var1.field2903] & 4) != 0 && var1.field2897 < 0) {
         int var7 = this.field2880.field2842[var1.field2903] / class282.field3634;

         while(true) {
            int var8 = (var7 + 1048575 - var1.field2899) / var7;
            if (var8 > var4) {
               var1.field2899 += var4 * var7;
               break;
            }

            var1.field2901.method641(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.field2899 += var7 * var8 - 1048576;
            int var9 = class282.field3634 / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            class30 var11 = var1.field2901;
            if (this.field2880.field2840[var1.field2903] == 0) {
               var1.field2901 = class30.method493(var1.field2885, var11.method508(), var11.method499(), var11.method500());
            } else {
               var1.field2901 = class30.method493(var1.field2885, var11.method508(), 0, var11.method500());
               this.field2880.method3965(var1, var1.field2891.field2869[var1.field2894] < 0);
               var1.field2901.method504(var9, var11.method499());
            }

            if (var1.field2891.field2869[var1.field2894] < 0) {
               var1.field2901.method566(-1);
            }

            var11.method506(var9);
            var11.method641(var2, var3, var5 - var3);
            if (var11.method510()) {
               this.field2878.method329(var11);
            }
         }
      }

      var1.field2901.method641(var2, var3, var4);
   }

   void method4120(class241 var1, int var2) {
      if (0 != (this.field2880.field2831[var1.field2903] & 4) && var1.field2897 < 0) {
         int var4 = this.field2880.field2842[var1.field2903] / class282.field3634;
         int var5 = (1048575 + var4 - var1.field2899) / var4;
         var1.field2899 = var2 * var4 + var1.field2899 & 1048575;
         if (var5 <= var2) {
            if (0 == this.field2880.field2840[var1.field2903]) {
               var1.field2901 = class30.method493(var1.field2885, var1.field2901.method508(), var1.field2901.method499(), var1.field2901.method500());
            } else {
               var1.field2901 = class30.method493(var1.field2885, var1.field2901.method508(), 0, var1.field2901.method500());
               this.field2880.method3965(var1, var1.field2891.field2869[var1.field2894] < 0);
            }

            if (var1.field2891.field2869[var1.field2894] < 0) {
               var1.field2901.method566(-1);
            }

            var2 = var1.field2899 / var4;
         }
      }

      var1.field2901.method635(var2);
   }

   static final void method4119() {
      if (class83.field1183) {
         for(int var1 = 0; var1 < class83.field1172; ++var1) {
            class70 var2 = client.field524[class83.field1178[var1]];
            var2.method1708();
         }

         class83.field1183 = false;
      }

   }

   static final void method4125(boolean var0, class384 var1) {
      client.field481 = var0;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      if (!client.field481) {
         var3 = var1.method5987();
         int var4 = var1.method6076();
         var5 = var1.method6043();
         class44.field370 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class44.field370[var6][var7] = var1.method6172();
            }
         }

         class235.field2821 = new int[var5];
         class251.field3110 = new int[var5];
         class97.field1263 = new int[var5];
         class227.field2673 = new byte[var5][];
         class356.field4011 = new byte[var5][];
         boolean var17 = false;
         if ((48 == var4 / 8 || var4 / 8 == 49) && 48 == var3 / 8) {
            var17 = true;
         }

         if (48 == var4 / 8 && var3 / 8 == 148) {
            var17 = true;
         }

         var5 = 0;

         for(var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
            for(var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; ++var8) {
               var9 = (var7 << 8) + var8;
               if (!var17 || var8 != 49 && var8 != 149 && 147 != var8 && var7 != 50 && (var7 != 49 || 47 != var8)) {
                  class235.field2821[var5] = var9;
                  class251.field3110[var5] = class199.field2277.method4428("m" + var7 + "_" + var8);
                  class97.field1263[var5] = class199.field2277.method4428("l" + var7 + "_" + var8);
                  ++var5;
               }
            }
         }

         class99.method2072(var4, var3, true);
      } else {
         var3 = var1.method5988();
         boolean var16 = var1.method5979() == 1;
         var5 = var1.method6043();
         var6 = var1.method6043();
         var1.method5892();

         int var10;
         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = var1.method5893(1);
                  if (1 == var10) {
                     client.field467[var7][var8][var9] = var1.method5893(26);
                  } else {
                     client.field467[var7][var8][var9] = -1;
                  }
               }
            }
         }

         var1.method5913();
         class44.field370 = new int[var6][4];

         for(var7 = 0; var7 < var6; ++var7) {
            for(var8 = 0; var8 < 4; ++var8) {
               class44.field370[var7][var8] = var1.method6172();
            }
         }

         class235.field2821 = new int[var6];
         class251.field3110 = new int[var6];
         class97.field1263 = new int[var6];
         class227.field2673 = new byte[var6][];
         class356.field4011 = new byte[var6][];
         var6 = 0;

         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = client.field467[var7][var8][var9];
                  if (var10 != -1) {
                     int var11 = var10 >> 14 & 1023;
                     int var12 = var10 >> 3 & 2047;
                     int var13 = (var11 / 8 << 8) + var12 / 8;

                     int var14;
                     for(var14 = 0; var14 < var6; ++var14) {
                        if (var13 == class235.field2821[var14]) {
                           var13 = -1;
                           break;
                        }
                     }

                     if (var13 != -1) {
                        class235.field2821[var6] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        class251.field3110[var6] = class199.field2277.method4428("m" + var14 + "_" + var15);
                        class97.field1263[var6] = class199.field2277.method4428("l" + var14 + "_" + var15);
                        ++var6;
                     }
                  }
               }
            }
         }

         class99.method2072(var3, var5, !var16);
      }

   }
}
