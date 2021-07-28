public class class27 {
   class276 field221;
   class276 field222;
   class363 field220;
   class363 field227;

   public class27(class276 var1, class276 var2) {
      this.field227 = new class363(256);
      this.field220 = new class363(256);
      this.field222 = var1;
      this.field221 = var2;
   }

   class22 method532(int var1, int var2, int[] var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5;
      class22 var8 = (class22)this.field220.method6327(var6);
      if (var8 != null) {
         return var8;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class21 var9 = class21.method417(this.field222, var1, var2);
         if (var9 == null) {
            return null;
         } else {
            var8 = var9.method411();
            this.field220.method6318(var8, var6);
            if (var3 != null) {
               var3[0] -= var8.field164.length;
            }

            return var8;
         }
      }
   }

   class22 method536(int var1, int var2, int[] var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      class22 var8 = (class22)this.field220.method6327(var6);
      if (var8 != null) {
         return var8;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class34 var9 = (class34)this.field227.method6327(var6);
         if (var9 == null) {
            var9 = class34.method767(this.field221, var1, var2);
            if (var9 == null) {
               return null;
            }

            this.field227.method6318(var9, var6);
         }

         var8 = var9.method757(var3);
         if (var8 == null) {
            return null;
         } else {
            var9.method6014();
            this.field220.method6318(var8, var6);
            return var8;
         }
      }
   }

   public class22 method534(int var1, int[] var2) {
      if (this.field222.method4932() == 1) {
         return this.method532(0, var1, var2);
      } else if (this.field222.method4946(var1) == 1) {
         return this.method532(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   public class22 method535(int var1, int[] var2) {
      if (this.field221.method4932() == 1) {
         return this.method536(0, var1, var2);
      } else if (this.field221.method4946(var1) == 1) {
         return this.method536(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   static void method543(class248 var0, int var1, int var2) {
      if (var0.field3062 == 0) {
         var0.field2970 = var0.field2946;
      } else if (var0.field3062 == 1) {
         var0.field2970 = var0.field2946 + (var1 - var0.field2972) / 2;
      } else if (var0.field3062 == 2) {
         var0.field2970 = var1 - var0.field2972 - var0.field2946;
      } else if (var0.field3062 == 3) {
         var0.field2970 = var0.field2946 * var1 >> 14;
      } else if (var0.field3062 == 4) {
         var0.field2970 = (var1 - var0.field2972) / 2 + (var0.field2946 * var1 >> 14);
      } else {
         var0.field2970 = var1 - var0.field2972 - (var0.field2946 * var1 >> 14);
      }

      if (var0.field2963 == 0) {
         var0.field2971 = var0.field3018;
      } else if (var0.field2963 == 1) {
         var0.field2971 = (var2 - var0.field2989) / 2 + var0.field3018;
      } else if (var0.field2963 == 2) {
         var0.field2971 = var2 - var0.field2989 - var0.field3018;
      } else if (var0.field2963 == 3) {
         var0.field2971 = var2 * var0.field3018 >> 14;
      } else if (var0.field2963 == 4) {
         var0.field2971 = (var2 - var0.field2989) / 2 + (var2 * var0.field3018 >> 14);
      } else {
         var0.field2971 = var2 - var0.field2989 - (var2 * var0.field3018 >> 14);
      }

   }

   static final void method542(class53 var0, int var1, int var2) {
      class121.method2421(var0.field790, var0.field786, var0.field785, var0.field788, var0.field789, var0.field789, var1, var2);
   }
}
