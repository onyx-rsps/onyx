public class class234 {
   public static class235 field2815;
   public static class276 field2814;
   public static class276 field2816;
   public static class276 field2817;
   public static class276 field2819;
   public static int field2818;
   public static int field2821;
   static int[] field2820;
   static String field2822;

   static {
      field2818 = 0;
   }

   static int method4390(int var0, class58 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 4000) {
         class50.field745 -= 2;
         var4 = class50.field746[class50.field745];
         var5 = class50.field746[class50.field745 + 1];
         class50.field746[++class50.field745 - 1] = var5 + var4;
         return 1;
      } else if (var0 == 4001) {
         class50.field745 -= 2;
         var4 = class50.field746[class50.field745];
         var5 = class50.field746[class50.field745 + 1];
         class50.field746[++class50.field745 - 1] = var4 - var5;
         return 1;
      } else if (var0 == 4002) {
         class50.field745 -= 2;
         var4 = class50.field746[class50.field745];
         var5 = class50.field746[class50.field745 + 1];
         class50.field746[++class50.field745 - 1] = var5 * var4;
         return 1;
      } else if (var0 == 4003) {
         class50.field745 -= 2;
         var4 = class50.field746[class50.field745];
         var5 = class50.field746[class50.field745 + 1];
         class50.field746[++class50.field745 - 1] = var4 / var5;
         return 1;
      } else if (var0 == 4004) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = (int)(Math.random() * (double)var4);
         return 1;
      } else if (var0 == 4005) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = (int)(Math.random() * (double)(var4 + 1));
         return 1;
      } else {
         int var6;
         int var7;
         int var8;
         if (var0 == 4006) {
            class50.field745 -= 5;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            var6 = class50.field746[class50.field745 + 2];
            var7 = class50.field746[class50.field745 + 3];
            var8 = class50.field746[class50.field745 + 4];
            class50.field746[++class50.field745 - 1] = var4 + (var8 - var6) * (var5 - var4) / (var7 - var6);
            return 1;
         } else if (var0 == 4007) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = var4 + var4 * var5 / 100;
            return 1;
         } else if (var0 == 4008) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = var4 | 1 << var5;
            return 1;
         } else if (var0 == 4009) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = var4 & -1 - (1 << var5);
            return 1;
         } else if (var0 == 4010) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = (var4 & 1 << var5) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == 4011) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = var4 % var5;
            return 1;
         } else if (var0 == 4012) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            if (var4 == 0) {
               class50.field746[++class50.field745 - 1] = 0;
            } else {
               class50.field746[++class50.field745 - 1] = (int)Math.pow((double)var4, (double)var5);
            }

            return 1;
         } else if (var0 == 4013) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            if (var4 == 0) {
               class50.field746[++class50.field745 - 1] = 0;
               return 1;
            } else {
               switch(var5) {
               case 0:
                  class50.field746[++class50.field745 - 1] = Integer.MAX_VALUE;
                  break;
               case 1:
                  class50.field746[++class50.field745 - 1] = var4;
                  break;
               case 2:
                  class50.field746[++class50.field745 - 1] = (int)Math.sqrt((double)var4);
                  break;
               case 3:
                  class50.field746[++class50.field745 - 1] = (int)Math.cbrt((double)var4);
                  break;
               case 4:
                  class50.field746[++class50.field745 - 1] = (int)Math.sqrt(Math.sqrt((double)var4));
                  break;
               default:
                  class50.field746[++class50.field745 - 1] = (int)Math.pow((double)var4, 1.0D / (double)var5);
               }

               return 1;
            }
         } else if (var0 == 4014) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = var4 & var5;
            return 1;
         } else if (var0 == 4015) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = var4 | var5;
            return 1;
         } else if (var0 == 4018) {
            class50.field745 -= 3;
            long var10 = (long)class50.field746[class50.field745];
            long var12 = (long)class50.field746[class50.field745 + 1];
            long var14 = (long)class50.field746[class50.field745 + 2];
            class50.field746[++class50.field745 - 1] = (int)(var10 * var14 / var12);
            return 1;
         } else if (var0 == 4025) {
            var4 = class124.method2467(class50.field746[--class50.field745]);
            class50.field746[++class50.field745 - 1] = var4;
            return 1;
         } else if (var0 == 4026) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = var4 ^ 1 << var5;
            return 1;
         } else if (var0 == 4027) {
            class50.field745 -= 3;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            var6 = class50.field746[class50.field745 + 2];
            class50.field746[++class50.field745 - 1] = class72.method1826(var4, var5, var6);
            return 1;
         } else if (var0 == 4028) {
            class50.field745 -= 3;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            var6 = class50.field746[class50.field745 + 2];
            class50.field746[++class50.field745 - 1] = class124.method2466(var4, var5, var6);
            return 1;
         } else if (var0 == 4029) {
            class50.field745 -= 3;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            var6 = class50.field746[class50.field745 + 2];
            var7 = 31 - var6;
            class50.field746[++class50.field745 - 1] = var4 << var7 >>> var7 + var5;
            return 1;
         } else if (var0 == 4030) {
            class50.field745 -= 4;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            var6 = class50.field746[class50.field745 + 2];
            var7 = class50.field746[class50.field745 + 3];
            var4 = class124.method2466(var4, var6, var7);
            var8 = class118.method2393(var7 - var6 + 1);
            if (var5 > var8) {
               var5 = var8;
            }

            class50.field746[++class50.field745 - 1] = var4 | var5 << var6;
            return 1;
         } else if (var0 == 4032) {
            class50.field746[class50.field745 - 1] = class80.method1938(class50.field746[class50.field745 - 1]);
            return 1;
         } else if (var0 == 4033) {
            class50.field746[class50.field745 - 1] = class85.method2049(class50.field746[class50.field745 - 1]);
            return 1;
         } else if (var0 == 4034) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            var6 = class245.method4638(var4, var5);
            class50.field746[++class50.field745 - 1] = var6;
            return 1;
         } else if (var0 == 4035) {
            class50.field746[class50.field745 - 1] = Math.abs(class50.field746[class50.field745 - 1]);
            return 1;
         } else {
            return 2;
         }
      }
   }
}
