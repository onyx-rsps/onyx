public class class93 extends class324 {
   public static class384 field1247;
   final boolean field1245;

   public class93(boolean var1) {
      this.field1245 = var1;
   }

   int method2112(class327 var1, class327 var2) {
      if (client.field404 == var1.field3864 && var2.field3864 == client.field404) {
         return this.field1245 ? var1.method5711().method7144(var2.method5711()) : var2.method5711().method7144(var1.method5711());
      } else {
         return this.method5724(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2112((class327)var1, (class327)var2);
   }

   public static boolean method2117(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
