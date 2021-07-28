public class class238 extends class30 {
   static class135 field2878;
   class20 field2877;
   class235 field2879;
   class295 field2876;

   class238(class235 var1) {
      this.field2876 = new class295();
      this.field2877 = new class20();
      this.field2879 = var1;
   }

   protected void vmethod4573(int[] var1, int var2, int var3) {
      this.field2877.vmethod4573(var1, var2, var3);

      for(class240 var6 = (class240)this.field2876.method5202(); var6 != null; var6 = (class240)this.field2876.method5193()) {
         if (!this.field2879.method4434(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field2901) {
                  this.method4575(var6, var1, var4, var5, var5 + var4);
                  var6.field2901 -= var5;
                  break;
               }

               this.method4575(var6, var1, var4, var6.field2901, var5 + var4);
               var4 += var6.field2901;
               var5 -= var6.field2901;
            } while(!this.field2879.method4435(var6, var1, var4, var5));
         }
      }

   }

   protected void vmethod4574(int var1) {
      this.field2877.vmethod4574(var1);

      for(class240 var3 = (class240)this.field2876.method5202(); var3 != null; var3 = (class240)this.field2876.method5193()) {
         if (!this.field2879.method4434(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field2901) {
                  this.method4572(var3, var2);
                  var3.field2901 -= var2;
                  break;
               }

               this.method4572(var3, var3.field2901);
               var2 -= var3.field2901;
            } while(!this.field2879.method4435(var3, (int[])null, 0, var2));
         }
      }

   }

   protected class30 vmethod4576() {
      class240 var1;
      do {
         var1 = (class240)this.field2876.method5193();
         if (var1 == null) {
            return null;
         }
      } while(var1.field2900 == null);

      return var1.field2900;
   }

   void method4572(class240 var1, int var2) {
      if ((this.field2879.field2830[var1.field2902] & 4) != 0 && var1.field2896 < 0) {
         int var4 = this.field2879.field2841[var1.field2902] / class281.field3633;
         int var5 = (var4 + 1048575 - var1.field2898) / var4;
         var1.field2898 = var4 * var2 + var1.field2898 & 1048575;
         if (var5 <= var2) {
            if (this.field2879.field2839[var1.field2902] == 0) {
               var1.field2900 = class29.method554(var1.field2884, var1.field2900.method569(), var1.field2900.method560(), var1.field2900.method561());
            } else {
               var1.field2900 = class29.method554(var1.field2884, var1.field2900.method569(), 0, var1.field2900.method561());
               this.field2879.method4399(var1, var1.field2890.field2868[var1.field2893] < 0);
            }

            if (var1.field2890.field2868[var1.field2893] < 0) {
               var1.field2900.method641(-1);
            }

            var2 = var1.field2898 / var4;
         }
      }

      var1.field2900.vmethod4574(var2);
   }

   void method4575(class240 var1, int[] var2, int var3, int var4, int var5) {
      if ((this.field2879.field2830[var1.field2902] & 4) != 0 && var1.field2896 < 0) {
         int var7 = this.field2879.field2841[var1.field2902] / class281.field3633;

         while(true) {
            int var8 = (var7 + 1048575 - var1.field2898) / var7;
            if (var8 > var4) {
               var1.field2898 += var4 * var7;
               break;
            }

            var1.field2900.vmethod4573(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.field2898 += var7 * var8 - 1048576;
            int var9 = class281.field3633 / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            class29 var11 = var1.field2900;
            if (this.field2879.field2839[var1.field2902] == 0) {
               var1.field2900 = class29.method554(var1.field2884, var11.method569(), var11.method560(), var11.method561());
            } else {
               var1.field2900 = class29.method554(var1.field2884, var11.method569(), 0, var11.method561());
               this.field2879.method4399(var1, var1.field2890.field2868[var1.field2893] < 0);
               var1.field2900.method565(var9, var11.method560());
            }

            if (var1.field2890.field2868[var1.field2893] < 0) {
               var1.field2900.method641(-1);
            }

            var11.method567(var9);
            var11.vmethod4573(var2, var3, var5 - var3);
            if (var11.method571()) {
               this.field2877.method372(var11);
            }
         }
      }

      var1.field2900.vmethod4573(var2, var3, var4);
   }

   protected class30 vmethod4569() {
      class240 var1 = (class240)this.field2876.method5202();
      if (var1 == null) {
         return null;
      } else {
         return (class30)(var1.field2900 != null ? var1.field2900 : this.vmethod4576());
      }
   }

   protected int vmethod4589() {
      return 0;
   }

   static final void method4571() {
      if (class82.field1182) {
         for(int var1 = 0; var1 < class82.field1171; ++var1) {
            class69 var2 = client.field523[class82.field1177[var1]];
            var2.method1757();
         }

         class82.field1182 = false;
      }

   }

   static final void method4593(boolean var0, class383 var1) {
      client.field480 = var0;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      if (!client.field480) {
         var3 = var1.method6599();
         int var4 = var1.method6688();
         var5 = var1.method6655();
         class43.field369 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class43.field369[var6][var7] = var1.method6784();
            }
         }

         class234.field2820 = new int[var5];
         class250.field3109 = new int[var5];
         class96.field1262 = new int[var5];
         class226.field2672 = new byte[var5][];
         class355.field4010 = new byte[var5][];
         boolean var17 = false;
         if ((var4 / 8 == 48 || var4 / 8 == 49) && var3 / 8 == 48) {
            var17 = true;
         }

         if (var4 / 8 == 48 && var3 / 8 == 148) {
            var17 = true;
         }

         var5 = 0;

         for(var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
            for(var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; ++var8) {
               var9 = var8 + (var7 << 8);
               if (!var17 || var8 != 49 && var8 != 149 && var8 != 147 && var7 != 50 && (var7 != 49 || var8 != 47)) {
                  class234.field2820[var5] = var9;
                  class250.field3109[var5] = class198.field2276.method4936("m" + var7 + "_" + var8);
                  class96.field1262[var5] = class198.field2276.method4936("l" + var7 + "_" + var8);
                  ++var5;
               }
            }
         }

         class98.method2140(var4, var3, true);
      } else {
         var3 = var1.method6600();
         boolean var16 = var1.method6591() == 1;
         var5 = var1.method6655();
         var6 = var1.method6655();
         var1.method6504();

         int var10;
         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = var1.method6505(1);
                  if (var10 == 1) {
                     client.field466[var7][var8][var9] = var1.method6505(26);
                  } else {
                     client.field466[var7][var8][var9] = -1;
                  }
               }
            }
         }

         var1.method6525();
         class43.field369 = new int[var6][4];

         for(var7 = 0; var7 < var6; ++var7) {
            for(var8 = 0; var8 < 4; ++var8) {
               class43.field369[var7][var8] = var1.method6784();
            }
         }

         class234.field2820 = new int[var6];
         class250.field3109 = new int[var6];
         class96.field1262 = new int[var6];
         class226.field2672 = new byte[var6][];
         class355.field4010 = new byte[var6][];
         var6 = 0;

         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = client.field466[var7][var8][var9];
                  if (var10 != -1) {
                     int var11 = var10 >> 14 & 1023;
                     int var12 = var10 >> 3 & 2047;
                     int var13 = (var11 / 8 << 8) + var12 / 8;

                     int var14;
                     for(var14 = 0; var14 < var6; ++var14) {
                        if (class234.field2820[var14] == var13) {
                           var13 = -1;
                           break;
                        }
                     }

                     if (var13 != -1) {
                        class234.field2820[var6] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        class250.field3109[var6] = class198.field2276.method4936("m" + var14 + "_" + var15);
                        class96.field1262[var6] = class198.field2276.method4936("l" + var14 + "_" + var15);
                        ++var6;
                     }
                  }
               }
            }
         }

         class98.method2140(var3, var5, !var16);
      }

   }
}
