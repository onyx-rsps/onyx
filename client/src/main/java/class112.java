public class class112 extends class103 {
   String field1352;
   // $FF: synthetic field
   final class106 this$0;

   class112(class106 var1) {
      this.this$0 = var1;
   }

   void vmethod2499(class114 var1) {
      var1.field1367 = this.field1352;
   }

   void vmethod2494(class384 var1) {
      this.field1352 = var1.method6569();
      var1.method6784();
   }

   static void method2275(int var0) {
      if (var0 != -1) {
         if (class250.method4757(var0)) {
            class248[] var2 = class248.field3038[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               class248 var4 = var2[var3];
               if (var4.field3044 != null) {
                  class67 var5 = new class67();
                  var5.field960 = var4;
                  var5.field954 = var4.field3044;
                  class78.method1905(var5, 5000000, 0);
               }
            }

         }
      }
   }

   static class47 method2276() {
      return class47.field693 < class47.field691 ? class15.field85[++class47.field693 - 1] : null;
   }
}
