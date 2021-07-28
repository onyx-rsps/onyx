public abstract class class136 {
   class136() {
   }

   public abstract int vmethod2612(int var1, int var2);

   public abstract void vmethod2605();

   static void method2604(int var0, int var1) {
      long var3 = (long)((var0 << 16) + var1);
      class275 var5 = (class275)class277.field3614.method6327(var3);
      if (var5 != null) {
         class277.field3601.method5175(var5);
      }
   }

   static char method2610(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }

   public static String method2611(CharSequence var0) {
      int var2 = var0.length();
      StringBuilder var3 = new StringBuilder(var2);

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && var5 != '.' && var5 != '-' && var5 != '*' && var5 != '_') {
            if (var5 == ' ') {
               var3.append('+');
            } else {
               byte var6 = class273.method4875(var5);
               var3.append('%');
               int var7 = var6 >> 4 & 15;
               if (var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }

               var7 = var6 & 15;
               if (var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }
            }
         } else {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   public static int[] method2613() {
      int[] var1 = new int[class10.field35];

      for(int var2 = 0; var2 < class10.field35; ++var2) {
         var1[var2] = class10.field53[var2];
      }

      return var1;
   }
}
