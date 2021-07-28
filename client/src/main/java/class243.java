public class class243 {
   public static int[] field2910;
   public static int[] field2911;
   public static short[][] field2914;
   static int[] field2916;
   static String field2917;

   static {
      field2916 = new int[32];
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2916[var1] = var0 - 1;
         var0 += var0;
      }

      field2911 = new int[4000];
      field2910 = new int[4000];
   }
}
