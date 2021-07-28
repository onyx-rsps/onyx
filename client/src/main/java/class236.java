public class class236 {
   static final byte[] field2858;
   class384 field2865;
   int field2852;
   int field2853;
   int[] field2854;
   int[] field2855;
   int[] field2856;
   int[] field2857;
   long field2861;

   static {
      field2858 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   }

   class236(byte[] var1) {
      this.field2865 = new class384((byte[])null);
      this.method4508(var1);
   }

   class236() {
      this.field2865 = new class384((byte[])null);
   }

   int method4514(int var1) {
      byte var2 = this.field2865.payload[this.field2865.field4181 * -1084587701];
      class384 var10000;
      int var5;
      if (var2 < 0) {
         var5 = var2 & 255;
         this.field2857[var1] = var5;
         var10000 = this.field2865;
         var10000.field4181 += 99;
      } else {
         var5 = this.field2857[var1];
      }

      if (var5 != 240 && var5 != 247) {
         return this.method4518(var1, var5);
      } else {
         int var3 = this.field2865.method6578();
         if (var5 == 247 && var3 > 0) {
            int var4 = this.field2865.payload[this.field2865.field4181 * -1084587701] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               var10000 = this.field2865;
               var10000.field4181 += 99;
               this.field2857[var1] = var4;
               return this.method4518(var1, var4);
            }
         }

         var10000 = this.field2865;
         var10000.field4181 = (var10000.field4181 * -1084587701 + var3) * 99;
         return 0;
      }
   }

   void method4509() {
      this.field2865.payload = null;
      this.field2854 = null;
      this.field2855 = null;
      this.field2856 = null;
      this.field2857 = null;
   }

   boolean method4558() {
      return this.field2865.payload != null;
   }

   void method4508(byte[] var1) {
      this.field2865.payload = var1;
      this.field2865.field4181 = 990;
      int var2 = this.field2865.method6655();
      this.field2853 = this.field2865.method6655();
      this.field2852 = 500000;
      this.field2854 = new int[var2];

      class384 var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.field4181 = (var10000.field4181 * -1084587701 + var5) * 99) {
         int var4 = this.field2865.method6784();
         var5 = this.field2865.method6784();
         if (var4 == 1297379947) {
            this.field2854[var3] = this.field2865.field4181 * -1084587701;
            ++var3;
         }

         var10000 = this.field2865;
      }

      this.field2861 = 0L;
      this.field2855 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field2855[var3] = this.field2854[var3];
      }

      this.field2856 = new int[var2];
      this.field2857 = new int[var2];
   }

   void method4520(int var1) {
      this.field2865.field4181 = this.field2855[var1] * 99;
   }

   int method4530() {
      int var1 = this.field2855.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field2855[var4] >= 0 && this.field2856[var4] < var3) {
            var2 = var4;
            var3 = this.field2856[var4];
         }
      }

      return var2;
   }

   int method4511() {
      return this.field2855.length;
   }

   int method4516(int var1) {
      int var2 = this.method4514(var1);
      return var2;
   }

   void method4515(int var1) {
      int var2 = this.field2865.method6578();
      int[] var10000 = this.field2856;
      var10000[var1] += var2;
   }

   int method4518(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.field2865.method6560();
         var4 = this.field2865.method6578();
         class384 var10000;
         if (var7 == 47) {
            var10000 = this.field2865;
            var10000.field4181 = (var10000.field4181 * -1084587701 + var4) * 99;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.field2865.method6564();
            var4 -= 3;
            int var6 = this.field2856[var1];
            this.field2861 += (long)var6 * (long)(this.field2852 - var5);
            this.field2852 = var5;
            var10000 = this.field2865;
            var10000.field4181 = (var10000.field4181 * -1084587701 + var4) * 99;
            return 2;
         } else {
            var10000 = this.field2865;
            var10000.field4181 = (var10000.field4181 * -1084587701 + var4) * 99;
            return 3;
         }
      } else {
         byte var3 = field2858[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.field2865.method6560() << 8;
         }

         if (var3 >= 2) {
            var4 |= this.field2865.method6560() << 16;
         }

         return var4;
      }
   }

   long method4517(int var1) {
      return this.field2861 + (long)var1 * (long)this.field2852;
   }

   void method4533() {
      this.field2865.field4181 = -1 * 99;
   }

   void method4513(int var1) {
      this.field2855[var1] = this.field2865.field4181 * -1084587701;
   }

   boolean method4557() {
      int var1 = this.field2855.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field2855[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void method4522(long var1) {
      this.field2861 = var1;
      int var3 = this.field2855.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2856[var4] = 0;
         this.field2857[var4] = 0;
         this.field2865.field4181 = this.field2854[var4] * 99;
         this.method4515(var4);
         this.field2855[var4] = this.field2865.field4181 * -1084587701;
      }

   }
}
