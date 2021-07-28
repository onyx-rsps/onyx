public final class class177 {
   static long field2066;
   int field2062;
   int field2063;
   int field2064;
   int field2065;
   // $FF: synthetic field
   final class169 this$0;

   class177(class169 var1) {
      this.this$0 = var1;
   }

   public static int method3571(int var0, int var1) {
      int var3;
      if (var1 > var0) {
         var3 = var0;
         var0 = var1;
         var1 = var3;
      }

      while(var1 != 0) {
         var3 = var0 % var1;
         var0 = var1;
         var1 = var3;
      }

      return var0;
   }

   static void method3573(int var0) {
      client.field481 = var0;
   }

   static boolean method3570(char var0) {
      for(int var2 = 0; var2 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var2) {
         if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var2)) {
            return true;
         }
      }

      return false;
   }

   static int method3572(int var0, class58 var1, boolean var2) {
      if (var0 == 7100) {
         ++class50.field745;
         return 1;
      } else if (var0 == 7101) {
         class1.field3 += 2;
         return 1;
      } else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
         if (var0 == 7106) {
            ++class50.field745;
            return 1;
         } else if (var0 == 7107) {
            ++class50.field745;
            return 1;
         } else if (var0 == 7108) {
            class50.field746[++class50.field745 - 1] = class292.method5171() ? 1 : 0;
            return 1;
         } else if (var0 == 7110) {
            class50.field746[++class50.field745 - 1] = 0;
            return 1;
         } else if (var0 == 7120) {
            --class50.field745;
            class50.field746[++class50.field745 - 1] = 0;
            return 1;
         } else if (var0 == 7121) {
            class50.field745 -= 2;
            class50.field746[++class50.field745 - 1] = -1;
            return 1;
         } else if (var0 == 7122) {
            class50.field745 -= 2;
            class50.field746[++class50.field745 - 1] = 0;
            return 1;
         } else {
            return 2;
         }
      } else {
         ++class50.field745;
         return 1;
      }
   }
}
