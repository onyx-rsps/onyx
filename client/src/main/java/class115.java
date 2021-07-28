public class class115 extends class119 {
   byte field1390;
   int field1389;
   String field1388;
   // $FF: synthetic field
   final class120 this$0;

   class115(class120 var1) {
      this.this$0 = var1;
      this.field1388 = null;
   }

   void vmethod2487(class123 var1) {
      class105 var3 = new class105();
      var3.field1302 = new class405(this.field1388);
      var3.field1301 = this.field1389;
      var3.field1305 = this.field1390;
      var1.method2451(var3);
   }

   void vmethod2490(class384 var1) {
      if (var1.method6560() != 255) {
         var1.field4181 -= 99;
         var1.method6566();
      }

      this.field1388 = var1.method6568();
      this.field1389 = var1.method6655();
      this.field1390 = var1.method6561();
      var1.method6566();
   }

   static void method2363() {
      client.field544 = 0;
      client.field543 = false;
   }
}
