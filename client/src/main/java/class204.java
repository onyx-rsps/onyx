public class class204 implements class212 {
   class194[] field2377;
   class276 field2380;
   class295 field2375;
   double field2378;
   int field2374;
   int field2376;
   int field2379;

   public class204(class276 var1, class276 var2, int var3, double var4, int var6) {
      this.field2375 = new class295();
      this.field2376 = 0;
      this.field2378 = 1.0D;
      this.field2379 = 128;
      this.field2380 = var2;
      this.field2374 = var3;
      this.field2376 = this.field2374;
      this.field2378 = var4;
      this.field2379 = var6;
      int[] var7 = var1.method4989(0);
      int var8 = var7.length;
      this.field2377 = new class194[var1.method4946(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         class384 var10 = new class384(var1.method4920(0, var7[var9]));
         this.field2377[var7[var9]] = new class194(var10);
      }

   }

   public void method4109() {
      for(int var2 = 0; var2 < this.field2377.length; ++var2) {
         if (this.field2377[var2] != null) {
            this.field2377[var2].method3806();
         }
      }

      this.field2375 = new class295();
      this.field2376 = this.field2374;
   }

   public int vmethod4253(int var1) {
      return this.field2377[var1] != null ? this.field2377[var1].field2200 : 0;
   }

   public int[] vmethod4262(int var1) {
      class194 var3 = this.field2377[var1];
      if (var3 != null) {
         if (var3.field2206 != null) {
            this.field2375.method5188(var3);
            var3.field2209 = true;
            return var3.field2206;
         }

         boolean var4 = var3.method3815(this.field2378, this.field2379, this.field2380);
         if (var4) {
            if (this.field2376 == 0) {
               class194 var5 = (class194)this.field2375.method5190();
               var5.method3806();
            } else {
               --this.field2376;
            }

            this.field2375.method5188(var3);
            var3.field2209 = true;
            return var3.field2206;
         }
      }

      return null;
   }

   public boolean vmethod4252(int var1) {
      return this.field2379 == 64;
   }

   public boolean vmethod4259(int var1) {
      return this.field2377[var1].field2201;
   }

   public int method4104() {
      int var2 = 0;
      int var3 = 0;
      class194[] var4 = this.field2377;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class194 var6 = var4[var5];
         if (var6 != null && var6.field2205 != null) {
            var2 += var6.field2205.length;
            int[] var7 = var6.field2205;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               int var9 = var7[var8];
               if (this.field2380.method4947(var9)) {
                  ++var3;
               }
            }
         }
      }

      if (var2 == 0) {
         return 0;
      } else {
         return var3 * 100 / var2;
      }
   }

   public void method4114(double var1) {
      this.field2378 = var1;
      this.method4109();
   }

   public void method4110(int var1) {
      for(int var3 = 0; var3 < this.field2377.length; ++var3) {
         class194 var4 = this.field2377[var3];
         if (var4 != null && var4.field2196 != 0 && var4.field2209) {
            var4.method3807(var1);
            var4.field2209 = false;
         }
      }

   }

   public static byte[] method4130(byte[] var0) {
      int var2 = var0.length;
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, 0, var3, 0, var2);
      return var3;
   }
}
