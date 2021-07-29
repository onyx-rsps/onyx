public class class102 extends class103 {
   int field1287;
   // $FF: synthetic field
   final class106 this$0;

   class102(class106 var1) {
      this.this$0 = var1;
      this.field1287 = -1;
   }

   void vmethod2499(class114 var1) {
      var1.method2295(this.field1287);
   }

   void vmethod2494(Buffer var1) {
      this.field1287 = var1.method6655();
   }

   static boolean method2172(class383 var0, int var1) {
      int var3 = var0.method6505(2);
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if (var3 == 0) {
         if (var0.method6505(1) != 0) {
            method2172(var0, var1);
         }

         var4 = var0.method6505(13);
         var5 = var0.method6505(13);
         boolean var13 = var0.method6505(1) == 1;
         if (var13) {
            class82.field1180[++class82.field1179 - 1] = var1;
         }

         if (client.field523[var1] != null) {
            throw new RuntimeException();
         } else {
            class69 var7 = client.field523[var1] = new class69();
            var7.field999 = var1;
            if (class82.field1167[var1] != null) {
               var7.method1749(class82.field1167[var1]);
            }

            var7.field1042 = class82.field1175[var1];
            var7.field1046 = class82.field1178[var1];
            var8 = class82.field1176[var1];
            var9 = var8 >> 28;
            var10 = var8 >> 14 & 255;
            var11 = var8 & 255;
            var7.field1030[0] = class82.field1170[var1];
            var7.field998 = (byte)var9;
            var7.method1771((var10 << 13) + var4 - class280.field3624, (var11 << 13) + var5 - class77.field1133);
            var7.field1003 = false;
            return true;
         }
      } else if (var3 == 1) {
         var4 = var0.method6505(2);
         var5 = class82.field1176[var1];
         class82.field1176[var1] = (var5 & 268435455) + (((var5 >> 28) + var4 & 3) << 28);
         return false;
      } else {
         int var6;
         int var12;
         if (var3 == 2) {
            var4 = var0.method6505(5);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var12 = class82.field1176[var1];
            var8 = (var12 >> 28) + var5 & 3;
            var9 = var12 >> 14 & 255;
            var10 = var12 & 255;
            if (var6 == 0) {
               --var9;
               --var10;
            }

            if (var6 == 1) {
               --var10;
            }

            if (var6 == 2) {
               ++var9;
               --var10;
            }

            if (var6 == 3) {
               --var9;
            }

            if (var6 == 4) {
               ++var9;
            }

            if (var6 == 5) {
               --var9;
               ++var10;
            }

            if (var6 == 6) {
               ++var10;
            }

            if (var6 == 7) {
               ++var9;
               ++var10;
            }

            class82.field1176[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         } else {
            var4 = var0.method6505(18);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var12 = var4 & 255;
            var8 = class82.field1176[var1];
            var9 = (var8 >> 28) + var5 & 3;
            var10 = var6 + (var8 >> 14) & 255;
            var11 = var12 + var8 & 255;
            class82.field1176[var1] = (var10 << 14) + var11 + (var9 << 28);
            return false;
         }
      }
   }
}
