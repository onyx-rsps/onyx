public class class139 extends class348 {
   public static class222 field1525;
   static class276 field1528;
   public int field1527;

   static {
      field1525 = new class222(64);
   }

   class139() {
      this.field1527 = 0;
   }

   void method2631(class384 var1, int var2) {
      if (var2 == 5) {
         this.field1527 = var1.method6655();
      }

   }

   void method2630(class384 var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2631(var1, var3);
      }
   }

   static final boolean method2646(int var0, int var1, class160 var2, class159 var3) {
      int var5 = var0;
      int var6 = var1;
      byte var7 = 64;
      byte var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      class161.field1898[var7][var8] = 99;
      class161.field1899[var7][var8] = 0;
      byte var11 = 0;
      int var12 = 0;
      class161.field1901[var11] = var0;
      byte var10001 = var11;
      int var19 = var11 + 1;
      class161.field1904[var10001] = var1;
      int[][] var13 = var3.field1888;

      while(var12 != var19) {
         var5 = class161.field1901[var12];
         var6 = class161.field1904[var12];
         var12 = var12 + 1 & 4095;
         int var17 = var5 - var9;
         int var18 = var6 - var10;
         int var14 = var5 - var3.field1884;
         int var15 = var6 - var3.field1887;
         if (var2.vmethod3137(1, var5, var6, var3)) {
            class26.field219 = var5;
            class161.field1896 = var6;
            return true;
         }

         int var16 = class161.field1899[var17][var18] + 1;
         if (var17 > 0 && class161.field1898[var17 - 1][var18] == 0 && (var13[var14 - 1][var15] & 19136776) == 0) {
            class161.field1901[var19] = var5 - 1;
            class161.field1904[var19] = var6;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 - 1][var18] = 2;
            class161.field1899[var17 - 1][var18] = var16;
         }

         if (var17 < 127 && class161.field1898[var17 + 1][var18] == 0 && (var13[var14 + 1][var15] & 19136896) == 0) {
            class161.field1901[var19] = var5 + 1;
            class161.field1904[var19] = var6;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 + 1][var18] = 8;
            class161.field1899[var17 + 1][var18] = var16;
         }

         if (var18 > 0 && class161.field1898[var17][var18 - 1] == 0 && (var13[var14][var15 - 1] & 19136770) == 0) {
            class161.field1901[var19] = var5;
            class161.field1904[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17][var18 - 1] = 1;
            class161.field1899[var17][var18 - 1] = var16;
         }

         if (var18 < 127 && class161.field1898[var17][var18 + 1] == 0 && (var13[var14][var15 + 1] & 19136800) == 0) {
            class161.field1901[var19] = var5;
            class161.field1904[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17][var18 + 1] = 4;
            class161.field1899[var17][var18 + 1] = var16;
         }

         if (var17 > 0 && var18 > 0 && class161.field1898[var17 - 1][var18 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0 && (var13[var14 - 1][var15] & 19136776) == 0 && (var13[var14][var15 - 1] & 19136770) == 0) {
            class161.field1901[var19] = var5 - 1;
            class161.field1904[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 - 1][var18 - 1] = 3;
            class161.field1899[var17 - 1][var18 - 1] = var16;
         }

         if (var17 < 127 && var18 > 0 && class161.field1898[var17 + 1][var18 - 1] == 0 && (var13[var14 + 1][var15 - 1] & 19136899) == 0 && (var13[var14 + 1][var15] & 19136896) == 0 && (var13[var14][var15 - 1] & 19136770) == 0) {
            class161.field1901[var19] = var5 + 1;
            class161.field1904[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 + 1][var18 - 1] = 9;
            class161.field1899[var17 + 1][var18 - 1] = var16;
         }

         if (var17 > 0 && var18 < 127 && class161.field1898[var17 - 1][var18 + 1] == 0 && (var13[var14 - 1][var15 + 1] & 19136824) == 0 && (var13[var14 - 1][var15] & 19136776) == 0 && (var13[var14][var15 + 1] & 19136800) == 0) {
            class161.field1901[var19] = var5 - 1;
            class161.field1904[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 - 1][var18 + 1] = 6;
            class161.field1899[var17 - 1][var18 + 1] = var16;
         }

         if (var17 < 127 && var18 < 127 && class161.field1898[var17 + 1][var18 + 1] == 0 && (var13[var14 + 1][var15 + 1] & 19136992) == 0 && (var13[var14 + 1][var15] & 19136896) == 0 && (var13[var14][var15 + 1] & 19136800) == 0) {
            class161.field1901[var19] = var5 + 1;
            class161.field1904[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 + 1][var18 + 1] = 12;
            class161.field1899[var17 + 1][var18 + 1] = var16;
         }
      }

      class26.field219 = var5;
      class161.field1896 = var6;
      return false;
   }

   static void method2644() {
      class168.field1961.method4281();
   }

   static void method2645(int var0, int var1, int var2, int var3) {
      class64 var5 = (class64)class64.field934.method6327((long)var0);
      if (var5 == null) {
         var5 = new class64();
         class64.field934.method6318(var5, (long)var0);
      }

      if (var5.field930.length <= var1) {
         int[] var6 = new int[var1 + 1];
         int[] var7 = new int[var1 + 1];

         int var8;
         for(var8 = 0; var8 < var5.field930.length; ++var8) {
            var6[var8] = var5.field930[var8];
            var7[var8] = var5.field931[var8];
         }

         for(var8 = var5.field930.length; var8 < var1; ++var8) {
            var6[var8] = -1;
            var7[var8] = 0;
         }

         var5.field930 = var6;
         var5.field931 = var7;
      }

      var5.field930[var1] = var2;
      var5.field931[var1] = var3;
   }
}
