public final class class214 {
   int field2531;
   int field2532;
   int field2533;
   int field2534;
   int field2536;
   int field2538;
   int field2539;
   int field2540;
   int field2541;
   int field2542;
   int field2543;
   int field2544;
   public class200 field2535;
   public long field2537;

   class214() {
      this.field2537 = 0L;
      this.field2544 = 0;
   }

   public static class227[] method4269() {
      return new class227[]{class227.field2679, class227.field2675, class227.field2678, class227.field2676, class227.field2677, class227.field2680, class227.field2674, class227.field2683, class227.field2681, class227.field2682};
   }

   static int method4268(int var0, class58 var1, boolean var2) {
      class248 var4;
      if (var0 != 1927 && var0 != 2927) {
         int var8;
         if (var0 == 1928) {
            var4 = var2 ? class285.field3659 : class50.field749;
            var8 = class50.field746[--class50.field745];
            if (var8 >= 1 && var8 <= 10) {
               class79 var6 = new class79(var8, var4.field2957, var4.field3030, var4.field3087);
               class50.field754.add(var6);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2928) {
            class50.field745 -= 3;
            int var9 = class50.field746[class50.field745];
            var8 = class50.field746[class50.field745 + 1];
            int var10 = class50.field746[class50.field745 + 2];
            if (var10 >= 1 && var10 <= 10) {
               class79 var7 = new class79(var10, var9, var8, class86.method2063(var9).field3087);
               class50.field754.add(var7);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (class50.field742 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var4 = class86.method2063(class50.field746[--class50.field745]);
         } else {
            var4 = var2 ? class285.field3659 : class50.field749;
         }

         if (var4.field3071 == null) {
            return 0;
         } else {
            class67 var5 = new class67();
            var5.field960 = var4;
            var5.field954 = var4.field3071;
            var5.field961 = class50.field742 + 1;
            client.field610.method5187(var5);
            return 1;
         }
      }
   }
}
