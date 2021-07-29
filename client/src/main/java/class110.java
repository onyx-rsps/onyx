public class class110 extends class103 {
   boolean field1342;
   byte field1338;
   byte field1339;
   byte field1340;
   byte field1341;
   // $FF: synthetic field
   final class106 this$0;

   class110(class106 var1) {
      this.this$0 = var1;
   }

   void vmethod2499(class114 var1) {
      var1.field1366 = this.field1342;
      var1.field1359 = this.field1339;
      var1.field1368 = this.field1340;
      var1.field1369 = this.field1341;
      var1.field1383 = this.field1338;
   }

   void vmethod2494(Buffer var1) {
      this.field1342 = var1.method6560() == 1;
      this.field1339 = var1.method6561();
      this.field1340 = var1.method6561();
      this.field1341 = var1.method6561();
      this.field1338 = var1.method6561();
   }

   public static void method2250(class276 var0, class276 var1, boolean var2) {
      class155.field1734 = var0;
      class155.field1747 = var1;
      class155.field1741 = var2;
   }

   public static boolean method2254(int var0) {
      return (var0 >> 21 & 1) != 0;
   }

   static int method2256(int var0, class58 var1, boolean var2) {
      if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) {
         if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) {
            if (var0 == 6750) {
               class50.field737[++class1.field3 - 1] = "";
               return 1;
            } else if (var0 != 6751 && var0 != 6752 && var0 != 6753) {
               if (var0 == 6754) {
                  int var4 = class50.field746[--class50.field745];
                  class147 var5 = class96.method2133(var4);
                  class50.field737[++class1.field3 - 1] = var5 != null ? var5.field1619 : "";
                  return 1;
               } else {
                  return 2;
               }
            } else {
               class50.field746[++class50.field745 - 1] = -1;
               return 1;
            }
         } else {
            --class50.field745;
            return 1;
         }
      } else {
         class50.field745 -= 2;
         --class1.field3;
         return 1;
      }
   }
}
