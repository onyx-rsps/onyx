public class class327 extends class323 {
   static int field3863;
   static int field3869;
   public int field3864;
   public int field3865;
   public int field3868;

   class327() {
      this.field3864 = -1;
   }

   public boolean method5827() {
      return this.field3864 > 0;
   }

   public int method5819() {
      return this.field3864;
   }

   void method5826(int var1, int var2) {
      this.field3864 = var1;
      this.field3868 = var2 * 723168297;
   }

   static int method5828(int var0, class58 var1, boolean var2) {
      class248 var4;
      if (var0 == 2700) {
         var4 = class86.method2063(class50.field746[--class50.field745]);
         class50.field746[++class50.field745 - 1] = var4.field3087;
         return 1;
      } else if (var0 == 2701) {
         var4 = class86.method2063(class50.field746[--class50.field745]);
         if (var4.field3087 != -1) {
            class50.field746[++class50.field745 - 1] = var4.field3088;
         } else {
            class50.field746[++class50.field745 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var6 = class50.field746[--class50.field745];
         class66 var5 = (class66)client.field568.method6327((long)var6);
         if (var5 != null) {
            class50.field746[++class50.field745 - 1] = 1;
         } else {
            class50.field746[++class50.field745 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2706) {
         class50.field746[++class50.field745 - 1] = client.field567;
         return 1;
      } else {
         return 2;
      }
   }
}
