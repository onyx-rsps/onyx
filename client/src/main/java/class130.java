import java.io.File;

public class class130 {
   public static class369 field1470;
   public static class369 field1476;
   public static class369 field1478;
   static File field1474;
   static File field1475;

   static {
      field1470 = null;
      field1476 = null;
      field1478 = null;
   }

   static final int method2549(class248 var0, int var1) {
      if (var0.field3079 != null && var1 < var0.field3079.length) {
         try {
            int[] var3 = var0.field3079[var1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while(true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if (var7 == 0) {
                  return var4;
               }

               if (var7 == 1) {
                  var8 = client.field434[var3[var5++]];
               }

               if (var7 == 2) {
                  var8 = client.field540[var3[var5++]];
               }

               if (var7 == 3) {
                  var8 = client.field541[var3[var5++]];
               }

               int var10;
               class248 var11;
               int var12;
               int var13;
               if (var7 == 4) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class86.method2063(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class10.method105(var12).field1807 || client.field561)) {
                     for(var13 = 0; var13 < var11.field3085.length; ++var13) {
                        if (var12 + 1 == var11.field3085[var13]) {
                           var8 += var11.field3086[var13];
                        }
                     }
                  }
               }

               if (var7 == 5) {
                  var8 = class243.field2910[var3[var5++]];
               }

               if (var7 == 6) {
                  var8 = class258.field3167[client.field540[var3[var5++]] - 1];
               }

               if (var7 == 7) {
                  var8 = class243.field2910[var3[var5++]] * 100 / '\ub71b';
               }

               if (var7 == 8) {
                  var8 = class19.field139.field990;
               }

               if (var7 == 9) {
                  for(var10 = 0; var10 < 25; ++var10) {
                     if (class258.field3169[var10]) {
                        var8 += client.field540[var10];
                     }
                  }
               }

               if (var7 == 10) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class86.method2063(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class10.method105(var12).field1807 || client.field561)) {
                     for(var13 = 0; var13 < var11.field3085.length; ++var13) {
                        if (var12 + 1 == var11.field3085[var13]) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var7 == 11) {
                  var8 = client.field431;
               }

               if (var7 == 12) {
                  var8 = client.field575;
               }

               if (var7 == 13) {
                  var10 = class243.field2910[var3[var5++]];
                  int var14 = var3[var5++];
                  var8 = (var10 & 1 << var14) != 0 ? 1 : 0;
               }

               if (var7 == 14) {
                  var10 = var3[var5++];
                  var8 = class174.method3506(var10);
               }

               if (var7 == 15) {
                  var9 = 1;
               }

               if (var7 == 16) {
                  var9 = 2;
               }

               if (var7 == 17) {
                  var9 = 3;
               }

               if (var7 == 18) {
                  var8 = (class19.field139.field1068 >> 7) + class280.field3624;
               }

               if (var7 == 19) {
                  var8 = (class19.field139.field1058 >> 7) + class77.field1133;
               }

               if (var7 == 20) {
                  var8 = var3[var5++];
               }

               if (var9 == 0) {
                  if (var6 == 0) {
                     var4 += var8;
                  }

                  if (var6 == 1) {
                     var4 -= var8;
                  }

                  if (var6 == 2 && var8 != 0) {
                     var4 /= var8;
                  }

                  if (var6 == 3) {
                     var4 *= var8;
                  }

                  var6 = 0;
               } else {
                  var6 = var9;
               }
            }
         } catch (Exception var15) {
            return -1;
         }
      } else {
         return -2;
      }
   }
}
