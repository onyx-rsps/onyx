public class class79 {
   int field1146;
   int field1147;
   int field1148;
   int field1149;

   class79(int var1, int var2, int var3, int var4) {
      this.field1147 = var1;
      this.field1149 = var2;
      this.field1148 = var3;
      this.field1146 = var4;
   }

   int method1921() {
      return this.field1147;
   }

   int method1908() {
      return this.field1149;
   }

   int method1912() {
      return this.field1148;
   }

   int method1915() {
      return this.field1146;
   }

   static final void method1920(class383 var0, int var1) {
      int var3 = var0.field4181 * -1084587701;
      class82.field1179 = 0;
      class61.method1679(var0);

      for(int var4 = 0; var4 < class82.field1179; ++var4) {
         int var5 = class82.field1180[var4];
         class69 var6 = client.field523[var5];
         int var7 = var0.method6560();
         if ((var7 & 32) != 0) {
            var7 += var0.method6560() << 8;
         }

         class166.method3218(var0, var5, var6, var7);
      }

      if (var0.field4181 * -1084587701 - var3 != var1) {
         throw new RuntimeException(var0.field4181 * -1084587701 - var3 + " " + var1);
      }
   }

   static int method1909(int var0, class58 var1, boolean var2) {
      if (var0 < 1000) {
         return class255.method4797(var0, var1, var2);
      } else if (var0 < 1100) {
         return class292.method5162(var0, var1, var2);
      } else if (var0 < 1200) {
         return class83.method1969(var0, var1, var2);
      } else if (var0 < 1300) {
         return class64.method1717(var0, var1, var2);
      } else if (var0 < 1400) {
         return class360.method6283(var0, var1, var2);
      } else if (var0 < 1500) {
         return class138.method2622(var0, var1, var2);
      } else if (var0 < 1600) {
         return class80.method1926(var0, var1, var2);
      } else if (var0 < 1700) {
         return class6.method38(var0, var1, var2);
      } else if (var0 < 1800) {
         return class267.method4846(var0, var1, var2);
      } else if (var0 < 1900) {
         return class213.method4264(var0, var1, var2);
      } else if (var0 < 2000) {
         return class214.method4268(var0, var1, var2);
      } else if (var0 < 2100) {
         return class292.method5162(var0, var1, var2);
      } else if (var0 < 2200) {
         return class83.method1969(var0, var1, var2);
      } else if (var0 < 2300) {
         return class64.method1717(var0, var1, var2);
      } else if (var0 < 2400) {
         return class360.method6283(var0, var1, var2);
      } else if (var0 < 2500) {
         return class138.method2622(var0, var1, var2);
      } else if (var0 < 2600) {
         return class147.method2772(var0, var1, var2);
      } else if (var0 < 2700) {
         return class272.method4866(var0, var1, var2);
      } else if (var0 < 2800) {
         return class327.method5828(var0, var1, var2);
      } else if (var0 < 2900) {
         return class360.method6282(var0, var1, var2);
      } else if (var0 < 3000) {
         return class214.method4268(var0, var1, var2);
      } else if (var0 < 3200) {
         return class71.method1819(var0, var1, var2);
      } else if (var0 < 3300) {
         return class122.method2439(var0, var1, var2);
      } else if (var0 < 3400) {
         return class12.method124(var0, var1, var2);
      } else if (var0 < 3500) {
         return class246.method4677(var0, var1, var2);
      } else if (var0 < 3600) {
         return class143.method2729(var0, var1, var2);
      } else if (var0 < 3700) {
         return class284.method5070(var0, var1, var2);
      } else if (var0 < 3800) {
         return class7.method52(var0, var1, var2);
      } else if (var0 < 3900) {
         return class98.method2139(var0, var1, var2);
      } else if (var0 < 4000) {
         return class158.method3096(var0, var1, var2);
      } else if (var0 < 4100) {
         return class234.method4390(var0, var1, var2);
      } else if (var0 < 4200) {
         return class119.method2404(var0, var1, var2);
      } else if (var0 < 4300) {
         return class209.method4250(var0, var1, var2);
      } else if (var0 < 5100) {
         return class125.method2482(var0, var1, var2);
      } else if (var0 < 5400) {
         return class47.method1336(var0, var1, var2);
      } else if (var0 < 5600) {
         return class359.method6274(var0, var1, var2);
      } else if (var0 < 5700) {
         return class53.method1588(var0, var1, var2);
      } else if (var0 < 6300) {
         return class156.method3026(var0, var1, var2);
      } else if (var0 < 6600) {
         return class47.method1352(var0, var1, var2);
      } else if (var0 < 6700) {
         return class166.method3205(var0, var1, var2);
      } else if (var0 < 6800) {
         return class110.method2256(var0, var1, var2);
      } else if (var0 < 6900) {
         return class335.method5934(var0, var1, var2);
      } else if (var0 < 7000) {
         return class68.method1743(var0, var1, var2);
      } else if (var0 < 7100) {
         return class132.method2553(var0, var1, var2);
      } else if (var0 < 7200) {
         return class177.method3572(var0, var1, var2);
      } else {
         return var0 < 7300 ? class162.method3156(var0, var1, var2) : 2;
      }
   }

   public static int method1922(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   static boolean method1911() {
      return client.field554 || class10.field45[81];
   }
}
