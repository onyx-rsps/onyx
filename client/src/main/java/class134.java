public class class134 extends class136 {
   int field1499;
   int field1500;
   int field1503;
   int field1504;
   long field1502;
   long[] field1501;

   public class134() {
      this.field1501 = new long[10];
      this.field1499 = 256;
      this.field1500 = 1;
      this.field1504 = 0;
      this.field1502 = class86.currentTime();

      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1501[var1] = this.field1502;
      }

   }

   public int vmethod2612(int var1, int var2) {
      int var4 = this.field1499;
      int var5 = this.field1500;
      this.field1499 = 300;
      this.field1500 = 1;
      this.field1502 = class86.currentTime();
      if (this.field1501[this.field1503] == 0L) {
         this.field1499 = var4;
         this.field1500 = var5;
      } else if (this.field1502 > this.field1501[this.field1503]) {
         this.field1499 = (int)((long)(var1 * 2560) / (this.field1502 - this.field1501[this.field1503]));
      }

      if (this.field1499 < 25) {
         this.field1499 = 25;
      }

      if (this.field1499 > 256) {
         this.field1499 = 256;
         this.field1500 = (int)((long)var1 - (this.field1502 - this.field1501[this.field1503]) / 10L);
      }

      if (this.field1500 > var1) {
         this.field1500 = var1;
      }

      this.field1501[this.field1503] = this.field1502;
      this.field1503 = (this.field1503 + 1) % 10;
      int var6;
      if (this.field1500 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if (0L != this.field1501[var6]) {
               this.field1501[var6] += (long)this.field1500;
            }
         }
      }

      if (this.field1500 < var2) {
         this.field1500 = var2;
      }

      class209.method4249((long)this.field1500);

      for(var6 = 0; this.field1504 < 256; this.field1504 += this.field1499) {
         ++var6;
      }

      this.field1504 &= 255;
      return var6;
   }

   public void vmethod2605() {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.field1501[var2] = 0L;
      }

   }

   public static void method2602() {
      class153.field1703.method4309();
   }

   static void method2603() {
      class368 var1 = null;

      try {
         var1 = class77.method1897("", class68.field975.field3207, true);
         class384 var2 = class37.field307.method1875();
         var1.method6364(var2.payload, 0, var2.field4181 * -1084587701);
      } catch (Exception var4) {
      }

      try {
         if (var1 != null) {
            var1.method6371(true);
         }
      } catch (Exception var3) {
      }

   }
}
