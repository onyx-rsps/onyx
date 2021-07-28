public final class class301 extends class302 {
   public class301(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class301(byte[] var1) {
      super(var1);
   }

   final void vmethod5393(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var3 * class393.field4244 + var2;
      int var8 = class393.field4244 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < class393.field4246) {
         var11 = class393.field4246 - var3;
         var5 -= var11;
         var3 = class393.field4246;
         var10 += var11 * var4;
         var7 += var11 * class393.field4244;
      }

      if (var3 + var5 > class393.field4243) {
         var5 -= var3 + var5 - class393.field4243;
      }

      if (var2 < class393.field4248) {
         var11 = class393.field4248 - var2;
         var4 -= var11;
         var2 = class393.field4248;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var2 + var4 > class393.field4247) {
         var11 = var2 + var4 - class393.field4247;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         class302.method5388(class393.field4249, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   final void vmethod5364(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 * class393.field4244 + var2;
      int var9 = class393.field4244 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < class393.field4246) {
         var12 = class393.field4246 - var3;
         var5 -= var12;
         var3 = class393.field4246;
         var11 += var12 * var4;
         var8 += var12 * class393.field4244;
      }

      if (var3 + var5 > class393.field4243) {
         var5 -= var3 + var5 - class393.field4243;
      }

      if (var2 < class393.field4248) {
         var12 = class393.field4248 - var2;
         var4 -= var12;
         var2 = class393.field4248;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (var2 + var4 > class393.field4247) {
         var12 = var2 + var4 - class393.field4247;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         class302.method5390(class393.field4249, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
