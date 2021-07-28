public class class78 {
   static void method1905(class67 var0, int var1, int var2) {
      Object[] var4 = var0.field954;
      class58 var5;
      int var21;
      if (class216.method4270(var0.field962)) {
         class330.field3878 = (class190)var4[0];
         class140 var6 = class72.method1825(class330.field3878.field2135);
         var5 = class168.method3400(var0.field962, var6.field1533, var6.field1552);
      } else {
         var21 = (Integer)var4[0];
         var5 = class7.method45(var21);
      }

      if (var5 != null) {
         class50.field745 = 0;
         class1.field3 = 0;
         var21 = -1;
         int[] var7 = var5.field864;
         int[] var8 = var5.field869;
         byte var9 = -1;
         class50.field747 = 0;
         class50.field752 = false;
         boolean var10 = false;
         int var11 = 0;
         boolean var31 = false;

         label905: {
            label906: {
               try {
                  int var14;
                  try {
                     var31 = true;
                     class324.field3853 = new int[var5.field863];
                     int var12 = 0;
                     class50.field741 = new String[var5.field867];
                     int var13 = 0;

                     int var15;
                     String var22;
                     for(var14 = 1; var14 < var4.length; ++var14) {
                        if (var4[var14] instanceof Integer) {
                           var15 = (Integer)var4[var14];
                           if (var15 == -2147483647) {
                              var15 = var0.field952;
                           }

                           if (var15 == -2147483646) {
                              var15 = var0.field955;
                           }

                           if (var15 == -2147483645) {
                              var15 = var0.field960 != null ? var0.field960.field2957 : -1;
                           }

                           if (var15 == -2147483644) {
                              var15 = var0.field956;
                           }

                           if (var15 == -2147483643) {
                              var15 = var0.field960 != null ? var0.field960.field3030 : -1;
                           }

                           if (var15 == -2147483642) {
                              var15 = var0.field957 != null ? var0.field957.field2957 : -1;
                           }

                           if (var15 == -2147483641) {
                              var15 = var0.field957 != null ? var0.field957.field3030 : -1;
                           }

                           if (var15 == -2147483640) {
                              var15 = var0.field958;
                           }

                           if (var15 == -2147483639) {
                              var15 = var0.field959;
                           }

                           class324.field3853[var12++] = var15;
                        } else if (var4[var14] instanceof String) {
                           var22 = (String)var4[var14];
                           if (var22.equals("event_opbase")) {
                              var22 = var0.field951;
                           }

                           class50.field741[var13++] = var22;
                        }
                     }

                     class50.field742 = var0.field961;

                     while(true) {
                        ++var11;
                        if (var11 > var1) {
                           throw new RuntimeException();
                        }

                        ++var21;
                        int var34 = var7[var21];
                        if (var34 >= 100) {
                           boolean var36;
                           if (var5.field869[var21] == 1) {
                              var36 = true;
                           } else {
                              var36 = false;
                           }

                           var15 = class79.method1909(var34, var5, var36);
                           switch(var15) {
                           case 0:
                              var31 = false;
                              break label905;
                           case 1:
                           default:
                              break;
                           case 2:
                              throw new IllegalStateException();
                           }
                        } else if (var34 == 0) {
                           class50.field746[++class50.field745 - 1] = var8[var21];
                        } else if (var34 == 1) {
                           var14 = var8[var21];
                           class50.field746[++class50.field745 - 1] = class243.field2910[var14];
                        } else if (var34 == 2) {
                           var14 = var8[var21];
                           class243.field2910[var14] = class50.field746[--class50.field745];
                           class45.method881(var14);
                        } else if (var34 == 3) {
                           class50.field737[++class1.field3 - 1] = var5.field865[var21];
                        } else if (var34 == 6) {
                           var21 += var8[var21];
                        } else if (var34 == 7) {
                           class50.field745 -= 2;
                           if (class50.field746[class50.field745] != class50.field746[class50.field745 + 1]) {
                              var21 += var8[var21];
                           }
                        } else if (var34 == 8) {
                           class50.field745 -= 2;
                           if (class50.field746[class50.field745] == class50.field746[class50.field745 + 1]) {
                              var21 += var8[var21];
                           }
                        } else if (var34 == 9) {
                           class50.field745 -= 2;
                           if (class50.field746[class50.field745] < class50.field746[class50.field745 + 1]) {
                              var21 += var8[var21];
                           }
                        } else if (var34 == 10) {
                           class50.field745 -= 2;
                           if (class50.field746[class50.field745] > class50.field746[class50.field745 + 1]) {
                              var21 += var8[var21];
                           }
                        } else if (var34 == 21) {
                           if (class50.field747 == 0) {
                              var31 = false;
                              break;
                           }

                           class43 var41 = class50.field748[--class50.field747];
                           var5 = var41.field367;
                           var7 = var5.field864;
                           var8 = var5.field869;
                           var21 = var41.field365;
                           class324.field3853 = var41.field373;
                           class50.field741 = var41.field368;
                        } else if (var34 == 25) {
                           var14 = var8[var21];
                           class50.field746[++class50.field745 - 1] = class174.method3506(var14);
                        } else if (var34 == 27) {
                           var14 = var8[var21];
                           class100.method2159(var14, class50.field746[--class50.field745]);
                        } else if (var34 == 31) {
                           class50.field745 -= 2;
                           if (class50.field746[class50.field745] <= class50.field746[class50.field745 + 1]) {
                              var21 += var8[var21];
                           }
                        } else if (var34 == 32) {
                           class50.field745 -= 2;
                           if (class50.field746[class50.field745] >= class50.field746[class50.field745 + 1]) {
                              var21 += var8[var21];
                           }
                        } else if (var34 == 33) {
                           class50.field746[++class50.field745 - 1] = class324.field3853[var8[var21]];
                        } else if (var34 == 34) {
                           class324.field3853[var8[var21]] = class50.field746[--class50.field745];
                        } else if (var34 == 35) {
                           class50.field737[++class1.field3 - 1] = class50.field741[var8[var21]];
                        } else if (var34 == 36) {
                           class50.field741[var8[var21]] = class50.field737[--class1.field3];
                        } else if (var34 == 37) {
                           var14 = var8[var21];
                           class1.field3 -= var14;
                           var22 = class181.method3578(class50.field737, class1.field3, var14);
                           class50.field737[++class1.field3 - 1] = var22;
                        } else if (var34 == 38) {
                           --class50.field745;
                        } else if (var34 == 39) {
                           --class1.field3;
                        } else {
                           int var18;
                           if (var34 != 40) {
                              if (var34 == 42) {
                                 class50.field746[++class50.field745 - 1] = class37.field310.method1957(var8[var21]);
                              } else if (var34 == 43) {
                                 class37.field310.method1956(var8[var21], class50.field746[--class50.field745]);
                              } else if (var34 == 44) {
                                 var14 = var8[var21] >> 16;
                                 var15 = var8[var21] & '\uffff';
                                 int var25 = class50.field746[--class50.field745];
                                 if (var25 < 0 || var25 > 5000) {
                                    throw new RuntimeException();
                                 }

                                 class50.field750[var14] = var25;
                                 byte var26 = -1;
                                 if (var15 == 105) {
                                    var26 = 0;
                                 }

                                 for(var18 = 0; var18 < var25; ++var18) {
                                    class50.field743[var14][var18] = var26;
                                 }
                              } else if (var34 == 45) {
                                 var14 = var8[var21];
                                 var15 = class50.field746[--class50.field745];
                                 if (var15 < 0 || var15 >= class50.field750[var14]) {
                                    throw new RuntimeException();
                                 }

                                 class50.field746[++class50.field745 - 1] = class50.field743[var14][var15];
                              } else if (var34 == 46) {
                                 var14 = var8[var21];
                                 class50.field745 -= 2;
                                 var15 = class50.field746[class50.field745];
                                 if (var15 < 0 || var15 >= class50.field750[var14]) {
                                    throw new RuntimeException();
                                 }

                                 class50.field743[var14][var15] = class50.field746[class50.field745 + 1];
                              } else {
                                 String var23;
                                 if (var34 == 47) {
                                    var23 = class37.field310.method1960(var8[var21]);
                                    if (var23 == null) {
                                       var23 = "null";
                                    }

                                    class50.field737[++class1.field3 - 1] = var23;
                                 } else if (var34 == 48) {
                                    class37.field310.method1959(var8[var21], class50.field737[--class1.field3]);
                                 } else if (var34 == 49) {
                                    var23 = class37.field310.method1958(var8[var21]);
                                    class50.field737[++class1.field3 - 1] = var23;
                                 } else if (var34 == 50) {
                                    class37.field310.method1986(var8[var21], class50.field737[--class1.field3]);
                                 } else if (var34 == 60) {
                                    class362 var39 = var5.field870[var8[var21]];
                                    class352 var38 = (class352)var39.method6297((long)class50.field746[--class50.field745]);
                                    if (var38 != null) {
                                       var21 += var38.field3963;
                                    }
                                 } else {
                                    Integer var40;
                                    if (var34 == 74) {
                                       var40 = class149.field1668.method2311(var8[var21]);
                                       if (var40 == null) {
                                          class50.field746[++class50.field745 - 1] = -1;
                                       } else {
                                          class50.field746[++class50.field745 - 1] = var40;
                                       }
                                    } else {
                                       if (var34 != 76) {
                                          throw new IllegalStateException();
                                       }

                                       var40 = class43.field371.method5966(var8[var21]);
                                       if (var40 == null) {
                                          class50.field746[++class50.field745 - 1] = -1;
                                       } else {
                                          class50.field746[++class50.field745 - 1] = var40;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var14 = var8[var21];
                              class58 var37 = class7.method45(var14);
                              int[] var16 = new int[var37.field863];
                              String[] var17 = new String[var37.field867];

                              for(var18 = 0; var18 < var37.field868; ++var18) {
                                 var16[var18] = class50.field746[var18 + (class50.field745 - var37.field868)];
                              }

                              for(var18 = 0; var18 < var37.field866; ++var18) {
                                 var17[var18] = class50.field737[var18 + (class1.field3 - var37.field866)];
                              }

                              class50.field745 -= var37.field868;
                              class1.field3 -= var37.field866;
                              class43 var24 = new class43();
                              var24.field367 = var5;
                              var24.field365 = var21;
                              var24.field373 = class324.field3853;
                              var24.field368 = class50.field741;
                              class50.field748[++class50.field747 - 1] = var24;
                              var5 = var37;
                              var7 = var37.field864;
                              var8 = var37.field869;
                              var21 = -1;
                              class324.field3853 = var16;
                              class50.field741 = var17;
                           }
                        }
                     }
                  } catch (Exception var32) {
                     var10 = true;
                     StringBuilder var28 = new StringBuilder(30);
                     var28.append("").append(var5.field3965).append(" ");

                     for(var14 = class50.field747 - 1; var14 >= 0; --var14) {
                        var28.append("").append(class50.field748[var14].field367.field3965).append(" ");
                     }

                     var28.append("").append(var9);
                     class332.method5902(var28.toString(), var32);
                     var31 = false;
                     break label906;
                  }
               } finally {
                  if (var31) {
                     if (class50.field752) {
                        class50.field740 = true;
                     }

                     while(class50.field754.size() > 0) {
                        class79 var20 = (class79)class50.field754.remove(0);
                        class183.method3588(var20.method1921(), var20.method1908(), var20.method1912(), var20.method1915(), "");
                     }

                     if (class50.field740) {
                        class24.method506();
                        class50.field740 = false;
                        class50.field752 = false;
                     }

                     if (!var10 && var2 > 0 && var11 >= var2) {
                        class332.method5902("Warning: Script " + var5.field862 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
                     }

                  }
               }

               if (class50.field752) {
                  class50.field740 = true;
               }

               while(class50.field754.size() > 0) {
                  class79 var42 = (class79)class50.field754.remove(0);
                  class183.method3588(var42.method1921(), var42.method1908(), var42.method1912(), var42.method1915(), "");
               }

               if (class50.field740) {
                  class24.method506();
                  class50.field740 = false;
                  class50.field752 = false;
               }

               if (!var10 && var2 > 0 && var11 >= var2) {
                  class332.method5902("Warning: Script " + var5.field862 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
               }

               return;
            }

            if (class50.field752) {
               class50.field740 = true;
            }

            while(class50.field754.size() > 0) {
               class79 var27 = (class79)class50.field754.remove(0);
               class183.method3588(var27.method1921(), var27.method1908(), var27.method1912(), var27.method1915(), "");
            }

            if (class50.field740) {
               class24.method506();
               class50.field740 = false;
               class50.field752 = false;
            }

            if (!var10 && var2 > 0 && var11 >= var2) {
               class332.method5902("Warning: Script " + var5.field862 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
            }

            return;
         }

         if (class50.field752) {
            class50.field740 = true;
         }

         while(class50.field754.size() > 0) {
            class79 var35 = (class79)class50.field754.remove(0);
            class183.method3588(var35.method1921(), var35.method1908(), var35.method1912(), var35.method1915(), "");
         }

         if (class50.field740) {
            class24.method506();
            class50.field740 = false;
            class50.field752 = false;
         }

         if (!var10 && var2 > 0 && var11 >= var2) {
            class332.method5902("Warning: Script " + var5.field862 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
         }

      }
   }

   public static int method1904(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static void method1901(class276 var0) {
      class138.field1524 = var0;
   }
}
