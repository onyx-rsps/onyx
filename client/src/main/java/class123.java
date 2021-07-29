import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class123 extends class353 {
   public static int field1438;
   static class274 field1439;
   boolean field1431;
   boolean field1434;
   int[] field1432;
   long field1433;
   public byte field1430;
   public byte field1436;
   public String field1429;
   public List field1435;

   static {
      new BitSet(65536);
   }

   public class123(Buffer var1) {
      this.field1434 = true;
      this.field1429 = null;
      this.method2446(var1);
   }

   void method2442(int var1) {
      this.field1435.remove(var1);
      this.field1432 = null;
   }

   public int method2452() {
      return this.field1435.size();
   }

   void method2446(Buffer var1) {
      int var3 = var1.method6560();
      if ((var3 & 1) != 0) {
         this.field1431 = true;
      }

      if ((var3 & 2) != 0) {
         this.field1434 = true;
      }

      int var4 = 2;
      if ((var3 & 4) != 0) {
         var4 = var1.method6560();
      }

      super.field3965 = var1.method6566();
      this.field1433 = var1.method6566();
      this.field1429 = var1.method6569();
      var1.method6790();
      this.field1436 = var1.method6561();
      this.field1430 = var1.method6561();
      int var5 = var1.method6655();
      if (var5 > 0) {
         this.field1435 = new ArrayList(var5);

         for(int var6 = 0; var6 < var5; ++var6) {
            class105 var7 = new class105();
            if (this.field1431) {
               var1.method6566();
            }

            if (this.field1434) {
               var7.field1302 = new class405(var1.method6569());
            }

            var7.field1305 = var1.method6561();
            var7.field1301 = var1.method6655();
            if (var4 >= 3) {
               var1.method6790();
            }

            this.field1435.add(var6, var7);
         }
      }

   }

   void method2451(class105 var1) {
      this.field1435.add(var1);
      this.field1432 = null;
   }

   public int[] method2445() {
      if (this.field1432 == null) {
         String[] var2 = new String[this.field1435.size()];
         this.field1432 = new int[this.field1435.size()];

         for(int var3 = 0; var3 < this.field1435.size(); this.field1432[var3] = var3++) {
            var2[var3] = ((class105)this.field1435.get(var3)).field1302.method7142();
         }

         class282.method5055(var2, this.field1432);
      }

      return this.field1432;
   }

   public int method2444(String var1) {
      if (!this.field1434) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var3 = 0; var3 < this.field1435.size(); ++var3) {
            if (((class105)this.field1435.get(var3)).field1302.method7141().equalsIgnoreCase(var1)) {
               return var3;
            }
         }

         return -1;
      }
   }

   public static class155 method2465(int var0) {
      class155 var2 = (class155)class155.field1783.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class155.field1734.method4920(6, var0);
         var2 = new class155();
         var2.field1752 = var0;
         if (var3 != null) {
            var2.method2930(new Buffer(var3));
         }

         var2.method2921();
         if (var2.field1784) {
            var2.field1751 = 0;
            var2.field1778 = false;
         }

         class155.field1783.method4308(var2, (long)var0);
         return var2;
      }
   }

   public static int method2440(int var0, int var1, int var2, class160 var3, class159 var4, boolean var5, int[] var6, int[] var7) {
      int var10;
      for(int var9 = 0; var9 < 128; ++var9) {
         for(var10 = 0; var10 < 128; ++var10) {
            class161.field1898[var9][var10] = 0;
            class161.field1899[var9][var10] = 99999999;
         }
      }

      int var11;
      int var12;
      byte var14;
      int var15;
      int var16;
      int var18;
      int var20;
      int var21;
      int var22;
      int var23;
      boolean var29;
      int var31;
      int var32;
      int var34;
      if (var2 == 1) {
         var29 = class139.method2646(var0, var1, var3, var4);
      } else if (var2 == 2) {
         var29 = class10.method107(var0, var1, var3, var4);
      } else {
         var11 = var0;
         var12 = var1;
         byte var13 = 64;
         var14 = 64;
         var15 = var0 - var13;
         var16 = var1 - var14;
         class161.field1898[var13][var14] = 99;
         class161.field1899[var13][var14] = 0;
         byte var17 = 0;
         var18 = 0;
         class161.field1901[var17] = var0;
         var34 = var17 + 1;
         class161.field1904[var17] = var1;
         int[][] var28 = var4.field1888;

         boolean var30;
         label381:
         while(true) {
            label379:
            while(true) {
               do {
                  do {
                     do {
                        label356:
                        do {
                           if (var34 == var18) {
                              class26.field219 = var11;
                              class161.field1896 = var12;
                              var30 = false;
                              break label381;
                           }

                           var11 = class161.field1901[var18];
                           var12 = class161.field1904[var18];
                           var18 = var18 + 1 & 4095;
                           var31 = var11 - var15;
                           var32 = var12 - var16;
                           var20 = var11 - var4.field1884;
                           var21 = var12 - var4.field1887;
                           if (var3.vmethod3137(var2, var11, var12, var4)) {
                              class26.field219 = var11;
                              class161.field1896 = var12;
                              var30 = true;
                              break label381;
                           }

                           var22 = class161.field1899[var31][var32] + 1;
                           if (var31 > 0 && class161.field1898[var31 - 1][var32] == 0 && (var28[var20 - 1][var21] & 19136782) == 0 && (var28[var20 - 1][var21 + var2 - 1] & 19136824) == 0) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2 - 1) {
                                    class161.field1901[var34] = var11 - 1;
                                    class161.field1904[var34] = var12;
                                    var34 = var34 + 1 & 4095;
                                    class161.field1898[var31 - 1][var32] = 2;
                                    class161.field1899[var31 - 1][var32] = var22;
                                    break;
                                 }

                                 if ((var28[var20 - 1][var21 + var23] & 19136830) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var31 < 128 - var2 && class161.field1898[var31 + 1][var32] == 0 && (var28[var20 + var2][var21] & 19136899) == 0 && (var28[var20 + var2][var21 + var2 - 1] & 19136992) == 0) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2 - 1) {
                                    class161.field1901[var34] = var11 + 1;
                                    class161.field1904[var34] = var12;
                                    var34 = var34 + 1 & 4095;
                                    class161.field1898[var31 + 1][var32] = 8;
                                    class161.field1899[var31 + 1][var32] = var22;
                                    break;
                                 }

                                 if ((var28[var20 + var2][var21 + var23] & 19136995) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var32 > 0 && class161.field1898[var31][var32 - 1] == 0 && (var28[var20][var21 - 1] & 19136782) == 0 && (var28[var20 + var2 - 1][var21 - 1] & 19136899) == 0) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2 - 1) {
                                    class161.field1901[var34] = var11;
                                    class161.field1904[var34] = var12 - 1;
                                    var34 = var34 + 1 & 4095;
                                    class161.field1898[var31][var32 - 1] = 1;
                                    class161.field1899[var31][var32 - 1] = var22;
                                    break;
                                 }

                                 if ((var28[var23 + var20][var21 - 1] & 19136911) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var32 < 128 - var2 && class161.field1898[var31][var32 + 1] == 0 && (var28[var20][var21 + var2] & 19136824) == 0 && (var28[var20 + var2 - 1][var21 + var2] & 19136992) == 0) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2 - 1) {
                                    class161.field1901[var34] = var11;
                                    class161.field1904[var34] = var12 + 1;
                                    var34 = var34 + 1 & 4095;
                                    class161.field1898[var31][var32 + 1] = 4;
                                    class161.field1899[var31][var32 + 1] = var22;
                                    break;
                                 }

                                 if ((var28[var20 + var23][var21 + var2] & 19137016) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var31 > 0 && var32 > 0 && class161.field1898[var31 - 1][var32 - 1] == 0 && (var28[var20 - 1][var21 - 1] & 19136782) == 0) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2) {
                                    class161.field1901[var34] = var11 - 1;
                                    class161.field1904[var34] = var12 - 1;
                                    var34 = var34 + 1 & 4095;
                                    class161.field1898[var31 - 1][var32 - 1] = 3;
                                    class161.field1899[var31 - 1][var32 - 1] = var22;
                                    break;
                                 }

                                 if ((var28[var20 - 1][var23 + (var21 - 1)] & 19136830) != 0 || (var28[var23 + (var20 - 1)][var21 - 1] & 19136911) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var31 < 128 - var2 && var32 > 0 && class161.field1898[var31 + 1][var32 - 1] == 0 && (var28[var20 + var2][var21 - 1] & 19136899) == 0) {
                              var23 = 1;

                              while(true) {
                                 if (var23 >= var2) {
                                    class161.field1901[var34] = var11 + 1;
                                    class161.field1904[var34] = var12 - 1;
                                    var34 = var34 + 1 & 4095;
                                    class161.field1898[var31 + 1][var32 - 1] = 9;
                                    class161.field1899[var31 + 1][var32 - 1] = var22;
                                    break;
                                 }

                                 if ((var28[var20 + var2][var23 + (var21 - 1)] & 19136995) != 0 || (var28[var20 + var23][var21 - 1] & 19136911) != 0) {
                                    break;
                                 }

                                 ++var23;
                              }
                           }

                           if (var31 > 0 && var32 < 128 - var2 && class161.field1898[var31 - 1][var32 + 1] == 0 && (var28[var20 - 1][var21 + var2] & 19136824) == 0) {
                              for(var23 = 1; var23 < var2; ++var23) {
                                 if ((var28[var20 - 1][var23 + var21] & 19136830) != 0 || (var28[var23 + (var20 - 1)][var21 + var2] & 19137016) != 0) {
                                    continue label356;
                                 }
                              }

                              class161.field1901[var34] = var11 - 1;
                              class161.field1904[var34] = var12 + 1;
                              var34 = var34 + 1 & 4095;
                              class161.field1898[var31 - 1][var32 + 1] = 6;
                              class161.field1899[var31 - 1][var32 + 1] = var22;
                           }
                        } while(var31 >= 128 - var2);
                     } while(var32 >= 128 - var2);
                  } while(class161.field1898[var31 + 1][var32 + 1] != 0);
               } while((var28[var20 + var2][var21 + var2] & 19136992) != 0);

               for(var23 = 1; var23 < var2; ++var23) {
                  if ((var28[var23 + var20][var21 + var2] & 19137016) != 0 || (var28[var20 + var2][var21 + var23] & 19136995) != 0) {
                     continue label379;
                  }
               }

               class161.field1901[var34] = var11 + 1;
               class161.field1904[var34] = var12 + 1;
               var34 = var34 + 1 & 4095;
               class161.field1898[var31 + 1][var32 + 1] = 12;
               class161.field1899[var31 + 1][var32 + 1] = var22;
            }
         }

         var29 = var30;
      }

      var10 = var0 - 64;
      var11 = var1 - 64;
      var12 = class26.field219;
      var31 = class161.field1896;
      if (!var29) {
         var32 = Integer.MAX_VALUE;
         var15 = Integer.MAX_VALUE;
         byte var33 = 10;
         var34 = var3.field1893;
         var18 = var3.field1891;
         int var19 = var3.field1892;
         var20 = var3.field1890;

         for(var21 = var34 - var33; var21 <= var33 + var34; ++var21) {
            for(var22 = var18 - var33; var22 <= var18 + var33; ++var22) {
               var23 = var21 - var10;
               int var24 = var22 - var11;
               if (var23 >= 0 && var24 >= 0 && var23 < 128 && var24 < 128 && class161.field1899[var23][var24] < 100) {
                  int var25 = 0;
                  if (var21 < var34) {
                     var25 = var34 - var21;
                  } else if (var21 > var19 + var34 - 1) {
                     var25 = var21 - (var19 + var34 - 1);
                  }

                  int var26 = 0;
                  if (var22 < var18) {
                     var26 = var18 - var22;
                  } else if (var22 > var18 + var20 - 1) {
                     var26 = var22 - (var20 + var18 - 1);
                  }

                  int var27 = var26 * var26 + var25 * var25;
                  if (var27 < var32 || var27 == var32 && class161.field1899[var23][var24] < var15) {
                     var32 = var27;
                     var15 = class161.field1899[var23][var24];
                     var12 = var21;
                     var31 = var22;
                  }
               }
            }
         }

         if (var32 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var12 && var31 == var1) {
         return 0;
      } else {
         var14 = 0;
         class161.field1901[var14] = var12;
         var32 = var14 + 1;
         class161.field1904[var14] = var31;

         for(var15 = var16 = class161.field1898[var12 - var10][var31 - var11]; var0 != var12 || var31 != var1; var15 = class161.field1898[var12 - var10][var31 - var11]) {
            if (var15 != var16) {
               var16 = var15;
               class161.field1901[var32] = var12;
               class161.field1904[var32++] = var31;
            }

            if ((var15 & 2) != 0) {
               ++var12;
            } else if ((var15 & 8) != 0) {
               --var12;
            }

            if ((var15 & 1) != 0) {
               ++var31;
            } else if ((var15 & 4) != 0) {
               --var31;
            }
         }

         var34 = 0;

         while(var32-- > 0) {
            var6[var34] = class161.field1901[var32];
            var7[var34++] = class161.field1904[var32];
            if (var34 >= var6.length) {
               break;
            }
         }

         return var34;
      }
   }

   static final void method2464(boolean var0) {
      for(int var2 = 0; var2 < client.field684; ++var2) {
         class77 var3 = client.field566[client.field449[var2]];
         if (var3 != null && var3.vmethod1891() && var3.field1131.field1640 == var0 && var3.field1131.method2760()) {
            int var4 = var3.field1068 >> 7;
            int var5 = var3.field1058 >> 7;
            if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
               if (var3.field1023 == 1 && (var3.field1068 & 127) == 64 && (var3.field1058 & 127) == 64) {
                  if (client.field501[var4][var5] == client.field504) {
                     continue;
                  }

                  client.field501[var4][var5] = client.field504;
               }

               long var6 = class171.method3480(0, 0, 1, !var3.field1131.field1648, client.field449[var2]);
               var3.field1024 = client.field451;
               class165.field1924.method3912(class284.field3651, var3.field1068, var3.field1058, class122.method2438(var3.field1023 * 64 - 64 + var3.field1068, var3.field1023 * 64 - 64 + var3.field1058, class284.field3651), var3.field1023 * 64 - 64 + 60, var3, var3.field1021, var6, var3.field1022);
            }
         }
      }

   }
}
