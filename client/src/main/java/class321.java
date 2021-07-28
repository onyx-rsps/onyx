public class class321 extends class347 {
   static class123 field3844;
   public class405 field3843;
   public int field3846;
   public short field3845;

   class321(class405 var1, int var2) {
      this.field3846 = (int)(class86.currentTime() / 1000L);
      this.field3843 = var1;
      this.field3845 = (short)var2;
   }

   static final void method5677(String var0, int var1) {
      class228 var3 = class148.method2788(class226.field2587, client.field452.field1204);
      var3.field2690.writeByte(class280.method5040(var0) + 1);
      var3.field2690.method6550(var0);
      var3.field2690.writeByte(var1);
      client.field452.method2031(var3);
   }

   static final void method5676(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = class122.method2438(var0, var1, class284.field3651) - var2;
         var0 -= class64.field933;
         var4 -= class336.field3923;
         var1 -= class357.field4011;
         int var5 = class197.field2265[class116.field1397];
         int var6 = class197.field2272[class116.field1397];
         int var7 = class197.field2265[class117.field1399];
         int var8 = class197.field2272[class117.field1399];
         int var9 = var7 * var1 + var0 * var8 >> 16;
         var1 = var8 * var1 - var0 * var7 >> 16;
         var0 = var9;
         var9 = var4 * var6 - var5 * var1 >> 16;
         var1 = var4 * var5 + var6 * var1 >> 16;
         if (var1 >= 50) {
            client.field505 = (var0 * client.field594 / var1 + client.field670 / 2) * -286331153;
            client.field506 = client.field671 / 2 + var9 * client.field594 / var1;
         } else {
            client.field505 = -1 * -286331153;
            client.field506 = -1;
         }

      } else {
         client.field505 = -1 * -286331153;
         client.field506 = -1;
      }
   }
}
