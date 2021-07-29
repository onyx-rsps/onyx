public class class47 {
   static int field691;
   static int field693;
   static int field704;
   static int[] field694;
   static int[] field695;
   static String field703;
   int field696;
   int field698;
   int field699;
   int field701;
   int field702;
   String field689;
   String field700;

   static {
      field691 = 0;
      field693 = 0;
      field694 = new int[]{1, 1, 1, 1};
      field695 = new int[]{0, 1, 2, 3};
   }

   class47() {
   }

   boolean method1317() {
      return (1 & this.field699) != 0;
   }

   boolean method1333() {
      return (33554432 & this.field699) != 0;
   }

   boolean method1321() {
      return (536870912 & this.field699) != 0;
   }

   boolean method1340() {
      return (1073741824 & this.field699) != 0;
   }

   boolean method1319() {
      return (4 & this.field699) != 0;
   }

   boolean method1320() {
      return (8 & this.field699) != 0;
   }

   boolean method1318() {
      return (2 & this.field699) != 0;
   }

   public static class158 method1355(int var0) {
      class158 var2 = (class158)class158.field1860.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class158.field1874.method4920(12, var0);
         var2 = new class158();
         if (var3 != null) {
            var2.method3099(new Buffer(var3));
         }

         var2.method3069();
         class158.field1860.method4308(var2, (long)var0);
         return var2;
      }
   }

   public static final void method1360(class32 var0) {
      class181.field2086 = var0;
   }

   static void method1359(int var0, int var1, int var2, int var3) {
      for(class49 var5 = (class49)class49.field719.method5202(); var5 != null; var5 = (class49)class49.field719.method5193()) {
         if (var5.field733 != -1 || var5.field729 != null) {
            int var6 = 0;
            if (var1 > var5.field722) {
               var6 += var1 - var5.field722;
            } else if (var1 < var5.field720) {
               var6 += var5.field720 - var1;
            }

            if (var2 > var5.field723) {
               var6 += var2 - var5.field723;
            } else if (var2 < var5.field730) {
               var6 += var5.field730 - var2;
            }

            if (var6 - 64 <= var5.field718 && class37.field307.field1115 != 0 && var0 == var5.field721) {
               var6 -= 64;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.field718 - var6) * class37.field307.field1115 / var5.field718;
               if (var5.field726 == null) {
                  if (var5.field733 >= 0) {
                     class21 var8 = class21.method417(class138.field1520, var5.field733, 0);
                     if (var8 != null) {
                        class22 var9 = var8.method411().method422(class157.field1841);
                        class29 var10 = class29.method609(var9, 100, var7);
                        var10.method641(-1);
                        class81.field1162.method372(var10);
                        var5.field726 = var10;
                     }
                  }
               } else {
                  var5.field726.method557(var7);
               }

               if (var5.field724 == null) {
                  if (var5.field729 != null && (var5.field725 -= var3) <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.field729.length);
                     class21 var13 = class21.method417(class138.field1520, var5.field729[var12], 0);
                     if (var13 != null) {
                        class22 var14 = var13.method411().method422(class157.field1841);
                        class29 var11 = class29.method609(var14, 100, var7);
                        var11.method641(0);
                        class81.field1162.method372(var11);
                        var5.field724 = var11;
                        var5.field725 = var5.field727 + (int)(Math.random() * (double)(var5.field728 - var5.field727));
                     }
                  }
               } else {
                  var5.field724.method557(var7);
                  if (!var5.field724.method6015()) {
                     var5.field724 = null;
                  }
               }
            } else {
               if (var5.field726 != null) {
                  class81.field1162.method384(var5.field726);
                  var5.field726 = null;
               }

               if (var5.field724 != null) {
                  class81.field1162.method384(var5.field724);
                  var5.field724 = null;
               }
            }
         }
      }

   }

   static void method1357(int var0) {
      for(class352 var2 = (class352)client.field468.method6317(); var2 != null; var2 = (class352)client.field468.method6320()) {
         if ((long)var0 == (var2.field3965 >> 48 & 65535L)) {
            var2.method6014();
         }
      }

   }

   static final void method1358(class71 var0) {
      int var2 = Math.max(1, var0.field1073 - client.field451);
      int var3 = var0.field1062 * 128 + var0.field1023 * 64;
      int var4 = var0.field1064 * 128 + var0.field1023 * 64;
      var0.field1068 += (var3 - var0.field1068) / var2;
      var0.field1058 += (var4 - var0.field1058) / var2;
      var0.field1078 = 0;
      var0.field1042 = var0.field1050;
   }

   public static void method1335(class276 var0) {
      class139.field1528 = var0;
      class281.field3630 = class139.field1528.method4946(16);
   }

   static int method1336(int var0, class58 var1, boolean var2) {
      if (var0 == 5306) {
         class50.field746[++class50.field745 - 1] = class237.method4568();
         return 1;
      } else {
         int var4;
         if (var0 == 5307) {
            var4 = class50.field746[--class50.field745];
            if (var4 == 1 || var4 == 2) {
               class164.method3159(var4);
            }

            return 1;
         } else if (var0 == 5308) {
            class50.field746[++class50.field745 - 1] = class37.field307.field1121;
            return 1;
         } else if (var0 != 5309) {
            if (var0 == 5310) {
               --class50.field745;
               return 1;
            } else if (var0 == 5311) {
               class50.field745 -= 2;
               return 1;
            } else if (var0 == 5312) {
               --class50.field745;
               return 1;
            } else if (var0 == 5350) {
               class1.field3 -= 2;
               --class50.field745;
               return 1;
            } else if (var0 == 5351) {
               --class1.field3;
               return 1;
            } else {
               return 2;
            }
         } else {
            var4 = class50.field746[--class50.field745];
            if (var4 == 1 || var4 == 2) {
               class37.field307.field1121 = var4;
               class134.method2603();
            }

            return 1;
         }
      }
   }

   static int method1352(int var0, class58 var1, boolean var2) {
      if (var0 == 6500) {
         class50.field746[++class50.field745 - 1] = class269.method4848() ? 1 : 0;
         return 1;
      } else {
         class47 var4;
         if (var0 == 6501) {
            var4 = class188.method3665();
            if (var4 != null) {
               class50.field746[++class50.field745 - 1] = var4.field696;
               class50.field746[++class50.field745 - 1] = var4.field699;
               class50.field737[++class1.field3 - 1] = var4.field689;
               class50.field746[++class50.field745 - 1] = var4.field701;
               class50.field746[++class50.field745 - 1] = var4.field698;
               class50.field737[++class1.field3 - 1] = var4.field700;
            } else {
               class50.field746[++class50.field745 - 1] = -1;
               class50.field746[++class50.field745 - 1] = 0;
               class50.field737[++class1.field3 - 1] = "";
               class50.field746[++class50.field745 - 1] = 0;
               class50.field746[++class50.field745 - 1] = 0;
               class50.field737[++class1.field3 - 1] = "";
            }

            return 1;
         } else if (var0 == 6502) {
            var4 = class112.method2276();
            if (var4 != null) {
               class50.field746[++class50.field745 - 1] = var4.field696;
               class50.field746[++class50.field745 - 1] = var4.field699;
               class50.field737[++class1.field3 - 1] = var4.field689;
               class50.field746[++class50.field745 - 1] = var4.field701;
               class50.field746[++class50.field745 - 1] = var4.field698;
               class50.field737[++class1.field3 - 1] = var4.field700;
            } else {
               class50.field746[++class50.field745 - 1] = -1;
               class50.field746[++class50.field745 - 1] = 0;
               class50.field737[++class1.field3 - 1] = "";
               class50.field746[++class50.field745 - 1] = 0;
               class50.field746[++class50.field745 - 1] = 0;
               class50.field737[++class1.field3 - 1] = "";
            }

            return 1;
         } else {
            class47 var5;
            int var6;
            int var8;
            if (var0 == 6506) {
               var8 = class50.field746[--class50.field745];
               var5 = null;

               for(var6 = 0; var6 < field691; ++var6) {
                  if (var8 == class15.field85[var6].field696) {
                     var5 = class15.field85[var6];
                     break;
                  }
               }

               if (var5 != null) {
                  class50.field746[++class50.field745 - 1] = var5.field696;
                  class50.field746[++class50.field745 - 1] = var5.field699;
                  class50.field737[++class1.field3 - 1] = var5.field689;
                  class50.field746[++class50.field745 - 1] = var5.field701;
                  class50.field746[++class50.field745 - 1] = var5.field698;
                  class50.field737[++class1.field3 - 1] = var5.field700;
               } else {
                  class50.field746[++class50.field745 - 1] = -1;
                  class50.field746[++class50.field745 - 1] = 0;
                  class50.field737[++class1.field3 - 1] = "";
                  class50.field746[++class50.field745 - 1] = 0;
                  class50.field746[++class50.field745 - 1] = 0;
                  class50.field737[++class1.field3 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               class50.field745 -= 4;
               var8 = class50.field746[class50.field745];
               boolean var11 = class50.field746[class50.field745 + 1] == 1;
               var6 = class50.field746[class50.field745 + 2];
               boolean var7 = class50.field746[class50.field745 + 3] == 1;
               class323.method5698(var8, var11, var6, var7);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  client.field407 = class50.field746[--class50.field745] == 1;
                  return 1;
               } else {
                  int var9;
                  class152 var10;
                  if (var0 == 6513) {
                     class50.field745 -= 2;
                     var8 = class50.field746[class50.field745];
                     var9 = class50.field746[class50.field745 + 1];
                     var10 = class383.method6540(var9);
                     if (var10.method2841()) {
                        class50.field737[++class1.field3 - 1] = class96.method2133(var8).method2762(var9, var10.field1700);
                     } else {
                        class50.field746[++class50.field745 - 1] = class96.method2133(var8).method2763(var9, var10.field1695);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     class50.field745 -= 2;
                     var8 = class50.field746[class50.field745];
                     var9 = class50.field746[class50.field745 + 1];
                     var10 = class383.method6540(var9);
                     if (var10.method2841()) {
                        class50.field737[++class1.field3 - 1] = class123.method2465(var8).method2932(var9, var10.field1700);
                     } else {
                        class50.field746[++class50.field745 - 1] = class123.method2465(var8).method2966(var9, var10.field1695);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     class50.field745 -= 2;
                     var8 = class50.field746[class50.field745];
                     var9 = class50.field746[class50.field745 + 1];
                     var10 = class383.method6540(var9);
                     if (var10.method2841()) {
                        class50.field737[++class1.field3 - 1] = class10.method105(var8).method2993(var9, var10.field1700);
                     } else {
                        class50.field746[++class50.field745 - 1] = class10.method105(var8).method3034(var9, var10.field1695);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     class50.field745 -= 2;
                     var8 = class50.field746[class50.field745];
                     var9 = class50.field746[class50.field745 + 1];
                     var10 = class383.method6540(var9);
                     if (var10.method2841()) {
                        class50.field737[++class1.field3 - 1] = class101.method2170(var8).method2866(var9, var10.field1700);
                     } else {
                        class50.field746[++class50.field745 - 1] = class101.method2170(var8).method2865(var9, var10.field1695);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     class50.field746[++class50.field745 - 1] = client.field411 ? 1 : 0;
                     return 1;
                  } else if (var0 == 6519) {
                     class50.field746[++class50.field745 - 1] = client.field409 & 3;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     --class1.field3;
                     --class50.field745;
                     return 1;
                  } else if (var0 == 6523) {
                     --class1.field3;
                     --class50.field745;
                     return 1;
                  } else if (var0 == 6524) {
                     class50.field746[++class50.field745 - 1] = -1;
                     return 1;
                  } else if (var0 == 6525) {
                     class50.field746[++class50.field745 - 1] = 1;
                     return 1;
                  } else if (var0 == 6526) {
                     class50.field746[++class50.field745 - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     class50.field746[++class50.field745 - 1] = client.field473;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = class50.field746[--class50.field745];
               if (var8 >= 0 && var8 < field691) {
                  var5 = class15.field85[var8];
                  class50.field746[++class50.field745 - 1] = var5.field696;
                  class50.field746[++class50.field745 - 1] = var5.field699;
                  class50.field737[++class1.field3 - 1] = var5.field689;
                  class50.field746[++class50.field745 - 1] = var5.field701;
                  class50.field746[++class50.field745 - 1] = var5.field698;
                  class50.field737[++class1.field3 - 1] = var5.field700;
               } else {
                  class50.field746[++class50.field745 - 1] = -1;
                  class50.field746[++class50.field745 - 1] = 0;
                  class50.field737[++class1.field3 - 1] = "";
                  class50.field746[++class50.field745 - 1] = 0;
                  class50.field746[++class50.field745 - 1] = 0;
                  class50.field737[++class1.field3 - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
