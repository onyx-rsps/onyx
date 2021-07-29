public class class153 extends class348 {
   public static class276 field1702;
   static class222 field1703;
   class362 field1704;

   static {
      field1703 = new class222(64);
   }

   class153() {
   }

   void method2864(Buffer var1, int var2) {
      if (var2 == 249) {
         this.field1704 = class49.method1435(var1, this.field1704);
      }

   }

   public int method2865(int var1, int var2) {
      class362 var5 = this.field1704;
      int var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class352 var6 = (class352)var5.method6297((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = var6.field3963;
         }
      }

      return var4;
   }

   public String method2866(int var1, String var2) {
      class362 var5 = this.field1704;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class349 var6 = (class349)var5.method6297((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = (String)var6.field3960;
         }
      }

      return var4;
   }

   void method2862() {
   }

   void method2863(Buffer var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2864(var1, var3);
      }
   }

   static final void method2879(class248[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class393.method6894(var2, var3, var4, var5);
      class197.method3819();

      for(int var10 = 0; var10 < var0.length; ++var10) {
         class248 var11 = var0[var10];
         if (var11 != null && (var11.field3000 == var1 || var1 == -1412584499 && var11 == client.field580)) {
            int var12;
            if (var8 == -1) {
               client.field622[client.field590] = var11.field2970 + var6;
               client.field625[client.field590] = var7 + var11.field2971;
               client.field621[client.field590] = var11.field2972;
               client.field618[client.field590] = var11.field2989;
               var12 = ++client.field590 - 1;
            } else {
               var12 = var8;
            }

            var11.field2965 = var12;
            var11.field3099 = client.field451;
            if (!var11.field2992 || !class150.method2824(var11)) {
               if (var11.field2961 > 0) {
                  class37.method806(var11);
               }

               int var13 = var11.field2970 + var6;
               int var14 = var7 + var11.field2971;
               int var15 = var11.field2988;
               int var16;
               int var17;
               if (var11 == client.field580) {
                  if (var1 != -1412584499 && !var11.field3052) {
                     class87.field1224 = var0;
                     class24.field191 = var6;
                     class68.field976 = var7;
                     continue;
                  }

                  if (client.field591 && client.field585) {
                     var16 = class19.field141;
                     var17 = class19.field144;
                     var16 -= client.field582;
                     var17 -= client.field524;
                     if (var16 < client.field586) {
                        var16 = client.field586;
                     }

                     if (var16 + var11.field2972 > client.field586 + client.field581.field2972) {
                        var16 = client.field586 + client.field581.field2972 - var11.field2972;
                     }

                     if (var17 < client.field587) {
                        var17 = client.field587;
                     }

                     if (var17 + var11.field2989 > client.field587 + client.field581.field2989) {
                        var17 = client.field587 + client.field581.field2989 - var11.field2989;
                     }

                     var13 = var16;
                     var14 = var17;
                  }

                  if (!var11.field3052) {
                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var21;
               int var22;
               int var23;
               int var31;
               if (var11.field2976 == 2) {
                  var16 = var2;
                  var17 = var3;
                  var18 = var4;
                  var19 = var5;
               } else if (var11.field2976 == 9) {
                  var31 = var13;
                  var21 = var14;
                  var22 = var13 + var11.field2972;
                  var23 = var14 + var11.field2989;
                  if (var22 < var13) {
                     var31 = var22;
                     var22 = var13;
                  }

                  if (var23 < var14) {
                     var21 = var23;
                     var23 = var14;
                  }

                  ++var22;
                  ++var23;
                  var16 = var31 > var2 ? var31 : var2;
                  var17 = var21 > var3 ? var21 : var3;
                  var18 = var22 < var4 ? var22 : var4;
                  var19 = var23 < var5 ? var23 : var5;
               } else {
                  var31 = var13 + var11.field2972;
                  var21 = var14 + var11.field2989;
                  var16 = var13 > var2 ? var13 : var2;
                  var17 = var14 > var3 ? var14 : var3;
                  var18 = var31 < var4 ? var31 : var4;
                  var19 = var21 < var5 ? var21 : var5;
               }

               if (!var11.field2992 || var16 < var18 && var17 < var19) {
                  if (var11.field2961 != 0) {
                     if (var11.field2961 == 1336) {
                        if (client.field421) {
                           var14 += 15;
                           class257.field3164.method5440("Fps:" + class18.field119, var13 + var11.field2972, var14, 16776960, -1);
                           var14 += 15;
                           Runtime var39 = Runtime.getRuntime();
                           var21 = (int)((var39.totalMemory() - var39.freeMemory()) / 1024L);
                           var22 = 16776960;
                           if (var21 > 327680 && !client.field408) {
                              var22 = 16711680;
                           }

                           class257.field3164.method5440("Mem:" + var21 + "k", var13 + var11.field2972, var14, var22, -1);
                           var14 += 15;
                        }
                        continue;
                     }

                     if (var11.field2961 == 1337) {
                        client.field556 = var13;
                        client.field557 = var14;
                        class185.method3623(var13, var14, var11.field2972, var11.field2989);
                        client.field616[var11.field2965] = true;
                        class393.method6894(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field2961 == 1338) {
                        class63.method1712(var11, var13, var14, var12);
                        class393.method6894(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field2961 == 1339) {
                        class345.method6005(var11, var13, var14, var12);
                        class393.method6894(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field2961 == 1400) {
                        class24.field201.method6082(var13, var14, var11.field2972, var11.field2989, client.field451);
                     }

                     if (var11.field2961 == 1401) {
                        class24.field201.method6085(var13, var14, var11.field2972, var11.field2989);
                     }

                     if (var11.field2961 == 1402) {
                        class6.field15.method1830(var13, client.field451);
                     }
                  }

                  if (var11.field2976 == 0) {
                     if (!var11.field2992 && class150.method2824(var11) && var11 != class244.field2922) {
                        continue;
                     }

                     if (!var11.field2992) {
                        if (var11.field2967 > var11.field3090 - var11.field2989) {
                           var11.field2967 = var11.field3090 - var11.field2989;
                        }

                        if (var11.field2967 < 0) {
                           var11.field2967 = 0;
                        }
                     }

                     method2879(var0, var11.field2957, var16, var17, var18, var19, var13 - var11.field3053, var14 - var11.field2967, var12);
                     if (var11.field3060 != null) {
                        method2879(var11.field3060, var11.field2957, var16, var17, var18, var19, var13 - var11.field3053, var14 - var11.field2967, var12);
                     }

                     class66 var20 = (class66)client.field568.method6327((long)var11.field2957);
                     if (var20 != null) {
                        class41.method845(var20.field949, var16, var17, var18, var19, var13, var14, var12);
                     }

                     class393.method6894(var2, var3, var4, var5);
                     class197.method3819();
                  }

                  if (client.field612 || client.field508[var12] || client.field623 > 1) {
                     if (var11.field2976 == 0 && !var11.field2992 && var11.field3090 > var11.field2989) {
                        class100.method2158(var13 + var11.field2972, var14, var11.field2967, var11.field2989, var11.field3090);
                     }

                     if (var11.field2976 != 1) {
                        int var24;
                        int var25;
                        int var26;
                        int var27;
                        if (var11.field2976 == 2) {
                           var31 = 0;

                           for(var21 = 0; var21 < var11.field2969; ++var21) {
                              for(var22 = 0; var22 < var11.field2968; ++var22) {
                                 var23 = var13 + var22 * (var11.field3024 + 32);
                                 var24 = var21 * (var11.field3025 + 32) + var14;
                                 if (var31 < 20) {
                                    var23 += var11.field2945[var31];
                                    var24 += var11.field3027[var31];
                                 }

                                 if (var11.field3085[var31] <= 0) {
                                    if (var11.field3028 != null && var31 < 20) {
                                       class397 var43 = var11.method4688(var31);
                                       if (var43 != null) {
                                          var43.method7024(var23, var24);
                                       } else if (class248.field2955) {
                                          class80.method1934(var11);
                                       }
                                    }
                                 } else {
                                    boolean var40 = false;
                                    boolean var41 = false;
                                    var27 = var11.field3085[var31] - 1;
                                    if (var23 + 32 > var2 && var23 < var4 && var24 + 32 > var3 && var24 < var5 || var11 == client.field687 && var31 == client.field515) {
                                       class397 var28;
                                       if (client.field560 == 1 && var31 == class10.field40 && var11.field2957 == class61.field911) {
                                          var28 = class124.method2469(var27, var11.field3086[var31], 2, 0, 2, false);
                                       } else {
                                          var28 = class124.method2469(var27, var11.field3086[var31], 1, 3153952, 2, false);
                                       }

                                       if (var28 != null) {
                                          if (var11 == client.field687 && var31 == client.field515) {
                                             var25 = class19.field141 - client.field403;
                                             var26 = class19.field144 - client.field583;
                                             if (var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if (var26 < 5 && var26 > -5) {
                                                var26 = 0;
                                             }

                                             if (client.field520 < 5) {
                                                var25 = 0;
                                                var26 = 0;
                                             }

                                             var28.method7005(var23 + var25, var24 + var26, 128);
                                             if (var1 != -1) {
                                                class248 var29 = var0[var1 & '\uffff'];
                                                int var30;
                                                if (var24 + var26 < class393.field4246 && var29.field2967 > 0) {
                                                   var30 = (class393.field4246 - var24 - var26) * client.field555 / 3;
                                                   if (var30 > client.field555 * 10) {
                                                      var30 = client.field555 * 10;
                                                   }

                                                   if (var30 > var29.field2967) {
                                                      var30 = var29.field2967;
                                                   }

                                                   var29.field2967 -= var30;
                                                   client.field583 += var30;
                                                   class80.method1934(var29);
                                                }

                                                if (var26 + var24 + 32 > class393.field4243 && var29.field2967 < var29.field3090 - var29.field2989) {
                                                   var30 = (var26 + var24 + 32 - class393.field4243) * client.field555 / 3;
                                                   if (var30 > client.field555 * 10) {
                                                      var30 = client.field555 * 10;
                                                   }

                                                   if (var30 > var29.field3090 - var29.field2989 - var29.field2967) {
                                                      var30 = var29.field3090 - var29.field2989 - var29.field2967;
                                                   }

                                                   var29.field2967 += var30;
                                                   client.field583 -= var30;
                                                   class80.method1934(var29);
                                                }
                                             }
                                          } else if (var11 == class12.field77 && var31 == client.field513) {
                                             var28.method7005(var23, var24, 128);
                                          } else {
                                             var28.method7024(var23, var24);
                                          }
                                       } else {
                                          class80.method1934(var11);
                                       }
                                    }
                                 }

                                 ++var31;
                              }
                           }
                        } else if (var11.field2976 == 3) {
                           if (class143.method2730(var11)) {
                              var31 = var11.field2983;
                              if (var11 == class244.field2922 && var11.field2985 != 0) {
                                 var31 = var11.field2985;
                              }
                           } else {
                              var31 = var11.field2982;
                              if (var11 == class244.field2922 && var11.field2984 != 0) {
                                 var31 = var11.field2984;
                              }
                           }

                           if (var11.field2986) {
                              switch(var11.field3070.field4257) {
                              case 1:
                                 class393.method6881(var13, var14, var11.field2972, var11.field2989, var11.field2982, var11.field2983);
                                 break;
                              case 2:
                                 class393.method6871(var13, var14, var11.field2972, var11.field2989, var11.field2982, var11.field2983, 255 - (var11.field2988 & 255), 255 - (var11.field3102 & 255));
                                 break;
                              default:
                                 if (var15 == 0) {
                                    class393.method6880(var13, var14, var11.field2972, var11.field2989, var31);
                                 } else {
                                    class393.method6879(var13, var14, var11.field2972, var11.field2989, var31, 256 - (var15 & 255));
                                 }
                              }
                           } else if (var15 == 0) {
                              class393.method6907(var13, var14, var11.field2972, var11.field2989, var31);
                           } else {
                              class393.method6885(var13, var14, var11.field2972, var11.field2989, var31, 256 - (var15 & 255));
                           }
                        } else {
                           class301 var37;
                           if (var11.field2976 == 4) {
                              var37 = var11.method4687();
                              if (var37 == null) {
                                 if (class248.field2955) {
                                    class80.method1934(var11);
                                 }
                              } else {
                                 String var46 = var11.field3041;
                                 if (class143.method2730(var11)) {
                                    var21 = var11.field2983;
                                    if (var11 == class244.field2922 && var11.field2985 != 0) {
                                       var21 = var11.field2985;
                                    }

                                    if (var11.field3019.length() > 0) {
                                       var46 = var11.field3019;
                                    }
                                 } else {
                                    var21 = var11.field2982;
                                    if (var11 == class244.field2922 && var11.field2984 != 0) {
                                       var21 = var11.field2984;
                                    }
                                 }

                                 if (var11.field2992 && var11.field3087 != -1) {
                                    class156 var48 = class10.method105(var11.field3087);
                                    var46 = var48.field1835;
                                    if (var46 == null) {
                                       var46 = "null";
                                    }

                                    if ((var48.field1805 == 1 || var11.field3088 != 1) && var11.field3088 != -1) {
                                       var46 = class43.method850(16748608) + var46 + "</col>" + " " + 'x' + class152.method2860(var11.field3088);
                                    }
                                 }

                                 if (var11 == client.field573) {
                                    var46 = "Please wait...";
                                    var21 = var11.field2982;
                                 }

                                 if (!var11.field2992) {
                                    var46 = class69.method1765(var46, var11);
                                 }

                                 var37.method5376(var46, var13, var14, var11.field2972, var11.field2989, var21, var11.field3023 ? 0 : -1, var11.field3021, var11.field3022, var11.field3020);
                              }
                           } else if (var11.field2976 == 5) {
                              class397 var38;
                              if (!var11.field2992) {
                                 var38 = var11.method4686(class143.method2730(var11));
                                 if (var38 != null) {
                                    var38.method7024(var13, var14);
                                 } else if (class248.field2955) {
                                    class80.method1934(var11);
                                 }
                              } else {
                                 if (var11.field3087 != -1) {
                                    var38 = class124.method2469(var11.field3087, var11.field3088, var11.field2996, var11.field2997, var11.field2990, false);
                                 } else {
                                    var38 = var11.method4686(false);
                                 }

                                 if (var38 == null) {
                                    if (class248.field2955) {
                                       class80.method1934(var11);
                                    }
                                 } else {
                                    var21 = var38.field4273;
                                    var22 = var38.field4274;
                                    if (!var11.field3026) {
                                       var23 = var11.field2972 * 4096 / var21;
                                       if (var11.field3076 != 0) {
                                          var38.method7018(var11.field2972 / 2 + var13, var11.field2989 / 2 + var14, var11.field3076, var23);
                                       } else if (var15 != 0) {
                                          var38.method7007(var13, var14, var11.field2972, var11.field2989, 256 - (var15 & 255));
                                       } else if (var21 == var11.field2972 && var22 == var11.field2989) {
                                          var38.method7024(var13, var14);
                                       } else {
                                          var38.method7001(var13, var14, var11.field2972, var11.field2989);
                                       }
                                    } else {
                                       class393.method6873(var13, var14, var13 + var11.field2972, var14 + var11.field2989);
                                       var23 = (var21 - 1 + var11.field2972) / var21;
                                       var24 = (var22 - 1 + var11.field2989) / var22;

                                       for(var25 = 0; var25 < var23; ++var25) {
                                          for(var26 = 0; var26 < var24; ++var26) {
                                             if (var11.field3076 != 0) {
                                                var38.method7018(var21 / 2 + var13 + var25 * var21, var22 / 2 + var14 + var26 * var22, var11.field3076, 4096);
                                             } else if (var15 != 0) {
                                                var38.method7005(var13 + var25 * var21, var14 + var26 * var22, 256 - (var15 & 255));
                                             } else {
                                                var38.method7024(var13 + var25 * var21, var14 + var26 * var22);
                                             }
                                          }
                                       }

                                       class393.method6894(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              class156 var34;
                              if (var11.field2976 == 6) {
                                 boolean var45 = class143.method2730(var11);
                                 if (var45) {
                                    var21 = var11.field3047;
                                 } else {
                                    var21 = var11.field3004;
                                 }

                                 class206 var42 = null;
                                 var23 = 0;
                                 if (var11.field3087 != -1) {
                                    var34 = class10.method105(var11.field3087);
                                    if (var34 != null) {
                                       var34 = var34.method2987(var11.field3088);
                                       var42 = var34.method3014(1);
                                       if (var42 != null) {
                                          var42.method4137();
                                          var23 = var42.field2345 / 2;
                                       } else {
                                          class80.method1934(var11);
                                       }
                                    }
                                 } else if (var11.field2949 == 5) {
                                    if (var11.field3001 == 0) {
                                       var42 = client.field597.method4664((class158)null, -1, (class158)null, -1);
                                    } else {
                                       var42 = class19.field139.vmethod4091();
                                    }
                                 } else if (var21 == -1) {
                                    var42 = var11.method4689((class158)null, -1, var45, class19.field139.field978);
                                    if (var42 == null && class248.field2955) {
                                       class80.method1934(var11);
                                    }
                                 } else {
                                    class158 var47 = class47.method1355(var21);
                                    var42 = var11.method4689(var47, var11.field3093, var45, class19.field139.field978);
                                    if (var42 == null && class248.field2955) {
                                       class80.method1934(var11);
                                    }
                                 }

                                 class197.method3822(var11.field2972 / 2 + var13, var11.field2989 / 2 + var14);
                                 var24 = class197.field2265[var11.field3008] * var11.field2999 >> 16;
                                 var25 = class197.field2272[var11.field3008] * var11.field2999 >> 16;
                                 if (var42 != null) {
                                    if (!var11.field2992) {
                                       var42.method4187(0, var11.field3009, 0, var11.field3008, 0, var24, var25);
                                    } else {
                                       var42.method4137();
                                       if (var11.field3014) {
                                          var42.method4150(0, var11.field3009, var11.field3010, var11.field3008, var11.field3006, var24 + var23 + var11.field2959, var25 + var11.field2959, var11.field2999);
                                       } else {
                                          var42.method4187(0, var11.field3009, var11.field3010, var11.field3008, var11.field3006, var24 + var23 + var11.field2959, var25 + var11.field2959);
                                       }
                                    }
                                 }

                                 class197.method3821();
                              } else {
                                 if (var11.field2976 == 7) {
                                    var37 = var11.method4687();
                                    if (var37 == null) {
                                       if (class248.field2955) {
                                          class80.method1934(var11);
                                       }
                                       continue;
                                    }

                                    var21 = 0;

                                    for(var22 = 0; var22 < var11.field2969; ++var22) {
                                       for(var23 = 0; var23 < var11.field2968; ++var23) {
                                          if (var11.field3085[var21] > 0) {
                                             var34 = class10.method105(var11.field3085[var21] - 1);
                                             String var32;
                                             if (var34.field1805 != 1 && var11.field3086[var21] == 1) {
                                                var32 = class43.method850(16748608) + var34.field1835 + "</col>";
                                             } else {
                                                var32 = class43.method850(16748608) + var34.field1835 + "</col>" + " " + 'x' + class152.method2860(var11.field3086[var21]);
                                             }

                                             var26 = var23 * (var11.field3024 + 115) + var13;
                                             var27 = var22 * (var11.field3025 + 12) + var14;
                                             if (var11.field3021 == 0) {
                                                var37.method5372(var32, var26, var27, var11.field2982, var11.field3023 ? 0 : -1);
                                             } else if (var11.field3021 == 1) {
                                                var37.method5441(var32, var11.field2972 / 2 + var26, var27, var11.field2982, var11.field3023 ? 0 : -1);
                                             } else {
                                                var37.method5440(var32, var26 + var11.field2972 - 1, var27, var11.field2982, var11.field3023 ? 0 : -1);
                                             }
                                          }

                                          ++var21;
                                       }
                                    }
                                 }

                                 if (var11.field2976 == 8 && var11 == class292.field3698 && client.field559 == client.field648) {
                                    var31 = 0;
                                    var21 = 0;
                                    class301 var33 = class257.field3164;
                                    String var35 = var11.field3041;

                                    String var44;
                                    for(var35 = class69.method1765(var35, var11); var35.length() > 0; var21 = var21 + var33.field3737 + 1) {
                                       var25 = var35.indexOf("<br>");
                                       if (var25 != -1) {
                                          var44 = var35.substring(0, var25);
                                          var35 = var35.substring(var25 + 4);
                                       } else {
                                          var44 = var35;
                                          var35 = "";
                                       }

                                       var26 = var33.method5367(var44);
                                       if (var26 > var31) {
                                          var31 = var26;
                                       }
                                    }

                                    var31 += 6;
                                    var21 += 7;
                                    var25 = var13 + var11.field2972 - 5 - var31;
                                    var26 = var14 + var11.field2989 + 5;
                                    if (var25 < var13 + 5) {
                                       var25 = var13 + 5;
                                    }

                                    if (var25 + var31 > var4) {
                                       var25 = var4 - var31;
                                    }

                                    if (var21 + var26 > var5) {
                                       var26 = var5 - var21;
                                    }

                                    class393.method6880(var25, var26, var31, var21, 16777120);
                                    class393.method6907(var25, var26, var31, var21, 0);
                                    var35 = var11.field3041;
                                    var27 = var26 + var33.field3737 + 2;

                                    for(var35 = class69.method1765(var35, var11); var35.length() > 0; var27 = var27 + var33.field3737 + 1) {
                                       int var36 = var35.indexOf("<br>");
                                       if (var36 != -1) {
                                          var44 = var35.substring(0, var36);
                                          var35 = var35.substring(var36 + 4);
                                       } else {
                                          var44 = var35;
                                          var35 = "";
                                       }

                                       var33.method5372(var44, var25 + 3, var27, 0, -1);
                                    }
                                 }

                                 if (var11.field2976 == 9) {
                                    if (var11.field2991) {
                                       var31 = var13;
                                       var21 = var14 + var11.field2989;
                                       var22 = var13 + var11.field2972;
                                       var23 = var14;
                                    } else {
                                       var31 = var13;
                                       var21 = var14;
                                       var22 = var13 + var11.field2972;
                                       var23 = var14 + var11.field2989;
                                    }

                                    if (var11.field2958 == 1) {
                                       class393.method6870(var31, var21, var22, var23, var11.field2982);
                                    } else {
                                       class70.method1800(var31, var21, var22, var23, var11.field2982, var11.field2958);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void method2883(class248 var0, int var1) {
      if (var0.field2987 == null) {
         throw new RuntimeException();
      } else {
         if (var0.field2966 == null) {
            var0.field2966 = new int[var0.field2987.length];
         }

         var0.field2966[var1] = Integer.MAX_VALUE;
      }
   }
}
