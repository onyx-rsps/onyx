public class class72 extends class353 {
   int field1080;
   int field1081;
   int field1082;
   int field1083;

   class72(int var1, int var2, int var3, int var4) {
      this.field1080 = var1;
      this.field1081 = var2;
      this.field1082 = var3;
      this.field1083 = var4;
   }

   void method1821(int var1, int var2, int var3, int var4) {
      this.field1080 = var1;
      this.field1081 = var2;
      this.field1082 = var3;
      this.field1083 = var4;
   }

   public static class140 method1825(int var0) {
      return var0 >= 0 && var0 < class140.field1543.length && class140.field1543[var0] != null ? class140.field1543[var0] : new class140(var0);
   }

   public static int method1826(int var0, int var1, int var2) {
      int var4 = class118.method2393(var2 - var1 + 1);
      var4 <<= var1;
      var0 |= var4;
      return var0;
   }
}
