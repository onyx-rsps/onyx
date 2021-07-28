public class class92 extends class324 {
   static class276 field1241;
   final boolean field1244;

   public class92(boolean var1) {
      this.field1244 = var1;
   }

   int method2106(class327 var1, class327 var2) {
      if (var2.field3864 != var1.field3864) {
         return this.field1244 ? var1.field3864 - var2.field3864 : var2.field3864 - var1.field3864;
      } else {
         return this.method5724(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2106((class327)var1, (class327)var2);
   }

   static int method2107(int var0, int var1) {
      class64 var3 = (class64)class64.field934.method6327((long)var0);
      if (var3 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var3.field931.length ? var3.field931[var1] : 0;
      }
   }
}
