public class class159 {
   int field1880;
   int field1884;
   int field1886;
   int field1887;
   public int[][] field1888;

   public class159(int var1, int var2) {
      this.field1884 = 0;
      this.field1887 = 0;
      this.field1886 = var1;
      this.field1880 = var2;
      this.field1888 = new int[this.field1886][this.field1880];
      this.method3101();
   }

   void method3109(int var1, int var2, int var3) {
      int[] var10000 = this.field1888[var1];
      var10000[var2] &= ~var3;
   }

   void method3106(int var1, int var2, int var3) {
      int[] var10000 = this.field1888[var1];
      var10000[var2] |= var3;
   }

   public void method3101() {
      for(int var2 = 0; var2 < this.field1886; ++var2) {
         for(int var3 = 0; var3 < this.field1880; ++var3) {
            if (var2 != 0 && var3 != 0 && var2 < this.field1886 - 5 && var3 < this.field1880 - 5) {
               this.field1888[var2][var3] = 16777216;
            } else {
               this.field1888[var2][var3] = 16777215;
            }
         }
      }

   }

   public void method3107(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field1884;
      var2 -= this.field1887;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method3109(var1, var2, 128);
            this.method3109(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method3109(var1, var2, 2);
            this.method3109(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method3109(var1, var2, 8);
            this.method3109(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method3109(var1, var2, 32);
            this.method3109(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method3109(var1, var2, 1);
            this.method3109(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method3109(var1, var2, 4);
            this.method3109(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method3109(var1, var2, 16);
            this.method3109(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method3109(var1, var2, 64);
            this.method3109(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method3109(var1, var2, 130);
            this.method3109(var1 - 1, var2, 8);
            this.method3109(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method3109(var1, var2, 10);
            this.method3109(var1, var2 + 1, 32);
            this.method3109(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method3109(var1, var2, 40);
            this.method3109(var1 + 1, var2, 128);
            this.method3109(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method3109(var1, var2, 160);
            this.method3109(var1, var2 - 1, 2);
            this.method3109(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method3109(var1, var2, 65536);
               this.method3109(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method3109(var1, var2, 1024);
               this.method3109(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method3109(var1, var2, 4096);
               this.method3109(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method3109(var1, var2, 16384);
               this.method3109(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method3109(var1, var2, 512);
               this.method3109(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method3109(var1, var2, 2048);
               this.method3109(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method3109(var1, var2, 8192);
               this.method3109(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method3109(var1, var2, 32768);
               this.method3109(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method3109(var1, var2, 66560);
               this.method3109(var1 - 1, var2, 4096);
               this.method3109(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method3109(var1, var2, 5120);
               this.method3109(var1, var2 + 1, 16384);
               this.method3109(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method3109(var1, var2, 20480);
               this.method3109(var1 + 1, var2, 65536);
               this.method3109(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method3109(var1, var2, 81920);
               this.method3109(var1, var2 - 1, 1024);
               this.method3109(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void method3131(int var1, int var2) {
      var1 -= this.field1884;
      var2 -= this.field1887;
      int[] var10000 = this.field1888[var1];
      var10000[var2] &= -262145;
   }

   public void method3125(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var8 = 256;
      if (var6) {
         var8 += 131072;
      }

      var1 -= this.field1884;
      var2 -= this.field1887;
      int var9;
      if (var5 == 1 || var5 == 3) {
         var9 = var3;
         var3 = var4;
         var4 = var9;
      }

      for(var9 = var1; var9 < var3 + var1; ++var9) {
         if (var9 >= 0 && var9 < this.field1886) {
            for(int var10 = var2; var10 < var2 + var4; ++var10) {
               if (var10 >= 0 && var10 < this.field1880) {
                  this.method3109(var9, var10, var8);
               }
            }
         }
      }

   }

   public void method3127(int var1, int var2) {
      var1 -= this.field1884;
      var2 -= this.field1887;
      int[] var10000 = this.field1888[var1];
      var10000[var2] |= 262144;
   }

   public void method3133(int var1, int var2, int var3, int var4, boolean var5) {
      int var7 = 256;
      if (var5) {
         var7 += 131072;
      }

      var1 -= this.field1884;
      var2 -= this.field1887;

      for(int var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < this.field1886) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.field1880) {
                  this.method3106(var8, var9, var7);
               }
            }
         }
      }

   }

   public void method3102(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field1884;
      var2 -= this.field1887;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method3106(var1, var2, 128);
            this.method3106(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method3106(var1, var2, 2);
            this.method3106(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method3106(var1, var2, 8);
            this.method3106(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method3106(var1, var2, 32);
            this.method3106(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method3106(var1, var2, 1);
            this.method3106(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method3106(var1, var2, 4);
            this.method3106(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method3106(var1, var2, 16);
            this.method3106(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method3106(var1, var2, 64);
            this.method3106(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method3106(var1, var2, 130);
            this.method3106(var1 - 1, var2, 8);
            this.method3106(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method3106(var1, var2, 10);
            this.method3106(var1, var2 + 1, 32);
            this.method3106(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method3106(var1, var2, 40);
            this.method3106(var1 + 1, var2, 128);
            this.method3106(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method3106(var1, var2, 160);
            this.method3106(var1, var2 - 1, 2);
            this.method3106(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method3106(var1, var2, 65536);
               this.method3106(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method3106(var1, var2, 1024);
               this.method3106(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method3106(var1, var2, 4096);
               this.method3106(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method3106(var1, var2, 16384);
               this.method3106(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method3106(var1, var2, 512);
               this.method3106(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method3106(var1, var2, 2048);
               this.method3106(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method3106(var1, var2, 8192);
               this.method3106(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method3106(var1, var2, 32768);
               this.method3106(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method3106(var1, var2, 66560);
               this.method3106(var1 - 1, var2, 4096);
               this.method3106(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method3106(var1, var2, 5120);
               this.method3106(var1, var2 + 1, 16384);
               this.method3106(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method3106(var1, var2, 20480);
               this.method3106(var1 + 1, var2, 65536);
               this.method3106(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method3106(var1, var2, 81920);
               this.method3106(var1, var2 - 1, 1024);
               this.method3106(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void method3100(int var1, int var2) {
      var1 -= this.field1884;
      var2 -= this.field1887;
      int[] var10000 = this.field1888[var1];
      var10000[var2] |= 2097152;
   }

   static final int method3135() {
      return client.field544 * -286331153 - 1;
   }

   public static class228 method3136() {
      return class228.field2686 == 0 ? new class228() : class228.field2688[--class228.field2686];
   }
}
