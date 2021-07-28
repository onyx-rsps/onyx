public final class class56 extends class200 {
   boolean field842;
   class158 field853;
   double field831;
   double field832;
   double field840;
   double field844;
   double field846;
   double field848;
   double field849;
   double field850;
   int field833;
   int field834;
   int field835;
   int field836;
   int field837;
   int field838;
   int field839;
   int field841;
   int field843;
   int field845;
   int field847;
   int field851;
   int field852;
   int field854;
   int field855;

   class56(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field842 = false;
      this.field854 = 0;
      this.field834 = 0;
      this.field835 = var1;
      this.field836 = var2;
      this.field833 = var3;
      this.field837 = var4;
      this.field847 = var5;
      this.field838 = var6;
      this.field843 = var7;
      this.field839 = var8;
      this.field841 = var9;
      this.field855 = var10;
      this.field845 = var11;
      this.field842 = false;
      int var12 = class24.method463(this.field835).field1663;
      if (var12 != -1) {
         this.field853 = class47.method1355(var12);
      } else {
         this.field853 = null;
      }

   }

   protected final class206 vmethod4091() {
      class149 var2 = class24.method463(this.field835);
      class206 var3 = var2.method2791(this.field854);
      if (var3 == null) {
         return null;
      } else {
         var3.method4131(this.field852);
         return var3;
      }
   }

   final void method1627(int var1, int var2, int var3, int var4) {
      double var6;
      if (!this.field842) {
         var6 = (double)(var1 - this.field833);
         double var8 = (double)(var2 - this.field837);
         double var10 = Math.sqrt(var8 * var8 + var6 * var6);
         this.field831 = (double)this.field833 + (double)this.field841 * var6 / var10;
         this.field844 = (double)this.field841 * var8 / var10 + (double)this.field837;
         this.field832 = (double)this.field847;
      }

      var6 = (double)(this.field843 + 1 - var4);
      this.field846 = ((double)var1 - this.field831) / var6;
      this.field840 = ((double)var2 - this.field844) / var6;
      this.field848 = Math.sqrt(this.field846 * this.field846 + this.field840 * this.field840);
      if (!this.field842) {
         this.field849 = -this.field848 * Math.tan(0.02454369D * (double)this.field839);
      }

      this.field850 = 2.0D * ((double)var3 - this.field832 - var6 * this.field849) / (var6 * var6);
   }

   final void method1628(int var1) {
      this.field842 = true;
      this.field831 += this.field846 * (double)var1;
      this.field844 += this.field840 * (double)var1;
      this.field832 += (double)var1 * this.field849 + (double)var1 * 0.5D * this.field850 * (double)var1;
      this.field849 += this.field850 * (double)var1;
      this.field851 = (int)(Math.atan2(this.field846, this.field840) * 325.949D) + 1024 & 2047;
      this.field852 = (int)(Math.atan2(this.field849, this.field848) * 325.949D) & 2047;
      if (this.field853 != null) {
         this.field834 += var1;

         while(true) {
            do {
               do {
                  if (this.field834 <= this.field853.field1864[this.field854]) {
                     return;
                  }

                  this.field834 -= this.field853.field1864[this.field854];
                  ++this.field854;
               } while(this.field854 < this.field853.field1862.length);

               this.field854 -= this.field853.field1861;
            } while(this.field854 >= 0 && this.field854 < this.field853.field1862.length);

            this.field854 = 0;
         }
      }
   }

   public static void method1634(class276 var0) {
      class150.field1682 = var0;
   }

   static final void method1632(byte[] var0, int var1, int var2, int var3, int var4, class159[] var5) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if (var8 + var1 > 0 && var8 + var1 < 103 && var9 + var2 > 0 && var9 + var2 < 103) {
                  int[] var10000 = var5[var7].field1888[var8 + var1];
                  var10000[var9 + var2] &= -16777217;
               }
            }
         }
      }

      class384 var11 = new class384(var0);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               class125.method2484(var11, var8, var9 + var1, var10 + var2, var3, var4, 0);
            }
         }
      }

   }
}
