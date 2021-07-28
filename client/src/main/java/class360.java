public class class360 {
   public static final class360 field4084;
   public static final class360 field4085;
   public static final class360 field4086;
   public static final class360 field4087;
   public static final class360 field4092;
   public static final class360 field4095;
   String field4089;

   static {
      field4084 = new class360("p11_full");
      field4092 = new class360("p12_full");
      field4085 = new class360("b12_full");
      field4086 = new class360("verdana_11pt_regular");
      field4087 = new class360("verdana_13pt_regular");
      field4095 = new class360("verdana_15pt_regular");
   }

   class360(String var1) {
      this.field4089 = var1;
   }

   static int method6283(int var0, class58 var1, boolean var2) {
      boolean var4 = true;
      class248 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = class86.method2063(class50.field746[--class50.field745]);
         var4 = false;
      } else {
         var5 = var2 ? class285.field3659 : class50.field749;
      }

      int var12;
      if (var0 == 1300) {
         var12 = class50.field746[--class50.field745] - 1;
         if (var12 >= 0 && var12 <= 9) {
            var5.method4691(var12, class50.field737[--class1.field3]);
            return 1;
         } else {
            --class1.field3;
            return 1;
         }
      } else {
         int var7;
         if (var0 == 1301) {
            class50.field745 -= 2;
            var12 = class50.field746[class50.field745];
            var7 = class50.field746[class50.field745 + 1];
            var5.field3063 = class49.method1437(var12, var7);
            return 1;
         } else if (var0 == 1302) {
            var5.field3052 = class50.field746[--class50.field745] == 1;
            return 1;
         } else if (var0 == 1303) {
            var5.field3039 = class50.field746[--class50.field745];
            return 1;
         } else if (var0 == 1304) {
            var5.field2956 = class50.field746[--class50.field745];
            return 1;
         } else if (var0 == 1305) {
            var5.field3036 = class50.field737[--class1.field3];
            return 1;
         } else if (var0 == 1306) {
            var5.field3042 = class50.field737[--class1.field3];
            return 1;
         } else if (var0 == 1307) {
            var5.field3037 = null;
            return 1;
         } else if (var0 == 1308) {
            var5.field3103 = class50.field746[--class50.field745] == 1;
            return 1;
         } else if (var0 == 1309) {
            --class50.field745;
            return 1;
         } else {
            int var8;
            byte[] var10;
            if (var0 != 1350) {
               byte var6;
               if (var0 == 1351) {
                  class50.field745 -= 2;
                  var6 = 10;
                  var10 = new byte[]{(byte)class50.field746[class50.field745]};
                  byte[] var11 = new byte[]{(byte)class50.field746[class50.field745 + 1]};
                  class156.method3004(var5, var6, var10, var11);
                  return 1;
               } else if (var0 == 1352) {
                  class50.field745 -= 3;
                  var12 = class50.field746[class50.field745] - 1;
                  var7 = class50.field746[class50.field745 + 1];
                  var8 = class50.field746[class50.field745 + 2];
                  if (var12 >= 0 && var12 <= 9) {
                     class175.method3536(var5, var12, var7, var8);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var6 = 10;
                  var7 = class50.field746[--class50.field745];
                  var8 = class50.field746[--class50.field745];
                  class175.method3536(var5, var6, var7, var8);
                  return 1;
               } else if (var0 == 1354) {
                  --class50.field745;
                  var12 = class50.field746[class50.field745] - 1;
                  if (var12 >= 0 && var12 <= 9) {
                     class153.method2883(var5, var12);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1355) {
                  var6 = 10;
                  class153.method2883(var5, var6);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var9 = null;
               var10 = null;
               if (var4) {
                  class50.field745 -= 10;

                  for(var8 = 0; var8 < 10 && class50.field746[var8 + class50.field745] >= 0; var8 += 2) {
                  }

                  if (var8 > 0) {
                     var9 = new byte[var8 / 2];
                     var10 = new byte[var8 / 2];

                     for(var8 -= 2; var8 >= 0; var8 -= 2) {
                        var9[var8 / 2] = (byte)class50.field746[var8 + class50.field745];
                        var10[var8 / 2] = (byte)class50.field746[var8 + class50.field745 + 1];
                     }
                  }
               } else {
                  class50.field745 -= 2;
                  var9 = new byte[]{(byte)class50.field746[class50.field745]};
                  var10 = new byte[]{(byte)class50.field746[class50.field745 + 1]};
               }

               var8 = class50.field746[--class50.field745] - 1;
               if (var8 >= 0 && var8 <= 9) {
                  class156.method3004(var5, var8, var9, var10);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   static int method6282(int var0, class58 var1, boolean var2) {
      class248 var4 = class86.method2063(class50.field746[--class50.field745]);
      if (var0 == 2800) {
         class50.field746[++class50.field745 - 1] = class103.method2182(class240.method4608(var4));
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (var4.field3036 == null) {
               class50.field737[++class1.field3 - 1] = "";
            } else {
               class50.field737[++class1.field3 - 1] = var4.field3036;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class50.field746[--class50.field745];
         --var5;
         if (var4.field3037 != null && var5 < var4.field3037.length && var4.field3037[var5] != null) {
            class50.field737[++class1.field3 - 1] = var4.field3037[var5];
         } else {
            class50.field737[++class1.field3 - 1] = "";
         }

         return 1;
      }
   }

   public static void method6281(int var0) {
      if (class234.field2818 != 0) {
         class146.field1611 = var0;
      } else {
         class234.field2815.method4400(var0);
      }

   }
}
