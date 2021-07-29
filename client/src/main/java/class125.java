import java.io.IOException;

public class class125 {
   static class402 field1441;

   public static int method2245(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   public static void method2248(class330 var0, boolean var1) {
      if (JS5Worker.connection != null) {
         try {
            JS5Worker.connection.method5279();
         } catch (Exception var9) {
         }

         JS5Worker.connection = null;
      }

      JS5Worker.connection = var0;
      Buffer var3;
      if (null != JS5Worker.connection) {
         try {
            var3 = new Buffer(4);
            var3.writeByte(var1 ? 2 : 3);
            var3.writeMedium(0);
            JS5Worker.connection.write(var3.payload, 0, 4);
         } catch (IOException var8) {
            try {
               JS5Worker.connection.method5279();
            } catch (Exception var7) {
            }

            ++JS5Worker.field3605;
            JS5Worker.connection = null;
         }
      }

      JS5Worker.field3608.offset = 0;
      JS5Worker.field3595 = null;
      class94.field1248 = null;
      JS5Worker.field3609 = 0;

      while(true) {
         CacheBuffer var10 = (CacheBuffer) JS5Worker.pendingPriorityReceived.first();
         if (var10 == null) {
            while(true) {
               var10 = (CacheBuffer) JS5Worker.field3611.first();
               if (var10 == null) {
                  if (JS5Worker.field3613 != 0) {
                     try {
                        var3 = new Buffer(4);
                        var3.writeByte(4);
                        var3.writeByte(JS5Worker.field3613);
                        var3.method6122(0);
                        JS5Worker.connection.write(var3.payload, 0, 4);
                     } catch (IOException var6) {
                        try {
                           JS5Worker.connection.method5279();
                        } catch (Exception var5) {
                        }

                        ++JS5Worker.field3605;
                        JS5Worker.connection = null;
                     }
                  }

                  JS5Worker.latency = 0;
                  JS5Worker.lastAttemptTime = Clock.now();
                  return;
               }

               JS5Worker.field3602.method4660(var10);
               JS5Worker.field3615.put(var10, var10.key);
               ++JS5Worker.pendingCount;
               --JS5Worker.pendingResponseCount;
            }
         }

         JS5Worker.pendingPriority.put(var10, var10.key);
         ++JS5Worker.pendingPriorityCount;
         --JS5Worker.pendingPriorityResponseCount;
      }
   }

   public static int method2244(int var0, int var1, int var2) {
      int var4 = class119.method2189(1 + (var2 - var1));
      var4 <<= var1;
      return var0 & ~var4;
   }

   public static final class398 method2247(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (-1 == var1) {
         var4 = 0;
      } else if (2 == var4 && var1 != 1) {
         var4 = 1;
      }

      long var7 = ((long)var4 << 40) + ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var3 << 42);
      class398 var9;
      if (!var5) {
         var9 = (class398)class157.field1837.method3880(var7);
         if (null != var9) {
            return var9;
         }
      }

      class157 var10 = class11.method93(var0);
      if (var1 > 1 && var10.field1824 != null) {
         int var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if (var1 >= var10.field1825[var12] && 0 != var10.field1825[var12]) {
               var11 = var10.field1824[var12];
            }
         }

         if (var11 != -1) {
            var10 = class11.method93(var11);
         }
      }

      class207 var20 = var10.method2721(1);
      if (null == var20) {
         return null;
      } else {
         class398 var21 = null;
         if (-1 != var10.field1789) {
            var21 = method2247(var10.field1827, 10, 1, 0, 0, true);
            if (null == var21) {
               return null;
            }
         } else if (var10.field1786 != -1) {
            var21 = method2247(var10.field1829, var1, var2, var3, 0, false);
            if (null == var21) {
               return null;
            }
         } else if (var10.field1820 != -1) {
            var21 = method2247(var10.field1838, var1, 0, 0, 0, false);
            if (var21 == null) {
               return null;
            }
         }

         int[] var13 = class394.field4250;
         int var14 = class394.field4245;
         int var15 = class394.field4246;
         int[] var16 = new int[4];
         class394.method6259(var16);
         var9 = new class398(36, 32);
         class394.method6312(var9.field4280, 36, 32);
         class394.method6261();
         class198.method3415();
         class198.method3418(16, 16);
         class198.field2250 = false;
         if (var10.field1820 != -1) {
            var21.method6404(0, 0);
         }

         int var17 = var10.field1800;
         if (var5) {
            var17 = (int)(1.5D * (double)var17);
         } else if (var2 == 2) {
            var17 = (int)(1.04D * (double)var17);
         }

         int var18 = var17 * class198.field2266[var10.field1801] >> 16;
         int var19 = class198.field2273[var10.field1801] * var17 >> 16;
         var20.method3721();
         var20.method3769(0, var10.field1822, var10.field1803, var10.field1801, var10.field1804, var10.field1805 + var18 + var20.field2346 / 2, var10.field1805 + var19);
         if (var10.field1786 != -1) {
            var21.method6404(0, 0);
         }

         if (var2 >= 1) {
            var9.method6375(1);
         }

         if (var2 >= 2) {
            var9.method6375(16777215);
         }

         if (var3 != 0) {
            var9.method6376(var3);
         }

         class394.method6312(var9.field4280, 36, 32);
         if (var10.field1789 != -1) {
            var21.method6404(0, 0);
         }

         if (var4 == 1 || var4 == 2 && 1 == var10.field1806) {
            class64.field928.method4853(class250.method4283(var1), 0, 9, 16776960, 1);
         }

         if (!var5) {
            class157.field1837.method3882(var9, var7);
         }

         class394.method6312(var13, var14, var15);
         class394.method6260(var16);
         class198.method3415();
         class198.field2250 = true;
         return var9;
      }
   }

   static final void method2246(class249 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (client.field455) {
         client.field416 = 32;
      } else {
         client.field416 = 0;
      }

      client.field455 = false;
      int var8;
      if (class20.field141 == 1 || !class311.field3777 && class20.field141 == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < 16 + var2) {
            var0.field2968 -= 4;
            class81.method1869(var0);
         } else if (var5 >= var1 && var5 < 16 + var1 && var6 >= var2 + var3 - 16 && var6 < var2 + var3) {
            var0.field2968 += 4;
            class81.method1869(var0);
         } else if (var5 >= var1 - client.field416 && var5 < client.field416 + 16 + var1 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var8 = var3 * (var3 - 32) / var4;
            if (var8 < 8) {
               var8 = 8;
            }

            int var9 = var6 - var2 - 16 - var8 / 2;
            int var10 = var3 - 32 - var8;
            var0.field2968 = var9 * (var4 - var3) / var10;
            class81.method1869(var0);
            client.field455 = true;
         }
      }

      if (client.field657 != 0) {
         var8 = var0.field2973;
         if (var5 >= var1 - var8 && var6 >= var2 && var5 < 16 + var1 && var6 <= var3 + var2) {
            var0.field2968 += client.field657 * 45;
            class81.method1869(var0);
         }
      }

   }

   static final void method2249() {
      client.field610 = client.field593;
   }
}
