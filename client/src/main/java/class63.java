public class class63 {
   static class301 field927;
   int field926;
   final class274 field923;
   final int field924;

   class63(class274 var1, String var2) {
      this.field926 = 0;
      this.field923 = var1;
      this.field924 = var1.method4932();
   }

   boolean method1710() {
      this.field926 = 0;

      for(int var2 = 0; var2 < this.field924; ++var2) {
         if (!this.field923.method4878(var2) || this.field923.method4886(var2)) {
            ++this.field926;
         }
      }

      return this.field926 >= this.field924;
   }

   public static class228 method1711() {
      class228 var1 = class159.method3136();
      var1.field2684 = null;
      var1.field2685 = 0;
      var1.field2690 = new class383(5000);
      return var1;
   }

   static final void method1712(class248 var0, int var1, int var2, int var3) {
      class262.method4817();
      class242 var5 = var0.method4690(false);
      if (var5 != null) {
         class393.method6894(var1, var2, var5.field2909 + var1, var2 + var5.field2905);
         if (client.field645 != 2 && client.field645 != 5) {
            int var6 = client.field444 & 2047;
            int var7 = class19.field139.field1068 / 32 + 48;
            int var8 = 464 - class19.field139.field1058 / 32;
            class376.field4166.method7016(var1, var2, var5.field2909, var5.field2905, var7, var8, var6, 256, var5.field2907, var5.field2904);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < client.field620; ++var9) {
               var10 = client.field613[var9] * 4 + 2 - class19.field139.field1068 / 32;
               var11 = client.field641[var9] * 4 + 2 - class19.field139.field1058 / 32;
               class267.method4840(var1, var2, var10, var11, client.field642[var9], var5);
            }

            int var12;
            int var13;
            for(var9 = 0; var9 < 104; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  class295 var15 = client.field535[class284.field3651][var9][var10];
                  if (var15 != null) {
                     var12 = var9 * 4 + 2 - class19.field139.field1068 / 32;
                     var13 = var10 * 4 + 2 - class19.field139.field1058 / 32;
                     class267.method4840(var1, var2, var12, var13, class126.field1451[0], var5);
                  }
               }
            }

            for(var9 = 0; var9 < client.field684; ++var9) {
               class77 var16 = client.field566[client.field449[var9]];
               if (var16 != null && var16.vmethod1891()) {
                  class147 var18 = var16.field1131;
                  if (var18 != null && var18.field1645 != null) {
                     var18 = var18.method2759();
                  }

                  if (var18 != null && var18.field1642 && var18.field1648) {
                     var12 = var16.field1068 / 32 - class19.field139.field1068 / 32;
                     var13 = var16.field1058 / 32 - class19.field139.field1058 / 32;
                     class267.method4840(var1, var2, var12, var13, class126.field1451[1], var5);
                  }
               }
            }

            var9 = class82.field1171;
            int[] var19 = class82.field1177;

            for(var11 = 0; var11 < var9; ++var11) {
               class69 var17 = client.field523[var19[var11]];
               if (var17 != null && var17.vmethod1891() && !var17.field997 && var17 != class19.field139) {
                  var13 = var17.field1068 / 32 - class19.field139.field1068 / 32;
                  int var14 = var17.field1058 / 32 - class19.field139.field1058 / 32;
                  if (var17.method1750()) {
                     class267.method4840(var1, var2, var13, var14, class126.field1451[3], var5);
                  } else if (class19.field139.field996 != 0 && var17.field996 != 0 && var17.field996 == class19.field139.field996) {
                     class267.method4840(var1, var2, var13, var14, class126.field1451[4], var5);
                  } else if (var17.method1753()) {
                     class267.method4840(var1, var2, var13, var14, class126.field1451[5], var5);
                  } else if (var17.method1758()) {
                     class267.method4840(var1, var2, var13, var14, class126.field1451[6], var5);
                  } else {
                     class267.method4840(var1, var2, var13, var14, class126.field1451[2], var5);
                  }
               }
            }

            if (client.field423 != 0 && client.field451 % 20 < 10) {
               if (client.field423 == 1 && client.field424 >= 0 && client.field424 < client.field566.length) {
                  class77 var20 = client.field566[client.field424];
                  if (var20 != null) {
                     var12 = var20.field1068 / 32 - class19.field139.field1068 / 32;
                     var13 = var20.field1058 / 32 - class19.field139.field1058 / 32;
                     class83.method1998(var1, var2, var12, var13, class150.field1678[1], var5);
                  }
               }

               if (client.field423 == 2) {
                  var11 = client.field476 * 4 - class280.field3624 * 4 + 2 - class19.field139.field1068 / 32;
                  var12 = client.field453 * 4 - class77.field1133 * 4 + 2 - class19.field139.field1058 / 32;
                  class83.method1998(var1, var2, var11, var12, class150.field1678[1], var5);
               }

               if (client.field423 == 10 && client.field425 >= 0 && client.field425 < client.field523.length) {
                  class69 var21 = client.field523[client.field425];
                  if (var21 != null) {
                     var12 = var21.field1068 / 32 - class19.field139.field1068 / 32;
                     var13 = var21.field1058 / 32 - class19.field139.field1058 / 32;
                     class83.method1998(var1, var2, var12, var13, class150.field1678[1], var5);
                  }
               }
            }

            if (client.field643 != 0) {
               var11 = client.field643 * 4 + 2 - class19.field139.field1068 / 32;
               var12 = client.field596 * 4 + 2 - class19.field139.field1058 / 32;
               class267.method4840(var1, var2, var11, var12, class150.field1678[0], var5);
            }

            if (!class19.field139.field997) {
               class393.method6880(var5.field2909 / 2 + var1 - 1, var5.field2905 / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            class393.method6892(var1, var2, 0, var5.field2907, var5.field2904);
         }

         client.field617[var3] = true;
      }
   }

   public static final void method1713(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         class281.field3633 = var0;
         class24.field198 = var1;
         class24.field181 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
