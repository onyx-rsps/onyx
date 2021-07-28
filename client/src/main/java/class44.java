public class class44 extends class348 {
   static class396[] field385;
   class328 field376;
   class328 field381;
   class405 field380;
   int field377;
   int field378;
   int field388;
   String field379;
   String field384;
   String field387;

   class44(int var1, String var2, String var3, String var4) {
      this.field381 = class328.field3873;
      this.field376 = class328.field3873;
      this.method853(var1, var2, var3, var4);
   }

   void method854() {
      this.field376 = class12.field79.field712.method5754(this.field380) ? class328.field3871 : class328.field3872;
   }

   void method856() {
      this.field381 = class12.field79.field711.method5754(this.field380) ? class328.field3871 : class328.field3872;
   }

   void method853(int var1, String var2, String var3, String var4) {
      this.field377 = class303.method5478();
      this.field388 = client.field451;
      this.field378 = var1;
      this.field379 = var2;
      this.method860();
      this.field384 = var3;
      this.field387 = var4;
      this.method861();
      this.method857();
   }

   final void method860() {
      if (this.field379 != null) {
         this.field380 = new class405(class52.method1580(this.field379), class51.field760);
      } else {
         this.field380 = null;
      }

   }

   void method861() {
      this.field381 = class328.field3873;
   }

   void method857() {
      this.field376 = class328.field3873;
   }

   final boolean method877() {
      if (this.field381 == class328.field3873) {
         this.method856();
      }

      return this.field381 == class328.field3871;
   }

   final boolean method870() {
      if (this.field376 == class328.field3873) {
         this.method854();
      }

      return this.field376 == class328.field3871;
   }

   static final void method878(class71 var0) {
      if (var0.field1067 == client.field451 || var0.field1052 == -1 || var0.field1055 != 0 || var0.field1054 + 1 > class47.method1355(var0.field1052).field1864[var0.field1053]) {
         int var2 = var0.field1067 - var0.field1073;
         int var3 = client.field451 - var0.field1073;
         int var4 = var0.field1062 * 128 + var0.field1023 * 64;
         int var5 = var0.field1064 * 128 + var0.field1023 * 64;
         int var6 = var0.field1063 * 128 + var0.field1023 * 64;
         int var7 = var0.field1065 * 128 + var0.field1023 * 64;
         var0.field1068 = (var6 * var3 + var4 * (var2 - var3)) / var2;
         var0.field1058 = (var3 * var7 + var5 * (var2 - var3)) / var2;
      }

      var0.field1078 = 0;
      var0.field1042 = var0.field1050;
      var0.field1021 = var0.field1042;
   }

   static void method879(String var0) {
      class149.field1660 = var0;

      try {
         String var2 = class58.field873.getParameter(Integer.toString(18));
         String var3 = class58.field873.getParameter(Integer.toString(13));
         String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
         if (var0.length() == 0) {
            var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var4 = var4 + "; Expires=" + class64.method1724(class86.currentTime() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         class14.method147(class58.field873, "document.cookie=\"" + var4 + "\"");
      } catch (Throwable var5) {
      }

   }

   static boolean method865() {
      return (client.field426 & 8) != 0;
   }
}
