public class class384 extends class385 {
   static final int[] field4178;
   class401 field4177;
   int field4179;

   static {
      field4178 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   }

   public class384(int var1) {
      super(var1);
   }

   public void method5885(int[] var1) {
      this.field4177 = new class401(var1);
   }

   public void method5886(class401 var1) {
      this.field4177 = var1;
   }

   public void method5887(int var1) {
      super.field4184[++super.field4182 - 1] = (byte)(var1 + this.field4177.method6500());
   }

   public static class153 method5928(int var0) {
      class153 var2 = (class153)class153.field1697.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class153.field1698.method4412(11, var0);
         var2 = new class153();
         if (var3 != null) {
            var2.method2545(new class385(var3));
         }

         var2.method2547();
         class153.field1697.method3882(var2, (long)var0);
         return var2;
      }
   }

   public int method5888() {
      return super.field4184[++super.field4182 - 1] - this.field4177.method6500() & 255;
   }

   public boolean method5889() {
      int var2 = super.field4184[super.field4182] - this.field4177.method6499() & 255;
      return var2 >= 128;
   }

   public int method5890() {
      int var2 = super.field4184[++super.field4182 - 1] - this.field4177.method6500() & 255;
      return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field4184[++super.field4182 - 1] - this.field4177.method6500() & 255);
   }

   public void method5891(byte[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var1[var5 + var2] = (byte)(super.field4184[++super.field4182 - 1] - this.field4177.method6500());
      }

   }

   public void method5892() {
      this.field4179 = super.field4182 * 8;
   }

   public int method5893(int var1) {
      int var3 = this.field4179 >> 3;
      int var4 = 8 - (this.field4179 & 7);
      int var5 = 0;

      for(this.field4179 += var1; var1 > var4; var4 = 8) {
         var5 += (super.field4184[var3++] & field4178[var4]) << var1 - var4;
         var1 -= var4;
      }

      if (var4 == var1) {
         var5 += super.field4184[var3] & field4178[var4];
      } else {
         var5 += super.field4184[var3] >> var4 - var1 & field4178[var1];
      }

      return var5;
   }

   public void method5913() {
      super.field4182 = (this.field4179 + 7) / 8;
   }

   public int method5901(int var1) {
      return var1 * 8 - this.field4179;
   }
}
