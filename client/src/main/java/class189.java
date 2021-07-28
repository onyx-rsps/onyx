public class class189 {
   byte[][][] field2128;
   int field2127;

   class189(int var1) {
      this.field2127 = var1;
   }

   void method3678() {
      byte[] var2 = new byte[this.field2127 * this.field2127];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[0][0] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[0][1] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[0][2] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[0][3] = var2;
   }

   int method3675(int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   void method3679() {
      byte[] var2 = new byte[this.field2127 * this.field2127];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[1][0] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var3 >= 0 && var3 < var2.length) {
               if (var5 >= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            } else {
               ++var3;
            }
         }
      }

      this.field2128[1][1] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[1][2] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[1][3] = var2;
   }

   int method3697(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   void method3681() {
      byte[] var2 = new byte[this.field2127 * this.field2127];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[2][0] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[2][1] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[2][2] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[2][3] = var2;
   }

   void method3685() {
      byte[] var2 = new byte[this.field2127 * this.field2127];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[3][0] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[3][1] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[3][2] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[3][3] = var2;
   }

   void method3682() {
      byte[] var2 = new byte[this.field2127 * this.field2127];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[4][0] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[4][1] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[4][2] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var3 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2128[4][3] = var2;
   }

   void method3683() {
      byte[] var2 = new byte[this.field2127 * this.field2127];
      boolean var3 = false;
      var2 = new byte[this.field2127 * this.field2127];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 <= this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[5][0] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var6 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var4 <= this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[5][1] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var6 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 >= this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[5][2] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var6 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var4 >= this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[5][3] = var2;
   }

   void method3709() {
      byte[] var2 = new byte[this.field2127 * this.field2127];
      boolean var3 = false;
      var2 = new byte[this.field2127 * this.field2127];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 <= var4 - this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[6][0] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var6 = 0;

      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 <= var4 - this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[6][1] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var6 = 0;

      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[6][2] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var6 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[6][3] = var2;
   }

   void method3710() {
      byte[] var2 = new byte[this.field2127 * this.field2127];
      boolean var3 = false;
      var2 = new byte[this.field2127 * this.field2127];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 >= var4 - this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[7][0] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var6 = 0;

      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2127; ++var5) {
            if (var5 >= var4 - this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[7][1] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var6 = 0;

      for(var4 = this.field2127 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[7][2] = var2;
      var2 = new byte[this.field2127 * this.field2127];
      var6 = 0;

      for(var4 = 0; var4 < this.field2127; ++var4) {
         for(var5 = this.field2127 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field2127 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2128[7][3] = var2;
   }

   void method3677() {
      if (this.field2128 == null) {
         this.field2128 = new byte[8][4][];
         this.method3678();
         this.method3679();
         this.method3681();
         this.method3685();
         this.method3682();
         this.method3683();
         this.method3709();
         this.method3710();
      }
   }

   void method3684(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.field2127 != 0 && this.field2128 != null) {
         var8 = this.method3675(var8, var7);
         var7 = this.method3697(var7);
         class393.method6883(var1, var2, var5, var6, var3, var4, this.field2128[var7 - 1][var8], this.field2127, true);
      }
   }
}
