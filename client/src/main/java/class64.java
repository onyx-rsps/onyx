public class class64 {
   static class302 field928;
   int field927;
   final class275 field924;
   final int field925;

   class64(class275 var1, String var2) {
      this.field927 = 0;
      this.field924 = var1;
      this.field925 = var1.method4424();
   }

   boolean method1661() {
      this.field927 = 0;

      for(int var2 = 0; var2 < this.field925; ++var2) {
         if (!this.field924.method4379(var2) || this.field924.method4384(var2)) {
            ++this.field927;
         }
      }

      return this.field927 >= this.field925;
   }

   public static class229 method1662() {
      class229 var1 = class160.method2843();
      var1.field2685 = null;
      var1.field2686 = 0;
      var1.field2691 = new class384(5000);
      return var1;
   }

   public static final void method1664(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         class282.field3634 = var0;
         class25.field199 = var1;
         class25.field182 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method1663(class249 var0, int var1, int var2, int var3) {
      class263.method4333();
      class243 var5 = var0.method4227(false);
      if (var5 != null) {
         class394.method6279(var1, var2, var5.field2910 + var1, var2 + var5.field2906);
         if (2 != client.field646 && 5 != client.field646) {
            int var6 = client.field445 & 2047;
            int var7 = class20.field140.field1069 / 32 + 48;
            int var8 = 464 - class20.field140.field1059 / 32;
            class377.field4167.method6396(var1, var2, var5.field2910, var5.field2906, var7, var8, var6, 256, var5.field2908, var5.field2905);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < client.field621; ++var9) {
               var10 = 2 + client.field614[var9] * 4 - class20.field140.field1069 / 32;
               var11 = client.field642[var9] * 4 + 2 - class20.field140.field1059 / 32;
               class268.method4351(var1, var2, var10, var11, client.field643[var9], var5);
            }

            int var12;
            int var13;
            for(var9 = 0; var9 < 104; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  class296 var17 = client.field536[class285.field3652][var9][var10];
                  if (null != var17) {
                     var12 = 2 + var9 * 4 - class20.field140.field1069 / 32;
                     var13 = 2 + 4 * var10 - class20.field140.field1059 / 32;
                     class268.method4351(var1, var2, var12, var13, class127.field1452[0], var5);
                  }
               }
            }

            for(var9 = 0; var9 < client.field685; ++var9) {
               class78 var15 = client.field567[client.field450[var9]];
               if (null != var15 && var15.method1748()) {
                  class148 var18 = var15.field1132;
                  if (var18 != null && null != var18.field1646) {
                     var18 = var18.method2471();
                  }

                  if (var18 != null && var18.field1643 && var18.field1649) {
                     var12 = var15.field1069 / 32 - class20.field140.field1069 / 32;
                     var13 = var15.field1059 / 32 - class20.field140.field1059 / 32;
                     class268.method4351(var1, var2, var12, var13, class127.field1452[1], var5);
                  }
               }
            }

            var9 = class83.field1172;
            int[] var16 = class83.field1178;

            for(var11 = 0; var11 < var9; ++var11) {
               class70 var19 = client.field524[var16[var11]];
               if (null != var19 && var19.method1748() && !var19.field998 && class20.field140 != var19) {
                  var13 = var19.field1069 / 32 - class20.field140.field1069 / 32;
                  int var14 = var19.field1059 / 32 - class20.field140.field1059 / 32;
                  if (var19.method1701()) {
                     class268.method4351(var1, var2, var13, var14, class127.field1452[3], var5);
                  } else if (class20.field140.field997 != 0 && var19.field997 != 0 && var19.field997 == class20.field140.field997) {
                     class268.method4351(var1, var2, var13, var14, class127.field1452[4], var5);
                  } else if (var19.method1704()) {
                     class268.method4351(var1, var2, var13, var14, class127.field1452[5], var5);
                  } else if (var19.method1709()) {
                     class268.method4351(var1, var2, var13, var14, class127.field1452[6], var5);
                  } else {
                     class268.method4351(var1, var2, var13, var14, class127.field1452[2], var5);
                  }
               }
            }

            if (client.field424 != 0 && client.field452 % 20 < 10) {
               if (1 == client.field424 && client.field425 >= 0 && client.field425 < client.field567.length) {
                  class78 var20 = client.field567[client.field425];
                  if (null != var20) {
                     var12 = var20.field1069 / 32 - class20.field140.field1069 / 32;
                     var13 = var20.field1059 / 32 - class20.field140.field1059 / 32;
                     class84.method1930(var1, var2, var12, var13, class151.field1679[1], var5);
                  }
               }

               if (client.field424 == 2) {
                  var11 = client.field477 * 4 - class281.field3625 * 4 + 2 - class20.field140.field1069 / 32;
                  var12 = client.field454 * 4 - class78.field1134 * 4 + 2 - class20.field140.field1059 / 32;
                  class84.method1930(var1, var2, var11, var12, class151.field1679[1], var5);
               }

               if (client.field424 == 10 && client.field426 >= 0 && client.field426 < client.field524.length) {
                  class70 var21 = client.field524[client.field426];
                  if (null != var21) {
                     var12 = var21.field1069 / 32 - class20.field140.field1069 / 32;
                     var13 = var21.field1059 / 32 - class20.field140.field1059 / 32;
                     class84.method1930(var1, var2, var12, var13, class151.field1679[1], var5);
                  }
               }
            }

            if (0 != client.field644) {
               var11 = 2 + client.field644 * 4 - class20.field140.field1069 / 32;
               var12 = client.field597 * 4 + 2 - class20.field140.field1059 / 32;
               class268.method4351(var1, var2, var11, var12, class151.field1679[0], var5);
            }

            if (!class20.field140.field998) {
               class394.method6265(var5.field2910 / 2 + var1 - 1, var2 + var5.field2906 / 2 - 1, 3, 3, 16777215);
            }
         } else {
            class394.method6277(var1, var2, 0, var5.field2908, var5.field2905);
         }

         client.field618[var3] = true;
      }
   }
}
