public class class376 implements class289 {
   public static final class376 field4159;
   public static final class376 field4163;
   public static final class376 field4164;
   static class397 field4166;
   static int field4165;
   final int field4161;
   public final class372 field4162;
   public final int field4158;
   public final Class field4160;

   static {
      field4163 = new class376(0, 0, Integer.class, new class373());
      field4159 = new class376(2, 1, Long.class, new class375());
      field4164 = new class376(1, 2, String.class, new class377());
   }

   class376(int var1, int var2, Class var3, class372 var4) {
      this.field4161 = var1;
      this.field4158 = var2;
      this.field4160 = var3;
      this.field4162 = var4;
   }

   public int vmethod6962() {
      return this.field4158;
   }

   public Object method6464(class384 var1) {
      return this.field4162.vmethod6468(var1);
   }

   static final void method6465(String var0) {
      class228 var2 = class148.method2788(class226.field2603, client.field452.field1204);
      var2.field2690.writeByte(class280.method5040(var0));
      var2.field2690.method6550(var0);
      client.field452.method2031(var2);
   }

   static final boolean method6463(class248 var0) {
      int var2 = var0.field2961;
      if (var2 == 205) {
         client.field570 = 250;
         return true;
      } else {
         int var3;
         int var4;
         if (var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            client.field597.method4653(var3, var4 == 1);
         }

         if (var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            client.field597.method4646(var3, var4 == 1);
         }

         if (var2 == 324) {
            client.field597.method4643(false);
         }

         if (var2 == 325) {
            client.field597.method4643(true);
         }

         if (var2 == 326) {
            class228 var5 = class148.method2788(class226.field2657, client.field452.field1204);
            client.field597.method4644(var5.field2690);
            client.field452.method2031(var5);
            return true;
         } else {
            return false;
         }
      }
   }

   static final void method6457(class248 var0, class156 var1, int var2, int var3, boolean var4) {
      String[] var6 = var1.field1809;
      byte var7 = -1;
      String var8 = null;
      if (var6 != null && var6[var3] != null) {
         if (var3 == 0) {
            var7 = 33;
         } else if (var3 == 1) {
            var7 = 34;
         } else if (var3 == 2) {
            var7 = 35;
         } else if (var3 == 3) {
            var7 = 36;
         } else {
            var7 = 37;
         }

         var8 = var6[var3];
      } else if (var3 == 4) {
         var7 = 37;
         var8 = "Drop";
      }

      if (var7 != -1 && var8 != null) {
         class24.method460(var8, class43.method850(16748608) + var1.field1835, var7, var1.field1801, var2, var0.field2957, var4);
      }

   }
}
