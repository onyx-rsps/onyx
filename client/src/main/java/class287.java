import java.util.HashMap;

public class class287 {
   class336 field3665;
   int field3668;
   int[] field3666;
   int[] field3670;
   final HashMap field3669;

   public class287() {
      this.field3669 = new HashMap();
      this.field3665 = new class336(0, 0);
      this.field3666 = new int[2048];
      this.field3670 = new int[2048];
      this.field3668 = 0;
      class43.field375 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var4;
      for(byte var3 = 12; var1 < 16; var2 -= var3) {
         var4 = class125.method2475((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var1 / 16.0F));
         class43.field375[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(int var6 = var2 / 6; var1 < class43.field375.length; var2 -= var6) {
         var4 = var1 * 2;

         for(int var5 = class125.method2475((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class43.field375.length; ++var1) {
            class43.field375[var1] = var5;
         }
      }

   }

   class397 method5103(int var1) {
      if (!this.field3669.containsKey(var1)) {
         this.method5109(var1);
      }

      return (class397)this.field3669.get(var1);
   }

   void method5109(int var1) {
      int var3 = var1 * 2 + 1;
      double var5 = (double)((float)var1 / 3.0F);
      int var7 = var1 * 2 + 1;
      double[] var8 = new double[var7];
      int var9 = -var1;

      for(int var10 = 0; var9 <= var1; ++var10) {
         double var17 = (double)(var9 - 0) / var5;
         double var15 = Math.exp(-var17 * var17 / 2.0D) / Math.sqrt(6.283185307179586D);
         double var13 = var15 / var5;
         var8[var10] = var13;
         ++var9;
      }

      double[] var19 = var8;
      double var20 = var8[var1] * var8[var1];
      int[] var22 = new int[var3 * var3];
      boolean var23 = false;

      for(int var12 = 0; var12 < var3; ++var12) {
         for(int var24 = 0; var24 < var3; ++var24) {
            int var14 = var22[var24 + var12 * var3] = (int)(var19[var12] * var19[var24] / var20 * 256.0D);
            if (!var23 && var14 > 0) {
               var23 = true;
            }
         }
      }

      class397 var25 = new class397(var22, var3, var3);
      this.field3669.put(var1, var25);
   }

   void method5121(class397 var1, class397 var2, class336 var3) {
      if (var3.field3922 != 0 && var3.field3920 != 0) {
         int var5 = 0;
         int var6 = 0;
         if (var3.field3924 == 0) {
            var5 = var1.field4269 - var3.field3922;
         }

         if (var3.field3921 == 0) {
            var6 = var1.field4270 - var3.field3920;
         }

         int var7 = var5 + var6 * var1.field4269;
         int var8 = var3.field3924 + var2.field4269 * var3.field3921;

         for(int var9 = 0; var9 < var3.field3920; ++var9) {
            for(int var10 = 0; var10 < var3.field3922; ++var10) {
               int[] var10000 = var2.field4279;
               int var10001 = var8++;
               var10000[var10001] += var1.field4279[var7++];
            }

            var7 += var1.field4269 - var3.field3922;
            var8 += var2.field4269 - var3.field3922;
         }

      }
   }

   public final void method5106(int var1, int var2, class397 var3, float var4) {
      int var6 = (int)(18.0F * var4);
      class397 var7 = this.method5103(var6);
      int var8 = var6 * 2 + 1;
      class336 var9 = new class336(0, 0, var3.field4269, var3.field4270);
      class336 var10 = new class336(0, 0);
      this.field3665.method5937(var8, var8);
      System.nanoTime();

      int var11;
      int var12;
      int var13;
      for(var11 = 0; var11 < this.field3668; ++var11) {
         var12 = this.field3666[var11];
         var13 = this.field3670[var11];
         int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
         int var15 = (int)((float)var3.field4270 - var4 * (float)(var13 - var2)) - var6;
         this.field3665.method5936(var14, var15);
         this.field3665.method5938(var9, var10);
         this.method5121(var7, var3, var10);
      }

      System.nanoTime();
      System.nanoTime();

      for(var11 = 0; var11 < var3.field4279.length; ++var11) {
         if (var3.field4279[var11] == 0) {
            var3.field4279[var11] = -16777216;
         } else {
            var12 = (var3.field4279[var11] + 64 - 1) / 256;
            if (var12 <= 0) {
               var3.field4279[var11] = -16777216;
            } else {
               if (var12 > class43.field375.length) {
                  var12 = class43.field375.length;
               }

               var13 = class43.field375[var12 - 1];
               var3.field4279[var11] = -16777216 | var13;
            }
         }
      }

      System.nanoTime();
   }

   public final void method5105() {
      this.field3668 = 0;
   }

   public final void method5104(int var1, int var2) {
      if (this.field3668 < this.field3666.length) {
         this.field3666[this.field3668] = var1;
         this.field3670[this.field3668] = var2;
         ++this.field3668;
      }
   }

   static long method5123(CharSequence var0) {
      long var2 = 0L;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var0.charAt(var5);
         if (var6 >= 'A' && var6 <= 'Z') {
            var2 += (long)(var6 + 1 - 65);
         } else if (var6 >= 'a' && var6 <= 'z') {
            var2 += (long)(var6 + 1 - 97);
         } else if (var6 >= '0' && var6 <= '9') {
            var2 += (long)(var6 + 27 - 48);
         }

         if (var2 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var2 % 37L && var2 != 0L) {
         var2 /= 37L;
      }

      return var2;
   }
}
