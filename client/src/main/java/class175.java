import java.awt.Component;

public class class175 implements class289 {
   static final class175 field2038;
   static final class175 field2039;
   static final class175 field2042;
   static final class175 field2044;
   final byte field2041;
   final int field2037;

   static {
      field2038 = new class175(1, (byte)0);
      field2042 = new class175(3, (byte)1);
      field2044 = new class175(2, (byte)2);
      field2039 = new class175(0, (byte)3);
   }

   class175(int var1, byte var2) {
      this.field2037 = var1;
      this.field2041 = var2;
   }

   public int vmethod6962() {
      return this.field2041;
   }

   static class175[] method3527() {
      return new class175[]{field2039, field2044, field2038, field2042};
   }

   static void method3534(Component var0) {
      var0.removeMouseListener(class19.field134);
      var0.removeMouseMotionListener(class19.field134);
      var0.removeFocusListener(class19.field134);
      class19.field142 = 0;
   }

   public static String method3535(Buffer var0) {
      String var2;
      try {
         int var3 = var0.method6574();
         if (var3 > 32767) {
            var3 = 32767;
         }

         byte[] var4 = new byte[var3];
         var0.field4181 = (var0.field4181 * -1084587701 + class251.field3116.method4751(var0.payload, var0.field4181 * -1084587701, var4, 0, var3)) * 99;
         String var5 = class292.method5168(var4, 0, var3);
         var2 = var5;
      } catch (Exception var7) {
         var2 = "Cabbage";
      }

      return var2;
   }

   static final void method3536(class248 var0, int var1, int var2, int var3) {
      if (var0.field2993 == null) {
         throw new RuntimeException();
      } else {
         var0.field2993[var1] = var2;
         var0.field3035[var1] = var3;
      }
   }
}
