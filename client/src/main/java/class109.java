public class class109 extends class104 {
   static class275 field1326;
   int field1327;
   int field1328;
   int field1331;
   int field1332;
   // $FF: synthetic field
   final class107 this$0;

   class109(class107 var1) {
      this.this$0 = var1;
   }

   void method2083(class385 var1) {
      this.field1332 = var1.method6172();
      this.field1331 = var1.method6172();
      this.field1327 = var1.method5948();
      this.field1328 = var1.method5948();
   }

   void method2084(class115 var1) {
      var1.method2134(this.field1332, this.field1331, this.field1327, this.field1328);
   }

   static void method2109(int var0, String var1) {
      int var3 = class83.field1172;
      int[] var4 = class83.field1178;
      boolean var5 = false;
      class406 var6 = new class406(var1, class52.field761);

      for(int var7 = 0; var7 < var3; ++var7) {
         class70 var8 = client.field524[var4[var7]];
         if (var8 != null && class20.field140 != var8 && var8.field980 != null && var8.field980.equals(var6)) {
            class229 var9;
            if (var0 == 1) {
               var9 = class149.method2495(class227.field2625, client.field453.field1205);
               var9.field2691.writeByte(0);
               var9.field2691.method6077(var4[var7]);
               client.field453.method1963(var9);
            } else if (var0 == 4) {
               var9 = class149.method2495(class227.field2651, client.field453.field1205);
               var9.field2691.method5984(var4[var7]);
               var9.field2691.method6067(0);
               client.field453.method1963(var9);
            } else if (6 == var0) {
               var9 = class149.method2495(class227.field2570, client.field453.field1205);
               var9.field2691.method6122(var4[var7]);
               var9.field2691.method5976(0);
               client.field453.method1963(var9);
            } else if (7 == var0) {
               var9 = class149.method2495(class227.field2628, client.field453.field1205);
               var9.field2691.method5974(0);
               var9.field2691.method5984(var4[var7]);
               client.field453.method1963(var9);
            }

            var5 = true;
            break;
         }
      }

      if (!var5) {
         class121.method2204(4, "", class270.field3379 + var1);
      }

   }

   static void method2108() {
      if (client.field490 && null != class20.field140) {
         int var1 = class20.field140.field1076[0];
         int var2 = class20.field140.field1077[0];
         if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
            return;
         }

         class11.field66 = class20.field140.field1069;
         int var3 = class123.method2216(class20.field140.field1069, class20.field140.field1059, class285.field3652) - client.field483;
         if (var3 < class271.field3533) {
            class271.field3533 = var3;
         }

         class273.field3553 = class20.field140.field1059;
         client.field490 = false;
      }

   }
}
