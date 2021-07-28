public class class235 extends class30 {
   static class396 field2846;
   boolean field2845;
   class236 field2844;
   class238 field2849;
   class240[][] field2842;
   class240[][] field2843;
   class363 field2827;
   int field2824;
   int field2826;
   int field2836;
   int field2847;
   int[] field2823;
   int[] field2825;
   int[] field2828;
   int[] field2829;
   int[] field2830;
   int[] field2831;
   int[] field2832;
   int[] field2833;
   int[] field2834;
   int[] field2837;
   int[] field2838;
   int[] field2839;
   int[] field2840;
   int[] field2841;
   int[] field2851;
   long field2848;
   long field2850;

   public class235() {
      this.field2826 = 256;
      this.field2824 = 1000000;
      this.field2851 = new int[16];
      this.field2825 = new int[16];
      this.field2828 = new int[16];
      this.field2823 = new int[16];
      this.field2829 = new int[16];
      this.field2831 = new int[16];
      this.field2832 = new int[16];
      this.field2833 = new int[16];
      this.field2834 = new int[16];
      this.field2830 = new int[16];
      this.field2837 = new int[16];
      this.field2838 = new int[16];
      this.field2839 = new int[16];
      this.field2840 = new int[16];
      this.field2841 = new int[16];
      this.field2842 = new class240[16][128];
      this.field2843 = new class240[16][128];
      this.field2844 = new class236();
      this.field2849 = new class238(this);
      this.field2827 = new class363(128);
      this.method4420();
   }

   void method4409(int var1, int var2) {
      this.field2823[var1] = var2;
      this.field2831[var1] = var2 & -128;
      this.method4441(var1, var2);
   }

   void method4413(int var1, int var2, int var3) {
      class240 var5 = this.field2842[var1][var2];
      if (var5 != null) {
         this.field2842[var1][var2] = null;
         if ((this.field2830[var1] & 2) != 0) {
            for(class240 var6 = (class240)this.field2849.field2876.method5202(); var6 != null; var6 = (class240)this.field2849.field2876.method5193()) {
               if (var5.field2902 == var6.field2902 && var6.field2896 < 0 && var6 != var5) {
                  var5.field2896 = 0;
                  break;
               }
            }
         } else {
            var5.field2896 = 0;
         }

      }
   }

   void method4417(int var1) {
      for(class240 var3 = (class240)this.field2849.field2876.method5202(); var3 != null; var3 = (class240)this.field2849.field2876.method5193()) {
         if (var1 < 0 || var3.field2902 == var1) {
            if (var3.field2900 != null) {
               var3.field2900.method567(class281.field3633 / 100);
               if (var3.field2900.method571()) {
                  this.field2849.field2877.method372(var3.field2900);
               }

               var3.method4613();
            }

            if (var3.field2896 < 0) {
               this.field2842[var3.field2902][var3.field2893] = null;
            }

            var3.method6014();
         }
      }

   }

   public synchronized void method4406() {
      this.field2844.method4509();
      this.method4420();
   }

   void method4418(int var1) {
      if (var1 >= 0) {
         this.field2851[var1] = 12800;
         this.field2825[var1] = 8192;
         this.field2828[var1] = 16383;
         this.field2832[var1] = 8192;
         this.field2833[var1] = 0;
         this.field2834[var1] = 8192;
         this.method4421(var1);
         this.method4492(var1);
         this.field2830[var1] = 0;
         this.field2837[var1] = 32767;
         this.field2838[var1] = 256;
         this.field2839[var1] = 0;
         this.method4424(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method4418(var1);
         }

      }
   }

   void method4414(int var1, int var2, int var3) {
   }

   void method4462(int var1, int var2, int var3) {
      this.method4413(var1, var2, 64);
      if ((this.field2830[var1] & 2) != 0) {
         for(class240 var5 = (class240)this.field2849.field2876.method5209(); var5 != null; var5 = (class240)this.field2849.field2876.method5194()) {
            if (var5.field2902 == var1 && var5.field2896 < 0) {
               this.field2842[var1][var5.field2893] = null;
               this.field2842[var1][var2] = var5;
               int var6 = (var5.field2892 * var5.field2891 >> 12) + var5.field2882;
               var5.field2882 += var2 - var5.field2893 << 8;
               var5.field2891 = var6 - var5.field2882;
               var5.field2892 = 4096;
               var5.field2893 = var2;
               return;
            }
         }
      }

      class237 var10 = (class237)this.field2827.method6327((long)this.field2829[var1]);
      if (var10 != null) {
         class22 var9 = var10.field2869[var2];
         if (var9 != null) {
            class240 var7 = new class240();
            var7.field2902 = var1;
            var7.field2890 = var10;
            var7.field2884 = var9;
            var7.field2885 = var10.field2871[var2];
            var7.field2887 = var10.field2872[var2];
            var7.field2893 = var2;
            var7.field2888 = var3 * var3 * var10.field2873[var2] * var10.field2870 + 1024 >> 11;
            var7.field2889 = var10.field2867[var2] & 255;
            var7.field2882 = (var2 << 8) - (var10.field2868[var2] & 32767);
            var7.field2883 = 0;
            var7.field2899 = 0;
            var7.field2895 = 0;
            var7.field2896 = -1;
            var7.field2897 = 0;
            if (this.field2839[var1] == 0) {
               var7.field2900 = class29.method554(var9, this.method4502(var7), this.method4426(var7), this.method4427(var7));
            } else {
               var7.field2900 = class29.method554(var9, this.method4502(var7), 0, this.method4427(var7));
               this.method4399(var7, var10.field2868[var2] < 0);
            }

            if (var10.field2868[var2] < 0) {
               var7.field2900.method641(-1);
            }

            if (var7.field2887 >= 0) {
               class240 var8 = this.field2843[var1][var7.field2887];
               if (var8 != null && var8.field2896 < 0) {
                  this.field2842[var1][var8.field2893] = null;
                  var8.field2896 = 0;
               }

               this.field2843[var1][var7.field2887] = var7;
            }

            this.field2849.field2876.method5187(var7);
            this.field2842[var1][var2] = var7;
         }
      }
   }

   void method4420() {
      this.method4417(-1);
      this.method4418(-1);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.field2829[var2] = this.field2823[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.field2831[var2] = this.field2823[var2] & -128;
      }

   }

   void method4441(int var1, int var2) {
      if (var2 != this.field2829[var1]) {
         this.field2829[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.field2843[var1][var4] = null;
         }
      }

   }

   protected synchronized void vmethod4573(int[] var1, int var2, int var3) {
      if (this.field2844.method4558()) {
         int var4 = this.field2844.field2853 * this.field2824 / class281.field3633;

         do {
            long var5 = (long)var4 * (long)var3 + this.field2848;
            if (this.field2850 - var5 >= 0L) {
               this.field2848 = var5;
               break;
            }

            int var7 = (int)((this.field2850 - this.field2848 + (long)var4 - 1L) / (long)var4);
            this.field2848 += (long)var7 * (long)var4;
            this.field2849.vmethod4573(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method4433();
         } while(this.field2844.method4558());
      }

      this.field2849.vmethod4573(var1, var2, var3);
   }

   protected synchronized void vmethod4574(int var1) {
      if (this.field2844.method4558()) {
         int var2 = this.field2844.field2853 * this.field2824 / class281.field3633;

         do {
            long var3 = this.field2848 + (long)var2 * (long)var1;
            if (this.field2850 - var3 >= 0L) {
               this.field2848 = var3;
               break;
            }

            int var5 = (int)((this.field2850 - this.field2848 + (long)var2 - 1L) / (long)var2);
            this.field2848 += (long)var2 * (long)var5;
            this.field2849.vmethod4574(var5);
            var1 -= var5;
            this.method4433();
         } while(this.field2844.method4558());
      }

      this.field2849.vmethod4574(var1);
   }

   void method4415(int var1, int var2) {
   }

   void method4416(int var1, int var2) {
      this.field2832[var1] = var2;
   }

   int method4502(class240 var1) {
      int var3 = (var1.field2892 * var1.field2891 >> 12) + var1.field2882;
      var3 += (this.field2832[var1.field2902] - 8192) * this.field2838[var1.field2902] >> 12;
      class233 var4 = var1.field2885;
      int var5;
      if (var4.field2810 > 0 && (var4.field2804 > 0 || this.field2833[var1.field2902] > 0)) {
         var5 = var4.field2804 << 2;
         int var6 = var4.field2812 << 1;
         if (var1.field2886 < var6) {
            var5 = var5 * var1.field2886 / var6;
         }

         var5 += this.field2833[var1.field2902] >> 7;
         double var7 = Math.sin(0.01227184630308513D * (double)(var1.field2894 & 511));
         var3 += (int)(var7 * (double)var5);
      }

      var5 = (int)((double)(var1.field2884.field163 * 256) * Math.pow(2.0D, (double)var3 * 3.255208333333333E-4D) / (double)class281.field3633 + 0.5D);
      return var5 < 1 ? 1 : var5;
   }

   protected synchronized class30 vmethod4576() {
      return null;
   }

   synchronized boolean method4402(class239 var1, class276 var2, class27 var3, int var4) {
      var1.method4599();
      boolean var6 = true;
      int[] var7 = null;
      if (var4 > 0) {
         var7 = new int[]{var4};
      }

      for(class350 var8 = (class350)var1.field2881.method6317(); var8 != null; var8 = (class350)var1.field2881.method6320()) {
         int var9 = (int)var8.field3965;
         class237 var10 = (class237)this.field2827.method6327((long)var9);
         if (var10 == null) {
            var10 = class83.method1994(var2, var9);
            if (var10 == null) {
               var6 = false;
               continue;
            }

            this.field2827.method6318(var10, (long)var9);
         }

         if (!var10.method4562(var3, var8.field3961, var7)) {
            var6 = false;
         }
      }

      if (var6) {
         var1.method4596();
      }

      return var6;
   }

   boolean method4434(class240 var1) {
      if (var1.field2900 == null) {
         if (var1.field2896 >= 0) {
            var1.method6014();
            if (var1.field2887 > 0 && var1 == this.field2843[var1.field2902][var1.field2887]) {
               this.field2843[var1.field2902][var1.field2887] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void method4421(int var1) {
      if ((this.field2830[var1] & 2) != 0) {
         for(class240 var3 = (class240)this.field2849.field2876.method5202(); var3 != null; var3 = (class240)this.field2849.field2876.method5193()) {
            if (var3.field2902 == var1 && this.field2842[var1][var3.field2893] == null && var3.field2896 < 0) {
               var3.field2896 = 0;
            }
         }
      }

   }

   public int method4401() {
      return this.field2826;
   }

   void method4492(int var1) {
      if ((this.field2830[var1] & 4) != 0) {
         for(class240 var3 = (class240)this.field2849.field2876.method5202(); var3 != null; var3 = (class240)this.field2849.field2876.method5193()) {
            if (var3.field2902 == var1) {
               var3.field2898 = 0;
            }
         }
      }

   }

   void method4423(int var1) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if (var3 == 128) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method4413(var4, var5, var6);
      } else if (var3 == 144) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var6 > 0) {
            this.method4462(var4, var5, var6);
         } else {
            this.method4413(var4, var5, 64);
         }

      } else if (var3 == 160) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method4414(var4, var5, var6);
      } else if (var3 == 176) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var5 == 0) {
            this.field2831[var4] = (var6 << 14) + (this.field2831[var4] & -2080769);
         }

         if (var5 == 32) {
            this.field2831[var4] = (var6 << 7) + (this.field2831[var4] & -16257);
         }

         if (var5 == 1) {
            this.field2833[var4] = (var6 << 7) + (this.field2833[var4] & -16257);
         }

         if (var5 == 33) {
            this.field2833[var4] = var6 + (this.field2833[var4] & -128);
         }

         if (var5 == 5) {
            this.field2834[var4] = (var6 << 7) + (this.field2834[var4] & -16257);
         }

         if (var5 == 37) {
            this.field2834[var4] = var6 + (this.field2834[var4] & -128);
         }

         if (var5 == 7) {
            this.field2851[var4] = (var6 << 7) + (this.field2851[var4] & -16257);
         }

         if (var5 == 39) {
            this.field2851[var4] = var6 + (this.field2851[var4] & -128);
         }

         if (var5 == 10) {
            this.field2825[var4] = (var6 << 7) + (this.field2825[var4] & -16257);
         }

         if (var5 == 42) {
            this.field2825[var4] = var6 + (this.field2825[var4] & -128);
         }

         if (var5 == 11) {
            this.field2828[var4] = (var6 << 7) + (this.field2828[var4] & -16257);
         }

         if (var5 == 43) {
            this.field2828[var4] = var6 + (this.field2828[var4] & -128);
         }

         int[] var10000;
         if (var5 == 64) {
            if (var6 >= 64) {
               var10000 = this.field2830;
               var10000[var4] |= 1;
            } else {
               var10000 = this.field2830;
               var10000[var4] &= -2;
            }
         }

         if (var5 == 65) {
            if (var6 >= 64) {
               var10000 = this.field2830;
               var10000[var4] |= 2;
            } else {
               this.method4421(var4);
               var10000 = this.field2830;
               var10000[var4] &= -3;
            }
         }

         if (var5 == 99) {
            this.field2837[var4] = (var6 << 7) + (this.field2837[var4] & 127);
         }

         if (var5 == 98) {
            this.field2837[var4] = (this.field2837[var4] & 16256) + var6;
         }

         if (var5 == 101) {
            this.field2837[var4] = (var6 << 7) + (this.field2837[var4] & 127) + 16384;
         }

         if (var5 == 100) {
            this.field2837[var4] = (this.field2837[var4] & 16256) + var6 + 16384;
         }

         if (var5 == 120) {
            this.method4417(var4);
         }

         if (var5 == 121) {
            this.method4418(var4);
         }

         if (var5 == 123) {
            this.method4429(var4);
         }

         int var7;
         if (var5 == 6) {
            var7 = this.field2837[var4];
            if (var7 == 16384) {
               this.field2838[var4] = (var6 << 7) + (this.field2838[var4] & -16257);
            }
         }

         if (var5 == 38) {
            var7 = this.field2837[var4];
            if (var7 == 16384) {
               this.field2838[var4] = var6 + (this.field2838[var4] & -128);
            }
         }

         if (var5 == 16) {
            this.field2839[var4] = (var6 << 7) + (this.field2839[var4] & -16257);
         }

         if (var5 == 48) {
            this.field2839[var4] = var6 + (this.field2839[var4] & -128);
         }

         if (var5 == 81) {
            if (var6 >= 64) {
               var10000 = this.field2830;
               var10000[var4] |= 4;
            } else {
               this.method4492(var4);
               var10000 = this.field2830;
               var10000[var4] &= -5;
            }
         }

         if (var5 == 17) {
            this.method4424(var4, (var6 << 7) + (this.field2840[var4] & -16257));
         }

         if (var5 == 49) {
            this.method4424(var4, var6 + (this.field2840[var4] & -128));
         }

      } else if (var3 == 192) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method4441(var4, var5 + this.field2831[var4]);
      } else if (var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method4415(var4, var5);
      } else if (var3 == 224) {
         var4 = var1 & 15;
         var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method4416(var4, var5);
      } else {
         var3 = var1 & 255;
         if (var3 == 255) {
            this.method4420();
         }
      }
   }

   public synchronized boolean method4410() {
      return this.field2844.method4558();
   }

   synchronized void method4457() {
      for(class237 var2 = (class237)this.field2827.method6317(); var2 != null; var2 = (class237)this.field2827.method6320()) {
         var2.method4561();
      }

   }

   public synchronized void method4404() {
      for(class237 var2 = (class237)this.field2827.method6317(); var2 != null; var2 = (class237)this.field2827.method6320()) {
         var2.method6014();
      }

   }

   boolean method4435(class240 var1, int[] var2, int var3, int var4) {
      var1.field2901 = class281.field3633 / 100;
      if (var1.field2896 < 0 || var1.field2900 != null && !var1.field2900.method623()) {
         int var6 = var1.field2892;
         if (var6 > 0) {
            var6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2834[var1.field2902]) + 0.5D);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.field2892 = var6;
         }

         var1.field2900.method568(this.method4502(var1));
         class233 var7 = var1.field2885;
         boolean var8 = false;
         ++var1.field2886;
         var1.field2894 += var7.field2810;
         double var9 = (double)((var1.field2893 - 60 << 8) + (var1.field2891 * var1.field2892 >> 12)) * 5.086263020833333E-6D;
         if (var7.field2806 > 0) {
            if (var7.field2809 > 0) {
               var1.field2883 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2809 * var9) + 0.5D);
            } else {
               var1.field2883 += 128;
            }
         }

         if (var7.field2808 != null) {
            if (var7.field2807 > 0) {
               var1.field2899 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2807 * var9) + 0.5D);
            } else {
               var1.field2899 += 128;
            }

            while(var1.field2895 < var7.field2808.length - 2 && var1.field2899 > (var7.field2808[var1.field2895 + 2] & 255) << 8) {
               var1.field2895 += 2;
            }

            if (var7.field2808.length - 2 == var1.field2895 && var7.field2808[var1.field2895 + 1] == 0) {
               var8 = true;
            }
         }

         if (var1.field2896 >= 0 && var7.field2811 != null && (this.field2830[var1.field2902] & 1) == 0 && (var1.field2887 < 0 || var1 != this.field2843[var1.field2902][var1.field2887])) {
            if (var7.field2805 > 0) {
               var1.field2896 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2805 * var9) + 0.5D);
            } else {
               var1.field2896 += 128;
            }

            while(var1.field2897 < var7.field2811.length - 2 && var1.field2896 > (var7.field2811[var1.field2897 + 2] & 255) << 8) {
               var1.field2897 += 2;
            }

            if (var7.field2811.length - 2 == var1.field2897) {
               var8 = true;
            }
         }

         if (var8) {
            var1.field2900.method567(var1.field2901);
            if (var2 != null) {
               var1.field2900.vmethod4573(var2, var3, var4);
            } else {
               var1.field2900.vmethod4574(var4);
            }

            if (var1.field2900.method571()) {
               this.field2849.field2877.method372(var1.field2900);
            }

            var1.method4613();
            if (var1.field2896 >= 0) {
               var1.method6014();
               if (var1.field2887 > 0 && var1 == this.field2843[var1.field2902][var1.field2887]) {
                  this.field2843[var1.field2902][var1.field2887] = null;
               }
            }

            return true;
         } else {
            var1.field2900.method566(var1.field2901, this.method4426(var1), this.method4427(var1));
            return false;
         }
      } else {
         var1.method4613();
         var1.method6014();
         if (var1.field2887 > 0 && var1 == this.field2843[var1.field2902][var1.field2887]) {
            this.field2843[var1.field2902][var1.field2887] = null;
         }

         return true;
      }
   }

   public synchronized void method4400(int var1) {
      this.field2826 = var1;
   }

   protected synchronized class30 vmethod4569() {
      return this.field2849;
   }

   void method4424(int var1, int var2) {
      this.field2840[var1] = var2;
      this.field2841[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
   }

   synchronized void method4405(class239 var1, boolean var2) {
      this.method4406();
      this.field2844.method4508(var1.field2880);
      this.field2845 = var2;
      this.field2848 = 0L;
      int var4 = this.field2844.method4511();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field2844.method4520(var5);
         this.field2844.method4515(var5);
         this.field2844.method4513(var5);
      }

      this.field2836 = this.field2844.method4530();
      this.field2847 = this.field2844.field2856[this.field2836];
      this.field2850 = this.field2844.method4517(this.field2847);
   }

   void method4433() {
      int var2 = this.field2836;
      int var3 = this.field2847;

      long var4;
      for(var4 = this.field2850; var3 == this.field2847; var4 = this.field2844.method4517(var3)) {
         while(var3 == this.field2844.field2856[var2]) {
            this.field2844.method4520(var2);
            int var6 = this.field2844.method4516(var2);
            if (var6 == 1) {
               this.field2844.method4533();
               this.field2844.method4513(var2);
               if (this.field2844.method4557()) {
                  if (!this.field2845 || var3 == 0) {
                     this.method4420();
                     this.field2844.method4509();
                     return;
                  }

                  this.field2844.method4522(var4);
               }
               break;
            }

            if ((var6 & 128) != 0) {
               this.method4423(var6);
            }

            this.field2844.method4515(var2);
            this.field2844.method4513(var2);
         }

         var2 = this.field2844.method4530();
         var3 = this.field2844.field2856[var2];
      }

      this.field2836 = var2;
      this.field2847 = var3;
      this.field2850 = var4;
   }

   void method4399(class240 var1, boolean var2) {
      int var4 = var1.field2884.field164.length;
      int var5;
      if (var2 && var1.field2884.field167) {
         int var6 = var4 + var4 - var1.field2884.field165;
         var5 = (int)((long)this.field2839[var1.field2902] * (long)var6 >> 6);
         var4 <<= 8;
         if (var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.field2900.method563(true);
         }
      } else {
         var5 = (int)((long)this.field2839[var1.field2902] * (long)var4 >> 6);
      }

      var1.field2900.method562(var5);
   }

   protected synchronized int vmethod4589() {
      return 0;
   }

   int method4426(class240 var1) {
      class233 var3 = var1.field2885;
      int var4 = this.field2851[var1.field2902] * this.field2828[var1.field2902] + 4096 >> 13;
      var4 = var4 * var4 + 16384 >> 15;
      var4 = var4 * var1.field2888 + 16384 >> 15;
      var4 = var4 * this.field2826 + 128 >> 8;
      if (var3.field2806 > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2883 * (double)var3.field2806) + 0.5D);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if (var3.field2808 != null) {
         var5 = var1.field2899;
         var6 = var3.field2808[var1.field2895 + 1];
         if (var1.field2895 < var3.field2808.length - 2) {
            var7 = (var3.field2808[var1.field2895] & 255) << 8;
            var8 = (var3.field2808[var1.field2895 + 2] & 255) << 8;
            var6 += (var3.field2808[var1.field2895 + 3] - var6) * (var5 - var7) / (var8 - var7);
         }

         var4 = var6 * var4 + 32 >> 6;
      }

      if (var1.field2896 > 0 && var3.field2811 != null) {
         var5 = var1.field2896;
         var6 = var3.field2811[var1.field2897 + 1];
         if (var1.field2897 < var3.field2811.length - 2) {
            var7 = (var3.field2811[var1.field2897] & 255) << 8;
            var8 = (var3.field2811[var1.field2897 + 2] & 255) << 8;
            var6 += (var5 - var7) * (var3.field2811[var1.field2897 + 3] - var6) / (var8 - var7);
         }

         var4 = var4 * var6 + 32 >> 6;
      }

      return var4;
   }

   int method4427(class240 var1) {
      int var3 = this.field2825[var1.field2902];
      return var3 < 8192 ? var3 * var1.field2889 + 32 >> 6 : 16384 - ((128 - var1.field2889) * (16384 - var3) + 32 >> 6);
   }

   void method4429(int var1) {
      for(class240 var3 = (class240)this.field2849.field2876.method5202(); var3 != null; var3 = (class240)this.field2849.field2876.method5193()) {
         if ((var1 < 0 || var3.field2902 == var1) && var3.field2896 < 0) {
            this.field2842[var3.field2902][var3.field2893] = null;
            var3.field2896 = 0;
         }
      }

   }

   public synchronized void method4408(int var1, int var2) {
      this.method4409(var1, var2);
   }
}
