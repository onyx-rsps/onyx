public class class181 {
   static class32 field2086;
   static final class181 field2089;
   static final class181 field2090;
   final int field2088;

   static {
      field2090 = new class181(0);
      field2089 = new class181(1);
   }

   class181(int var1) {
      this.field2088 = var1;
   }

   public static String method3578(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var4 = var0[var1];
         return var4 == null ? "null" : var4.toString();
      } else {
         int var9 = var2 + var1;
         int var5 = 0;

         for(int var6 = var1; var6 < var9; ++var6) {
            CharSequence var7 = var0[var6];
            if (var7 == null) {
               var5 += 4;
            } else {
               var5 += var7.length();
            }
         }

         StringBuilder var10 = new StringBuilder(var5);

         for(int var11 = var1; var11 < var9; ++var11) {
            CharSequence var8 = var0[var11];
            if (var8 == null) {
               var10.append("null");
            } else {
               var10.append(var8);
            }
         }

         return var10.toString();
      }
   }
}
