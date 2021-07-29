public class class174 implements class187 {
   int field2021;
   int field2022;
   int field2023;
   int field2024;
   int field2025;
   int field2026;
   int field2027;
   int field2028;
   int field2029;
   int field2030;
   int field2031;
   int field2032;
   int field2033;
   int field2034;

   class174() {
   }

   public boolean vmethod3650(int var1, int var2) {
      return var1 >= (this.field2025 << 6) + (this.field2021 << 3) && var1 <= (this.field2025 << 6) + (this.field2033 << 3) + 7 && var2 >= (this.field2032 << 6) + (this.field2023 << 3) && var2 <= (this.field2032 << 6) + (this.field2034 << 3) + 7;
   }

   public boolean vmethod3652(int var1, int var2, int var3) {
      if (var1 >= this.field2031 && var1 < this.field2031 + this.field2022) {
         return var2 >= (this.field2028 << 6) + (this.field2027 << 3) && var2 <= (this.field2028 << 6) + (this.field2029 << 3) + 7 && var3 >= (this.field2026 << 6) + (this.field2030 << 3) && var3 <= (this.field2026 << 6) + (this.field2024 << 3) + 7;
      } else {
         return false;
      }
   }

   public void vmethod3649(class167 var1) {
      if (var1.field1952 > this.field2025) {
         var1.field1952 = this.field2025;
      }

      if (var1.field1950 < this.field2025) {
         var1.field1950 = this.field2025;
      }

      if (var1.field1951 > this.field2032) {
         var1.field1951 = this.field2032;
      }

      if (var1.field1956 < this.field2032) {
         var1.field1956 = this.field2032;
      }

   }

   public class244 vmethod3653(int var1, int var2) {
      if (!this.vmethod3650(var1, var2)) {
         return null;
      } else {
         int var4 = this.field2028 * 64 - this.field2025 * 64 + (this.field2027 * 8 - this.field2021 * 8) + var1;
         int var5 = this.field2026 * 64 - this.field2032 * 64 + var2 + (this.field2030 * 8 - this.field2023 * 8);
         return new class244(this.field2031, var4, var5);
      }
   }

   public int[] vmethod3651(int var1, int var2, int var3) {
      if (!this.vmethod3652(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field2025 * 64 - this.field2028 * 64 + var2 + (this.field2021 * 8 - this.field2027 * 8), var3 + (this.field2032 * 64 - this.field2026 * 64) + (this.field2023 * 8 - this.field2030 * 8)};
         return var5;
      }
   }

   public void vmethod3660(Buffer var1) {
      this.field2031 = var1.method6560();
      this.field2022 = var1.method6560();
      this.field2028 = var1.method6655();
      this.field2027 = var1.method6560();
      this.field2029 = var1.method6560();
      this.field2026 = var1.method6655();
      this.field2030 = var1.method6560();
      this.field2024 = var1.method6560();
      this.field2025 = var1.method6655();
      this.field2021 = var1.method6560();
      this.field2033 = var1.method6560();
      this.field2032 = var1.method6655();
      this.field2023 = var1.method6560();
      this.field2034 = var1.method6560();
      this.method3512();
   }

   void method3512() {
   }

   public static int method3506(int var0) {
      class151 var3 = (class151)class151.field1688.method4306((long)var0);
      class151 var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var8 = class151.field1691.method4920(14, var0);
         var3 = new class151();
         if (var8 != null) {
            var3.method2827(new Buffer(var8));
         }

         class151.field1688.method4308(var3, (long)var0);
         var2 = var3;
      }

      int var4 = var2.field1689;
      int var5 = var2.field1694;
      int var6 = var2.field1687;
      int var7 = class243.field2916[var6 - var5];
      return class243.field2910[var4] >> var5 & var7;
   }

   static final void method3507() {
      if (client.field570 > 0) {
         class144.method2732();
      } else {
         client.field457.method5575();
         class16.method163(40);
         client.field644 = client.field452.method2036();
         client.field452.method2029();
      }
   }

   public static class376 method3524(int var0) {
      int var2 = class374.field4154[var0];
      if (var2 == 1) {
         return class376.field4163;
      } else if (var2 == 2) {
         return class376.field4164;
      } else {
         return var2 == 3 ? class376.field4159 : null;
      }
   }
}
