public class class240 extends class353 {
   class22 field2884;
   class233 field2885;
   class237 field2890;
   class29 field2900;
   int field2882;
   int field2883;
   int field2886;
   int field2887;
   int field2888;
   int field2889;
   int field2891;
   int field2892;
   int field2893;
   int field2894;
   int field2895;
   int field2896;
   int field2897;
   int field2898;
   int field2899;
   int field2901;
   int field2902;

   class240() {
   }

   void method4613() {
      this.field2890 = null;
      this.field2884 = null;
      this.field2885 = null;
      this.field2900 = null;
   }

   static int method4608(class248 var0) {
      class352 var2 = (class352)client.field468.method6327(((long)var0.field2957 << 32) + (long)var0.field3030);
      return var2 != null ? var2.field3963 : var0.field2978;
   }

   public static String method4607(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var4 = var0;
         String var3;
         if (var1 && var0 >= 0) {
            int var5 = 2;

            for(int var6 = var0 / 10; var6 != 0; ++var5) {
               var6 /= 10;
            }

            char[] var7 = new char[var5];
            var7[0] = '+';

            for(int var8 = var5 - 1; var8 > 0; --var8) {
               int var9 = var4;
               var4 /= 10;
               int var10 = var9 - var4 * 10;
               if (var10 >= 10) {
                  var7[var8] = (char)(var10 + 87);
               } else {
                  var7[var8] = (char)(var10 + 48);
               }
            }

            var3 = new String(var7);
         } else {
            var3 = Integer.toString(var0, 10);
         }

         return var3;
      } else {
         return Integer.toString(var0);
      }
   }

   public static byte[] method4610(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var4 = (byte[])((byte[])var0);
         return var1 ? class204.method4130(var4) : var4;
      } else if (var0 instanceof class252) {
         class252 var3 = (class252)var0;
         return var3.vmethod4786();
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method4612(int var0, int var1) {
      class123 var3 = var0 >= 0 ? client.field637[var0] : class321.field3844;
      if (var3 != null && var1 >= 0 && var1 < var3.method2452()) {
         class105 var4 = (class105)var3.field1435.get(var1);
         if (var4.field1305 == -1) {
            String var5 = var4.field1302.method7141();
            class85 var6 = client.field452;
            class228 var7 = class148.method2788(class226.field2671, var6.field1204);
            var7.field2690.writeByte(3 + class280.method5040(var5));
            var7.field2690.writeByte(var0);
            var7.field2690.method6734(var1);
            var7.field2690.method6550(var5);
            var6.method2031(var7);
         }
      }
   }

   static final void method4611(class71 var0, int var1) {
      class321.method5676(var0.field1068, var0.field1058, var1);
   }
}
