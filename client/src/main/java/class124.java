import java.io.IOException;

public class class124 {
   static class401 field1440;

   public static int method2467(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   static final void method2471() {
      client.field609 = client.field592;
   }

   public static void startJS5RequestCycle(class329 var0, boolean var1) {
      if (class277.field3613 != null) {
         try {
            class277.field3613.vmethod5858();
         } catch (Exception var9) {
         }

         class277.field3613 = null;
      }

      class277.field3613 = var0;
      Buffer var3;
      if (class277.field3613 != null) {
         try {
            var3 = new Buffer(4);
            var3.writeByte(var1 ? 2 : 3);
            var3.method6723(0);
            class277.field3613.write(var3.payload, 0, 4);
         } catch (IOException var8) {
            try {
               class277.field3613.vmethod5858();
            } catch (Exception var7) {
            }

            ++class277.field3604;
            class277.field3613 = null;
         }
      }

      class277.field3607.field4181 = 0;
      class277.field3594 = null;
      class93.field1247 = null;
      class277.field3608 = 0;

      while(true) {
         class275 var10 = (class275)class277.field3599.method6317();
         if (var10 == null) {
            while(true) {
               var10 = (class275)class277.field3610.method6317();
               if (var10 == null) {
                  if (class277.field3612 != 0) {
                     try {
                        var3 = new Buffer(4);
                        var3.writeByte(4);
                        var3.writeByte(class277.field3612);
                        var3.method6734(0);
                        class277.field3613.write(var3.payload, 0, 4);
                     } catch (IOException var6) {
                        try {
                           class277.field3613.vmethod5858();
                        } catch (Exception var5) {
                        }

                        ++class277.field3604;
                        class277.field3613 = null;
                     }
                  }

                  class277.field3595 = 0;
                  class277.field3596 = class86.currentTime();
                  return;
               }

               class277.field3601.method5175(var10);
               class277.field3614.method6318(var10, var10.field3965);
               ++class277.field3603;
               --class277.field3605;
            }
         }

         class277.field3597.method6318(var10, var10.field3965);
         ++class277.field3598;
         --class277.field3606;
      }
   }

   public static final class397 method2469(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var7 = ((long)var4 << 40) + ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var3 << 42);
      class397 var9;
      if (!var5) {
         var9 = (class397)class156.field1836.method4306(var7);
         if (var9 != null) {
            return var9;
         }
      }

      class156 var10 = class10.method105(var0);
      if (var1 > 1 && var10.field1823 != null) {
         int var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if (var1 >= var10.field1824[var12] && var10.field1824[var12] != 0) {
               var11 = var10.field1823[var12];
            }
         }

         if (var11 != -1) {
            var10 = class10.method105(var11);
         }
      }

      class206 var20 = var10.method3014(1);
      if (var20 == null) {
         return null;
      } else {
         class397 var21 = null;
         if (var10.field1788 != -1) {
            var21 = method2469(var10.field1826, 10, 1, 0, 0, true);
            if (var21 == null) {
               return null;
            }
         } else if (var10.field1785 != -1) {
            var21 = method2469(var10.field1828, var1, var2, var3, 0, false);
            if (var21 == null) {
               return null;
            }
         } else if (var10.field1819 != -1) {
            var21 = method2469(var10.field1837, var1, 0, 0, 0, false);
            if (var21 == null) {
               return null;
            }
         }

         int[] var13 = class393.field4249;
         int var14 = class393.field4244;
         int var15 = class393.field4245;
         int[] var16 = new int[4];
         class393.method6874(var16);
         var9 = new class397(36, 32);
         class393.method6927(var9.field4279, 36, 32);
         class393.method6876();
         class197.method3819();
         class197.method3822(16, 16);
         class197.field2249 = false;
         if (var10.field1819 != -1) {
            var21.method7024(0, 0);
         }

         int var17 = var10.field1799;
         if (var5) {
            var17 = (int)(1.5D * (double)var17);
         } else if (var2 == 2) {
            var17 = (int)(1.04D * (double)var17);
         }

         int var18 = var17 * class197.field2265[var10.field1800] >> 16;
         int var19 = var17 * class197.field2272[var10.field1800] >> 16;
         var20.method4137();
         var20.method4187(0, var10.field1821, var10.field1802, var10.field1800, var10.field1803, var20.field2345 / 2 + var18 + var10.field1804, var19 + var10.field1804);
         if (var10.field1785 != -1) {
            var21.method7024(0, 0);
         }

         if (var2 >= 1) {
            var9.method6995(1);
         }

         if (var2 >= 2) {
            var9.method6995(16777215);
         }

         if (var3 != 0) {
            var9.method6996(var3);
         }

         class393.method6927(var9.field4279, 36, 32);
         if (var10.field1788 != -1) {
            var21.method7024(0, 0);
         }

         if (var4 == 1 || var4 == 2 && var10.field1805 == 1) {
            class63.field927.method5372(class249.method4746(var1), 0, 9, 16776960, 1);
         }

         if (!var5) {
            class156.field1836.method4308(var9, var7);
         }

         class393.method6927(var13, var14, var15);
         class393.method6875(var16);
         class197.method3819();
         class197.field2249 = true;
         return var9;
      }
   }

   static final void method2468(class248 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (client.field454) {
         client.field415 = 32;
      } else {
         client.field415 = 0;
      }

      client.field454 = false;
      int var8;
      if (class19.field140 == 1 || !class310.field3776 && class19.field140 == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field2967 -= 4;
            class80.method1934(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.field2967 += 4;
            class80.method1934(var0);
         } else if (var5 >= var1 - client.field415 && var5 < client.field415 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var8 = var3 * (var3 - 32) / var4;
            if (var8 < 8) {
               var8 = 8;
            }

            int var9 = var6 - var2 - 16 - var8 / 2;
            int var10 = var3 - 32 - var8;
            var0.field2967 = var9 * (var4 - var3) / var10;
            class80.method1934(var0);
            client.field454 = true;
         }
      }

      if (client.field656 != 0) {
         var8 = var0.field2972;
         if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.field2967 += client.field656 * 45;
            class80.method1934(var0);
         }
      }

   }

   public static int method2466(int var0, int var1, int var2) {
      int var4 = class118.method2393(var2 - var1 + 1);
      var4 <<= var1;
      return var0 & ~var4;
   }
}
