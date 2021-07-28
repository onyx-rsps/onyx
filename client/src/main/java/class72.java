public abstract class class72 extends class201 {
   boolean field1023;
   boolean field1032;
   boolean field1035;
   boolean field1080;
   byte field1040;
   byte[] field1031;
   class298 field1078;
   int field1020;
   int field1021;
   int field1022;
   int field1024;
   int field1025;
   int field1027;
   int field1028;
   int field1029;
   int field1030;
   int field1033;
   int field1037;
   int field1038;
   int field1039;
   int field1042;
   int field1043;
   int field1044;
   int field1046;
   int field1047;
   int field1049;
   int field1050;
   int field1051;
   int field1052;
   int field1053;
   int field1054;
   int field1055;
   int field1056;
   int field1057;
   int field1058;
   int field1059;
   int field1060;
   int field1061;
   int field1062;
   int field1063;
   int field1064;
   int field1065;
   int field1066;
   int field1067;
   int field1068;
   int field1069;
   int field1070;
   int field1071;
   int field1072;
   int field1073;
   int field1074;
   int field1075;
   int field1079;
   int[] field1026;
   int[] field1036;
   int[] field1041;
   int[] field1045;
   int[] field1048;
   int[] field1076;
   int[] field1077;
   String field1034;

   public static class398[] method1761(class277 var0, int var1, int var2) {
      return !class291.method4622(var0, var1, var2) ? null : class164.method2863();
   }

   class72() {
      this.field1023 = false;
      this.field1024 = 1;
      this.field1030 = -1;
      this.field1052 = -1;
      this.field1020 = -1;
      this.field1029 = -1;
      this.field1072 = -1;
      this.field1046 = -1;
      this.field1021 = -1;
      this.field1033 = -1;
      this.field1034 = null;
      this.field1080 = false;
      this.field1037 = 100;
      this.field1038 = 0;
      this.field1039 = 0;
      this.field1040 = 0;
      this.field1036 = new int[4];
      this.field1048 = new int[4];
      this.field1026 = new int[4];
      this.field1041 = new int[4];
      this.field1045 = new int[4];
      this.field1078 = new class298();
      this.field1047 = -1;
      this.field1032 = false;
      this.field1049 = -1;
      this.field1050 = -1;
      this.field1042 = 0;
      this.field1044 = 0;
      this.field1053 = -1;
      this.field1054 = 0;
      this.field1055 = 0;
      this.field1056 = 0;
      this.field1057 = 0;
      this.field1058 = -1;
      this.field1028 = 0;
      this.field1060 = 0;
      this.field1070 = 0;
      this.field1071 = 200;
      this.field1073 = 0;
      this.field1075 = 32;
      this.field1027 = 0;
      this.field1076 = new int[10];
      this.field1077 = new int[10];
      this.field1031 = new byte[10];
      this.field1079 = 0;
      this.field1067 = 0;
   }

   final void method1749() {
      this.field1027 = 0;
      this.field1067 = 0;
   }

   boolean method1748() {
      return false;
   }

   final void method1759(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var8 = true;
      boolean var9 = true;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         if (this.field1026[var10] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      var10 = -1;
      int var11 = -1;
      int var12 = 0;
      if (var1 >= 0) {
         class155 var13 = class156.method2682(var1);
         var11 = var13.field1726;
         var12 = var13.field1717;
      }

      int var15;
      if (var9) {
         if (var11 == -1) {
            return;
         }

         var10 = 0;
         var15 = 0;
         if (0 == var11) {
            var15 = this.field1026[0];
         } else if (1 == var11) {
            var15 = this.field1048[0];
         }

         for(int var14 = 1; var14 < 4; ++var14) {
            if (0 == var11) {
               if (this.field1026[var14] < var15) {
                  var10 = var14;
                  var15 = this.field1026[var14];
               }
            } else if (1 == var11 && this.field1048[var14] < var15) {
               var10 = var14;
               var15 = this.field1048[var14];
            }
         }

         if (var11 == 1 && var15 >= var2) {
            return;
         }
      } else {
         if (var8) {
            this.field1040 = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var16 = this.field1040;
            this.field1040 = (byte)((this.field1040 + 1) % 4);
            if (this.field1026[var16] <= var5) {
               var10 = var16;
               break;
            }
         }
      }

      if (var10 >= 0) {
         this.field1036[var10] = var1;
         this.field1048[var10] = var2;
         this.field1041[var10] = var3;
         this.field1045[var10] = var4;
         this.field1026[var10] = var6 + var12 + var5;
      }
   }

   final void method1750(int var1, int var2, int var3, int var4, int var5, int var6) {
      class144 var8 = class52.method1534(var1);
      class77 var9 = null;
      class77 var10 = null;
      int var11 = var8.field1589;
      int var12 = 0;

      class77 var13;
      for(var13 = (class77)this.field1078.method4724(); null != var13; var13 = (class77)this.field1078.method4726()) {
         ++var12;
         if (var13.field1129.field1579 == var8.field1579) {
            var13.method1827(var2 + var4, var5, var6, var3);
            return;
         }

         if (var13.field1129.field1583 <= var8.field1583) {
            var9 = var13;
         }

         if (var13.field1129.field1589 > var11) {
            var10 = var13;
            var11 = var13.field1129.field1589;
         }
      }

      if (var10 != null || var12 < 4) {
         var13 = new class77(var8);
         if (null == var9) {
            this.field1078.method4722(var13);
         } else {
            class298.method4778(var13, var9);
         }

         var13.method1827(var4 + var2, var5, var6, var3);
         if (var12 >= 4) {
            var10.method5437();
         }

      }
   }

   final void method1751(int var1) {
      class144 var3 = class52.method1534(var1);

      for(class77 var4 = (class77)this.field1078.method4724(); null != var4; var4 = (class77)this.field1078.method4726()) {
         if (var4.field1129 == var3) {
            var4.method5437();
            return;
         }
      }

   }

   static int method1764(int var0, class59 var1, boolean var2) {
      String var14;
      if (3100 == var0) {
         var14 = class51.field738[--class2.field4];
         class121.method2204(0, "", var14);
         return 1;
      } else if (3101 == var0) {
         class51.field746 -= 2;
         class153.method2565(class20.field140, class51.field747[class51.field746], class51.field747[1 + class51.field746]);
         return 1;
      } else if (3103 == var0) {
         if (!class51.field741) {
            class51.field753 = true;
         }

         return 1;
      } else {
         int var12;
         if (3104 == var0) {
            var14 = class51.field738[--class2.field4];
            var12 = 0;
            if (class250.method4284(var14)) {
               var12 = class278.method4502(var14);
            }

            class229 var16 = class149.method2495(class227.field2650, client.field453.field1205);
            var16.field2691.method5934(var12);
            client.field453.method1963(var16);
            return 1;
         } else {
            class229 var10;
            if (var0 == 3105) {
               var14 = class51.field738[--class2.field4];
               var10 = class149.method2495(class227.field2609, client.field453.field1205);
               var10.field2691.method5931(var14.length() + 1);
               var10.field2691.method5938(var14);
               client.field453.method1963(var10);
               return 1;
            } else if (var0 == 3106) {
               var14 = class51.field738[--class2.field4];
               var10 = class149.method2495(class227.field2638, client.field453.field1205);
               var10.field2691.method5931(var14.length() + 1);
               var10.field2691.method5938(var14);
               client.field453.method1963(var10);
               return 1;
            } else {
               String var5;
               int var8;
               if (3107 == var0) {
                  var8 = class51.field747[--class51.field746];
                  var5 = class51.field738[--class2.field4];
                  class109.method2109(var8, var5);
                  return 1;
               } else if (var0 == 3108) {
                  class51.field746 -= 3;
                  var8 = class51.field747[class51.field746];
                  var12 = class51.field747[1 + class51.field746];
                  int var15 = class51.field747[2 + class51.field746];
                  class249 var17 = class87.method1995(var15);
                  class65.method1677(var17, var8, var12);
                  return 1;
               } else if (3109 == var0) {
                  class51.field746 -= 2;
                  var8 = class51.field747[class51.field746];
                  var12 = class51.field747[class51.field746 + 1];
                  class249 var13 = var2 ? class286.field3660 : class51.field750;
                  class65.method1677(var13, var8, var12);
                  return 1;
               } else if (var0 == 3110) {
                  class311.field3777 = class51.field747[--class51.field746] == 1;
                  return 1;
               } else if (var0 == 3111) {
                  class51.field747[++class51.field746 - 1] = class38.field308.field1113 ? 1 : 0;
                  return 1;
               } else if (var0 == 3112) {
                  class38.field308.field1113 = class51.field747[--class51.field746] == 1;
                  class135.method2320();
                  return 1;
               } else if (var0 == 3113) {
                  var14 = class51.field738[--class2.field4];
                  boolean var11 = class51.field747[--class51.field746] == 1;
                  class139.method2345(var14, var11, false);
                  return 1;
               } else if (var0 == 3115) {
                  var8 = class51.field747[--class51.field746];
                  var10 = class149.method2495(class227.field2647, client.field453.field1205);
                  var10.field2691.method6122(var8);
                  client.field453.method1963(var10);
                  return 1;
               } else if (3116 == var0) {
                  var8 = class51.field747[--class51.field746];
                  class2.field4 -= 2;
                  var5 = class51.field738[class2.field4];
                  String var6 = class51.field738[1 + class2.field4];
                  if (var5.length() > 500) {
                     return 1;
                  } else if (var6.length() > 500) {
                     return 1;
                  } else {
                     class229 var7 = class149.method2495(class227.field2641, client.field453.field1205);
                     var7.field2691.method6122(1 + class281.method4532(var5) + class281.method4532(var6));
                     var7.field2691.method5938(var6);
                     var7.field2691.method5976(var8);
                     var7.field2691.method5938(var5);
                     client.field453.method1963(var7);
                     return 1;
                  }
               } else if (var0 == 3117) {
                  client.field554 = class51.field747[--class51.field746] == 1;
                  return 1;
               } else if (3118 == var0) {
                  client.field578 = class51.field747[--class51.field746] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  client.field527 = class51.field747[--class51.field746] == 1;
                  return 1;
               } else if (3120 == var0) {
                  if (class51.field747[--class51.field746] == 1) {
                     client.field427 |= 1;
                  } else {
                     client.field427 &= -2;
                  }

                  return 1;
               } else if (3121 == var0) {
                  if (class51.field747[--class51.field746] == 1) {
                     client.field427 |= 2;
                  } else {
                     client.field427 &= -3;
                  }

                  return 1;
               } else if (3122 == var0) {
                  if (class51.field747[--class51.field746] == 1) {
                     client.field427 |= 4;
                  } else {
                     client.field427 &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (class51.field747[--class51.field746] == 1) {
                     client.field427 |= 8;
                  } else {
                     client.field427 &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  client.field427 = 0;
                  return 1;
               } else if (3125 == var0) {
                  client.field512 = class51.field747[--class51.field746] == 1;
                  return 1;
               } else if (var0 == 3126) {
                  client.field523 = class51.field747[--class51.field746] == 1;
                  return 1;
               } else if (3127 == var0) {
                  class16.method126(class51.field747[--class51.field746] == 1);
                  return 1;
               } else if (3128 == var0) {
                  class51.field747[++class51.field746 - 1] = class43.method767() ? 1 : 0;
                  return 1;
               } else if (3129 == var0) {
                  class51.field746 -= 2;
                  client.field487 = class51.field747[class51.field746];
                  client.field488 = class51.field747[class51.field746 + 1];
                  return 1;
               } else if (3130 == var0) {
                  class51.field746 -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class51.field746;
                  return 1;
               } else if (3132 == var0) {
                  class51.field747[++class51.field746 - 1] = class69.field971;
                  class51.field747[++class51.field746 - 1] = client.field687;
                  return 1;
               } else if (3133 == var0) {
                  --class51.field746;
                  return 1;
               } else if (3134 == var0) {
                  return 1;
               } else if (3135 == var0) {
                  class51.field746 -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  client.field570 = 3;
                  client.field484 = class51.field747[--class51.field746];
                  return 1;
               } else if (3137 == var0) {
                  client.field570 = 2;
                  client.field484 = class51.field747[--class51.field746];
                  return 1;
               } else if (3138 == var0) {
                  client.field570 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  client.field570 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  client.field570 = 3;
                  client.field484 = var2 ? class286.field3660.field2958 * 611927907 * -1996852661 : class51.field750.field2958 * 611927907 * -1996852661;
                  return 1;
               } else {
                  boolean var9;
                  if (3141 == var0) {
                     var9 = class51.field747[--class51.field746] == 1;
                     class38.field308.field1117 = var9;
                     class135.method2320();
                     return 1;
                  } else if (var0 == 3142) {
                     class51.field747[++class51.field746 - 1] = class38.field308.field1117 ? 1 : 0;
                     return 1;
                  } else if (3143 == var0) {
                     var9 = class51.field747[--class51.field746] == 1;
                     client.field443 = var9;
                     if (!var9) {
                        class38.field308.field1123 = "";
                        class135.method2320();
                     }

                     return 1;
                  } else if (3144 == var0) {
                     class51.field747[++class51.field746 - 1] = client.field443 ? 1 : 0;
                     return 1;
                  } else if (var0 == 3145) {
                     return 1;
                  } else if (var0 == 3146) {
                     var9 = class51.field747[--class51.field746] == 1;
                     if (class38.field308.field1114 == var9) {
                        class38.field308.field1114 = !var9;
                        class135.method2320();
                     }

                     return 1;
                  } else if (3147 == var0) {
                     class51.field747[++class51.field746 - 1] = class38.field308.field1114 ? 0 : 1;
                     return 1;
                  } else if (3148 == var0) {
                     return 1;
                  } else if (var0 == 3149) {
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3150 == var0) {
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3151 == var0) {
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3153 == var0) {
                     class51.field747[++class51.field746 - 1] = class56.field806;
                     return 1;
                  } else if (3154 == var0) {
                     class51.field747[++class51.field746 - 1] = class68.method1690();
                     return 1;
                  } else if (3155 == var0) {
                     --class2.field4;
                     return 1;
                  } else if (3156 == var0) {
                     return 1;
                  } else if (3157 == var0) {
                     class51.field746 -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3159 == var0) {
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --class51.field746;
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --class51.field746;
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3163 == var0) {
                     --class2.field4;
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3164 == var0) {
                     --class51.field746;
                     class51.field738[++class2.field4 - 1] = "";
                     return 1;
                  } else if (3165 == var0) {
                     --class51.field746;
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3166 == var0) {
                     class51.field746 -= 2;
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3167 == var0) {
                     class51.field746 -= 2;
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     class51.field746 -= 2;
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field738[++class2.field4 - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3171 == var0) {
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3172 == var0) {
                     --class51.field746;
                     return 1;
                  } else if (var0 == 3173) {
                     --class51.field746;
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3174 == var0) {
                     --class51.field746;
                     return 1;
                  } else if (var0 == 3175) {
                     class51.field747[++class51.field746 - 1] = 0;
                     return 1;
                  } else if (3176 == var0) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (3178 == var0) {
                     --class2.field4;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --class2.field4;
                     return 1;
                  } else if (var0 == 3181) {
                     var8 = 100 - Math.min(Math.max(class51.field747[--class51.field746], 0), 100);
                     class96.method2064((double)(0.5F + (float)var8 / 200.0F));
                     return 1;
                  } else if (3182 == var0) {
                     float var4 = ((float)class38.field308.field1118 - 0.5F) * 200.0F;
                     class51.field747[++class51.field746 - 1] = 100 - Math.round(var4);
                     return 1;
                  } else if (3183 != var0 && var0 != 3184) {
                     return 2;
                  } else {
                     --class51.field746;
                     return 1;
                  }
               }
            }
         }
      }
   }
}
