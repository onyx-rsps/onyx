import java.math.BigInteger;

public class Buffer extends Node {
   static int[] crc32Table;
   static long[] crc64Table;
   public byte[] payload;
   public int offset;

   static {
      crc32Table = new int[256];

      int j;
      for(int i = 0; i < 256; ++i) {
         int crc = i;

         for(j = 0; j < 8; ++j) {
            if (1 == (crc & 1)) {
               crc = crc >>> 1 ^ -306674912;
            } else {
               crc >>>= 1;
            }
         }

         crc32Table[i] = crc;
      }

      crc64Table = new long[256];

      for(j = 0; j < 256; ++j) {
         long var4 = (long)j;

         for(int k = 0; k < 8; ++k) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         crc64Table[j] = var4;
      }

   }

   public Buffer(int size) {
      this.payload = class410.newSyncPooledBuffer(size);
      this.offset = 0;
   }

   public Buffer(byte[] payload) {
      this.payload = payload;
      this.offset = 0;
   }

   public void method5941() {
      if (this.payload != null) {
         class166.method2880(this.payload);
      }

      this.payload = null;
   }

   public void writeByte(int var1) {
      this.payload[++this.offset - 1] = (byte)var1;
   }

   public void method6122(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)var1;
   }

   public void writeMedium(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 16);
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)var1;
   }

   public void writeInt(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 24);
      this.payload[++this.offset - 1] = (byte)(var1 >> 16);
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)var1;
   }

   public void method6023(long var1) {
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.payload[++this.offset - 1] = (byte)((int)var1);
   }

   public void writeLong(long var1) {
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 56));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 48));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.payload[++this.offset - 1] = (byte)((int)var1);
   }

   public void method5937(boolean var1) {
      this.writeByte(var1 ? 1 : 0);
   }

   public void method5938(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.offset += class264.method4340(var1, 0, var1.length(), this.payload, this.offset);
         this.payload[++this.offset - 1] = 0;
      }
   }

   public void method5939(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.payload[++this.offset - 1] = 0;
         this.offset += class264.method4340(var1, 0, var1.length(), this.payload, this.offset);
         this.payload[++this.offset - 1] = 0;
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

      this.payload[++this.offset - 1] = 0;
      this.method5947(var5);
      var5 = this.offset * 722138687;
      byte[] var13 = this.payload;
      int var8 = this.offset;
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
      this.offset = (722138687 * var6 + var5) * -1728972353;
   }

   public void method6003(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         this.payload[++this.offset - 1] = var1[var5];
      }

   }

   public void method5942(Buffer var1) {
      this.method6003(var1.payload, 0, var1.offset);
   }

   public void method5943(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.payload[this.offset - var1 - 4] = (byte)(var1 >> 24);
         this.payload[this.offset - var1 - 3] = (byte)(var1 >> 16);
         this.payload[this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.payload[this.offset - var1 - 1] = (byte)var1;
      }
   }

   public void method6034(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.payload[this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.payload[this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method5945(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.payload[this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method5946(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.writeByte(var1);
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

   public int method5948() {
      return this.payload[++this.offset - 1] & 255;
   }

   public byte method5949() {
      return this.payload[++this.offset - 1];
   }

   public int readUnsignedShort() {
      this.offset += 2;
      return (this.payload[this.offset - 1] & 255) + ((this.payload[this.offset - 2] & 255) << 8);
   }

   public int method5951() {
      this.offset += 2;
      int var2 = (this.payload[this.offset - 1] & 255) + ((this.payload[this.offset - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method5952() {
      this.offset += 3;
      return (this.payload[this.offset - 1] & 255) + ((this.payload[this.offset - 3] & 255) << 16) + ((this.payload[this.offset - 2] & 255) << 8);
   }

   public int readInt() {
      this.offset += 4;
      return (this.payload[this.offset - 1] & 255) + ((this.payload[this.offset - 4] & 255) << 24) + ((this.payload[this.offset - 3] & 255) << 16) + ((this.payload[this.offset - 2] & 255) << 8);
   }

   public long method5954() {
      long var2 = (long)this.readInt() & 4294967295L;
      long var4 = (long)this.readInt() & 4294967295L;
      return var4 + (var2 << 32);
   }

   public boolean method6178() {
      return (this.method5948() & 1) == 1;
   }

   public String method5956() {
      if (this.payload[this.offset] == 0) {
         ++this.offset;
         return null;
      } else {
         return this.method5957();
      }
   }

   public String method5957() {
      int var2 = this.offset;

      while(this.payload[++this.offset - 1] != 0) {
      }

      int var3 = this.offset - var2 - 1;
      return 0 == var3 ? "" : class293.method4653(this.payload, var2, var3);
   }

   public String method6094() {
      byte var2 = this.payload[++this.offset - 1];
      if (0 != var2) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.offset;

         while(this.payload[++this.offset - 1] != 0) {
         }

         int var4 = this.offset - var3 - 1;
         return var4 == 0 ? "" : class293.method4653(this.payload, var3, var4);
      }
   }

   public String method5959() {
      byte var2 = this.payload[++this.offset - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.method5966();
         if (var3 + this.offset > this.payload.length) {
            throw new IllegalStateException("");
         } else {
            String var4 = class284.method4555(this.payload, this.offset, var3);
            this.offset += var3;
            return var4;
         }
      }
   }

   public void method5960(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = this.payload[++this.offset - 1];
      }

   }

   public int method5961() {
      int var2 = this.payload[this.offset] & 255;
      return var2 < 128 ? this.method5948() - 64 : this.readUnsignedShort() - '\uc000';
   }

   public int method5962() {
      int var2 = this.payload[this.offset] & 255;
      return var2 < 128 ? this.method5948() : this.readUnsignedShort() - '\u8000';
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
      return this.payload[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
   }

   public int method5965() {
      if (this.payload[this.offset] < 0) {
         return this.readInt() & Integer.MAX_VALUE;
      } else {
         int var2 = this.readUnsignedShort();
         return 32767 == var2 ? -1 : var2;
      }
   }

   public int method5966() {
      byte var2 = this.payload[++this.offset - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.payload[++this.offset - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public void method5932(int[] var1) {
      int var3 = this.offset / 8;
      this.offset = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.readInt();
         int var6 = this.readInt();
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
            var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3];
            var7 += var8;
         }

         this.offset -= 8;
         this.writeInt(var5);
         this.writeInt(var6);
      }

   }

   public void method5968(int[] var1) {
      int var3 = this.offset / 8;
      this.offset = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.readInt();
         int var6 = this.readInt();
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var1[var7 & 3] + var7) {
            var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7;
            var7 -= var8;
         }

         this.offset -= 8;
         this.writeInt(var5);
         this.writeInt(var6);
      }

   }

   public void method5933(int[] var1, int var2, int var3) {
      int var5 = this.offset;
      this.offset = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.readInt();
         int var9 = this.readInt();
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10) {
            var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var1[var10 & 3] + var10;
            var10 += var11;
         }

         this.offset -= 8;
         this.writeInt(var8);
         this.writeInt(var9);
      }

      this.offset = var5;
   }

   public void method6042(int[] var1, int var2, int var3) {
      int var5 = this.offset;
      this.offset = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.readInt();
         int var9 = this.readInt();
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3]) {
            var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3];
            var10 -= var11;
         }

         this.offset -= 8;
         this.writeInt(var8);
         this.writeInt(var9);
      }

      this.offset = var5;
   }

   public void method5971(BigInteger var1, BigInteger var2) {
      int var4 = this.offset;
      this.offset = 0;
      byte[] var5 = new byte[var4];
      this.method5960(var5, 0, var4);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var1, var2);
      byte[] var8 = var7.toByteArray();
      this.offset = 0;
      this.method6122(var8.length);
      this.method6003(var8, 0, var8.length);
   }

   public int method6088(int var1) {
      int var3 = class227.method3901(this.payload, var1, this.offset);
      this.writeInt(var3);
      return var3;
   }

   public boolean method5973() {
      this.offset -= 4;
      int var2 = class227.method3901(this.payload, 0, this.offset);
      int var3 = this.readInt();
      return var2 == var3;
   }

   public void method5974(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 + 128);
   }

   public void method6067(int var1) {
      this.payload[++this.offset - 1] = (byte)(0 - var1);
   }

   public void method5976(int var1) {
      this.payload[++this.offset - 1] = (byte)(128 - var1);
   }

   public int method5977() {
      return this.payload[++this.offset - 1] - 128 & 255;
   }

   public int method6164() {
      return 0 - this.payload[++this.offset - 1] & 255;
   }

   public int method5979() {
      return 128 - this.payload[++this.offset - 1] & 255;
   }

   public byte method5980() {
      return (byte)(this.payload[++this.offset - 1] - 128);
   }

   public byte method5981() {
      return (byte)(0 - this.payload[++this.offset - 1]);
   }

   public byte method5935() {
      return (byte)(128 - this.payload[++this.offset - 1]);
   }

   public void method5983(int var1) {
      this.payload[++this.offset - 1] = (byte)var1;
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
   }

   public void method5984(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)(var1 + 128);
   }

   public void method6077(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 + 128);
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
   }

   public int readUnsignedShortLE() {
      this.offset += 2;
      return (this.payload[this.offset - 2] & 255) + ((this.payload[this.offset - 1] & 255) << 8);
   }

   public int readUnsignedShortADD() {
      this.offset += 2;
      return (this.payload[this.offset - 1] - 128 & 255) + ((this.payload[this.offset - 2] & 255) << 8);
   }

   public int method5988() {
      this.offset += 2;
      return (this.payload[this.offset - 2] - 128 & 255) + ((this.payload[this.offset - 1] & 255) << 8);
   }

   public int method5989() {
      this.offset += 2;
      int var2 = (this.payload[this.offset - 1] - 128 & 255) + ((this.payload[this.offset - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method5990() {
      this.offset += 2;
      int var2 = (this.payload[this.offset - 2] - 128 & 255) + ((this.payload[this.offset - 1] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method5991() {
      this.offset += 3;
      return ((this.payload[this.offset - 1] & 255) << 8) + ((this.payload[this.offset - 3] & 255) << 16) + (this.payload[this.offset - 2] & 255);
   }

   public void method5972(int var1) {
      this.payload[++this.offset - 1] = (byte)var1;
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)(var1 >> 16);
      this.payload[++this.offset - 1] = (byte)(var1 >> 24);
   }

   public void method5992(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)var1;
      this.payload[++this.offset - 1] = (byte)(var1 >> 24);
      this.payload[++this.offset - 1] = (byte)(var1 >> 16);
   }

   public void method5994(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 16);
      this.payload[++this.offset - 1] = (byte)(var1 >> 24);
      this.payload[++this.offset - 1] = (byte)var1;
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
   }

   public int method5995() {
      this.offset += 4;
      return ((this.payload[this.offset - 2] & 255) << 16) + ((this.payload[this.offset - 1] & 255) << 24) + ((this.payload[this.offset - 3] & 255) << 8) + (this.payload[this.offset - 4] & 255);
   }

   public int method5963() {
      this.offset += 4;
      return (this.payload[this.offset - 3] & 255) + ((this.payload[this.offset - 4] & 255) << 8) + ((this.payload[this.offset - 1] & 255) << 16) + ((this.payload[this.offset - 2] & 255) << 24);
   }

   public int method5997() {
      this.offset += 4;
      return ((this.payload[this.offset - 4] & 255) << 16) + ((this.payload[this.offset - 3] & 255) << 24) + ((this.payload[this.offset - 1] & 255) << 8) + (this.payload[this.offset - 2] & 255);
   }

   public void method5998(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = (byte)(this.payload[++this.offset - 1] - 128);
      }

   }

   public void method6040(byte[] var1, int var2, int var3) {
      for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
         var1[var5] = (byte)(this.payload[++this.offset - 1] - 128);
      }

   }
}
