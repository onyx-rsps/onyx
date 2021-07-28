import java.security.SecureRandom;

public class class98 implements class97 {
   static SecureRandom field1266;

   public class98() {
   }

   static final void method2141(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class37.field307.field1120 = var0;
      class134.method2603();
   }

   static final void method2140(int var0, int var1, boolean var2) {
      if (!var2 || var0 != class19.field136 || class7.field26 != var1) {
         class19.field136 = var0;
         class7.field26 = var1;
         class16.method163(25);
         class11.method112("Loading - please wait.", true);
         int var4 = class280.field3624;
         int var5 = class77.field1133;
         class280.field3624 = (var0 - 6) * 8;
         class77.field1133 = (var1 - 6) * 8;
         int var6 = class280.field3624 - var4;
         int var7 = class77.field1133 - var5;
         var4 = class280.field3624;
         var5 = class77.field1133;

         int var8;
         int var10;
         int[] var10000;
         for(var8 = 0; var8 < 32768; ++var8) {
            class77 var9 = client.field566[var8];
            if (var9 != null) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var9.field1075;
                  var10000[var10] -= var6;
                  var10000 = var9.field1076;
                  var10000[var10] -= var7;
               }

               var9.field1068 -= var6 * 128;
               var9.field1058 -= var7 * 128;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            class69 var22 = client.field523[var8];
            if (var22 != null) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var22.field1075;
                  var10000[var10] -= var6;
                  var10000 = var22.field1076;
                  var10000[var10] -= var7;
               }

               var22.field1068 -= var6 * 128;
               var22.field1058 -= var7 * 128;
            }
         }

         byte var21 = 0;
         byte var19 = 104;
         byte var23 = 1;
         if (var6 < 0) {
            var21 = 103;
            var19 = -1;
            var23 = -1;
         }

         byte var11 = 0;
         byte var12 = 104;
         byte var13 = 1;
         if (var7 < 0) {
            var11 = 103;
            var12 = -1;
            var13 = -1;
         }

         int var15;
         for(int var14 = var21; var14 != var19; var14 += var23) {
            for(var15 = var11; var12 != var15; var15 += var13) {
               int var16 = var6 + var14;
               int var17 = var7 + var15;

               for(int var18 = 0; var18 < 4; ++var18) {
                  if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                     client.field535[var18][var14][var15] = client.field535[var18][var16][var17];
                  } else {
                     client.field535[var18][var14][var15] = null;
                  }
               }
            }
         }

         for(class70 var20 = (class70)client.field536.method5202(); var20 != null; var20 = (class70)client.field536.method5193()) {
            var20.field1015 -= var6;
            var20.field1010 -= var7;
            if (var20.field1015 < 0 || var20.field1010 < 0 || var20.field1015 >= 104 || var20.field1010 >= 104) {
               var20.method6014();
            }
         }

         if (client.field643 != 0) {
            client.field643 -= var6;
            client.field596 -= var7;
         }

         client.field497 = 0;
         client.field614 = false;
         class64.field933 -= var6 << 7;
         class357.field4011 -= var7 << 7;
         class10.field65 -= var6 << 7;
         class272.field3552 -= var7 << 7;
         client.field638 = -1;
         client.field538.method5186();
         client.field537.method5186();

         for(var15 = 0; var15 < 4; ++var15) {
            client.field464[var15].method3101();
         }

      }
   }

   static int method2139(int var0, class58 var1, boolean var2) {
      if (var0 == 3800) {
         if (class41.field354 != null) {
            class50.field746[++class50.field745 - 1] = 1;
            class149.field1668 = class41.field354;
         } else {
            class50.field746[++class50.field745 - 1] = 0;
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3801) {
            var4 = class50.field746[--class50.field745];
            if (client.field636[var4] != null) {
               class50.field746[++class50.field745 - 1] = 1;
               class149.field1668 = client.field636[var4];
            } else {
               class50.field746[++class50.field745 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3802) {
            class50.field737[++class1.field3 - 1] = class149.field1668.field1367;
            return 1;
         } else if (var0 == 3803) {
            class50.field746[++class50.field745 - 1] = class149.field1668.field1366 ? 1 : 0;
            return 1;
         } else if (var0 == 3804) {
            class50.field746[++class50.field745 - 1] = class149.field1668.field1359;
            return 1;
         } else if (var0 == 3805) {
            class50.field746[++class50.field745 - 1] = class149.field1668.field1368;
            return 1;
         } else if (var0 == 3806) {
            class50.field746[++class50.field745 - 1] = class149.field1668.field1369;
            return 1;
         } else if (var0 == 3807) {
            class50.field746[++class50.field745 - 1] = class149.field1668.field1383;
            return 1;
         } else if (var0 == 3809) {
            class50.field746[++class50.field745 - 1] = class149.field1668.field1371;
            return 1;
         } else if (var0 == 3810) {
            var4 = class50.field746[--class50.field745];
            class50.field737[++class1.field3 - 1] = class149.field1668.field1372[var4];
            return 1;
         } else if (var0 == 3811) {
            var4 = class50.field746[--class50.field745];
            class50.field746[++class50.field745 - 1] = class149.field1668.field1373[var4];
            return 1;
         } else if (var0 == 3812) {
            class50.field746[++class50.field745 - 1] = class149.field1668.field1380;
            return 1;
         } else if (var0 == 3813) {
            var4 = class50.field746[--class50.field745];
            class50.field737[++class1.field3 - 1] = class149.field1668.field1362[var4];
            return 1;
         } else {
            int var6;
            int var7;
            if (var0 == 3814) {
               class50.field745 -= 3;
               var4 = class50.field746[class50.field745];
               var7 = class50.field746[class50.field745 + 1];
               var6 = class50.field746[class50.field745 + 2];
               class50.field746[++class50.field745 - 1] = class149.field1668.method2308(var4, var7, var6);
               return 1;
            } else if (var0 == 3815) {
               class50.field746[++class50.field745 - 1] = class149.field1668.field1378;
               return 1;
            } else if (var0 == 3816) {
               class50.field746[++class50.field745 - 1] = class149.field1668.field1379;
               return 1;
            } else if (var0 == 3817) {
               class50.field746[++class50.field745 - 1] = class149.field1668.method2290(class50.field737[--class1.field3]);
               return 1;
            } else if (var0 == 3818) {
               class50.field746[class50.field745 - 1] = class149.field1668.method2292()[class50.field746[class50.field745 - 1]];
               return 1;
            } else if (var0 == 3819) {
               class50.field745 -= 2;
               var4 = class50.field746[class50.field745];
               var7 = class50.field746[class50.field745 + 1];
               class19.method368(var7, var4);
               return 1;
            } else if (var0 == 3820) {
               var4 = class50.field746[--class50.field745];
               class50.field746[++class50.field745 - 1] = class149.field1668.field1376[var4];
               return 1;
            } else {
               if (var0 == 3821) {
                  class50.field745 -= 3;
                  var4 = class50.field746[class50.field745];
                  boolean var5 = class50.field746[class50.field745 + 1] == 1;
                  var6 = class50.field746[class50.field745 + 2];
                  class388.method6845(var6, var4, var5);
               }

               if (var0 == 3822) {
                  var4 = class50.field746[--class50.field745];
                  class50.field746[++class50.field745 - 1] = class149.field1668.field1377[var4] ? 1 : 0;
                  return 1;
               } else if (var0 == 3850) {
                  if (class321.field3844 != null) {
                     class50.field746[++class50.field745 - 1] = 1;
                     class103.field1293 = class321.field3844;
                  } else {
                     class50.field746[++class50.field745 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3851) {
                  var4 = class50.field746[--class50.field745];
                  if (client.field637[var4] != null) {
                     class50.field746[++class50.field745 - 1] = 1;
                     class103.field1293 = client.field637[var4];
                     class227.field2673 = var4;
                  } else {
                     class50.field746[++class50.field745 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3852) {
                  class50.field737[++class1.field3 - 1] = class103.field1293.field1429;
                  return 1;
               } else if (var0 == 3853) {
                  class50.field746[++class50.field745 - 1] = class103.field1293.field1436;
                  return 1;
               } else if (var0 == 3854) {
                  class50.field746[++class50.field745 - 1] = class103.field1293.field1430;
                  return 1;
               } else if (var0 == 3855) {
                  class50.field746[++class50.field745 - 1] = class103.field1293.method2452();
                  return 1;
               } else if (var0 == 3856) {
                  var4 = class50.field746[--class50.field745];
                  class50.field737[++class1.field3 - 1] = ((class105)class103.field1293.field1435.get(var4)).field1302.method7141();
                  return 1;
               } else if (var0 == 3857) {
                  var4 = class50.field746[--class50.field745];
                  class50.field746[++class50.field745 - 1] = ((class105)class103.field1293.field1435.get(var4)).field1305;
                  return 1;
               } else if (var0 == 3858) {
                  var4 = class50.field746[--class50.field745];
                  class50.field746[++class50.field745 - 1] = ((class105)class103.field1293.field1435.get(var4)).field1301;
                  return 1;
               } else if (var0 == 3859) {
                  var4 = class50.field746[--class50.field745];
                  class240.method4612(class227.field2673, var4);
                  return 1;
               } else if (var0 == 3860) {
                  class50.field746[++class50.field745 - 1] = class103.field1293.method2444(class50.field737[--class1.field3]);
                  return 1;
               } else if (var0 == 3861) {
                  class50.field746[class50.field745 - 1] = class103.field1293.method2445()[class50.field746[class50.field745 - 1]];
                  return 1;
               } else if (var0 == 3890) {
                  class50.field746[++class50.field745 - 1] = class43.field371 != null ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
