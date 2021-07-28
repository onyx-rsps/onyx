import java.util.Arrays;
import java.util.Date;

public abstract class class119 extends class353 {
   class119() {
   }

   abstract void vmethod2487(class123 var1);

   abstract void vmethod2490(class384 var1);

   static class202 method2402(int var0) {
      class202 var2 = (class202)class158.field1857.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         var2 = class7.method59(class158.field1858, class158.field1870, var0, false);
         if (var2 != null) {
            class158.field1857.method4308(var2, (long)var0);
         }

         return var2;
      }
   }

   static void method2403() {
      client.field416 = 1L;
      class6.field13.field966 = 0;
      class255.field3127 = true;
      client.field420 = true;
      client.field635 = -1L;
      class331.method5899();
      client.field452.method2043();
      client.field452.field1200.field4181 = 0;
      client.field452.field1205 = null;
      client.field452.field1211 = null;
      client.field452.field1213 = null;
      client.field452.field1212 = null;
      client.field452.field1208 = 0;
      client.field452.field1209 = 0;
      client.field422 = 0;
      client.field570 = 0;
      client.field423 = 0;
      class115.method2363();
      class19.field145 = 0;
      class285.method5090();
      client.field560 = 0;
      client.field562 = false;
      client.field497 = 0;
      client.field444 = 0;
      client.field481 = 0;
      class367.field4127 = null;
      client.field645 = 0;
      client.field638 = -1;
      client.field643 = 0;
      client.field596 = 0;
      client.field458 = class80.field1159;
      client.field432 = class80.field1159;
      client.field684 = 0;
      class82.field1171 = 0;

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         class82.field1167[var1] = null;
         class82.field1170[var1] = 1;
      }

      for(var1 = 0; var1 < 2048; ++var1) {
         client.field523[var1] = null;
      }

      for(var1 = 0; var1 < 32768; ++var1) {
         client.field566[var1] = null;
      }

      client.field534 = -1;
      client.field537.method5186();
      client.field538.method5186();

      for(var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < 104; ++var2) {
            for(int var3 = 0; var3 < 104; ++var3) {
               client.field535[var1][var2][var3] = null;
            }
         }
      }

      client.field536 = new class295();
      class12.field79.method1366();

      for(var1 = 0; var1 < class281.field3630; ++var1) {
         class139 var4 = class48.method1426(var1);
         if (var4 != null) {
            class243.field2911[var1] = 0;
            class243.field2910[var1] = 0;
         }
      }

      class37.field310.method1955();
      client.field509 = -1;
      if (client.field567 != -1) {
         class4.method20(client.field567);
      }

      for(class66 var5 = (class66)client.field568.method6317(); var5 != null; var5 = (class66)client.field568.method6320()) {
         class161.method3143(var5, true);
      }

      client.field567 = -1;
      client.field568 = new class363(8);
      client.field573 = null;
      client.field544 = 0;
      client.field543 = false;
      client.field597.method4660((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

      for(var1 = 0; var1 < 8; ++var1) {
         client.field531[var1] = null;
         client.field532[var1] = false;
      }

      class64.field934 = new class363(32);
      client.field414 = true;

      for(var1 = 0; var1 < 100; ++var1) {
         client.field616[var1] = true;
      }

      class228 var6 = class148.method2788(class226.field2571, client.field452.field1204);
      var6.field2690.writeByte(class237.method4568());
      var6.field2690.method6734(class68.field970);
      var6.field2690.method6734(client.field686);
      client.field452.method2031(var6);
      class68.field971 = null;
      class41.field354 = null;
      Arrays.fill(client.field636, (Object)null);
      class321.field3844 = null;
      Arrays.fill(client.field637, (Object)null);

      for(var1 = 0; var1 < 8; ++var1) {
         client.field619[var1] = new class285();
      }

      class292.field3710 = null;
   }

   static int method2404(int var0, class58 var1, boolean var2) {
      String var4;
      int var5;
      if (var0 == 4100) {
         var4 = class50.field737[--class1.field3];
         var5 = class50.field746[--class50.field745];
         class50.field737[++class1.field3 - 1] = var4 + var5;
         return 1;
      } else {
         String var10;
         if (var0 == 4101) {
            class1.field3 -= 2;
            var4 = class50.field737[class1.field3];
            var10 = class50.field737[class1.field3 + 1];
            class50.field737[++class1.field3 - 1] = var4 + var10;
            return 1;
         } else if (var0 == 4102) {
            var4 = class50.field737[--class1.field3];
            var5 = class50.field746[--class50.field745];
            class50.field737[++class1.field3 - 1] = var4 + class240.method4607(var5, true);
            return 1;
         } else if (var0 == 4103) {
            var4 = class50.field737[--class1.field3];
            class50.field737[++class1.field3 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var11;
            if (var0 == 4104) {
               var11 = class50.field746[--class50.field745];
               long var12 = 86400000L * ((long)var11 + 11745L);
               class50.field744.setTime(new Date(var12));
               var7 = class50.field744.get(5);
               int var17 = class50.field744.get(2);
               int var9 = class50.field744.get(1);
               class50.field737[++class1.field3 - 1] = var7 + "-" + class50.field751[var17] + "-" + var9;
               return 1;
            } else if (var0 != 4105) {
               if (var0 == 4106) {
                  var11 = class50.field746[--class50.field745];
                  class50.field737[++class1.field3 - 1] = Integer.toString(var11);
                  return 1;
               } else if (var0 == 4107) {
                  class1.field3 -= 2;
                  class50.field746[++class50.field745 - 1] = class198.method3899(class166.method3216(class50.field737[class1.field3], class50.field737[class1.field3 + 1], class283.field3643));
                  return 1;
               } else {
                  int var6;
                  byte[] var14;
                  class301 var15;
                  if (var0 == 4108) {
                     var4 = class50.field737[--class1.field3];
                     class50.field745 -= 2;
                     var5 = class50.field746[class50.field745];
                     var6 = class50.field746[class50.field745 + 1];
                     var14 = class123.field1439.method4920(var6, 0);
                     var15 = new class301(var14);
                     class50.field746[++class50.field745 - 1] = var15.method5401(var4, var5);
                     return 1;
                  } else if (var0 == 4109) {
                     var4 = class50.field737[--class1.field3];
                     class50.field745 -= 2;
                     var5 = class50.field746[class50.field745];
                     var6 = class50.field746[class50.field745 + 1];
                     var14 = class123.field1439.method4920(var6, 0);
                     var15 = new class301(var14);
                     class50.field746[++class50.field745 - 1] = var15.method5421(var4, var5);
                     return 1;
                  } else if (var0 == 4110) {
                     class1.field3 -= 2;
                     var4 = class50.field737[class1.field3];
                     var10 = class50.field737[class1.field3 + 1];
                     if (class50.field746[--class50.field745] == 1) {
                        class50.field737[++class1.field3 - 1] = var4;
                     } else {
                        class50.field737[++class1.field3 - 1] = var10;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var4 = class50.field737[--class1.field3];
                     class50.field737[++class1.field3 - 1] = class302.method5434(var4);
                     return 1;
                  } else if (var0 == 4112) {
                     var4 = class50.field737[--class1.field3];
                     var5 = class50.field746[--class50.field745];
                     class50.field737[++class1.field3 - 1] = var4 + (char)var5;
                     return 1;
                  } else if (var0 == 4113) {
                     var11 = class50.field746[--class50.field745];
                     class50.field746[++class50.field745 - 1] = class303.method5477((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var11 = class50.field746[--class50.field745];
                     class50.field746[++class50.field745 - 1] = class267.method4842((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4115) {
                     var11 = class50.field746[--class50.field745];
                     class50.field746[++class50.field745 - 1] = class93.method2117((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var11 = class50.field746[--class50.field745];
                     class50.field746[++class50.field745 - 1] = class281.method5041((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var4 = class50.field737[--class1.field3];
                     if (var4 != null) {
                        class50.field746[++class50.field745 - 1] = var4.length();
                     } else {
                        class50.field746[++class50.field745 - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 4118) {
                     var4 = class50.field737[--class1.field3];
                     class50.field745 -= 2;
                     var5 = class50.field746[class50.field745];
                     var6 = class50.field746[class50.field745 + 1];
                     class50.field737[++class1.field3 - 1] = var4.substring(var5, var6);
                     return 1;
                  } else if (var0 == 4119) {
                     var4 = class50.field737[--class1.field3];
                     StringBuilder var18 = new StringBuilder(var4.length());
                     boolean var16 = false;

                     for(var7 = 0; var7 < var4.length(); ++var7) {
                        char var8 = var4.charAt(var7);
                        if (var8 == '<') {
                           var16 = true;
                        } else if (var8 == '>') {
                           var16 = false;
                        } else if (!var16) {
                           var18.append(var8);
                        }
                     }

                     class50.field737[++class1.field3 - 1] = var18.toString();
                     return 1;
                  } else if (var0 == 4120) {
                     var4 = class50.field737[--class1.field3];
                     var5 = class50.field746[--class50.field745];
                     class50.field746[++class50.field745 - 1] = var4.indexOf(var5);
                     return 1;
                  } else if (var0 == 4121) {
                     class1.field3 -= 2;
                     var4 = class50.field737[class1.field3];
                     var10 = class50.field737[class1.field3 + 1];
                     var6 = class50.field746[--class50.field745];
                     class50.field746[++class50.field745 - 1] = var4.indexOf(var10, var6);
                     return 1;
                  } else if (var0 == 4122) {
                     var4 = class50.field737[--class1.field3];
                     class50.field737[++class1.field3 - 1] = var4.toUpperCase();
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               class1.field3 -= 2;
               var4 = class50.field737[class1.field3];
               var10 = class50.field737[class1.field3 + 1];
               if (class19.field139.field978 != null && class19.field139.field978.field2930) {
                  class50.field737[++class1.field3 - 1] = var10;
               } else {
                  class50.field737[++class1.field3 - 1] = var4;
               }

               return 1;
            }
         }
      }
   }
}
