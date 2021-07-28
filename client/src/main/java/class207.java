public class class207 {
   public static boolean field2476;
   public static boolean field2489;
   public static int field2475;
   public static int field2483;
   public static int field2487;
   public static long[] field2484;
   static int field2473;
   static int field2477;
   static int field2478;
   static int field2479;
   static int field2480;
   static int field2481;
   static int field2482;

   static {
      field2489 = false;
      field2487 = 0;
      field2475 = 0;
      field2476 = false;
      field2483 = 0;
      field2484 = new long[1000];
   }

   public static class397 method4246(class276 var0, int var1, int var2) {
      if (!class290.method5130(var0, var1, var2)) {
         return null;
      } else {
         class397 var5 = new class397();
         var5.field4273 = class398.field4280;
         var5.field4274 = class398.field4285;
         var5.field4271 = class398.field4283[0];
         var5.field4276 = class398.field4284[0];
         var5.field4269 = class105.field1307[0];
         var5.field4270 = class374.field4155[0];
         int var6 = var5.field4269 * var5.field4270;
         byte[] var7 = class398.field4282[0];
         var5.field4279 = new int[var6];

         for(int var8 = 0; var8 < var6; ++var8) {
            var5.field4279[var8] = class118.field1406[var7[var8] & 255];
         }

         class398.field4283 = null;
         class398.field4284 = null;
         class105.field1307 = null;
         class374.field4155 = null;
         class118.field1406 = null;
         class398.field4282 = null;
         return var5;
      }
   }

   public static class265[] method4245() {
      return new class265[]{class265.field3203, class265.field3206, class265.field3204, class265.field3205, class265.field3212, class265.field3211};
   }
}
