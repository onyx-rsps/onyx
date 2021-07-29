import java.util.LinkedList;

public abstract class class176 {
   boolean field2055;
   boolean field2059;
   byte[][][] field2056;
   byte[][][] field2057;
   class178[][][][] field2058;
   int field2046;
   int field2047;
   int field2048;
   int field2050;
   int field2051;
   int field2052;
   int field2053;
   int field2060;
   short[][][] field2054;
   short[][][] field2061;

   class176() {
      this.field2046 = -1;
      this.field2053 = -1;
      new LinkedList();
      this.field2059 = false;
      this.field2055 = false;
   }

   boolean method3549() {
      return this.field2059 && this.field2055;
   }

   void method3537() {
      this.field2054 = null;
      this.field2061 = null;
      this.field2056 = null;
      this.field2057 = null;
      this.field2058 = null;
      this.field2059 = false;
      this.field2055 = false;
   }

   void method3541(int var1, int var2, Buffer var3, int var4) {
      int var6 = ((var4 & 24) >> 3) + 1;
      boolean var7 = (var4 & 2) != 0;
      boolean var8 = (var4 & 4) != 0;
      this.field2054[0][var1][var2] = (short)var3.method6560();
      int var9;
      int var10;
      int var12;
      if (var7) {
         var9 = var3.method6560();

         for(var10 = 0; var10 < var9; ++var10) {
            int var11 = var3.method6560();
            if (var11 != 0) {
               this.field2061[var10][var1][var2] = (short)var11;
               var12 = var3.method6560();
               this.field2056[var10][var1][var2] = (byte)(var12 >> 2);
               this.field2057[var10][var1][var2] = (byte)(var12 & 3);
            }
         }
      }

      if (var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var3.method6560();
            if (var10 != 0) {
               class178[] var15 = this.field2058[var9][var1][var2] = new class178[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  int var13 = var3.method6577();
                  int var14 = var3.method6560();
                  var15[var12] = new class178(var13, var14 >> 2, var14 & 3);
               }
            }
         }
      }

   }

   void method3542(int var1, int var2, Buffer var3, int var4) {
      boolean var6 = (var4 & 2) != 0;
      if (var6) {
         this.field2061[0][var1][var2] = (short)var3.method6560();
      }

      this.field2054[0][var1][var2] = (short)var3.method6560();
   }

   void method3539(class276 var1) {
      if (!this.method3549()) {
         byte[] var3 = var1.method4920(this.field2046, this.field2053);
         if (var3 != null) {
            this.vmethod3544(new Buffer(var3));
            this.field2059 = true;
            this.field2055 = true;
         }

      }
   }

   int method3545() {
      return this.field2048;
   }

   int method3543() {
      return this.field2052;
   }

   abstract void vmethod3544(Buffer var1);

   void method3563(int var1, int var2, Buffer var3) {
      int var5 = var3.method6560();
      if (var5 != 0) {
         if ((var5 & 1) != 0) {
            this.method3542(var1, var2, var3, var5);
         } else {
            this.method3541(var1, var2, var3, var5);
         }

      }
   }
}
