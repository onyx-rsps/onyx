public class class89 extends class324 {
   static boolean field1231;
   final boolean field1233;

   public class89(boolean var1) {
      this.field1233 = var1;
   }

   int method2083(class327 var1, class327 var2) {
      if (client.field404 == var1.field3864) {
         if (var2.field3864 != client.field404) {
            return this.field1233 ? -1 : 1;
         }
      } else if (var2.field3864 == client.field404) {
         return this.field1233 ? 1 : -1;
      }

      return this.method5724(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method2083((class327)var1, (class327)var2);
   }

   static final int method2089() {
      return class207.field2475;
   }
}
