import java.util.HashMap;
import java.util.Map;

public class class84 {
   protected static class136 field1198;
   static class329 js5Socket;
   static int field1199;
   static final class300 field1194;
   static final class362 field1193;
   static final Map field1195;

   static {
      field1195 = new HashMap();
      field1193 = new class362(1024);
      field1194 = new class300();
      field1199 = 0;
   }

   public static class271[] method2027() {
      return new class271[]{class271.field3544, class271.field3543, class271.field3548, class271.field3539, class271.field3540, class271.field3541, class271.field3538};
   }

   static int method2004(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   static final void method2026(class70 var0) {
      long var2 = 0L;
      int var4 = -1;
      int var5 = 0;
      int var6 = 0;
      if (var0.field1008 == 0) {
         var2 = class165.field1924.method3927(var0.field1017, var0.field1015, var0.field1010);
      }

      if (var0.field1008 == 1) {
         var2 = class165.field1924.method3928(var0.field1017, var0.field1015, var0.field1010);
      }

      if (var0.field1008 == 2) {
         var2 = class165.field1924.method3929(var0.field1017, var0.field1015, var0.field1010);
      }

      if (var0.field1008 == 3) {
         var2 = class165.field1924.method4032(var0.field1017, var0.field1015, var0.field1010);
      }

      if (0L != var2) {
         int var7 = class165.field1924.method3931(var0.field1017, var0.field1015, var0.field1010, var2);
         var4 = class78.method1904(var2);
         var5 = var7 & 31;
         var6 = var7 >> 6 & 3;
      }

      var0.field1011 = var4;
      var0.field1009 = var5;
      var0.field1012 = var6;
   }
}
