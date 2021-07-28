public class class208 {
   public static short[][] field2498;
   int field2492;
   int field2493;
   int field2494;
   int field2495;

   class208() {
   }

   class208(class208 var1) {
      this.field2495 = var1.field2495;
      this.field2493 = var1.field2493;
      this.field2494 = var1.field2494;
      this.field2492 = var1.field2492;
   }

   static final void method4247(class71 var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 != null && var0.vmethod1891()) {
         if (var0 instanceof class77) {
            class147 var7 = ((class77)var0).field1131;
            if (var7.field1645 != null) {
               var7 = var7.method2759();
            }

            if (var7 == null) {
               return;
            }
         }

         int var76 = class82.field1171;
         int[] var8 = class82.field1177;
         byte var9 = 0;
         class69 var11;
         if (var1 < var76 && var0.field1024 == client.field451) {
            var11 = (class69)var0;
            boolean var10;
            if (client.field426 == 0) {
               var10 = false;
            } else if (var11 == class19.field139) {
               var10 = class44.method865();
            } else {
               boolean var78 = class260.method4816();
               boolean var79;
               if (!var78) {
                  var79 = (client.field426 & 1) != 0;
                  var78 = var79 && var11.method1750();
               }

               var79 = var78;
               if (!var78) {
                  boolean var14 = (client.field426 & 2) != 0;
                  var79 = var14 && var11.method1753();
               }

               var10 = var79;
            }

            if (var10) {
               class69 var12 = (class69)var0;
               if (var1 < var76) {
                  class240.method4611(var0, var0.field1070 + 15);
                  class302 var13 = (class302)client.field494.get(class360.field4092);
                  byte var93 = 9;
                  var13.method5441(var12.field979.method7141(), var2 + client.field505 * 15, var3 + client.field506 - var93, 16777215, 0);
                  var9 = 18;
               }
            }
         }

         int var88 = -2;
         int var16;
         int var23;
         int var24;
         if (!var0.field1077.method5300()) {
            class240.method4611(var0, var0.field1070 + 15);

            for(class76 var89 = (class76)var0.field1077.method5239(); var89 != null; var89 = (class76)var0.field1077.method5241()) {
               class72 var90 = var89.method1885(client.field451);
               if (var90 == null) {
                  if (var89.method1878()) {
                     var89.method6014();
                  }
               } else {
                  class143 var92 = var89.field1128;
                  class397 var77 = var92.method2715();
                  class397 var15 = var92.method2726();
                  int var17 = 0;
                  if (var77 != null && var15 != null) {
                     if (var92.field1591 * 2 < var15.field4269) {
                        var17 = var92.field1591;
                     }

                     var16 = var15.field4269 - var17 * 2;
                  } else {
                     var16 = var92.field1589;
                  }

                  int var18 = 255;
                  boolean var19 = true;
                  int var20 = client.field451 - var90.field1080;
                  int var21 = var16 * var90.field1082 / var92.field1589;
                  int var22;
                  int var94;
                  if (var90.field1083 > var20) {
                     var22 = var92.field1585 == 0 ? 0 : var92.field1585 * (var20 / var92.field1585);
                     var23 = var16 * var90.field1081 / var92.field1589;
                     var94 = var22 * (var21 - var23) / var90.field1083 + var23;
                  } else {
                     var94 = var21;
                     var22 = var90.field1083 + var92.field1586 - var20;
                     if (var92.field1583 >= 0) {
                        var18 = (var22 << 8) / (var92.field1586 - var92.field1583);
                     }
                  }

                  if (var90.field1082 > 0 && var94 < 1) {
                     var94 = 1;
                  }

                  if (var77 != null && var15 != null) {
                     if (var94 == var16) {
                        var94 += var17 * 2;
                     } else {
                        var94 += var17;
                     }

                     var22 = var77.field4270;
                     var88 += var22;
                     var23 = var2 + client.field505 * 15 - (var16 >> 1);
                     var24 = var3 + client.field506 - var88;
                     var23 -= var17;
                     if (var18 >= 0 && var18 < 255) {
                        var77.method7005(var23, var24, var18);
                        class393.method6873(var23, var24, var23 + var94, var24 + var22);
                        var15.method7005(var23, var24, var18);
                     } else {
                        var77.method7024(var23, var24);
                        class393.method6873(var23, var24, var94 + var23, var24 + var22);
                        var15.method7024(var23, var24);
                     }

                     class393.method6894(var2, var3, var2 + var4, var3 + var5);
                     var88 += 2;
                  } else {
                     var88 += 5;
                     if (client.field505 * 15 > -1) {
                        var22 = var2 + client.field505 * 15 - (var16 >> 1);
                        var23 = var3 + client.field506 - var88;
                        class393.method6880(var22, var23, var94, 5, 65280);
                        class393.method6880(var94 + var22, var23, var16 - var94, 5, 16711680);
                     }

                     var88 += 2;
                  }
               }
            }
         }

         if (var88 == -2) {
            var88 += 7;
         }

         var88 += var9;
         if (var1 < var76) {
            var11 = (class69)var0;
            if (var11.field997) {
               return;
            }

            if (var11.field995 != -1 || var11.field991 != -1) {
               class240.method4611(var0, var0.field1070 + 15);
               if (client.field505 * 15 > -1) {
                  if (var11.field995 != -1) {
                     var88 += 25;
                     class88.field1229[var11.field995].method7024(var2 + client.field505 * 15 - 12, var3 + client.field506 - var88);
                  }

                  if (var11.field991 != -1) {
                     var88 += 25;
                     class265.field3210[var11.field991].method7024(var2 + client.field505 * 15 - 12, var3 + client.field506 - var88);
                  }
               }
            }

            if (var1 >= 0 && client.field423 == 10 && var8[var1] == client.field425) {
               class240.method4611(var0, var0.field1070 + 15);
               if (client.field505 * 15 > -1) {
                  var88 += class149.field1676[1].field4270;
                  class149.field1676[1].method7024(var2 + client.field505 * 15 - 12, var3 + client.field506 - var88);
               }
            }
         } else {
            class147 var91 = ((class77)var0).field1131;
            if (var91.field1645 != null) {
               var91 = var91.method2759();
            }

            if (var91.field1643 >= 0 && var91.field1643 < class265.field3210.length) {
               class240.method4611(var0, var0.field1070 + 15);
               if (client.field505 * 15 > -1) {
                  class265.field3210[var91.field1643].method7024(var2 + client.field505 * 15 - 12, var3 + client.field506 - 30);
               }
            }

            if (client.field423 == 1 && client.field449[var1 - var76] == client.field424 && client.field451 % 20 < 10) {
               class240.method4611(var0, var0.field1070 + 15);
               if (client.field505 * 15 > -1) {
                  class149.field1676[0].method7024(var2 + client.field505 * 15 - 12, var3 + client.field506 - 28);
               }
            }
         }

         if (var0.field1033 != null && (var1 >= var76 || !var0.field1079 && (client.field669 == 4 || !var0.field1034 && (client.field669 == 0 || client.field669 == 3 || client.field669 == 1 && ((class69)var0).method1750())))) {
            class240.method4611(var0, var0.field1070);
            if (client.field505 * 15 > -1 && client.field649 < client.field578) {
               client.field498[client.field649] = class129.field1467.method5367(var0.field1033) / 2;
               client.field441[client.field649] = class129.field1467.field3737;
               client.field495[client.field649] = client.field505 * 15;
               client.field496[client.field649] = client.field506;
               client.field499[client.field649] = var0.field1037;
               client.field661[client.field649] = var0.field1038;
               client.field663[client.field649] = var0.field1036;
               client.field502[client.field649] = var0.field1033;
               ++client.field649;
            }
         }

         for(int var80 = 0; var80 < 4; ++var80) {
            int var97 = var0.field1025[var80];
            int var98 = var0.field1035[var80];
            class154 var96 = null;
            int var81 = 0;
            if (var98 >= 0) {
               if (var97 <= client.field451) {
                  continue;
               }

               var96 = class155.method2975(var0.field1035[var80]);
               var81 = var96.field1716;
               if (var96 != null && var96.field1729 != null) {
                  var96 = var96.method2888();
                  if (var96 == null) {
                     var0.field1025[var80] = -1;
                     continue;
                  }
               }
            } else if (var97 < 0) {
               continue;
            }

            var16 = var0.field1040[var80];
            class154 var82 = null;
            if (var16 >= 0) {
               var82 = class155.method2975(var16);
               if (var82 != null && var82.field1729 != null) {
                  var82 = var82.method2888();
               }
            }

            if (var97 - var81 <= client.field451) {
               if (var96 == null) {
                  var0.field1025[var80] = -1;
               } else {
                  class240.method4611(var0, var0.field1070 / 2);
                  if (client.field505 * 15 > -1) {
                     if (var80 == 1) {
                        client.field506 -= 20;
                     }

                     if (var80 == 2) {
                        --client.field505;
                        client.field506 -= 10;
                     }

                     if (var80 == 3) {
                        ++client.field505;
                        client.field506 -= 10;
                     }

                     class397 var83 = null;
                     class397 var84 = null;
                     class397 var85 = null;
                     class397 var86 = null;
                     var23 = 0;
                     var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     class397 var31 = null;
                     class397 var32 = null;
                     class397 var33 = null;
                     class397 var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var83 = var96.method2901();
                     int var44;
                     if (var83 != null) {
                        var23 = var83.field4269;
                        var44 = var83.field4270;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var27 = var83.field4271;
                     }

                     var84 = var96.method2891();
                     if (var84 != null) {
                        var24 = var84.field4269;
                        var44 = var84.field4270;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var28 = var84.field4271;
                     }

                     var85 = var96.method2892();
                     if (var85 != null) {
                        var25 = var85.field4269;
                        var44 = var85.field4270;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var29 = var85.field4271;
                     }

                     var86 = var96.method2893();
                     if (var86 != null) {
                        var26 = var86.field4269;
                        var44 = var86.field4270;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var30 = var86.field4271;
                     }

                     if (var82 != null) {
                        var31 = var82.method2901();
                        if (var31 != null) {
                           var35 = var31.field4269;
                           var44 = var31.field4270;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var39 = var31.field4271;
                        }

                        var32 = var82.method2891();
                        if (var32 != null) {
                           var36 = var32.field4269;
                           var44 = var32.field4270;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.field4271;
                        }

                        var33 = var82.method2892();
                        if (var33 != null) {
                           var37 = var33.field4269;
                           var44 = var33.field4270;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var41 = var33.field4271;
                        }

                        var34 = var82.method2893();
                        if (var34 != null) {
                           var38 = var34.field4269;
                           var44 = var34.field4270;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.field4271;
                        }
                     }

                     class301 var87 = var96.method2894();
                     if (var87 == null) {
                        var87 = class46.field397;
                     }

                     class301 var45;
                     if (var82 != null) {
                        var45 = var82.method2894();
                        if (var45 == null) {
                           var45 = class46.field397;
                        }
                     } else {
                        var45 = class46.field397;
                     }

                     String var46 = null;
                     String var47 = null;
                     boolean var48 = false;
                     int var49 = 0;
                     var46 = var96.method2889(var0.field1047[var80]);
                     int var95 = var87.method5367(var46);
                     if (var82 != null) {
                        var47 = var82.method2889(var0.field1044[var80]);
                        var49 = var45.method5367(var47);
                     }

                     int var50 = 0;
                     int var51 = 0;
                     if (var24 > 0) {
                        if (var85 == null && var86 == null) {
                           var50 = 1;
                        } else {
                           var50 = var95 / var24 + 1;
                        }
                     }

                     if (var82 != null && var36 > 0) {
                        if (var33 == null && var34 == null) {
                           var51 = 1;
                        } else {
                           var51 = var49 / var36 + 1;
                        }
                     }

                     int var52 = 0;
                     int var53 = var52;
                     if (var23 > 0) {
                        var52 += var23;
                     }

                     var52 += 2;
                     int var54 = var52;
                     if (var25 > 0) {
                        var52 += var25;
                     }

                     int var55 = var52;
                     int var56 = var52;
                     int var57;
                     if (var24 > 0) {
                        var57 = var50 * var24;
                        var52 += var57;
                        var56 += (var57 - var95) / 2;
                     } else {
                        var52 += var95;
                     }

                     var57 = var52;
                     if (var26 > 0) {
                        var52 += var26;
                     }

                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62 = 0;
                     int var63;
                     if (var82 != null) {
                        var52 += 2;
                        var58 = var52;
                        if (var35 > 0) {
                           var52 += var35;
                        }

                        var52 += 2;
                        var59 = var52;
                        if (var37 > 0) {
                           var52 += var37;
                        }

                        var60 = var52;
                        var62 = var52;
                        if (var36 > 0) {
                           var63 = var51 * var36;
                           var52 += var63;
                           var62 += (var63 - var49) / 2;
                        } else {
                           var52 += var49;
                        }

                        var61 = var52;
                        if (var38 > 0) {
                           var52 += var38;
                        }
                     }

                     var63 = var0.field1025[var80] - client.field451;
                     int var64 = var96.field1721 - var63 * var96.field1721 / var96.field1716;
                     int var65 = var63 * var96.field1722 / var96.field1716 + -var96.field1722;
                     int var66 = var64 + (var2 + client.field505 * 15 - (var52 >> 1));
                     int var67 = var65 + (var3 + client.field506 - 12);
                     int var68 = var67;
                     int var69 = var43 + var67;
                     int var70 = var67 + var96.field1726 + 15;
                     int var71 = var70 - var87.field3738;
                     int var72 = var70 + var87.field3739;
                     if (var71 < var67) {
                        var68 = var71;
                     }

                     if (var72 > var69) {
                        var69 = var72;
                     }

                     int var73 = 0;
                     int var74;
                     int var75;
                     if (var82 != null) {
                        var73 = var67 + var82.field1726 + 15;
                        var74 = var73 - var45.field3738;
                        var75 = var73 + var45.field3739;
                        if (var74 < var68) {
                           ;
                        }

                        if (var75 > var69) {
                           ;
                        }
                     }

                     var74 = 255;
                     if (var96.field1706 >= 0) {
                        var74 = (var63 << 8) / (var96.field1716 - var96.field1706);
                     }

                     if (var74 >= 0 && var74 < 255) {
                        if (var83 != null) {
                           var83.method7005(var66 + var53 - var27, var67, var74);
                        }

                        if (var85 != null) {
                           var85.method7005(var54 + var66 - var29, var67, var74);
                        }

                        if (var84 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var84.method7005(var24 * var75 + (var55 + var66 - var28), var67, var74);
                           }
                        }

                        if (var86 != null) {
                           var86.method7005(var57 + var66 - var30, var67, var74);
                        }

                        var87.method5384(var46, var66 + var56, var70, var96.field1723, 0, var74);
                        if (var82 != null) {
                           if (var31 != null) {
                              var31.method7005(var66 + var58 - var39, var67, var74);
                           }

                           if (var33 != null) {
                              var33.method7005(var59 + var66 - var41, var67, var74);
                           }

                           if (var32 != null) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method7005(var36 * var75 + (var60 + var66 - var40), var67, var74);
                              }
                           }

                           if (var34 != null) {
                              var34.method7005(var66 + var61 - var42, var67, var74);
                           }

                           var45.method5384(var47, var66 + var62, var73, var82.field1723, 0, var74);
                        }
                     } else {
                        if (var83 != null) {
                           var83.method7024(var66 + var53 - var27, var67);
                        }

                        if (var85 != null) {
                           var85.method7024(var54 + var66 - var29, var67);
                        }

                        if (var84 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var84.method7024(var24 * var75 + (var55 + var66 - var28), var67);
                           }
                        }

                        if (var86 != null) {
                           var86.method7024(var57 + var66 - var30, var67);
                        }

                        var87.method5372(var46, var56 + var66, var70, var96.field1723 | -16777216, 0);
                        if (var82 != null) {
                           if (var31 != null) {
                              var31.method7024(var58 + var66 - var39, var67);
                           }

                           if (var33 != null) {
                              var33.method7024(var66 + var59 - var41, var67);
                           }

                           if (var32 != null) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method7024(var75 * var36 + (var66 + var60 - var40), var67);
                              }
                           }

                           if (var34 != null) {
                              var34.method7024(var61 + var66 - var42, var67);
                           }

                           var45.method5372(var47, var66 + var62, var73, var82.field1723 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
