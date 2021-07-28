public class class26 implements Runnable {
   static class276 field216;
   static class276 field217;
   static int field219;
   volatile class24[] field218;

   class26() {
      this.field218 = new class24[2];
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class24 var2 = this.field218[var1];
            if (var2 != null) {
               var2.method451();
            }
         }
      } catch (Exception var4) {
         class332.method5902((String)null, var4);
      }

   }

   public static int method530(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   static boolean method524(int var0) {
      return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
   }
}
