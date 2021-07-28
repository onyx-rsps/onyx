public class class250 {
   static byte[][][] field3113;
   static int[] field3109;
   byte[] field3108;
   int[] field3110;
   int[] field3111;

   public class250(byte[] var1) {
      int var2 = var1.length;
      this.field3110 = new int[var2];
      this.field3108 = var1;
      int[] var3 = new int[33];
      this.field3111 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         byte var6 = var1[var5];
         if (var6 != 0) {
            int var7 = 1 << 32 - var6;
            int var8 = var3[var6];
            this.field3110[var5] = var8;
            int var9;
            int var10;
            int var11;
            int var12;
            if ((var8 & var7) != 0) {
               var9 = var3[var6 - 1];
            } else {
               var9 = var8 | var7;

               for(var10 = var6 - 1; var10 >= 1; --var10) {
                  var11 = var3[var10];
                  if (var11 != var8) {
                     break;
                  }

                  var12 = 1 << 32 - var10;
                  if ((var11 & var12) != 0) {
                     var3[var10] = var3[var10 - 1];
                     break;
                  }

                  var3[var10] = var11 | var12;
               }
            }

            var3[var6] = var9;

            for(var10 = var6 + 1; var10 <= 32; ++var10) {
               if (var8 == var3[var10]) {
                  var3[var10] = var9;
               }
            }

            var10 = 0;

            for(var11 = 0; var11 < var6; ++var11) {
               var12 = Integer.MIN_VALUE >>> var11;
               if ((var8 & var12) != 0) {
                  if (this.field3111[var10] == 0) {
                     this.field3111[var10] = var4;
                  }

                  var10 = this.field3111[var10];
               } else {
                  ++var10;
               }

               if (var10 >= this.field3111.length) {
                  int[] var13 = new int[this.field3111.length * 2];

                  for(int var14 = 0; var14 < this.field3111.length; ++var14) {
                     var13[var14] = this.field3111[var14];
                  }

                  this.field3111 = var13;
               }

               var12 >>>= 1;
            }

            this.field3111[var10] = ~var5;
            if (var10 >= var4) {
               var4 = var10 + 1;
            }
         }
      }

   }

   int method4751(byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if (var5 == 0) {
         return 0;
      } else {
         int var7 = 0;
         var5 += var4;
         int var8 = var2;

         while(true) {
            byte var9 = var1[var8];
            if (var9 < 0) {
               var7 = this.field3111[var7];
            } else {
               ++var7;
            }

            int var10;
            if ((var10 = this.field3111[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 64) != 0) {
               var7 = this.field3111[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3111[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 32) != 0) {
               var7 = this.field3111[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3111[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 16) != 0) {
               var7 = this.field3111[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3111[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 8) != 0) {
               var7 = this.field3111[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3111[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 4) != 0) {
               var7 = this.field3111[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3111[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 2) != 0) {
               var7 = this.field3111[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3111[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 1) != 0) {
               var7 = this.field3111[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3111[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            ++var8;
         }

         return var8 + 1 - var2;
      }
   }

   int method4752(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      int var7 = 0;
      int var8 = var5 << 3;

      for(var3 += var2; var2 < var3; ++var2) {
         int var9 = var1[var2] & 255;
         int var10 = this.field3110[var9];
         byte var11 = this.field3108[var9];
         if (var11 == 0) {
            throw new RuntimeException("" + var9);
         }

         int var12 = var8 >> 3;
         int var13 = var8 & 7;
         var7 &= -var13 >> 31;
         int var14 = (var11 + var13 - 1 >> 3) + var12;
         var13 += 24;
         var4[var12] = (byte)(var7 |= var10 >>> var13);
         if (var12 < var14) {
            ++var12;
            var13 -= 8;
            var4[var12] = (byte)(var7 = var10 >>> var13);
            if (var12 < var14) {
               ++var12;
               var13 -= 8;
               var4[var12] = (byte)(var7 = var10 >>> var13);
               if (var12 < var14) {
                  ++var12;
                  var13 -= 8;
                  var4[var12] = (byte)(var7 = var10 >>> var13);
                  if (var12 < var14) {
                     ++var12;
                     var13 -= 8;
                     var4[var12] = (byte)(var7 = var10 << -var13);
                  }
               }
            }
         }

         var8 += var11;
      }

      return (var8 + 7 >> 3) - var5;
   }

   public static boolean method4757(int var0) {
      if (class100.field1281[var0]) {
         return true;
      } else if (!class248.field2950.method4924(var0)) {
         return false;
      } else {
         int var2 = class248.field2950.method4946(var0);
         if (var2 == 0) {
            class100.field1281[var0] = true;
            return true;
         } else {
            if (class248.field3038[var0] == null) {
               class248.field3038[var0] = new class248[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (class248.field3038[var0][var3] == null) {
                  byte[] var4 = class248.field2950.method4920(var0, var3);
                  if (var4 != null) {
                     class248.field3038[var0][var3] = new class248();
                     class248.field3038[var0][var3].field2957 = var3 + (var0 << 16);
                     if (var4[0] == -1) {
                        class248.field3038[var0][var3].method4682(new class384(var4));
                     } else {
                        class248.field3038[var0][var3].method4681(new class384(var4));
                     }
                  }
               }
            }

            class100.field1281[var0] = true;
            return true;
         }
      }
   }

   static final void method4756() {
      class199.field2306 = false;
      client.field408 = false;
   }

   public static class289 method4750(class289[] var0, int var1) {
      class289[] var3 = var0;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class289 var5 = var3[var4];
         if (var1 == var5.vmethod6962()) {
            return var5;
         }
      }

      return null;
   }
}
