public class class67 extends class353 {
   boolean field963;
   class248 field957;
   class248 field960;
   int field952;
   int field955;
   int field956;
   int field958;
   int field959;
   int field961;
   int field962;
   Object[] field954;
   String field951;

   public class67() {
      this.field962 = 76;
   }

   public void method1732(Object[] var1) {
      this.field954 = var1;
   }

   public void method1733(int var1) {
      this.field962 = var1;
   }

   static void method1741(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method1741(var0, var1, var2, var6 - 1);
         method1741(var0, var1, var6 + 1, var3);
      }

   }

   static int method1739() {
      if (client.field680 != null && client.field681 < client.field680.size()) {
         int var1 = 0;

         for(int var2 = 0; var2 <= client.field681; ++var2) {
            var1 += ((class63)client.field680.get(var2)).field926;
         }

         return var1 * 10000 / client.field682;
      } else {
         return 10000;
      }
   }
}
