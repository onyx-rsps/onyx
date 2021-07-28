public class class268 {
   static {
      int var0 = 0;
      int var1 = 0;
      class263[] var2 = class257.method4814();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class263 var4 = var2[var3];
         if (var4.field3190 > var0) {
            var0 = var4.field3190;
         }

         if (var4.field3192 > var1) {
            var1 = var4.field3192;
         }
      }

   }

   public static void method4847() {
      while(true) {
         class272 var1;
         synchronized(class273.field3557) {
            var1 = (class272)class273.field3555.method5214();
         }

         if (var1 == null) {
            return;
         }

         var1.field3549.method4883(var1.field3551, (int)var1.field3965, var1.field3550, false);
      }
   }
}
