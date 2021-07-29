public class class117 extends class103 {
   static int field1399;
   int field1401;
   // $FF: synthetic field
   final class106 this$0;

   class117(class106 var1) {
      this.this$0 = var1;
      this.field1401 = -1;
   }

   void vmethod2499(class114 var1) {
      var1.method2298(this.field1401);
   }

   void vmethod2494(Buffer var1) {
      this.field1401 = var1.method6655();
   }

   public static class396 method2382(class276 var0, String var1, String var2) {
      int var4 = var0.method4936(var1);
      int var5 = var0.method4938(var4, var2);
      class396 var6;
      if (!class290.method5130(var0, var4, var5)) {
         var6 = null;
      } else {
         class396 var8 = new class396();
         var8.field4266 = class398.field4280;
         var8.field4267 = class398.field4285;
         var8.field4264 = class398.field4283[0];
         var8.field4265 = class398.field4284[0];
         var8.field4262 = class105.field1307[0];
         var8.field4263 = class374.field4155[0];
         var8.field4260 = class118.field1406;
         var8.field4261 = class398.field4282[0];
         class398.field4283 = null;
         class398.field4284 = null;
         class105.field1307 = null;
         class374.field4155 = null;
         class118.field1406 = null;
         class398.field4282 = null;
         var6 = var8;
      }

      return var6;
   }
}
