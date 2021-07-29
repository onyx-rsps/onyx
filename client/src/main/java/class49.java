public final class class49 extends class353 {
   static class295 field719;
   static class397 field735;
   class155 field732;
   class29 field724;
   class29 field726;
   int field718;
   int field720;
   int field721;
   int field722;
   int field723;
   int field725;
   int field727;
   int field728;
   int field730;
   int field733;
   int[] field729;

   static {
      field719 = new class295();
   }

   class49() {
   }

   void method1429() {
      int var2 = this.field733;
      class155 var3 = this.field732.method2931();
      if (var3 != null) {
         this.field733 = var3.field1765;
         this.field718 = var3.field1779 * 128;
         this.field727 = var3.field1755;
         this.field728 = var3.field1781;
         this.field729 = var3.field1780;
      } else {
         this.field733 = -1;
         this.field718 = 0;
         this.field727 = 0;
         this.field728 = 0;
         this.field729 = null;
      }

      if (var2 != this.field733 && this.field726 != null) {
         class81.field1162.method384(this.field726);
         this.field726 = null;
      }

   }

   static final class362 method1435(Buffer var0, class362 var1) {
      int var3 = var0.method6560();
      int var4;
      if (var1 == null) {
         var4 = class26.method530(var3);
         var1 = new class362(var4);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var0.method6560() == 1;
         int var6 = var0.method6564();
         Object var7;
         if (var5) {
            var7 = new class349(var0.method6569());
         } else {
            var7 = new class352(var0.method6784());
         }

         var1.method6308((class353)var7, (long)var6);
      }

      return var1;
   }

   public static class248 method1437(int var0, int var1) {
      class248 var3 = class86.method2063(var0);
      if (var1 == -1) {
         return var3;
      } else {
         return var3 != null && var3.field3060 != null && var1 < var3.field3060.length ? var3.field3060[var1] : null;
      }
   }
}
