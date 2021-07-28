public class class137 {
   static class396 field1519;
   public short[] field1515;
   public short[] field1518;

   public class137(int var1) {
      class156 var2 = class10.method105(var1);
      if (var2.method2995()) {
         this.field1515 = new short[var2.field1796.length];
         System.arraycopy(var2.field1796, 0, this.field1515, 0, this.field1515.length);
      }

      if (var2.method2996()) {
         this.field1518 = new short[var2.field1798.length];
         System.arraycopy(var2.field1798, 0, this.field1518, 0, this.field1518.length);
      }

   }

   public static void method2617(class276 var0, class276 var1, class276 var2, class276 var3) {
      class248.field2950 = var0;
      class92.field1241 = var1;
      class26.field217 = var2;
      class55.field830 = var3;
      class248.field3038 = new class248[class248.field2950.method4932()][];
      class100.field1281 = new boolean[class248.field2950.method4932()];
   }

   static final void method2615(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class199 var8, class159[] var9) {
      class384 var11 = new class384(var0);
      int var12 = -1;

      while(true) {
         int var13 = var11.method6783();
         if (var13 == 0) {
            return;
         }

         var12 += var13;
         int var14 = 0;

         while(true) {
            int var15 = var11.method6574();
            if (var15 == 0) {
               break;
            }

            var14 += var15 - 1;
            int var16 = var14 & 63;
            int var17 = var14 >> 6 & 63;
            int var18 = var14 >> 12;
            int var19 = var11.method6560();
            int var20 = var19 >> 2;
            int var21 = var19 & 3;
            if (var18 == var4 && var17 >= var5 && var17 < var5 + 8 && var16 >= var6 && var16 < var6 + 8) {
               class155 var22 = class123.method2465(var12);
               int var25 = var17 & 7;
               int var26 = var16 & 7;
               int var28 = var22.field1749;
               int var29 = var22.field1750;
               int var30;
               if ((var21 & 1) == 1) {
                  var30 = var28;
                  var28 = var29;
                  var29 = var30;
               }

               int var27 = var7 & 3;
               int var24;
               if (var27 == 0) {
                  var24 = var25;
               } else if (var27 == 1) {
                  var24 = var26;
               } else if (var27 == 2) {
                  var24 = 7 - var25 - (var28 - 1);
               } else {
                  var24 = 7 - var26 - (var29 - 1);
               }

               var30 = var2 + var24;
               int var31 = var3 + class168.method3383(var17 & 7, var16 & 7, var7, var22.field1749, var22.field1750, var21);
               if (var30 > 0 && var31 > 0 && var30 < 103 && var31 < 103) {
                  int var32 = var1;
                  if ((class61.field900[1][var30][var31] & 2) == 2) {
                     var32 = var1 - 1;
                  }

                  class159 var33 = null;
                  if (var32 >= 0) {
                     var33 = var9[var32];
                  }

                  client.method1314(var1, var30, var31, var12, var21 + var7 & 3, var20, var8, var33);
               }
            }
         }
      }
   }

   static int method2616(class47 var0, class47 var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var5 = var0.field698;
         int var6 = var1.field698;
         if (!var3) {
            if (var5 == -1) {
               var5 = 2001;
            }

            if (var6 == -1) {
               var6 = 2001;
            }
         }

         return var5 - var6;
      } else if (var2 == 2) {
         return var0.field701 - var1.field701;
      } else if (var2 == 3) {
         if (var0.field689.equals("-")) {
            if (var1.field689.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field689.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field689.compareTo(var1.field689);
         }
      } else if (var2 == 4) {
         return var0.method1320() ? (var1.method1320() ? 0 : 1) : (var1.method1320() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1318() ? (var1.method1318() ? 0 : 1) : (var1.method1318() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method1319() ? (var1.method1319() ? 0 : 1) : (var1.method1319() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.method1317() ? (var1.method1317() ? 0 : 1) : (var1.method1317() ? -1 : 0);
      } else {
         return var0.field696 - var1.field696;
      }
   }
}
