public class class198 extends class353 {
   static class274 field2276;
   int field2274;
   int field2277;
   int[] field2273;
   int[][] field2275;

   class198(int var1, byte[] var2) {
      this.field2277 = var1;
      Buffer var3 = new Buffer(var2);
      this.field2274 = var3.method6560();
      this.field2273 = new int[this.field2274];
      this.field2275 = new int[this.field2274][];

      int var4;
      for(var4 = 0; var4 < this.field2274; ++var4) {
         this.field2273[var4] = var3.method6560();
      }

      for(var4 = 0; var4 < this.field2274; ++var4) {
         this.field2275[var4] = new int[var3.method6560()];
      }

      for(var4 = 0; var4 < this.field2274; ++var4) {
         for(int var5 = 0; var5 < this.field2275[var4].length; ++var5) {
            this.field2275[var4][var5] = var3.method6560();
         }
      }

   }

   public static int method3900(int var0) {
      return class45.method880(class207.field2484[var0]);
   }

   public static int method3899(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
