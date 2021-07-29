import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class class12 extends Canvas {
   public static class48 field79;
   static class131 field78;
   static class248 field77;
   Component field75;

   class12(Component var1) {
      this.field75 = var1;
   }

   public final void paint(Graphics var1) {
      this.field75.paint(var1);
   }

   public final void update(Graphics var1) {
      this.field75.update(var1);
   }

   static final void method121(class30 var0) {
      var0.field250 = false;
      if (var0.field252 != null) {
         var0.field252.field349 = 0;
      }

      for(class30 var2 = var0.vmethod4569(); var2 != null; var2 = var0.vmethod4576()) {
         method121(var2);
      }

   }

   static File method125(String var0, String var1, int var2) {
      String var4 = var2 == 0 ? "" : "" + var2;
      class130.field1475 = new File(class234.field2822, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
      String var5 = null;
      String var6 = null;
      boolean var7 = false;
      Buffer var9;
      int var12;
      File var28;
      if (class130.field1475.exists()) {
         try {
            class368 var8 = new class368(class130.field1475, "rw", 10000L);

            int var10;
            for(var9 = new Buffer((int)var8.method6357()); var9.field4181 * -1084587701 < var9.payload.length; var9.field4181 = (var9.field4181 * -1084587701 + var10) * 99) {
               var10 = var8.method6363(var9.payload, var9.field4181 * -1084587701, var9.payload.length - var9.field4181 * -1084587701);
               if (var10 == -1) {
                  throw new IOException();
               }
            }

            var9.field4181 = 0;
            var10 = var9.method6560();
            if (var10 < 1 || var10 > 3) {
               throw new IOException("" + var10);
            }

            int var11 = 0;
            if (var10 > 1) {
               var11 = var9.method6560();
            }

            if (var10 <= 2) {
               var5 = var9.method6706();
               if (var11 == 1) {
                  var6 = var9.method6706();
               }
            } else {
               var5 = var9.method6571();
               if (var11 == 1) {
                  var6 = var9.method6571();
               }
            }

            var8.method6360();
         } catch (IOException var26) {
            var26.printStackTrace();
         }

         if (var5 != null) {
            var28 = new File(var5);
            if (!var28.exists()) {
               var5 = null;
            }
         }

         if (var5 != null) {
            var28 = new File(var5, "test.dat");

            boolean var29;
            try {
               RandomAccessFile var16 = new RandomAccessFile(var28, "rw");
               var12 = var16.read();
               var16.seek(0L);
               var16.write(var12);
               var16.seek(0L);
               var16.close();
               var28.delete();
               var29 = true;
            } catch (Exception var24) {
               var29 = false;
            }

            if (!var29) {
               var5 = null;
            }
         }
      }

      if (var5 == null && var2 == 0) {
         label134:
         for(int var17 = 0; var17 < class254.field3126.length; ++var17) {
            for(int var18 = 0; var18 < class95.field1253.length; ++var18) {
               File var19 = new File(class95.field1253[var18] + class254.field3126[var17] + File.separatorChar + var0 + File.separatorChar);
               if (var19.exists()) {
                  File var20 = new File(var19, "test.dat");

                  boolean var30;
                  try {
                     RandomAccessFile var13 = new RandomAccessFile(var20, "rw");
                     int var14 = var13.read();
                     var13.seek(0L);
                     var13.write(var14);
                     var13.seek(0L);
                     var13.close();
                     var20.delete();
                     var30 = true;
                  } catch (Exception var23) {
                     var30 = false;
                  }

                  if (var30) {
                     var5 = var19.toString();
                     var7 = true;
                     break label134;
                  }
               }
            }
         }
      }

      if (var5 == null) {
         var5 = class234.field2822 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var7 = true;
      }

      File var27;
      if (var6 != null) {
         var27 = new File(var6);
         var28 = new File(var5);

         try {
            File[] var34 = var27.listFiles();
            File[] var32 = var34;

            for(var12 = 0; var12 < var32.length; ++var12) {
               File var31 = var32[var12];
               File var21 = new File(var28, var31.getName());
               boolean var15 = var31.renameTo(var21);
               if (!var15) {
                  throw new IOException();
               }
            }
         } catch (Exception var25) {
            var25.printStackTrace();
         }

         var7 = true;
      }

      if (var7) {
         var27 = new File(var5);
         var9 = null;

         try {
            class368 var35 = new class368(class130.field1475, "rw", 10000L);
            Buffer var33 = new Buffer(500);
            var33.writeByte(3);
            var33.writeByte(var9 != null ? 1 : 0);
            var33.method6552(var27.getPath());
            if (var9 != null) {
               var33.method6552(var27.getPath());
            }

            var35.method6364(var33.payload, 0, var33.field4181 * -1084587701);
            var35.method6360();
         } catch (IOException var22) {
            var22.printStackTrace();
         }
      }

      return new File(var5);
   }

   static final void method114(class227 var0) {
      class383 var2 = client.field452.field1200;
      byte var4;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var38;
      int var39;
      int var40;
      if (class227.field2675 == var0) {
         var38 = var2.method6560();
         var4 = var2.method6547();
         var40 = var2.method6688();
         var6 = var2.method6599();
         byte var41 = var2.method6561();
         var8 = var2.method6589();
         var9 = (var8 >> 4 & 7) + class291.field3694;
         var10 = (var8 & 7) + class57.field858;
         var11 = var2.method6591() * 4;
         var12 = var2.method6589() * 4;
         var13 = var2.method6601();
         var14 = var2.method6776();
         var15 = var2.method6655();
         var39 = var4 + var9;
         var7 = var41 + var10;
         if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var39 >= 0 && var7 >= 0 && var39 < 104 && var7 < 104 && var6 != 65535) {
            var9 = var9 * 128 + 64;
            var10 = var10 * 128 + 64;
            var39 = var39 * 128 + 64;
            var7 = var7 * 128 + 64;
            class56 var16 = new class56(var6, class284.field3651, var9, var10, class122.method2438(var9, var10, class284.field3651) - var12, var15 + client.field451, var40 + client.field451, var38, var14, var13, var11);
            var16.method1627(var39, var7, class122.method2438(var39, var7, class284.field3651) - var11, var15 + client.field451);
            client.field537.method5187(var16);
         }

      } else {
         if (class227.field2676 == var0) {
            byte var3 = var2.method6593();
            var4 = var2.method6593();
            byte var5 = var2.method6592();
            var6 = var2.method6599();
            var7 = var2.method6655();
            var8 = var2.method6600();
            var9 = var2.method6776();
            var10 = var9 >> 2;
            var11 = var9 & 3;
            var12 = client.field467[var10];
            var13 = var2.method6589();
            var14 = (var13 >> 4 & 7) + class291.field3694;
            var15 = (var13 & 7) + class57.field858;
            byte var32 = var2.method6592();
            int var17 = var2.method6599();
            class69 var18;
            if (var8 == client.field664) {
               var18 = class19.field139;
            } else {
               var18 = client.field523[var8];
            }

            if (var18 != null) {
               class155 var19 = class123.method2465(var7);
               int var20;
               int var21;
               if (var11 != 1 && var11 != 3) {
                  var20 = var19.field1749;
                  var21 = var19.field1750;
               } else {
                  var20 = var19.field1750;
                  var21 = var19.field1749;
               }

               int var22 = var14 + (var20 >> 1);
               int var23 = var14 + (var20 + 1 >> 1);
               int var24 = var15 + (var21 >> 1);
               int var25 = var15 + (var21 + 1 >> 1);
               int[][] var26 = class61.field910[class284.field3651];
               int var27 = var26[var23][var25] + var26[var22][var25] + var26[var22][var24] + var26[var23][var24] >> 2;
               int var28 = (var14 << 7) + (var20 << 6);
               int var29 = (var15 << 7) + (var21 << 6);
               class206 var30 = var19.method2937(var10, var11, var26, var28, var27, var29);
               if (var30 != null) {
                  class64.method1714(class284.field3651, var14, var15, var12, -1, 0, 0, var17 + 1, var6 + 1);
                  var18.field985 = var17 + client.field451;
                  var18.field986 = var6 + client.field451;
                  var18.field980 = var30;
                  var18.field982 = var14 * 128 + var20 * 64;
                  var18.field989 = var15 * 128 + var21 * 64;
                  var18.field983 = var27;
                  byte var31;
                  if (var3 > var32) {
                     var31 = var3;
                     var3 = var32;
                     var32 = var31;
                  }

                  if (var5 > var4) {
                     var31 = var5;
                     var5 = var4;
                     var4 = var31;
                  }

                  var18.field977 = var14 + var3;
                  var18.field993 = var32 + var14;
                  var18.field992 = var5 + var15;
                  var18.field988 = var15 + var4;
               }
            }
         }

         if (class227.field2682 == var0) {
            var38 = var2.method6589();
            var39 = (var38 >> 4 & 7) + class291.field3694;
            var40 = (var38 & 7) + class57.field858;
            var6 = var2.method6591();
            var7 = var2.method6600();
            var8 = var2.method6600();
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
               var39 = var39 * 128 + 64;
               var40 = var40 * 128 + 64;
               class51 var42 = new class51(var8, class284.field3651, var39, var40, class122.method2438(var39, var40, class284.field3651) - var6, var7, client.field451);
               client.field538.method5187(var42);
            }

         } else if (class227.field2683 == var0) {
            var38 = var2.method6600();
            var39 = var2.method6591();
            var40 = (var39 >> 4 & 7) + class291.field3694;
            var6 = (var39 & 7) + class57.field858;
            var7 = var2.method6688();
            var8 = var2.method6655();
            if (var40 >= 0 && var6 >= 0 && var40 < 104 && var6 < 104) {
               class295 var33 = client.field535[class284.field3651][var40][var6];
               if (var33 != null) {
                  for(class81 var34 = (class81)var33.method5202(); var34 != null; var34 = (class81)var33.method5193()) {
                     if ((var7 & 32767) == var34.field1166 && var8 == var34.field1163) {
                        var34.field1163 = var38;
                        break;
                     }
                  }

                  class48.method1425(var40, var6);
               }
            }

         } else {
            class81 var36;
            if (class227.field2680 == var0) {
               var38 = var2.method6776();
               var39 = (var38 >> 4 & 7) + class291.field3694;
               var40 = (var38 & 7) + class57.field858;
               var6 = var2.method6599();
               if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                  class295 var35 = client.field535[class284.field3651][var39][var40];
                  if (var35 != null) {
                     for(var36 = (class81)var35.method5202(); var36 != null; var36 = (class81)var35.method5193()) {
                        if ((var6 & 32767) == var36.field1166) {
                           var36.method6014();
                           break;
                        }
                     }

                     if (var35.method5202() == null) {
                        client.field535[class284.field3651][var39][var40] = null;
                     }

                     class48.method1425(var39, var40);
                  }
               }

            } else if (class227.field2678 == var0) {
               var38 = var2.method6560();
               var39 = (var38 >> 4 & 7) + class291.field3694;
               var40 = (var38 & 7) + class57.field858;
               var6 = var2.method6776();
               var7 = var6 >> 2;
               var8 = var6 & 3;
               var9 = client.field467[var7];
               if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                  class64.method1714(class284.field3651, var39, var40, var9, -1, var7, var8, 0, -1);
               }

            } else {
               if (class227.field2681 == var0) {
                  var38 = var2.method6655();
                  var39 = var2.method6776();
                  var40 = (var39 >> 4 & 7) + class291.field3694;
                  var6 = (var39 & 7) + class57.field858;
                  var7 = var2.method6560();
                  var8 = var7 >> 4 & 15;
                  var9 = var7 & 7;
                  var10 = var2.method6776();
                  if (var40 >= 0 && var6 >= 0 && var40 < 104 && var6 < 104) {
                     var11 = var8 + 1;
                     if (class19.field139.field1075[0] >= var40 - var11 && class19.field139.field1075[0] <= var40 + var11 && class19.field139.field1076[0] >= var6 - var11 && class19.field139.field1076[0] <= var6 + var11 && class37.field307.field1115 != 0 && var9 > 0 && client.field497 < 50) {
                        client.field628[client.field497] = var38;
                        client.field650[client.field497] = var9;
                        client.field651[client.field497] = var10;
                        client.field653[client.field497] = null;
                        client.field652[client.field497] = var8 + (var6 << 8) + (var40 << 16);
                        ++client.field497;
                     }
                  }
               }

               if (class227.field2674 == var0) {
                  var38 = var2.method6776();
                  var39 = (var38 >> 4 & 7) + class291.field3694;
                  var40 = (var38 & 7) + class57.field858;
                  var6 = var2.method6688();
                  var7 = var2.method6688();
                  if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                     var36 = new class81();
                     var36.field1166 = var6;
                     var36.field1163 = var7;
                     if (client.field535[class284.field3651][var39][var40] == null) {
                        client.field535[class284.field3651][var39][var40] = new class295();
                     }

                     client.field535[class284.field3651][var39][var40].method5187(var36);
                     class48.method1425(var39, var40);
                  }

               } else if (class227.field2677 != var0) {
                  if (class227.field2679 == var0) {
                     var38 = var2.method6776();
                     var39 = var38 >> 2;
                     var40 = var38 & 3;
                     var6 = client.field467[var39];
                     var7 = var2.method6560();
                     var8 = (var7 >> 4 & 7) + class291.field3694;
                     var9 = (var7 & 7) + class57.field858;
                     var10 = var2.method6655();
                     if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                        class64.method1714(class284.field3651, var8, var9, var6, var10, var39, var40, 0, -1);
                     }

                  }
               } else {
                  var38 = var2.method6589();
                  var39 = (var38 >> 4 & 7) + class291.field3694;
                  var40 = (var38 & 7) + class57.field858;
                  var6 = var2.method6600();
                  var7 = var2.method6591();
                  var8 = var7 >> 2;
                  var9 = var7 & 3;
                  var10 = client.field467[var8];
                  if (var39 >= 0 && var40 >= 0 && var39 < 103 && var40 < 103) {
                     if (var10 == 0) {
                        class211 var37 = class165.field1924.method3987(class284.field3651, var39, var40);
                        if (var37 != null) {
                           var12 = class78.method1904(var37.field2515);
                           if (var8 == 2) {
                              var37.field2513 = new class59(var12, 2, var9 + 4, class284.field3651, var39, var40, var6, false, var37.field2513);
                              var37.field2514 = new class59(var12, 2, var9 + 1 & 3, class284.field3651, var39, var40, var6, false, var37.field2514);
                           } else {
                              var37.field2513 = new class59(var12, var8, var9, class284.field3651, var39, var40, var6, false, var37.field2513);
                           }
                        }
                     }

                     if (var10 == 1) {
                        class213 var43 = class165.field1924.method3924(class284.field3651, var39, var40);
                        if (var43 != null) {
                           var12 = class78.method1904(var43.field2522);
                           if (var8 != 4 && var8 != 5) {
                              if (var8 == 6) {
                                 var43.field2527 = new class59(var12, 4, var9 + 4, class284.field3651, var39, var40, var6, false, var43.field2527);
                              } else if (var8 == 7) {
                                 var43.field2527 = new class59(var12, 4, (var9 + 2 & 3) + 4, class284.field3651, var39, var40, var6, false, var43.field2527);
                              } else if (var8 == 8) {
                                 var43.field2527 = new class59(var12, 4, var9 + 4, class284.field3651, var39, var40, var6, false, var43.field2527);
                                 var43.field2528 = new class59(var12, 4, (var9 + 2 & 3) + 4, class284.field3651, var39, var40, var6, false, var43.field2528);
                              }
                           } else {
                              var43.field2527 = new class59(var12, 4, var9, class284.field3651, var39, var40, var6, false, var43.field2527);
                           }
                        }
                     }

                     if (var10 == 2) {
                        class214 var44 = class165.field1924.method3970(class284.field3651, var39, var40);
                        if (var8 == 11) {
                           var8 = 10;
                        }

                        if (var44 != null) {
                           var44.field2535 = new class59(class78.method1904(var44.field2537), var8, var9, class284.field3651, var39, var40, var6, false, var44.field2535);
                        }
                     }

                     if (var10 == 3) {
                        class193 var45 = class165.field1924.method3926(class284.field3651, var39, var40);
                        if (var45 != null) {
                           var45.field2194 = new class59(class78.method1904(var45.field2193), 22, var9, class284.field3651, var39, var40, var6, false, var45.field2194);
                        }
                     }
                  }

               }
            }
         }
      }
   }

   public static void method123() {
      class248.field2951.method4309();
      class248.field2952.method4309();
      class248.field2953.method4309();
      class248.field2998.method4309();
   }

   static final void method120(int var0, int var1, int var2, int var3, int var4, int var5, int var6, class199 var7, class159 var8) {
      class155 var10 = class123.method2465(var4);
      int var11;
      int var12;
      if (var5 != 1 && var5 != 3) {
         var11 = var10.field1749;
         var12 = var10.field1750;
      } else {
         var11 = var10.field1750;
         var12 = var10.field1749;
      }

      int var13;
      int var14;
      if (var11 + var2 <= 104) {
         var13 = (var11 >> 1) + var2;
         var14 = var2 + (var11 + 1 >> 1);
      } else {
         var13 = var2;
         var14 = var2 + 1;
      }

      int var15;
      int var16;
      if (var3 + var12 <= 104) {
         var15 = var3 + (var12 >> 1);
         var16 = var3 + (var12 + 1 >> 1);
      } else {
         var15 = var3;
         var16 = var3 + 1;
      }

      int[][] var17 = class61.field910[var1];
      int var18 = var17[var14][var16] + var17[var13][var15] + var17[var14][var15] + var17[var13][var16] >> 2;
      int var19 = (var2 << 7) + (var11 << 6);
      int var20 = (var3 << 7) + (var12 << 6);
      long var21 = class171.method3480(var2, var3, 2, var10.field1753 == 0, var4);
      int var23 = (var5 << 6) + var6;
      if (var10.field1774 == 1) {
         var23 += 256;
      }

      Object var24;
      if (var6 == 22) {
         if (var10.field1757 == -1 && var10.field1761 == null) {
            var24 = var10.method2937(22, var5, var17, var19, var18, var20);
         } else {
            var24 = new class59(var4, 22, var5, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
         }

         var7.method4029(var0, var2, var3, var18, (class200)var24, var21, var23);
         if (var10.field1751 == 1) {
            var8.method3127(var2, var3);
         }

      } else if (var6 != 10 && var6 != 11) {
         if (var6 >= 12) {
            if (var10.field1757 == -1 && var10.field1761 == null) {
               var24 = var10.method2937(var6, var5, var17, var19, var18, var20);
            } else {
               var24 = new class59(var4, var6, var5, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
            }

            var7.method3911(var0, var2, var3, var18, 1, 1, (class200)var24, 0, var21, var23);
            if (var10.field1751 != 0) {
               var8.method3133(var2, var3, var11, var12, var10.field1778);
            }

         } else if (var6 == 0) {
            if (var10.field1757 == -1 && var10.field1761 == null) {
               var24 = var10.method2937(0, var5, var17, var19, var18, var20);
            } else {
               var24 = new class59(var4, 0, var5, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
            }

            var7.method3909(var0, var2, var3, var18, (class200)var24, (class200)null, class61.field907[var5], 0, var21, var23);
            if (var10.field1751 != 0) {
               var8.method3102(var2, var3, var6, var5, var10.field1778);
            }

         } else if (var6 == 1) {
            if (var10.field1757 == -1 && var10.field1761 == null) {
               var24 = var10.method2937(1, var5, var17, var19, var18, var20);
            } else {
               var24 = new class59(var4, 1, var5, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
            }

            var7.method3909(var0, var2, var3, var18, (class200)var24, (class200)null, class61.field908[var5], 0, var21, var23);
            if (var10.field1751 != 0) {
               var8.method3102(var2, var3, var6, var5, var10.field1778);
            }

         } else {
            int var30;
            if (var6 == 2) {
               var30 = var5 + 1 & 3;
               Object var25;
               Object var26;
               if (var10.field1757 == -1 && var10.field1761 == null) {
                  var25 = var10.method2937(2, var5 + 4, var17, var19, var18, var20);
                  var26 = var10.method2937(2, var30, var17, var19, var18, var20);
               } else {
                  var25 = new class59(var4, 2, var5 + 4, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
                  var26 = new class59(var4, 2, var30, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
               }

               var7.method3909(var0, var2, var3, var18, (class200)var25, (class200)var26, class61.field907[var5], class61.field907[var30], var21, var23);
               if (var10.field1751 != 0) {
                  var8.method3102(var2, var3, var6, var5, var10.field1778);
               }

            } else if (var6 == 3) {
               if (var10.field1757 == -1 && var10.field1761 == null) {
                  var24 = var10.method2937(3, var5, var17, var19, var18, var20);
               } else {
                  var24 = new class59(var4, 3, var5, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
               }

               var7.method3909(var0, var2, var3, var18, (class200)var24, (class200)null, class61.field908[var5], 0, var21, var23);
               if (var10.field1751 != 0) {
                  var8.method3102(var2, var3, var6, var5, var10.field1778);
               }

            } else if (var6 == 9) {
               if (var10.field1757 == -1 && var10.field1761 == null) {
                  var24 = var10.method2937(var6, var5, var17, var19, var18, var20);
               } else {
                  var24 = new class59(var4, var6, var5, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
               }

               var7.method3911(var0, var2, var3, var18, 1, 1, (class200)var24, 0, var21, var23);
               if (var10.field1751 != 0) {
                  var8.method3133(var2, var3, var11, var12, var10.field1778);
               }

            } else if (var6 == 4) {
               if (var10.field1757 == -1 && var10.field1761 == null) {
                  var24 = var10.method2937(4, var5, var17, var19, var18, var20);
               } else {
                  var24 = new class59(var4, 4, var5, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
               }

               var7.method3910(var0, var2, var3, var18, (class200)var24, (class200)null, class61.field907[var5], 0, 0, 0, var21, var23);
            } else {
               Object var27;
               long var31;
               if (var6 == 5) {
                  var30 = 16;
                  var31 = var7.method3927(var0, var2, var3);
                  if (0L != var31) {
                     var30 = class123.method2465(class78.method1904(var31)).field1744;
                  }

                  if (var10.field1757 == -1 && var10.field1761 == null) {
                     var27 = var10.method2937(4, var5, var17, var19, var18, var20);
                  } else {
                     var27 = new class59(var4, 4, var5, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
                  }

                  var7.method3910(var0, var2, var3, var18, (class200)var27, (class200)null, class61.field907[var5], 0, var30 * class61.field905[var5], var30 * class61.field912[var5], var21, var23);
               } else if (var6 == 6) {
                  var30 = 8;
                  var31 = var7.method3927(var0, var2, var3);
                  if (0L != var31) {
                     var30 = class123.method2465(class78.method1904(var31)).field1744 / 2;
                  }

                  if (var10.field1757 == -1 && var10.field1761 == null) {
                     var27 = var10.method2937(4, var5 + 4, var17, var19, var18, var20);
                  } else {
                     var27 = new class59(var4, 4, var5 + 4, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
                  }

                  var7.method3910(var0, var2, var3, var18, (class200)var27, (class200)null, 256, var5, var30 * class61.field903[var5], var30 * class61.field914[var5], var21, var23);
               } else if (var6 == 7) {
                  int var33 = var5 + 2 & 3;
                  if (var10.field1757 == -1 && var10.field1761 == null) {
                     var24 = var10.method2937(4, var33 + 4, var17, var19, var18, var20);
                  } else {
                     var24 = new class59(var4, 4, var33 + 4, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
                  }

                  var7.method3910(var0, var2, var3, var18, (class200)var24, (class200)null, 256, var33, 0, 0, var21, var23);
               } else if (var6 == 8) {
                  var30 = 8;
                  var31 = var7.method3927(var0, var2, var3);
                  if (var31 != 0L) {
                     var30 = class123.method2465(class78.method1904(var31)).field1744 / 2;
                  }

                  int var29 = var5 + 2 & 3;
                  Object var28;
                  if (var10.field1757 == -1 && var10.field1761 == null) {
                     var27 = var10.method2937(4, var5 + 4, var17, var19, var18, var20);
                     var28 = var10.method2937(4, var29 + 4, var17, var19, var18, var20);
                  } else {
                     var27 = new class59(var4, 4, var5 + 4, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
                     var28 = new class59(var4, 4, var29 + 4, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
                  }

                  var7.method3910(var0, var2, var3, var18, (class200)var27, (class200)var28, 256, var5, var30 * class61.field903[var5], var30 * class61.field914[var5], var21, var23);
               }
            }
         }
      } else {
         if (var10.field1757 == -1 && var10.field1761 == null) {
            var24 = var10.method2937(10, var5, var17, var19, var18, var20);
         } else {
            var24 = new class59(var4, 10, var5, var1, var2, var3, var10.field1757, var10.field1733, (class200)null);
         }

         if (var24 != null) {
            var7.method3911(var0, var2, var3, var18, var11, var12, (class200)var24, var6 == 11 ? 256 : 0, var21, var23);
         }

         if (var10.field1751 != 0) {
            var8.method3133(var2, var3, var11, var12, var10.field1778);
         }

      }
   }

   static int method124(int var0, class58 var1, boolean var2) {
      if (var0 == 3300) {
         class50.field746[++class50.field745 - 1] = client.field451;
         return 1;
      } else {
         int var4;
         int var5;
         if (var0 == 3301) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = class213.method4267(var4, var5);
            return 1;
         } else if (var0 == 3302) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = class92.method2107(var4, var5);
            return 1;
         } else if (var0 == 3303) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            class50.field746[++class50.field745 - 1] = class257.method4810(var4, var5);
            return 1;
         } else if (var0 == 3304) {
            var4 = class50.field746[--class50.field745];
            class50.field746[++class50.field745 - 1] = class100.method2160(var4).field1522;
            return 1;
         } else if (var0 == 3305) {
            var4 = class50.field746[--class50.field745];
            class50.field746[++class50.field745 - 1] = client.field434[var4];
            return 1;
         } else if (var0 == 3306) {
            var4 = class50.field746[--class50.field745];
            class50.field746[++class50.field745 - 1] = client.field540[var4];
            return 1;
         } else if (var0 == 3307) {
            var4 = class50.field746[--class50.field745];
            class50.field746[++class50.field745 - 1] = client.field541[var4];
            return 1;
         } else {
            int var6;
            if (var0 == 3308) {
               var4 = class284.field3651;
               var5 = (class19.field139.field1068 >> 7) + class280.field3624;
               var6 = (class19.field139.field1058 >> 7) + class77.field1133;
               class50.field746[++class50.field745 - 1] = (var5 << 14) + var6 + (var4 << 28);
               return 1;
            } else if (var0 == 3309) {
               var4 = class50.field746[--class50.field745];
               class50.field746[++class50.field745 - 1] = var4 >> 14 & 16383;
               return 1;
            } else if (var0 == 3310) {
               var4 = class50.field746[--class50.field745];
               class50.field746[++class50.field745 - 1] = var4 >> 28;
               return 1;
            } else if (var0 == 3311) {
               var4 = class50.field746[--class50.field745];
               class50.field746[++class50.field745 - 1] = var4 & 16383;
               return 1;
            } else if (var0 == 3312) {
               class50.field746[++class50.field745 - 1] = client.field561 ? 1 : 0;
               return 1;
            } else if (var0 == 3313) {
               class50.field745 -= 2;
               var4 = class50.field746[class50.field745] + '\u8000';
               var5 = class50.field746[class50.field745 + 1];
               class50.field746[++class50.field745 - 1] = class213.method4267(var4, var5);
               return 1;
            } else if (var0 == 3314) {
               class50.field745 -= 2;
               var4 = class50.field746[class50.field745] + '\u8000';
               var5 = class50.field746[class50.field745 + 1];
               class50.field746[++class50.field745 - 1] = class92.method2107(var4, var5);
               return 1;
            } else if (var0 == 3315) {
               class50.field745 -= 2;
               var4 = class50.field746[class50.field745] + '\u8000';
               var5 = class50.field746[class50.field745 + 1];
               class50.field746[++class50.field745 - 1] = class257.method4810(var4, var5);
               return 1;
            } else if (var0 == 3316) {
               if (client.field576 >= 2) {
                  class50.field746[++class50.field745 - 1] = client.field576;
               } else {
                  class50.field746[++class50.field745 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3317) {
               class50.field746[++class50.field745 - 1] = client.field422;
               return 1;
            } else if (var0 == 3318) {
               class50.field746[++class50.field745 - 1] = client.field404;
               return 1;
            } else if (var0 == 3321) {
               class50.field746[++class50.field745 - 1] = client.field431;
               return 1;
            } else if (var0 == 3322) {
               class50.field746[++class50.field745 - 1] = client.field575;
               return 1;
            } else if (var0 == 3323) {
               if (client.field602) {
                  class50.field746[++class50.field745 - 1] = 1;
               } else {
                  class50.field746[++class50.field745 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3324) {
               class50.field746[++class50.field745 - 1] = client.field405;
               return 1;
            } else if (var0 == 3325) {
               class50.field745 -= 4;
               var4 = class50.field746[class50.field745];
               var5 = class50.field746[class50.field745 + 1];
               var6 = class50.field746[class50.field745 + 2];
               int var7 = class50.field746[class50.field745 + 3];
               var4 += var5 << 14;
               var4 += var6 << 28;
               var4 += var7;
               class50.field746[++class50.field745 - 1] = var4;
               return 1;
            } else if (var0 == 3326) {
               class50.field746[++class50.field745 - 1] = client.field417;
               return 1;
            } else if (var0 == 3327) {
               class50.field746[++class50.field745 - 1] = client.field418;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
