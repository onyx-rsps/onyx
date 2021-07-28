public class class68 implements Runnable {
   public static int field970;
   static class265 field975;
   static class319 field971;
   static int field976;
   boolean field965;
   int field966;
   int[] field967;
   int[] field968;
   Object field974;
   long[] field969;

   class68() {
      this.field965 = true;
      this.field974 = new Object();
      this.field966 = 0;
      this.field967 = new int[500];
      this.field968 = new int[500];
      this.field969 = new long[500];
   }

   public void run() {
      for(; this.field965; class209.method4249(50L)) {
         synchronized(this.field974) {
            if (this.field966 < 500) {
               this.field967[this.field966] = class19.field141;
               this.field968[this.field966] = class19.field144;
               this.field969[this.field966] = class19.field143;
               ++this.field966;
            }
         }
      }

   }

   static int method1743(int var0, class58 var1, boolean var2) {
      if (var0 == 6900) {
         class50.field737[++class1.field3 - 1] = "";
         return 1;
      } else if (var0 == 6950) {
         class50.field746[++class50.field745 - 1] = -1;
         return 1;
      } else {
         return 2;
      }
   }
}
