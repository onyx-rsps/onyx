public abstract class class71 extends class200 {
   boolean field1022;
   boolean field1031;
   boolean field1034;
   boolean field1079;
   byte field1039;
   byte[] field1030;
   class297 field1077;
   int field1019;
   int field1020;
   int field1021;
   int field1023;
   int field1024;
   int field1026;
   int field1027;
   int field1028;
   int field1029;
   int field1032;
   int field1036;
   int field1037;
   int field1038;
   int field1041;
   int field1042;
   int field1043;
   int field1045;
   int field1046;
   int field1048;
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
   int field1078;
   int[] field1025;
   int[] field1035;
   int[] field1040;
   int[] field1044;
   int[] field1047;
   int[] field1075;
   int[] field1076;
   String field1033;

   class71() {
      this.field1022 = false;
      this.field1023 = 1;
      this.field1029 = -1;
      this.field1051 = -1;
      this.field1019 = -1;
      this.field1028 = -1;
      this.field1071 = -1;
      this.field1045 = -1;
      this.field1020 = -1;
      this.field1032 = -1;
      this.field1033 = null;
      this.field1079 = false;
      this.field1036 = 100;
      this.field1037 = 0;
      this.field1038 = 0;
      this.field1039 = 0;
      this.field1035 = new int[4];
      this.field1047 = new int[4];
      this.field1025 = new int[4];
      this.field1040 = new int[4];
      this.field1044 = new int[4];
      this.field1077 = new class297();
      this.field1046 = -1;
      this.field1031 = false;
      this.field1048 = -1;
      this.field1049 = -1;
      this.field1041 = 0;
      this.field1043 = 0;
      this.field1052 = -1;
      this.field1053 = 0;
      this.field1054 = 0;
      this.field1055 = 0;
      this.field1056 = 0;
      this.field1057 = -1;
      this.field1027 = 0;
      this.field1059 = 0;
      this.field1069 = 0;
      this.field1070 = 200;
      this.field1072 = 0;
      this.field1074 = 32;
      this.field1026 = 0;
      this.field1075 = new int[10];
      this.field1076 = new int[10];
      this.field1030 = new byte[10];
      this.field1078 = 0;
      this.field1066 = 0;
   }

   boolean vmethod1891() {
      return false;
   }

   final void method1804() {
      this.field1026 = 0;
      this.field1066 = 0;
   }

   final void method1814(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var8 = true;
      boolean var9 = true;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         if (this.field1025[var10] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      var10 = -1;
      int var11 = -1;
      int var12 = 0;
      if (var1 >= 0) {
         class154 var13 = class155.method2975(var1);
         var11 = var13.field1725;
         var12 = var13.field1716;
      }

      int var15;
      if (var9) {
         if (var11 == -1) {
            return;
         }

         var10 = 0;
         var15 = 0;
         if (var11 == 0) {
            var15 = this.field1025[0];
         } else if (var11 == 1) {
            var15 = this.field1047[0];
         }

         for(int var14 = 1; var14 < 4; ++var14) {
            if (var11 == 0) {
               if (this.field1025[var14] < var15) {
                  var10 = var14;
                  var15 = this.field1025[var14];
               }
            } else if (var11 == 1 && this.field1047[var14] < var15) {
               var10 = var14;
               var15 = this.field1047[var14];
            }
         }

         if (var11 == 1 && var15 >= var2) {
            return;
         }
      } else {
         if (var8) {
            this.field1039 = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var16 = this.field1039;
            this.field1039 = (byte)((this.field1039 + 1) % 4);
            if (this.field1025[var16] <= var5) {
               var10 = var16;
               break;
            }
         }
      }

      if (var10 >= 0) {
         this.field1035[var10] = var1;
         this.field1047[var10] = var2;
         this.field1040[var10] = var3;
         this.field1044[var10] = var4;
         this.field1025[var10] = var5 + var12 + var6;
      }
   }

   final void method1806(int var1) {
      class143 var3 = class51.method1579(var1);

      for(class76 var4 = (class76)this.field1077.method5239(); var4 != null; var4 = (class76)this.field1077.method5241()) {
         if (var3 == var4.field1128) {
            var4.method6014();
            return;
         }
      }

   }

   final void method1805(int var1, int var2, int var3, int var4, int var5, int var6) {
      class143 var8 = class51.method1579(var1);
      class76 var9 = null;
      class76 var10 = null;
      int var11 = var8.field1588;
      int var12 = 0;

      class76 var13;
      for(var13 = (class76)this.field1077.method5239(); var13 != null; var13 = (class76)this.field1077.method5241()) {
         ++var12;
         if (var13.field1128.field1578 == var8.field1578) {
            var13.method1882(var2 + var4, var5, var6, var3);
            return;
         }

         if (var13.field1128.field1582 <= var8.field1582) {
            var9 = var13;
         }

         if (var13.field1128.field1588 > var11) {
            var10 = var13;
            var11 = var13.field1128.field1588;
         }
      }

      if (var10 != null || var12 < 4) {
         var13 = new class76(var8);
         if (var9 == null) {
            this.field1077.method5237(var13);
         } else {
            class297.method5290(var13, var9);
         }

         var13.method1882(var2 + var4, var5, var6, var3);
         if (var12 >= 4) {
            var10.method6014();
         }

      }
   }

   public static class397[] method1816(class276 var0, int var1, int var2) {
      return !class290.method5130(var0, var1, var2) ? null : class163.method3158();
   }

   static int method1819(int var0, class58 var1, boolean var2) {
      String var4;
      if (var0 == 3100) {
         var4 = class50.field737[--class1.field3];
         class120.method2408(0, "", var4);
         return 1;
      } else if (var0 == 3101) {
         class50.field745 -= 2;
         class152.method2858(class19.field139, class50.field746[class50.field745], class50.field746[class50.field745 + 1]);
         return 1;
      } else if (var0 == 3103) {
         if (!class50.field740) {
            class50.field752 = true;
         }

         return 1;
      } else {
         int var11;
         if (var0 == 3104) {
            var4 = class50.field737[--class1.field3];
            var11 = 0;
            if (class249.method4747(var4)) {
               var11 = class277.method5010(var4);
            }

            class228 var13 = class148.method2788(class226.field2649, client.field452.field1204);
            var13.field2690.writeInt(var11);
            client.field452.method2031(var13);
            return 1;
         } else {
            class228 var15;
            if (var0 == 3105) {
               var4 = class50.field737[--class1.field3];
               var15 = class148.method2788(class226.field2608, client.field452.field1204);
               var15.field2690.writeByte(var4.length() + 1);
               var15.field2690.method6550(var4);
               client.field452.method2031(var15);
               return 1;
            } else if (var0 == 3106) {
               var4 = class50.field737[--class1.field3];
               var15 = class148.method2788(class226.field2637, client.field452.field1204);
               var15.field2690.writeByte(var4.length() + 1);
               var15.field2690.method6550(var4);
               client.field452.method2031(var15);
               return 1;
            } else {
               String var8;
               int var16;
               if (var0 == 3107) {
                  var16 = class50.field746[--class50.field745];
                  var8 = class50.field737[--class1.field3];
                  class108.method2236(var16, var8);
                  return 1;
               } else if (var0 == 3108) {
                  class50.field745 -= 3;
                  var16 = class50.field746[class50.field745];
                  var11 = class50.field746[class50.field745 + 1];
                  int var10 = class50.field746[class50.field745 + 2];
                  class248 var14 = class86.method2063(var10);
                  class64.method1726(var14, var16, var11);
                  return 1;
               } else if (var0 == 3109) {
                  class50.field745 -= 2;
                  var16 = class50.field746[class50.field745];
                  var11 = class50.field746[class50.field745 + 1];
                  class248 var12 = var2 ? class285.field3659 : class50.field749;
                  class64.method1726(var12, var16, var11);
                  return 1;
               } else if (var0 == 3110) {
                  class310.field3776 = class50.field746[--class50.field745] == 1;
                  return 1;
               } else if (var0 == 3111) {
                  class50.field746[++class50.field745 - 1] = class37.field307.field1112 ? 1 : 0;
                  return 1;
               } else if (var0 == 3112) {
                  class37.field307.field1112 = class50.field746[--class50.field745] == 1;
                  class134.method2603();
                  return 1;
               } else if (var0 == 3113) {
                  var4 = class50.field737[--class1.field3];
                  boolean var5 = class50.field746[--class50.field745] == 1;
                  class138.method2628(var4, var5, false);
                  return 1;
               } else if (var0 == 3115) {
                  var16 = class50.field746[--class50.field745];
                  var15 = class148.method2788(class226.field2646, client.field452.field1204);
                  var15.field2690.method6734(var16);
                  client.field452.method2031(var15);
                  return 1;
               } else if (var0 == 3116) {
                  var16 = class50.field746[--class50.field745];
                  class1.field3 -= 2;
                  var8 = class50.field737[class1.field3];
                  String var6 = class50.field737[class1.field3 + 1];
                  if (var8.length() > 500) {
                     return 1;
                  } else if (var6.length() > 500) {
                     return 1;
                  } else {
                     class228 var7 = class148.method2788(class226.field2640, client.field452.field1204);
                     var7.field2690.method6734(1 + class280.method5040(var8) + class280.method5040(var6));
                     var7.field2690.method6550(var6);
                     var7.field2690.method6588(var16);
                     var7.field2690.method6550(var8);
                     client.field452.method2031(var7);
                     return 1;
                  }
               } else if (var0 == 3117) {
                  client.field553 = class50.field746[--class50.field745] == 1;
                  return 1;
               } else if (var0 == 3118) {
                  client.field577 = class50.field746[--class50.field745] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  client.field526 = class50.field746[--class50.field745] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (class50.field746[--class50.field745] == 1) {
                     client.field426 |= 1;
                  } else {
                     client.field426 &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (class50.field746[--class50.field745] == 1) {
                     client.field426 |= 2;
                  } else {
                     client.field426 &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (class50.field746[--class50.field745] == 1) {
                     client.field426 |= 4;
                  } else {
                     client.field426 &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (class50.field746[--class50.field745] == 1) {
                     client.field426 |= 8;
                  } else {
                     client.field426 &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  client.field426 = 0;
                  return 1;
               } else if (var0 == 3125) {
                  client.field511 = class50.field746[--class50.field745] == 1;
                  return 1;
               } else if (var0 == 3126) {
                  client.field522 = class50.field746[--class50.field745] == 1;
                  return 1;
               } else if (var0 == 3127) {
                  class15.method161(class50.field746[--class50.field745] == 1);
                  return 1;
               } else if (var0 == 3128) {
                  class50.field746[++class50.field745 - 1] = class42.method847() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  class50.field745 -= 2;
                  client.field486 = class50.field746[class50.field745];
                  client.field487 = class50.field746[class50.field745 + 1];
                  return 1;
               } else if (var0 == 3130) {
                  class50.field745 -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class50.field745;
                  return 1;
               } else if (var0 == 3132) {
                  class50.field746[++class50.field745 - 1] = class68.field970;
                  class50.field746[++class50.field745 - 1] = client.field686;
                  return 1;
               } else if (var0 == 3133) {
                  --class50.field745;
                  return 1;
               } else if (var0 == 3134) {
                  return 1;
               } else if (var0 == 3135) {
                  class50.field745 -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  client.field569 = 3;
                  client.field483 = class50.field746[--class50.field745];
                  return 1;
               } else if (var0 == 3137) {
                  client.field569 = 2;
                  client.field483 = class50.field746[--class50.field745];
                  return 1;
               } else if (var0 == 3138) {
                  client.field569 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  client.field569 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  client.field569 = 3;
                  client.field483 = var2 ? class285.field3659.field2957 : class50.field749.field2957;
                  return 1;
               } else {
                  boolean var17;
                  if (var0 == 3141) {
                     var17 = class50.field746[--class50.field745] == 1;
                     class37.field307.field1116 = var17;
                     class134.method2603();
                     return 1;
                  } else if (var0 == 3142) {
                     class50.field746[++class50.field745 - 1] = class37.field307.field1116 ? 1 : 0;
                     return 1;
                  } else if (var0 == 3143) {
                     var17 = class50.field746[--class50.field745] == 1;
                     client.field442 = var17;
                     if (!var17) {
                        class37.field307.field1122 = "";
                        class134.method2603();
                     }

                     return 1;
                  } else if (var0 == 3144) {
                     class50.field746[++class50.field745 - 1] = client.field442 ? 1 : 0;
                     return 1;
                  } else if (var0 == 3145) {
                     return 1;
                  } else if (var0 == 3146) {
                     var17 = class50.field746[--class50.field745] == 1;
                     if (var17 == class37.field307.field1113) {
                        class37.field307.field1113 = !var17;
                        class134.method2603();
                     }

                     return 1;
                  } else if (var0 == 3147) {
                     class50.field746[++class50.field745 - 1] = class37.field307.field1113 ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     class50.field746[++class50.field745 - 1] = class55.field805;
                     return 1;
                  } else if (var0 == 3154) {
                     class50.field746[++class50.field745 - 1] = class67.method1739();
                     return 1;
                  } else if (var0 == 3155) {
                     --class1.field3;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     class50.field745 -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --class50.field745;
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --class50.field745;
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --class1.field3;
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --class50.field745;
                     class50.field737[++class1.field3 - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --class50.field745;
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     class50.field745 -= 2;
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     class50.field745 -= 2;
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     class50.field745 -= 2;
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field737[++class1.field3 - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --class50.field745;
                     return 1;
                  } else if (var0 == 3173) {
                     --class50.field745;
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --class50.field745;
                     return 1;
                  } else if (var0 == 3175) {
                     class50.field746[++class50.field745 - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --class1.field3;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --class1.field3;
                     return 1;
                  } else if (var0 == 3181) {
                     var16 = 100 - Math.min(Math.max(class50.field746[--class50.field745], 0), 100);
                     class95.method2132((double)(0.5F + (float)var16 / 200.0F));
                     return 1;
                  } else if (var0 == 3182) {
                     float var9 = ((float)class37.field307.field1117 - 0.5F) * 200.0F;
                     class50.field746[++class50.field745 - 1] = 100 - Math.round(var9);
                     return 1;
                  } else if (var0 != 3183 && var0 != 3184) {
                     return 2;
                  } else {
                     --class50.field745;
                     return 1;
                  }
               }
            }
         }
      }
   }
}
