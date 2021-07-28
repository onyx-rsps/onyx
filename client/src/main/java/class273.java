public class class273 implements Runnable {
   static class295 field3555;
   static class295 field3557;
   static int field3556;
   static Object field3558;
   static Thread field3559;

   static {
      field3557 = new class295();
      field3555 = new class295();
      field3556 = 0;
      field3558 = new Object();
   }

   class273() {
   }

   public void run() {
      try {
         while(true) {
            class272 var1;
            synchronized(field3557) {
               var1 = (class272)field3557.method5202();
            }

            if (var1 != null) {
               if (var1.field3554 == 0) {
                  var1.field3551.method5922((int)var1.field3965, var1.field3550, var1.field3550.length);
                  synchronized(field3557) {
                     var1.method6014();
                  }
               } else if (var1.field3554 == 1) {
                  var1.field3550 = var1.field3551.method5918((int)var1.field3965);
                  synchronized(field3557) {
                     field3555.method5187(var1);
                  }
               }

               synchronized(field3558) {
                  if (field3556 <= 1) {
                     field3556 = 0;
                     field3558.notifyAll();
                     return;
                  }

                  field3556 = 600;
               }
            } else {
               class209.method4249(100L);
               synchronized(field3558) {
                  if (field3556 <= 1) {
                     field3556 = 0;
                     field3558.notifyAll();
                     return;
                  }

                  --field3556;
               }
            }
         }
      } catch (Exception var13) {
         class332.method5902((String)null, var13);
      }
   }

   public static byte method4875(char var0) {
      byte var2;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var2 = -128;
         } else if (var0 == 8218) {
            var2 = -126;
         } else if (var0 == 402) {
            var2 = -125;
         } else if (var0 == 8222) {
            var2 = -124;
         } else if (var0 == 8230) {
            var2 = -123;
         } else if (var0 == 8224) {
            var2 = -122;
         } else if (var0 == 8225) {
            var2 = -121;
         } else if (var0 == 710) {
            var2 = -120;
         } else if (var0 == 8240) {
            var2 = -119;
         } else if (var0 == 352) {
            var2 = -118;
         } else if (var0 == 8249) {
            var2 = -117;
         } else if (var0 == 338) {
            var2 = -116;
         } else if (var0 == 381) {
            var2 = -114;
         } else if (var0 == 8216) {
            var2 = -111;
         } else if (var0 == 8217) {
            var2 = -110;
         } else if (var0 == 8220) {
            var2 = -109;
         } else if (var0 == 8221) {
            var2 = -108;
         } else if (var0 == 8226) {
            var2 = -107;
         } else if (var0 == 8211) {
            var2 = -106;
         } else if (var0 == 8212) {
            var2 = -105;
         } else if (var0 == 732) {
            var2 = -104;
         } else if (var0 == 8482) {
            var2 = -103;
         } else if (var0 == 353) {
            var2 = -102;
         } else if (var0 == 8250) {
            var2 = -101;
         } else if (var0 == 339) {
            var2 = -100;
         } else if (var0 == 382) {
            var2 = -98;
         } else if (var0 == 376) {
            var2 = -97;
         } else {
            var2 = 63;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }
}
