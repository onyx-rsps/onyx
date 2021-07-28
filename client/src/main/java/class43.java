public class class43 {
   static class339 field371;
   static int field372;
   static int[] field375;
   static int[][] field369;
   class58 field367;
   int field365;
   int[] field373;
   String[] field368;

   class43() {
      this.field365 = -1;
   }

   public static int method852(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if (var8 == 0) {
               if (var9 == '-') {
                  var4 = true;
                  continue;
               }

               if (var9 == '+') {
                  continue;
               }
            }

            int var11;
            if (var9 >= '0' && var9 <= '9') {
               var11 = var9 - 48;
            } else if (var9 >= 'A' && var9 <= 'Z') {
               var11 = var9 - 55;
            } else {
               if (var9 < 'a' || var9 > 'z') {
                  throw new NumberFormatException();
               }

               var11 = var9 - 87;
            }

            if (var11 >= var1) {
               throw new NumberFormatException();
            }

            if (var4) {
               var11 = -var11;
            }

            int var10 = var6 * var1 + var11;
            if (var10 / var1 != var6) {
               throw new NumberFormatException();
            }

            var6 = var10;
            var5 = true;
         }

         if (!var5) {
            throw new NumberFormatException();
         } else {
            return var6;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static String method850(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   public static void method851() {
      class140.field1540.method4309();
   }

   static final void method849(class383 var0) {
      var0.method6504();
      int var2 = client.field664;
      class69 var3 = class19.field139 = client.field523[var2] = new class69();
      var3.field999 = var2;
      int var4 = var0.method6505(30);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      var3.field1075[0] = var6 - class280.field3624;
      var3.field1068 = (var3.field1075[0] << 7) + (var3.method1759() << 6);
      var3.field1076[0] = var7 - class77.field1133;
      var3.field1058 = (var3.field1076[0] << 7) + (var3.method1759() << 6);
      class284.field3651 = var3.field998 = var5;
      if (class82.field1167[var2] != null) {
         var3.method1749(class82.field1167[var2]);
      }

      class82.field1171 = 0;
      class82.field1177[++class82.field1171 - 1] = var2;
      class82.field1174[var2] = 0;
      class82.field1173 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if (var8 != var2) {
            int var9 = var0.method6505(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            class82.field1176[var8] = (var11 << 14) + var12 + (var10 << 28);
            class82.field1175[var8] = 0;
            class82.field1178[var8] = -1;
            class82.field1169[++class82.field1173 - 1] = var8;
            class82.field1174[var8] = 0;
         }
      }

      var0.method6525();
   }
}
