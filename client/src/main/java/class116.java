public class class116 extends class119 {
   static int field1397;
   byte field1395;
   int field1391;
   int field1394;
   String field1393;
   // $FF: synthetic field
   final class120 this$0;

   class116(class120 var1) {
      this.this$0 = var1;
      this.field1394 = -1;
   }

   void vmethod2487(class123 var1) {
      class105 var3 = (class105)var1.field1435.get(this.field1394);
      var3.field1305 = this.field1395;
      var3.field1301 = this.field1391;
      var3.field1302 = new class405(this.field1393);
   }

   void vmethod2490(Buffer var1) {
      var1.method6560();
      this.field1394 = var1.method6655();
      this.field1395 = var1.method6561();
      this.field1391 = var1.method6655();
      var1.method6566();
      this.field1393 = var1.method6569();
      var1.method6560();
   }

   static class58 method2372(int var0, int var1) {
      class58 var3 = (class58)class58.field861.method4306((long)(var0 << 16));
      if (var3 != null) {
         return var3;
      } else {
         String var4 = String.valueOf(var0);
         int var5 = class45.field390.method4936(var4);
         if (var5 == -1) {
            return null;
         } else {
            byte[] var6 = class45.field390.method4927(var5);
            if (var6 != null) {
               if (var6.length <= 1) {
                  return null;
               }

               var3 = class210.method4251(var6);
               if (var3 != null) {
                  class58.field861.method4308(var3, (long)(var0 << 16));
                  return var3;
               }
            }

            return null;
         }
      }
   }
}
