public class class383 extends Buffer {
   static final int[] field4177;
   class400 field4176;
   int field4178;

   static {
      field4177 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   }

   public class383(int var1) {
      super(var1);
   }

   public boolean method6501() {
      int var2 = super.payload[super.field4181 * -1084587701] - this.field4176.method7119() & 255;
      return var2 >= 128;
   }

   public void method6498(class400 var1) {
      this.field4176 = var1;
   }

   public void method6499(int var1) {
      super.payload[(super.field4181 += 99) * -1084587701 - 1] = (byte)(var1 + this.field4176.method7120());
   }

   public void method6504() {
      this.field4178 = super.field4181 * -86767016;
   }

   public void method6525() {
      super.field4181 = (this.field4178 + 7) / 8 * 99;
   }

   public int method6505(int var1) {
      int var3 = this.field4178 >> 3;
      int var4 = 8 - (this.field4178 & 7);
      int var5 = 0;

      for(this.field4178 += var1; var1 > var4; var4 = 8) {
         var5 += (super.payload[var3++] & field4177[var4]) << var1 - var4;
         var1 -= var4;
      }

      if (var4 == var1) {
         var5 += super.payload[var3] & field4177[var4];
      } else {
         var5 += super.payload[var3] >> var4 - var1 & field4177[var1];
      }

      return var5;
   }

   public void method6503(byte[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var1[var5 + var2] = (byte)(super.payload[(super.field4181 += 99) * -1084587701 - 1] - this.field4176.method7120());
      }

   }

   public int method6502() {
      int var2 = super.payload[(super.field4181 += 99) * -1084587701 - 1] - this.field4176.method7120() & 255;
      return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.payload[(super.field4181 += 99) * -1084587701 - 1] - this.field4176.method7120() & 255);
   }

   public int method6500() {
      return super.payload[(super.field4181 += 99) * -1084587701 - 1] - this.field4176.method7120() & 255;
   }

   public int method6513(int var1) {
      return var1 * 8 - this.field4178;
   }

   public void method6497(int[] var1) {
      this.field4176 = new class400(var1);
   }

   public static class152 method6540(int var0) {
      class152 var2 = (class152)class152.field1696.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class152.field1697.method4920(11, var0);
         var2 = new class152();
         if (var3 != null) {
            var2.method2838(new Buffer(var3));
         }

         var2.method2840();
         class152.field1696.method4308(var2, (long)var0);
         return var2;
      }
   }
}
