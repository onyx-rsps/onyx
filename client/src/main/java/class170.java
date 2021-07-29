public class class170 extends class176 {
   int field1992;
   int field1993;
   int field1994;
   int field1995;

   class170() {
   }

   int method3458() {
      return this.field1994;
   }

   int method3449() {
      return this.field1992;
   }

   int method3453() {
      return this.field1995;
   }

   void vmethod3544(Buffer var1) {
      super.field2051 = Math.min(super.field2051, 4);
      super.field2054 = new short[1][64][64];
      super.field2061 = new short[super.field2051][64][64];
      super.field2056 = new byte[super.field2051][64][64];
      super.field2057 = new byte[super.field2051][64][64];
      super.field2058 = new class178[super.field2051][64][64][];
      int var3 = var1.method6560();
      if (var3 != class181.field2089.field2088) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.method6560();
         int var5 = var1.method6560();
         int var6 = var1.method6560();
         int var7 = var1.method6560();
         if (var4 == super.field2048 && var5 == super.field2052 && var6 == this.field1994 && var7 == this.field1992) {
            for(int var8 = 0; var8 < 8; ++var8) {
               for(int var9 = 0; var9 < 8; ++var9) {
                  this.method3563(var8 + this.field1994 * 8, var9 + this.field1992 * 8, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   void method3442(Buffer var1) {
      int var3 = var1.method6560();
      if (var3 != class182.field2094.field2093) {
         throw new IllegalStateException("");
      } else {
         super.field2060 = var1.method6560();
         super.field2051 = var1.method6560();
         super.field2050 = var1.method6655();
         super.field2047 = var1.method6655();
         this.field1995 = var1.method6560();
         this.field1993 = var1.method6560();
         super.field2048 = var1.method6655();
         super.field2052 = var1.method6655();
         this.field1994 = var1.method6560();
         this.field1992 = var1.method6560();
         super.field2046 = var1.method6577();
         super.field2053 = var1.method6577();
      }
   }

   int method3447() {
      return this.field1993;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class170)) {
         return false;
      } else {
         class170 var2 = (class170)var1;
         if (super.field2048 == var2.field2048 && super.field2052 == var2.field2052) {
            return var2.field1994 == this.field1994 && var2.field1992 == this.field1992;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return super.field2048 | super.field2052 << 8 | this.field1994 << 16 | this.field1992 << 24;
   }
}
