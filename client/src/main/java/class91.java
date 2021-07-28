public class class91 extends class324 {
   static class396 field1239;
   final boolean field1237;

   public class91(boolean var1) {
      this.field1237 = var1;
   }

   int method2095(class327 var1, class327 var2) {
      if (var1.field3864 != 0) {
         if (var2.field3864 == 0) {
            return this.field1237 ? -1 : 1;
         }
      } else if (var2.field3864 != 0) {
         return this.field1237 ? 1 : -1;
      }

      return this.method5724(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method2095((class327)var1, (class327)var2);
   }

   static class274 method2103(int var0, boolean var1, boolean var2, boolean var3) {
      class333 var5 = null;
      if (class130.field1476 != null) {
         var5 = new class333(var0, class130.field1476, class319.field3839[var0], 1000000);
      }

      return new class274(var5, class307.field3765, var0, var1, var2, var3);
   }

   static String method2099(String var0, boolean var1) {
      String var3 = var1 ? "https://" : "http://";
      if (client.field406 == 1) {
         var0 = var0 + "-wtrc";
      } else if (client.field406 == 2) {
         var0 = var0 + "-wtqa";
      } else if (client.field406 == 3) {
         var0 = var0 + "-wtwip";
      } else if (client.field406 == 5) {
         var0 = var0 + "-wti";
      } else if (client.field406 == 4) {
         var0 = "local";
      }

      String var4 = "";
      if (class149.field1660 != null) {
         var4 = "/p=" + class149.field1660;
      }

      String var5 = "runescape.com";
      return var3 + var0 + "." + var5 + "/l=" + class283.field3643 + "/a=" + class407.field4313 + var4 + "/";
   }

   public static void method2094(int var0, class276 var1, int var2, int var3, int var4, boolean var5) {
      class234.field2818 = 1;
      class234.field2819 = var1;
      class234.field2821 = var2;
      class96.field1263 = var3;
      class146.field1611 = var4;
      class145.field1597 = var5;
      class123.field1438 = var0;
   }
}
