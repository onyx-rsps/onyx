public class class389 implements class290 {
   public static final class389 field4231;
   static final class389 field4232;
   static final class389 field4233;
   static final class389 field4234;
   static final class389 field4235;
   static final class389 field4236;
   final int field4237;
   final int field4238;

   static {
      field4231 = new class389(4, 0);
      field4232 = new class389(5, 2);
      field4233 = new class389(0, 5);
      field4234 = new class389(2, 6);
      field4235 = new class389(1, 7);
      field4236 = new class389(3, 8);
   }

   class389(int var1, int var2) {
      this.field4237 = var1;
      this.field4238 = var2;
   }

   public int method4619() {
      return this.field4238;
   }

   static final void method6228(int var0, int var1, boolean var2) {
      if (client.field638[var0] != null) {
         if (var1 >= 0 && var1 < client.field638[var0].method2230()) {
            class106 var4 = (class106)client.field638[var0].field1436.get(var1);
            class86 var5 = client.field453;
            class229 var6 = class149.method2495(class227.field2665, var5.field1205);
            var6.field2691.writeByte(4 + class281.method4532(var4.field1303.method6521()));
            var6.field2691.writeByte(var0);
            var6.field2691.method6122(var1);
            var6.field2691.method5937(var2);
            var6.field2691.method5938(var4.field1303.method6521());
            var5.method1963(var6);
         }
      }
   }
}
