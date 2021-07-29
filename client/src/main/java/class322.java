public class class322 extends class348 {
   static class124 field3845;
   public class406 field3844;
   public int field3847;
   public short field3846;

   class322(class406 var1, int var2) {
      this.field3847 = (int)(class87.method1989() / 1000L);
      this.field3844 = var1;
      this.field3846 = (short)var2;
   }

   static final void method5133(String var0, int var1) {
      class229 var3 = class149.method2495(class227.field2588, client.field453.field1205);
      var3.field2691.writeByte(class281.method4532(var0) + 1);
      var3.field2691.method5938(var0);
      var3.field2691.writeByte(var1);
      client.field453.method1963(var3);
   }

   static final void method5132(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = class123.method2216(var0, var1, class285.field3652) - var2;
         var0 -= class65.field934;
         var4 -= class337.field3924;
         var1 -= class358.field4012;
         int var5 = class198.field2266[class117.field1398];
         int var6 = class198.field2273[class117.field1398];
         int var7 = class198.field2266[class118.field1400];
         int var8 = class198.field2273[class118.field1400];
         int var9 = var7 * var1 + var0 * var8 >> 16;
         var1 = var8 * var1 - var7 * var0 >> 16;
         var0 = var9;
         var9 = var4 * var6 - var1 * var5 >> 16;
         var1 = var4 * var5 + var6 * var1 >> 16;
         if (var1 >= 50) {
            client.field506 = client.field595 * var0 / var1 + client.field671 / 2;
            client.field507 = client.field595 * var9 / var1 + client.field672 / 2;
         } else {
            client.field506 = -1;
            client.field507 = -1;
         }

      } else {
         client.field506 = -1;
         client.field507 = -1;
      }
   }
}
