public class class161 {
   static int field1896;
   static int[] field1901;
   static int[] field1904;
   static int[][] field1898;
   static int[][] field1899;

   static {
      field1898 = new int[128][128];
      field1899 = new int[128][128];
      field1901 = new int[4096];
      field1904 = new int[4096];
   }

   static final void method3143(class66 var0, boolean var1) {
      int var3 = var0.field949;
      int var4 = (int)var0.field3965;
      var0.method6014();
      if (var1) {
         class4.method20(var3);
      }

      class47.method1357(var3);
      class248 var5 = class86.method2063(var4);
      if (var5 != null) {
         class80.method1934(var5);
      }

      for(int var6 = 0; var6 < client.field544 * -286331153; ++var6) {
         if (class26.method524(client.field547[var6])) {
            if (var6 < client.field544 * -286331153 - 1) {
               for(int var7 = var6; var7 < client.field544 * -286331153 - 1; ++var7) {
                  client.field484[var7] = client.field484[var7 + 1];
                  client.field550[var7] = client.field550[var7 + 1];
                  client.field547[var7] = client.field547[var7 + 1];
                  client.field548[var7] = client.field548[var7 + 1];
                  client.field677[var7] = client.field677[var7 + 1];
                  client.field546[var7] = client.field546[var7 + 1];
                  client.field673[var7] = client.field673[var7 + 1];
               }
            }

            --var6;
            client.field544 -= 15;
         }
      }

      class57.method1643();
      if (client.field567 != -1) {
         class162.method3145(client.field567, 1);
      }

   }

   static final void method3142() {
      int var1 = class107.field1323 * 128 + 64;
      int var2 = class154.field1713 * 128 + 64;
      int var3 = class122.method2438(var1, var2, class284.field3651) - class6.field14;
      if (class64.field933 < var1) {
         class64.field933 = (var1 - class64.field933) * class216.field2545 / 1000 + class64.field933 + class96.field1265;
         if (class64.field933 > var1) {
            class64.field933 = var1;
         }
      }

      if (class64.field933 > var1) {
         class64.field933 -= class216.field2545 * (class64.field933 - var1) / 1000 + class96.field1265;
         if (class64.field933 < var1) {
            class64.field933 = var1;
         }
      }

      if (class336.field3923 < var3) {
         class336.field3923 = (var3 - class336.field3923) * class216.field2545 / 1000 + class336.field3923 + class96.field1265;
         if (class336.field3923 > var3) {
            class336.field3923 = var3;
         }
      }

      if (class336.field3923 > var3) {
         class336.field3923 -= class216.field2545 * (class336.field3923 - var3) / 1000 + class96.field1265;
         if (class336.field3923 < var3) {
            class336.field3923 = var3;
         }
      }

      if (class357.field4011 < var2) {
         class357.field4011 = (var2 - class357.field4011) * class216.field2545 / 1000 + class357.field4011 + class96.field1265;
         if (class357.field4011 > var2) {
            class357.field4011 = var2;
         }
      }

      if (class357.field4011 > var2) {
         class357.field4011 -= class216.field2545 * (class357.field4011 - var2) / 1000 + class96.field1265;
         if (class357.field4011 < var2) {
            class357.field4011 = var2;
         }
      }

      var1 = class376.field4165 * 128 + 64;
      var2 = class191.field2147 * 128 + 64;
      var3 = class122.method2438(var1, var2, class284.field3651) - class329.field3874;
      int var4 = var1 - class64.field933;
      int var5 = var3 - class336.field3923;
      int var6 = var2 - class357.field4011;
      int var7 = (int)Math.sqrt((double)(var6 * var6 + var4 * var4));
      int var8 = (int)(Math.atan2((double)var5, (double)var7) * 325.949D) & 2047;
      int var9 = (int)(Math.atan2((double)var4, (double)var6) * -325.949D) & 2047;
      if (var8 < 128) {
         var8 = 128;
      }

      if (var8 > 383) {
         var8 = 383;
      }

      if (class116.field1397 < var8) {
         class116.field1397 = (var8 - class116.field1397) * class269.field3397 / 1000 + class116.field1397 + class142.field1577;
         if (class116.field1397 > var8) {
            class116.field1397 = var8;
         }
      }

      if (class116.field1397 > var8) {
         class116.field1397 -= class269.field3397 * (class116.field1397 - var8) / 1000 + class142.field1577;
         if (class116.field1397 < var8) {
            class116.field1397 = var8;
         }
      }

      int var10 = var9 - class117.field1399;
      if (var10 > 1024) {
         var10 -= 2048;
      }

      if (var10 < -1024) {
         var10 += 2048;
      }

      if (var10 > 0) {
         class117.field1399 = var10 * class269.field3397 / 1000 + class117.field1399 + class142.field1577;
         class117.field1399 &= 2047;
      }

      if (var10 < 0) {
         class117.field1399 -= -var10 * class269.field3397 / 1000 + class142.field1577;
         class117.field1399 &= 2047;
      }

      int var11 = var9 - class117.field1399;
      if (var11 > 1024) {
         var11 -= 2048;
      }

      if (var11 < -1024) {
         var11 += 2048;
      }

      if (var11 < 0 && var10 > 0 || var11 > 0 && var10 < 0) {
         class117.field1399 = var9;
      }

   }

   static final void method3141() {
      for(class70 var1 = (class70)client.field536.method5202(); var1 != null; var1 = (class70)client.field536.method5193()) {
         if (var1.field1018 == -1) {
            var1.field1007 = 0;
            class84.method2026(var1);
         } else {
            var1.method6014();
         }
      }

   }
}
