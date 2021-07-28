public class class249 {
   static class396[] field3106;

   public static boolean method4747(CharSequence var0) {
      return class24.method510(var0, 10, true);
   }

   static int method4748(class383 var0) {
      int var2 = var0.method6505(2);
      int var3;
      if (var2 == 0) {
         var3 = 0;
      } else if (var2 == 1) {
         var3 = var0.method6505(5);
      } else if (var2 == 2) {
         var3 = var0.method6505(8);
      } else {
         var3 = var0.method6505(11);
      }

      return var3;
   }

   static final String method4746(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
      }
   }

   static final void method4749(int var0) {
      class144.method2732();
      switch(var0) {
      case 1:
         class253.method4785();
         break;
      case 2:
         class329.method5838();
      }

   }
}
