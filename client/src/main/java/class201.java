public class class201 {
   static class264 field2349;
   int field2346;
   int field2347;
   int field2348;

   class201() {
   }

   static void method4095(class248[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         class248 var7 = var0[var6];
         if (var7 != null && var7.field3000 == var1) {
            class286.method5100(var7, var2, var3, var4);
            class27.method543(var7, var2, var3);
            if (var7.field3053 > var7.field2980 - var7.field2972) {
               var7.field3053 = var7.field2980 - var7.field2972;
            }

            if (var7.field3053 < 0) {
               var7.field3053 = 0;
            }

            if (var7.field2967 > var7.field3090 - var7.field2989) {
               var7.field2967 = var7.field3090 - var7.field2989;
            }

            if (var7.field2967 < 0) {
               var7.field2967 = 0;
            }

            if (var7.field2976 == 0) {
               class80.method1933(var0, var7, var4);
            }
         }
      }

   }
}
