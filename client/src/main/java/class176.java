import java.awt.Component;

public class class176 implements class290 {
   static final class176 field2039;
   static final class176 field2040;
   static final class176 field2043;
   static final class176 field2045;
   final byte field2042;
   final int field2038;

   static {
      field2039 = new class176(1, (byte)0);
      field2043 = new class176(3, (byte)1);
      field2045 = new class176(2, (byte)2);
      field2040 = new class176(0, (byte)3);
   }

   static class176[] method3144() {
      return new class176[]{field2040, field2045, field2039, field2043};
   }

   class176(int var1, byte var2) {
      this.field2038 = var1;
      this.field2042 = var2;
   }

   public int method4619() {
      return this.field2042;
   }

   public static String method3147(class385 var0) {
      String var2;
      try {
         int var3 = var0.method5962();
         if (var3 > 32767) {
            var3 = 32767;
         }

         byte[] var4 = new byte[var3];
         var0.field4182 += class252.field3117.method4288(var0.field4184, var0.field4182, var4, 0, var3);
         String var5 = class293.method4653(var4, 0, var3);
         var2 = var5;
      } catch (Exception var6) {
         var2 = "Cabbage";
      }

      return var2;
   }

   static void method3146(Component var0) {
      var0.removeMouseListener(class20.field135);
      var0.removeMouseMotionListener(class20.field135);
      var0.removeFocusListener(class20.field135);
      class20.field143 = 0;
   }

   static final void method3148(class249 var0, int var1, int var2, int var3) {
      if (var0.field2994 == null) {
         throw new RuntimeException();
      } else {
         var0.field2994[var1] = var2;
         var0.field3036[var1] = var3;
      }
   }
}