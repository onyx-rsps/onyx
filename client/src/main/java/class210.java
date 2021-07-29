public class class210 {
   class210() {
   }

   static class58 method4251(byte[] var0) {
      class58 var2 = new class58();
      Buffer var3 = new Buffer(var0);
      var3.field4181 = (var3.payload.length - 2) * 99;
      int var4 = var3.method6655();
      int var5 = var3.payload.length - 2 - var4 - 12;
      var3.field4181 = var5 * 99;
      int var6 = var3.method6784();
      var2.field863 = var3.method6655();
      var2.field867 = var3.method6655();
      var2.field868 = var3.method6655();
      var2.field866 = var3.method6655();
      int var7 = var3.method6560();
      int var8;
      int var9;
      if (var7 > 0) {
         var2.field870 = var2.method1647(var7);

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var3.method6655();
            class362 var10 = new class362(var9 > 0 ? class26.method530(var9) : 1);
            var2.field870[var8] = var10;

            while(var9-- > 0) {
               int var11 = var3.method6784();
               int var12 = var3.method6784();
               var10.method6308(new class352(var12), (long)var11);
            }
         }
      }

      var3.field4181 = 0;
      var2.field862 = var3.method6568();
      var2.field864 = new int[var6];
      var2.field869 = new int[var6];
      var2.field865 = new String[var6];

      for(var8 = 0; var3.field4181 * -1084587701 < var5; var2.field864[var8++] = var9) {
         var9 = var3.method6655();
         if (var9 == 3) {
            var2.field865[var8] = var3.method6569();
         } else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
            var2.field869[var8] = var3.method6784();
         } else {
            var2.field869[var8] = var3.method6560();
         }
      }

      return var2;
   }
}
