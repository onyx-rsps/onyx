import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class83 {
   static class397[] field1189;
   boolean field1188;
   boolean[] field1184;
   String[] field1186;
   Map field1185;
   long field1187;

   class83() {
      this.field1188 = false;
      int var1 = class191.field2148.method4946(19);
      this.field1185 = new HashMap();
      this.field1184 = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         class141 var3 = class57.method1637(var2);
         this.field1184[var2] = var3.field1556;
      }

      var2 = 0;
      if (class191.field2148.method4878(15)) {
         var2 = class191.field2148.method4946(15);
      }

      this.field1186 = new String[var2];
      this.method1964();
   }

   class368 method1962(boolean var1) {
      return class77.method1897("2", class68.field975.field3207, var1);
   }

   boolean method1989() {
      return this.field1188;
   }

   void method1963() {
      class368 var2 = this.method1962(true);

      try {
         int var3 = 3;
         int var4 = 0;
         Iterator var5 = this.field1185.entrySet().iterator();

         while(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            int var7 = (Integer)var6.getKey();
            if (this.field1184[var7]) {
               Object var8 = var6.getValue();
               var3 += 3;
               if (var8 instanceof Integer) {
                  var3 += 4;
               } else if (var8 instanceof String) {
                  var3 += class280.method5040((String)var8);
               }

               ++var4;
            }
         }

         class384 var34 = new class384(var3);
         var34.writeByte(2);
         var34.method6734(var4);
         Iterator var35 = this.field1185.entrySet().iterator();

         label175:
         while(true) {
            Entry var22;
            int var23;
            do {
               if (!var35.hasNext()) {
                  var2.method6364(var34.payload, 0, var34.field4181 * -1084587701);
                  break label175;
               }

               var22 = (Entry)var35.next();
               var23 = (Integer)var22.getKey();
            } while(!this.field1184[var23]);

            var34.method6734(var23);
            Object var9 = var22.getValue();
            Class var11 = var9.getClass();
            class376[] var12 = new class376[]{class376.field4164, class376.field4163, class376.field4159};
            class376[] var13 = var12;
            int var14 = 0;

            class376 var10;
            class376 var15;
            while(true) {
               if (var14 >= var13.length) {
                  var10 = null;
                  break;
               }

               var15 = var13[var14];
               if (var11 == var15.field4160) {
                  var10 = var15;
                  break;
               }

               ++var14;
            }

            var34.writeByte(var10.field4158);
            Class var24 = var9.getClass();
            class376[] var16 = new class376[]{class376.field4164, class376.field4163, class376.field4159};
            class376[] var17 = var16;
            int var18 = 0;

            while(true) {
               if (var18 >= var17.length) {
                  var15 = null;
                  break;
               }

               class376 var19 = var17[var18];
               if (var24 == var19.field4160) {
                  var15 = var19;
                  break;
               }

               ++var18;
            }

            if (var15 == null) {
               throw new IllegalArgumentException();
            }

            class372 var36 = var15.field4162;
            var36.vmethod6466(var9, var34);
         }
      } catch (Exception var32) {
      } finally {
         try {
            var2.method6360();
         } catch (Exception var31) {
         }

      }

      this.field1188 = false;
      this.field1187 = class86.currentTime();
   }

   void method1964() {
      class368 var2 = this.method1962(false);

      try {
         byte[] var3 = new byte[(int)var2.method6357()];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var2.method6363(var3, var4, var3.length - var4);
            if (var5 == -1) {
               throw new EOFException();
            }
         }

         class384 var16 = new class384(var3);
         if (var16.payload.length - var16.field4181 * -1084587701 < 1) {
            return;
         }

         int var17 = var16.method6560();
         if (var17 < 0 || var17 > 2) {
            return;
         }

         int var8;
         int var9;
         int var10;
         int var18;
         if (var17 >= 2) {
            var18 = var16.method6655();

            for(var8 = 0; var8 < var18; ++var8) {
               var9 = var16.method6655();
               var10 = var16.method6560();
               class376[] var11 = new class376[]{class376.field4164, class376.field4163, class376.field4159};
               class376 var12 = (class376)class250.method4750(var11, var10);
               Object var13 = var12.method6464(var16);
               if (this.field1184[var9]) {
                  this.field1185.put(var9, var13);
               }
            }
         } else {
            var18 = var16.method6655();

            for(var8 = 0; var8 < var18; ++var8) {
               var9 = var16.method6655();
               var10 = var16.method6784();
               if (this.field1184[var9]) {
                  this.field1185.put(var9, var10);
               }
            }

            var8 = var16.method6655();

            for(var9 = 0; var9 < var8; ++var9) {
               var16.method6655();
               var16.method6569();
            }
         }
      } catch (Exception var27) {
      } finally {
         try {
            var2.method6360();
         } catch (Exception var26) {
         }

      }

      this.field1188 = false;
   }

   String method1960(int var1) {
      return this.field1186[var1];
   }

   int method1957(int var1) {
      Object var3 = this.field1185.get(var1);
      return var3 instanceof Integer ? (Integer)var3 : -1;
   }

   void method1956(int var1, int var2) {
      this.field1185.put(var1, var2);
      if (this.field1184[var1]) {
         this.field1188 = true;
      }

   }

   String method1958(int var1) {
      Object var3 = this.field1185.get(var1);
      return var3 instanceof String ? (String)var3 : "";
   }

   void method1959(int var1, String var2) {
      this.field1186[var1] = var2;
   }

   void method1986(int var1, String var2) {
      this.field1185.put(var1, var2);
   }

   void method1995() {
      if (this.field1188 && this.field1187 < class86.currentTime() - 60000L) {
         this.method1963();
      }

   }

   void method1955() {
      int var2;
      for(var2 = 0; var2 < this.field1184.length; ++var2) {
         if (!this.field1184[var2]) {
            this.field1185.remove(var2);
         }
      }

      for(var2 = 0; var2 < this.field1186.length; ++var2) {
         this.field1186[var2] = null;
      }

   }

   public static String method1996(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class307.field3763[(int)(var6 - 37L * var0)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   static class237 method1994(class276 var0, int var1) {
      byte[] var3 = var0.method4927(var1);
      return var3 == null ? null : new class237(var3);
   }

   static void method1973(class47[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var6 = var1 - 1;
         int var7 = var2 + 1;
         int var8 = (var2 + var1) / 2;
         class47 var9 = var0[var8];
         var0[var8] = var0[var1];
         var0[var1] = var9;

         while(var6 < var7) {
            boolean var10 = true;

            int var11;
            int var12;
            int var13;
            do {
               --var7;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (var3[var11] == 2) {
                     var12 = var0[var7].field702;
                     var13 = var9.field702;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var7].field698;
                     var13 = var9.field698;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (var3[var11] == 3) {
                     var12 = var0[var7].method1317() ? 1 : 0;
                     var13 = var9.method1317() ? 1 : 0;
                  } else {
                     var12 = var0[var7].field696;
                     var13 = var9.field696;
                  }

                  if (var13 != var12) {
                     if ((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            var10 = true;

            do {
               ++var6;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (var3[var11] == 2) {
                     var12 = var0[var6].field702;
                     var13 = var9.field702;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var6].field698;
                     var13 = var9.field698;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (var3[var11] == 3) {
                     var12 = var0[var6].method1317() ? 1 : 0;
                     var13 = var9.method1317() ? 1 : 0;
                  } else {
                     var12 = var0[var6].field696;
                     var13 = var9.field696;
                  }

                  if (var13 != var12) {
                     if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            if (var6 < var7) {
               class47 var14 = var0[var6];
               var0[var6] = var0[var7];
               var0[var7] = var14;
            }
         }

         method1973(var0, var1, var7, var3, var4);
         method1973(var0, var7 + 1, var2, var3, var4);
      }

   }

   static final void method1998(int var0, int var1, int var2, int var3, class397 var4, class242 var5) {
      int var7 = var3 * var3 + var2 * var2;
      if (var7 > 4225 && var7 < 90000) {
         int var8 = client.field444 & 2047;
         int var9 = class197.field2265[var8];
         int var10 = class197.field2272[var8];
         int var11 = var10 * var2 + var3 * var9 >> 16;
         int var12 = var3 * var10 - var9 * var2 >> 16;
         double var13 = Math.atan2((double)var11, (double)var12);
         int var15 = var5.field2909 / 2 - 25;
         int var16 = (int)(Math.sin(var13) * (double)var15);
         int var17 = (int)(Math.cos(var13) * (double)var15);
         byte var18 = 20;
         class144.field1593.method7017(var16 + (var0 + var5.field2909 / 2 - var18 / 2), var5.field2905 / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
      } else {
         class267.method4840(var0, var1, var2, var3, var4, var5);
      }

   }

   static int method1969(int var0, class58 var1, boolean var2) {
      int var5 = -1;
      class248 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = class50.field746[--class50.field745];
         var4 = class86.method2063(var5);
      } else {
         var4 = var2 ? class285.field3659 : class50.field749;
      }

      if (var0 == 1100) {
         class50.field745 -= 2;
         var4.field3053 = class50.field746[class50.field745];
         if (var4.field3053 > var4.field2980 - var4.field2972) {
            var4.field3053 = var4.field2980 - var4.field2972;
         }

         if (var4.field3053 < 0) {
            var4.field3053 = 0;
         }

         var4.field2967 = class50.field746[class50.field745 + 1];
         if (var4.field2967 > var4.field3090 - var4.field2989) {
            var4.field2967 = var4.field3090 - var4.field2989;
         }

         if (var4.field2967 < 0) {
            var4.field2967 = 0;
         }

         class80.method1934(var4);
         return 1;
      } else if (var0 == 1101) {
         var4.field2982 = class50.field746[--class50.field745];
         class80.method1934(var4);
         return 1;
      } else if (var0 == 1102) {
         var4.field2986 = class50.field746[--class50.field745] == 1;
         class80.method1934(var4);
         return 1;
      } else if (var0 == 1103) {
         var4.field2988 = class50.field746[--class50.field745];
         class80.method1934(var4);
         return 1;
      } else if (var0 == 1104) {
         var4.field2958 = class50.field746[--class50.field745];
         class80.method1934(var4);
         return 1;
      } else if (var0 == 1105) {
         var4.field3083 = class50.field746[--class50.field745];
         class80.method1934(var4);
         return 1;
      } else if (var0 == 1106) {
         var4.field3076 = class50.field746[--class50.field745];
         class80.method1934(var4);
         return 1;
      } else if (var0 == 1107) {
         var4.field3026 = class50.field746[--class50.field745] == 1;
         class80.method1934(var4);
         return 1;
      } else if (var0 == 1108) {
         var4.field2949 = 1;
         var4.field3001 = class50.field746[--class50.field745];
         class80.method1934(var4);
         return 1;
      } else if (var0 == 1109) {
         class50.field745 -= 6;
         var4.field3006 = class50.field746[class50.field745];
         var4.field2959 = class50.field746[class50.field745 + 1];
         var4.field3008 = class50.field746[class50.field745 + 2];
         var4.field3009 = class50.field746[class50.field745 + 3];
         var4.field3010 = class50.field746[class50.field745 + 4];
         var4.field2999 = class50.field746[class50.field745 + 5];
         class80.method1934(var4);
         return 1;
      } else {
         int var9;
         if (var0 == 1110) {
            var9 = class50.field746[--class50.field745];
            if (var9 != var4.field3004) {
               var4.field3004 = var9;
               var4.field3093 = 0;
               var4.field3089 = 0;
               class80.method1934(var4);
            }

            return 1;
         } else if (var0 == 1111) {
            var4.field3014 = class50.field746[--class50.field745] == 1;
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1112) {
            String var8 = class50.field737[--class1.field3];
            if (!var8.equals(var4.field3041)) {
               var4.field3041 = var8;
               class80.method1934(var4);
            }

            return 1;
         } else if (var0 == 1113) {
            var4.field3017 = class50.field746[--class50.field745];
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1114) {
            class50.field745 -= 3;
            var4.field3021 = class50.field746[class50.field745];
            var4.field3022 = class50.field746[class50.field745 + 1];
            var4.field3020 = class50.field746[class50.field745 + 2];
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1115) {
            var4.field3023 = class50.field746[--class50.field745] == 1;
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1116) {
            var4.field2996 = class50.field746[--class50.field745];
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1117) {
            var4.field2997 = class50.field746[--class50.field745];
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1118) {
            var4.field2944 = class50.field746[--class50.field745] == 1;
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1119) {
            var4.field2962 = class50.field746[--class50.field745] == 1;
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1120) {
            class50.field745 -= 2;
            var4.field2980 = class50.field746[class50.field745];
            var4.field3090 = class50.field746[class50.field745 + 1];
            class80.method1934(var4);
            if (var5 != -1 && var4.field2976 == 0) {
               class80.method1933(class248.field3038[var5 >> 16], var4, false);
            }

            return 1;
         } else if (var0 == 1121) {
            class196.method3817(var4.field2957, var4.field3030);
            client.field573 = var4;
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1122) {
            var4.field3005 = class50.field746[--class50.field745];
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1123) {
            var4.field2983 = class50.field746[--class50.field745];
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1124) {
            var4.field3102 = class50.field746[--class50.field745];
            class80.method1934(var4);
            return 1;
         } else if (var0 == 1125) {
            var9 = class50.field746[--class50.field745];
            class395 var7 = (class395)class250.method4750(class45.method886(), var9);
            if (var7 != null) {
               var4.field3070 = var7;
               class80.method1934(var4);
            }

            return 1;
         } else {
            boolean var6;
            if (var0 == 1126) {
               var6 = class50.field746[--class50.field745] == 1;
               var4.field2991 = var6;
               return 1;
            } else if (var0 == 1127) {
               var6 = class50.field746[--class50.field745] == 1;
               var4.field3015 = var6;
               return 1;
            } else if (var0 == 1128) {
               class50.field745 -= 2;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
