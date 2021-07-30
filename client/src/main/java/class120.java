import java.util.Arrays;
import java.util.Date;

public abstract class class120 extends Node {
   class120() {
   }

   static class203 method2198(int var0) {
      class203 var2 = (class203)class159.field1858.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         var2 = class8.method50(class159.field1859, class159.field1871, var0, false);
         if (null != var2) {
            class159.field1858.method3882(var2, (long)var0);
         }

         return var2;
      }
   }

   static void resetClientScene() {
      client.field417 = -1L;
      class7.field14.field967 = 0;
      class256.field3128 = true;
      client.field421 = true;
      client.field636 = -1L;
      class332.method5327();
      client.field453.method1975();
      client.field453.buffer.offset = 0;
      client.field453.currentInboundPacket = null;
      client.field453.field1212 = null;
      client.field453.field1214 = null;
      client.field453.field1213 = null;
      client.field453.gpiBufLength = 0;
      client.field453.field1210 = 0;
      client.field423 = 0;
      client.field571 = 0;
      client.field424 = 0;
      class116.method2185();
      class20.field146 = 0;
      class286.method4582();
      client.field561 = 0;
      client.field563 = false;
      client.field498 = 0;
      client.field445 = 0;
      client.field482 = 0;
      class368.field4128 = null;
      client.field646 = 0;
      client.field639 = -1;
      client.field644 = 0;
      client.field597 = 0;
      client.field459 = class81.field1160;
      client.field433 = class81.field1160;
      client.field685 = 0;
      class83.field1172 = 0;

      int i;
      for(i = 0; i < 2048; ++i) {
         class83.field1168[i] = null;
         class83.field1171[i] = 1;
      }

      for(i = 0; i < 2048; ++i) {
         client.field524[i] = null;
      }

      for(i = 0; i < 32768; ++i) {
         client.field567[i] = null;
      }

      client.field535 = -1;
      client.field538.method4671();
      client.field539.method4671();

      for(i = 0; i < 4; ++i) {
         for(int x = 0; x < 104; ++x) {
            for(int y = 0; y < 104; ++y) {
               client.field536[i][x][y] = null;
            }
         }
      }

      client.field537 = new class296();
      class13.field80.method1323();

      for(i = 0; i < class282.field3631; ++i) {
         class140 var4 = class49.method1383(i);
         if (null != var4) {
            class244.field2912[i] = 0;
            class244.field2911[i] = 0;
         }
      }

      class38.field311.method1887();
      client.field510 = -1;
      if (-1 != client.field568) {
         class5.method16(client.field568);
      }

      for(class67 var5 = (class67)client.field569.first(); null != var5; var5 = (class67)client.field569.method5739()) {
         class162.method2850(var5, true);
      }

      client.field568 = -1;
      client.field569 = new class364(8);
      client.field574 = null;
      client.field545 = 0;
      client.field544 = false;
      client.field598.method4197((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

      for(i = 0; i < 8; ++i) {
         client.field532[i] = null;
         client.field533[i] = false;
      }

      class65.field935 = new class364(32);
      client.field415 = true;

      for(i = 0; i < 100; ++i) {
         client.field617[i] = true;
      }

      class229 var6 = class149.method2495(class227.field2572, client.field453.field1205);
      var6.field2691.writeByte(class238.method4117());
      var6.field2691.method6122(class69.field971);
      var6.field2691.method6122(client.field687);
      client.field453.method1963(var6);
      class69.field972 = null;
      class42.field355 = null;
      Arrays.fill(client.field637, (Object)null);
      class322.field3845 = null;
      Arrays.fill(client.field638, (Object)null);

      for(i = 0; i < 8; ++i) {
         client.field620[i] = new class286();
      }

      class293.field3711 = null;
   }

   static int method2200(int var0, class59 var1, boolean var2) {
      String var4;
      int var10;
      if (4100 == var0) {
         var4 = class51.field738[--class2.field4];
         var10 = class51.field747[--class51.field746];
         class51.field738[++class2.field4 - 1] = var4 + var10;
         return 1;
      } else {
         String var5;
         if (var0 == 4101) {
            class2.field4 -= 2;
            var4 = class51.field738[class2.field4];
            var5 = class51.field738[class2.field4 + 1];
            class51.field738[++class2.field4 - 1] = var4 + var5;
            return 1;
         } else if (var0 == 4102) {
            var4 = class51.field738[--class2.field4];
            var10 = class51.field747[--class51.field746];
            class51.field738[++class2.field4 - 1] = var4 + class241.method4139(var10, true);
            return 1;
         } else if (var0 == 4103) {
            var4 = class51.field738[--class2.field4];
            class51.field738[++class2.field4 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var12;
            if (4104 == var0) {
               var12 = class51.field747[--class51.field746];
               long var15 = 86400000L * ((long)var12 + 11745L);
               class51.field745.setTime(new Date(var15));
               var7 = class51.field745.get(5);
               int var17 = class51.field745.get(2);
               int var9 = class51.field745.get(1);
               class51.field738[++class2.field4 - 1] = var7 + "-" + class51.field752[var17] + "-" + var9;
               return 1;
            } else if (var0 != 4105) {
               if (4106 == var0) {
                  var12 = class51.field747[--class51.field746];
                  class51.field738[++class2.field4 - 1] = Integer.toString(var12);
                  return 1;
               } else if (var0 == 4107) {
                  class2.field4 -= 2;
                  class51.field747[++class51.field746 - 1] = class199.method3495(class167.method2887(class51.field738[class2.field4], class51.field738[1 + class2.field4], class284.field3644));
                  return 1;
               } else {
                  int var6;
                  byte[] var14;
                  class302 var16;
                  if (var0 == 4108) {
                     var4 = class51.field738[--class2.field4];
                     class51.field746 -= 2;
                     var10 = class51.field747[class51.field746];
                     var6 = class51.field747[class51.field746 + 1];
                     var14 = class124.field1440.method4412(var6, 0);
                     var16 = new class302(var14);
                     class51.field747[++class51.field746 - 1] = var16.method4882(var4, var10);
                     return 1;
                  } else if (var0 == 4109) {
                     var4 = class51.field738[--class2.field4];
                     class51.field746 -= 2;
                     var10 = class51.field747[class51.field746];
                     var6 = class51.field747[1 + class51.field746];
                     var14 = class124.field1440.method4412(var6, 0);
                     var16 = new class302(var14);
                     class51.field747[++class51.field746 - 1] = var16.method4902(var4, var10);
                     return 1;
                  } else if (4110 == var0) {
                     class2.field4 -= 2;
                     var4 = class51.field738[class2.field4];
                     var5 = class51.field738[class2.field4 + 1];
                     if (class51.field747[--class51.field746] == 1) {
                        class51.field738[++class2.field4 - 1] = var4;
                     } else {
                        class51.field738[++class2.field4 - 1] = var5;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var4 = class51.field738[--class2.field4];
                     class51.field738[++class2.field4 - 1] = class303.method4915(var4);
                     return 1;
                  } else if (var0 == 4112) {
                     var4 = class51.field738[--class2.field4];
                     var10 = class51.field747[--class51.field746];
                     class51.field738[++class2.field4 - 1] = var4 + (char)var10;
                     return 1;
                  } else if (var0 == 4113) {
                     var12 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = class304.method4958((char)var12) ? 1 : 0;
                     return 1;
                  } else if (4114 == var0) {
                     var12 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = class268.method4353((char)var12) ? 1 : 0;
                     return 1;
                  } else if (4115 == var0) {
                     var12 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = class94.method2049((char)var12) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var12 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = class282.method4533((char)var12) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var4 = class51.field738[--class2.field4];
                     if (var4 != null) {
                        class51.field747[++class51.field746 - 1] = var4.length();
                     } else {
                        class51.field747[++class51.field746 - 1] = 0;
                     }

                     return 1;
                  } else if (4118 == var0) {
                     var4 = class51.field738[--class2.field4];
                     class51.field746 -= 2;
                     var10 = class51.field747[class51.field746];
                     var6 = class51.field747[1 + class51.field746];
                     class51.field738[++class2.field4 - 1] = var4.substring(var10, var6);
                     return 1;
                  } else if (4119 == var0) {
                     var4 = class51.field738[--class2.field4];
                     StringBuilder var11 = new StringBuilder(var4.length());
                     boolean var13 = false;

                     for(var7 = 0; var7 < var4.length(); ++var7) {
                        char var8 = var4.charAt(var7);
                        if ('<' == var8) {
                           var13 = true;
                        } else if ('>' == var8) {
                           var13 = false;
                        } else if (!var13) {
                           var11.append(var8);
                        }
                     }

                     class51.field738[++class2.field4 - 1] = var11.toString();
                     return 1;
                  } else if (4120 == var0) {
                     var4 = class51.field738[--class2.field4];
                     var10 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = var4.indexOf(var10);
                     return 1;
                  } else if (var0 == 4121) {
                     class2.field4 -= 2;
                     var4 = class51.field738[class2.field4];
                     var5 = class51.field738[1 + class2.field4];
                     var6 = class51.field747[--class51.field746];
                     class51.field747[++class51.field746 - 1] = var4.indexOf(var5, var6);
                     return 1;
                  } else if (4122 == var0) {
                     var4 = class51.field738[--class2.field4];
                     class51.field738[++class2.field4 - 1] = var4.toUpperCase();
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               class2.field4 -= 2;
               var4 = class51.field738[class2.field4];
               var5 = class51.field738[1 + class2.field4];
               if (class20.field140.field979 != null && class20.field140.field979.field2931) {
                  class51.field738[++class2.field4 - 1] = var5;
               } else {
                  class51.field738[++class2.field4 - 1] = var4;
               }

               return 1;
            }
         }
      }
   }

   abstract void method2191(Buffer var1);

   abstract void method2192(class124 var1);
}
