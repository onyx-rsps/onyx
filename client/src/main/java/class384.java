import java.math.BigInteger;

public class class384 extends class353 {
   static int[] field4182;
   static long[] field4180;
   public byte[] payload;
   public int field4181;

   static {
      field4182 = new int[256];

      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if ((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field4182[var1] = var0;
      }

      field4180 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field4180[var2] = var4;
      }

   }

   public class384(int var1) {
      this.payload = class54.method1589(var1);
      this.field4181 = 0;
   }

   public class384(byte[] var1) {
      this.payload = var1;
      this.field4181 = 0;
   }

   public String method6568() {
      if (this.payload[this.field4181 * -1084587701] == 0) {
         this.field4181 += 99;
         return null;
      } else {
         return this.method6569();
      }
   }

   public long method6566() {
      long var2 = (long)this.method6784() & 4294967295L;
      long var4 = (long)this.method6784() & 4294967295L;
      return var4 + (var2 << 32);
   }

   public int method6574() {
      int var2 = this.payload[this.field4181 * -1084587701] & 255;
      return var2 < 128 ? this.method6560() : this.method6655() - '\u8000';
   }

   public void method6550(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field4181 = (this.field4181 * -1084587701 + class263.method4824(var1, 0, var1.length(), this.payload, this.field4181 * -1084587701)) * 99;
         this.payload[(this.field4181 += 99) * -1084587701 - 1] = 0;
      }
   }

   public String method6569() {
      int var2 = this.field4181 * -1084587701;

      while(this.payload[(this.field4181 += 99) * -1084587701 - 1] != 0) {
      }

      int var3 = this.field4181 * -1084587701 - var2 - 1;
      return var3 == 0 ? "" : class292.method5168(this.payload, var2, var3);
   }

   public int method6784() {
      this.field4181 = (this.field4181 * -1084587701 + 4) * 99;
      return ((this.payload[this.field4181 * -1084587701 - 3] & 255) << 16) + (this.payload[this.field4181 * -1084587701 - 1] & 255) + ((this.payload[this.field4181 * -1084587701 - 2] & 255) << 8) + ((this.payload[this.field4181 * -1084587701 - 4] & 255) << 24);
   }

   public int method6655() {
      this.field4181 = (this.field4181 * -1084587701 + 2) * 99;
      return (this.payload[this.field4181 * -1084587701 - 1] & 255) + ((this.payload[this.field4181 * -1084587701 - 2] & 255) << 8);
   }

   public void writeByte(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)var1;
   }

   public int method6560() {
      return this.payload[(this.field4181 += 99) * -1084587701 - 1] & 255;
   }

   public void method6548(long var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 56));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 48));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 40));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 32));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 24));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 16));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 8));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)var1);
   }

   public int method6577() {
      if (this.payload[this.field4181 * -1084587701] < 0) {
         return this.method6784() & Integer.MAX_VALUE;
      } else {
         int var2 = this.method6655();
         return var2 == 32767 ? -1 : var2;
      }
   }

   public int method6578() {
      byte var2 = this.payload[(this.field4181 += 99) * -1084587701 - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.payload[(this.field4181 += 99) * -1084587701 - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public int method6564() {
      this.field4181 = (this.field4181 * -1084587701 + 3) * 99;
      return ((this.payload[this.field4181 * -1084587701 - 3] & 255) << 16) + (this.payload[this.field4181 * -1084587701 - 1] & 255) + ((this.payload[this.field4181 * -1084587701 - 2] & 255) << 8);
   }

   public byte method6561() {
      return this.payload[(this.field4181 += 99) * -1084587701 - 1];
   }

   public void writeInt(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 24);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 16);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 8);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)var1;
   }

   public void method6615(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         this.payload[(this.field4181 += 99) * -1084587701 - 1] = var1[var5];
      }

   }

   public void method6572(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = this.payload[(this.field4181 += 99) * -1084587701 - 1];
      }

   }

   public void method6734(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 8);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)var1;
   }

   public int method6563() {
      this.field4181 = (this.field4181 * -1084587701 + 2) * 99;
      int var2 = (this.payload[this.field4181 * -1084587701 - 1] & 255) + ((this.payload[this.field4181 * -1084587701 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public String method6706() {
      byte var2 = this.payload[(this.field4181 += 99) * -1084587701 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.field4181 * -1084587701;

         while(this.payload[(this.field4181 += 99) * -1084587701 - 1] != 0) {
         }

         int var4 = this.field4181 * -1084587701 - var3 - 1;
         return var4 == 0 ? "" : class292.method5168(this.payload, var3, var4);
      }
   }

   public void method6559(int var1) {
      if ((var1 & -128) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   public int method6741() {
      return this.payload[this.field4181 * -1084587701] < 0 ? this.method6784() & Integer.MAX_VALUE : this.method6655();
   }

   public boolean method6790() {
      return (this.method6560() & 1) == 1;
   }

   public void method6654(int[] var1, int var2, int var3) {
      int var5 = this.field4181 * -1084587701;
      this.field4181 = var2 * 99;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method6784();
         int var9 = this.method6784();
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
            var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10;
            var10 -= var11;
         }

         this.field4181 -= 792;
         this.writeInt(var8);
         this.writeInt(var9);
      }

      this.field4181 = var5 * 99;
   }

   public void method6549(boolean var1) {
      this.writeByte(var1 ? 1 : 0);
   }

   public void method6553() {
      if (this.payload != null) {
         class165.method3192(this.payload);
      }

      this.payload = null;
   }

   public void method6689(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 + 128);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 8);
   }

   public void method6723(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 16);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 8);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)var1;
   }

   public int method6573() {
      int var2 = this.payload[this.field4181 * -1084587701] & 255;
      return var2 < 128 ? this.method6560() - 64 : this.method6655() - '\uc000';
   }

   public void method6551(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.payload[(this.field4181 += 99) * -1084587701 - 1] = 0;
         this.field4181 = (this.field4181 * -1084587701 + class263.method4824(var1, 0, var1.length(), this.payload, this.field4181 * -1084587701)) * 99;
         this.payload[(this.field4181 += 99) * -1084587701 - 1] = 0;
      }
   }

   public void method6604(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 8);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)var1;
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 24);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 16);
   }

   public int method6607() {
      this.field4181 = (this.field4181 * -1084587701 + 4) * 99;
      return (this.payload[this.field4181 * -1084587701 - 4] & 255) + ((this.payload[this.field4181 * -1084587701 - 3] & 255) << 8) + ((this.payload[this.field4181 * -1084587701 - 2] & 255) << 16) + ((this.payload[this.field4181 * -1084587701 - 1] & 255) << 24);
   }

   public void method6595(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)var1;
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 8);
   }

   public void method6557(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.payload[this.field4181 * -1084587701 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int method6776() {
      return 0 - this.payload[(this.field4181 += 99) * -1084587701 - 1] & 255;
   }

   public int method6591() {
      return 128 - this.payload[(this.field4181 += 99) * -1084587701 - 1] & 255;
   }

   public int method6609() {
      this.field4181 = (this.field4181 * -1084587701 + 4) * 99;
      return ((this.payload[this.field4181 * -1084587701 - 1] & 255) << 8) + ((this.payload[this.field4181 * -1084587701 - 4] & 255) << 16) + (this.payload[this.field4181 * -1084587701 - 2] & 255) + ((this.payload[this.field4181 * -1084587701 - 3] & 255) << 24);
   }

   public int method6700(int var1) {
      int var3 = class226.method4335(this.payload, var1, this.field4181 * -1084587701);
      this.writeInt(var3);
      return var3;
   }

   public byte method6547() {
      return (byte)(128 - this.payload[(this.field4181 += 99) * -1084587701 - 1]);
   }

   public byte method6593() {
      return (byte)(0 - this.payload[(this.field4181 += 99) * -1084587701 - 1]);
   }

   public int method6688() {
      this.field4181 = (this.field4181 * -1084587701 + 2) * 99;
      return ((this.payload[this.field4181 * -1084587701 - 1] & 255) << 8) + (this.payload[this.field4181 * -1084587701 - 2] & 255);
   }

   public int method6589() {
      return this.payload[(this.field4181 += 99) * -1084587701 - 1] - 128 & 255;
   }

   public byte method6592() {
      return (byte)(this.payload[(this.field4181 += 99) * -1084587701 - 1] - 128);
   }

   public void method6588(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(128 - var1);
   }

   public int method6599() {
      this.field4181 = (this.field4181 * -1084587701 + 2) * 99;
      return (this.payload[this.field4181 * -1084587701 - 1] - 128 & 255) + ((this.payload[this.field4181 * -1084587701 - 2] & 255) << 8);
   }

   public int method6600() {
      this.field4181 = (this.field4181 * -1084587701 + 2) * 99;
      return ((this.payload[this.field4181 * -1084587701 - 1] & 255) << 8) + (this.payload[this.field4181 * -1084587701 - 2] - 128 & 255);
   }

   public int method6601() {
      this.field4181 = (this.field4181 * -1084587701 + 2) * 99;
      int var2 = (this.payload[this.field4181 * -1084587701 - 1] - 128 & 255) + ((this.payload[this.field4181 * -1084587701 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method6575() {
      this.field4181 = (this.field4181 * -1084587701 + 4) * 99;
      return ((this.payload[this.field4181 * -1084587701 - 2] & 255) << 24) + ((this.payload[this.field4181 * -1084587701 - 4] & 255) << 8) + (this.payload[this.field4181 * -1084587701 - 3] & 255) + ((this.payload[this.field4181 * -1084587701 - 1] & 255) << 16);
   }

   public int method6602() {
      this.field4181 = (this.field4181 * -1084587701 + 2) * 99;
      int var2 = ((this.payload[this.field4181 * -1084587701 - 1] & 255) << 8) + (this.payload[this.field4181 * -1084587701 - 2] - 128 & 255);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public String method6571() {
      byte var2 = this.payload[(this.field4181 += 99) * -1084587701 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.method6578();
         if (var3 + this.field4181 * -1084587701 > this.payload.length) {
            throw new IllegalStateException("");
         } else {
            String var4 = class283.method5063(this.payload, this.field4181 * -1084587701, var3);
            this.field4181 = (this.field4181 * -1084587701 + var3) * 99;
            return var4;
         }
      }
   }

   public void method6679(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(0 - var1);
   }

   public void method6606(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 16);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 24);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)var1;
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 8);
   }

   public void method6596(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 8);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 + 128);
   }

   public void method6646(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.payload[this.field4181 * -1084587701 - var1 - 2] = (byte)(var1 >> 8);
         this.payload[this.field4181 * -1084587701 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method6652(byte[] var1, int var2, int var3) {
      for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
         var1[var5] = (byte)(this.payload[(this.field4181 += 99) * -1084587701 - 1] - 128);
      }

   }

   public void method6583(BigInteger var1, BigInteger var2) {
      int var4 = this.field4181 * -1084587701;
      this.field4181 = 0;
      byte[] var5 = new byte[var4];
      this.method6572(var5, 0, var4);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var1, var2);
      byte[] var8 = var7.toByteArray();
      this.field4181 = 0;
      this.method6734(var8.length);
      this.method6615(var8, 0, var8.length);
   }

   public void method6552(CharSequence var1) {
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

      this.payload[(this.field4181 += 99) * -1084587701 - 1] = 0;
      this.method6559(var5);
      var5 = this.field4181 * -1084587701;
      byte[] var13 = this.payload;
      int var8 = this.field4181 * -1084587701;
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
      this.field4181 = (var6 + var5) * 99;
   }

   public int method6783() {
      int var2 = 0;

      int var3;
      for(var3 = this.method6574(); var3 == 32767; var3 = this.method6574()) {
         var2 += 32767;
      }

      var2 += var3;
      return var2;
   }

   public void method6554(class384 var1) {
      this.method6615(var1.payload, 0, var1.field4181 * -1084587701);
   }

   public int method6603() {
      this.field4181 = (this.field4181 * -1084587701 + 3) * 99;
      return ((this.payload[this.field4181 * -1084587701 - 1] & 255) << 8) + ((this.payload[this.field4181 * -1084587701 - 3] & 255) << 16) + (this.payload[this.field4181 * -1084587701 - 2] & 255);
   }

   public void method6555(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.payload[this.field4181 * -1084587701 - var1 - 4] = (byte)(var1 >> 24);
         this.payload[this.field4181 * -1084587701 - var1 - 3] = (byte)(var1 >> 16);
         this.payload[this.field4181 * -1084587701 - var1 - 2] = (byte)(var1 >> 8);
         this.payload[this.field4181 * -1084587701 - var1 - 1] = (byte)var1;
      }
   }

   public void method6635(long var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 40));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 32));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 24));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 16));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)(var1 >> 8));
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)((int)var1);
   }

   public void method6584(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)var1;
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 8);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 16);
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 >> 24);
   }

   public void method6544(int[] var1) {
      int var3 = this.field4181 * -1084587701 / 8;
      this.field4181 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method6784();
         int var6 = this.method6784();
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7) {
            var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
            var7 += var8;
         }

         this.field4181 -= 792;
         this.writeInt(var5);
         this.writeInt(var6);
      }

   }

   public void method6610(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = (byte)(this.payload[(this.field4181 += 99) * -1084587701 - 1] - 128);
      }

   }

   public boolean method6585() {
      this.field4181 = (this.field4181 * -1084587701 - 4) * 99;
      int var2 = class226.method4335(this.payload, 0, this.field4181 * -1084587701);
      int var3 = this.method6784();
      return var2 == var3;
   }

   public void method6586(int var1) {
      this.payload[(this.field4181 += 99) * -1084587701 - 1] = (byte)(var1 + 128);
   }

   public void method6558(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.writeByte(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.method6734(var1 + '\u8000');
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method6545(int[] var1, int var2, int var3) {
      int var5 = this.field4181 * -1084587701;
      this.field4181 = var2 * 99;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method6784();
         int var9 = this.method6784();
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
            var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
            var10 += var11;
         }

         this.field4181 -= 792;
         this.writeInt(var8);
         this.writeInt(var9);
      }

      this.field4181 = var5 * 99;
   }

   public void method6580(int[] var1) {
      int var3 = this.field4181 * -1084587701 / 8;
      this.field4181 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method6784();
         int var6 = this.method6784();
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3]) {
            var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
            var7 -= var8;
         }

         this.field4181 -= 792;
         this.writeInt(var5);
         this.writeInt(var6);
      }

   }
}
