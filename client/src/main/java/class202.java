public class class202 extends class348 {
   class195[] field2353;

   class202(class276 var1, class276 var2, int var3, boolean var4) {
      class295 var5 = new class295();
      int var6 = var1.method4946(var3);
      this.field2353 = new class195[var6];
      int[] var7 = var1.method4989(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method4920(var3, var7[var8]);
         class198 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(class198 var12 = (class198)var5.method5202(); var12 != null; var12 = (class198)var5.method5193()) {
            if (var11 == var12.field2277) {
               var10 = var12;
               break;
            }
         }

         if (var10 == null) {
            byte[] var13;
            if (var4) {
               var13 = var2.method4928(0, var11);
            } else {
               var13 = var2.method4928(var11, 0);
            }

            var10 = new class198(var11, var13);
            var5.method5187(var10);
         }

         this.field2353[var7[var8]] = new class195(var9, var10);
      }

   }

   public boolean method4100(int var1) {
      return this.field2353[var1].field2221;
   }

   static boolean method4101(long var0) {
      return class266.method4838(var0) == 2;
   }

   static void method4096(int var0) {
      class64 var2 = (class64)class64.field934.method6327((long)var0);
      if (var2 != null) {
         var2.method6014();
      }
   }
}
