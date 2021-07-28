public class class165 extends class185 {
   static class199 field1924;
   class180 field1927;
   int field1926;
   int field1928;
   int field1930;
   final class168 field1925;
   final int field1929;

   class165(class244 var1, class244 var2, int var3, class168 var4) {
      super(var1, var2);
      this.field1929 = var3;
      this.field1925 = var4;
      this.method3170();
   }

   class180 vmethod3613() {
      return this.field1927;
   }

   public int vmethod3612() {
      return this.field1926;
   }

   void method3170() {
      this.field1926 = class123.method2465(this.field1929).method2931().field1762;
      this.field1927 = this.field1925.method3319(class72.method1825(this.field1926));
      class140 var2 = class72.method1825(this.vmethod3612());
      class397 var3 = var2.method2651(false);
      if (var3 != null) {
         this.field1928 = var3.field4269;
         this.field1930 = var3.field4270;
      } else {
         this.field1928 = 0;
         this.field1930 = 0;
      }

   }

   int vmethod3631() {
      return this.field1928;
   }

   int vmethod3615() {
      return this.field1930;
   }

   public static synchronized void method3192(byte[] var0) {
      if (var0.length == 100 && class309.field3767 < 1000) {
         class309.field3770[++class309.field3767 - 1] = var0;
      } else if (var0.length == 5000 && class309.field3772 < 250) {
         class309.field3771[++class309.field3772 - 1] = var0;
      } else if (var0.length == 30000 && class309.field3768 < 50) {
         class309.field3769[++class309.field3768 - 1] = var0;
      } else {
         if (class309.field3774 != null) {
            for(int var2 = 0; var2 < class309.field3773.length; ++var2) {
               if (var0.length == class309.field3773[var2] && class127.field1459[var2] < class309.field3774[var2].length) {
                  class309.field3774[var2][class127.field1459[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }

   public static int method3194(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + var0.charAt(var4);
      }

      return var3;
   }

   static final void method3189(int var0, int var1, int var2, int var3) {
      for(int var5 = var1; var5 <= var3 + var1; ++var5) {
         for(int var6 = var0; var6 <= var0 + var2; ++var6) {
            if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               class250.field3113[0][var6][var5] = 127;
               if (var0 == var6 && var6 > 0) {
                  class61.field910[0][var6][var5] = class61.field910[0][var6 - 1][var5];
               }

               if (var0 + var2 == var6 && var6 < 103) {
                  class61.field910[0][var6][var5] = class61.field910[0][var6 + 1][var5];
               }

               if (var5 == var1 && var5 > 0) {
                  class61.field910[0][var6][var5] = class61.field910[0][var6][var5 - 1];
               }

               if (var5 == var3 + var1 && var5 < 103) {
                  class61.field910[0][var6][var5] = class61.field910[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   static void method3179() {
      if (client.field562) {
         class248 var1 = class49.method1437(class24.field184, client.field563);
         if (var1 != null && var1.field3055 != null) {
            class67 var2 = new class67();
            var2.field960 = var1;
            var2.field954 = var1.field3055;
            class94.method2123(var2);
         }

         client.field564 = -1;
         client.field562 = false;
         class80.method1934(var1);
      }
   }
}
