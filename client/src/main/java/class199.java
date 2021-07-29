public class class199 extends class354 {
   static class275 field2277;
   int field2275;
   int field2278;
   int[] field2274;
   int[][] field2276;

   class199(int var1, byte[] var2) {
      this.field2278 = var1;
      class385 var3 = new class385(var2);
      this.field2275 = var3.method5948();
      this.field2274 = new int[this.field2275];
      this.field2276 = new int[this.field2275][];

      int var4;
      for(var4 = 0; var4 < this.field2275; ++var4) {
         this.field2274[var4] = var3.method5948();
      }

      for(var4 = 0; var4 < this.field2275; ++var4) {
         this.field2276[var4] = new int[var3.method5948()];
      }

      for(var4 = 0; var4 < this.field2275; ++var4) {
         for(int var5 = 0; var5 < this.field2276[var4].length; ++var5) {
            this.field2276[var4][var5] = var3.method5948();
         }
      }

   }

   public static int method3496(int var0) {
      return class46.method800(class208.field2485[var0]);
   }

   public static int method3495(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
