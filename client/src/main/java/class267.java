public class class267 {
   public static boolean method4842(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   static final void method4840(int var0, int var1, int var2, int var3, class397 var4, class242 var5) {
      if (var4 != null) {
         int var7 = client.field444 & 2047;
         int var8 = var3 * var3 + var2 * var2;
         if (var8 <= 6400) {
            int var9 = class197.field2265[var7];
            int var10 = class197.field2272[var7];
            int var11 = var10 * var2 + var3 * var9 >> 16;
            int var12 = var3 * var10 - var9 * var2 >> 16;
            if (var8 > 2500) {
               var4.method7015(var11 + var5.field2909 / 2 - var4.field4273 / 2, var5.field2905 / 2 - var12 - var4.field4274 / 2, var0, var1, var5.field2909, var5.field2905, var5.field2907, var5.field2904);
            } else {
               var4.method7024(var0 + var11 + var5.field2909 / 2 - var4.field4273 / 2, var5.field2905 / 2 + var1 - var12 - var4.field4274 / 2);
            }

         }
      }
   }

   static int method4846(int var0, class58 var1, boolean var2) {
      class248 var4 = var2 ? class285.field3659 : class50.field749;
      if (var0 == 1700) {
         class50.field746[++class50.field745 - 1] = var4.field3087;
         return 1;
      } else if (var0 == 1701) {
         if (var4.field3087 != -1) {
            class50.field746[++class50.field745 - 1] = var4.field3088;
         } else {
            class50.field746[++class50.field745 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         class50.field746[++class50.field745 - 1] = var4.field3030;
         return 1;
      } else {
         return 2;
      }
   }

   public static boolean method4844(int var0) {
      return var0 >= 0 && var0 < 112 ? class10.field46[var0] : false;
   }
}
