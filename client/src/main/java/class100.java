public class class100 extends class103 {
   static boolean[] field1281;
   int field1277;
   int field1278;
   int field1279;
   int field1280;
   // $FF: synthetic field
   final class106 this$0;

   class100(class106 var1) {
      this.this$0 = var1;
      this.field1278 = -1;
   }

   void vmethod2499(class114 var1) {
      var1.method2302(this.field1278, this.field1279, this.field1277, this.field1280);
   }

   void vmethod2494(class384 var1) {
      this.field1278 = var1.method6655();
      this.field1279 = var1.method6784();
      this.field1277 = var1.method6560();
      this.field1280 = var1.method6560();
   }

   static final void method2158(int var0, int var1, int var2, int var3, int var4) {
      class44.field385[0].method6969(var0, var1);
      class44.field385[1].method6969(var0, var3 + var1 - 16);
      class393.method6880(var0, var1 + 16, 16, var3 - 32, client.field469);
      int var6 = var3 * (var3 - 32) / var4;
      if (var6 < 8) {
         var6 = 8;
      }

      int var7 = (var3 - 32 - var6) * var2 / (var4 - var3);
      class393.method6880(var0, var7 + var1 + 16, 16, var6, client.field470);
      class393.method6932(var0, var7 + var1 + 16, var6, client.field632);
      class393.method6932(var0 + 1, var7 + var1 + 16, var6, client.field632);
      class393.method6886(var0, var7 + var1 + 16, 16, client.field632);
      class393.method6886(var0, var7 + var1 + 17, 16, client.field632);
      class393.method6932(var0 + 15, var7 + var1 + 16, var6, client.field471);
      class393.method6932(var0 + 14, var7 + var1 + 17, var6 - 1, client.field471);
      class393.method6886(var0, var7 + var6 + var1 + 15, 16, client.field471);
      class393.method6886(var0 + 1, var6 + var7 + var1 + 14, 15, client.field471);
   }

   static final void method2152(boolean var0, class383 var1) {
      while(true) {
         if (var1.method6513(client.field452.field1208) >= 27) {
            int var3 = var1.method6505(15);
            if (var3 != 32767) {
               boolean var4 = false;
               if (client.field566[var3] == null) {
                  client.field566[var3] = new class77();
                  var4 = true;
               }

               class77 var5 = client.field566[var3];
               client.field449[++client.field684 - 1] = var3;
               var5.field1069 = client.field451;
               int var9 = var1.method6505(1);
               if (var9 == 1) {
                  client.field474[++client.field500 - 1] = var3;
               }

               int var10 = client.field533[var1.method6505(3)];
               if (var4) {
                  var5.field1042 = var5.field1021 = var10;
               }

               int var7;
               if (var0) {
                  var7 = var1.method6505(8);
                  if (var7 > 127) {
                     var7 -= 256;
                  }
               } else {
                  var7 = var1.method6505(5);
                  if (var7 > 15) {
                     var7 -= 32;
                  }
               }

               int var8;
               if (var0) {
                  var8 = var1.method6505(8);
                  if (var8 > 127) {
                     var8 -= 256;
                  }
               } else {
                  var8 = var1.method6505(5);
                  if (var8 > 15) {
                     var8 -= 32;
                  }
               }

               boolean var11 = var1.method6505(1) == 1;
               if (var11) {
                  var1.method6505(32);
               }

               var5.field1131 = class96.method2133(var1.method6505(14));
               int var6 = var1.method6505(1);
               var5.field1023 = var5.field1131.field1621;
               var5.field1074 = var5.field1131.field1644;
               if (var5.field1074 == 0) {
                  var5.field1021 = 0;
               }

               var5.field1028 = var5.field1131.field1627;
               var5.field1071 = var5.field1131.field1628;
               var5.field1045 = var5.field1131.field1629;
               var5.field1020 = var5.field1131.field1630;
               var5.field1029 = var5.field1131.field1624;
               var5.field1051 = var5.field1131.field1625;
               var5.field1019 = var5.field1131.field1623;
               var5.method1889(class19.field139.field1075[0] + var7, class19.field139.field1076[0] + var8, var6 == 1);
               continue;
            }
         }

         var1.method6525();
         return;
      }
   }

   public static void method2159(int var0, int var1) {
      class151 var4 = (class151)class151.field1688.method4306((long)var0);
      class151 var3;
      if (var4 != null) {
         var3 = var4;
      } else {
         byte[] var9 = class151.field1691.method4920(14, var0);
         var4 = new class151();
         if (var9 != null) {
            var4.method2827(new class384(var9));
         }

         class151.field1688.method4308(var4, (long)var0);
         var3 = var4;
      }

      int var5 = var3.field1689;
      int var6 = var3.field1694;
      int var7 = var3.field1687;
      int var8 = class243.field2916[var7 - var6];
      if (var1 < 0 || var1 > var8) {
         var1 = 0;
      }

      var8 <<= var6;
      class243.field2910[var5] = class243.field2910[var5] & ~var8 | var1 << var6 & var8;
   }

   public static class138 method2160(int var0) {
      class138 var2 = (class138)class138.field1521.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class138.field1524.method4920(5, var0);
         var2 = new class138();
         if (var3 != null) {
            var2.method2619(new class384(var3));
         }

         class138.field1521.method4308(var2, (long)var0);
         return var2;
      }
   }
}
