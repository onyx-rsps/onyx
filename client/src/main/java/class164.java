public class class164 {
   public static final class164 field1916;
   public static final class164 field1917;
   public static final class164 field1921;
   final int field1918;
   final int field1919;
   final int field1920;

   static {
      field1916 = new class164(0, 0, 4);
      field1921 = new class164(1, 1, 2);
      field1917 = new class164(2, 2, 0);
   }

   class164(int var1, int var2, int var3) {
      this.field1918 = var1;
      this.field1919 = var2;
      this.field1920 = var3;
   }

   boolean method3160(float var1) {
      return var1 >= (float)this.field1920;
   }

   static class164[] method3166() {
      return new class164[]{field1917, field1921, field1916};
   }

   static class164 method3161(int var0) {
      class164[] var2 = method3166();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class164 var4 = var2[var3];
         if (var0 == var4.field1919) {
            return var4;
         }
      }

      return null;
   }

   static void method3159(int var0) {
      client.field624 = 0L;
      if (var0 >= 2) {
         client.field612 = true;
      } else {
         client.field612 = false;
      }

      if (class237.method4568() == 1) {
         class58.field873.method301(765, 503);
      } else {
         class58.field873.method301(7680, 2160);
      }

      if (client.field412 >= 25) {
         class228 var2 = class148.method2788(class226.field2571, client.field452.field1204);
         var2.field2690.writeByte(class237.method4568());
         var2.field2690.method6734(class68.field970);
         var2.field2690.method6734(client.field686);
         client.field452.method2031(var2);
      }

   }
}
