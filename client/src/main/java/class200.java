public abstract class class200 extends class348 {
   public int field2345;

   protected class200() {
      this.field2345 = 1000;
   }

   protected class206 vmethod4091() {
      return null;
   }

   void vmethod4151(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      class206 var11 = this.vmethod4091();
      if (var11 != null) {
         this.field2345 = var11.field2345;
         var11.vmethod4151(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   static void method4094(class383 var0, int var1) {
      boolean var3 = var0.method6505(1) == 1;
      if (var3) {
         class82.field1180[++class82.field1179 - 1] = var1;
      }

      int var4 = var0.method6505(2);
      class69 var5 = client.field523[var1];
      if (var4 == 0) {
         if (var3) {
            var5.field1003 = false;
         } else if (client.field664 == var1) {
            throw new RuntimeException();
         } else {
            class82.field1176[var1] = (var5.field998 << 28) + (class280.field3624 + var5.field1075[0] >> 13 << 14) + (class77.field1133 + var5.field1076[0] >> 13);
            if (var5.field1048 != -1) {
               class82.field1175[var1] = var5.field1048;
            } else {
               class82.field1175[var1] = var5.field1042;
            }

            class82.field1178[var1] = var5.field1046;
            client.field523[var1] = null;
            if (var0.method6505(1) != 0) {
               class102.method2172(var0, var1);
            }

         }
      } else {
         int var6;
         int var7;
         int var8;
         if (var4 == 1) {
            var6 = var0.method6505(3);
            var7 = var5.field1075[0];
            var8 = var5.field1076[0];
            if (var6 == 0) {
               --var7;
               --var8;
            } else if (var6 == 1) {
               --var8;
            } else if (var6 == 2) {
               ++var7;
               --var8;
            } else if (var6 == 3) {
               --var7;
            } else if (var6 == 4) {
               ++var7;
            } else if (var6 == 5) {
               --var7;
               ++var8;
            } else if (var6 == 6) {
               ++var8;
            } else if (var6 == 7) {
               ++var7;
               ++var8;
            }

            if (client.field664 != var1 || var5.field1068 >= 1536 && var5.field1058 >= 1536 && var5.field1068 < 11776 && var5.field1058 < 11776) {
               if (var3) {
                  var5.field1003 = true;
                  var5.field1004 = var7;
                  var5.field1005 = var8;
               } else {
                  var5.field1003 = false;
                  var5.method1761(var7, var8, class82.field1170[var1]);
               }
            } else {
               var5.method1771(var7, var8);
               var5.field1003 = false;
            }

         } else if (var4 == 2) {
            var6 = var0.method6505(4);
            var7 = var5.field1075[0];
            var8 = var5.field1076[0];
            if (var6 == 0) {
               var7 -= 2;
               var8 -= 2;
            } else if (var6 == 1) {
               --var7;
               var8 -= 2;
            } else if (var6 == 2) {
               var8 -= 2;
            } else if (var6 == 3) {
               ++var7;
               var8 -= 2;
            } else if (var6 == 4) {
               var7 += 2;
               var8 -= 2;
            } else if (var6 == 5) {
               var7 -= 2;
               --var8;
            } else if (var6 == 6) {
               var7 += 2;
               --var8;
            } else if (var6 == 7) {
               var7 -= 2;
            } else if (var6 == 8) {
               var7 += 2;
            } else if (var6 == 9) {
               var7 -= 2;
               ++var8;
            } else if (var6 == 10) {
               var7 += 2;
               ++var8;
            } else if (var6 == 11) {
               var7 -= 2;
               var8 += 2;
            } else if (var6 == 12) {
               --var7;
               var8 += 2;
            } else if (var6 == 13) {
               var8 += 2;
            } else if (var6 == 14) {
               ++var7;
               var8 += 2;
            } else if (var6 == 15) {
               var7 += 2;
               var8 += 2;
            }

            if (client.field664 != var1 || var5.field1068 >= 1536 && var5.field1058 >= 1536 && var5.field1068 < 11776 && var5.field1058 < 11776) {
               if (var3) {
                  var5.field1003 = true;
                  var5.field1004 = var7;
                  var5.field1005 = var8;
               } else {
                  var5.field1003 = false;
                  var5.method1761(var7, var8, class82.field1170[var1]);
               }
            } else {
               var5.method1771(var7, var8);
               var5.field1003 = false;
            }

         } else {
            var6 = var0.method6505(1);
            int var9;
            int var10;
            int var11;
            int var12;
            if (var6 == 0) {
               var7 = var0.method6505(12);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if (var10 > 15) {
                  var10 -= 32;
               }

               var11 = var9 + var5.field1075[0];
               var12 = var10 + var5.field1076[0];
               if (client.field664 != var1 || var5.field1068 >= 1536 && var5.field1058 >= 1536 && var5.field1068 < 11776 && var5.field1058 < 11776) {
                  if (var3) {
                     var5.field1003 = true;
                     var5.field1004 = var11;
                     var5.field1005 = var12;
                  } else {
                     var5.field1003 = false;
                     var5.method1761(var11, var12, class82.field1170[var1]);
                  }
               } else {
                  var5.method1771(var11, var12);
                  var5.field1003 = false;
               }

               var5.field998 = (byte)(var8 + var5.field998 & 3);
               if (client.field664 == var1) {
                  class284.field3651 = var5.field998;
               }

            } else {
               var7 = var0.method6505(30);
               var8 = var7 >> 28;
               var9 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
               var11 = (var9 + class280.field3624 + var5.field1075[0] & 16383) - class280.field3624;
               var12 = (var10 + class77.field1133 + var5.field1076[0] & 16383) - class77.field1133;
               if (client.field664 != var1 || var5.field1068 >= 1536 && var5.field1058 >= 1536 && var5.field1068 < 11776 && var5.field1058 < 11776) {
                  if (var3) {
                     var5.field1003 = true;
                     var5.field1004 = var11;
                     var5.field1005 = var12;
                  } else {
                     var5.field1003 = false;
                     var5.method1761(var11, var12, class82.field1170[var1]);
                  }
               } else {
                  var5.method1771(var11, var12);
                  var5.field1003 = false;
               }

               var5.field998 = (byte)(var8 + var5.field998 & 3);
               if (client.field664 == var1) {
                  class284.field3651 = var5.field998;
               }

            }
         }
      }
   }

   static final void method4089(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (client.field408 && var0 != class284.field3651) {
            return;
         }

         long var8 = 0L;
         boolean var10 = true;
         boolean var11 = false;
         boolean var12 = false;
         if (var1 == 0) {
            var8 = class165.field1924.method3927(var0, var2, var3);
         }

         if (var1 == 1) {
            var8 = class165.field1924.method3928(var0, var2, var3);
         }

         if (var1 == 2) {
            var8 = class165.field1924.method3929(var0, var2, var3);
         }

         if (var1 == 3) {
            var8 = class165.field1924.method4032(var0, var2, var3);
         }

         int var13;
         if (0L != var8) {
            var13 = class165.field1924.method3931(var0, var2, var3, var8);
            int var15 = class78.method1904(var8);
            int var16 = var13 & 31;
            int var17 = var13 >> 6 & 3;
            class155 var14;
            if (var1 == 0) {
               class165.field1924.method3918(var0, var2, var3);
               var14 = class123.method2465(var15);
               if (var14.field1751 != 0) {
                  client.field464[var0].method3107(var2, var3, var16, var17, var14.field1778);
               }
            }

            if (var1 == 1) {
               class165.field1924.method3919(var0, var2, var3);
            }

            if (var1 == 2) {
               class165.field1924.method3955(var0, var2, var3);
               var14 = class123.method2465(var15);
               if (var2 + var14.field1749 > 103 || var3 + var14.field1749 > 103 || var2 + var14.field1750 > 103 || var3 + var14.field1750 > 103) {
                  return;
               }

               if (var14.field1751 != 0) {
                  client.field464[var0].method3125(var2, var3, var14.field1749, var14.field1750, var17, var14.field1778);
               }
            }

            if (var1 == 3) {
               class165.field1924.method3921(var0, var2, var3);
               var14 = class123.method2465(var15);
               if (var14.field1751 == 1) {
                  client.field464[var0].method3131(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var13 = var0;
            if (var0 < 3 && (class61.field900[1][var2][var3] & 2) == 2) {
               var13 = var0 + 1;
            }

            class12.method120(var0, var13, var2, var3, var4, var5, var6, class165.field1924, client.field464[var0]);
         }
      }

   }
}
