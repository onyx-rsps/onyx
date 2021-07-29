public final class class203 {
   int field2354;
   int field2355;
   int field2356;
   int field2357;
   int field2358;
   int field2359;
   int field2360;
   int field2361;
   int field2362;
   int field2363;
   int field2364;
   int field2365;
   int field2366;
   int field2367;
   int field2368;
   int field2369;
   int field2370;
   int field2371;

   class203() {
   }

   static void method4102(byte[] var0) {
      Buffer var2 = new Buffer(var0);
      var2.field4181 = (var0.length - 2) * 99;
      class398.field4281 = var2.method6655();
      class398.field4283 = new int[class398.field4281];
      class398.field4284 = new int[class398.field4281];
      class105.field1307 = new int[class398.field4281];
      class374.field4155 = new int[class398.field4281];
      class398.field4282 = new byte[class398.field4281][];
      var2.field4181 = (var0.length - 7 - class398.field4281 * 8) * 99;
      class398.field4280 = var2.method6655();
      class398.field4285 = var2.method6655();
      int var3 = (var2.method6560() & 255) + 1;

      int var4;
      for(var4 = 0; var4 < class398.field4281; ++var4) {
         class398.field4283[var4] = var2.method6655();
      }

      for(var4 = 0; var4 < class398.field4281; ++var4) {
         class398.field4284[var4] = var2.method6655();
      }

      for(var4 = 0; var4 < class398.field4281; ++var4) {
         class105.field1307[var4] = var2.method6655();
      }

      for(var4 = 0; var4 < class398.field4281; ++var4) {
         class374.field4155[var4] = var2.method6655();
      }

      var2.field4181 = (var0.length - 7 - class398.field4281 * 8 - (var3 - 1) * 3) * 99;
      class118.field1406 = new int[var3];

      for(var4 = 1; var4 < var3; ++var4) {
         class118.field1406[var4] = var2.method6564();
         if (class118.field1406[var4] == 0) {
            class118.field1406[var4] = 1;
         }
      }

      var2.field4181 = 0;

      for(var4 = 0; var4 < class398.field4281; ++var4) {
         int var5 = class105.field1307[var4];
         int var6 = class374.field4155[var4];
         int var7 = var6 * var5;
         byte[] var8 = new byte[var7];
         class398.field4282[var4] = var8;
         int var9 = var2.method6560();
         int var10;
         if (var9 == 0) {
            for(var10 = 0; var10 < var7; ++var10) {
               var8[var10] = var2.method6561();
            }
         } else if (var9 == 1) {
            for(var10 = 0; var10 < var5; ++var10) {
               for(int var11 = 0; var11 < var6; ++var11) {
                  var8[var10 + var5 * var11] = var2.method6561();
               }
            }
         }
      }

   }
}
