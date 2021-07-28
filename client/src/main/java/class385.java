import java.math.BigInteger;

public class class385 extends class354 {
   static int[] field4183;
   static long[] field4181;
   public byte[] field4184;
   public int field4182;

   static {
      field4183 = new int[256];

      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if (1 == (var0 & 1)) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field4183[var1] = var0;
      }

      field4181 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field4181[var2] = var4;
      }

   }

   public class385(int var1) {
      this.field4184 = class55.method1544(var1);
      this.field4182 = 0;
   }

   public class385(byte[] var1) {
      this.field4184 = var1;
      this.field4182 = 0;
   }

   public void method5941() {
      if (this.field4184 != null) {
         class166.method2880(this.field4184);
      }

      this.field4184 = null;
   }

   public void method5931(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)var1;
   }

   public void method6122(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 8);
      this.field4184[++this.field4182 - 1] = (byte)var1;
   }

   public void method6111(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 16);
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 8);
      this.field4184[++this.field4182 - 1] = (byte)var1;
   }

   public void method5934(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 24);
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 16);
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 8);
      this.field4184[++this.field4182 - 1] = (byte)var1;
   }

   public void method6023(long var1) {
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 40));
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 32));
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 24));
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 16));
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 8));
      this.field4184[++this.field4182 - 1] = (byte)((int)var1);
   }

   public void method5936(long var1) {
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 56));
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 48));
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 40));
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 32));
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 24));
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 16));
      this.field4184[++this.field4182 - 1] = (byte)((int)(var1 >> 8));
      this.field4184[++this.field4182 - 1] = (byte)((int)var1);
   }

   public void method5937(boolean var1) {
      this.method5931(var1 ? 1 : 0);
   }

   public void method5938(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field4182 += class264.method4340(var1, 0, var1.length(), this.field4184, this.field4182);
         this.field4184[++this.field4182 - 1] = 0;
      }
   }

   public void method5939(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field4184[++this.field4182 - 1] = 0;
         this.field4182 += class264.method4340(var1, 0, var1.length(), this.field4184, this.field4182);
         this.field4184[++this.field4182 - 1] = 0;
      }
   }

   public void method5940(CharSequence var1) {
      int var4 = var1.length();
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         char var7 = var1.charAt(var6);
         if (var7 <= 127) {
            ++var5;
         } else if (var7 <= 2047) {
            var5 += 2;
         } else {
            var5 += 3;
         }
      }

      this.field4184[++this.field4182 - 1] = 0;
      this.method5947(var5);
      var5 = this.field4182 * 722138687;
      byte[] var13 = this.field4184;
      int var8 = this.field4182;
      int var9 = var1.length();
      int var10 = var8;

      for(int var11 = 0; var11 < var9; ++var11) {
         char var12 = var1.charAt(var11);
         if (var12 <= 127) {
            var13[var10++] = (byte)var12;
         } else if (var12 <= 2047) {
            var13[var10++] = (byte)(192 | var12 >> 6);
            var13[var10++] = (byte)(128 | var12 & 63);
         } else {
            var13[var10++] = (byte)(224 | var12 >> 12);
            var13[var10++] = (byte)(128 | var12 >> 6 & 63);
            var13[var10++] = (byte)(128 | var12 & 63);
         }
      }

      var6 = var10 - var8;
      this.field4182 = (722138687 * var6 + var5) * -1728972353;
   }

   public void method6003(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         this.field4184[++this.field4182 - 1] = var1[var5];
      }

   }

   public void method5942(class385 var1) {
      this.method6003(var1.field4184, 0, var1.field4182);
   }

   public void method5943(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.field4184[this.field4182 - var1 - 4] = (byte)(var1 >> 24);
         this.field4184[this.field4182 - var1 - 3] = (byte)(var1 >> 16);
         this.field4184[this.field4182 - var1 - 2] = (byte)(var1 >> 8);
         this.field4184[this.field4182 - var1 - 1] = (byte)var1;
      }
   }

   public void method6034(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.field4184[this.field4182 - var1 - 2] = (byte)(var1 >> 8);
         this.field4184[this.field4182 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method5945(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.field4184[this.field4182 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method5946(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.method5931(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.method6122(var1 + '\u8000');
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method5947(int var1) {
      if (0 != (var1 & -128)) {
         if (0 != (var1 & -16384)) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.method5931(var1 >>> 28 | 128);
               }

               this.method5931(var1 >>> 21 | 128);
            }

            this.method5931(var1 >>> 14 | 128);
         }

         this.method5931(var1 >>> 7 | 128);
      }

      this.method5931(var1 & 127);
   }

   public int method5948() {
      return this.field4184[++this.field4182 - 1] & 255;
   }

   public byte method5949() {
      return this.field4184[++this.field4182 - 1];
   }

   public int method6043() {
      this.field4182 += 2;
      return (this.field4184[this.field4182 - 1] & 255) + ((this.field4184[this.field4182 - 2] & 255) << 8);
   }

   public int method5951() {
      this.field4182 += 2;
      int var2 = (this.field4184[this.field4182 - 1] & 255) + ((this.field4184[this.field4182 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method5952() {
      this.field4182 += 3;
      return (this.field4184[this.field4182 - 1] & 255) + ((this.field4184[this.field4182 - 3] & 255) << 16) + ((this.field4184[this.field4182 - 2] & 255) << 8);
   }

   public int method6172() {
      this.field4182 += 4;
      return (this.field4184[this.field4182 - 1] & 255) + ((this.field4184[this.field4182 - 4] & 255) << 24) + ((this.field4184[this.field4182 - 3] & 255) << 16) + ((this.field4184[this.field4182 - 2] & 255) << 8);
   }

   public long method5954() {
      long var2 = (long)this.method6172() & 4294967295L;
      long var4 = (long)this.method6172() & 4294967295L;
      return var4 + (var2 << 32);
   }

   public boolean method6178() {
      return (this.method5948() & 1) == 1;
   }

   public String method5956() {
      if (this.field4184[this.field4182] == 0) {
         ++this.field4182;
         return null;
      } else {
         return this.method5957();
      }
   }

   public String method5957() {
      int var2 = this.field4182;

      while(this.field4184[++this.field4182 - 1] != 0) {
      }

      int var3 = this.field4182 - var2 - 1;
      return 0 == var3 ? "" : class293.method4653(this.field4184, var2, var3);
   }

   public String method6094() {
      byte var2 = this.field4184[++this.field4182 - 1];
      if (0 != var2) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.field4182;

         while(this.field4184[++this.field4182 - 1] != 0) {
         }

         int var4 = this.field4182 - var3 - 1;
         return var4 == 0 ? "" : class293.method4653(this.field4184, var3, var4);
      }
   }

   public String method5959() {
      byte var2 = this.field4184[++this.field4182 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.method5966();
         if (var3 + this.field4182 > this.field4184.length) {
            throw new IllegalStateException("");
         } else {
            String var4 = class284.method4555(this.field4184, this.field4182, var3);
            this.field4182 += var3;
            return var4;
         }
      }
   }

   public void method5960(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = this.field4184[++this.field4182 - 1];
      }

   }

   public int method5961() {
      int var2 = this.field4184[this.field4182] & 255;
      return var2 < 128 ? this.method5948() - 64 : this.method6043() - '\uc000';
   }

   public int method5962() {
      int var2 = this.field4184[this.field4182] & 255;
      return var2 < 128 ? this.method5948() : this.method6043() - '\u8000';
   }

   public int method6171() {
      int var2 = 0;

      int var3;
      for(var3 = this.method5962(); var3 == 32767; var3 = this.method5962()) {
         var2 += 32767;
      }

      var2 += var3;
      return var2;
   }

   public int method6129() {
      return this.field4184[this.field4182] < 0 ? this.method6172() & Integer.MAX_VALUE : this.method6043();
   }

   public int method5965() {
      if (this.field4184[this.field4182] < 0) {
         return this.method6172() & Integer.MAX_VALUE;
      } else {
         int var2 = this.method6043();
         return 32767 == var2 ? -1 : var2;
      }
   }

   public int method5966() {
      byte var2 = this.field4184[++this.field4182 - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.field4184[++this.field4182 - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public void method5932(int[] var1) {
      int var3 = this.field4182 / 8;
      this.field4182 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method6172();
         int var6 = this.method6172();
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
            var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3];
            var7 += var8;
         }

         this.field4182 -= 8;
         this.method5934(var5);
         this.method5934(var6);
      }

   }

   public void method5968(int[] var1) {
      int var3 = this.field4182 / 8;
      this.field4182 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method6172();
         int var6 = this.method6172();
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var1[var7 & 3] + var7) {
            var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7;
            var7 -= var8;
         }

         this.field4182 -= 8;
         this.method5934(var5);
         this.method5934(var6);
      }

   }

   public void method5933(int[] var1, int var2, int var3) {
      int var5 = this.field4182;
      this.field4182 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method6172();
         int var9 = this.method6172();
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10) {
            var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var1[var10 & 3] + var10;
            var10 += var11;
         }

         this.field4182 -= 8;
         this.method5934(var8);
         this.method5934(var9);
      }

      this.field4182 = var5;
   }

   public void method6042(int[] var1, int var2, int var3) {
      int var5 = this.field4182;
      this.field4182 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method6172();
         int var9 = this.method6172();
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3]) {
            var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3];
            var10 -= var11;
         }

         this.field4182 -= 8;
         this.method5934(var8);
         this.method5934(var9);
      }

      this.field4182 = var5;
   }

   public void method5971(BigInteger var1, BigInteger var2) {
      int var4 = this.field4182;
      this.field4182 = 0;
      byte[] var5 = new byte[var4];
      this.method5960(var5, 0, var4);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var1, var2);
      byte[] var8 = var7.toByteArray();
      this.field4182 = 0;
      this.method6122(var8.length);
      this.method6003(var8, 0, var8.length);
   }

   public int method6088(int var1) {
      int var3 = class227.method3901(this.field4184, var1, this.field4182);
      this.method5934(var3);
      return var3;
   }

   public boolean method5973() {
      this.field4182 -= 4;
      int var2 = class227.method3901(this.field4184, 0, this.field4182);
      int var3 = this.method6172();
      return var2 == var3;
   }

   public void method5974(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)(var1 + 128);
   }

   public void method6067(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)(0 - var1);
   }

   public void method5976(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)(128 - var1);
   }

   public int method5977() {
      return this.field4184[++this.field4182 - 1] - 128 & 255;
   }

   public int method6164() {
      return 0 - this.field4184[++this.field4182 - 1] & 255;
   }

   public int method5979() {
      return 128 - this.field4184[++this.field4182 - 1] & 255;
   }

   public byte method5980() {
      return (byte)(this.field4184[++this.field4182 - 1] - 128);
   }

   public byte method5981() {
      return (byte)(0 - this.field4184[++this.field4182 - 1]);
   }

   public byte method5935() {
      return (byte)(128 - this.field4184[++this.field4182 - 1]);
   }

   public void method5983(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)var1;
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 8);
   }

   public void method5984(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 8);
      this.field4184[++this.field4182 - 1] = (byte)(var1 + 128);
   }

   public void method6077(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)(var1 + 128);
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 8);
   }

   public int method6076() {
      this.field4182 += 2;
      return (this.field4184[this.field4182 - 2] & 255) + ((this.field4184[this.field4182 - 1] & 255) << 8);
   }

   public int method5987() {
      this.field4182 += 2;
      return (this.field4184[this.field4182 - 1] - 128 & 255) + ((this.field4184[this.field4182 - 2] & 255) << 8);
   }

   public int method5988() {
      this.field4182 += 2;
      return (this.field4184[this.field4182 - 2] - 128 & 255) + ((this.field4184[this.field4182 - 1] & 255) << 8);
   }

   public int method5989() {
      this.field4182 += 2;
      int var2 = (this.field4184[this.field4182 - 1] - 128 & 255) + ((this.field4184[this.field4182 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method5990() {
      this.field4182 += 2;
      int var2 = (this.field4184[this.field4182 - 2] - 128 & 255) + ((this.field4184[this.field4182 - 1] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method5991() {
      this.field4182 += 3;
      return ((this.field4184[this.field4182 - 1] & 255) << 8) + ((this.field4184[this.field4182 - 3] & 255) << 16) + (this.field4184[this.field4182 - 2] & 255);
   }

   public void method5972(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)var1;
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 8);
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 16);
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 24);
   }

   public void method5992(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 8);
      this.field4184[++this.field4182 - 1] = (byte)var1;
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 24);
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 16);
   }

   public void method5994(int var1) {
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 16);
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 24);
      this.field4184[++this.field4182 - 1] = (byte)var1;
      this.field4184[++this.field4182 - 1] = (byte)(var1 >> 8);
   }

   public int method5995() {
      this.field4182 += 4;
      return ((this.field4184[this.field4182 - 2] & 255) << 16) + ((this.field4184[this.field4182 - 1] & 255) << 24) + ((this.field4184[this.field4182 - 3] & 255) << 8) + (this.field4184[this.field4182 - 4] & 255);
   }

   public int method5963() {
      this.field4182 += 4;
      return (this.field4184[this.field4182 - 3] & 255) + ((this.field4184[this.field4182 - 4] & 255) << 8) + ((this.field4184[this.field4182 - 1] & 255) << 16) + ((this.field4184[this.field4182 - 2] & 255) << 24);
   }

   public int method5997() {
      this.field4182 += 4;
      return ((this.field4184[this.field4182 - 4] & 255) << 16) + ((this.field4184[this.field4182 - 3] & 255) << 24) + ((this.field4184[this.field4182 - 1] & 255) << 8) + (this.field4184[this.field4182 - 2] & 255);
   }

   public void method5998(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = (byte)(this.field4184[++this.field4182 - 1] - 128);
      }

   }

   public void method6040(byte[] var1, int var2, int var3) {
      for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
         var1[var5] = (byte)(this.field4184[++this.field4182 - 1] - 128);
      }

   }
}
