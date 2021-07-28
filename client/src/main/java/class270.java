public class class270 implements class289 {
   static class274 field3535;
   static int field3532;
   static final class270 field3530;
   static final class270 field3531;
   static final class270 field3533;
   static final class270 field3536;
   final int field3529;

   static {
      field3530 = new class270(-1);
      field3533 = new class270(0);
      field3531 = new class270(1);
      field3536 = new class270(2);
   }

   class270(int var1) {
      this.field3529 = var1;
   }

   public int vmethod6962() {
      return this.field3529;
   }

   static final void method4850() {
      class19.method369("You can't add yourself to your own ignore list");
   }

   static final void method4858(class248[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         class248 var10 = var0[var9];
         if (var10 != null && var10.field3000 == var1 && (!var10.field2992 || var10.field2976 == 0 || var10.field3043 || class240.method4608(var10) != 0 || var10 == client.field581 || var10.field2961 == 1338)) {
            if (var10.field2992) {
               if (class150.method2824(var10)) {
                  continue;
               }
            } else if (var10.field2976 == 0 && var10 != class244.field2922 && class150.method2824(var10)) {
               continue;
            }

            int var11 = var10.field2970 + var6;
            int var12 = var7 + var10.field2971;
            int var13;
            int var14;
            int var15;
            int var16;
            int var18;
            int var19;
            if (var10.field2976 == 2) {
               var13 = var2;
               var14 = var3;
               var15 = var4;
               var16 = var5;
            } else {
               int var17;
               if (var10.field2976 == 9) {
                  var17 = var11;
                  var18 = var12;
                  var19 = var11 + var10.field2972;
                  int var20 = var12 + var10.field2989;
                  if (var19 < var11) {
                     var17 = var19;
                     var19 = var11;
                  }

                  if (var20 < var12) {
                     var18 = var20;
                     var20 = var12;
                  }

                  ++var19;
                  ++var20;
                  var13 = var17 > var2 ? var17 : var2;
                  var14 = var18 > var3 ? var18 : var3;
                  var15 = var19 < var4 ? var19 : var4;
                  var16 = var20 < var5 ? var20 : var5;
               } else {
                  var17 = var11 + var10.field2972;
                  var18 = var12 + var10.field2989;
                  var13 = var11 > var2 ? var11 : var2;
                  var14 = var12 > var3 ? var12 : var3;
                  var15 = var17 < var4 ? var17 : var4;
                  var16 = var18 < var5 ? var18 : var5;
               }
            }

            if (var10 == client.field580) {
               client.field588 = true;
               client.field678 = var11;
               client.field676 = var12;
            }

            boolean var34 = false;
            if (var10.field3031) {
               switch(client.field569) {
               case 0:
                  var34 = true;
               case 1:
               default:
                  break;
               case 2:
                  if (client.field483 == var10.field2957 >>> 16) {
                     var34 = true;
                  }
                  break;
               case 3:
                  if (var10.field2957 == client.field483) {
                     var34 = true;
                  }
               }
            }

            if (var34 || !var10.field2992 || var13 < var15 && var14 < var16) {
               if (var10.field2992) {
                  class67 var27;
                  if (var10.field3101) {
                     if (class19.field141 >= var13 && class19.field144 >= var14 && class19.field141 < var15 && class19.field144 < var16) {
                        for(var27 = (class67)client.field610.method5202(); var27 != null; var27 = (class67)client.field610.method5193()) {
                           if (var27.field963) {
                              var27.method6014();
                              var27.field960.field3092 = false;
                           }
                        }

                        if (class106.field1318 == 0) {
                           client.field580 = null;
                           client.field581 = null;
                        }

                        if (!client.field543) {
                           class10.method106();
                        }
                     }
                  } else if (var10.field3077 && class19.field141 >= var13 && class19.field144 >= var14 && class19.field141 < var15 && class19.field144 < var16) {
                     for(var27 = (class67)client.field610.method5202(); var27 != null; var27 = (class67)client.field610.method5193()) {
                        if (var27.field963 && var27.field960.field3064 == var27.field954) {
                           var27.method6014();
                        }
                     }
                  }
               }

               var18 = class19.field141;
               var19 = class19.field144;
               if (class19.field148 != 0) {
                  var18 = class19.field149;
                  var19 = class19.field150;
               }

               boolean var35 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
               if (var10.field2961 == 1337) {
                  if (!client.field414 && !client.field543 && var35) {
                     class264.method4826(var18, var19, var13, var14);
                  }
               } else if (var10.field2961 == 1338) {
                  class53.method1586(var10, var11, var12);
               } else {
                  if (var10.field2961 == 1400) {
                     class24.field201.method6065(class19.field141, class19.field144, var35, var11, var12, var10.field2972, var10.field2989);
                  }

                  if (!client.field543 && var35) {
                     if (var10.field2961 == 1400) {
                        class24.field201.method6077(var11, var12, var10.field2972, var10.field2989, var18, var19);
                     } else {
                        class18.method344(var10, var18 - var11, var19 - var12);
                     }
                  }

                  boolean var22;
                  int var24;
                  if (var34) {
                     for(int var21 = 0; var21 < var10.field2987.length; ++var21) {
                        var22 = false;
                        boolean var23 = false;
                        if (!var22 && var10.field2987[var21] != null) {
                           for(var24 = 0; var24 < var10.field2987[var21].length; ++var24) {
                              boolean var25 = false;
                              if (var10.field2966 != null) {
                                 var25 = class10.field45[var10.field2987[var21][var24]];
                              }

                              if (class310.method5572(var10.field2987[var21][var24]) || var25) {
                                 var22 = true;
                                 if (var10.field2966 != null && var10.field2966[var21] > client.field451) {
                                    break;
                                 }

                                 byte var26 = var10.field3033[var21][var24];
                                 if (var26 == 0 || ((var26 & 8) == 0 || !class10.field45[86] && !class10.field45[82] && !class10.field45[81]) && ((var26 & 2) == 0 || class10.field45[86]) && ((var26 & 1) == 0 || class10.field45[82]) && ((var26 & 4) == 0 || class10.field45[81])) {
                                    var23 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var23) {
                           if (var21 < 10) {
                              class183.method3588(var21 + 1, var10.field2957, var10.field3030, var10.field3087, "");
                           } else if (var21 == 10) {
                              class165.method3179();
                              class45.method885(var10.field2957, var10.field3030, class103.method2182(class240.method4608(var10)), var10.field3087);
                              client.field565 = class24.method473(var10);
                              if (client.field565 == null) {
                                 client.field565 = "null";
                              }

                              client.field465 = var10.field3036 + class43.method850(16777215);
                           }

                           var24 = var10.field2993[var21];
                           if (var10.field2966 == null) {
                              var10.field2966 = new int[var10.field2987.length];
                           }

                           if (var10.field3035 == null) {
                              var10.field3035 = new int[var10.field2987.length];
                           }

                           if (var24 != 0) {
                              if (var10.field2966[var21] == 0) {
                                 var10.field2966[var21] = var24 + client.field451 + var10.field3035[var21];
                              } else {
                                 var10.field2966[var21] = var24 + client.field451;
                              }
                           } else {
                              var10.field2966[var21] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var22 && var10.field2966 != null) {
                           var10.field2966[var21] = 0;
                        }
                     }
                  }

                  if (var10.field2992) {
                     if (class19.field141 >= var13 && class19.field144 >= var14 && class19.field141 < var15 && class19.field144 < var16) {
                        var35 = true;
                     } else {
                        var35 = false;
                     }

                     boolean var36 = false;
                     if ((class19.field140 == 1 || !class310.field3776 && class19.field140 == 4) && var35) {
                        var36 = true;
                     }

                     var22 = false;
                     if ((class19.field148 == 1 || !class310.field3776 && class19.field148 == 4) && class19.field149 >= var13 && class19.field150 >= var14 && class19.field149 < var15 && class19.field150 < var16) {
                        var22 = true;
                     }

                     if (var22) {
                        class64.method1726(var10, class19.field149 - var11, class19.field150 - var12);
                     }

                     if (var10.field2961 == 1400) {
                        class24.field201.method6066(var18, var19, var35 & var36, var35 & var22);
                     }

                     if (client.field580 != null && var10 != client.field580 && var35 && class82.method1953(class240.method4608(var10))) {
                        client.field584 = var10;
                     }

                     if (var10 == client.field581) {
                        client.field585 = true;
                        client.field586 = var11;
                        client.field587 = var12;
                     }

                     if (var10.field3043) {
                        class67 var28;
                        if (var35 && client.field656 != 0 && var10.field3064 != null) {
                           var28 = new class67();
                           var28.field963 = true;
                           var28.field960 = var10;
                           var28.field955 = client.field656;
                           var28.field954 = var10.field3064;
                           client.field610.method5187(var28);
                        }

                        if (client.field580 != null || client.field687 != null || client.field543) {
                           var22 = false;
                           var36 = false;
                           var35 = false;
                        }

                        if (!var10.field2979 && var22) {
                           var10.field2979 = true;
                           if (var10.field3045 != null) {
                              var28 = new class67();
                              var28.field963 = true;
                              var28.field960 = var10;
                              var28.field952 = class19.field149 - var11;
                              var28.field955 = class19.field150 - var12;
                              var28.field954 = var10.field3045;
                              client.field610.method5187(var28);
                           }
                        }

                        if (var10.field2979 && var36 && var10.field3046 != null) {
                           var28 = new class67();
                           var28.field963 = true;
                           var28.field960 = var10;
                           var28.field952 = class19.field141 - var11;
                           var28.field955 = class19.field144 - var12;
                           var28.field954 = var10.field3046;
                           client.field610.method5187(var28);
                        }

                        if (var10.field2979 && !var36) {
                           var10.field2979 = false;
                           if (var10.field2954 != null) {
                              var28 = new class67();
                              var28.field963 = true;
                              var28.field960 = var10;
                              var28.field952 = class19.field141 - var11;
                              var28.field955 = class19.field144 - var12;
                              var28.field954 = var10.field2954;
                              client.field685.method5187(var28);
                           }
                        }

                        if (var36 && var10.field3048 != null) {
                           var28 = new class67();
                           var28.field963 = true;
                           var28.field960 = var10;
                           var28.field952 = class19.field141 - var11;
                           var28.field955 = class19.field144 - var12;
                           var28.field954 = var10.field3048;
                           client.field610.method5187(var28);
                        }

                        if (!var10.field3092 && var35) {
                           var10.field3092 = true;
                           if (var10.field3049 != null) {
                              var28 = new class67();
                              var28.field963 = true;
                              var28.field960 = var10;
                              var28.field952 = class19.field141 - var11;
                              var28.field955 = class19.field144 - var12;
                              var28.field954 = var10.field3049;
                              client.field610.method5187(var28);
                           }
                        }

                        if (var10.field3092 && var35 && var10.field3050 != null) {
                           var28 = new class67();
                           var28.field963 = true;
                           var28.field960 = var10;
                           var28.field952 = class19.field141 - var11;
                           var28.field955 = class19.field144 - var12;
                           var28.field954 = var10.field3050;
                           client.field610.method5187(var28);
                        }

                        if (var10.field3092 && !var35) {
                           var10.field3092 = false;
                           if (var10.field3051 != null) {
                              var28 = new class67();
                              var28.field963 = true;
                              var28.field960 = var10;
                              var28.field952 = class19.field141 - var11;
                              var28.field955 = class19.field144 - var12;
                              var28.field954 = var10.field3051;
                              client.field685.method5187(var28);
                           }
                        }

                        if (var10.field3016 != null) {
                           var28 = new class67();
                           var28.field960 = var10;
                           var28.field954 = var10.field3016;
                           client.field611.method5187(var28);
                        }

                        class67 var33;
                        int var37;
                        int var38;
                        if (var10.field3056 != null && client.field551 > var10.field3095) {
                           if (var10.field3057 != null && client.field551 - var10.field3095 <= 32) {
                              label630:
                              for(var37 = var10.field3095; var37 < client.field551; ++var37) {
                                 var24 = client.field593[var37 & 31];

                                 for(var38 = 0; var38 < var10.field3057.length; ++var38) {
                                    if (var24 == var10.field3057[var38]) {
                                       var33 = new class67();
                                       var33.field960 = var10;
                                       var33.field954 = var10.field3056;
                                       client.field610.method5187(var33);
                                       break label630;
                                    }
                                 }
                              }
                           } else {
                              var28 = new class67();
                              var28.field960 = var10;
                              var28.field954 = var10.field3056;
                              client.field610.method5187(var28);
                           }

                           var10.field3095 = client.field551;
                        }

                        if (var10.field3082 != null && client.field574 > var10.field3096) {
                           if (var10.field3059 != null && client.field574 - var10.field3096 <= 32) {
                              label606:
                              for(var37 = var10.field3096; var37 < client.field574; ++var37) {
                                 var24 = client.field640[var37 & 31];

                                 for(var38 = 0; var38 < var10.field3059.length; ++var38) {
                                    if (var24 == var10.field3059[var38]) {
                                       var33 = new class67();
                                       var33.field960 = var10;
                                       var33.field954 = var10.field3082;
                                       client.field610.method5187(var33);
                                       break label606;
                                    }
                                 }
                              }
                           } else {
                              var28 = new class67();
                              var28.field960 = var10;
                              var28.field954 = var10.field3082;
                              client.field610.method5187(var28);
                           }

                           var10.field3096 = client.field574;
                        }

                        if (var10.field2995 != null && client.field598 > var10.field3097) {
                           if (var10.field3061 != null && client.field598 - var10.field3097 <= 32) {
                              label582:
                              for(var37 = var10.field3097; var37 < client.field598; ++var37) {
                                 var24 = client.field427[var37 & 31];

                                 for(var38 = 0; var38 < var10.field3061.length; ++var38) {
                                    if (var24 == var10.field3061[var38]) {
                                       var33 = new class67();
                                       var33.field960 = var10;
                                       var33.field954 = var10.field2995;
                                       client.field610.method5187(var33);
                                       break label582;
                                    }
                                 }
                              }
                           } else {
                              var28 = new class67();
                              var28.field960 = var10;
                              var28.field954 = var10.field2995;
                              client.field610.method5187(var28);
                           }

                           var10.field3097 = client.field598;
                        }

                        if (client.field601 > var10.field3094 && var10.field3065 != null) {
                           var28 = new class67();
                           var28.field960 = var10;
                           var28.field954 = var10.field3065;
                           client.field610.method5187(var28);
                        }

                        if (client.field609 > var10.field3094 && var10.field3069 != null) {
                           var28 = new class67();
                           var28.field960 = var10;
                           var28.field954 = var10.field3069;
                           client.field610.method5187(var28);
                        }

                        if (client.field603 > var10.field3094 && var10.field3058 != null) {
                           var28 = new class67();
                           var28.field960 = var10;
                           var28.field954 = var10.field3058;
                           client.field610.method5187(var28);
                        }

                        if (client.field604 > var10.field3094 && var10.field3074 != null) {
                           var28 = new class67();
                           var28.field960 = var10;
                           var28.field954 = var10.field3074;
                           client.field610.method5187(var28);
                        }

                        if (client.field605 > var10.field3094 && var10.field3072 != null) {
                           var28 = new class67();
                           var28.field960 = var10;
                           var28.field954 = var10.field3072;
                           client.field610.method5187(var28);
                        }

                        if (client.field606 > var10.field3094 && var10.field2981 != null) {
                           var28 = new class67();
                           var28.field960 = var10;
                           var28.field954 = var10.field2981;
                           client.field610.method5187(var28);
                        }

                        if (client.field479 > var10.field3094 && var10.field3078 != null) {
                           var28 = new class67();
                           var28.field960 = var10;
                           var28.field954 = var10.field3078;
                           client.field610.method5187(var28);
                        }

                        if (client.field516 > var10.field3094 && var10.field3073 != null) {
                           var28 = new class67();
                           var28.field960 = var10;
                           var28.field954 = var10.field3073;
                           client.field610.method5187(var28);
                        }

                        var10.field3094 = client.field592;
                        if (var10.field3066 != null) {
                           for(var37 = 0; var37 < client.field450; ++var37) {
                              class67 var31 = new class67();
                              var31.field960 = var10;
                              var31.field958 = client.field430[var37];
                              var31.field959 = client.field633[var37];
                              var31.field954 = var10.field3066;
                              client.field610.method5187(var31);
                           }
                        }

                        class67 var32;
                        int[] var39;
                        if (var10.field3067 != null) {
                           var39 = class136.method2613();

                           for(var24 = 0; var24 < var39.length; ++var24) {
                              var32 = new class67();
                              var32.field960 = var10;
                              var32.field958 = var39[var24];
                              var32.field954 = var10.field3067;
                              client.field610.method5187(var32);
                           }
                        }

                        if (var10.field3068 != null) {
                           var39 = class75.method1874();

                           for(var24 = 0; var24 < var39.length; ++var24) {
                              var32 = new class67();
                              var32.field960 = var10;
                              var32.field958 = var39[var24];
                              var32.field954 = var10.field3068;
                              client.field610.method5187(var32);
                           }
                        }
                     }
                  }

                  if (!var10.field2992) {
                     if (client.field580 != null || client.field687 != null || client.field543) {
                        continue;
                     }

                     if ((var10.field3011 >= 0 || var10.field2984 != 0) && class19.field141 >= var13 && class19.field144 >= var14 && class19.field141 < var15 && class19.field144 < var16) {
                        if (var10.field3011 >= 0) {
                           class244.field2922 = var0[var10.field3011];
                        } else {
                           class244.field2922 = var10;
                        }
                     }

                     if (var10.field2976 == 8 && class19.field141 >= var13 && class19.field144 >= var14 && class19.field141 < var15 && class19.field144 < var16) {
                        class292.field3698 = var10;
                     }

                     if (var10.field3090 > var10.field2989) {
                        class124.method2468(var10, var11 + var10.field2972, var12, var10.field2989, var10.field3090, class19.field141, class19.field144);
                     }
                  }

                  if (var10.field2976 == 0) {
                     method4858(var0, var10.field2957, var13, var14, var15, var16, var11 - var10.field3053, var12 - var10.field2967);
                     if (var10.field3060 != null) {
                        method4858(var10.field3060, var10.field2957, var13, var14, var15, var16, var11 - var10.field3053, var12 - var10.field2967);
                     }

                     class66 var29 = (class66)client.field568.method6327((long)var10.field2957);
                     if (var29 != null) {
                        if (var29.field948 == 0 && class19.field141 >= var13 && class19.field144 >= var14 && class19.field141 < var15 && class19.field144 < var16 && !client.field543) {
                           for(class67 var30 = (class67)client.field610.method5202(); var30 != null; var30 = (class67)client.field610.method5193()) {
                              if (var30.field963) {
                                 var30.method6014();
                                 var30.field960.field3092 = false;
                              }
                           }

                           if (class106.field1318 == 0) {
                              client.field580 = null;
                              client.field581 = null;
                           }

                           if (!client.field543) {
                              class10.method106();
                           }
                        }

                        class245.method4637(var29.field949, var13, var14, var15, var16, var11, var12);
                     }
                  }
               }
            }
         }
      }

   }
}
