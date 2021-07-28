import java.awt.FontMetrics;

public class class94 extends class324 {
   protected static String field1248;
   static FontMetrics field1249;
   final boolean field1250;

   public class94(boolean var1) {
      this.field1250 = var1;
   }

   int method2119(class327 var1, class327 var2) {
      if (client.field404 == var1.field3864 && var2.field3864 == client.field404) {
         return this.field1250 ? var1.field3868 * -2065584103 - var2.field3868 * -2065584103 : var2.field3868 * -2065584103 - var1.field3868 * -2065584103;
      } else {
         return this.method5724(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2119((class327)var1, (class327)var2);
   }

   public static void method2123(class67 var0) {
      class78.method1905(var0, 500000, 475000);
   }
}
