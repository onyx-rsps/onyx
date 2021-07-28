public class class76 extends class353 {
   class143 field1128;
   class297 field1127;

   class76(class143 var1) {
      this.field1127 = new class297();
      this.field1128 = var1;
   }

   void method1882(int var1, int var2, int var3, int var4) {
      class72 var6 = null;
      int var7 = 0;

      for(class72 var8 = (class72)this.field1127.method5239(); var8 != null; var8 = (class72)this.field1127.method5241()) {
         ++var7;
         if (var8.field1080 == var1) {
            var8.method1821(var1, var2, var3, var4);
            return;
         }

         if (var8.field1080 <= var1) {
            var6 = var8;
         }
      }

      if (var6 == null) {
         if (var7 < 4) {
            this.field1127.method5237(new class72(var1, var2, var3, var4));
         }

      } else {
         class297.method5290(new class72(var1, var2, var3, var4), var6);
         if (var7 >= 4) {
            this.field1127.method5239().method6014();
         }

      }
   }

   class72 method1885(int var1) {
      class72 var3 = (class72)this.field1127.method5239();
      if (var3 != null && var3.field1080 <= var1) {
         for(class72 var4 = (class72)this.field1127.method5241(); var4 != null && var4.field1080 <= var1; var4 = (class72)this.field1127.method5241()) {
            var3.method6014();
            var3 = var4;
         }

         if (this.field1128.field1586 + var3.field1080 + var3.field1083 > var1) {
            return var3;
         } else {
            var3.method6014();
            return null;
         }
      } else {
         return null;
      }
   }

   boolean method1878() {
      return this.field1127.method5300();
   }

   static String method1877(int var0) {
      return "<img=" + var0 + ">";
   }

   static final void method1886(class248[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class248 var4 = var0[var3];
         if (var4 != null) {
            if (var4.field2976 == 0) {
               if (var4.field3060 != null) {
                  method1886(var4.field3060, var1);
               }

               class66 var5 = (class66)client.field568.method6327((long)var4.field2957);
               if (var5 != null) {
                  class162.method3145(var5.field949, var1);
               }
            }

            class67 var6;
            if (var1 == 0 && var4.field3007 != null) {
               var6 = new class67();
               var6.field960 = var4;
               var6.field954 = var4.field3007;
               class94.method2123(var6);
            }

            if (var1 == 1 && var4.field3075 != null) {
               if (var4.field3030 >= 0) {
                  class248 var7 = class86.method2063(var4.field2957);
                  if (var7 == null || var7.field3060 == null || var4.field3030 >= var7.field3060.length || var4 != var7.field3060[var4.field3030]) {
                     continue;
                  }
               }

               var6 = new class67();
               var6.field960 = var4;
               var6.field954 = var4.field3075;
               class94.method2123(var6);
            }
         }
      }

   }
}
