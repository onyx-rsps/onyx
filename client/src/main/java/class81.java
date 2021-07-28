public final class class81 extends class200 {
   static class20 field1162;
   static int field1164;
   int field1163;
   int field1166;

   class81() {
   }

   protected final class206 vmethod4091() {
      return class10.method105(this.field1166).method3014(this.field1163);
   }

   static int method1939(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var4;
   }
}
