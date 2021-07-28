import java.io.IOException;

public class class237 extends class353 {
   byte[] field2867;
   byte[] field2872;
   byte[] field2873;
   class22[] field2869;
   class233[] field2871;
   int field2870;
   int[] field2874;
   short[] field2868;

   class237(byte[] var1) {
      this.field2869 = new class22[128];
      this.field2868 = new short[128];
      this.field2873 = new byte[128];
      this.field2867 = new byte[128];
      this.field2871 = new class233[128];
      this.field2872 = new byte[128];
      this.field2874 = new int[128];
      class384 var2 = new class384(var1);

      int var3;
      for(var3 = 0; var2.payload[var3 + var2.field4181 * -1084587701] != 0; ++var3) {
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.method6561();
      }

      var2.field4181 += 99;
      ++var3;
      var5 = var2.field4181 * -1084587701;
      var2.field4181 = (var2.field4181 * -1084587701 + var3) * 99;

      int var6;
      for(var6 = 0; var2.payload[var6 + var2.field4181 * -1084587701] != 0; ++var6) {
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.method6561();
      }

      var2.field4181 += 99;
      ++var6;
      var8 = var2.field4181 * -1084587701;
      var2.field4181 = (var2.field4181 * -1084587701 + var6) * 99;

      int var9;
      for(var9 = 0; var2.payload[var9 + var2.field4181 * -1084587701] != 0; ++var9) {
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.method6561();
      }

      var2.field4181 += 99;
      ++var9;
      byte[] var36 = new byte[var9];
      int var12;
      int var14;
      if (var9 > 1) {
         var36[1] = 1;
         int var13 = 1;
         var12 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.method6560();
            if (var15 == 0) {
               var13 = var12++;
            } else {
               if (var15 <= var13) {
                  --var15;
               }

               var13 = var15;
            }

            var36[var14] = (byte)var13;
         }
      } else {
         var12 = var9;
      }

      class233[] var37 = new class233[var12];

      class233 var38;
      for(var14 = 0; var14 < var37.length; ++var14) {
         var38 = var37[var14] = new class233();
         int var16 = var2.method6560();
         if (var16 > 0) {
            var38.field2808 = new byte[var16 * 2];
         }

         var16 = var2.method6560();
         if (var16 > 0) {
            var38.field2811 = new byte[var16 * 2 + 2];
            var38.field2811[1] = 64;
         }
      }

      var14 = var2.method6560();
      byte[] var45 = var14 > 0 ? new byte[var14 * 2] : null;
      var14 = var2.method6560();
      byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;

      int var17;
      for(var17 = 0; var2.payload[var17 + var2.field4181 * -1084587701] != 0; ++var17) {
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.method6561();
      }

      var2.field4181 += 99;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.method6560();
         this.field2868[var20] = (short)var19;
      }

      var19 = 0;

      short[] var48;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.method6560();
         var48 = this.field2868;
         var48[var20] = (short)(var48[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.method6578();
         }

         var48 = this.field2868;
         var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
         this.field2874[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if (this.field2874[var24] != 0) {
            if (var20 == 0) {
               if (var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.payload[var5++] - 1;
            }

            this.field2872[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if (this.field2874[var25] != 0) {
            if (var20 == 0) {
               if (var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.payload[var8++] + 16 << 2;
            }

            this.field2867[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      class233 var40 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if (this.field2874[var26] != 0) {
            if (var20 == 0) {
               var40 = var37[var36[var21]];
               if (var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.field2871[var26] = var40;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if (this.field2874[var27] > 0) {
               var26 = var2.method6560() + 1;
            }
         }

         this.field2873[var27] = (byte)var26;
         --var20;
      }

      this.field2870 = var2.method6560() + 1;

      class233 var28;
      int var29;
      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field2808 != null) {
            for(var29 = 1; var29 < var28.field2808.length; var29 += 2) {
               var28.field2808[var29] = var2.method6561();
            }
         }

         if (var28.field2811 != null) {
            for(var29 = 3; var29 < var28.field2811.length - 2; var29 += 2) {
               var28.field2811[var29] = var2.method6561();
            }
         }
      }

      if (var45 != null) {
         for(var27 = 1; var27 < var45.length; var27 += 2) {
            var45[var27] = var2.method6561();
         }
      }

      if (var39 != null) {
         for(var27 = 1; var27 < var39.length; var27 += 2) {
            var39[var27] = var2.method6561();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field2811 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field2811.length; var29 += 2) {
               var19 = 1 + var19 + var2.method6560();
               var28.field2811[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field2808 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field2808.length; var29 += 2) {
               var19 = var19 + 1 + var2.method6560();
               var28.field2808[var29] = (byte)var19;
            }
         }
      }

      byte var30;
      int var32;
      int var33;
      int var34;
      int var42;
      byte var44;
      if (var45 != null) {
         var19 = var2.method6560();
         var45[0] = (byte)var19;

         for(var27 = 2; var27 < var45.length; var27 += 2) {
            var19 = var19 + 1 + var2.method6560();
            var45[var27] = (byte)var19;
         }

         var44 = var45[0];
         byte var41 = var45[1];

         for(var29 = 0; var29 < var44; ++var29) {
            this.field2873[var29] = (byte)(var41 * this.field2873[var29] + 32 >> 6);
         }

         for(var29 = 2; var29 < var45.length; var29 += 2) {
            var30 = var45[var29];
            byte var31 = var45[var29 + 1];
            var32 = var41 * (var30 - var44) + (var30 - var44) / 2;

            for(var33 = var44; var33 < var30; ++var33) {
               var34 = class55.method1590(var32, var30 - var44);
               this.field2873[var33] = (byte)(var34 * this.field2873[var33] + 32 >> 6);
               var32 += var31 - var41;
            }

            var44 = var30;
            var41 = var31;
         }

         for(var42 = var44; var42 < 128; ++var42) {
            this.field2873[var42] = (byte)(var41 * this.field2873[var42] + 32 >> 6);
         }

         var38 = null;
      }

      if (var39 != null) {
         var19 = var2.method6560();
         var39[0] = (byte)var19;

         for(var27 = 2; var27 < var39.length; var27 += 2) {
            var19 = var19 + 1 + var2.method6560();
            var39[var27] = (byte)var19;
         }

         var44 = var39[0];
         int var47 = var39[1] << 1;

         for(var29 = 0; var29 < var44; ++var29) {
            var42 = var47 + (this.field2867[var29] & 255);
            if (var42 < 0) {
               var42 = 0;
            }

            if (var42 > 128) {
               var42 = 128;
            }

            this.field2867[var29] = (byte)var42;
         }

         int var43;
         for(var29 = 2; var29 < var39.length; var29 += 2) {
            var30 = var39[var29];
            var43 = var39[var29 + 1] << 1;
            var32 = var47 * (var30 - var44) + (var30 - var44) / 2;

            for(var33 = var44; var33 < var30; ++var33) {
               var34 = class55.method1590(var32, var30 - var44);
               int var35 = var34 + (this.field2867[var33] & 255);
               if (var35 < 0) {
                  var35 = 0;
               }

               if (var35 > 128) {
                  var35 = 128;
               }

               this.field2867[var33] = (byte)var35;
               var32 += var43 - var47;
            }

            var44 = var30;
            var47 = var43;
         }

         for(var42 = var44; var42 < 128; ++var42) {
            var43 = var47 + (this.field2867[var42] & 255);
            if (var43 < 0) {
               var43 = 0;
            }

            if (var43 > 128) {
               var43 = 128;
            }

            this.field2867[var42] = (byte)var43;
         }

         Object var46 = null;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field2806 = var2.method6560();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field2808 != null) {
            var28.field2807 = var2.method6560();
         }

         if (var28.field2811 != null) {
            var28.field2805 = var2.method6560();
         }

         if (var28.field2806 > 0) {
            var28.field2809 = var2.method6560();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field2810 = var2.method6560();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field2810 > 0) {
            var28.field2804 = var2.method6560();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field2804 > 0) {
            var28.field2812 = var2.method6560();
         }
      }

   }

   void method4561() {
      this.field2874 = null;
   }

   boolean method4562(class27 var1, byte[] var2, int[] var3) {
      boolean var5 = true;
      int var6 = 0;
      class22 var7 = null;

      for(int var8 = 0; var8 < 128; ++var8) {
         if (var2 == null || var2[var8] != 0) {
            int var9 = this.field2874[var8];
            if (var9 != 0) {
               if (var6 != var9) {
                  var6 = var9--;
                  if ((var9 & 1) == 0) {
                     var7 = var1.method534(var9 >> 2, var3);
                  } else {
                     var7 = var1.method535(var9 >> 2, var3);
                  }

                  if (var7 == null) {
                     var5 = false;
                  }
               }

               if (var7 != null) {
                  this.field2869[var8] = var7;
                  this.field2874[var8] = 0;
               }
            }
         }
      }

      return var5;
   }

   static int method4568() {
      return client.field612 ? 2 : 1;
   }

   static void method4563(class276 var0, class276 var1, boolean var2, int var3) {
      if (class55.field797) {
         if (var3 == 4) {
            class55.field811 = 4;
         }

      } else {
         class55.field811 = var3;
         class393.method6876();
         byte[] var5 = var0.method4940("title.jpg", "");
         class55.field814 = class75.method1865(var5);
         class55.field802 = class55.field814.method6988();
         int var6 = client.field405;
         if ((var6 & 536870912) != 0) {
            class88.field1228 = class117.method2382(var1, "logo_deadman_mode", "");
         } else if ((var6 & 1073741824) != 0) {
            class88.field1228 = class117.method2382(var1, "logo_seasonal_mode", "");
         } else {
            class88.field1228 = class117.method2382(var1, "logo", "");
         }

         class304.field3759 = class117.method2382(var1, "titlebox", "");
         class55.field800 = class117.method2382(var1, "titlebutton", "");
         int var8 = var1.method4936("runes");
         int var9 = var1.method4938(var8, "");
         class396[] var7 = class132.method2560(var1, var8, var9);
         class55.field796 = var7;
         var9 = var1.method4936("title_mute");
         int var10 = var1.method4938(var9, "");
         class396[] var11 = class132.method2560(var1, var9, var10);
         class132.field1485 = var11;
         class46.field396 = class117.method2382(var1, "options_radio_buttons,0", "");
         class91.field1239 = class117.method2382(var1, "options_radio_buttons,4", "");
         class172.field2013 = class117.method2382(var1, "options_radio_buttons,2", "");
         class335.field3919 = class117.method2382(var1, "options_radio_buttons,6", "");
         class114.field1386 = class46.field396.field4262;
         class47.field704 = class46.field396.field4263;
         class6.field15 = new class73(class55.field796);
         if (var2) {
            class55.field808 = "";
            class55.field817 = "";
         }

         class282.field3639 = 0;
         class146.field1614 = "";
         class55.field820 = true;
         class55.field799 = false;
         if (!class37.field307.field1113) {
            class149.method2806(2, class108.field1325, "scape main", "", 255, false);
         } else {
            class234.field2818 = 1;
            class234.field2819 = null;
            class234.field2821 = -1;
            class96.field1263 = -1;
            class146.field1611 = 0;
            class145.field1597 = false;
            class123.field1438 = 2;
         }

         if (class277.field3613 != null) {
            try {
               class384 var12 = new class384(4);
               var12.writeByte(3);
               var12.method6723(0);
               class277.field3613.write(var12.payload, 0, 4);
            } catch (IOException var15) {
               try {
                  class277.field3613.vmethod5858();
               } catch (Exception var14) {
               }

               ++class277.field3604;
               class277.field3613 = null;
            }
         }

         class55.field797 = true;
         class55.field824 = (class68.field970 - 765) / 2;
         class55.field816 = class55.field824 + 202;
         class166.field1931 = class55.field816 + 180;
         class55.field814.method7066(class55.field824, 0);
         class55.field802.method7066(class55.field824 + 382, 0);
         class88.field1228.method6969(class55.field824 + 382 - class88.field1228.field4262 / 2, 18);
      }
   }
}
