public class class114 {
   static int field1386;
   boolean field1360;
   boolean field1361;
   class362 field1384;
   int field1363;
   int field1364;
   int[] field1374;
   int[] field1375;
   long field1370;
   long[] field1365;
   long[] field1381;
   public boolean field1366;
   public boolean[] field1377;
   public byte field1359;
   public byte field1368;
   public byte field1369;
   public byte field1383;
   public byte[] field1373;
   public int field1371;
   public int field1378;
   public int field1379;
   public int field1380;
   public int[] field1376;
   public String field1367;
   public String[] field1362;
   public String[] field1372;

   public class114(class384 var1) {
      this.field1363 = 0;
      this.field1367 = null;
      this.field1364 = 0;
      this.field1378 = -1;
      this.field1379 = -1;
      this.method2305(var1);
   }

   void method2295(int var1) {
      if (var1 >= 0 && var1 < this.field1371) {
         --this.field1371;
         this.field1374 = null;
         if (this.field1371 == 0) {
            this.field1365 = null;
            this.field1372 = null;
            this.field1373 = null;
            this.field1375 = null;
            this.field1376 = null;
            this.field1377 = null;
            this.field1378 = -1;
            this.field1379 = -1;
         } else {
            System.arraycopy(this.field1373, var1 + 1, this.field1373, var1, this.field1371 - var1);
            System.arraycopy(this.field1375, var1 + 1, this.field1375, var1, this.field1371 - var1);
            System.arraycopy(this.field1376, var1 + 1, this.field1376, var1, this.field1371 - var1);
            System.arraycopy(this.field1377, var1 + 1, this.field1377, var1, this.field1371 - var1);
            if (this.field1365 != null) {
               System.arraycopy(this.field1365, var1 + 1, this.field1365, var1, this.field1371 - var1);
            }

            if (this.field1372 != null) {
               System.arraycopy(this.field1372, var1 + 1, this.field1372, var1, this.field1371 - var1);
            }

            this.method2296();
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method2298(int var1) {
      --this.field1380;
      if (this.field1380 == 0) {
         this.field1381 = null;
         this.field1362 = null;
      } else {
         if (this.field1381 != null) {
            System.arraycopy(this.field1381, var1 + 1, this.field1381, var1, this.field1380 - var1);
         }

         if (this.field1362 != null) {
            System.arraycopy(this.field1362, var1 + 1, this.field1362, var1, this.field1380 - var1);
         }
      }

   }

   boolean method2300(int var1) {
      if (this.field1378 != var1 && this.field1373[var1] != 126) {
         this.field1373[this.field1378] = 125;
         this.field1379 = this.field1378;
         this.field1373[var1] = 126;
         this.field1378 = var1;
         return true;
      } else {
         return false;
      }
   }

   void method2297(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.field1360) {
         throw new RuntimeException("");
      } else if (var3 != null != this.field1361) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field1381 == null || this.field1380 >= this.field1381.length) || var3 != null && (this.field1362 == null || this.field1380 >= this.field1362.length)) {
            this.method2289(this.field1380 + 5);
         }

         if (this.field1381 != null) {
            this.field1381[this.field1380] = var1;
         }

         if (this.field1362 != null) {
            this.field1362[this.field1380] = var3;
         }

         ++this.field1380;
      }
   }

   int method2299(int var1, byte var2) {
      if (var2 != 126 && var2 != 127) {
         if (this.field1378 != var1 || this.field1379 != -1 && this.field1373[this.field1379] >= 125) {
            if (this.field1373[var1] == var2) {
               return -1;
            } else {
               this.field1373[var1] = var2;
               this.method2296();
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   int method2301(int var1, boolean var2) {
      if (this.field1377[var1] == var2) {
         return -1;
      } else {
         this.field1377[var1] = var2;
         return var1;
      }
   }

   boolean method2303(int var1, int var2) {
      if (this.field1384 != null) {
         class353 var4 = this.field1384.method6297((long)var1);
         if (var4 != null) {
            if (var4 instanceof class352) {
               class352 var5 = (class352)var4;
               if (var2 == var5.field3963) {
                  return false;
               }

               var5.field3963 = var2;
               return true;
            }

            var4.method6014();
         }
      } else {
         this.field1384 = new class362(4);
      }

      this.field1384.method6308(new class352(var2), (long)var1);
      return true;
   }

   boolean method2309(int var1, String var2) {
      if (var2 == null) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.field1384 != null) {
         class353 var4 = this.field1384.method6297((long)var1);
         if (var4 != null) {
            if (var4 instanceof class349) {
               class349 var5 = (class349)var4;
               if (var5.field3960 instanceof String) {
                  if (var2.equals(var5.field3960)) {
                     return false;
                  }

                  var5.method6014();
                  this.field1384.method6308(new class349(var2), var5.field3965);
                  return true;
               }
            }

            var4.method6014();
         }
      } else {
         this.field1384 = new class362(4);
      }

      this.field1384.method6308(new class349(var2), (long)var1);
      return true;
   }

   boolean method2332(int var1, long var2) {
      if (this.field1384 != null) {
         class353 var4 = this.field1384.method6297((long)var1);
         if (var4 != null) {
            if (var4 instanceof class351) {
               class351 var5 = (class351)var4;
               if (var2 == var5.field3962) {
                  return false;
               }

               var5.field3962 = var2;
               return true;
            }

            var4.method6014();
         }
      } else {
         this.field1384 = new class362(4);
      }

      this.field1384.method6308(new class351(var2), (long)var1);
      return true;
   }

   void method2294(long var1, String var3, int var4) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.field1360) {
         throw new RuntimeException("");
      } else if (var3 != null != this.field1361) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field1365 == null || this.field1371 >= this.field1365.length) || var3 != null && (this.field1372 == null || this.field1371 >= this.field1372.length)) {
            this.method2288(this.field1371 + 5);
         }

         if (this.field1365 != null) {
            this.field1365[this.field1371] = var1;
         }

         if (this.field1372 != null) {
            this.field1372[this.field1371] = var3;
         }

         if (this.field1378 == -1) {
            this.field1378 = this.field1371;
            this.field1373[this.field1371] = 126;
         } else {
            this.field1373[this.field1371] = 0;
         }

         this.field1375[this.field1371] = 0;
         this.field1376[this.field1371] = var4;
         this.field1377[this.field1371] = false;
         ++this.field1371;
         this.field1374 = null;
      }
   }

   int method2302(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      int var9 = this.field1375[var1];
      if ((var9 & var8) == var2) {
         return -1;
      } else {
         var9 &= ~var8;
         this.field1375[var1] = var9 | var2;
         return var1;
      }
   }

   boolean method2304(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      if (this.field1384 != null) {
         class353 var9 = this.field1384.method6297((long)var1);
         if (var9 != null) {
            if (var9 instanceof class352) {
               class352 var10 = (class352)var9;
               if ((var10.field3963 & var8) == var2) {
                  return false;
               }

               var10.field3963 &= ~var8;
               var10.field3963 |= var2;
               return true;
            }

            var9.method6014();
         }
      } else {
         this.field1384 = new class362(4);
      }

      this.field1384.method6308(new class352(var2), (long)var1);
      return true;
   }

   public int method2290(String var1) {
      if (var1 != null && var1.length() != 0) {
         for(int var3 = 0; var3 < this.field1371; ++var3) {
            if (this.field1372[var3].equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   void method2296() {
      if (this.field1371 == 0) {
         this.field1378 = -1;
         this.field1379 = -1;
      } else {
         this.field1378 = -1;
         this.field1379 = -1;
         int var2 = 0;
         byte var3 = this.field1373[0];

         for(int var4 = 1; var4 < this.field1371; ++var4) {
            if (this.field1373[var4] > var3) {
               if (var3 == 125) {
                  this.field1379 = var2;
               }

               var2 = var4;
               var3 = this.field1373[var4];
            } else if (this.field1379 == -1 && this.field1373[var4] == 125) {
               this.field1379 = var4;
            }
         }

         this.field1378 = var2;
         if (this.field1378 != -1) {
            this.field1373[this.field1378] = 126;
         }

      }
   }

   void method2305(class384 var1) {
      int var3 = var1.method6560();
      if (var3 >= 1 && var3 <= 6) {
         int var4 = var1.method6560();
         if ((var4 & 1) != 0) {
            this.field1360 = true;
         }

         if ((var4 & 2) != 0) {
            this.field1361 = true;
         }

         if (!this.field1360) {
            this.field1365 = null;
            this.field1381 = null;
         }

         if (!this.field1361) {
            this.field1372 = null;
            this.field1362 = null;
         }

         this.field1363 = var1.method6784();
         this.field1364 = var1.method6784();
         if (var3 <= 3 && this.field1364 != 0) {
            this.field1364 += 16912800;
         }

         this.field1371 = var1.method6655();
         this.field1380 = var1.method6560();
         this.field1367 = var1.method6569();
         if (var3 >= 4) {
            var1.method6784();
         }

         this.field1366 = var1.method6560() == 1;
         this.field1359 = var1.method6561();
         this.field1368 = var1.method6561();
         this.field1369 = var1.method6561();
         this.field1383 = var1.method6561();
         int var5;
         if (this.field1371 > 0) {
            if (this.field1360 && (this.field1365 == null || this.field1365.length < this.field1371)) {
               this.field1365 = new long[this.field1371];
            }

            if (this.field1361 && (this.field1372 == null || this.field1372.length < this.field1371)) {
               this.field1372 = new String[this.field1371];
            }

            if (this.field1373 == null || this.field1373.length < this.field1371) {
               this.field1373 = new byte[this.field1371];
            }

            if (this.field1375 == null || this.field1375.length < this.field1371) {
               this.field1375 = new int[this.field1371];
            }

            if (this.field1376 == null || this.field1376.length < this.field1371) {
               this.field1376 = new int[this.field1371];
            }

            if (this.field1377 == null || this.field1377.length < this.field1371) {
               this.field1377 = new boolean[this.field1371];
            }

            for(var5 = 0; var5 < this.field1371; ++var5) {
               if (this.field1360) {
                  this.field1365[var5] = var1.method6566();
               }

               if (this.field1361) {
                  this.field1372[var5] = var1.method6568();
               }

               this.field1373[var5] = var1.method6561();
               if (var3 >= 2) {
                  this.field1375[var5] = var1.method6784();
               }

               if (var3 >= 5) {
                  this.field1376[var5] = var1.method6655();
               } else {
                  this.field1376[var5] = 0;
               }

               if (var3 >= 6) {
                  this.field1377[var5] = var1.method6560() == 1;
               } else {
                  this.field1377[var5] = false;
               }
            }

            this.method2296();
         }

         if (this.field1380 > 0) {
            if (this.field1360 && (this.field1381 == null || this.field1381.length < this.field1380)) {
               this.field1381 = new long[this.field1380];
            }

            if (this.field1361 && (this.field1362 == null || this.field1362.length < this.field1380)) {
               this.field1362 = new String[this.field1380];
            }

            for(var5 = 0; var5 < this.field1380; ++var5) {
               if (this.field1360) {
                  this.field1381[var5] = var1.method6566();
               }

               if (this.field1361) {
                  this.field1362[var5] = var1.method6568();
               }
            }
         }

         if (var3 >= 3) {
            var5 = var1.method6655();
            if (var5 > 0) {
               this.field1384 = new class362(var5 < 16 ? class26.method530(var5) : 16);

               while(var5-- > 0) {
                  int var6 = var1.method6784();
                  int var7 = var6 & 1073741823;
                  int var8 = var6 >>> 30;
                  if (var8 == 0) {
                     int var9 = var1.method6784();
                     this.field1384.method6308(new class352(var9), (long)var7);
                  } else if (var8 == 1) {
                     long var11 = var1.method6566();
                     this.field1384.method6308(new class351(var11), (long)var7);
                  } else if (var8 == 2) {
                     String var13 = var1.method6569();
                     this.field1384.method6308(new class349(var13), (long)var7);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var3);
      }
   }

   void method2289(int var1) {
      if (this.field1360) {
         if (this.field1381 != null) {
            System.arraycopy(this.field1381, 0, this.field1381 = new long[var1], 0, this.field1380);
         } else {
            this.field1381 = new long[var1];
         }
      }

      if (this.field1361) {
         if (this.field1362 != null) {
            System.arraycopy(this.field1362, 0, this.field1362 = new String[var1], 0, this.field1380);
         } else {
            this.field1362 = new String[var1];
         }
      }

   }

   void method2288(int var1) {
      if (this.field1360) {
         if (this.field1365 != null) {
            System.arraycopy(this.field1365, 0, this.field1365 = new long[var1], 0, this.field1371);
         } else {
            this.field1365 = new long[var1];
         }
      }

      if (this.field1361) {
         if (this.field1372 != null) {
            System.arraycopy(this.field1372, 0, this.field1372 = new String[var1], 0, this.field1371);
         } else {
            this.field1372 = new String[var1];
         }
      }

      if (this.field1373 != null) {
         System.arraycopy(this.field1373, 0, this.field1373 = new byte[var1], 0, this.field1371);
      } else {
         this.field1373 = new byte[var1];
      }

      if (this.field1375 != null) {
         System.arraycopy(this.field1375, 0, this.field1375 = new int[var1], 0, this.field1371);
      } else {
         this.field1375 = new int[var1];
      }

      if (this.field1376 != null) {
         System.arraycopy(this.field1376, 0, this.field1376 = new int[var1], 0, this.field1371);
      } else {
         this.field1376 = new int[var1];
      }

      if (this.field1377 != null) {
         System.arraycopy(this.field1377, 0, this.field1377 = new boolean[var1], 0, this.field1371);
      } else {
         this.field1377 = new boolean[var1];
      }

   }

   public Integer method2311(int var1) {
      if (this.field1384 == null) {
         return null;
      } else {
         class353 var3 = this.field1384.method6297((long)var1);
         return var3 != null && var3 instanceof class352 ? new Integer(((class352)var3).field3963) : null;
      }
   }

   public int[] method2292() {
      if (this.field1374 == null) {
         String[] var2 = new String[this.field1371];
         this.field1374 = new int[this.field1371];

         for(int var3 = 0; var3 < this.field1371; this.field1374[var3] = var3++) {
            var2[var3] = this.field1372[var3];
            if (var2[var3] != null) {
               var2[var3] = var2[var3].toLowerCase();
            }
         }

         class282.method5055(var2, this.field1374);
      }

      return this.field1374;
   }

   public int method2308(int var1, int var2, int var3) {
      int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
      return (this.field1375[var1] & var5) >>> var2;
   }

   public static boolean method2353(int var0) {
      return var0 >= class257.field3148.field3162 && var0 <= class257.field3142.field3162 || var0 == class257.field3159.field3162;
   }

   static void method2354() {
      class55.field799 = false;
      class55.field814.method7066(class55.field824, 0);
      class55.field802.method7066(class55.field824 + 382, 0);
      class88.field1228.method6969(class55.field824 + 382 - class88.field1228.field4262 / 2, 18);
   }

   public static boolean method2349(int var0) {
      return var0 >= 0 && var0 < 112 ? class10.field45[var0] : false;
   }
}
