import java.io.IOException;

public class class138 extends class348 {
   static class222 field1521;
   static class274 field1520;
   static class276 field1524;
   public int field1522;

   static {
      field1521 = new class222(64);
   }

   class138() {
      this.field1522 = 0;
   }

   void method2627(Buffer var1, int var2) {
      if (var2 == 2) {
         this.field1522 = var1.method6655();
      }

   }

   void method2619(Buffer var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2627(var1, var3);
      }
   }

   public static byte[] method2629() {
      byte[] var1 = new byte[24];

      try {
         class130.field1470.method6378(0L);
         class130.field1470.method6380(var1);

         int var2;
         for(var2 = 0; var2 < 24 && var1[var2] == 0; ++var2) {
         }

         if (var2 >= 24) {
            throw new IOException();
         }
      } catch (Exception var5) {
         for(int var3 = 0; var3 < 24; ++var3) {
            var1[var3] = -1;
         }
      }

      return var1;
   }

   public static void method2628(String var0, boolean var1, boolean var2) {
      class41.method846(var0, var1, "openjs", var2);
   }

   static int method2622(int var0, class58 var1, boolean var2) {
      class248 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class86.method2063(class50.field746[--class50.field745]);
      } else {
         var4 = var2 ? class285.field3659 : class50.field749;
      }

      String var5 = class50.field737[--class1.field3];
      int[] var6 = null;
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
         int var7 = class50.field746[--class50.field745];
         if (var7 > 0) {
            for(var6 = new int[var7]; var7-- > 0; var6[var7] = class50.field746[--class50.field745]) {
            }
         }

         var5 = var5.substring(0, var5.length() - 1);
      }

      Object[] var9 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var9.length - 1; var8 >= 1; --var8) {
         if (var5.charAt(var8 - 1) == 's') {
            var9[var8] = class50.field737[--class1.field3];
         } else {
            var9[var8] = new Integer(class50.field746[--class50.field745]);
         }
      }

      var8 = class50.field746[--class50.field745];
      if (var8 != -1) {
         var9[0] = new Integer(var8);
      } else {
         var9 = null;
      }

      if (var0 == 1400) {
         var4.field3045 = var9;
      } else if (var0 == 1401) {
         var4.field3048 = var9;
      } else if (var0 == 1402) {
         var4.field2954 = var9;
      } else if (var0 == 1403) {
         var4.field3049 = var9;
      } else if (var0 == 1404) {
         var4.field3051 = var9;
      } else if (var0 == 1405) {
         var4.field2994 = var9;
      } else if (var0 == 1406) {
         var4.field3055 = var9;
      } else if (var0 == 1407) {
         var4.field3056 = var9;
         var4.field3057 = var6;
      } else if (var0 == 1408) {
         var4.field3016 = var9;
      } else if (var0 == 1409) {
         var4.field3054 = var9;
      } else if (var0 == 1410) {
         var4.field3080 = var9;
      } else if (var0 == 1411) {
         var4.field3046 = var9;
      } else if (var0 == 1412) {
         var4.field3050 = var9;
      } else if (var0 == 1414) {
         var4.field3082 = var9;
         var4.field3059 = var6;
      } else if (var0 == 1415) {
         var4.field2995 = var9;
         var4.field3061 = var6;
      } else if (var0 == 1416) {
         var4.field2973 = var9;
      } else if (var0 == 1417) {
         var4.field3064 = var9;
      } else if (var0 == 1418) {
         var4.field3065 = var9;
      } else if (var0 == 1419) {
         var4.field3066 = var9;
      } else if (var0 == 1420) {
         var4.field3069 = var9;
      } else if (var0 == 1421) {
         var4.field3058 = var9;
      } else if (var0 == 1422) {
         var4.field3073 = var9;
      } else if (var0 == 1423) {
         var4.field3007 = var9;
      } else if (var0 == 1424) {
         var4.field3075 = var9;
      } else if (var0 == 1425) {
         var4.field2981 = var9;
      } else if (var0 == 1426) {
         var4.field3078 = var9;
      } else if (var0 == 1427) {
         var4.field3071 = var9;
      } else if (var0 == 1428) {
         var4.field3074 = var9;
      } else if (var0 == 1429) {
         var4.field3072 = var9;
      } else if (var0 == 1430) {
         var4.field3067 = var9;
      } else {
         if (var0 != 1431) {
            return 2;
         }

         var4.field3068 = var9;
      }

      var4.field3043 = true;
      return 1;
   }
}
