public class class95 extends class324 {
   static class396 field1256;
   static String[] field1253;
   final boolean field1255;

   public class95(boolean var1) {
      this.field1255 = var1;
   }

   int method2128(class327 var1, class327 var2) {
      if (var2.field3865 != var1.field3865) {
         return this.field1255 ? var1.field3865 - var2.field3865 : var2.field3865 - var1.field3865;
      } else {
         return this.method5724(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2128((class327)var1, (class327)var2);
   }

   static final void method2132(double var0) {
      class197.method3824(var0);
      ((class204)class197.field2268).method4114(var0);
      class156.field1836.method4309();
      class37.field307.field1117 = var0;
      class134.method2603();
   }
}
