public class class90 extends class324 {
   final boolean field1235;

   public class90(boolean var1) {
      this.field1235 = var1;
   }

   int method2091(class327 var1, class327 var2) {
      if (var1.field3864 != 0 && var2.field3864 != 0) {
         return this.field1235 ? var1.field3868 * -2065584103 - var2.field3868 * -2065584103 : var2.field3868 * -2065584103 - var1.field3868 * -2065584103;
      } else {
         return this.method5724(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2091((class327)var1, (class327)var2);
   }
}
