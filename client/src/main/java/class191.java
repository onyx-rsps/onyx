public final class class191 {
   static class274 field2138;
   static class274 field2148;
   static int field2147;
   class200 field2136;
   class200 field2139;
   class200 field2141;
   int field2137;
   int field2140;
   int field2143;
   int field2144;
   long field2142;

   class191() {
   }

   public static int method3717(int var0) {
      int var2 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var0 + var2;
   }

   static final int method3718() {
      if (class37.field307.field1112) {
         return class284.field3651;
      } else {
         int var1 = class122.method2438(class64.field933, class357.field4011, class284.field3651);
         return var1 - class336.field3923 < 800 && (class61.field900[class284.field3651][class64.field933 >> 7][class357.field4011 >> 7] & 4) != 0 ? class284.field3651 : 3;
      }
   }
}
