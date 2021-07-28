public class class206 extends class200 {
   static boolean field2464;
   static boolean[] field2432;
   static boolean[] field2443;
   static byte[] field2404;
   static byte[] field2427;
   static class206 field2405;
   static class206 field2420;
   static int field2461;
   static int field2462;
   static int field2463;
   static int[] field2407;
   static int[] field2422;
   static int[] field2430;
   static int[] field2435;
   static int[] field2445;
   static int[] field2446;
   static int[] field2447;
   static int[] field2448;
   static int[] field2449;
   static int[] field2451;
   static int[] field2455;
   static int[] field2456;
   static int[] field2458;
   static int[] field2459;
   static int[] field2460;
   static int[] field2467;
   static int[] field2469;
   static int[] field2470;
   static int[][] field2454;
   static int[][] field2468;
   byte field2441;
   byte[] field2418;
   byte[] field2419;
   byte[] field2440;
   int field2406;
   int field2410;
   int field2411;
   int field2412;
   int field2413;
   int field2415;
   int field2423;
   int field2431;
   int field2433;
   int field2434;
   int field2436;
   int field2437;
   int field2438;
   int field2442;
   int[] field2408;
   int[] field2409;
   int[] field2414;
   int[] field2416;
   int[] field2417;
   int[] field2424;
   int[] field2425;
   int[] field2426;
   int[] field2428;
   int[] field2453;
   int[] field2457;
   int[] field2465;
   int[][] field2444;
   int[][] field2450;
   short[] field2421;
   public boolean field2429;

   static {
      field2420 = new class206();
      field2404 = new byte[1];
      field2405 = new class206();
      field2427 = new byte[1];
      field2432 = new boolean[6500];
      field2443 = new boolean[6500];
      field2458 = new int[6500];
      field2430 = new int[6500];
      field2446 = new int[6500];
      field2447 = new int[6500];
      field2448 = new int[6500];
      field2449 = new int[6500];
      field2451 = new int[1600];
      field2468 = new int[1600][512];
      field2435 = new int[12];
      field2454 = new int[12][2000];
      field2455 = new int[2000];
      field2456 = new int[2000];
      field2422 = new int[12];
      field2407 = new int[10];
      field2459 = new int[10];
      field2460 = new int[10];
      field2464 = true;
      field2467 = class197.field2265;
      field2445 = class197.field2272;
      field2469 = class197.field2267;
      field2470 = class197.field2270;
   }

   class206() {
      this.field2442 = 0;
      this.field2411 = 0;
      this.field2441 = 0;
      this.field2423 = 0;
      this.field2429 = false;
      this.field2438 = -1;
      this.field2406 = -1;
      this.field2410 = -1;
   }

   public class206(class206[] var1, int var2) {
      this.field2442 = 0;
      this.field2411 = 0;
      this.field2441 = 0;
      this.field2423 = 0;
      this.field2429 = false;
      this.field2438 = -1;
      this.field2406 = -1;
      this.field2410 = -1;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.field2442 = 0;
      this.field2411 = 0;
      this.field2423 = 0;
      this.field2441 = -1;

      int var7;
      class206 var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            this.field2442 += var8.field2442;
            this.field2411 += var8.field2411;
            this.field2423 += var8.field2423;
            if (var8.field2418 != null) {
               var3 = true;
            } else {
               if (this.field2441 == -1) {
                  this.field2441 = var8.field2441;
               }

               if (this.field2441 != var8.field2441) {
                  var3 = true;
               }
            }

            var4 |= var8.field2419 != null;
            var5 |= var8.field2421 != null;
            var6 |= var8.field2440 != null;
         }
      }

      this.field2424 = new int[this.field2442];
      this.field2409 = new int[this.field2442];
      this.field2457 = new int[this.field2442];
      this.field2428 = new int[this.field2411];
      this.field2465 = new int[this.field2411];
      this.field2414 = new int[this.field2411];
      this.field2408 = new int[this.field2411];
      this.field2416 = new int[this.field2411];
      this.field2417 = new int[this.field2411];
      if (var3) {
         this.field2418 = new byte[this.field2411];
      }

      if (var4) {
         this.field2419 = new byte[this.field2411];
      }

      if (var5) {
         this.field2421 = new short[this.field2411];
      }

      if (var6) {
         this.field2440 = new byte[this.field2411];
      }

      if (this.field2423 > 0) {
         this.field2453 = new int[this.field2423];
         this.field2425 = new int[this.field2423];
         this.field2426 = new int[this.field2423];
      }

      this.field2442 = 0;
      this.field2411 = 0;
      this.field2423 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if (var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.field2411; ++var9) {
               this.field2428[this.field2411] = this.field2442 + var8.field2428[var9];
               this.field2465[this.field2411] = this.field2442 + var8.field2465[var9];
               this.field2414[this.field2411] = this.field2442 + var8.field2414[var9];
               this.field2408[this.field2411] = var8.field2408[var9];
               this.field2416[this.field2411] = var8.field2416[var9];
               this.field2417[this.field2411] = var8.field2417[var9];
               if (var3) {
                  if (var8.field2418 != null) {
                     this.field2418[this.field2411] = var8.field2418[var9];
                  } else {
                     this.field2418[this.field2411] = var8.field2441;
                  }
               }

               if (var4 && var8.field2419 != null) {
                  this.field2419[this.field2411] = var8.field2419[var9];
               }

               if (var5) {
                  if (var8.field2421 != null) {
                     this.field2421[this.field2411] = var8.field2421[var9];
                  } else {
                     this.field2421[this.field2411] = -1;
                  }
               }

               if (var6) {
                  if (var8.field2440 != null && var8.field2440[var9] != -1) {
                     this.field2440[this.field2411] = (byte)(this.field2423 + var8.field2440[var9]);
                  } else {
                     this.field2440[this.field2411] = -1;
                  }
               }

               ++this.field2411;
            }

            for(var9 = 0; var9 < var8.field2423; ++var9) {
               this.field2453[this.field2423] = this.field2442 + var8.field2453[var9];
               this.field2425[this.field2423] = this.field2442 + var8.field2425[var9];
               this.field2426[this.field2423] = this.field2442 + var8.field2426[var9];
               ++this.field2423;
            }

            for(var9 = 0; var9 < var8.field2442; ++var9) {
               this.field2424[this.field2442] = var8.field2424[var9];
               this.field2409[this.field2442] = var8.field2409[var9];
               this.field2457[this.field2442] = var8.field2457[var9];
               ++this.field2442;
            }
         }
      }

   }

   public void method4137() {
      if (this.field2434 != 1) {
         this.field2434 = 1;
         super.field2345 = 0;
         this.field2431 = 0;
         this.field2415 = 0;

         for(int var1 = 0; var1 < this.field2442; ++var1) {
            int var2 = this.field2424[var1];
            int var3 = this.field2409[var1];
            int var4 = this.field2457[var1];
            if (-var3 > super.field2345) {
               super.field2345 = -var3;
            }

            if (var3 > this.field2431) {
               this.field2431 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2415) {
               this.field2415 = var5;
            }
         }

         this.field2415 = (int)(Math.sqrt((double)this.field2415) + 0.99D);
         this.field2413 = (int)(Math.sqrt((double)(this.field2415 * this.field2415 + super.field2345 * super.field2345)) + 0.99D);
         this.field2433 = this.field2413 + (int)(Math.sqrt((double)(this.field2415 * this.field2415 + this.field2431 * this.field2431)) + 0.99D);
      }
   }

   public void method4141(class202 var1, int var2) {
      if (this.field2450 != null) {
         class195 var3 = var1.field2353[var2];
         class198 var4 = var3.field2215;
         field2461 = 0;
         field2462 = 0;
         field2463 = 0;

         for(int var5 = 0; var5 < var3.field2211; ++var5) {
            int var6 = var3.field2217[var5];
            this.method4145(var4.field2273[var6], var4.field2275[var6], var3.field2216[var5], var3.field2219[var5], var3.field2218[var5]);
         }

         this.method4140();
      }
   }

   void method4140() {
      this.field2434 = 0;
      this.field2438 = -1;
   }

   final void method4143(int var1) {
      int var2 = class197.field2258;
      int var3 = class197.field2259;
      int var4 = 0;
      int var5 = this.field2428[var1];
      int var6 = this.field2465[var1];
      int var7 = this.field2414[var1];
      int var8 = field2449[var5];
      int var9 = field2449[var6];
      int var10 = field2449[var7];
      if (this.field2419 == null) {
         class197.field2257 = 0;
      } else {
         class197.field2257 = this.field2419[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         field2407[var4] = field2458[var5];
         field2459[var4] = field2430[var5];
         field2460[var4++] = this.field2408[var1];
      } else {
         var11 = field2447[var5];
         var12 = field2448[var5];
         var13 = this.field2408[var1];
         if (var10 >= 50) {
            var14 = field2470[var10 - var8] * (50 - var8);
            field2407[var4] = var2 + class197.field2261 * (var11 + ((field2447[var7] - var11) * var14 >> 16)) / 50;
            field2459[var4] = var3 + class197.field2261 * (var12 + ((field2448[var7] - var12) * var14 >> 16)) / 50;
            field2460[var4++] = var13 + ((this.field2417[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = field2470[var9 - var8] * (50 - var8);
            field2407[var4] = var2 + class197.field2261 * (var11 + ((field2447[var6] - var11) * var14 >> 16)) / 50;
            field2459[var4] = var3 + class197.field2261 * (var12 + ((field2448[var6] - var12) * var14 >> 16)) / 50;
            field2460[var4++] = var13 + ((this.field2416[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field2407[var4] = field2458[var6];
         field2459[var4] = field2430[var6];
         field2460[var4++] = this.field2416[var1];
      } else {
         var11 = field2447[var6];
         var12 = field2448[var6];
         var13 = this.field2416[var1];
         if (var8 >= 50) {
            var14 = field2470[var8 - var9] * (50 - var9);
            field2407[var4] = var2 + class197.field2261 * (var11 + ((field2447[var5] - var11) * var14 >> 16)) / 50;
            field2459[var4] = var3 + class197.field2261 * (var12 + ((field2448[var5] - var12) * var14 >> 16)) / 50;
            field2460[var4++] = var13 + ((this.field2408[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = field2470[var10 - var9] * (50 - var9);
            field2407[var4] = var2 + class197.field2261 * (var11 + ((field2447[var7] - var11) * var14 >> 16)) / 50;
            field2459[var4] = var3 + class197.field2261 * (var12 + ((field2448[var7] - var12) * var14 >> 16)) / 50;
            field2460[var4++] = var13 + ((this.field2417[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field2407[var4] = field2458[var7];
         field2459[var4] = field2430[var7];
         field2460[var4++] = this.field2417[var1];
      } else {
         var11 = field2447[var7];
         var12 = field2448[var7];
         var13 = this.field2417[var1];
         if (var9 >= 50) {
            var14 = field2470[var9 - var10] * (50 - var10);
            field2407[var4] = var2 + class197.field2261 * (var11 + ((field2447[var6] - var11) * var14 >> 16)) / 50;
            field2459[var4] = var3 + class197.field2261 * (var12 + ((field2448[var6] - var12) * var14 >> 16)) / 50;
            field2460[var4++] = var13 + ((this.field2416[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = field2470[var8 - var10] * (50 - var10);
            field2407[var4] = var2 + class197.field2261 * (var11 + ((field2447[var5] - var11) * var14 >> 16)) / 50;
            field2459[var4] = var3 + class197.field2261 * (var12 + ((field2448[var5] - var12) * var14 >> 16)) / 50;
            field2460[var4++] = var13 + ((this.field2408[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field2407[0];
      var12 = field2407[1];
      var13 = field2407[2];
      var14 = field2459[0];
      int var15 = field2459[1];
      int var16 = field2459[2];
      class197.field2251 = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > class197.field2260 || var12 > class197.field2260 || var13 > class197.field2260) {
            class197.field2251 = true;
         }

         if (this.field2421 != null && this.field2421[var1] != -1) {
            if (this.field2440 != null && this.field2440[var1] != -1) {
               var20 = this.field2440[var1] & 255;
               var17 = this.field2453[var20];
               var18 = this.field2425[var20];
               var19 = this.field2426[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if (this.field2417[var1] == -1) {
               class197.method3866(var14, var15, var16, var11, var12, var13, this.field2408[var1], this.field2408[var1], this.field2408[var1], field2447[var17], field2447[var18], field2447[var19], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], this.field2421[var1]);
            } else {
               class197.method3866(var14, var15, var16, var11, var12, var13, field2460[0], field2460[1], field2460[2], field2447[var17], field2447[var18], field2447[var19], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], this.field2421[var1]);
            }
         } else if (this.field2417[var1] == -1) {
            class197.method3830(var14, var15, var16, var11, var12, var13, field2469[this.field2408[var1]]);
         } else {
            class197.method3832(var14, var15, var16, var11, var12, var13, field2460[0], field2460[1], field2460[2]);
         }
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > class197.field2260 || var12 > class197.field2260 || var13 > class197.field2260 || field2407[3] < 0 || field2407[3] > class197.field2260) {
            class197.field2251 = true;
         }

         if (this.field2421 != null && this.field2421[var1] != -1) {
            if (this.field2440 != null && this.field2440[var1] != -1) {
               var20 = this.field2440[var1] & 255;
               var17 = this.field2453[var20];
               var18 = this.field2425[var20];
               var19 = this.field2426[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var21 = this.field2421[var1];
            if (this.field2417[var1] == -1) {
               class197.method3866(var14, var15, var16, var11, var12, var13, this.field2408[var1], this.field2408[var1], this.field2408[var1], field2447[var17], field2447[var18], field2447[var19], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], var21);
               class197.method3866(var14, var16, field2459[3], var11, var13, field2407[3], this.field2408[var1], this.field2408[var1], this.field2408[var1], field2447[var17], field2447[var18], field2447[var19], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], var21);
            } else {
               class197.method3866(var14, var15, var16, var11, var12, var13, field2460[0], field2460[1], field2460[2], field2447[var17], field2447[var18], field2447[var19], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], var21);
               class197.method3866(var14, var16, field2459[3], var11, var13, field2407[3], field2460[0], field2460[2], field2460[3], field2447[var17], field2447[var18], field2447[var19], field2448[var17], field2448[var18], field2448[var19], field2449[var17], field2449[var18], field2449[var19], var21);
            }
         } else if (this.field2417[var1] == -1) {
            var17 = field2469[this.field2408[var1]];
            class197.method3830(var14, var15, var16, var11, var12, var13, var17);
            class197.method3830(var14, var16, field2459[3], var11, var13, field2407[3], var17);
         } else {
            class197.method3832(var14, var15, var16, var11, var12, var13, field2460[0], field2460[1], field2460[2]);
            class197.method3832(var14, var16, field2459[3], var11, var13, field2407[3], field2460[0], field2460[2], field2460[3]);
         }
      }

   }

   class206 method4135(boolean var1, class206 var2, byte[] var3) {
      var2.field2442 = this.field2442;
      var2.field2411 = this.field2411;
      var2.field2423 = this.field2423;
      if (var2.field2424 == null || var2.field2424.length < this.field2442) {
         var2.field2424 = new int[this.field2442 + 100];
         var2.field2409 = new int[this.field2442 + 100];
         var2.field2457 = new int[this.field2442 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field2442; ++var4) {
         var2.field2424[var4] = this.field2424[var4];
         var2.field2409[var4] = this.field2409[var4];
         var2.field2457[var4] = this.field2457[var4];
      }

      if (var1) {
         var2.field2419 = this.field2419;
      } else {
         var2.field2419 = var3;
         if (this.field2419 == null) {
            for(var4 = 0; var4 < this.field2411; ++var4) {
               var2.field2419[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field2411; ++var4) {
               var2.field2419[var4] = this.field2419[var4];
            }
         }
      }

      var2.field2428 = this.field2428;
      var2.field2465 = this.field2465;
      var2.field2414 = this.field2414;
      var2.field2408 = this.field2408;
      var2.field2416 = this.field2416;
      var2.field2417 = this.field2417;
      var2.field2418 = this.field2418;
      var2.field2440 = this.field2440;
      var2.field2421 = this.field2421;
      var2.field2441 = this.field2441;
      var2.field2453 = this.field2453;
      var2.field2425 = this.field2425;
      var2.field2426 = this.field2426;
      var2.field2450 = this.field2450;
      var2.field2444 = this.field2444;
      var2.field2429 = this.field2429;
      var2.method4140();
      return var2;
   }

   void method4136(int var1) {
      if (this.field2438 == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field2445[var1];
         int var9 = field2467[var1];

         for(int var10 = 0; var10 < this.field2442; ++var10) {
            int var11 = class197.method3837(this.field2424[var10], this.field2457[var10], var8, var9);
            int var12 = this.field2409[var10];
            int var13 = class197.method3818(this.field2424[var10], this.field2457[var10], var8, var9);
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var12 < var3) {
               var3 = var12;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (var13 < var4) {
               var4 = var13;
            }

            if (var13 > var7) {
               var7 = var13;
            }
         }

         this.field2412 = (var5 + var2) / 2;
         this.field2436 = (var6 + var3) / 2;
         this.field2437 = (var7 + var4) / 2;
         this.field2438 = (var5 - var2 + 1) / 2;
         this.field2406 = (var6 - var3 + 1) / 2;
         this.field2410 = (var7 - var4 + 1) / 2;
         if (this.field2438 < 32) {
            this.field2438 = 32;
         }

         if (this.field2410 < 32) {
            this.field2410 = 32;
         }

         if (this.field2429) {
            this.field2438 += 8;
            this.field2410 += 8;
         }

      }
   }

   public class206 method4133(boolean var1) {
      if (!var1 && field2404.length < this.field2411) {
         field2404 = new byte[this.field2411 + 100];
      }

      return this.method4135(var1, field2420, field2404);
   }

   void method4138() {
      if (this.field2434 != 2) {
         this.field2434 = 2;
         this.field2415 = 0;

         for(int var1 = 0; var1 < this.field2442; ++var1) {
            int var2 = this.field2424[var1];
            int var3 = this.field2409[var1];
            int var4 = this.field2457[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.field2415) {
               this.field2415 = var5;
            }
         }

         this.field2415 = (int)(Math.sqrt((double)this.field2415) + 0.99D);
         this.field2413 = this.field2415;
         this.field2433 = this.field2415 + this.field2415;
      }
   }

   public class206 method4134(boolean var1) {
      if (!var1 && field2427.length < this.field2411) {
         field2427 = new byte[this.field2411 + 100];
      }

      return this.method4135(var1, field2405, field2427);
   }

   public void method4131(int var1) {
      int var2 = field2467[var1];
      int var3 = field2445[var1];

      for(int var4 = 0; var4 < this.field2442; ++var4) {
         int var5 = var3 * this.field2409[var4] - var2 * this.field2457[var4] >> 16;
         this.field2457[var4] = var2 * this.field2409[var4] + var3 * this.field2457[var4] >> 16;
         this.field2409[var4] = var5;
      }

      this.method4140();
   }

   public class206 method4132(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method4137();
      int var7 = var2 - this.field2415;
      int var8 = var2 + this.field2415;
      int var9 = var4 - this.field2415;
      int var10 = var4 + this.field2415;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class206 var11;
            if (var5) {
               var11 = new class206();
               var11.field2442 = this.field2442;
               var11.field2411 = this.field2411;
               var11.field2423 = this.field2423;
               var11.field2424 = this.field2424;
               var11.field2457 = this.field2457;
               var11.field2428 = this.field2428;
               var11.field2465 = this.field2465;
               var11.field2414 = this.field2414;
               var11.field2408 = this.field2408;
               var11.field2416 = this.field2416;
               var11.field2417 = this.field2417;
               var11.field2418 = this.field2418;
               var11.field2419 = this.field2419;
               var11.field2440 = this.field2440;
               var11.field2421 = this.field2421;
               var11.field2441 = this.field2441;
               var11.field2453 = this.field2453;
               var11.field2425 = this.field2425;
               var11.field2426 = this.field2426;
               var11.field2450 = this.field2450;
               var11.field2444 = this.field2444;
               var11.field2429 = this.field2429;
               var11.field2409 = new int[var11.field2442];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field2442; ++var12) {
                  var13 = var2 + this.field2424[var12];
                  var14 = var4 + this.field2457[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2409[var12] = var21 + this.field2409[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field2442; ++var12) {
                  var13 = (-this.field2409[var12] << 16) / super.field2345;
                  if (var13 < var6) {
                     var14 = var2 + this.field2424[var12];
                     var15 = var4 + this.field2457[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field2409[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field2409[var12];
                  }
               }
            }

            var11.method4140();
            return var11;
         }
      } else {
         return this;
      }
   }

   void vmethod4151(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field2451[0] = -1;
      if (this.field2434 != 1) {
         this.method4137();
      }

      this.method4136(var1);
      int var11 = var5 * var8 - var4 * var6 >> 16;
      int var12 = var2 * var7 + var3 * var11 >> 16;
      int var13 = var3 * this.field2415 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var5 * var6 >> 16;
         int var16 = (var15 - this.field2415) * class197.field2261;
         if (var16 / var14 < class197.field2263) {
            int var17 = (var15 + this.field2415) * class197.field2261;
            if (var17 / var14 > class197.field2262) {
               int var18 = var3 * var7 - var11 * var2 >> 16;
               int var19 = var2 * this.field2415 >> 16;
               int var20 = (var18 + var19) * class197.field2261;
               if (var20 / var14 > class197.field2264) {
                  int var21 = (var3 * super.field2345 >> 16) + var19;
                  int var22 = (var18 - var21) * class197.field2261;
                  if (var22 / var14 < class197.field2247) {
                     int var23 = var13 + (var2 * super.field2345 >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if (var12 - var23 <= 50) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field2423 > 0;
                     int var27 = class207.field2487;
                     int var29 = class89.method2089();
                     boolean var30 = class183.method3586();
                     boolean var32 = var9 != 0L;
                     boolean var33;
                     if (var32) {
                        var33 = (int)(var9 >>> 16 & 1L) == 1;
                        var32 = !var33;
                     }

                     var33 = false;
                     int var35;
                     int var36;
                     int var37;
                     if (var32 && var30) {
                        boolean var34 = false;
                        if (field2464) {
                           var34 = class127.method2501(this, var6, var7, var8);
                        } else {
                           var35 = var12 - var13;
                           if (var35 <= 50) {
                              var35 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var35;
                           } else {
                              var17 /= var14;
                              var16 /= var35;
                           }

                           if (var18 > 0) {
                              var22 /= var14;
                              var20 /= var35;
                           } else {
                              var20 /= var14;
                              var22 /= var35;
                           }

                           var36 = var27 - class197.field2258;
                           var37 = var29 - class197.field2259;
                           if (var36 > var16 && var36 < var17 && var37 > var22 && var37 < var20) {
                              var34 = true;
                           }
                        }

                        if (var34) {
                           if (this.field2429) {
                              class207.field2484[++class207.field2483 - 1] = var9;
                           } else {
                              var33 = true;
                           }
                        }
                     }

                     int var47 = class197.field2258;
                     var35 = class197.field2259;
                     var36 = 0;
                     var37 = 0;
                     if (var1 != 0) {
                        var36 = field2467[var1];
                        var37 = field2445[var1];
                     }

                     for(int var38 = 0; var38 < this.field2442; ++var38) {
                        int var39 = this.field2424[var38];
                        int var40 = this.field2409[var38];
                        int var41 = this.field2457[var38];
                        int var42;
                        if (var1 != 0) {
                           var42 = var41 * var36 + var39 * var37 >> 16;
                           var41 = var41 * var37 - var39 * var36 >> 16;
                           var39 = var42;
                        }

                        var39 += var6;
                        var40 += var7;
                        var41 += var8;
                        var42 = var41 * var4 + var5 * var39 >> 16;
                        var41 = var5 * var41 - var39 * var4 >> 16;
                        var39 = var42;
                        var42 = var3 * var40 - var41 * var2 >> 16;
                        var41 = var40 * var2 + var3 * var41 >> 16;
                        field2446[var38] = var41 - var12;
                        if (var41 >= 50) {
                           field2458[var38] = var39 * class197.field2261 / var41 + var47;
                           field2430[var38] = var42 * class197.field2261 / var41 + var35;
                        } else {
                           field2458[var38] = -5000;
                           var24 = true;
                        }

                        if (var26) {
                           field2447[var38] = var39;
                           field2448[var38] = var42;
                           field2449[var38] = var41;
                        }
                     }

                     try {
                        this.method4152(var24, var33, this.field2429, var9);
                     } catch (Exception var46) {
                     }

                  }
               }
            }
         }
      }
   }

   public void method4182() {
      for(int var1 = 0; var1 < this.field2442; ++var1) {
         int var2 = this.field2457[var1];
         this.field2457[var1] = this.field2424[var1];
         this.field2424[var1] = -var2;
      }

      this.method4140();
   }

   public void method4153(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2442; ++var4) {
         this.field2424[var4] = this.field2424[var4] * var1 / 128;
         this.field2409[var4] = var2 * this.field2409[var4] / 128;
         this.field2457[var4] = var3 * this.field2457[var4] / 128;
      }

      this.method4140();
   }

   public void method4144() {
      for(int var1 = 0; var1 < this.field2442; ++var1) {
         this.field2424[var1] = -this.field2424[var1];
         this.field2457[var1] = -this.field2457[var1];
      }

      this.method4140();
   }

   public void method4162() {
      for(int var1 = 0; var1 < this.field2442; ++var1) {
         int var2 = this.field2424[var1];
         this.field2424[var1] = this.field2457[var1];
         this.field2457[var1] = -var2;
      }

      this.method4140();
   }

   final void method4192(int var1) {
      if (field2443[var1]) {
         this.method4143(var1);
      } else {
         int var2 = this.field2428[var1];
         int var3 = this.field2465[var1];
         int var4 = this.field2414[var1];
         class197.field2251 = field2432[var1];
         if (this.field2419 == null) {
            class197.field2257 = 0;
         } else {
            class197.field2257 = this.field2419[var1] & 255;
         }

         if (this.field2421 != null && this.field2421[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if (this.field2440 != null && this.field2440[var1] != -1) {
               int var8 = this.field2440[var1] & 255;
               var5 = this.field2453[var8];
               var6 = this.field2425[var8];
               var7 = this.field2426[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if (this.field2417[var1] == -1) {
               class197.method3866(field2430[var2], field2430[var3], field2430[var4], field2458[var2], field2458[var3], field2458[var4], this.field2408[var1], this.field2408[var1], this.field2408[var1], field2447[var5], field2447[var6], field2447[var7], field2448[var5], field2448[var6], field2448[var7], field2449[var5], field2449[var6], field2449[var7], this.field2421[var1]);
            } else {
               class197.method3866(field2430[var2], field2430[var3], field2430[var4], field2458[var2], field2458[var3], field2458[var4], this.field2408[var1], this.field2416[var1], this.field2417[var1], field2447[var5], field2447[var6], field2447[var7], field2448[var5], field2448[var6], field2448[var7], field2449[var5], field2449[var6], field2449[var7], this.field2421[var1]);
            }
         } else if (this.field2417[var1] == -1) {
            class197.method3830(field2430[var2], field2430[var3], field2430[var4], field2458[var2], field2458[var3], field2458[var4], field2469[this.field2408[var1]]);
         } else {
            class197.method3832(field2430[var2], field2430[var3], field2430[var4], field2458[var2], field2458[var3], field2458[var4], this.field2408[var1], this.field2416[var1], this.field2417[var1]);
         }

      }
   }

   public void method4174(class202 var1, int var2, class202 var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            class195 var6 = var1.field2353[var2];
            class195 var7 = var3.field2353[var4];
            class198 var8 = var6.field2215;
            field2461 = 0;
            field2462 = 0;
            field2463 = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field2211; ++var11) {
               for(var12 = var6.field2217[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 != var10 || var8.field2273[var12] == 0) {
                  this.method4145(var8.field2273[var12], var8.field2275[var12], var6.field2216[var11], var6.field2219[var11], var6.field2218[var11]);
               }
            }

            field2461 = 0;
            field2462 = 0;
            field2463 = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.field2211; ++var11) {
               for(var12 = var7.field2217[var11]; var12 > var10; var10 = var5[var13++]) {
               }

               if (var12 == var10 || var8.field2273[var12] == 0) {
                  this.method4145(var8.field2273[var12], var8.field2275[var12], var7.field2216[var11], var7.field2219[var11], var7.field2218[var11]);
               }
            }

            this.method4140();
         } else {
            this.method4141(var1, var2);
         }
      }
   }

   void method4145(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         field2461 = 0;
         field2462 = 0;
         field2463 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var9 = var2[var8];
            if (var9 < this.field2450.length) {
               int[] var10 = this.field2450[var9];

               for(var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  field2461 += this.field2424[var12];
                  field2462 += this.field2409[var12];
                  field2463 += this.field2457[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            field2461 = var3 + field2461 / var7;
            field2462 = var4 + field2462 / var7;
            field2463 = var5 + field2463 / var7;
         } else {
            field2461 = var3;
            field2462 = var4;
            field2463 = var5;
         }

      } else {
         int[] var10000;
         int[] var18;
         int var19;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field2450.length) {
                  var18 = this.field2450[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     var10000 = this.field2424;
                     var10000[var11] += var3;
                     var10000 = this.field2409;
                     var10000[var11] += var4;
                     var10000 = this.field2457;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field2450.length) {
                  var18 = this.field2450[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     var10000 = this.field2424;
                     var10000[var11] -= field2461;
                     var10000 = this.field2409;
                     var10000[var11] -= field2462;
                     var10000 = this.field2457;
                     var10000[var11] -= field2463;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = field2467[var14];
                        var16 = field2445[var14];
                        var17 = var15 * this.field2409[var11] + var16 * this.field2424[var11] >> 16;
                        this.field2409[var11] = var16 * this.field2409[var11] - var15 * this.field2424[var11] >> 16;
                        this.field2424[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field2467[var12];
                        var16 = field2445[var12];
                        var17 = var16 * this.field2409[var11] - var15 * this.field2457[var11] >> 16;
                        this.field2457[var11] = var15 * this.field2409[var11] + var16 * this.field2457[var11] >> 16;
                        this.field2409[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field2467[var13];
                        var16 = field2445[var13];
                        var17 = var15 * this.field2457[var11] + var16 * this.field2424[var11] >> 16;
                        this.field2457[var11] = var16 * this.field2457[var11] - var15 * this.field2424[var11] >> 16;
                        this.field2424[var11] = var17;
                     }

                     var10000 = this.field2424;
                     var10000[var11] += field2461;
                     var10000 = this.field2409;
                     var10000[var11] += field2462;
                     var10000 = this.field2457;
                     var10000[var11] += field2463;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field2450.length) {
                  var18 = this.field2450[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     var10000 = this.field2424;
                     var10000[var11] -= field2461;
                     var10000 = this.field2409;
                     var10000[var11] -= field2462;
                     var10000 = this.field2457;
                     var10000[var11] -= field2463;
                     this.field2424[var11] = var3 * this.field2424[var11] / 128;
                     this.field2409[var11] = var4 * this.field2409[var11] / 128;
                     this.field2457[var11] = var5 * this.field2457[var11] / 128;
                     var10000 = this.field2424;
                     var10000[var11] += field2461;
                     var10000 = this.field2409;
                     var10000[var11] += field2462;
                     var10000 = this.field2457;
                     var10000[var11] += field2463;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.field2444 != null && this.field2419 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.field2444.length) {
                     var18 = this.field2444[var8];

                     for(var19 = 0; var19 < var18.length; ++var19) {
                        var11 = var18[var19];
                        var12 = (this.field2419[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.field2419[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   final void method4152(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.field2433 < 1600) {
         int var6;
         for(var6 = 0; var6 < this.field2433; ++var6) {
            field2451[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field2411; ++var7) {
            if (this.field2417[var7] != -2) {
               var8 = this.field2428[var7];
               var9 = this.field2465[var7];
               var10 = this.field2414[var7];
               var11 = field2458[var8];
               var12 = field2458[var9];
               var13 = field2458[var10];
               int var14;
               if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var14 = field2447[var8];
                  var15 = field2447[var9];
                  var16 = field2447[var10];
                  int var17 = field2448[var8];
                  var18 = field2448[var9];
                  int var19 = field2448[var10];
                  int var20 = field2449[var8];
                  int var21 = field2449[var9];
                  int var22 = field2449[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field2443[var7] = true;
                     int var26 = (field2446[var8] + field2446[var9] + field2446[var10]) / 3 + this.field2413;
                     field2468[var26][field2451[var26]++] = var7;
                  }
               } else {
                  if (var2 && class277.method5011(field2430[var8], field2430[var9], field2430[var10], var11, var12, var13, var6)) {
                     class207.field2484[++class207.field2483 - 1] = var4;
                     var2 = false;
                  }

                  if ((var11 - var12) * (field2430[var10] - field2430[var9]) - (var13 - var12) * (field2430[var8] - field2430[var9]) > 0) {
                     field2443[var7] = false;
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class197.field2260 && var12 <= class197.field2260 && var13 <= class197.field2260) {
                        field2432[var7] = false;
                     } else {
                        field2432[var7] = true;
                     }

                     var14 = (field2446[var8] + field2446[var9] + field2446[var10]) / 3 + this.field2413;
                     field2468[var14][field2451[var14]++] = var7;
                  }
               }
            }
         }

         int[] var29;
         if (this.field2418 == null) {
            for(var7 = this.field2433 - 1; var7 >= 0; --var7) {
               var8 = field2451[var7];
               if (var8 > 0) {
                  var29 = field2468[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.method4192(var29[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field2435[var7] = 0;
               field2422[var7] = 0;
            }

            for(var7 = this.field2433 - 1; var7 >= 0; --var7) {
               var8 = field2451[var7];
               if (var8 > 0) {
                  var29 = field2468[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var29[var10];
                     byte var33 = this.field2418[var11];
                     var13 = field2435[var33]++;
                     field2454[var33][var13] = var11;
                     if (var33 < 10) {
                        int[] var10000 = field2422;
                        var10000[var33] += var7;
                     } else if (var33 == 10) {
                        field2455[var13] = var7;
                     } else {
                        field2456[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (field2435[1] > 0 || field2435[2] > 0) {
               var7 = (field2422[1] + field2422[2]) / (field2435[1] + field2435[2]);
            }

            var8 = 0;
            if (field2435[3] > 0 || field2435[4] > 0) {
               var8 = (field2422[3] + field2422[4]) / (field2435[3] + field2435[4]);
            }

            var9 = 0;
            if (field2435[6] > 0 || field2435[8] > 0) {
               var9 = (field2422[8] + field2422[6]) / (field2435[8] + field2435[6]);
            }

            var11 = 0;
            var12 = field2435[10];
            int[] var30 = field2454[10];
            int[] var31 = field2455;
            if (var11 == var12) {
               var11 = 0;
               var12 = field2435[11];
               var30 = field2454[11];
               var31 = field2456;
            }

            if (var11 < var12) {
               var10 = var31[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method4192(var30[var11++]);
                  if (var11 == var12 && var30 != field2454[11]) {
                     var11 = 0;
                     var12 = field2435[11];
                     var30 = field2454[11];
                     var31 = field2456;
                  }

                  if (var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method4192(var30[var11++]);
                  if (var11 == var12 && var30 != field2454[11]) {
                     var11 = 0;
                     var12 = field2435[11];
                     var30 = field2454[11];
                     var31 = field2456;
                  }

                  if (var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method4192(var30[var11++]);
                  if (var11 == var12 && var30 != field2454[11]) {
                     var11 = 0;
                     var12 = field2435[11];
                     var30 = field2454[11];
                     var31 = field2456;
                  }

                  if (var11 < var12) {
                     var10 = var31[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field2435[var15];
               int[] var32 = field2454[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method4192(var32[var18]);
               }
            }

            while(var10 != -1000) {
               this.method4192(var30[var11++]);
               if (var11 == var12 && var30 != field2454[11]) {
                  var11 = 0;
                  var30 = field2454[11];
                  var12 = field2435[11];
                  var31 = field2456;
               }

               if (var11 < var12) {
                  var10 = var31[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   public void method4147(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2442; ++var4) {
         int[] var10000 = this.field2424;
         var10000[var4] += var1;
         var10000 = this.field2409;
         var10000[var4] += var2;
         var10000 = this.field2457;
         var10000[var4] += var3;
      }

      this.method4140();
   }

   public final void method4187(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field2451[0] = -1;
      if (this.field2434 != 2 && this.field2434 != 1) {
         this.method4138();
      }

      int var8 = class197.field2258;
      int var9 = class197.field2259;
      int var10 = field2467[var1];
      int var11 = field2445[var1];
      int var12 = field2467[var2];
      int var13 = field2445[var2];
      int var14 = field2467[var3];
      int var15 = field2445[var3];
      int var16 = field2467[var4];
      int var17 = field2445[var4];
      int var18 = var16 * var6 + var17 * var7 >> 16;

      for(int var19 = 0; var19 < this.field2442; ++var19) {
         int var20 = this.field2424[var19];
         int var21 = this.field2409[var19];
         int var22 = this.field2457[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field2446[var19] = var22 - var18;
         field2458[var19] = var20 * class197.field2261 / var22 + var8;
         field2430[var19] = var23 * class197.field2261 / var22 + var9;
         if (this.field2423 > 0) {
            field2447[var19] = var20;
            field2448[var19] = var23;
            field2449[var19] = var22;
         }
      }

      try {
         this.method4152(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   public final void method4150(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      field2451[0] = -1;
      if (this.field2434 != 2 && this.field2434 != 1) {
         this.method4138();
      }

      int var9 = class197.field2258;
      int var10 = class197.field2259;
      int var11 = field2467[var1];
      int var12 = field2445[var1];
      int var13 = field2467[var2];
      int var14 = field2445[var2];
      int var15 = field2467[var3];
      int var16 = field2445[var3];
      int var17 = field2467[var4];
      int var18 = field2445[var4];
      int var19 = var17 * var6 + var18 * var7 >> 16;

      for(int var20 = 0; var20 < this.field2442; ++var20) {
         int var21 = this.field2424[var20];
         int var22 = this.field2409[var20];
         int var23 = this.field2457[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field2446[var20] = var23 - var19;
         field2458[var20] = var9 + var21 * class197.field2261 / var8;
         field2430[var20] = var10 + var24 * class197.field2261 / var8;
         if (this.field2423 > 0) {
            field2447[var20] = var21;
            field2448[var20] = var24;
            field2449[var20] = var23;
         }
      }

      try {
         this.method4152(false, false, false, 0L);
      } catch (Exception var26) {
      }

   }

   public int method4139() {
      this.method4137();
      return this.field2415;
   }
}
