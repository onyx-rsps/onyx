public class class120 {
   public static int field1417;
   static class274 field1416;
   class297 field1410;
   long field1412;
   long field1418;

   public class120(Buffer var1) {
      this.field1412 = -1L;
      this.field1410 = new class297();
      this.method2415(var1);
   }

   void method2415(Buffer var1) {
      this.field1418 = var1.method6566();
      this.field1412 = var1.method6566();

      for(int var3 = var1.method6560(); var3 != 0; var3 = var1.method6560()) {
         Object var4;
         if (var3 == 1) {
            var4 = new class115(this);
         } else if (var3 == 4) {
            var4 = new class126(this);
         } else if (var3 == 3) {
            var4 = new class111(this);
         } else if (var3 == 2) {
            var4 = new class109(this);
         } else {
            if (var3 != 5) {
               throw new RuntimeException("");
            }

            var4 = new class116(this);
         }

         ((class119)var4).vmethod2490(var1);
         this.field1410.method5236((class353)var4);
      }

   }

   public void method2407(class123 var1) {
      if (var1.field3965 == this.field1418 && var1.field1433 == this.field1412) {
         for(class119 var3 = (class119)this.field1410.method5239(); var3 != null; var3 = (class119)this.field1410.method5241()) {
            var3.vmethod2487(var1);
         }

         ++var1.field1433;
      } else {
         throw new RuntimeException("");
      }
   }

   static void method2408(int var0, String var1, String var2) {
      class129.method2531(var0, var1, var2, (String)null);
   }

   public static boolean method2416(int var0) {
      return var0 >= 0 && var0 < 112 ? class10.field38[var0] : false;
   }
}
