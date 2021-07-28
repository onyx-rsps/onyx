public class class166 implements class187 {
   static int field1931;
   int field1932;
   int field1933;
   int field1934;
   int field1935;
   int field1936;
   int field1937;
   int field1938;
   int field1939;
   int field1940;
   int field1942;

   class166() {
   }

   public boolean vmethod3650(int var1, int var2) {
      return var1 >> 6 >= this.field1942 && var1 >> 6 <= this.field1939 && var2 >> 6 >= this.field1938 && var2 >> 6 <= this.field1940;
   }

   public boolean vmethod3652(int var1, int var2, int var3) {
      if (var1 >= this.field1935 && var1 < this.field1935 + this.field1932) {
         return var2 >> 6 >= this.field1937 && var2 >> 6 <= this.field1933 && var3 >> 6 >= this.field1934 && var3 >> 6 <= this.field1936;
      } else {
         return false;
      }
   }

   public void vmethod3649(class167 var1) {
      if (var1.field1952 > this.field1942) {
         var1.field1952 = this.field1942;
      }

      if (var1.field1950 < this.field1939) {
         var1.field1950 = this.field1939;
      }

      if (var1.field1951 > this.field1938) {
         var1.field1951 = this.field1938;
      }

      if (var1.field1956 < this.field1940) {
         var1.field1956 = this.field1940;
      }

   }

   public class244 vmethod3653(int var1, int var2) {
      if (!this.vmethod3650(var1, var2)) {
         return null;
      } else {
         int var4 = this.field1937 * 64 - this.field1942 * 64 + var1;
         int var5 = this.field1934 * 64 - this.field1938 * 64 + var2;
         return new class244(this.field1935, var4, var5);
      }
   }

   public int[] vmethod3651(int var1, int var2, int var3) {
      if (!this.vmethod3652(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field1942 * 64 - this.field1937 * 64 + var2, var3 + (this.field1938 * 64 - this.field1934 * 64)};
         return var5;
      }
   }

   public void vmethod3660(class384 var1) {
      this.field1935 = var1.method6560();
      this.field1932 = var1.method6560();
      this.field1937 = var1.method6655();
      this.field1934 = var1.method6655();
      this.field1933 = var1.method6655();
      this.field1936 = var1.method6655();
      this.field1942 = var1.method6655();
      this.field1938 = var1.method6655();
      this.field1939 = var1.method6655();
      this.field1940 = var1.method6655();
      this.method3202();
   }

   void method3202() {
   }

   static final void method3218(class383 var0, int var1, class69 var2, int var3) {
      byte var5 = -1;
      if ((var3 & 64) != 0) {
         var2.field1048 = var0.method6655();
         if (var2.field1026 == 0) {
            var2.field1042 = var2.field1048;
            var2.field1048 = -1;
         }
      }

      int var6;
      if ((var3 & 1024) != 0) {
         var2.field1057 = var0.method6688();
         var6 = var0.method6607();
         var2.field1061 = var6 >> 16;
         var2.field1060 = (var6 & '\uffff') + client.field451;
         var2.field1027 = 0;
         var2.field1059 = 0;
         if (var2.field1060 > client.field451) {
            var2.field1027 = -1;
         }

         if (var2.field1057 == 65535) {
            var2.field1057 = -1;
         }
      }

      if ((var3 & 16) != 0) {
         var6 = var0.method6589();
         byte[] var7 = new byte[var6];
         class384 var8 = new class384(var7);
         var0.method6652(var7, 0, var6);
         class82.field1167[var1] = var8;
         var2.method1749(var8);
      }

      if ((var3 & 2) != 0) {
         var2.field1033 = var0.method6569();
         if (var2.field1033.charAt(0) == '~') {
            var2.field1033 = var2.field1033.substring(1);
            class120.method2408(2, var2.field979.method7141(), var2.field1033);
         } else if (var2 == class19.field139) {
            class120.method2408(2, var2.field979.method7141(), var2.field1033);
         }

         var2.field1034 = false;
         var2.field1037 = 0;
         var2.field1038 = 0;
         var2.field1036 = 150;
      }

      int var14;
      if ((var3 & 1) != 0) {
         var6 = var0.method6599();
         if (var6 == 65535) {
            var6 = -1;
         }

         var14 = var0.method6591();
         class152.method2858(var2, var6, var14);
      }

      if ((var3 & 4) != 0) {
         var2.field1046 = var0.method6688();
         if (var2.field1046 == 65535) {
            var2.field1046 = -1;
         }
      }

      if ((var3 & 256) != 0) {
         var2.field1062 = var0.method6593();
         var2.field1064 = var0.method6592();
         var2.field1063 = var0.method6561();
         var2.field1065 = var0.method6547();
         var2.field1073 = var0.method6600() + client.field451;
         var2.field1067 = var0.method6599() + client.field451;
         var2.field1050 = var0.method6655();
         if (var2.field1003) {
            var2.field1062 += var2.field1004;
            var2.field1064 += var2.field1005;
            var2.field1063 += var2.field1004;
            var2.field1065 += var2.field1005;
            var2.field1026 = 0;
         } else {
            var2.field1062 += var2.field1075[0];
            var2.field1064 += var2.field1076[0];
            var2.field1063 += var2.field1075[0];
            var2.field1065 += var2.field1076[0];
            var2.field1026 = 1;
         }

         var2.field1066 = 0;
      }

      int var9;
      int var10;
      int var13;
      if ((var3 & 8) != 0) {
         var6 = var0.method6600();
         class271 var17 = (class271)class250.method4750(class84.method2027(), var0.method6589());
         boolean var15 = var0.method6560() == 1;
         var9 = var0.method6776();
         var10 = var0.field4181 * -1084587701;
         if (var2.field979 != null && var2.field978 != null) {
            boolean var11 = false;
            if (var17.field3547 && class12.field79.method1368(var2.field979)) {
               var11 = true;
            }

            if (!var11 && client.field521 == 0 && !var2.field997) {
               class82.field1181.field4181 = 0;
               var0.method6610(class82.field1181.payload, 0, var9);
               class82.field1181.field4181 = 0;
               String var12 = class302.method5434(class285.method5089(class175.method3535(class82.field1181)));
               var2.field1033 = var12.trim();
               var2.field1037 = var6 >> 8;
               var2.field1038 = var6 & 255;
               var2.field1036 = 150;
               var2.field1034 = var15;
               var2.field1079 = var2 != class19.field139 && var17.field3547 && "" != client.field629 && var12.toLowerCase().indexOf(client.field629) == -1;
               if (var17.field3546) {
                  var13 = var15 ? 91 : 1;
               } else {
                  var13 = var15 ? 90 : 2;
               }

               if (var17.field3542 != -1) {
                  class120.method2408(var13, class76.method1877(var17.field3542) + var2.field979.method7141(), var12);
               } else {
                  class120.method2408(var13, var2.field979.method7141(), var12);
               }
            }
         }

         var0.field4181 = (var9 + var10) * 99;
      }

      if ((var3 & 2048) != 0) {
         class82.field1170[var1] = var0.method6561();
      }

      if ((var3 & 128) != 0) {
         var6 = var0.method6776();
         int var16;
         int var19;
         int var20;
         if (var6 > 0) {
            for(var14 = 0; var14 < var6; ++var14) {
               var9 = -1;
               var10 = -1;
               var19 = -1;
               var20 = var0.method6574();
               if (var20 == 32767) {
                  var20 = var0.method6574();
                  var10 = var0.method6574();
                  var9 = var0.method6574();
                  var19 = var0.method6574();
               } else if (var20 != 32766) {
                  var10 = var0.method6574();
               } else {
                  var20 = -1;
               }

               var16 = var0.method6574();
               var2.method1814(var20, var10, var9, var19, client.field451, var16);
            }
         }

         var14 = var0.method6589();
         if (var14 > 0) {
            for(var20 = 0; var20 < var14; ++var20) {
               var9 = var0.method6574();
               var10 = var0.method6574();
               if (var10 != 32767) {
                  var19 = var0.method6574();
                  var16 = var0.method6589();
                  var13 = var10 > 0 ? var0.method6591() : var16;
                  var2.method1805(var9, client.field451, var10, var19, var16, var13);
               } else {
                  var2.method1806(var9);
               }
            }
         }
      }

      if ((var3 & 4096) != 0) {
         for(var6 = 0; var6 < 3; ++var6) {
            var2.field981[var6] = var0.method6569();
         }
      }

      if ((var3 & 8192) != 0) {
         var5 = var0.method6561();
      }

      if (var2.field1003) {
         if (var5 == 127) {
            var2.method1771(var2.field1004, var2.field1005);
         } else {
            byte var18;
            if (var5 != -1) {
               var18 = var5;
            } else {
               var18 = class82.field1170[var1];
            }

            var2.method1761(var2.field1004, var2.field1005, var18);
         }
      }

   }

   static int method3205(int var0, class58 var1, boolean var2) {
      int var4;
      if (var0 == 6600) {
         var4 = class284.field3651;
         int var10 = (class19.field139.field1068 >> 7) + class280.field3624;
         int var6 = (class19.field139.field1058 >> 7) + class77.field1133;
         class185.method3625().method6069(var4, var10, var6, true);
         return 1;
      } else {
         class167 var12;
         if (var0 == 6601) {
            var4 = class50.field746[--class50.field745];
            String var17 = "";
            var12 = class185.method3625().method6092(var4);
            if (var12 != null) {
               var17 = var12.method3230();
            }

            class50.field737[++class1.field3 - 1] = var17;
            return 1;
         } else if (var0 == 6602) {
            var4 = class50.field746[--class50.field745];
            class185.method3625().method6075(var4);
            return 1;
         } else if (var0 == 6603) {
            class50.field746[++class50.field745 - 1] = class185.method3625().method6089();
            return 1;
         } else if (var0 == 6604) {
            var4 = class50.field746[--class50.field745];
            class185.method3625().method6193(var4);
            return 1;
         } else if (var0 == 6605) {
            class50.field746[++class50.field745 - 1] = class185.method3625().method6091() ? 1 : 0;
            return 1;
         } else {
            class244 var16;
            if (var0 == 6606) {
               var16 = new class244(class50.field746[--class50.field745]);
               class185.method3625().method6093(var16.field2919, var16.field2921);
               return 1;
            } else if (var0 == 6607) {
               var16 = new class244(class50.field746[--class50.field745]);
               class185.method3625().method6094(var16.field2919, var16.field2921);
               return 1;
            } else if (var0 == 6608) {
               var16 = new class244(class50.field746[--class50.field745]);
               class185.method3625().method6095(var16.field2920, var16.field2919, var16.field2921);
               return 1;
            } else if (var0 == 6609) {
               var16 = new class244(class50.field746[--class50.field745]);
               class185.method3625().method6121(var16.field2920, var16.field2919, var16.field2921);
               return 1;
            } else if (var0 == 6610) {
               class50.field746[++class50.field745 - 1] = class185.method3625().method6097();
               class50.field746[++class50.field745 - 1] = class185.method3625().method6142();
               return 1;
            } else {
               class167 var14;
               if (var0 == 6611) {
                  var4 = class50.field746[--class50.field745];
                  var14 = class185.method3625().method6092(var4);
                  if (var14 == null) {
                     class50.field746[++class50.field745 - 1] = 0;
                  } else {
                     class50.field746[++class50.field745 - 1] = var14.method3240().method4628();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var4 = class50.field746[--class50.field745];
                  var14 = class185.method3625().method6092(var4);
                  if (var14 == null) {
                     class50.field746[++class50.field745 - 1] = 0;
                     class50.field746[++class50.field745 - 1] = 0;
                  } else {
                     class50.field746[++class50.field745 - 1] = (var14.method3234() - var14.method3279() + 1) * 64;
                     class50.field746[++class50.field745 - 1] = (var14.method3236() - var14.method3235() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == 6613) {
                  var4 = class50.field746[--class50.field745];
                  var14 = class185.method3625().method6092(var4);
                  if (var14 == null) {
                     class50.field746[++class50.field745 - 1] = 0;
                     class50.field746[++class50.field745 - 1] = 0;
                     class50.field746[++class50.field745 - 1] = 0;
                     class50.field746[++class50.field745 - 1] = 0;
                  } else {
                     class50.field746[++class50.field745 - 1] = var14.method3279() * 64;
                     class50.field746[++class50.field745 - 1] = var14.method3235() * 64;
                     class50.field746[++class50.field745 - 1] = var14.method3234() * 64 + 64 - 1;
                     class50.field746[++class50.field745 - 1] = var14.method3236() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var4 = class50.field746[--class50.field745];
                  var14 = class185.method3625().method6092(var4);
                  if (var14 == null) {
                     class50.field746[++class50.field745 - 1] = -1;
                  } else {
                     class50.field746[++class50.field745 - 1] = var14.method3255();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var16 = class185.method3625().method6099();
                  if (var16 == null) {
                     class50.field746[++class50.field745 - 1] = -1;
                     class50.field746[++class50.field745 - 1] = -1;
                  } else {
                     class50.field746[++class50.field745 - 1] = var16.field2919;
                     class50.field746[++class50.field745 - 1] = var16.field2921;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  class50.field746[++class50.field745 - 1] = class185.method3625().method6076();
                  return 1;
               } else if (var0 == 6617) {
                  var16 = new class244(class50.field746[--class50.field745]);
                  var14 = class185.method3625().method6132();
                  if (var14 == null) {
                     class50.field746[++class50.field745 - 1] = -1;
                     class50.field746[++class50.field745 - 1] = -1;
                     return 1;
                  } else {
                     int[] var15 = var14.method3258(var16.field2920, var16.field2919, var16.field2921);
                     if (var15 == null) {
                        class50.field746[++class50.field745 - 1] = -1;
                        class50.field746[++class50.field745 - 1] = -1;
                     } else {
                        class50.field746[++class50.field745 - 1] = var15[0];
                        class50.field746[++class50.field745 - 1] = var15[1];
                     }

                     return 1;
                  }
               } else {
                  class244 var8;
                  if (var0 == 6618) {
                     var16 = new class244(class50.field746[--class50.field745]);
                     var14 = class185.method3625().method6132();
                     if (var14 == null) {
                        class50.field746[++class50.field745 - 1] = -1;
                        class50.field746[++class50.field745 - 1] = -1;
                        return 1;
                     } else {
                        var8 = var14.method3225(var16.field2919, var16.field2921);
                        if (var8 == null) {
                           class50.field746[++class50.field745 - 1] = -1;
                        } else {
                           class50.field746[++class50.field745 - 1] = var8.method4628();
                        }

                        return 1;
                     }
                  } else {
                     class244 var13;
                     if (var0 == 6619) {
                        class50.field745 -= 2;
                        var4 = class50.field746[class50.field745];
                        var13 = new class244(class50.field746[class50.field745 + 1]);
                        class196.method3816(var4, var13, false);
                        return 1;
                     } else if (var0 == 6620) {
                        class50.field745 -= 2;
                        var4 = class50.field746[class50.field745];
                        var13 = new class244(class50.field746[class50.field745 + 1]);
                        class196.method3816(var4, var13, true);
                        return 1;
                     } else if (var0 == 6621) {
                        class50.field745 -= 2;
                        var4 = class50.field746[class50.field745];
                        var13 = new class244(class50.field746[class50.field745 + 1]);
                        var12 = class185.method3625().method6092(var4);
                        if (var12 == null) {
                           class50.field746[++class50.field745 - 1] = 0;
                           return 1;
                        } else {
                           class50.field746[++class50.field745 - 1] = var12.method3222(var13.field2920, var13.field2919, var13.field2921) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        class50.field746[++class50.field745 - 1] = class185.method3625().method6100();
                        class50.field746[++class50.field745 - 1] = class185.method3625().method6101();
                        return 1;
                     } else if (var0 == 6623) {
                        var16 = new class244(class50.field746[--class50.field745]);
                        var14 = class185.method3625().method6073(var16.field2920, var16.field2919, var16.field2921);
                        if (var14 == null) {
                           class50.field746[++class50.field745 - 1] = -1;
                        } else {
                           class50.field746[++class50.field745 - 1] = var14.method3227();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        class185.method3625().method6102(class50.field746[--class50.field745]);
                        return 1;
                     } else if (var0 == 6625) {
                        class185.method3625().method6150();
                        return 1;
                     } else if (var0 == 6626) {
                        class185.method3625().method6103(class50.field746[--class50.field745]);
                        return 1;
                     } else if (var0 == 6627) {
                        class185.method3625().method6104();
                        return 1;
                     } else {
                        boolean var11;
                        if (var0 == 6628) {
                           var11 = class50.field746[--class50.field745] == 1;
                           class185.method3625().method6105(var11);
                           return 1;
                        } else if (var0 == 6629) {
                           var4 = class50.field746[--class50.field745];
                           class185.method3625().method6106(var4);
                           return 1;
                        } else if (var0 == 6630) {
                           var4 = class50.field746[--class50.field745];
                           class185.method3625().method6107(var4);
                           return 1;
                        } else if (var0 == 6631) {
                           class185.method3625().method6252();
                           return 1;
                        } else if (var0 == 6632) {
                           var11 = class50.field746[--class50.field745] == 1;
                           class185.method3625().method6109(var11);
                           return 1;
                        } else {
                           boolean var5;
                           if (var0 == 6633) {
                              class50.field745 -= 2;
                              var4 = class50.field746[class50.field745];
                              var5 = class50.field746[class50.field745 + 1] == 1;
                              class185.method3625().method6222(var4, var5);
                              return 1;
                           } else if (var0 == 6634) {
                              class50.field745 -= 2;
                              var4 = class50.field746[class50.field745];
                              var5 = class50.field746[class50.field745 + 1] == 1;
                              class185.method3625().method6111(var4, var5);
                              return 1;
                           } else if (var0 == 6635) {
                              class50.field746[++class50.field745 - 1] = class185.method3625().method6087() ? 1 : 0;
                              return 1;
                           } else if (var0 == 6636) {
                              var4 = class50.field746[--class50.field745];
                              class50.field746[++class50.field745 - 1] = class185.method3625().method6113(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var4 = class50.field746[--class50.field745];
                              class50.field746[++class50.field745 - 1] = class185.method3625().method6189(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class50.field745 -= 2;
                              var4 = class50.field746[class50.field745];
                              var13 = new class244(class50.field746[class50.field745 + 1]);
                              var8 = class185.method3625().method6117(var4, var13);
                              if (var8 == null) {
                                 class50.field746[++class50.field745 - 1] = -1;
                              } else {
                                 class50.field746[++class50.field745 - 1] = var8.method4628();
                              }

                              return 1;
                           } else {
                              class185 var9;
                              if (var0 == 6639) {
                                 var9 = class185.method3625().method6200();
                                 if (var9 == null) {
                                    class50.field746[++class50.field745 - 1] = -1;
                                    class50.field746[++class50.field745 - 1] = -1;
                                 } else {
                                    class50.field746[++class50.field745 - 1] = var9.vmethod3612();
                                    class50.field746[++class50.field745 - 1] = var9.field2109.method4628();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var9 = class185.method3625().method6120();
                                 if (var9 == null) {
                                    class50.field746[++class50.field745 - 1] = -1;
                                    class50.field746[++class50.field745 - 1] = -1;
                                 } else {
                                    class50.field746[++class50.field745 - 1] = var9.vmethod3612();
                                    class50.field746[++class50.field745 - 1] = var9.field2109.method4628();
                                 }

                                 return 1;
                              } else {
                                 class140 var7;
                                 if (var0 == 6693) {
                                    var4 = class50.field746[--class50.field745];
                                    var7 = class72.method1825(var4);
                                    if (var7.field1536 == null) {
                                       class50.field737[++class1.field3 - 1] = "";
                                    } else {
                                       class50.field737[++class1.field3 - 1] = var7.field1536;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var4 = class50.field746[--class50.field745];
                                    var7 = class72.method1825(var4);
                                    class50.field746[++class50.field745 - 1] = var7.field1538;
                                    return 1;
                                 } else if (var0 == 6695) {
                                    var4 = class50.field746[--class50.field745];
                                    var7 = class72.method1825(var4);
                                    if (var7 == null) {
                                       class50.field746[++class50.field745 - 1] = -1;
                                    } else {
                                       class50.field746[++class50.field745 - 1] = var7.field1552;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var4 = class50.field746[--class50.field745];
                                    var7 = class72.method1825(var4);
                                    if (var7 == null) {
                                       class50.field746[++class50.field745 - 1] = -1;
                                    } else {
                                       class50.field746[++class50.field745 - 1] = var7.field1534;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    class50.field746[++class50.field745 - 1] = class330.field3878.field2135;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    class50.field746[++class50.field745 - 1] = class330.field3878.field2132.method4628();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    class50.field746[++class50.field745 - 1] = class330.field3878.field2133.method4628();
                                    return 1;
                                 } else {
                                    return 2;
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

   public static int method3216(CharSequence var0, CharSequence var1, class291 var2) {
      int var4 = var0.length();
      int var5 = var1.length();
      int var6 = 0;
      int var7 = 0;
      byte var8 = 0;
      byte var9 = 0;

      while(var6 - var8 < var4 || var7 - var9 < var5) {
         if (var6 - var8 >= var4) {
            return -1;
         }

         if (var7 - var9 >= var5) {
            return 1;
         }

         char var10;
         if (var8 != 0) {
            var10 = (char)var8;
            boolean var15 = false;
         } else {
            var10 = var0.charAt(var6++);
         }

         char var11;
         if (var9 != 0) {
            var11 = (char)var9;
            boolean var16 = false;
         } else {
            var11 = var1.charAt(var7++);
         }

         byte var12;
         if (var10 == 198) {
            var12 = 69;
         } else if (var10 == 230) {
            var12 = 101;
         } else if (var10 == 223) {
            var12 = 115;
         } else if (var10 == 338) {
            var12 = 69;
         } else if (var10 == 339) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = var12;
         byte var13;
         if (var11 == 198) {
            var13 = 69;
         } else if (var11 == 230) {
            var13 = 101;
         } else if (var11 == 223) {
            var13 = 115;
         } else if (var11 == 338) {
            var13 = 69;
         } else if (var11 == 339) {
            var13 = 101;
         } else {
            var13 = 0;
         }

         var9 = var13;
         var10 = class151.method2836(var10, var2);
         var11 = class151.method2836(var11, var2);
         if (var10 != var11 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
            var10 = Character.toLowerCase(var10);
            var11 = Character.toLowerCase(var11);
            if (var10 != var11) {
               return class41.method836(var10, var2) - class41.method836(var11, var2);
            }
         }
      }

      int var17 = Math.min(var4, var5);

      int var18;
      char var21;
      for(var18 = 0; var18 < var17; ++var18) {
         if (var2 == class291.field3690) {
            var6 = var4 - 1 - var18;
            var7 = var5 - 1 - var18;
         } else {
            var7 = var18;
            var6 = var18;
         }

         char var19 = var0.charAt(var6);
         var21 = var1.charAt(var7);
         if (var19 != var21 && Character.toUpperCase(var19) != Character.toUpperCase(var21)) {
            var19 = Character.toLowerCase(var19);
            var21 = Character.toLowerCase(var21);
            if (var21 != var19) {
               return class41.method836(var19, var2) - class41.method836(var21, var2);
            }
         }
      }

      var18 = var4 - var5;
      if (var18 != 0) {
         return var18;
      } else {
         for(int var20 = 0; var20 < var17; ++var20) {
            var21 = var0.charAt(var20);
            char var14 = var1.charAt(var20);
            if (var14 != var21) {
               return class41.method836(var21, var2) - class41.method836(var14, var2);
            }
         }

         return 0;
      }
   }
}
