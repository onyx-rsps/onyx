import java.io.File;
import java.io.RandomAccessFile;

public final class class51 extends class200 {
   static class366 field760;
   static class396[] field769;
   static int field771;
   boolean field766;
   class158 field763;
   int field757;
   int field758;
   int field759;
   int field761;
   int field762;
   int field765;
   int field767;
   int field768;

   class51(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field768 = 0;
      this.field765 = 0;
      this.field766 = false;
      this.field767 = var1;
      this.field759 = var2;
      this.field757 = var3;
      this.field761 = var4;
      this.field762 = var5;
      this.field758 = var7 + var6;
      int var8 = class24.method463(this.field767).field1663;
      if (var8 != -1) {
         this.field766 = false;
         this.field763 = class47.method1355(var8);
      } else {
         this.field766 = true;
      }

   }

   protected final class206 vmethod4091() {
      class149 var2 = class24.method463(this.field767);
      class206 var3;
      if (!this.field766) {
         var3 = var2.method2791(this.field768);
      } else {
         var3 = var2.method2791(-1);
      }

      return var3 == null ? null : var3;
   }

   final void method1575(int var1) {
      if (!this.field766) {
         this.field765 += var1;

         while(this.field765 > this.field763.field1864[this.field768]) {
            this.field765 -= this.field763.field1864[this.field768];
            ++this.field768;
            if (this.field768 >= this.field763.field1862.length) {
               this.field766 = true;
               break;
            }
         }

      }
   }

   public static class143 method1579(int var0) {
      class143 var2 = (class143)class143.field1579.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class11.field71.method4920(33, var0);
         var2 = new class143();
         if (var3 != null) {
            var2.method2722(new class384(var3));
         }

         class143.field1579.method4308(var2, (long)var0);
         return var2;
      }
   }

   static void method1578(class301 var0, class301 var1) {
      if (class188.field2126 == null) {
         class188.field2126 = class60.method1667(class270.field3535, "sl_back", "");
      }

      class396[] var3;
      class274 var4;
      int var5;
      int var6;
      if (field769 == null) {
         var4 = class270.field3535;
         var5 = var4.method4936("sl_flags");
         var6 = var4.method4938(var5, "");
         var3 = class132.method2560(var4, var5, var6);
         field769 = var3;
      }

      if (class45.field391 == null) {
         var4 = class270.field3535;
         var5 = var4.method4936("sl_arrows");
         var6 = var4.method4938(var5, "");
         var3 = class132.method2560(var4, var5, var6);
         class45.field391 = var3;
      }

      if (class60.field896 == null) {
         var4 = class270.field3535;
         var5 = var4.method4936("sl_stars");
         var6 = var4.method4938(var5, "");
         var3 = class132.method2560(var4, var5, var6);
         class60.field896 = var3;
      }

      if (class137.field1519 == null) {
         class137.field1519 = class117.method2382(class270.field3535, "leftarrow", "");
      }

      if (class95.field1256 == null) {
         class95.field1256 = class117.method2382(class270.field3535, "rightarrow", "");
      }

      class393.method6880(class55.field824, 23, 765, 480, 0);
      class393.method6881(class55.field824, 0, 125, 23, 12425273, 9135624);
      class393.method6881(class55.field824 + 125, 0, 640, 23, 5197647, 2697513);
      var0.method5441("Select a world", class55.field824 + 62, 15, 0, -1);
      if (class60.field896 != null) {
         class60.field896[1].method6969(class55.field824 + 140, 1);
         var1.method5372("Members only world", class55.field824 + 152, 10, 16777215, -1);
         class60.field896[0].method6969(class55.field824 + 140, 12);
         var1.method5372("Free world", class55.field824 + 152, 21, 16777215, -1);
      }

      if (class45.field391 != null) {
         int var23 = class55.field824 + 280;
         if (class47.field695[0] == 0 && class47.field694[0] == 0) {
            class45.field391[2].method6969(var23, 4);
         } else {
            class45.field391[0].method6969(var23, 4);
         }

         if (class47.field695[0] == 0 && class47.field694[0] == 1) {
            class45.field391[3].method6969(var23 + 15, 4);
         } else {
            class45.field391[1].method6969(var23 + 15, 4);
         }

         var0.method5372("World", var23 + 32, 17, 16777215, -1);
         int var24 = class55.field824 + 390;
         if (class47.field695[0] == 1 && class47.field694[0] == 0) {
            class45.field391[2].method6969(var24, 4);
         } else {
            class45.field391[0].method6969(var24, 4);
         }

         if (class47.field695[0] == 1 && class47.field694[0] == 1) {
            class45.field391[3].method6969(var24 + 15, 4);
         } else {
            class45.field391[1].method6969(var24 + 15, 4);
         }

         var0.method5372("Players", var24 + 32, 17, 16777215, -1);
         var5 = class55.field824 + 500;
         if (class47.field695[0] == 2 && class47.field694[0] == 0) {
            class45.field391[2].method6969(var5, 4);
         } else {
            class45.field391[0].method6969(var5, 4);
         }

         if (class47.field695[0] == 2 && class47.field694[0] == 1) {
            class45.field391[3].method6969(var5 + 15, 4);
         } else {
            class45.field391[1].method6969(var5 + 15, 4);
         }

         var0.method5372("Location", var5 + 32, 17, 16777215, -1);
         var6 = class55.field824 + 610;
         if (class47.field695[0] == 3 && class47.field694[0] == 0) {
            class45.field391[2].method6969(var6, 4);
         } else {
            class45.field391[0].method6969(var6, 4);
         }

         if (class47.field695[0] == 3 && class47.field694[0] == 1) {
            class45.field391[3].method6969(var6 + 15, 4);
         } else {
            class45.field391[1].method6969(var6 + 15, 4);
         }

         var0.method5372("Type", var6 + 32, 17, 16777215, -1);
      }

      class393.method6880(class55.field824 + 708, 4, 50, 16, 0);
      var1.method5441("Cancel", class55.field824 + 708 + 25, 16, 16777215, -1);
      class55.field825 = -1;
      if (class188.field2126 != null) {
         byte var27 = 88;
         byte var28 = 19;
         var5 = 765 / (var27 + 1) - 1;
         var6 = 480 / (var28 + 1);

         int var7;
         int var8;
         do {
            var7 = var6;
            var8 = var5;
            if (var6 * (var5 - 1) >= class47.field691) {
               --var5;
            }

            if (var5 * (var6 - 1) >= class47.field691) {
               --var6;
            }

            if (var5 * (var6 - 1) >= class47.field691) {
               --var6;
            }
         } while(var6 != var7 || var5 != var8);

         var7 = (765 - var27 * var5) / (var5 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         var8 = (480 - var28 * var6) / (var6 + 1);
         if (var8 > 5) {
            var8 = 5;
         }

         int var9 = (765 - var27 * var5 - var7 * (var5 - 1)) / 2;
         int var10 = (480 - var6 * var28 - var8 * (var6 - 1)) / 2;
         int var11 = (var6 + class47.field691 - 1) / var6;
         class55.field827 = var11 - var5;
         if (class137.field1519 != null && class55.field826 > 0) {
            class137.field1519.method6969(8, client.field686 / 2 - class137.field1519.field4263 / 2);
         }

         if (class95.field1256 != null && class55.field826 < class55.field827) {
            class95.field1256.method6969(class68.field970 - class95.field1256.field4262 - 8, client.field686 / 2 - class95.field1256.field4263 / 2);
         }

         int var12 = var10 + 23;
         int var13 = var9 + class55.field824;
         int var14 = 0;
         boolean var15 = false;
         int var16 = class55.field826;

         int var17;
         for(var17 = var6 * var16; var17 < class47.field691 && var16 - class55.field826 < var5; ++var17) {
            class47 var25 = class15.field85[var17];
            boolean var19 = true;
            String var20 = Integer.toString(var25.field698);
            if (var25.field698 == -1) {
               var20 = "OFF";
               var19 = false;
            } else if (var25.field698 > 1980) {
               var20 = "FULL";
               var19 = false;
            }

            int var22 = 0;
            byte var21;
            if (var25.method1333()) {
               if (var25.method1317()) {
                  var21 = 7;
               } else {
                  var21 = 6;
               }
            } else if (var25.method1321()) {
               var22 = 16711680;
               if (var25.method1317()) {
                  var21 = 5;
               } else {
                  var21 = 4;
               }
            } else if (var25.method1340()) {
               if (var25.method1317()) {
                  var21 = 9;
               } else {
                  var21 = 8;
               }
            } else if (var25.method1319()) {
               if (var25.method1317()) {
                  var21 = 3;
               } else {
                  var21 = 2;
               }
            } else if (var25.method1317()) {
               var21 = 1;
            } else {
               var21 = 0;
            }

            if (class19.field141 >= var13 && class19.field144 >= var12 && class19.field141 < var13 + var27 && class19.field144 < var28 + var12 && var19) {
               class55.field825 = var17;
               class188.field2126[var21].method7003(var13, var12, 128, 16777215);
               var15 = true;
            } else {
               class188.field2126[var21].method7066(var13, var12);
            }

            if (field769 != null) {
               field769[(var25.method1317() ? 8 : 0) + var25.field701].method6969(var13 + 29, var12);
            }

            var0.method5441(Integer.toString(var25.field696), var13 + 15, var28 / 2 + var12 + 5, var22, -1);
            var1.method5441(var20, var13 + 60, var28 / 2 + var12 + 5, 268435455, -1);
            var12 = var12 + var28 + var8;
            ++var14;
            if (var14 >= var6) {
               var12 = var10 + 23;
               var13 = var13 + var7 + var27;
               var14 = 0;
               ++var16;
            }
         }

         if (var15) {
            var17 = var1.method5367(class15.field85[class55.field825].field689) + 6;
            int var18 = var1.field3737 + 8;
            int var26 = class19.field144 + 25;
            if (var18 + var26 > 480) {
               var26 = class19.field144 - 25 - var18;
            }

            class393.method6880(class19.field141 - var17 / 2, var26, var17, var18, 16777120);
            class393.method6907(class19.field141 - var17 / 2, var26, var17, var18, 0);
            var1.method5441(class15.field85[class55.field825].field689, class19.field141, var26 + var1.field3737 + 4, 0, -1);
         }
      }

      class263.field3193.vmethod6948(0, 0);
   }

   static boolean method1577(File var0, boolean var1) {
      try {
         RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
         int var4 = var3.read();
         var3.seek(0L);
         var3.write(var4);
         var3.seek(0L);
         var3.close();
         return true;
      } catch (Exception var5) {
         return false;
      }
   }

   static final int method1570(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }
}
