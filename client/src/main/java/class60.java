public class class60 {
   static byte[][][] field894;
   static class396[] field896;
   class44[] field897;
   int field893;

   class60() {
      this.field897 = new class44[100];
   }

   class44 method1665(int var1, String var2, String var3, String var4) {
      class44 var6 = this.field897[99];

      for(int var7 = this.field893; var7 > 0; --var7) {
         if (var7 != 100) {
            this.field897[var7] = this.field897[var7 - 1];
         }
      }

      if (var6 == null) {
         var6 = new class44(var1, var2, var4, var3);
      } else {
         var6.method6014();
         var6.method6012();
         var6.method853(var1, var2, var4, var3);
      }

      this.field897[0] = var6;
      if (this.field893 < 100) {
         ++this.field893;
      }

      return var6;
   }

   class44 method1662(int var1) {
      return var1 >= 0 && var1 < this.field893 ? this.field897[var1] : null;
   }

   int method1660() {
      return this.field893;
   }

   public static class397[] method1667(class276 var0, String var1, String var2) {
      int var4 = var0.method4936(var1);
      int var5 = var0.method4938(var4, var2);
      return class71.method1816(var0, var4, var5);
   }

   static final void method1666() {
      if (class89.field1231) {
         if (class68.field971 != null) {
            class68.field971.method5741();
         }

         class152.method2842();
         class89.field1231 = false;
      }

   }
}
