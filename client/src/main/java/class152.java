public class class152 extends class348 {
   public static class222 field1696;
   static class276 field1697;
   boolean field1698;
   char field1699;
   public int field1695;
   public String field1700;

   static {
      field1696 = new class222(64);
   }

   class152() {
      this.field1698 = true;
   }

   void method2846(Buffer var1, int var2) {
      if (var2 == 1) {
         byte var5 = var1.method6561();
         int var6 = var5 & 255;
         if (var6 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var6, 16));
         }

         if (var6 >= 128 && var6 < 160) {
            char var7 = class303.field3754[var6 - 128];
            if (var7 == 0) {
               var7 = '?';
            }

            var6 = var7;
         }

         char var4 = (char)var6;
         this.field1699 = var4;
      } else if (var2 == 2) {
         this.field1695 = var1.method6784();
      } else if (var2 == 4) {
         this.field1698 = false;
      } else if (var2 == 5) {
         this.field1700 = var1.method6569();
      }

   }

   void method2840() {
   }

   void method2838(Buffer var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2846(var1, var3);
      }
   }

   public boolean method2841() {
      return this.field1699 == 's';
   }

   static final void method2842() {
      for(int var1 = 0; var1 < class82.field1171; ++var1) {
         class69 var2 = client.field523[class82.field1177[var1]];
         var2.method1754();
      }

   }

   static final String method2860(int var0) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + "," + var2.substring(var3);
      }

      if (var2.length() > 9) {
         return " " + class43.method850(65408) + var2.substring(0, var2.length() - 8) + "M" + " " + " (" + var2 + ")" + "</col>";
      } else {
         return var2.length() > 6 ? " " + class43.method850(16777215) + var2.substring(0, var2.length() - 4) + "K" + " " + " (" + var2 + ")" + "</col>" : " " + class43.method850(16776960) + var2 + "</col>";
      }
   }

   static void method2858(class69 var0, int var1, int var2) {
      if (var0.field1052 == var1 && var1 != -1) {
         int var4 = class47.method1355(var1).field1875;
         if (var4 == 1) {
            var0.field1053 = 0;
            var0.field1054 = 0;
            var0.field1055 = var2;
            var0.field1056 = 0;
         }

         if (var4 == 2) {
            var0.field1056 = 0;
         }
      } else if (var1 == -1 || var0.field1052 == -1 || class47.method1355(var1).field1863 >= class47.method1355(var0.field1052).field1863) {
         var0.field1052 = var1;
         var0.field1053 = 0;
         var0.field1054 = 0;
         var0.field1055 = var2;
         var0.field1056 = 0;
         var0.field1066 = var0.field1026;
      }

   }

   static final void method2837(boolean var0, class383 var1) {
      client.field528 = 0;
      client.field500 = 0;
      class383 var3 = client.field452.field1200;
      var3.method6504();
      int var4 = var3.method6505(8);
      int var5;
      if (var4 < client.field684) {
         for(var5 = var4; var5 < client.field684; ++var5) {
            client.field627[++client.field528 - 1] = client.field449[var5];
         }
      }

      if (var4 > client.field684) {
         throw new RuntimeException("");
      } else {
         client.field684 = 0;

         int var6;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         for(var5 = 0; var5 < var4; ++var5) {
            var6 = client.field449[var5];
            class77 var7 = client.field566[var6];
            var8 = var3.method6505(1);
            if (var8 == 0) {
               client.field449[++client.field684 - 1] = var6;
               var7.field1069 = client.field451;
            } else {
               var9 = var3.method6505(2);
               if (var9 == 0) {
                  client.field449[++client.field684 - 1] = var6;
                  var7.field1069 = client.field451;
                  client.field474[++client.field500 - 1] = var6;
               } else if (var9 == 1) {
                  client.field449[++client.field684 - 1] = var6;
                  var7.field1069 = client.field451;
                  var10 = var3.method6505(3);
                  var7.method1888(var10, (byte)1);
                  var11 = var3.method6505(1);
                  if (var11 == 1) {
                     client.field474[++client.field500 - 1] = var6;
                  }
               } else if (var9 == 2) {
                  client.field449[++client.field684 - 1] = var6;
                  var7.field1069 = client.field451;
                  var10 = var3.method6505(3);
                  var7.method1888(var10, (byte)2);
                  var11 = var3.method6505(3);
                  var7.method1888(var11, (byte)2);
                  var12 = var3.method6505(1);
                  if (var12 == 1) {
                     client.field474[++client.field500 - 1] = var6;
                  }
               } else if (var9 == 3) {
                  client.field627[++client.field528 - 1] = var6;
               }
            }
         }

         class100.method2152(var0, var1);

         int var15;
         for(var15 = 0; var15 < client.field500; ++var15) {
            var4 = client.field474[var15];
            class77 var16 = client.field566[var4];
            var6 = var1.method6560();
            if ((var6 & 128) != 0) {
               var16.field1062 = var1.method6593();
               var16.field1064 = var1.method6593();
               var16.field1063 = var1.method6592();
               var16.field1065 = var1.method6547();
               var16.field1073 = var1.method6688() + client.field451;
               var16.field1067 = var1.method6655() + client.field451;
               var16.field1050 = var1.method6655();
               var16.field1026 = 1;
               var16.field1066 = 0;
               var16.field1062 += var16.field1075[0];
               var16.field1064 += var16.field1076[0];
               var16.field1063 += var16.field1075[0];
               var16.field1065 += var16.field1076[0];
            }

            int var17;
            if ((var6 & 32) != 0) {
               var17 = var1.method6655();
               var8 = var1.method6600();
               var9 = var16.field1068 - (var17 - class280.field3624 - class280.field3624) * 64;
               var10 = var16.field1058 - (var8 - class77.field1133 - class77.field1133) * 64;
               if (var9 != 0 || var10 != 0) {
                  var16.field1048 = (int)(Math.atan2((double)var9, (double)var10) * 325.949D) & 2047;
               }
            }

            if ((var6 & 64) != 0) {
               var16.field1131 = class96.method2133(var1.method6655());
               var16.field1023 = var16.field1131.field1621;
               var16.field1074 = var16.field1131.field1644;
               var16.field1028 = var16.field1131.field1627;
               var16.field1071 = var16.field1131.field1628;
               var16.field1045 = var16.field1131.field1629;
               var16.field1020 = var16.field1131.field1630;
               var16.field1029 = var16.field1131.field1624;
               var16.field1051 = var16.field1131.field1625;
               var16.field1019 = var16.field1131.field1623;
            }

            if ((var6 & 16) != 0) {
               var17 = var1.method6600();
               if (var17 == 65535) {
                  var17 = -1;
               }

               var8 = var1.method6560();
               if (var17 == var16.field1052 && var17 != -1) {
                  var9 = class47.method1355(var17).field1875;
                  if (var9 == 1) {
                     var16.field1053 = 0;
                     var16.field1054 = 0;
                     var16.field1055 = var8;
                     var16.field1056 = 0;
                  }

                  if (var9 == 2) {
                     var16.field1056 = 0;
                  }
               } else if (var17 == -1 || var16.field1052 == -1 || class47.method1355(var17).field1863 >= class47.method1355(var16.field1052).field1863) {
                  var16.field1052 = var17;
                  var16.field1053 = 0;
                  var16.field1054 = 0;
                  var16.field1055 = var8;
                  var16.field1056 = 0;
                  var16.field1066 = var16.field1026;
               }
            }

            if ((var6 & 1) != 0) {
               var17 = var1.method6589();
               int var13;
               if (var17 > 0) {
                  for(var8 = 0; var8 < var17; ++var8) {
                     var10 = -1;
                     var11 = -1;
                     var12 = -1;
                     var9 = var1.method6574();
                     if (var9 == 32767) {
                        var9 = var1.method6574();
                        var11 = var1.method6574();
                        var10 = var1.method6574();
                        var12 = var1.method6574();
                     } else if (var9 != 32766) {
                        var11 = var1.method6574();
                     } else {
                        var9 = -1;
                     }

                     var13 = var1.method6574();
                     var16.method1814(var9, var11, var10, var12, client.field451, var13);
                  }
               }

               var8 = var1.method6776();
               if (var8 > 0) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var1.method6574();
                     var11 = var1.method6574();
                     if (var11 != 32767) {
                        var12 = var1.method6574();
                        var13 = var1.method6776();
                        int var14 = var11 > 0 ? var1.method6560() : var13;
                        var16.method1805(var10, client.field451, var11, var12, var13, var14);
                     } else {
                        var16.method1806(var10);
                     }
                  }
               }
            }

            if ((var6 & 4) != 0) {
               var16.field1033 = var1.method6569();
               var16.field1036 = 100;
            }

            if ((var6 & 2) != 0) {
               var16.field1057 = var1.method6688();
               var17 = var1.method6609();
               var16.field1061 = var17 >> 16;
               var16.field1060 = (var17 & '\uffff') + client.field451;
               var16.field1027 = 0;
               var16.field1059 = 0;
               if (var16.field1060 > client.field451) {
                  var16.field1027 = -1;
               }

               if (var16.field1057 == 65535) {
                  var16.field1057 = -1;
               }
            }

            if ((var6 & 8) != 0) {
               var16.field1046 = var1.method6655();
               if (var16.field1046 == 65535) {
                  var16.field1046 = -1;
               }
            }
         }

         for(var15 = 0; var15 < client.field528; ++var15) {
            var4 = client.field627[var15];
            if (client.field566[var4].field1069 != client.field451) {
               client.field566[var4].field1131 = null;
               client.field566[var4] = null;
            }
         }

         if (var1.field4181 * -1084587701 != client.field452.field1208) {
            throw new RuntimeException(var1.field4181 * -1084587701 + "," + client.field452.field1208);
         } else {
            for(var15 = 0; var15 < client.field684; ++var15) {
               if (client.field566[client.field449[var15]] == null) {
                  throw new RuntimeException(var15 + "," + client.field684);
               }
            }

         }
      }
   }

   static void method2857(class158 var0, int var1, int var2, int var3) {
      if (client.field497 < 50 && class37.field307.field1115 != 0) {
         if (var0.field1865 != null && var1 < var0.field1865.length) {
            int var5 = var0.field1865[var1];
            if (var5 != 0) {
               int var6 = var5 >> 8;
               int var7 = var5 >> 4 & 7;
               int var8 = var5 & 15;
               client.field628[client.field497] = var6;
               client.field650[client.field497] = var7;
               client.field651[client.field497] = 0;
               client.field653[client.field497] = null;
               int var9 = (var2 - 64) / 128;
               int var10 = (var3 - 64) / 128;
               client.field652[client.field497] = var8 + (var10 << 8) + (var9 << 16);
               ++client.field497;
            }
         }
      }
   }

   static final int method2856(int var0, int var1) {
      int var3 = var0 + var1 * 57;
      var3 ^= var3 << 13;
      int var4 = var3 * (var3 * var3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }
}
