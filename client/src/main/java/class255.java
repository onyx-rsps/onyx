public class class255 {
   protected static boolean field3127;

   static int method4797(int var0, class58 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 100) {
         class50.field745 -= 3;
         var4 = class50.field746[class50.field745];
         var5 = class50.field746[class50.field745 + 1];
         int var6 = class50.field746[class50.field745 + 2];
         if (var5 == 0) {
            throw new RuntimeException();
         } else {
            class248 var7 = class86.method2063(var4);
            if (var7.field3060 == null) {
               var7.field3060 = new class248[var6 + 1];
            }

            if (var7.field3060.length <= var6) {
               class248[] var8 = new class248[var6 + 1];

               for(int var9 = 0; var9 < var7.field3060.length; ++var9) {
                  var8[var9] = var7.field3060[var9];
               }

               var7.field3060 = var8;
            }

            if (var6 > 0 && var7.field3060[var6 - 1] == null) {
               throw new RuntimeException("" + (var6 - 1));
            } else {
               class248 var13 = new class248();
               var13.field2976 = var5;
               var13.field3000 = var13.field2957 = var7.field2957;
               var13.field3030 = var6;
               var13.field2992 = true;
               var7.field3060[var6] = var13;
               if (var2) {
                  class285.field3659 = var13;
               } else {
                  class50.field749 = var13;
               }

               class80.method1934(var7);
               return 1;
            }
         }
      } else {
         class248 var10;
         if (var0 == 101) {
            var10 = var2 ? class285.field3659 : class50.field749;
            class248 var11 = class86.method2063(var10.field2957);
            var11.field3060[var10.field3030] = null;
            class80.method1934(var11);
            return 1;
         } else if (var0 == 102) {
            var10 = class86.method2063(class50.field746[--class50.field745]);
            var10.field3060 = null;
            class80.method1934(var10);
            return 1;
         } else if (var0 == 103) {
            class50.field745 -= 3;
            return 1;
         } else if (var0 == 104) {
            --class50.field745;
            return 1;
         } else if (var0 != 200) {
            if (var0 == 201) {
               var10 = class86.method2063(class50.field746[--class50.field745]);
               if (var10 != null) {
                  class50.field746[++class50.field745 - 1] = 1;
                  if (var2) {
                     class285.field3659 = var10;
                  } else {
                     class50.field749 = var10;
                  }
               } else {
                  class50.field746[++class50.field745 - 1] = 0;
               }

               return 1;
            } else if (var0 == 202) {
               class50.field746[class50.field745 + 1] = 0;
               return 1;
            } else if (var0 == 203) {
               class50.field746[--class50.field745 + 1] = 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class248 var12 = class49.method1437(var4, var5);
            if (var12 != null && var5 != -1) {
               class50.field746[++class50.field745 - 1] = 1;
               if (var2) {
                  class285.field3659 = var12;
               } else {
                  class50.field749 = var12;
               }
            } else {
               class50.field746[++class50.field745 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
