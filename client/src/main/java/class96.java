public class class96 extends class324 {
   public static int field1258;
   public static int field1263;
   static int field1265;
   static int[] field1262;
   final boolean field1260;

   public class96(boolean var1) {
      this.field1260 = var1;
   }

   int method2136(class327 var1, class327 var2) {
      if (var1.field3864 != 0 && var2.field3864 != 0) {
         return this.field1260 ? var1.method5711().method7144(var2.method5711()) : var2.method5711().method7144(var1.method5711());
      } else {
         return this.method5724(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2136((class327)var1, (class327)var2);
   }

   public static class147 method2133(int var0) {
      class147 var2 = (class147)class147.field1617.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class147.field1636.method4920(9, var0);
         var2 = new class147();
         var2.field1626 = var0;
         if (var3 != null) {
            var2.method2757(new class384(var3));
         }

         var2.method2754();
         class147.field1617.method4308(var2, (long)var0);
         return var2;
      }
   }
}
