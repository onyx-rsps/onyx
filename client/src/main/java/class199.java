public class class199 {
   public static boolean field2306;
   public static int field2313;
   public static int field2314;
   static boolean field2283;
   static boolean field2309;
   static boolean[][] field2282;
   static boolean[][][][] field2337;
   static class203[] field2322;
   static class203[][] field2320;
   static class214[] field2279;
   static class295 field2329;
   static int field2287;
   static int field2288;
   static int field2290;
   static int field2292;
   static int field2296;
   static int field2298;
   static int field2300;
   static int field2301;
   static int field2303;
   static int field2305;
   static int field2307;
   static int field2310;
   static int field2311;
   static int field2312;
   static int field2315;
   static int field2318;
   static int field2321;
   static int field2323;
   static int field2326;
   static int field2330;
   static int field2331;
   static int field2339;
   static int field2340;
   static int field2341;
   static int field2342;
   static int field2343;
   static int field2344;
   static int[] field2319;
   static final int[] field2278;
   static final int[] field2294;
   static final int[] field2324;
   static final int[] field2325;
   static final int[] field2327;
   static final int[] field2328;
   static final int[] field2338;
   class196[][][] field2299;
   class214[] field2286;
   int field2280;
   int field2281;
   int field2285;
   int field2302;
   int field2308;
   int[][] field2335;
   int[][] field2336;
   int[][][] field2295;
   int[][][] field2297;

   static {
      field2306 = true;
      field2292 = 0;
      field2315 = 0;
      field2279 = new class214[100];
      field2309 = false;
      field2310 = 0;
      field2311 = 0;
      field2312 = 0;
      field2313 = -1;
      field2314 = -1;
      field2283 = false;
      field2318 = 4;
      field2319 = new int[field2318];
      field2320 = new class203[field2318][500];
      field2321 = 0;
      field2322 = new class203[500];
      field2329 = new class295();
      field2324 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field2325 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field2328 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field2338 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field2294 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field2327 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field2278 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field2337 = new boolean[8][32][51][51];
   }

   public class199(int var1, int var2, int var3, int[][][] var4) {
      this.field2308 = 0;
      this.field2285 = 0;
      this.field2286 = new class214[5000];
      this.field2335 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
      this.field2336 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
      this.field2302 = var1;
      this.field2280 = var2;
      this.field2281 = var3;
      this.field2299 = new class196[var1][var2][var3];
      this.field2295 = new int[var1][var2 + 1][var3 + 1];
      this.field2297 = var4;
      this.method4062();
   }

   boolean method3949(int var1, int var2, int var3) {
      int var4 = this.field2295[var1][var2][var3];
      if (var4 == -field2330) {
         return false;
      } else if (var4 == field2330) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method3953(var5 + 1, this.field2297[var1][var2][var3], var6 + 1) && this.method3953(var5 + 128 - 1, this.field2297[var1][var2 + 1][var3], var6 + 1) && this.method3953(var5 + 128 - 1, this.field2297[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method3953(var5 + 1, this.field2297[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2295[var1][var2][var3] = field2330;
            return true;
         } else {
            this.field2295[var1][var2][var3] = -field2330;
            return false;
         }
      }
   }

   boolean method4077(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class200 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.field2280 || var16 >= this.field2281) {
               return false;
            }

            class196 var17 = this.field2299[var1][var15][var16];
            if (var17 != null && var17.field2232 >= 5) {
               return false;
            }
         }
      }

      class214 var21 = new class214();
      var21.field2537 = var12;
      var21.field2544 = var14;
      var21.field2540 = var1;
      var21.field2536 = var6;
      var21.field2534 = var7;
      var21.field2532 = var8;
      var21.field2535 = var9;
      var21.field2531 = var10;
      var21.field2543 = var2;
      var21.field2539 = var3;
      var21.field2538 = var2 + var4 - 1;
      var21.field2533 = var3 + var5 - 1;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.field2299[var19][var16][var22] == null) {
                  this.field2299[var19][var16][var22] = new class196(var19, var16, var22);
               }
            }

            class196 var23 = this.field2299[var1][var16][var22];
            var23.field2233[var23.field2232] = var21;
            var23.field2241[var23.field2232] = var18;
            var23.field2235 |= var18;
            ++var23.field2232;
         }
      }

      if (var11) {
         this.field2286[this.field2285++] = var21;
      }

      return true;
   }

   void method3916(class214 var1) {
      for(int var2 = var1.field2543; var2 <= var1.field2538; ++var2) {
         for(int var3 = var1.field2539; var3 <= var1.field2533; ++var3) {
            class196 var4 = this.field2299[var1.field2540][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field2232; ++var5) {
                  if (var4.field2233[var5] == var1) {
                     --var4.field2232;

                     for(int var6 = var5; var6 < var4.field2232; ++var6) {
                        var4.field2233[var6] = var4.field2233[var6 + 1];
                        var4.field2241[var6] = var4.field2241[var6 + 1];
                     }

                     var4.field2233[var4.field2232] = null;
                     break;
                  }
               }

               var4.field2235 = 0;

               for(var5 = 0; var5 < var4.field2232; ++var5) {
                  var4.field2235 |= var4.field2241[var5];
               }
            }
         }
      }

   }

   public void method3938(int var1, int var2, int var3, boolean var4) {
      if (!method3940() || var4) {
         field2309 = true;
         field2283 = var4;
         field2310 = var1;
         field2311 = var2;
         field2312 = var3;
         field2313 = -1;
         field2314 = -1;
      }
   }

   boolean method3953(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field2321; ++var4) {
         class203 var5 = field2322[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.field2365 == 1) {
            var6 = var5.field2364 - var1;
            if (var6 > 0) {
               var7 = (var6 * var5.field2368 >> 8) + var5.field2354;
               var8 = (var6 * var5.field2370 >> 8) + var5.field2361;
               var9 = (var6 * var5.field2359 >> 8) + var5.field2363;
               var10 = (var6 * var5.field2371 >> 8) + var5.field2362;
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2365 == 2) {
            var6 = var1 - var5.field2364;
            if (var6 > 0) {
               var7 = (var6 * var5.field2368 >> 8) + var5.field2354;
               var8 = (var6 * var5.field2370 >> 8) + var5.field2361;
               var9 = (var6 * var5.field2359 >> 8) + var5.field2363;
               var10 = (var6 * var5.field2371 >> 8) + var5.field2362;
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2365 == 3) {
            var6 = var5.field2354 - var3;
            if (var6 > 0) {
               var7 = (var6 * var5.field2366 >> 8) + var5.field2364;
               var8 = (var6 * var5.field2367 >> 8) + var5.field2369;
               var9 = (var6 * var5.field2359 >> 8) + var5.field2363;
               var10 = (var6 * var5.field2371 >> 8) + var5.field2362;
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2365 == 4) {
            var6 = var3 - var5.field2354;
            if (var6 > 0) {
               var7 = (var6 * var5.field2366 >> 8) + var5.field2364;
               var8 = (var6 * var5.field2367 >> 8) + var5.field2369;
               var9 = (var6 * var5.field2359 >> 8) + var5.field2363;
               var10 = (var6 * var5.field2371 >> 8) + var5.field2362;
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2365 == 5) {
            var6 = var2 - var5.field2363;
            if (var6 > 0) {
               var7 = (var6 * var5.field2366 >> 8) + var5.field2364;
               var8 = (var6 * var5.field2367 >> 8) + var5.field2369;
               var9 = (var6 * var5.field2368 >> 8) + var5.field2354;
               var10 = (var6 * var5.field2370 >> 8) + var5.field2361;
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   void method3934(class192 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.field2302) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.field2280) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.field2281 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        class196 var15 = this.field2299[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = (this.field2297[var12][var13 + 1][var14] + this.field2297[var12][var13 + 1][var14 + 1] + this.field2297[var12][var13][var14] + this.field2297[var12][var13][var14 + 1]) / 4 - (this.field2297[var2][var3 + 1][var4] + this.field2297[var2][var3][var4] + this.field2297[var2][var3 + 1][var4 + 1] + this.field2297[var2][var3][var4 + 1]) / 4;
                           class211 var17 = var15.field2228;
                           if (var17 != null) {
                              class192 var18;
                              if (var17.field2513 instanceof class192) {
                                 var18 = (class192)var17.field2513;
                                 class192.method3739(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.field2514 instanceof class192) {
                                 var18 = (class192)var17.field2514;
                                 class192.method3739(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field2232; ++var23) {
                              class214 var19 = var15.field2233[var23];
                              if (var19 != null && var19.field2535 instanceof class192) {
                                 class192 var20 = (class192)var19.field2535;
                                 int var21 = var19.field2538 - var19.field2543 + 1;
                                 int var22 = var19.field2533 - var19.field2539 + 1;
                                 class192.method3739(var1, var20, (var21 - var5) * 64 + (var19.field2543 - var3) * 128, var16, (var19.field2539 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   boolean method3950(int var1, int var2, int var3, int var4) {
      if (!this.method3949(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field2297[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > field2301) {
                  if (!this.method3953(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method3953(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method3953(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method3953(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method3953(var5, var9, var6)) {
                  return false;
               }

               if (!this.method3953(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < field2303) {
                  if (!this.method3953(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method3953(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method3953(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method3953(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method3953(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method3953(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < field2301) {
                  if (!this.method3953(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method3953(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method3953(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method3953(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method3953(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method3953(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > field2303) {
                  if (!this.method3953(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method3953(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method3953(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method3953(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method3953(var5, var9, var6)) {
                  return false;
               }

               if (!this.method3953(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method3953(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method3953(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method3953(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method3953(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.method3953(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   void method3965(class209 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field2301;
      int var11;
      int var12 = var11 = (var8 << 7) - field2303;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field2297[var2][var7][var8] - field2323;
      int var18 = this.field2297[var2][var7 + 1][var8] - field2323;
      int var19 = this.field2297[var2][var7 + 1][var8 + 1] - field2323;
      int var20 = this.field2297[var2][var7][var8 + 1] - field2323;
      int var21 = var10 * var6 + var5 * var12 >> 16;
      var12 = var12 * var6 - var5 * var10 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var3 * var12 >> 16;
      var12 = var3 * var17 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var14 * var6 + var5 * var11 >> 16;
         var11 = var11 * var6 - var5 * var14 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var3 * var11 >> 16;
         var11 = var3 * var18 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var13 * var6 + var5 * var16 >> 16;
            var16 = var16 * var6 - var5 * var13 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var3 * var16 >> 16;
            var16 = var3 * var19 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var9 * var6 + var5 * var15 >> 16;
               var15 = var15 * var6 - var5 * var9 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var3 * var15 >> 16;
               var15 = var3 * var20 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = var10 * class197.field2261 / var12 + class197.field2258;
                  int var23 = var17 * class197.field2261 / var12 + class197.field2259;
                  int var24 = var14 * class197.field2261 / var11 + class197.field2258;
                  int var25 = var18 * class197.field2261 / var11 + class197.field2259;
                  int var26 = var13 * class197.field2261 / var16 + class197.field2258;
                  int var27 = var19 * class197.field2261 / var16 + class197.field2259;
                  int var28 = var9 * class197.field2261 / var15 + class197.field2258;
                  int var29 = var21 * class197.field2261 / var15 + class197.field2259;
                  class197.field2257 = 0;
                  int var30;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class197.field2251 = false;
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > class197.field2260 || var28 > class197.field2260 || var24 > class197.field2260) {
                        class197.field2251 = true;
                     }

                     if (field2309 && method3947(field2311, field2312, var27, var29, var25, var26, var28, var24)) {
                        field2313 = var7;
                        field2314 = var8;
                     }

                     if (var1.field2503 == -1) {
                        if (var1.field2501 != 12345678) {
                           class197.method3832(var27, var29, var25, var26, var28, var24, var1.field2501, var1.field2502, var1.field2500);
                        }
                     } else if (!field2306) {
                        if (var1.field2499) {
                           class197.method3834(var27, var29, var25, var26, var28, var24, var1.field2501, var1.field2502, var1.field2500, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2503);
                        } else {
                           class197.method3834(var27, var29, var25, var26, var28, var24, var1.field2501, var1.field2502, var1.field2500, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field2503);
                        }
                     } else {
                        var30 = class197.field2268.vmethod4253(var1.field2503);
                        class197.method3832(var27, var29, var25, var26, var28, var24, method3946(var30, var1.field2501), method3946(var30, var1.field2502), method3946(var30, var1.field2500));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class197.field2251 = false;
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > class197.field2260 || var24 > class197.field2260 || var28 > class197.field2260) {
                        class197.field2251 = true;
                     }

                     if (field2309 && method3947(field2311, field2312, var23, var25, var29, var22, var24, var28)) {
                        field2313 = var7;
                        field2314 = var8;
                     }

                     if (var1.field2503 == -1) {
                        if (var1.field2505 != 12345678) {
                           class197.method3832(var23, var25, var29, var22, var24, var28, var1.field2505, var1.field2500, var1.field2502);
                        }
                     } else if (!field2306) {
                        class197.method3834(var23, var25, var29, var22, var24, var28, var1.field2505, var1.field2500, var1.field2502, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2503);
                     } else {
                        var30 = class197.field2268.vmethod4253(var1.field2503);
                        class197.method3832(var23, var25, var29, var22, var24, var28, method3946(var30, var1.field2505), method3946(var30, var1.field2500), method3946(var30, var1.field2502));
                     }
                  }

               }
            }
         }
      }
   }

   void method3945(class205 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field2389.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field2389[var9] - field2301;
         var11 = var1.field2382[var9] - field2323;
         var12 = var1.field2401[var9] - field2303;
         var13 = var12 * var4 + var5 * var10 >> 16;
         var12 = var5 * var12 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var3 * var11 - var12 * var2 >> 16;
         var12 = var11 * var2 + var3 * var12 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.field2390 != null) {
            class205.field2398[var9] = var10;
            class205.field2399[var9] = var13;
            class205.field2400[var9] = var12;
         }

         class205.field2396[var9] = var10 * class197.field2261 / var12 + class197.field2258;
         class205.field2384[var9] = var13 * class197.field2261 / var12 + class197.field2259;
      }

      class197.field2257 = 0;
      var8 = var1.field2387.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field2387[var9];
         var11 = var1.field2388[var9];
         var12 = var1.field2395[var9];
         var13 = class205.field2396[var10];
         int var14 = class205.field2396[var11];
         int var15 = class205.field2396[var12];
         int var16 = class205.field2384[var10];
         int var17 = class205.field2384[var11];
         int var18 = class205.field2384[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class197.field2251 = false;
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > class197.field2260 || var14 > class197.field2260 || var15 > class197.field2260) {
               class197.field2251 = true;
            }

            if (field2309 && method3947(field2311, field2312, var16, var17, var18, var13, var14, var15)) {
               field2313 = var6;
               field2314 = var7;
            }

            if (var1.field2390 != null && var1.field2390[var9] != -1) {
               if (!field2306) {
                  if (var1.field2385) {
                     class197.method3834(var16, var17, var18, var13, var14, var15, var1.field2383[var9], var1.field2391[var9], var1.field2386[var9], class205.field2398[0], class205.field2398[1], class205.field2398[3], class205.field2399[0], class205.field2399[1], class205.field2399[3], class205.field2400[0], class205.field2400[1], class205.field2400[3], var1.field2390[var9]);
                  } else {
                     class197.method3834(var16, var17, var18, var13, var14, var15, var1.field2383[var9], var1.field2391[var9], var1.field2386[var9], class205.field2398[var10], class205.field2398[var11], class205.field2398[var12], class205.field2399[var10], class205.field2399[var11], class205.field2399[var12], class205.field2400[var10], class205.field2400[var11], class205.field2400[var12], var1.field2390[var9]);
                  }
               } else {
                  int var19 = class197.field2268.vmethod4253(var1.field2390[var9]);
                  class197.method3832(var16, var17, var18, var13, var14, var15, method3946(var19, var1.field2383[var9]), method3946(var19, var1.field2391[var9]), method3946(var19, var1.field2386[var9]));
               }
            } else if (var1.field2383[var9] != 12345678) {
               class197.method3832(var16, var17, var18, var13, var14, var15, var1.field2383[var9], var1.field2391[var9], var1.field2386[var9]);
            }
         }
      }

   }

   void method3933(class192 var1, int var2, int var3, int var4) {
      class196 var5;
      class192 var6;
      if (var3 < this.field2280) {
         var5 = this.field2299[var2][var3 + 1][var4];
         if (var5 != null && var5.field2234 != null && var5.field2234.field2194 instanceof class192) {
            var6 = (class192)var5.field2234.field2194;
            class192.method3739(var1, var6, 128, 0, 0, true);
         }
      }

      if (var4 < this.field2280) {
         var5 = this.field2299[var2][var3][var4 + 1];
         if (var5 != null && var5.field2234 != null && var5.field2234.field2194 instanceof class192) {
            var6 = (class192)var5.field2234.field2194;
            class192.method3739(var1, var6, 0, 0, 128, true);
         }
      }

      if (var3 < this.field2280 && var4 < this.field2281) {
         var5 = this.field2299[var2][var3 + 1][var4 + 1];
         if (var5 != null && var5.field2234 != null && var5.field2234.field2194 instanceof class192) {
            var6 = (class192)var5.field2234.field2194;
            class192.method3739(var1, var6, 128, 0, 128, true);
         }
      }

      if (var3 < this.field2280 && var4 > 0) {
         var5 = this.field2299[var2][var3 + 1][var4 - 1];
         if (var5 != null && var5.field2234 != null && var5.field2234.field2194 instanceof class192) {
            var6 = (class192)var5.field2234.field2194;
            class192.method3739(var1, var6, 128, 0, -128, true);
         }
      }

   }

   boolean method3951(int var1, int var2, int var3, int var4) {
      if (!this.method3949(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method3953(var5 + 1, this.field2297[var1][var2][var3] - var4, var6 + 1) && this.method3953(var5 + 128 - 1, this.field2297[var1][var2 + 1][var3] - var4, var6 + 1) && this.method3953(var5 + 128 - 1, this.field2297[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method3953(var5 + 1, this.field2297[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean method4023(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var3 == var2 && var5 == var4) {
         if (!this.method3949(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method3953(var7 + 1, this.field2297[var1][var2][var4] - var6, var8 + 1) && this.method3953(var7 + 128 - 1, this.field2297[var1][var2 + 1][var4] - var6, var8 + 1) && this.method3953(var7 + 128 - 1, this.field2297[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method3953(var7 + 1, this.field2297[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.field2295[var1][var7][var8] == -field2330) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field2297[var1][var2][var4] - var6;
         if (!this.method3953(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method3953(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.method3953(var7, var9, var11)) {
                  return false;
               } else if (!this.method3953(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   void method3948() {
      int var1 = field2319[field2315];
      class203[] var2 = field2320[field2315];
      field2321 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class203 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.field2358 == 1) {
            var5 = var4.field2360 - field2307 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field2356 - field2300 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2357 - field2300 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field2282[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field2301 - var4.field2364;
                  if (var9 > 32) {
                     var4.field2365 = 1;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field2365 = 2;
                     var9 = -var9;
                  }

                  var4.field2368 = (var4.field2354 - field2303 << 8) / var9;
                  var4.field2370 = (var4.field2361 - field2303 << 8) / var9;
                  var4.field2359 = (var4.field2363 - field2323 << 8) / var9;
                  var4.field2371 = (var4.field2362 - field2323 << 8) / var9;
                  field2322[field2321++] = var4;
               }
            }
         } else if (var4.field2358 == 2) {
            var5 = var4.field2356 - field2300 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field2360 - field2307 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2355 - field2307 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field2282[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field2303 - var4.field2354;
                  if (var9 > 32) {
                     var4.field2365 = 3;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field2365 = 4;
                     var9 = -var9;
                  }

                  var4.field2366 = (var4.field2364 - field2301 << 8) / var9;
                  var4.field2367 = (var4.field2369 - field2301 << 8) / var9;
                  var4.field2359 = (var4.field2363 - field2323 << 8) / var9;
                  var4.field2371 = (var4.field2362 - field2323 << 8) / var9;
                  field2322[field2321++] = var4;
               }
            }
         } else if (var4.field2358 == 4) {
            var5 = var4.field2363 - field2323;
            if (var5 > 128) {
               var6 = var4.field2356 - field2300 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2357 - field2300 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var8 = var4.field2360 - field2307 + 25;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field2355 - field2307 + 25;
                  if (var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label144:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (field2282[var11][var12]) {
                           var10 = true;
                           break label144;
                        }
                     }
                  }

                  if (var10) {
                     var4.field2365 = 5;
                     var4.field2366 = (var4.field2364 - field2301 << 8) / var5;
                     var4.field2367 = (var4.field2369 - field2301 << 8) / var5;
                     var4.field2368 = (var4.field2354 - field2303 << 8) / var5;
                     var4.field2370 = (var4.field2361 - field2303 << 8) / var5;
                     field2322[field2321++] = var4;
                  }
               }
            }
         }
      }

   }

   void method3902(class196 var1, boolean var2) {
      field2329.method5187(var1);

      while(true) {
         class196 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         class196[][] var8;
         class196 var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var25;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              class211 var10;
                              class214 var12;
                              int var17;
                              int var18;
                              boolean var20;
                              int var21;
                              class196 var36;
                              while(true) {
                                 do {
                                    var3 = (class196)field2329.method5214();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field2238);

                                 var4 = var3.field2223;
                                 var5 = var3.field2224;
                                 var6 = var3.field2236;
                                 var7 = var3.field2225;
                                 var8 = this.field2299[var6];
                                 if (!var3.field2237) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.field2299[var6 - 1][var4][var5];
                                       if (var9 != null && var9.field2238) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= field2307 && var4 > field2331) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.field2238 && (var9.field2237 || (var3.field2235 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= field2307 && var4 < field2296 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.field2238 && (var9.field2237 || (var3.field2235 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= field2300 && var5 > field2287) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.field2238 && (var9.field2237 || (var3.field2235 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= field2300 && var5 < field2298 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.field2238 && (var9.field2237 || (var3.field2235 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field2237 = false;
                                 if (var3.field2240 != null) {
                                    var9 = var3.field2240;
                                    if (var9.field2231 != null) {
                                       if (!this.method3949(0, var4, var5)) {
                                          this.method3965(var9.field2231, 0, field2326, field2305, field2290, field2288, var4, var5);
                                       }
                                    } else if (var9.field2244 != null && !this.method3949(0, var4, var5)) {
                                       this.method3945(var9.field2244, field2326, field2305, field2290, field2288, var4, var5);
                                    }

                                    var10 = var9.field2228;
                                    if (var10 != null) {
                                       var10.field2513.vmethod4151(0, field2326, field2305, field2290, field2288, var10.field2509 - field2301, var10.field2516 - field2323, var10.field2510 - field2303, var10.field2515);
                                    }

                                    for(var11 = 0; var11 < var9.field2232; ++var11) {
                                       var12 = var9.field2233[var11];
                                       if (var12 != null) {
                                          var12.field2535.vmethod4151(var12.field2531, field2326, field2305, field2290, field2288, var12.field2536 - field2301, var12.field2532 - field2323, var12.field2534 - field2303, var12.field2537);
                                       }
                                    }
                                 }

                                 var20 = false;
                                 if (var3.field2231 != null) {
                                    if (!this.method3949(var7, var4, var5)) {
                                       var20 = true;
                                       if (var3.field2231.field2501 != 12345678 || field2309 && var6 <= field2310) {
                                          this.method3965(var3.field2231, var7, field2326, field2305, field2290, field2288, var4, var5);
                                       }
                                    }
                                 } else if (var3.field2244 != null && !this.method3949(var7, var4, var5)) {
                                    var20 = true;
                                    this.method3945(var3.field2244, field2326, field2305, field2290, field2288, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 class211 var31 = var3.field2228;
                                 class213 var13 = var3.field2229;
                                 if (var31 != null || var13 != null) {
                                    if (var4 == field2307) {
                                       ++var21;
                                    } else if (field2307 < var4) {
                                       var21 += 2;
                                    }

                                    if (var5 == field2300) {
                                       var21 += 3;
                                    } else if (field2300 > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field2324[var21];
                                    var3.field2243 = field2328[var21];
                                 }

                                 if (var31 != null) {
                                    if ((var31.field2518 & field2325[var21]) != 0) {
                                       if (var31.field2518 == 16) {
                                          var3.field2230 = 3;
                                          var3.field2222 = field2338[var21];
                                          var3.field2227 = (3 - var3.field2222) * 954437177;
                                       } else if (var31.field2518 == 32) {
                                          var3.field2230 = 6;
                                          var3.field2222 = field2294[var21];
                                          var3.field2227 = (6 - var3.field2222) * 954437177;
                                       } else if (var31.field2518 == 64) {
                                          var3.field2230 = 12;
                                          var3.field2222 = field2327[var21];
                                          var3.field2227 = (12 - var3.field2222) * 954437177;
                                       } else {
                                          var3.field2230 = 9;
                                          var3.field2222 = field2278[var21];
                                          var3.field2227 = (9 - var3.field2222) * 954437177;
                                       }
                                    } else {
                                       var3.field2230 = 0;
                                    }

                                    if ((var31.field2518 & var11) != 0 && !this.method3950(var7, var4, var5, var31.field2518)) {
                                       var31.field2513.vmethod4151(0, field2326, field2305, field2290, field2288, var31.field2509 - field2301, var31.field2516 - field2323, var31.field2510 - field2303, var31.field2515);
                                    }

                                    if ((var31.field2512 & var11) != 0 && !this.method3950(var7, var4, var5, var31.field2512)) {
                                       var31.field2514.vmethod4151(0, field2326, field2305, field2290, field2288, var31.field2509 - field2301, var31.field2516 - field2323, var31.field2510 - field2303, var31.field2515);
                                    }
                                 }

                                 if (var13 != null && !this.method3951(var7, var4, var5, var13.field2527.field2345)) {
                                    if ((var13.field2529 & var11) != 0) {
                                       var13.field2527.vmethod4151(0, field2326, field2305, field2290, field2288, var13.field2520 - field2301 + var13.field2525, var13.field2524 - field2323, var13.field2521 - field2303 + var13.field2523, var13.field2522);
                                    } else if (var13.field2529 == 256) {
                                       var14 = var13.field2520 - field2301;
                                       var15 = var13.field2524 - field2323;
                                       var16 = var13.field2521 - field2303;
                                       var17 = var13.field2526;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var13.field2527.vmethod4151(0, field2326, field2305, field2290, field2288, var14 + var13.field2525, var15, var16 + var13.field2523, var13.field2522);
                                       } else if (var13.field2528 != null) {
                                          var13.field2528.vmethod4151(0, field2326, field2305, field2290, field2288, var14, var15, var16, var13.field2522);
                                       }
                                    }
                                 }

                                 if (var20) {
                                    class193 var22 = var3.field2234;
                                    if (var22 != null) {
                                       var22.field2194.vmethod4151(0, field2326, field2305, field2290, field2288, var22.field2190 - field2301, var22.field2189 - field2323, var22.field2191 - field2303, var22.field2193);
                                    }

                                    class191 var23 = var3.field2226;
                                    if (var23 != null && var23.field2140 == 0) {
                                       if (var23.field2141 != null) {
                                          var23.field2141.vmethod4151(0, field2326, field2305, field2290, field2288, var23.field2137 - field2301, var23.field2143 - field2323, var23.field2144 - field2303, var23.field2142);
                                       }

                                       if (var23.field2136 != null) {
                                          var23.field2136.vmethod4151(0, field2326, field2305, field2290, field2288, var23.field2137 - field2301, var23.field2143 - field2323, var23.field2144 - field2303, var23.field2142);
                                       }

                                       if (var23.field2139 != null) {
                                          var23.field2139.vmethod4151(0, field2326, field2305, field2290, field2288, var23.field2137 - field2301, var23.field2143 - field2323, var23.field2144 - field2303, var23.field2142);
                                       }
                                    }
                                 }

                                 var14 = var3.field2235;
                                 if (var14 != 0) {
                                    if (var4 < field2307 && (var14 & 4) != 0) {
                                       var36 = var8[var4 + 1][var5];
                                       if (var36 != null && var36.field2238) {
                                          field2329.method5187(var36);
                                       }
                                    }

                                    if (var5 < field2300 && (var14 & 2) != 0) {
                                       var36 = var8[var4][var5 + 1];
                                       if (var36 != null && var36.field2238) {
                                          field2329.method5187(var36);
                                       }
                                    }

                                    if (var4 > field2307 && (var14 & 1) != 0) {
                                       var36 = var8[var4 - 1][var5];
                                       if (var36 != null && var36.field2238) {
                                          field2329.method5187(var36);
                                       }
                                    }

                                    if (var5 > field2300 && (var14 & 8) != 0) {
                                       var36 = var8[var4][var5 - 1];
                                       if (var36 != null && var36.field2238) {
                                          field2329.method5187(var36);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.field2230 != 0) {
                                 var20 = true;

                                 for(var21 = 0; var21 < var3.field2232; ++var21) {
                                    if (var3.field2233[var21].field2542 != field2330 && (var3.field2241[var21] & var3.field2230) == var3.field2222) {
                                       var20 = false;
                                       break;
                                    }
                                 }

                                 if (var20) {
                                    var10 = var3.field2228;
                                    if (!this.method3950(var7, var4, var5, var10.field2518)) {
                                       var10.field2513.vmethod4151(0, field2326, field2305, field2290, field2288, var10.field2509 - field2301, var10.field2516 - field2323, var10.field2510 - field2303, var10.field2515);
                                    }

                                    var3.field2230 = 0;
                                 }
                              }

                              if (!var3.field2239) {
                                 break;
                              }

                              try {
                                 int var34 = var3.field2232;
                                 var3.field2239 = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var34; ++var11) {
                                    var12 = var3.field2233[var11];
                                    if (var12.field2542 != field2330) {
                                       for(var24 = var12.field2543; var24 <= var12.field2538; ++var24) {
                                          for(var14 = var12.field2539; var14 <= var12.field2533; ++var14) {
                                             var36 = var8[var24][var14];
                                             if (var36.field2237) {
                                                var3.field2239 = true;
                                                continue label563;
                                             }

                                             if (var36.field2230 != 0) {
                                                var16 = 0;
                                                if (var24 > var12.field2543) {
                                                   ++var16;
                                                }

                                                if (var24 < var12.field2538) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.field2539) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.field2533) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var36.field2230) == var3.field2227 * 9) {
                                                   var3.field2239 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field2279[var21++] = var12;
                                       var24 = field2307 - var12.field2543;
                                       var14 = var12.field2538 - field2307;
                                       if (var14 > var24) {
                                          var24 = var14;
                                       }

                                       var15 = field2300 - var12.field2539;
                                       var16 = var12.field2533 - field2300;
                                       if (var16 > var15) {
                                          var12.field2541 = var24 + var16;
                                       } else {
                                          var12.field2541 = var24 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var25 = -1;

                                    for(var24 = 0; var24 < var21; ++var24) {
                                       class214 var35 = field2279[var24];
                                       if (var35.field2542 != field2330) {
                                          if (var35.field2541 > var11) {
                                             var11 = var35.field2541;
                                             var25 = var24;
                                          } else if (var11 == var35.field2541) {
                                             var15 = var35.field2536 - field2301;
                                             var16 = var35.field2534 - field2303;
                                             var17 = field2279[var25].field2536 - field2301;
                                             var18 = field2279[var25].field2534 - field2303;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var25 = var24;
                                             }
                                          }
                                       }
                                    }

                                    if (var25 == -1) {
                                       break;
                                    }

                                    class214 var33 = field2279[var25];
                                    var33.field2542 = field2330;
                                    if (!this.method4023(var7, var33.field2543, var33.field2538, var33.field2539, var33.field2533, var33.field2535.field2345)) {
                                       var33.field2535.vmethod4151(var33.field2531, field2326, field2305, field2290, field2288, var33.field2536 - field2301, var33.field2532 - field2323, var33.field2534 - field2303, var33.field2537);
                                    }

                                    for(var14 = var33.field2543; var14 <= var33.field2538; ++var14) {
                                       for(var15 = var33.field2539; var15 <= var33.field2533; ++var15) {
                                          class196 var26 = var8[var14][var15];
                                          if (var26.field2230 != 0) {
                                             field2329.method5187(var26);
                                          } else if ((var14 != var4 || var15 != var5) && var26.field2238) {
                                             field2329.method5187(var26);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.field2239) {
                                    break;
                                 }
                              } catch (Exception var28) {
                                 var3.field2239 = false;
                                 break;
                              }
                           }
                        } while(!var3.field2238);
                     } while(var3.field2230 != 0);

                     if (var4 > field2307 || var4 <= field2331) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field2238);

                  if (var4 < field2307 || var4 >= field2296 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field2238);

               if (var5 > field2300 || var5 <= field2287) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field2238);

            if (var5 < field2300 || var5 >= field2298 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field2238);

         var3.field2238 = false;
         --field2292;
         class191 var32 = var3.field2226;
         if (var32 != null && var32.field2140 != 0) {
            if (var32.field2141 != null) {
               var32.field2141.vmethod4151(0, field2326, field2305, field2290, field2288, var32.field2137 - field2301, var32.field2143 - field2323 - var32.field2140, var32.field2144 - field2303, var32.field2142);
            }

            if (var32.field2136 != null) {
               var32.field2136.vmethod4151(0, field2326, field2305, field2290, field2288, var32.field2137 - field2301, var32.field2143 - field2323 - var32.field2140, var32.field2144 - field2303, var32.field2142);
            }

            if (var32.field2139 != null) {
               var32.field2139.vmethod4151(0, field2326, field2305, field2290, field2288, var32.field2137 - field2301, var32.field2143 - field2323 - var32.field2140, var32.field2144 - field2303, var32.field2142);
            }
         }

         if (var3.field2243 != 0) {
            class213 var29 = var3.field2229;
            if (var29 != null && !this.method3951(var7, var4, var5, var29.field2527.field2345)) {
               if ((var29.field2529 & var3.field2243) != 0) {
                  var29.field2527.vmethod4151(0, field2326, field2305, field2290, field2288, var29.field2520 - field2301 + var29.field2525, var29.field2524 - field2323, var29.field2521 - field2303 + var29.field2523, var29.field2522);
               } else if (var29.field2529 == 256) {
                  var11 = var29.field2520 - field2301;
                  var25 = var29.field2524 - field2323;
                  var24 = var29.field2521 - field2303;
                  var14 = var29.field2526;
                  if (var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if (var14 != 2 && var14 != 3) {
                     var16 = var24;
                  } else {
                     var16 = -var24;
                  }

                  if (var16 >= var15) {
                     var29.field2527.vmethod4151(0, field2326, field2305, field2290, field2288, var11 + var29.field2525, var25, var24 + var29.field2523, var29.field2522);
                  } else if (var29.field2528 != null) {
                     var29.field2528.vmethod4151(0, field2326, field2305, field2290, field2288, var11, var25, var24, var29.field2522);
                  }
               }
            }

            class211 var27 = var3.field2228;
            if (var27 != null) {
               if ((var27.field2512 & var3.field2243) != 0 && !this.method3950(var7, var4, var5, var27.field2512)) {
                  var27.field2514.vmethod4151(0, field2326, field2305, field2290, field2288, var27.field2509 - field2301, var27.field2516 - field2323, var27.field2510 - field2303, var27.field2515);
               }

               if ((var27.field2518 & var3.field2243) != 0 && !this.method3950(var7, var4, var5, var27.field2518)) {
                  var27.field2513.vmethod4151(0, field2326, field2305, field2290, field2288, var27.field2509 - field2301, var27.field2516 - field2323, var27.field2510 - field2303, var27.field2515);
               }
            }
         }

         class196 var30;
         if (var6 < this.field2302 - 1) {
            var30 = this.field2299[var6 + 1][var4][var5];
            if (var30 != null && var30.field2238) {
               field2329.method5187(var30);
            }
         }

         if (var4 < field2307) {
            var30 = var8[var4 + 1][var5];
            if (var30 != null && var30.field2238) {
               field2329.method5187(var30);
            }
         }

         if (var5 < field2300) {
            var30 = var8[var4][var5 + 1];
            if (var30 != null && var30.field2238) {
               field2329.method5187(var30);
            }
         }

         if (var4 > field2307) {
            var30 = var8[var4 - 1][var5];
            if (var30 != null && var30.field2238) {
               field2329.method5187(var30);
            }
         }

         if (var5 > field2300) {
            var30 = var8[var4][var5 - 1];
            if (var30 != null && var30.field2238) {
               field2329.method5187(var30);
            }
         }
      }
   }

   public void method3922(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      if (var4 != null) {
         var4.field2226 = null;
      }
   }

   public void method3935(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class196 var7 = this.field2299[var4][var5][var6];
      if (var7 != null) {
         class209 var8 = var7.field2231;
         int var10;
         if (var8 != null) {
            int var9 = var8.field2504;
            if (var9 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var9;
                  var1[var2 + 1] = var9;
                  var1[var2 + 2] = var9;
                  var1[var2 + 3] = var9;
                  var2 += var3;
               }

            }
         } else {
            class205 var18 = var7.field2244;
            if (var18 != null) {
               var10 = var18.field2392;
               int var11 = var18.field2393;
               int var12 = var18.field2394;
               int var13 = var18.field2381;
               int[] var14 = this.field2335[var10];
               int[] var15 = this.field2336[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public void method3908(int var1, int var2, int var3, int var4, class200 var5, long var6, class200 var8, class200 var9) {
      class191 var10 = new class191();
      var10.field2139 = var5;
      var10.field2137 = var2 * 128 + 64;
      var10.field2144 = var3 * 128 + 64;
      var10.field2143 = var4;
      var10.field2142 = var6;
      var10.field2141 = var8;
      var10.field2136 = var9;
      int var11 = 0;
      class196 var12 = this.field2299[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.field2232; ++var13) {
            if ((var12.field2233[var13].field2544 & 256) == 256 && var12.field2233[var13].field2535 instanceof class206) {
               class206 var14 = (class206)var12.field2233[var13].field2535;
               var14.method4137();
               if (var14.field2345 > var11) {
                  var11 = var14.field2345;
               }
            }
         }
      }

      var10.field2140 = var11;
      if (this.field2299[var1][var2][var3] == null) {
         this.field2299[var1][var2][var3] = new class196(var1, var2, var3);
      }

      this.field2299[var1][var2][var3].field2226 = var10;
   }

   public void method4062() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field2302; ++var1) {
         for(var2 = 0; var2 < this.field2280; ++var2) {
            for(int var3 = 0; var3 < this.field2281; ++var3) {
               this.field2299[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field2318; ++var1) {
         for(var2 = 0; var2 < field2319[var1]; ++var2) {
            field2320[var1][var2] = null;
         }

         field2319[var1] = 0;
      }

      for(var1 = 0; var1 < this.field2285; ++var1) {
         this.field2286[var1] = null;
      }

      this.field2285 = 0;

      for(var1 = 0; var1 < field2279.length; ++var1) {
         field2279[var1] = null;
      }

   }

   public long method3927(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      return var4 != null && var4.field2228 != null ? var4.field2228.field2515 : 0L;
   }

   public long method3928(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      return var4 != null && var4.field2229 != null ? var4.field2229.field2522 : 0L;
   }

   public long method4032(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      return var4 != null && var4.field2234 != null ? var4.field2234.field2193 : 0L;
   }

   public long method3929(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field2232; ++var5) {
            class214 var6 = var4.field2233[var5];
            if (class202.method4101(var6.field2537) && var2 == var6.field2543 && var3 == var6.field2539) {
               return var6.field2537;
            }
         }

         return 0L;
      }
   }

   public int method3931(int var1, int var2, int var3, long var4) {
      class196 var6 = this.field2299[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.field2228 != null && var6.field2228.field2515 == var4) {
         return var6.field2228.field2508 & 255;
      } else if (var6.field2229 != null && var6.field2229.field2522 == var4) {
         return var6.field2229.field2530 & 255;
      } else if (var6.field2234 != null && var6.field2234.field2193 == var4) {
         return var6.field2234.field2192 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field2232; ++var7) {
            if (var6.field2233[var7].field2537 == var4) {
               return var6.field2233[var7].field2544 & 255;
            }
         }

         return -1;
      }
   }

   public boolean method3912(int var1, int var2, int var3, int var4, int var5, class200 var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var5 + var2;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method4077(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public void method3918(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      if (var4 != null) {
         var4.field2228 = null;
      }
   }

   public class211 method3987(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      return var4 == null ? null : var4.field2228;
   }

   public class213 method3924(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      return var4 == null ? null : var4.field2229;
   }

   public class214 method3970(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field2232; ++var5) {
            class214 var6 = var4.field2233[var5];
            if (class202.method4101(var6.field2537) && var2 == var6.field2543 && var3 == var6.field2539) {
               return var6;
            }
         }

         return null;
      }
   }

   public class193 method3926(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      return var4 != null && var4.field2234 != null ? var4.field2234 : null;
   }

   public boolean method3907(int var1, int var2, int var3, int var4, int var5, class200 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.method4077(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   public void method3919(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      if (var4 != null) {
         var4.field2229 = null;
      }
   }

   public void method3955(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.field2232; ++var5) {
            class214 var6 = var4.field2233[var5];
            if (class202.method4101(var6.field2537) && var2 == var6.field2543 && var3 == var6.field2539) {
               this.method3916(var6);
               return;
            }
         }

      }
   }

   public void method3921(int var1, int var2, int var3) {
      class196 var4 = this.field2299[var1][var2][var3];
      if (var4 != null) {
         var4.field2234 = null;
      }
   }

   public void method4029(int var1, int var2, int var3, int var4, class200 var5, long var6, int var8) {
      if (var5 != null) {
         class193 var9 = new class193();
         var9.field2194 = var5;
         var9.field2190 = var2 * 128 + 64;
         var9.field2191 = var3 * 128 + 64;
         var9.field2189 = var4;
         var9.field2193 = var6;
         var9.field2192 = var8;
         if (this.field2299[var1][var2][var3] == null) {
            this.field2299[var1][var2][var3] = new class196(var1, var2, var3);
         }

         this.field2299[var1][var2][var3].field2234 = var9;
      }
   }

   public boolean method3911(int var1, int var2, int var3, int var4, int var5, int var6, class200 var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var5 * 64 + var2 * 128;
         int var13 = var6 * 64 + var3 * 128;
         return this.method4077(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public void method3909(int var1, int var2, int var3, int var4, class200 var5, class200 var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         class211 var12 = new class211();
         var12.field2515 = var9;
         var12.field2508 = var11;
         var12.field2509 = var2 * 128 + 64;
         var12.field2510 = var3 * 128 + 64;
         var12.field2516 = var4;
         var12.field2513 = var5;
         var12.field2514 = var6;
         var12.field2518 = var7;
         var12.field2512 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.field2299[var13][var2][var3] == null) {
               this.field2299[var13][var2][var3] = new class196(var13, var2, var3);
            }
         }

         this.field2299[var1][var2][var3].field2228 = var12;
      }
   }

   public void method3910(int var1, int var2, int var3, int var4, class200 var5, class200 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         class213 var14 = new class213();
         var14.field2522 = var11;
         var14.field2530 = var13;
         var14.field2520 = var2 * 128 + 64;
         var14.field2521 = var3 * 128 + 64;
         var14.field2524 = var4;
         var14.field2527 = var5;
         var14.field2528 = var6;
         var14.field2529 = var7;
         var14.field2526 = var8;
         var14.field2525 = var9;
         var14.field2523 = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.field2299[var15][var2][var3] == null) {
               this.field2299[var15][var2][var3] = new class196(var15, var2, var3);
            }
         }

         this.field2299[var1][var2][var3].field2229 = var14;
      }
   }

   public void method4019(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.field2280 * 128) {
         var1 = this.field2280 * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.field2281 * 128) {
         var3 = this.field2281 * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++field2330;
      field2326 = class197.field2265[var4];
      field2305 = class197.field2272[var4];
      field2290 = class197.field2265[var5];
      field2288 = class197.field2272[var5];
      field2282 = field2337[(var4 - 128) / 32][var5 / 64];
      field2301 = var1;
      field2323 = var2;
      field2303 = var3;
      field2307 = var1 / 128;
      field2300 = var3 / 128;
      field2315 = var6;
      field2331 = field2307 - 25;
      if (field2331 < 0) {
         field2331 = 0;
      }

      field2287 = field2300 - 25;
      if (field2287 < 0) {
         field2287 = 0;
      }

      field2296 = field2307 + 25;
      if (field2296 > this.field2280) {
         field2296 = this.field2280;
      }

      field2298 = field2300 + 25;
      if (field2298 > this.field2281) {
         field2298 = this.field2281;
      }

      this.method3948();
      field2292 = 0;

      int var7;
      class196[][] var8;
      int var9;
      int var10;
      for(var7 = this.field2308; var7 < this.field2302; ++var7) {
         var8 = this.field2299[var7];

         for(var9 = field2331; var9 < field2296; ++var9) {
            for(var10 = field2287; var10 < field2298; ++var10) {
               class196 var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.field2242 > var6 || !field2282[var9 - field2307 + 25][var10 - field2300 + 25] && this.field2297[var7][var9][var10] - var2 < 2000) {
                     var11.field2237 = false;
                     var11.field2238 = false;
                     var11.field2230 = 0;
                  } else {
                     var11.field2237 = true;
                     var11.field2238 = true;
                     if (var11.field2232 > 0) {
                        var11.field2239 = true;
                     } else {
                        var11.field2239 = false;
                     }

                     ++field2292;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class196 var15;
      int var16;
      for(var7 = this.field2308; var7 < this.field2302; ++var7) {
         var8 = this.field2299[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = var9 + field2307;
            var16 = field2307 - var9;
            if (var10 >= field2331 || var16 < field2296) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = var12 + field2300;
                  var14 = field2300 - var12;
                  if (var10 >= field2331) {
                     if (var13 >= field2287) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field2237) {
                           this.method3902(var15, true);
                        }
                     }

                     if (var14 < field2298) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field2237) {
                           this.method3902(var15, true);
                        }
                     }
                  }

                  if (var16 < field2296) {
                     if (var13 >= field2287) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field2237) {
                           this.method3902(var15, true);
                        }
                     }

                     if (var14 < field2298) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field2237) {
                           this.method3902(var15, true);
                        }
                     }
                  }

                  if (field2292 == 0) {
                     field2309 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field2308; var7 < this.field2302; ++var7) {
         var8 = this.field2299[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = var9 + field2307;
            var16 = field2307 - var9;
            if (var10 >= field2331 || var16 < field2296) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = var12 + field2300;
                  var14 = field2300 - var12;
                  if (var10 >= field2331) {
                     if (var13 >= field2287) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field2237) {
                           this.method3902(var15, false);
                        }
                     }

                     if (var14 < field2298) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field2237) {
                           this.method3902(var15, false);
                        }
                     }
                  }

                  if (var16 < field2296) {
                     if (var13 >= field2287) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field2237) {
                           this.method3902(var15, false);
                        }
                     }

                     if (var14 < field2298) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field2237) {
                           this.method3902(var15, false);
                        }
                     }
                  }

                  if (field2292 == 0) {
                     field2309 = false;
                     return;
                  }
               }
            }
         }
      }

      field2309 = false;
   }

   public void method3991() {
      for(int var1 = 0; var1 < this.field2285; ++var1) {
         class214 var2 = this.field2286[var1];
         this.method3916(var2);
         this.field2286[var1] = null;
      }

      this.field2285 = 0;
   }

   public void method3932(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2302; ++var4) {
         for(int var5 = 0; var5 < this.field2280; ++var5) {
            for(int var6 = 0; var6 < this.field2281; ++var6) {
               class196 var7 = this.field2299[var4][var5][var6];
               if (var7 != null) {
                  class211 var8 = var7.field2228;
                  class192 var10;
                  if (var8 != null && var8.field2513 instanceof class192) {
                     class192 var9 = (class192)var8.field2513;
                     this.method3934(var9, var4, var5, var6, 1, 1);
                     if (var8.field2514 instanceof class192) {
                        var10 = (class192)var8.field2514;
                        this.method3934(var10, var4, var5, var6, 1, 1);
                        class192.method3739(var9, var10, 0, 0, 0, false);
                        var8.field2514 = var10.method3740(var10.field2174, var10.field2177, var1, var2, var3);
                     }

                     var8.field2513 = var9.method3740(var9.field2174, var9.field2177, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field2232; ++var12) {
                     class214 var14 = var7.field2233[var12];
                     if (var14 != null && var14.field2535 instanceof class192) {
                        class192 var11 = (class192)var14.field2535;
                        this.method3934(var11, var4, var5, var6, var14.field2538 - var14.field2543 + 1, var14.field2533 - var14.field2539 + 1);
                        var14.field2535 = var11.method3740(var11.field2174, var11.field2177, var1, var2, var3);
                     }
                  }

                  class193 var13 = var7.field2234;
                  if (var13 != null && var13.field2194 instanceof class192) {
                     var10 = (class192)var13.field2194;
                     this.method3933(var10, var4, var5, var6);
                     var13.field2194 = var10.method3740(var10.field2174, var10.field2177, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   public void method4082() {
      field2283 = true;
   }

   public void method4016(int var1, int var2) {
      class196 var3 = this.field2299[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class196 var5 = this.field2299[var4][var1][var2] = this.field2299[var4 + 1][var1][var2];
         if (var5 != null) {
            --var5.field2236;

            for(int var6 = 0; var6 < var5.field2232; ++var6) {
               class214 var7 = var5.field2233[var6];
               if (class202.method4101(var7.field2537) && var7.field2543 == var1 && var2 == var7.field2539) {
                  --var7.field2540;
               }
            }
         }
      }

      if (this.field2299[0][var1][var2] == null) {
         this.field2299[0][var1][var2] = new class196(0, var1, var2);
      }

      this.field2299[0][var1][var2].field2240 = var3;
      this.field2299[3][var1][var2] = null;
   }

   public void method3906(int var1, int var2, int var3, int var4) {
      class196 var5 = this.field2299[var1][var2][var3];
      if (var5 != null) {
         this.field2299[var1][var2][var3].field2242 = var4;
      }
   }

   public void method3960(int var1) {
      this.field2308 = var1;

      for(int var2 = 0; var2 < this.field2280; ++var2) {
         for(int var3 = 0; var3 < this.field2281; ++var3) {
            if (this.field2299[var1][var2][var3] == null) {
               this.field2299[var1][var2][var3] = new class196(var1, var2, var3);
            }
         }
      }

   }

   public void method3917(int var1, int var2, int var3, int var4) {
      class196 var5 = this.field2299[var1][var2][var3];
      if (var5 != null) {
         class213 var6 = var5.field2229;
         if (var6 != null) {
            var6.field2525 = var4 * var6.field2525 / 16;
            var6.field2523 = var4 * var6.field2523 / 16;
         }
      }
   }

   public void method4081(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class209 var21;
      int var22;
      if (var4 == 0) {
         var21 = new class209(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2299[var22][var2][var3] == null) {
               this.field2299[var22][var2][var3] = new class196(var22, var2, var3);
            }
         }

         this.field2299[var1][var2][var3].field2231 = var21;
      } else if (var4 != 1) {
         class205 var23 = new class205(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2299[var22][var2][var3] == null) {
               this.field2299[var22][var2][var3] = new class196(var22, var2, var3);
            }
         }

         this.field2299[var1][var2][var3].field2244 = var23;
      } else {
         var21 = new class209(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2299[var22][var2][var3] == null) {
               this.field2299[var22][var2][var3] = new class196(var22, var2, var3);
            }
         }

         this.field2299[var1][var2][var3].field2231 = var21;
      }
   }

   public static boolean method3940() {
      return field2283 && field2313 != -1;
   }

   static boolean method3947(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
         int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }

   static final int method3946(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   public static void method3936(int[] var0, int var1, int var2, int var3, int var4) {
      field2341 = 0;
      field2342 = 0;
      field2343 = var3;
      field2344 = var4;
      field2339 = var3 / 2;
      field2340 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field2326 = class197.field2265[var6];
            field2305 = class197.field2272[var6];
            field2290 = class197.field2265[var7];
            field2288 = class197.field2272[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (method4068(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label76:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }
                     }
                  }

                  field2337[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   public static void method3941() {
      field2313 = -1;
      field2283 = false;
   }

   public static void method3905(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class203 var8 = new class203();
      var8.field2360 = var2 / 128;
      var8.field2355 = var3 / 128;
      var8.field2356 = var4 / 128;
      var8.field2357 = var5 / 128;
      var8.field2358 = var1;
      var8.field2364 = var2;
      var8.field2369 = var3;
      var8.field2354 = var4;
      var8.field2361 = var5;
      var8.field2363 = var6;
      var8.field2362 = var7;
      field2320[var0][field2319[var0]++] = var8;
   }

   static boolean method4068(int var0, int var1, int var2) {
      int var3 = var0 * field2288 + var2 * field2290 >> 16;
      int var4 = var2 * field2288 - var0 * field2290 >> 16;
      int var5 = var4 * field2305 + field2326 * var1 >> 16;
      int var6 = field2305 * var1 - var4 * field2326 >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = var3 * 128 / var5 + field2339;
         int var8 = var6 * 128 / var5 + field2340;
         return var7 >= field2341 && var7 <= field2343 && var8 >= field2342 && var8 <= field2344;
      } else {
         return false;
      }
   }
}
