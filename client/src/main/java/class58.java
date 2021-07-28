public class class58 extends class348 {
   public static boolean field877;
   static class222 field861;
   static client field873;
   class362[] field870;
   int field863;
   int field866;
   int field867;
   int field868;
   int[] field864;
   int[] field869;
   String field862;
   String[] field865;

   static {
      field861 = new class222(128);
   }

   class58() {
   }

   class362[] method1647(int var1) {
      return new class362[var1];
   }

   public static int method1656(int var0, int var1) {
      int var3;
      for(var3 = 0; var1 > 0; --var1) {
         var3 = var3 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var3;
   }
}
