public class class125 extends class103 {
   String field1446;
   long field1445;
   // $FF: synthetic field
   final class106 this$0;

   class125(class106 var1) {
      this.this$0 = var1;
      this.field1445 = -1L;
      this.field1446 = null;
   }

   void vmethod2499(class114 var1) {
      var1.method2297(this.field1445, this.field1446);
   }

   void vmethod2494(Buffer var1) {
      if (var1.method6560() != 255) {
         var1.field4181 -= 99;
         this.field1445 = var1.method6566();
      }

      this.field1446 = var1.method6568();
   }

   public static int method2472(CharSequence var0, int var1) {
      return class43.method852(var0, var1, true);
   }

   public static final int method2475(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (0.0D != var2) {
         double var12;
         if (var4 < 0.5D) {
            var12 = (var2 + 1.0D) * var4;
         } else {
            var12 = var2 + var4 - var2 * var4;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = var0 + 0.3333333333333333D;
         if (var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if (var20 < 0.0D) {
            ++var20;
         }

         if (var16 * 6.0D < 1.0D) {
            var6 = var14 + var16 * 6.0D * (var12 - var14);
         } else if (var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = var14 + (0.6666666666666666D - var16) * (var12 - var14) * 6.0D;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0D < 1.0D) {
            var8 = 6.0D * (var12 - var14) * var0 + var14;
         } else if (var0 * 2.0D < 1.0D) {
            var8 = var12;
         } else if (3.0D * var0 < 2.0D) {
            var8 = 6.0D * (0.6666666666666666D - var0) * (var12 - var14) + var14;
         } else {
            var8 = var14;
         }

         if (6.0D * var20 < 1.0D) {
            var10 = var14 + var20 * 6.0D * (var12 - var14);
         } else if (2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if (3.0D * var20 < 2.0D) {
            var10 = var14 + (var12 - var14) * (0.6666666666666666D - var20) * 6.0D;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(256.0D * var6);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(var10 * 256.0D);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   static final void method2484(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8;
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         class61.field900[var1][var2][var3] = 0;

         while(true) {
            var8 = var0.method6560();
            if (var8 == 0) {
               if (var1 == 0) {
                  int[] var9 = class61.field910[0][var2];
                  int var12 = var2 + var4 + 932731;
                  int var13 = var3 + var5 + 556238;
                  int var14 = class229.method4355(var12 + '\ub135', var13 + 91923, 4) - 128 + (class229.method4355(var12 + 10294, '\u93bd' + var13, 2) - 128 >> 1) + (class229.method4355(var12, var13, 1) - 128 >> 2);
                  var14 = (int)((double)var14 * 0.3D) + 35;
                  if (var14 < 10) {
                     var14 = 10;
                  } else if (var14 > 60) {
                     var14 = 60;
                  }

                  var9[var3] = -var14 * 8;
               } else {
                  class61.field910[var1][var2][var3] = class61.field910[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var8 == 1) {
               int var15 = var0.method6560();
               if (var15 == 1) {
                  var15 = 0;
               }

               if (var1 == 0) {
                  class61.field910[0][var2][var3] = -var15 * 8;
               } else {
                  class61.field910[var1][var2][var3] = class61.field910[var1 - 1][var2][var3] - var15 * 8;
               }
               break;
            }

            if (var8 <= 49) {
               class60.field894[var1][var2][var3] = var0.method6561();
               class61.field915[var1][var2][var3] = (byte)((var8 - 2) / 4);
               class61.field909[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
            } else if (var8 <= 81) {
               class61.field900[var1][var2][var3] = (byte)(var8 - 49);
            } else {
               class339.field3936[var1][var2][var3] = (byte)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = var0.method6560();
            if (var8 == 0) {
               break;
            }

            if (var8 == 1) {
               var0.method6560();
               break;
            }

            if (var8 <= 49) {
               var0.method6560();
            }
         }
      }

   }

   static int method2482(int var0, class58 var1, boolean var2) {
      if (var0 == 5000) {
         class50.field746[++class50.field745 - 1] = client.field669;
         return 1;
      } else if (var0 == 5001) {
         class50.field745 -= 3;
         client.field669 = class50.field746[class50.field745];
         class124.field1440 = class157.method3065(class50.field746[class50.field745 + 1]);
         if (class124.field1440 == null) {
            class124.field1440 = class401.field4298;
         }

         client.field646 = class50.field746[class50.field745 + 2];
         class228 var12 = class148.method2788(class226.field2652, client.field452.field1204);
         var12.field2690.writeByte(client.field669);
         var12.field2690.writeByte(class124.field1440.field4300);
         var12.field2690.writeByte(client.field646);
         client.field452.method2031(var12);
         return 1;
      } else {
         String var4;
         int var5;
         int var6;
         class228 var7;
         if (var0 == 5002) {
            var4 = class50.field737[--class1.field3];
            class50.field745 -= 2;
            var5 = class50.field746[class50.field745];
            var6 = class50.field746[class50.field745 + 1];
            var7 = class148.method2788(class226.field2600, client.field452.field1204);
            var7.field2690.writeByte(class280.method5040(var4) + 2);
            var7.field2690.method6550(var4);
            var7.field2690.writeByte(var5 - 1);
            var7.field2690.writeByte(var6);
            client.field452.method2031(var7);
            return 1;
         } else {
            int var8;
            class44 var9;
            if (var0 == 5003) {
               class50.field745 -= 2;
               var8 = class50.field746[class50.field745];
               var5 = class50.field746[class50.field745 + 1];
               var9 = class1.method13(var8, var5);
               if (var9 != null) {
                  class50.field746[++class50.field745 - 1] = var9.field377;
                  class50.field746[++class50.field745 - 1] = var9.field388;
                  class50.field737[++class1.field3 - 1] = var9.field379 != null ? var9.field379 : "";
                  class50.field737[++class1.field3 - 1] = var9.field384 != null ? var9.field384 : "";
                  class50.field737[++class1.field3 - 1] = var9.field387 != null ? var9.field387 : "";
                  class50.field746[++class50.field745 - 1] = var9.method877() ? 1 : (var9.method870() ? 2 : 0);
               } else {
                  class50.field746[++class50.field745 - 1] = -1;
                  class50.field746[++class50.field745 - 1] = 0;
                  class50.field737[++class1.field3 - 1] = "";
                  class50.field737[++class1.field3 - 1] = "";
                  class50.field737[++class1.field3 - 1] = "";
                  class50.field746[++class50.field745 - 1] = 0;
               }

               return 1;
            } else {
               class44 var10;
               if (var0 == 5004) {
                  var8 = class50.field746[--class50.field745];
                  var10 = class129.method2532(var8);
                  if (var10 != null) {
                     class50.field746[++class50.field745 - 1] = var10.field378;
                     class50.field746[++class50.field745 - 1] = var10.field388;
                     class50.field737[++class1.field3 - 1] = var10.field379 != null ? var10.field379 : "";
                     class50.field737[++class1.field3 - 1] = var10.field384 != null ? var10.field384 : "";
                     class50.field737[++class1.field3 - 1] = var10.field387 != null ? var10.field387 : "";
                     class50.field746[++class50.field745 - 1] = var10.method877() ? 1 : (var10.method870() ? 2 : 0);
                  } else {
                     class50.field746[++class50.field745 - 1] = -1;
                     class50.field746[++class50.field745 - 1] = 0;
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field737[++class1.field3 - 1] = "";
                     class50.field746[++class50.field745 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 5005) {
                  if (class124.field1440 == null) {
                     class50.field746[++class50.field745 - 1] = -1;
                  } else {
                     class50.field746[++class50.field745 - 1] = class124.field1440.field4300;
                  }

                  return 1;
               } else {
                  class228 var13;
                  if (var0 == 5008) {
                     var4 = class50.field737[--class1.field3];
                     var5 = class50.field746[--class50.field745];
                     var13 = class103.method2190(var5, var4, class283.field3643, -1);
                     client.field452.method2031(var13);
                     return 1;
                  } else if (var0 == 5009) {
                     class1.field3 -= 2;
                     var4 = class50.field737[class1.field3];
                     String var14 = class50.field737[class1.field3 + 1];
                     var13 = class148.method2788(class226.field2623, client.field452.field1204);
                     var13.field2690.method6734(0);
                     int var11 = var13.field2690.field4181 * -1084587701;
                     var13.field2690.method6550(var4);
                     class242.method4617(var13.field2690, var14);
                     var13.field2690.method6646(var13.field2690.field4181 * -1084587701 - var11);
                     client.field452.method2031(var13);
                     return 1;
                  } else if (var0 == 5010) {
                     var4 = class50.field737[--class1.field3];
                     class50.field745 -= 2;
                     var5 = class50.field746[class50.field745];
                     var6 = class50.field746[class50.field745 + 1];
                     var7 = class103.method2190(var5, var4, class283.field3643, var6);
                     client.field452.method2031(var7);
                     return 1;
                  } else if (var0 != 5015) {
                     if (var0 == 5016) {
                        class50.field746[++class50.field745 - 1] = client.field646;
                        return 1;
                     } else if (var0 == 5017) {
                        var8 = class50.field746[--class50.field745];
                        class50.field746[++class50.field745 - 1] = class41.method837(var8);
                        return 1;
                     } else if (var0 == 5018) {
                        var8 = class50.field746[--class50.field745];
                        class50.field746[++class50.field745 - 1] = class246.method4676(var8);
                        return 1;
                     } else if (var0 == 5019) {
                        var8 = class50.field746[--class50.field745];
                        class50.field746[++class50.field745 - 1] = class242.method4618(var8);
                        return 1;
                     } else if (var0 == 5020) {
                        var4 = class50.field737[--class1.field3];
                        class121.method2419(var4);
                        return 1;
                     } else if (var0 == 5021) {
                        client.field629 = class50.field737[--class1.field3].toLowerCase().trim();
                        return 1;
                     } else if (var0 == 5022) {
                        class50.field737[++class1.field3 - 1] = client.field629;
                        return 1;
                     } else if (var0 == 5023) {
                        var4 = class50.field737[--class1.field3];
                        System.out.println(var4);
                        return 1;
                     } else if (var0 == 5024) {
                        --class50.field745;
                        return 1;
                     } else if (var0 == 5025) {
                        ++class50.field745;
                        return 1;
                     } else if (var0 == 5030) {
                        class50.field745 -= 2;
                        var8 = class50.field746[class50.field745];
                        var5 = class50.field746[class50.field745 + 1];
                        var9 = class1.method13(var8, var5);
                        if (var9 != null) {
                           class50.field746[++class50.field745 - 1] = var9.field377;
                           class50.field746[++class50.field745 - 1] = var9.field388;
                           class50.field737[++class1.field3 - 1] = var9.field379 != null ? var9.field379 : "";
                           class50.field737[++class1.field3 - 1] = var9.field384 != null ? var9.field384 : "";
                           class50.field737[++class1.field3 - 1] = var9.field387 != null ? var9.field387 : "";
                           class50.field746[++class50.field745 - 1] = var9.method877() ? 1 : (var9.method870() ? 2 : 0);
                           class50.field737[++class1.field3 - 1] = "";
                           class50.field746[++class50.field745 - 1] = 0;
                        } else {
                           class50.field746[++class50.field745 - 1] = -1;
                           class50.field746[++class50.field745 - 1] = 0;
                           class50.field737[++class1.field3 - 1] = "";
                           class50.field737[++class1.field3 - 1] = "";
                           class50.field737[++class1.field3 - 1] = "";
                           class50.field746[++class50.field745 - 1] = 0;
                           class50.field737[++class1.field3 - 1] = "";
                           class50.field746[++class50.field745 - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == 5031) {
                        var8 = class50.field746[--class50.field745];
                        var10 = class129.method2532(var8);
                        if (var10 != null) {
                           class50.field746[++class50.field745 - 1] = var10.field378;
                           class50.field746[++class50.field745 - 1] = var10.field388;
                           class50.field737[++class1.field3 - 1] = var10.field379 != null ? var10.field379 : "";
                           class50.field737[++class1.field3 - 1] = var10.field384 != null ? var10.field384 : "";
                           class50.field737[++class1.field3 - 1] = var10.field387 != null ? var10.field387 : "";
                           class50.field746[++class50.field745 - 1] = var10.method877() ? 1 : (var10.method870() ? 2 : 0);
                           class50.field737[++class1.field3 - 1] = "";
                           class50.field746[++class50.field745 - 1] = 0;
                        } else {
                           class50.field746[++class50.field745 - 1] = -1;
                           class50.field746[++class50.field745 - 1] = 0;
                           class50.field737[++class1.field3 - 1] = "";
                           class50.field737[++class1.field3 - 1] = "";
                           class50.field737[++class1.field3 - 1] = "";
                           class50.field746[++class50.field745 - 1] = 0;
                           class50.field737[++class1.field3 - 1] = "";
                           class50.field746[++class50.field745 - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (class19.field139 != null && class19.field139.field979 != null) {
                        var4 = class19.field139.field979.method7141();
                     } else {
                        var4 = "";
                     }

                     class50.field737[++class1.field3 - 1] = var4;
                     return 1;
                  }
               }
            }
         }
      }
   }
}
