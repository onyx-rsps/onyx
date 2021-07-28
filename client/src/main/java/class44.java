public class class44 {
   static class340 field372;
   static int field373;
   static int[] field376;
   static int[][] field370;
   class59 field368;
   int field366;
   int[] field374;
   String[] field369;

   class44() {
      this.field366 = -1;
   }

   static String method770(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   static final void method769(class384 var0) {
      var0.method5892();
      int var2 = client.field665;
      class70 var3 = class20.field140 = client.field524[var2] = new class70();
      var3.field1000 = var2;
      int var4 = var0.method5893(30);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      var3.field1076[0] = var6 - class281.field3625;
      var3.field1069 = (var3.field1076[0] << 7) + (var3.method1710() << 6);
      var3.field1077[0] = var7 - class78.field1134;
      var3.field1059 = (var3.field1077[0] << 7) + (var3.method1710() << 6);
      class285.field3652 = var3.field999 = var5;
      if (class83.field1168[var2] != null) {
         var3.method1700(class83.field1168[var2]);
      }

      class83.field1172 = 0;
      class83.field1178[++class83.field1172 - 1] = var2;
      class83.field1175[var2] = 0;
      class83.field1174 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if (var8 != var2) {
            int var9 = var0.method5893(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            class83.field1177[var8] = var12 + (var11 << 14) + (var10 << 28);
            class83.field1176[var8] = 0;
            class83.field1179[var8] = -1;
            class83.field1170[++class83.field1174 - 1] = var8;
            class83.field1175[var8] = 0;
         }
      }

      var0.method5913();
   }

   public static int method772(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if (0 == var8) {
               if ('-' == var9) {
                  var4 = true;
                  continue;
               }

               if ('+' == var9 && var2) {
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

            int var10 = var11 + var1 * var6;
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

   public static void method771() {
      class141.field1541.method3883();
   }
}
