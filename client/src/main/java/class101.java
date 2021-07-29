public class class101 extends class103 {
   String field1283;
   long field1284;
   // $FF: synthetic field
   final class106 this$0;

   class101(class106 var1) {
      this.this$0 = var1;
      this.field1284 = -1L;
      this.field1283 = null;
   }

   void vmethod2499(class114 var1) {
      var1.method2294(this.field1284, this.field1283, 0);
   }

   void vmethod2494(Buffer var1) {
      if (var1.method6560() != 255) {
         var1.field4181 -= 99;
         this.field1284 = var1.method6566();
      }

      this.field1283 = var1.method6568();
   }

   public static void method2161(class250 var0) {
      class251.field3116 = var0;
   }

   public static class153 method2170(int var0) {
      class153 var2 = (class153)class153.field1703.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class153.field1702.method4920(34, var0);
         var2 = new class153();
         if (var3 != null) {
            var2.method2863(new Buffer(var3));
         }

         var2.method2862();
         class153.field1703.method4308(var2, (long)var0);
         return var2;
      }
   }
}
