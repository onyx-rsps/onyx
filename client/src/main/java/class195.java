public class class195 {
   static int[] field2212;
   static int[] field2213;
   static int[] field2214;
   static int[] field2220;
   boolean field2221;
   class198 field2215;
   int field2211;
   int[] field2216;
   int[] field2217;
   int[] field2218;
   int[] field2219;

   static {
      field2220 = new int[500];
      field2212 = new int[500];
      field2213 = new int[500];
      field2214 = new int[500];
   }

   class195(byte[] var1, class198 var2) {
      this.field2215 = null;
      this.field2211 = -1;
      this.field2221 = false;
      this.field2215 = var2;
      class384 var3 = new class384(var1);
      class384 var4 = new class384(var1);
      var3.field4181 = 2 * 99;
      int var5 = var3.method6560();
      int var6 = -1;
      int var7 = 0;
      var4.field4181 = (var5 + var3.field4181 * -1084587701) * 99;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.method6560();
         if (var9 > 0) {
            if (this.field2215.field2273[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.field2215.field2273[var10] == 0) {
                     field2220[var7] = var10;
                     field2212[var7] = 0;
                     field2213[var7] = 0;
                     field2214[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field2220[var7] = var8;
            short var11 = 0;
            if (this.field2215.field2273[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               field2212[var7] = var4.method6573();
            } else {
               field2212[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               field2213[var7] = var4.method6573();
            } else {
               field2213[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               field2214[var7] = var4.method6573();
            } else {
               field2214[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.field2215.field2273[var8] == 5) {
               this.field2221 = true;
            }
         }
      }

      if (var1.length != var4.field4181 * -1084587701) {
         throw new RuntimeException();
      } else {
         this.field2211 = var7;
         this.field2217 = new int[var7];
         this.field2216 = new int[var7];
         this.field2219 = new int[var7];
         this.field2218 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field2217[var8] = field2220[var8];
            this.field2216[var8] = field2212[var8];
            this.field2219[var8] = field2213[var8];
            this.field2218[var8] = field2214[var8];
         }

      }
   }
}
