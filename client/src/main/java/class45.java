public class class45 extends class160 {
   static class274 field390;
   static class396[] field391;

   class45() {
   }

   protected boolean vmethod3137(int var1, int var2, int var3, class159 var4) {
      return var2 == super.field1893 && var3 == super.field1891;
   }

   static final void method881(int var0) {
      class107.method2223();
      class141.method2672();
      int var2 = class48.method1426(var0).field1527;
      if (var2 != 0) {
         int var3 = class243.field2910[var0];
         if (var2 == 1) {
            if (var3 == 1) {
               class95.method2132(0.9D);
            }

            if (var3 == 2) {
               class95.method2132(0.8D);
            }

            if (var3 == 3) {
               class95.method2132(0.7D);
            }

            if (var3 == 4) {
               class95.method2132(0.6D);
            }
         }

         if (var2 == 3) {
            if (var3 == 0) {
               class129.method2514(255);
            }

            if (var3 == 1) {
               class129.method2514(192);
            }

            if (var3 == 2) {
               class129.method2514(128);
            }

            if (var3 == 3) {
               class129.method2514(64);
            }

            if (var3 == 4) {
               class129.method2514(0);
            }
         }

         if (var2 == 4) {
            if (var3 == 0) {
               class98.method2141(127);
            }

            if (var3 == 1) {
               class98.method2141(96);
            }

            if (var3 == 2) {
               class98.method2141(64);
            }

            if (var3 == 3) {
               class98.method2141(32);
            }

            if (var3 == 4) {
               class98.method2141(0);
            }
         }

         if (var2 == 5) {
            client.field527 = var3;
         }

         if (var2 == 6) {
            client.field571 = var3;
         }

         if (var2 == 9) {
            client.field654 = var3;
         }

         if (var2 == 10) {
            if (var3 == 0) {
               class16.method175(127);
            }

            if (var3 == 1) {
               class16.method175(96);
            }

            if (var3 == 2) {
               class16.method175(64);
            }

            if (var3 == 3) {
               class16.method175(32);
            }

            if (var3 == 4) {
               class16.method175(0);
            }
         }

         if (var2 == 17) {
            client.field509 = var3 & '\uffff';
         }

         if (var2 == 18) {
            client.field458 = (class80)class250.method4750(class291.method5152(), var3);
            if (client.field458 == null) {
               client.field458 = class80.field1153;
            }
         }

         if (var2 == 19) {
            if (var3 == -1) {
               client.field534 = -1;
            } else {
               client.field534 = var3 & 2047;
            }
         }

         if (var2 == 22) {
            client.field432 = (class80)class250.method4750(class291.method5152(), var3);
            if (client.field432 == null) {
               client.field432 = class80.field1153;
            }
         }

      }
   }

   static void method883(class69 var0, boolean var1) {
      if (var0 != null && var0.vmethod1891() && !var0.field997) {
         var0.field994 = false;
         if ((client.field408 && class82.field1171 > 50 || class82.field1171 > 200) && var1 && var0.field1029 == var0.field1049) {
            var0.field994 = true;
         }

         int var3 = var0.field1068 >> 7;
         int var4 = var0.field1058 >> 7;
         if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
            long var5 = class171.method3480(0, 0, 0, false, var0.field999);
            if (var0.field980 != null && client.field451 >= var0.field985 && client.field451 < var0.field986) {
               var0.field994 = false;
               var0.field984 = class122.method2438(var0.field1068, var0.field1058, class284.field3651);
               var0.field1024 = client.field451;
               class165.field1924.method3907(class284.field3651, var0.field1068, var0.field1058, var0.field984, 60, var0, var0.field1021, var5, var0.field977, var0.field992, var0.field993, var0.field988);
            } else {
               if ((var0.field1068 & 127) == 64 && (var0.field1058 & 127) == 64) {
                  if (client.field501[var3][var4] == client.field504) {
                     return;
                  }

                  client.field501[var3][var4] = client.field504;
               }

               var0.field984 = class122.method2438(var0.field1068, var0.field1058, class284.field3651);
               var0.field1024 = client.field451;
               class165.field1924.method3912(class284.field3651, var0.field1068, var0.field1058, var0.field984, 60, var0, var0.field1021, var5, var0.field1022);
            }
         }
      }

   }

   public static int method880(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }

   public static class395[] method886() {
      return new class395[]{class395.field4256, class395.field4254, class395.field4255};
   }

   static void method885(int var0, int var1, int var2, int var3) {
      class248 var5 = class49.method1437(var0, var1);
      if (var5 != null && var5.field2973 != null) {
         class67 var6 = new class67();
         var6.field960 = var5;
         var6.field954 = var5.field2973;
         class94.method2123(var6);
      }

      client.field564 = var3;
      client.field562 = true;
      class24.field184 = var0;
      client.field563 = var1;
      class207.field2473 = var2;
      class80.method1934(var5);
   }
}
