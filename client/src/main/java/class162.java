public class class162 extends class176 {
   class162() {
   }

   void method3146(class384 var1) {
      int var3 = var1.method6560();
      if (var3 != class182.field2095.field2093) {
         throw new IllegalStateException("");
      } else {
         super.field2060 = var1.method6560();
         super.field2051 = var1.method6560();
         super.field2050 = var1.method6655();
         super.field2047 = var1.method6655();
         super.field2048 = var1.method6655();
         super.field2052 = var1.method6655();
         super.field2046 = var1.method6577();
         super.field2053 = var1.method6577();
      }
   }

   void vmethod3544(class384 var1) {
      super.field2051 = Math.min(super.field2051, 4);
      super.field2054 = new short[1][64][64];
      super.field2061 = new short[super.field2051][64][64];
      super.field2056 = new byte[super.field2051][64][64];
      super.field2057 = new byte[super.field2051][64][64];
      super.field2058 = new class178[super.field2051][64][64][];
      int var3 = var1.method6560();
      if (var3 != class181.field2090.field2088) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.method6560();
         int var5 = var1.method6560();
         if (var4 == super.field2048 && var5 == super.field2052) {
            for(int var6 = 0; var6 < 64; ++var6) {
               for(int var7 = 0; var7 < 64; ++var7) {
                  this.method3563(var6, var7, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class162)) {
         return false;
      } else {
         class162 var2 = (class162)var1;
         return var2.field2048 == super.field2048 && super.field2052 == var2.field2052;
      }
   }

   public int hashCode() {
      return super.field2048 | super.field2052 << 8;
   }

   static final void method3145(int var0, int var1) {
      if (class250.method4757(var0)) {
         class76.method1886(class248.field3038[var0], var1);
      }
   }

   static int method3156(int var0, class58 var1, boolean var2) {
      if (var0 >= 7200 && var0 < 7204) {
         class50.field745 -= 5;
         class50.field746[++class50.field745 - 1] = -1;
         return 1;
      } else if (var0 == 7204) {
         class50.field745 -= 6;
         class50.field746[++class50.field745 - 1] = -1;
         return 1;
      } else if (var0 >= 7205 && var0 < 7209) {
         class50.field746[class50.field745 - 1] = -1;
         return 1;
      } else if (var0 == 7209) {
         class50.field745 -= 2;
         class50.field746[++class50.field745 - 1] = -1;
         return 1;
      } else if (var0 >= 7210 && var0 < 7214) {
         --class50.field745;
         return 1;
      } else if (var0 == 7214) {
         class50.field745 -= 2;
         return 1;
      } else {
         return 2;
      }
   }
}
