public class class127 extends class103 {
   public static int[] field1459;
   int field1458;
   long field1455;
   // $FF: synthetic field
   final class106 this$0;

   class127(class106 var1) {
      this.this$0 = var1;
   }

   void vmethod2499(class114 var1) {
      var1.method2332(this.field1458, this.field1455);
   }

   void vmethod2494(class384 var1) {
      this.field1458 = var1.method6784();
      this.field1455 = var1.method6566();
   }

   static final boolean method2501(class206 var0, int var1, int var2, int var3) {
      if (!class183.method3586()) {
         return false;
      } else {
         int var5;
         int var6;
         int var7;
         int var8;
         int var11;
         int var12;
         int var13;
         int var16;
         int var17;
         if (!class207.field2476) {
            var5 = class199.field2326;
            var6 = class199.field2305;
            var7 = class199.field2290;
            var8 = class199.field2288;
            byte var9 = 50;
            short var10 = 3500;
            var11 = (class207.field2487 - class197.field2258) * var9 / class197.field2261;
            var12 = (class207.field2475 - class197.field2259) * var9 / class197.field2261;
            var13 = (class207.field2487 - class197.field2258) * var10 / class197.field2261;
            int var14 = (class207.field2475 - class197.field2259) * var10 / class197.field2261;
            int var15 = class197.method3857(var12, var9, var6, var5);
            var16 = class197.method3842(var12, var9, var6, var5);
            var12 = var15;
            var15 = class197.method3857(var14, var10, var6, var5);
            var17 = class197.method3842(var14, var10, var6, var5);
            var14 = var15;
            var15 = class197.method3869(var11, var16, var8, var7);
            var16 = class197.method3840(var11, var16, var8, var7);
            var11 = var15;
            var15 = class197.method3869(var13, var17, var8, var7);
            var17 = class197.method3840(var13, var17, var8, var7);
            class207.field2477 = (var11 + var15) / 2;
            class207.field2478 = (var12 + var14) / 2;
            class280.field3628 = (var16 + var17) / 2;
            class207.field2479 = (var15 - var11) / 2;
            class207.field2480 = (var14 - var12) / 2;
            class207.field2481 = (var17 - var16) / 2;
            class43.field372 = Math.abs(class207.field2479);
            class395.field4259 = Math.abs(class207.field2480);
            class207.field2482 = Math.abs(class207.field2481);
         }

         var5 = var0.field2412 + var1;
         var6 = var2 + var0.field2436;
         var7 = var3 + var0.field2437;
         var8 = var0.field2438;
         var16 = var0.field2406;
         var17 = var0.field2410;
         var11 = class207.field2477 - var5;
         var12 = class207.field2478 - var6;
         var13 = class280.field3628 - var7;
         if (Math.abs(var11) > var8 + class43.field372) {
            return false;
         } else if (Math.abs(var12) > var16 + class395.field4259) {
            return false;
         } else if (Math.abs(var13) > var17 + class207.field2482) {
            return false;
         } else if (Math.abs(var13 * class207.field2480 - var12 * class207.field2481) > var17 * class395.field4259 + var16 * class207.field2482) {
            return false;
         } else if (Math.abs(var11 * class207.field2481 - var13 * class207.field2479) > var17 * class43.field372 + var8 * class207.field2482) {
            return false;
         } else {
            return Math.abs(var12 * class207.field2479 - var11 * class207.field2480) <= var8 * class395.field4259 + var16 * class43.field372;
         }
      }
   }

   static final boolean method2493(int var0, int var1) {
      class155 var3 = class123.method2465(var0);
      if (var1 == 11) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var3.method2924(var1);
   }

   static void method2504(int var0, int var1, int var2) {
      if (class37.field307.field1120 != 0 && var1 != 0 && client.field497 < 50) {
         client.field628[client.field497] = var0;
         client.field650[client.field497] = var1;
         client.field651[client.field497] = var2;
         client.field653[client.field497] = null;
         client.field652[client.field497] = 0;
         ++client.field497;
      }

   }
}
