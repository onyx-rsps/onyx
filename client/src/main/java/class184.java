public class class184 implements class187 {
   int field2102;
   int field2103;
   int field2104;
   int field2105;
   int field2106;
   int field2107;

   class184() {
   }

   public boolean vmethod3650(int var1, int var2) {
      return var1 >> 6 == this.field2106 && var2 >> 6 == this.field2107;
   }

   public boolean vmethod3652(int var1, int var2, int var3) {
      if (var1 >= this.field2104 && var1 < this.field2102 + this.field2104) {
         return var2 >> 6 == this.field2103 && var3 >> 6 == this.field2105;
      } else {
         return false;
      }
   }

   public void vmethod3649(class167 var1) {
      if (var1.field1952 > this.field2106) {
         var1.field1952 = this.field2106;
      }

      if (var1.field1950 < this.field2106) {
         var1.field1950 = this.field2106;
      }

      if (var1.field1951 > this.field2107) {
         var1.field1951 = this.field2107;
      }

      if (var1.field1956 < this.field2107) {
         var1.field1956 = this.field2107;
      }

   }

   public class244 vmethod3653(int var1, int var2) {
      if (!this.vmethod3650(var1, var2)) {
         return null;
      } else {
         int var4 = this.field2103 * 64 - this.field2106 * 64 + var1;
         int var5 = this.field2105 * 64 - this.field2107 * 64 + var2;
         return new class244(this.field2104, var4, var5);
      }
   }

   public int[] vmethod3651(int var1, int var2, int var3) {
      if (!this.vmethod3652(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field2106 * 64 - this.field2103 * 64 + var2, var3 + (this.field2107 * 64 - this.field2105 * 64)};
         return var5;
      }
   }

   void method3601() {
   }

   public void vmethod3660(class384 var1) {
      this.field2104 = var1.method6560();
      this.field2102 = var1.method6560();
      this.field2103 = var1.method6655();
      this.field2105 = var1.method6655();
      this.field2106 = var1.method6655();
      this.field2107 = var1.method6655();
      this.method3601();
   }

   static void method3596(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;

      for(int var5 = 0; var5 < class150.field1686; ++var5) {
         class156 var6 = class10.method105(var5);
         if ((!var1 || var6.field1833) && var6.field1788 == -1 && var6.field1835.toLowerCase().indexOf(var0) != -1) {
            if (var4 >= 250) {
               class211.field2519 = -1;
               class77.field1136 = null;
               return;
            }

            if (var4 >= var3.length) {
               short[] var7 = new short[var3.length * 2];

               for(int var8 = 0; var8 < var4; ++var8) {
                  var7[var8] = var3[var8];
               }

               var3 = var7;
            }

            var3[var4++] = (short)var5;
         }
      }

      class77.field1136 = var3;
      class81.field1164 = 0;
      class211.field2519 = var4;
      String[] var9 = new String[class211.field2519];

      for(int var10 = 0; var10 < class211.field2519; ++var10) {
         var9[var10] = class10.method105(var3[var10]).field1835;
      }

      short[] var11 = class77.field1136;
      class291.method5149(var9, var11, 0, var9.length - 1);
   }
}
