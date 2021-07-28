import java.util.HashMap;

public class class359 {
   class276 field4080;
   class276 field4081;
   HashMap field4082;

   public class359(class276 var1, class276 var2) {
      this.field4081 = var1;
      this.field4080 = var2;
      this.field4082 = new HashMap();
   }

   public HashMap method6275(class360[] var1) {
      HashMap var3 = new HashMap();
      class360[] var4 = var1;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class360 var6 = var4[var5];
         if (this.field4082.containsKey(var6)) {
            var3.put(var6, this.field4082.get(var6));
         } else {
            class301 var7 = class229.method4352(this.field4081, this.field4080, var6.field4089, "");
            if (var7 != null) {
               this.field4082.put(var6, var7);
               var3.put(var6, var7);
            }
         }
      }

      return var3;
   }

   static final void method6279(int var0, int var1, int var2, int var3, int var4) {
      long var6 = class165.field1924.method3927(var0, var1, var2);
      int var8;
      int var9;
      int var10;
      int var11;
      int var15;
      int var27;
      if (var6 != 0L) {
         var8 = class165.field1924.method3931(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = var3;
         boolean var13 = 0L != var6;
         if (var13) {
            boolean var14 = (int)(var6 >>> 16 & 1L) == 1;
            var13 = !var14;
         }

         if (var13) {
            var11 = var4;
         }

         int[] var20 = class376.field4166.field4279;
         var27 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var15 = class78.method1904(var6);
         class155 var16 = class123.method2465(var15);
         if (var16.field1763 != -1) {
            class396 var17 = class275.field3574[var16.field1763];
            if (var17 != null) {
               int var18 = (var16.field1749 * 4 - var17.field4262) / 2;
               int var19 = (var16.field1750 * 4 - var17.field4263) / 2;
               var17.method6969(var1 * 4 + var18 + 48, var19 + (104 - var2 - var16.field1750) * 4 + 48);
            }
         } else {
            if (var10 == 0 || var10 == 2) {
               if (var9 == 0) {
                  var20[var27] = var11;
                  var20[var27 + 512] = var11;
                  var20[var27 + 1024] = var11;
                  var20[var27 + 1536] = var11;
               } else if (var9 == 1) {
                  var20[var27] = var11;
                  var20[var27 + 1] = var11;
                  var20[var27 + 2] = var11;
                  var20[var27 + 3] = var11;
               } else if (var9 == 2) {
                  var20[var27 + 3] = var11;
                  var20[var27 + 512 + 3] = var11;
                  var20[var27 + 1024 + 3] = var11;
                  var20[var27 + 1536 + 3] = var11;
               } else if (var9 == 3) {
                  var20[var27 + 1536] = var11;
                  var20[var27 + 1536 + 1] = var11;
                  var20[var27 + 1536 + 2] = var11;
                  var20[var27 + 1536 + 3] = var11;
               }
            }

            if (var10 == 3) {
               if (var9 == 0) {
                  var20[var27] = var11;
               } else if (var9 == 1) {
                  var20[var27 + 3] = var11;
               } else if (var9 == 2) {
                  var20[var27 + 1536 + 3] = var11;
               } else if (var9 == 3) {
                  var20[var27 + 1536] = var11;
               }
            }

            if (var10 == 2) {
               if (var9 == 3) {
                  var20[var27] = var11;
                  var20[var27 + 512] = var11;
                  var20[var27 + 1024] = var11;
                  var20[var27 + 1536] = var11;
               } else if (var9 == 0) {
                  var20[var27] = var11;
                  var20[var27 + 1] = var11;
                  var20[var27 + 2] = var11;
                  var20[var27 + 3] = var11;
               } else if (var9 == 1) {
                  var20[var27 + 3] = var11;
                  var20[var27 + 512 + 3] = var11;
                  var20[var27 + 1024 + 3] = var11;
                  var20[var27 + 1536 + 3] = var11;
               } else if (var9 == 2) {
                  var20[var27 + 1536] = var11;
                  var20[var27 + 1536 + 1] = var11;
                  var20[var27 + 1536 + 2] = var11;
                  var20[var27 + 1536 + 3] = var11;
               }
            }
         }
      }

      var6 = class165.field1924.method3929(var0, var1, var2);
      if (var6 != 0L) {
         var8 = class165.field1924.method3931(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = class78.method1904(var6);
         class155 var21 = class123.method2465(var11);
         if (var21.field1763 != -1) {
            class396 var29 = class275.field3574[var21.field1763];
            if (var29 != null) {
               var27 = (var21.field1749 * 4 - var29.field4262) / 2;
               var15 = (var21.field1750 * 4 - var29.field4263) / 2;
               var29.method6969(var1 * 4 + var27 + 48, (104 - var2 - var21.field1750) * 4 + var15 + 48);
            }
         } else if (var10 == 9) {
            int var26 = 15658734;
            boolean var28 = 0L != var6;
            if (var28) {
               boolean var24 = (int)(var6 >>> 16 & 1L) == 1;
               var28 = !var24;
            }

            if (var28) {
               var26 = 15597568;
            }

            int[] var25 = class376.field4166.field4279;
            int var30 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if (var9 != 0 && var9 != 2) {
               var25[var30] = var26;
               var25[var30 + 1 + 512] = var26;
               var25[var30 + 1024 + 2] = var26;
               var25[var30 + 1536 + 3] = var26;
            } else {
               var25[var30 + 1536] = var26;
               var25[var30 + 1 + 1024] = var26;
               var25[var30 + 512 + 2] = var26;
               var25[var30 + 3] = var26;
            }
         }
      }

      var6 = class165.field1924.method4032(var0, var1, var2);
      if (var6 != 0L) {
         var8 = class78.method1904(var6);
         class155 var22 = class123.method2465(var8);
         if (var22.field1763 != -1) {
            class396 var23 = class275.field3574[var22.field1763];
            if (var23 != null) {
               var11 = (var22.field1749 * 4 - var23.field4262) / 2;
               int var12 = (var22.field1750 * 4 - var23.field4263) / 2;
               var23.method6969(var1 * 4 + var11 + 48, var12 + (104 - var2 - var22.field1750) * 4 + 48);
            }
         }
      }

   }

   static int method6274(int var0, class58 var1, boolean var2) {
      int var4;
      if (var0 == 5504) {
         class50.field745 -= 2;
         var4 = class50.field746[class50.field745];
         int var5 = class50.field746[class50.field745 + 1];
         if (!client.field614) {
            client.field475 = var4;
            client.field444 = var5;
         }

         return 1;
      } else if (var0 == 5505) {
         class50.field746[++class50.field745 - 1] = client.field475;
         return 1;
      } else if (var0 == 5506) {
         class50.field746[++class50.field745 - 1] = client.field444;
         return 1;
      } else if (var0 == 5530) {
         var4 = class50.field746[--class50.field745];
         if (var4 < 0) {
            var4 = 0;
         }

         client.field482 = var4;
         return 1;
      } else if (var0 == 5531) {
         class50.field746[++class50.field745 - 1] = client.field482;
         return 1;
      } else {
         return 2;
      }
   }
}
