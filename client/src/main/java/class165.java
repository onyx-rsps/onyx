public class class165 {
   public static final class165 field1917;
   public static final class165 field1918;
   public static final class165 field1922;
   final int field1919;
   final int field1920;
   final int field1921;

   static {
      field1917 = new class165(0, 0, 4);
      field1922 = new class165(1, 1, 2);
      field1918 = new class165(2, 2, 0);
   }

   static class165[] method2871() {
      return new class165[]{field1918, field1922, field1917};
   }

   class165(int var1, int var2, int var3) {
      this.field1919 = var1;
      this.field1920 = var2;
      this.field1921 = var3;
   }

   boolean method2865(float var1) {
      return var1 >= (float)this.field1921;
   }

   static class165 method2866(int var0) {
      class165[] var2 = method2871();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class165 var4 = var2[var3];
         if (var0 == var4.field1920) {
            return var4;
         }
      }

      return null;
   }

   static void method2864(int var0) {
      client.field625 = 0L;
      if (var0 >= 2) {
         client.field613 = true;
      } else {
         client.field613 = false;
      }

      if (class238.method4117() == 1) {
         class59.field874.method258(765, 503);
      } else {
         class59.field874.method258(7680, 2160);
      }

      if (client.field413 >= 25) {
         class229 var2 = class149.method2495(class227.field2572, client.field453.field1205);
         var2.field2691.method5931(class238.method4117());
         var2.field2691.method6122(class69.field971);
         var2.field2691.method6122(client.field687);
         client.field453.method1963(var2);
      }

   }
}
