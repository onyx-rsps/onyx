public class class106 {
   static int field1318;
   class297 field1310;
   int field1309;
   long field1308;

   public class106(class384 var1) {
      this.field1309 = -1;
      this.field1310 = new class297();
      this.method2206(var1);
   }

   void method2206(class384 var1) {
      this.field1308 = var1.method6566();
      this.field1309 = var1.method6784();

      for(int var3 = var1.method6560(); var3 != 0; var3 = var1.method6560()) {
         Object var4;
         if (var3 == 3) {
            var4 = new class125(this);
         } else if (var3 == 1) {
            var4 = new class101(this);
         } else if (var3 == 13) {
            var4 = new class118(this);
         } else if (var3 == 4) {
            var4 = new class110(this);
         } else if (var3 == 6) {
            var4 = new class117(this);
         } else if (var3 == 5) {
            var4 = new class102(this);
         } else if (var3 == 2) {
            var4 = new class107(this);
         } else if (var3 == 7) {
            var4 = new class100(this);
         } else if (var3 == 14) {
            var4 = new class104(this);
         } else if (var3 == 8) {
            var4 = new class121(this);
         } else if (var3 == 9) {
            var4 = new class127(this);
         } else if (var3 == 10) {
            var4 = new class113(this);
         } else if (var3 == 11) {
            var4 = new class108(this);
         } else if (var3 == 12) {
            var4 = new class112(this);
         } else {
            if (var3 != 15) {
               throw new RuntimeException("");
            }

            var4 = new class122(this);
         }

         ((class103)var4).vmethod2494(var1);
         this.field1310.method5236((class353)var4);
      }

   }

   public void method2205(class114 var1) {
      if (this.field1308 == var1.field1370 && this.field1309 == var1.field1363) {
         for(class103 var3 = (class103)this.field1310.method5239(); var3 != null; var3 = (class103)this.field1310.method5241()) {
            var3.vmethod2499(var1);
         }

         ++var1.field1363;
      } else {
         throw new RuntimeException("");
      }
   }

   static final class66 method2207(int var0, int var1, int var2) {
      class66 var4 = new class66();
      var4.field949 = var1;
      var4.field948 = var2;
      client.field568.method6318(var4, (long)var0);
      class311.method5596(var1);
      class248 var5 = class86.method2063(var0);
      class80.method1934(var5);
      if (client.field573 != null) {
         class80.method1934(client.field573);
         client.field573 = null;
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
      class80.method1933(class248.field3038[var0 >> 16], var5, false);
      class112.method2275(var1);
      if (client.field567 != -1) {
         class162.method3145(client.field567, 1);
      }

      return var4;
   }
}
