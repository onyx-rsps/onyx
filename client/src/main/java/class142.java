public class class142 extends class348 {
   public static class27 field1575;
   public static class276 field1564;
   public static int field1563;
   static class222 field1567;
   static int field1577;
   int[] field1562;
   int[] field1566;
   short[] field1568;
   short[] field1569;
   short[] field1570;
   short[] field1571;
   public boolean field1572;
   public int field1565;

   static {
      field1567 = new class222(64);
   }

   class142() {
      this.field1565 = -1;
      this.field1562 = new int[]{-1, -1, -1, -1, -1};
      this.field1572 = false;
   }

   void method2690(class384 var1, int var2) {
      if (var2 == 1) {
         this.field1565 = var1.method6560();
      } else {
         int var4;
         int var5;
         if (var2 == 2) {
            var4 = var1.method6560();
            this.field1566 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1566[var5] = var1.method6655();
            }
         } else if (var2 == 3) {
            this.field1572 = true;
         } else if (var2 == 40) {
            var4 = var1.method6560();
            this.field1571 = new short[var4];
            this.field1568 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1571[var5] = (short)var1.method6655();
               this.field1568[var5] = (short)var1.method6655();
            }
         } else if (var2 == 41) {
            var4 = var1.method6560();
            this.field1569 = new short[var4];
            this.field1570 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1569[var5] = (short)var1.method6655();
               this.field1570[var5] = (short)var1.method6655();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.field1562[var2 - 60] = var1.method6655();
         }
      }

   }

   public boolean method2686() {
      boolean var2 = true;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.field1562[var3] != -1 && !class75.field1119.method5008(this.field1562[var3], 0)) {
            var2 = false;
         }
      }

      return var2;
   }

   public class192 method2692() {
      class192[] var2 = new class192[5];
      int var3 = 0;

      for(int var4 = 0; var4 < 5; ++var4) {
         if (this.field1562[var4] != -1) {
            var2[var3++] = class192.method3720(class75.field1119, this.field1562[var4], 0);
         }
      }

      class192 var6 = new class192(var2, var3);
      int var5;
      if (this.field1571 != null) {
         for(var5 = 0; var5 < this.field1571.length; ++var5) {
            var6.method3766(this.field1571[var5], this.field1568[var5]);
         }
      }

      if (this.field1569 != null) {
         for(var5 = 0; var5 < this.field1569.length; ++var5) {
            var6.method3733(this.field1569[var5], this.field1570[var5]);
         }
      }

      return var6;
   }

   public boolean method2687() {
      if (this.field1566 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field1566.length; ++var3) {
            if (!class75.field1119.method5008(this.field1566[var3], 0)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   void method2688(class384 var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2690(var1, var3);
      }
   }

   public class192 method2709() {
      if (this.field1566 == null) {
         return null;
      } else {
         class192[] var2 = new class192[this.field1566.length];

         for(int var3 = 0; var3 < this.field1566.length; ++var3) {
            var2[var3] = class192.method3720(class75.field1119, this.field1566[var3], 0);
         }

         class192 var5;
         if (var2.length == 1) {
            var5 = var2[0];
         } else {
            var5 = new class192(var2, var2.length);
         }

         int var4;
         if (this.field1571 != null) {
            for(var4 = 0; var4 < this.field1571.length; ++var4) {
               var5.method3766(this.field1571[var4], this.field1568[var4]);
            }
         }

         if (this.field1569 != null) {
            for(var4 = 0; var4 < this.field1569.length; ++var4) {
               var5.method3733(this.field1569[var4], this.field1570[var4]);
            }
         }

         return var5;
      }
   }

   public static boolean method2710() {
      return client.field576 >= 2;
   }
}
