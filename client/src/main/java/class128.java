public class class128 extends class136 {
   long field1460;

   public class128() {
      this.field1460 = System.nanoTime();
   }

   public int vmethod2612(int var1, int var2) {
      long var4 = (long)var2 * 1000000L;
      long var6 = this.field1460 - System.nanoTime();
      if (var6 < var4) {
         var6 = var4;
      }

      class209.method4249(var6 / 1000000L);
      long var8 = System.nanoTime();

      int var10;
      for(var10 = 0; var10 < 10 && (var10 < 1 || this.field1460 < var8); this.field1460 += (long)var1 * 1000000L) {
         ++var10;
      }

      if (this.field1460 < var8) {
         this.field1460 = var8;
      }

      return var10;
   }

   public void vmethod2605() {
      this.field1460 = System.nanoTime();
   }
}
