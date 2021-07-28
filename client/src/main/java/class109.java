public class class109 extends class119 {
   byte field1333;
   int field1334;
   int field1335;
   String field1332;
   // $FF: synthetic field
   final class120 this$0;

   class109(class120 var1) {
      this.this$0 = var1;
      this.field1334 = -1;
   }

   void vmethod2487(class123 var1) {
      class105 var3 = (class105)var1.field1435.get(this.field1334);
      var3.field1305 = this.field1333;
      var3.field1301 = this.field1335;
      var3.field1302 = new class405(this.field1332);
   }

   void vmethod2490(class384 var1) {
      this.field1334 = var1.method6655();
      this.field1333 = var1.method6561();
      this.field1335 = var1.method6655();
      var1.method6566();
      this.field1332 = var1.method6569();
   }

   static final void method2245(class71 var0) {
      var0.field1022 = false;
      class158 var2;
      if (var0.field1049 != -1) {
         var2 = class47.method1355(var0.field1049);
         if (var2 != null && var2.field1862 != null) {
            ++var0.field1043;
            if (var0.field1041 < var2.field1862.length && var0.field1043 > var2.field1864[var0.field1041]) {
               var0.field1043 = 1;
               ++var0.field1041;
               class152.method2857(var2, var0.field1041, var0.field1068, var0.field1058);
            }

            if (var0.field1041 >= var2.field1862.length) {
               var0.field1043 = 0;
               var0.field1041 = 0;
               class152.method2857(var2, var0.field1041, var0.field1068, var0.field1058);
            }
         } else {
            var0.field1049 = -1;
         }
      }

      if (var0.field1057 != -1 && client.field451 >= var0.field1060) {
         if (var0.field1027 < 0) {
            var0.field1027 = 0;
         }

         int var4 = class24.method463(var0.field1057).field1663;
         if (var4 != -1) {
            class158 var3 = class47.method1355(var4);
            if (var3 != null && var3.field1862 != null) {
               ++var0.field1059;
               if (var0.field1027 < var3.field1862.length && var0.field1059 > var3.field1864[var0.field1027]) {
                  var0.field1059 = 1;
                  ++var0.field1027;
                  class152.method2857(var3, var0.field1027, var0.field1068, var0.field1058);
               }

               if (var0.field1027 >= var3.field1862.length && (var0.field1027 < 0 || var0.field1027 >= var3.field1862.length)) {
                  var0.field1057 = -1;
               }
            } else {
               var0.field1057 = -1;
            }
         } else {
            var0.field1057 = -1;
         }
      }

      if (var0.field1052 != -1 && var0.field1055 <= 1) {
         var2 = class47.method1355(var0.field1052);
         if (var2.field1867 == 1 && var0.field1066 > 0 && var0.field1073 <= client.field451 && var0.field1067 < client.field451) {
            var0.field1055 = 1;
            return;
         }
      }

      if (var0.field1052 != -1 && var0.field1055 == 0) {
         var2 = class47.method1355(var0.field1052);
         if (var2 != null && var2.field1862 != null) {
            ++var0.field1054;
            if (var0.field1053 < var2.field1862.length && var0.field1054 > var2.field1864[var0.field1053]) {
               var0.field1054 = 1;
               ++var0.field1053;
               class152.method2857(var2, var0.field1053, var0.field1068, var0.field1058);
            }

            if (var0.field1053 >= var2.field1862.length) {
               var0.field1053 -= var2.field1861;
               ++var0.field1056;
               if (var0.field1056 >= var2.field1872) {
                  var0.field1052 = -1;
               } else if (var0.field1053 >= 0 && var0.field1053 < var2.field1862.length) {
                  class152.method2857(var2, var0.field1053, var0.field1068, var0.field1058);
               } else {
                  var0.field1052 = -1;
               }
            }

            var0.field1022 = var2.field1868;
         } else {
            var0.field1052 = -1;
         }
      }

      if (var0.field1055 > 0) {
         --var0.field1055;
      }

   }
}
