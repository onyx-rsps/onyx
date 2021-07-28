public class class388 implements class289 {
   public static final class388 field4230;
   static final class388 field4231;
   static final class388 field4232;
   static final class388 field4233;
   static final class388 field4234;
   static final class388 field4235;
   final int field4236;
   final int field4237;

   static {
      field4230 = new class388(4, 0);
      field4231 = new class388(5, 2);
      field4232 = new class388(0, 5);
      field4233 = new class388(2, 6);
      field4234 = new class388(1, 7);
      field4235 = new class388(3, 8);
   }

   class388(int var1, int var2) {
      this.field4236 = var1;
      this.field4237 = var2;
   }

   public int vmethod6962() {
      return this.field4237;
   }

   static final void method6845(int var0, int var1, boolean var2) {
      if (client.field637[var0] != null) {
         if (var1 >= 0 && var1 < client.field637[var0].method2452()) {
            class105 var4 = (class105)client.field637[var0].field1435.get(var1);
            class85 var5 = client.field452;
            class228 var6 = class148.method2788(class226.field2664, var5.field1204);
            var6.field2690.writeByte(4 + class280.method5040(var4.field1302.method7141()));
            var6.field2690.writeByte(var0);
            var6.field2690.method6734(var1);
            var6.field2690.method6549(var2);
            var6.field2690.method6550(var4.field1302.method7141());
            var5.method2031(var6);
         }
      }
   }
}
