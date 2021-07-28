public class class163 {
   static class276 field1913;
   static int[][][] field1914;

   static class397[] method3158() {
      class397[] var1 = new class397[class398.field4281];

      for(int var2 = 0; var2 < class398.field4281; ++var2) {
         class397 var3 = var1[var2] = new class397();
         var3.field4273 = class398.field4280;
         var3.field4274 = class398.field4285;
         var3.field4271 = class398.field4283[var2];
         var3.field4276 = class398.field4284[var2];
         var3.field4269 = class105.field1307[var2];
         var3.field4270 = class374.field4155[var2];
         int var4 = var3.field4270 * var3.field4269;
         byte[] var5 = class398.field4282[var2];
         var3.field4279 = new int[var4];

         for(int var6 = 0; var6 < var4; ++var6) {
            var3.field4279[var6] = class118.field1406[var5[var6] & 255];
         }
      }

      class398.field4283 = null;
      class398.field4284 = null;
      class105.field1307 = null;
      class374.field4155 = null;
      class118.field1406 = null;
      class398.field4282 = null;
      return var1;
   }
}
