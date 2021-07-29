public class class192 extends class200 {
   static int field2186;
   static int[] field2162;
   static int[] field2184;
   static int[] field2185;
   static int[] field2187;
   boolean field2178;
   byte field2163;
   byte[] field2158;
   byte[] field2159;
   byte[] field2165;
   byte[] field2168;
   byte[] field2173;
   class201[] field2188;
   class208[] field2151;
   class208[] field2175;
   int field2153;
   int field2161;
   int field2164;
   int field2176;
   int field2179;
   int field2180;
   int field2181;
   int field2182;
   int[] field2149;
   int[] field2150;
   int[] field2152;
   int[] field2154;
   int[] field2155;
   int[] field2156;
   int[] field2169;
   int[] field2170;
   int[][] field2171;
   int[][] field2172;
   short[] field2157;
   short[] field2160;
   short[] field2166;
   short[] field2167;
   short[] field2183;
   public short field2174;
   public short field2177;

   static {
      field2184 = new int[10000];
      field2185 = new int[10000];
      field2186 = 0;
      field2187 = class197.field2265;
      field2162 = class197.field2272;
   }

   class192() {
      this.field2176 = 0;
      this.field2153 = 0;
      this.field2163 = 0;
      this.field2178 = false;
   }

   public class192(class192[] var1, int var2) {
      this.field2176 = 0;
      this.field2153 = 0;
      this.field2163 = 0;
      this.field2178 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.field2176 = 0;
      this.field2153 = 0;
      this.field2164 = 0;
      this.field2163 = -1;

      int var9;
      class192 var10;
      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if (var10 != null) {
            this.field2176 += var10.field2176;
            this.field2153 += var10.field2153;
            this.field2164 += var10.field2164;
            if (var10.field2168 != null) {
               var4 = true;
            } else {
               if (this.field2163 == -1) {
                  this.field2163 = var10.field2163;
               }

               if (this.field2163 != var10.field2163) {
                  var4 = true;
               }
            }

            var3 |= var10.field2173 != null;
            var5 |= var10.field2159 != null;
            var6 |= var10.field2170 != null;
            var7 |= var10.field2157 != null;
            var8 |= var10.field2158 != null;
         }
      }

      this.field2150 = new int[this.field2176];
      this.field2149 = new int[this.field2176];
      this.field2152 = new int[this.field2176];
      this.field2169 = new int[this.field2176];
      this.field2154 = new int[this.field2153];
      this.field2155 = new int[this.field2153];
      this.field2156 = new int[this.field2153];
      if (var3) {
         this.field2173 = new byte[this.field2153];
      }

      if (var4) {
         this.field2168 = new byte[this.field2153];
      }

      if (var5) {
         this.field2159 = new byte[this.field2153];
      }

      if (var6) {
         this.field2170 = new int[this.field2153];
      }

      if (var7) {
         this.field2157 = new short[this.field2153];
      }

      if (var8) {
         this.field2158 = new byte[this.field2153];
      }

      this.field2183 = new short[this.field2153];
      if (this.field2164 > 0) {
         this.field2165 = new byte[this.field2164];
         this.field2166 = new short[this.field2164];
         this.field2167 = new short[this.field2164];
         this.field2160 = new short[this.field2164];
      }

      this.field2176 = 0;
      this.field2153 = 0;
      this.field2164 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if (var10 != null) {
            int var11;
            for(var11 = 0; var11 < var10.field2153; ++var11) {
               if (var3 && var10.field2173 != null) {
                  this.field2173[this.field2153] = var10.field2173[var11];
               }

               if (var4) {
                  if (var10.field2168 != null) {
                     this.field2168[this.field2153] = var10.field2168[var11];
                  } else {
                     this.field2168[this.field2153] = var10.field2163;
                  }
               }

               if (var5 && var10.field2159 != null) {
                  this.field2159[this.field2153] = var10.field2159[var11];
               }

               if (var6 && var10.field2170 != null) {
                  this.field2170[this.field2153] = var10.field2170[var11];
               }

               if (var7) {
                  if (var10.field2157 != null) {
                     this.field2157[this.field2153] = var10.field2157[var11];
                  } else {
                     this.field2157[this.field2153] = -1;
                  }
               }

               if (var8) {
                  if (var10.field2158 != null && var10.field2158[var11] != -1) {
                     this.field2158[this.field2153] = (byte)(this.field2164 + var10.field2158[var11]);
                  } else {
                     this.field2158[this.field2153] = -1;
                  }
               }

               this.field2183[this.field2153] = var10.field2183[var11];
               this.field2154[this.field2153] = this.method3758(var10, var10.field2154[var11]);
               this.field2155[this.field2153] = this.method3758(var10, var10.field2155[var11]);
               this.field2156[this.field2153] = this.method3758(var10, var10.field2156[var11]);
               ++this.field2153;
            }

            for(var11 = 0; var11 < var10.field2164; ++var11) {
               byte var12 = this.field2165[this.field2164] = var10.field2165[var11];
               if (var12 == 0) {
                  this.field2166[this.field2164] = (short)this.method3758(var10, var10.field2166[var11]);
                  this.field2167[this.field2164] = (short)this.method3758(var10, var10.field2167[var11]);
                  this.field2160[this.field2164] = (short)this.method3758(var10, var10.field2160[var11]);
               }

               ++this.field2164;
            }
         }
      }

   }

   class192(byte[] var1) {
      this.field2176 = 0;
      this.field2153 = 0;
      this.field2163 = 0;
      this.field2178 = false;
      if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method3735(var1);
      } else {
         this.method3722(var1);
      }

   }

   public class192(class192 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field2176 = 0;
      this.field2153 = 0;
      this.field2163 = 0;
      this.field2178 = false;
      this.field2176 = var1.field2176;
      this.field2153 = var1.field2153;
      this.field2164 = var1.field2164;
      int var6;
      if (var2) {
         this.field2150 = var1.field2150;
         this.field2149 = var1.field2149;
         this.field2152 = var1.field2152;
      } else {
         this.field2150 = new int[this.field2176];
         this.field2149 = new int[this.field2176];
         this.field2152 = new int[this.field2176];

         for(var6 = 0; var6 < this.field2176; ++var6) {
            this.field2150[var6] = var1.field2150[var6];
            this.field2149[var6] = var1.field2149[var6];
            this.field2152[var6] = var1.field2152[var6];
         }
      }

      if (var3) {
         this.field2183 = var1.field2183;
      } else {
         this.field2183 = new short[this.field2153];

         for(var6 = 0; var6 < this.field2153; ++var6) {
            this.field2183[var6] = var1.field2183[var6];
         }
      }

      if (!var4 && var1.field2157 != null) {
         this.field2157 = new short[this.field2153];

         for(var6 = 0; var6 < this.field2153; ++var6) {
            this.field2157[var6] = var1.field2157[var6];
         }
      } else {
         this.field2157 = var1.field2157;
      }

      this.field2159 = var1.field2159;
      this.field2154 = var1.field2154;
      this.field2155 = var1.field2155;
      this.field2156 = var1.field2156;
      this.field2173 = var1.field2173;
      this.field2168 = var1.field2168;
      this.field2158 = var1.field2158;
      this.field2163 = var1.field2163;
      this.field2165 = var1.field2165;
      this.field2166 = var1.field2166;
      this.field2167 = var1.field2167;
      this.field2160 = var1.field2160;
      this.field2169 = var1.field2169;
      this.field2170 = var1.field2170;
      this.field2171 = var1.field2171;
      this.field2172 = var1.field2172;
      this.field2151 = var1.field2151;
      this.field2188 = var1.field2188;
      this.field2175 = var1.field2175;
      this.field2174 = var1.field2174;
      this.field2177 = var1.field2177;
   }

   void method3753() {
      if (!this.field2178) {
         super.field2345 = 0;
         this.field2179 = 0;
         this.field2180 = 999999;
         this.field2181 = -999999;
         this.field2161 = -99999;
         this.field2182 = 99999;

         for(int var1 = 0; var1 < this.field2176; ++var1) {
            int var2 = this.field2150[var1];
            int var3 = this.field2149[var1];
            int var4 = this.field2152[var1];
            if (var2 < this.field2180) {
               this.field2180 = var2;
            }

            if (var2 > this.field2181) {
               this.field2181 = var2;
            }

            if (var4 < this.field2182) {
               this.field2182 = var4;
            }

            if (var4 > this.field2161) {
               this.field2161 = var4;
            }

            if (-var3 > super.field2345) {
               super.field2345 = -var3;
            }

            if (var3 > this.field2179) {
               this.field2179 = var3;
            }
         }

         this.field2178 = true;
      }
   }

   public void method3736() {
      if (this.field2151 == null) {
         this.field2151 = new class208[this.field2176];

         int var1;
         for(var1 = 0; var1 < this.field2176; ++var1) {
            this.field2151[var1] = new class208();
         }

         for(var1 = 0; var1 < this.field2153; ++var1) {
            int var2 = this.field2154[var1];
            int var3 = this.field2155[var1];
            int var4 = this.field2156[var1];
            int var5 = this.field2150[var3] - this.field2150[var2];
            int var6 = this.field2149[var3] - this.field2149[var2];
            int var7 = this.field2152[var3] - this.field2152[var2];
            int var8 = this.field2150[var4] - this.field2150[var2];
            int var9 = this.field2149[var4] - this.field2149[var2];
            int var10 = this.field2152[var4] - this.field2152[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.field2173 == null) {
               var15 = 0;
            } else {
               var15 = this.field2173[var1];
            }

            if (var15 == 0) {
               class208 var16 = this.field2151[var2];
               var16.field2495 += var11;
               var16.field2493 += var12;
               var16.field2494 += var13;
               ++var16.field2492;
               var16 = this.field2151[var3];
               var16.field2495 += var11;
               var16.field2493 += var12;
               var16.field2494 += var13;
               ++var16.field2492;
               var16 = this.field2151[var4];
               var16.field2495 += var11;
               var16.field2493 += var12;
               var16.field2494 += var13;
               ++var16.field2492;
            } else if (var15 == 1) {
               if (this.field2188 == null) {
                  this.field2188 = new class201[this.field2153];
               }

               class201 var17 = this.field2188[var1] = new class201();
               var17.field2346 = var11;
               var17.field2347 = var12;
               var17.field2348 = var13;
            }
         }

      }
   }

   void method3737() {
      this.field2151 = null;
      this.field2175 = null;
      this.field2188 = null;
      this.field2178 = false;
   }

   public class192 method3724() {
      class192 var1 = new class192();
      if (this.field2173 != null) {
         var1.field2173 = new byte[this.field2153];

         for(int var2 = 0; var2 < this.field2153; ++var2) {
            var1.field2173[var2] = this.field2173[var2];
         }
      }

      var1.field2176 = this.field2176;
      var1.field2153 = this.field2153;
      var1.field2164 = this.field2164;
      var1.field2150 = this.field2150;
      var1.field2149 = this.field2149;
      var1.field2152 = this.field2152;
      var1.field2154 = this.field2154;
      var1.field2155 = this.field2155;
      var1.field2156 = this.field2156;
      var1.field2168 = this.field2168;
      var1.field2159 = this.field2159;
      var1.field2158 = this.field2158;
      var1.field2183 = this.field2183;
      var1.field2157 = this.field2157;
      var1.field2163 = this.field2163;
      var1.field2165 = this.field2165;
      var1.field2166 = this.field2166;
      var1.field2167 = this.field2167;
      var1.field2160 = this.field2160;
      var1.field2169 = this.field2169;
      var1.field2170 = this.field2170;
      var1.field2171 = this.field2171;
      var1.field2172 = this.field2172;
      var1.field2151 = this.field2151;
      var1.field2188 = this.field2188;
      var1.field2174 = this.field2174;
      var1.field2177 = this.field2177;
      return var1;
   }

   public void method3766(short var1, short var2) {
      for(int var3 = 0; var3 < this.field2153; ++var3) {
         if (this.field2183[var3] == var1) {
            this.field2183[var3] = var2;
         }
      }

   }

   public void method3772(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2176; ++var4) {
         this.field2150[var4] = this.field2150[var4] * var1 / 128;
         this.field2149[var4] = var2 * this.field2149[var4] / 128;
         this.field2152[var4] = var3 * this.field2152[var4] / 128;
      }

      this.method3737();
   }

   void method3722(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.field4181 = (var1.length - 18) * 99;
      int var9 = var4.method6655();
      int var10 = var4.method6655();
      int var11 = var4.method6560();
      int var12 = var4.method6560();
      int var13 = var4.method6560();
      int var14 = var4.method6560();
      int var15 = var4.method6560();
      int var16 = var4.method6560();
      int var17 = var4.method6655();
      int var18 = var4.method6655();
      int var19 = var4.method6655();
      int var20 = var4.method6655();
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.field2176 = var9;
      this.field2153 = var10;
      this.field2164 = var11;
      this.field2150 = new int[var9];
      this.field2149 = new int[var9];
      this.field2152 = new int[var9];
      this.field2154 = new int[var10];
      this.field2155 = new int[var10];
      this.field2156 = new int[var10];
      if (var11 > 0) {
         this.field2165 = new byte[var11];
         this.field2166 = new short[var11];
         this.field2167 = new short[var11];
         this.field2160 = new short[var11];
      }

      if (var16 == 1) {
         this.field2169 = new int[var9];
      }

      if (var12 == 1) {
         this.field2173 = new byte[var10];
         this.field2158 = new byte[var10];
         this.field2157 = new short[var10];
      }

      if (var13 == 255) {
         this.field2168 = new byte[var10];
      } else {
         this.field2163 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2159 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2170 = new int[var10];
      }

      this.field2183 = new short[var10];
      var4.field4181 = var21 * 99;
      var5.field4181 = var32 * 99;
      var6.field4181 = var33 * 99;
      var7.field4181 = var45 * 99;
      var8.field4181 = var27 * 99;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.method6560();
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.method6573();
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.method6573();
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.method6573();
         }

         this.field2150[var38] = var35 + var40;
         this.field2149[var38] = var36 + var41;
         this.field2152[var38] = var37 + var42;
         var35 = this.field2150[var38];
         var36 = this.field2149[var38];
         var37 = this.field2152[var38];
         if (var16 == 1) {
            this.field2169[var38] = var8.method6560();
         }
      }

      var4.field4181 = var30 * 99;
      var5.field4181 = var26 * 99;
      var6.field4181 = var24 * 99;
      var7.field4181 = var28 * 99;
      var8.field4181 = var25 * 99;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field2183[var38] = (short)var4.method6655();
         if (var12 == 1) {
            var39 = var5.method6560();
            if ((var39 & 1) == 1) {
               this.field2173[var38] = 1;
               var2 = true;
            } else {
               this.field2173[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.field2158[var38] = (byte)(var39 >> 2);
               this.field2157[var38] = this.field2183[var38];
               this.field2183[var38] = 127;
               if (this.field2157[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field2158[var38] = -1;
               this.field2157[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.field2168[var38] = var6.method6561();
         }

         if (var14 == 1) {
            this.field2159[var38] = var7.method6561();
         }

         if (var15 == 1) {
            this.field2170[var38] = var8.method6560();
         }
      }

      var4.field4181 = var29 * 99;
      var5.field4181 = var23 * 99;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.method6560();
         if (var43 == 1) {
            var38 = var4.method6573() + var41;
            var39 = var4.method6573() + var38;
            var40 = var4.method6573() + var39;
            var41 = var40;
            this.field2154[var42] = var38;
            this.field2155[var42] = var39;
            this.field2156[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.method6573() + var41;
            var41 = var40;
            this.field2154[var42] = var38;
            this.field2155[var42] = var39;
            this.field2156[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.method6573() + var41;
            var41 = var40;
            this.field2154[var42] = var38;
            this.field2155[var42] = var39;
            this.field2156[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method6573() + var41;
            var41 = var40;
            this.field2154[var42] = var38;
            this.field2155[var42] = var44;
            this.field2156[var42] = var40;
         }
      }

      var4.field4181 = var31 * 99;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field2165[var42] = 0;
         this.field2166[var42] = (short)var4.method6655();
         this.field2167[var42] = (short)var4.method6655();
         this.field2160[var42] = (short)var4.method6655();
      }

      if (this.field2158 != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field2158[var43] & 255;
            if (var44 != 255) {
               if (this.field2154[var43] == (this.field2166[var44] & '\uffff') && this.field2155[var43] == (this.field2167[var44] & '\uffff') && this.field2156[var43] == (this.field2160[var44] & '\uffff')) {
                  this.field2158[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.field2158 = null;
         }
      }

      if (!var3) {
         this.field2157 = null;
      }

      if (!var2) {
         this.field2173 = null;
      }

   }

   public void method3733(short var1, short var2) {
      if (this.field2157 != null) {
         for(int var3 = 0; var3 < this.field2153; ++var3) {
            if (this.field2157[var3] == var1) {
               this.field2157[var3] = var2;
            }
         }

      }
   }

   public final class206 method3740(int var1, int var2, int var3, int var4, int var5) {
      this.method3736();
      int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
      int var7 = var6 * var2 >> 8;
      class206 var8 = new class206();
      var8.field2408 = new int[this.field2153];
      var8.field2416 = new int[this.field2153];
      var8.field2417 = new int[this.field2153];
      if (this.field2164 > 0 && this.field2158 != null) {
         int[] var9 = new int[this.field2164];

         int var10;
         for(var10 = 0; var10 < this.field2153; ++var10) {
            if (this.field2158[var10] != -1) {
               ++var9[this.field2158[var10] & 255];
            }
         }

         var8.field2423 = 0;

         for(var10 = 0; var10 < this.field2164; ++var10) {
            if (var9[var10] > 0 && this.field2165[var10] == 0) {
               ++var8.field2423;
            }
         }

         var8.field2453 = new int[var8.field2423];
         var8.field2425 = new int[var8.field2423];
         var8.field2426 = new int[var8.field2423];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field2164; ++var11) {
            if (var9[var11] > 0 && this.field2165[var11] == 0) {
               var8.field2453[var10] = this.field2166[var11] & '\uffff';
               var8.field2425[var10] = this.field2167[var11] & '\uffff';
               var8.field2426[var10] = this.field2160[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field2440 = new byte[this.field2153];

         for(var11 = 0; var11 < this.field2153; ++var11) {
            if (this.field2158[var11] != -1) {
               var8.field2440[var11] = (byte)var9[this.field2158[var11] & 255];
            } else {
               var8.field2440[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field2153; ++var16) {
         byte var17;
         if (this.field2173 == null) {
            var17 = 0;
         } else {
            var17 = this.field2173[var16];
         }

         byte var18;
         if (this.field2159 == null) {
            var18 = 0;
         } else {
            var18 = this.field2159[var16];
         }

         short var12;
         if (this.field2157 == null) {
            var12 = -1;
         } else {
            var12 = this.field2157[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         class208 var13;
         int var14;
         class201 var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.field2188[var16];
                  var14 = (var4 * var19.field2347 + var5 * var19.field2348 + var3 * var19.field2346) / (var7 / 2 + var7) + var1;
                  var8.field2408[var16] = method3765(this.field2183[var16] & '\uffff', var14);
                  var8.field2417[var16] = -1;
               } else if (var17 == 3) {
                  var8.field2408[var16] = 128;
                  var8.field2417[var16] = -1;
               } else {
                  var8.field2417[var16] = -2;
               }
            } else {
               int var15 = this.field2183[var16] & '\uffff';
               if (this.field2175 != null && this.field2175[this.field2154[var16]] != null) {
                  var13 = this.field2175[this.field2154[var16]];
               } else {
                  var13 = this.field2151[this.field2154[var16]];
               }

               var14 = (var4 * var13.field2493 + var5 * var13.field2494 + var3 * var13.field2495) / (var7 * var13.field2492) + var1;
               var8.field2408[var16] = method3765(var15, var14);
               if (this.field2175 != null && this.field2175[this.field2155[var16]] != null) {
                  var13 = this.field2175[this.field2155[var16]];
               } else {
                  var13 = this.field2151[this.field2155[var16]];
               }

               var14 = (var4 * var13.field2493 + var5 * var13.field2494 + var3 * var13.field2495) / (var7 * var13.field2492) + var1;
               var8.field2416[var16] = method3765(var15, var14);
               if (this.field2175 != null && this.field2175[this.field2156[var16]] != null) {
                  var13 = this.field2175[this.field2156[var16]];
               } else {
                  var13 = this.field2151[this.field2156[var16]];
               }

               var14 = (var4 * var13.field2493 + var5 * var13.field2494 + var3 * var13.field2495) / (var7 * var13.field2492) + var1;
               var8.field2417[var16] = method3765(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.field2188[var16];
               var14 = (var4 * var19.field2347 + var5 * var19.field2348 + var3 * var19.field2346) / (var7 / 2 + var7) + var1;
               var8.field2408[var16] = method3742(var14);
               var8.field2417[var16] = -1;
            } else {
               var8.field2417[var16] = -2;
            }
         } else {
            if (this.field2175 != null && this.field2175[this.field2154[var16]] != null) {
               var13 = this.field2175[this.field2154[var16]];
            } else {
               var13 = this.field2151[this.field2154[var16]];
            }

            var14 = (var4 * var13.field2493 + var5 * var13.field2494 + var3 * var13.field2495) / (var7 * var13.field2492) + var1;
            var8.field2408[var16] = method3742(var14);
            if (this.field2175 != null && this.field2175[this.field2155[var16]] != null) {
               var13 = this.field2175[this.field2155[var16]];
            } else {
               var13 = this.field2151[this.field2155[var16]];
            }

            var14 = (var4 * var13.field2493 + var5 * var13.field2494 + var3 * var13.field2495) / (var7 * var13.field2492) + var1;
            var8.field2416[var16] = method3742(var14);
            if (this.field2175 != null && this.field2175[this.field2156[var16]] != null) {
               var13 = this.field2175[this.field2156[var16]];
            } else {
               var13 = this.field2151[this.field2156[var16]];
            }

            var14 = (var4 * var13.field2493 + var5 * var13.field2494 + var3 * var13.field2495) / (var7 * var13.field2492) + var1;
            var8.field2417[var16] = method3742(var14);
         }
      }

      this.method3726();
      var8.field2442 = this.field2176;
      var8.field2424 = this.field2150;
      var8.field2409 = this.field2149;
      var8.field2457 = this.field2152;
      var8.field2411 = this.field2153;
      var8.field2428 = this.field2154;
      var8.field2465 = this.field2155;
      var8.field2414 = this.field2156;
      var8.field2418 = this.field2168;
      var8.field2419 = this.field2159;
      var8.field2441 = this.field2163;
      var8.field2450 = this.field2171;
      var8.field2444 = this.field2172;
      var8.field2421 = this.field2157;
      return var8;
   }

   void method3735(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.field4181 = (var1.length - 23) * 99;
      int var9 = var2.method6655();
      int var10 = var2.method6655();
      int var11 = var2.method6560();
      int var12 = var2.method6560();
      int var13 = var2.method6560();
      int var14 = var2.method6560();
      int var15 = var2.method6560();
      int var16 = var2.method6560();
      int var17 = var2.method6560();
      int var18 = var2.method6655();
      int var19 = var2.method6655();
      int var20 = var2.method6655();
      int var21 = var2.method6655();
      int var22 = var2.method6655();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.field2165 = new byte[var11];
         var2.field4181 = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field2165[var26] = var2.method6561();
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field2176 = var9;
      this.field2153 = var10;
      this.field2164 = var11;
      this.field2150 = new int[var9];
      this.field2149 = new int[var9];
      this.field2152 = new int[var9];
      this.field2154 = new int[var10];
      this.field2155 = new int[var10];
      this.field2156 = new int[var10];
      if (var17 == 1) {
         this.field2169 = new int[var9];
      }

      if (var12 == 1) {
         this.field2173 = new byte[var10];
      }

      if (var13 == 255) {
         this.field2168 = new byte[var10];
      } else {
         this.field2163 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2159 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2170 = new int[var10];
      }

      if (var16 == 1) {
         this.field2157 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field2158 = new byte[var10];
      }

      this.field2183 = new short[var10];
      if (var11 > 0) {
         this.field2166 = new short[var11];
         this.field2167 = new short[var11];
         this.field2160 = new short[var11];
      }

      var2.field4181 = var11 * 99;
      var3.field4181 = var38 * 99;
      var4.field4181 = var39 * 99;
      var5.field4181 = var40 * 99;
      var6.field4181 = var32 * 99;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.method6560();
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.method6573();
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.method6573();
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.method6573();
         }

         this.field2150[var51] = var48 + var53;
         this.field2149[var51] = var49 + var54;
         this.field2152[var51] = var50 + var55;
         var48 = this.field2150[var51];
         var49 = this.field2149[var51];
         var50 = this.field2152[var51];
         if (var17 == 1) {
            this.field2169[var51] = var6.method6560();
         }
      }

      var2.field4181 = var37 * 99;
      var3.field4181 = var28 * 99;
      var4.field4181 = var30 * 99;
      var5.field4181 = var33 * 99;
      var6.field4181 = var31 * 99;
      var7.field4181 = var35 * 99;
      var8.field4181 = var36 * 99;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field2183[var51] = (short)var2.method6655();
         if (var12 == 1) {
            this.field2173[var51] = var3.method6561();
         }

         if (var13 == 255) {
            this.field2168[var51] = var4.method6561();
         }

         if (var14 == 1) {
            this.field2159[var51] = var5.method6561();
         }

         if (var15 == 1) {
            this.field2170[var51] = var6.method6560();
         }

         if (var16 == 1) {
            this.field2157[var51] = (short)(var7.method6655() - 1);
         }

         if (this.field2158 != null && this.field2157[var51] != -1) {
            this.field2158[var51] = (byte)(var8.method6560() - 1);
         }
      }

      var2.field4181 = var34 * 99;
      var3.field4181 = var29 * 99;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.method6560();
         if (var56 == 1) {
            var51 = var2.method6573() + var54;
            var52 = var2.method6573() + var51;
            var53 = var2.method6573() + var52;
            var54 = var53;
            this.field2154[var55] = var51;
            this.field2155[var55] = var52;
            this.field2156[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.method6573() + var54;
            var54 = var53;
            this.field2154[var55] = var51;
            this.field2155[var55] = var52;
            this.field2156[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.method6573() + var54;
            var54 = var53;
            this.field2154[var55] = var51;
            this.field2155[var55] = var52;
            this.field2156[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method6573() + var54;
            var54 = var53;
            this.field2154[var55] = var51;
            this.field2155[var55] = var57;
            this.field2156[var55] = var53;
         }
      }

      var2.field4181 = var41 * 99;
      var3.field4181 = var42 * 99;
      var4.field4181 = var43 * 99;
      var5.field4181 = var44 * 99;
      var6.field4181 = var45 * 99;
      var7.field4181 = var46 * 99;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field2165[var55] & 255;
         if (var56 == 0) {
            this.field2166[var55] = (short)var2.method6655();
            this.field2167[var55] = (short)var2.method6655();
            this.field2160[var55] = (short)var2.method6655();
         }
      }

      var2.field4181 = var26 * 99;
      var55 = var2.method6560();
      if (var55 != 0) {
         new class210();
         var2.method6655();
         var2.method6655();
         var2.method6655();
         var2.method6784();
      }

   }

   public class192 method3725(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3753();
      int var7 = var2 + this.field2180;
      int var8 = var2 + this.field2181;
      int var9 = var4 + this.field2182;
      int var10 = var4 + this.field2161;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class192 var11 = new class192();
            var11.field2176 = this.field2176;
            var11.field2153 = this.field2153;
            var11.field2164 = this.field2164;
            var11.field2150 = this.field2150;
            var11.field2152 = this.field2152;
            var11.field2154 = this.field2154;
            var11.field2155 = this.field2155;
            var11.field2156 = this.field2156;
            var11.field2173 = this.field2173;
            var11.field2168 = this.field2168;
            var11.field2159 = this.field2159;
            var11.field2158 = this.field2158;
            var11.field2183 = this.field2183;
            var11.field2157 = this.field2157;
            var11.field2163 = this.field2163;
            var11.field2165 = this.field2165;
            var11.field2166 = this.field2166;
            var11.field2167 = this.field2167;
            var11.field2160 = this.field2160;
            var11.field2169 = this.field2169;
            var11.field2170 = this.field2170;
            var11.field2171 = this.field2171;
            var11.field2172 = this.field2172;
            var11.field2174 = this.field2174;
            var11.field2177 = this.field2177;
            var11.field2149 = new int[var11.field2176];
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
               for(var12 = 0; var12 < var11.field2176; ++var12) {
                  var13 = var2 + this.field2150[var12];
                  var14 = var4 + this.field2152[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2149[var12] = var21 + this.field2149[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field2176; ++var12) {
                  var13 = (-this.field2149[var12] << 16) / super.field2345;
                  if (var13 < var6) {
                     var14 = var2 + this.field2150[var12];
                     var15 = var4 + this.field2152[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field2149[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field2149[var12];
                  }
               }
            }

            var11.method3737();
            return var11;
         }
      } else {
         return this;
      }
   }

   public void method3731(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2176; ++var4) {
         int[] var10000 = this.field2150;
         var10000[var4] += var1;
         var10000 = this.field2149;
         var10000[var4] += var2;
         var10000 = this.field2152;
         var10000[var4] += var3;
      }

      this.method3737();
   }

   void method3726() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.field2169 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2176; ++var3) {
            var4 = this.field2169[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2171 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2171[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2176; this.field2171[var4][var1[var4]++] = var3++) {
            var4 = this.field2169[var3];
         }

         this.field2169 = null;
      }

      if (this.field2170 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2153; ++var3) {
            var4 = this.field2170[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2172 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2172[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2153; this.field2172[var4][var1[var4]++] = var3++) {
            var4 = this.field2170[var3];
         }

         this.field2170 = null;
      }

   }

   public void method3734() {
      int var1;
      for(var1 = 0; var1 < this.field2176; ++var1) {
         this.field2152[var1] = -this.field2152[var1];
      }

      for(var1 = 0; var1 < this.field2153; ++var1) {
         int var2 = this.field2154[var1];
         this.field2154[var1] = this.field2156[var1];
         this.field2156[var1] = var2;
      }

      this.method3737();
   }

   public void method3783(int var1) {
      int var2 = field2187[var1];
      int var3 = field2162[var1];

      for(int var4 = 0; var4 < this.field2176; ++var4) {
         int var5 = var2 * this.field2152[var4] + var3 * this.field2150[var4] >> 16;
         this.field2152[var4] = var3 * this.field2152[var4] - var2 * this.field2150[var4] >> 16;
         this.field2150[var4] = var5;
      }

      this.method3737();
   }

   public void method3719() {
      for(int var1 = 0; var1 < this.field2176; ++var1) {
         int var2 = this.field2150[var1];
         this.field2150[var1] = this.field2152[var1];
         this.field2152[var1] = -var2;
      }

      this.method3737();
   }

   public void method3728() {
      for(int var1 = 0; var1 < this.field2176; ++var1) {
         this.field2150[var1] = -this.field2150[var1];
         this.field2152[var1] = -this.field2152[var1];
      }

      this.method3737();
   }

   public void method3729() {
      for(int var1 = 0; var1 < this.field2176; ++var1) {
         int var2 = this.field2152[var1];
         this.field2152[var1] = this.field2150[var1];
         this.field2150[var1] = -var2;
      }

      this.method3737();
   }

   final int method3758(class192 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field2150[var2];
      int var5 = var1.field2149[var2];
      int var6 = var1.field2152[var2];

      for(int var7 = 0; var7 < this.field2176; ++var7) {
         if (var4 == this.field2150[var7] && var5 == this.field2149[var7] && var6 == this.field2152[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field2150[this.field2176] = var4;
         this.field2149[this.field2176] = var5;
         this.field2152[this.field2176] = var6;
         if (var1.field2169 != null) {
            this.field2169[this.field2176] = var1.field2169[var2];
         }

         var3 = this.field2176++;
      }

      return var3;
   }

   public static class192 method3720(class276 var0, int var1, int var2) {
      byte[] var3 = var0.method4920(var1, var2);
      return var3 == null ? null : new class192(var3);
   }

   static void method3739(class192 var0, class192 var1, int var2, int var3, int var4, boolean var5) {
      var0.method3753();
      var0.method3736();
      var1.method3753();
      var1.method3736();
      ++field2186;
      int var6 = 0;
      int[] var7 = var1.field2150;
      int var8 = var1.field2176;

      int var9;
      for(var9 = 0; var9 < var0.field2176; ++var9) {
         class208 var10 = var0.field2151[var9];
         if (var10.field2492 != 0) {
            int var11 = var0.field2149[var9] - var3;
            if (var11 <= var1.field2179) {
               int var12 = var0.field2150[var9] - var2;
               if (var12 >= var1.field2180 && var12 <= var1.field2181) {
                  int var13 = var0.field2152[var9] - var4;
                  if (var13 >= var1.field2182 && var13 <= var1.field2161) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class208 var15 = var1.field2151[var14];
                        if (var12 == var7[var14] && var13 == var1.field2152[var14] && var11 == var1.field2149[var14] && var15.field2492 != 0) {
                           if (var0.field2175 == null) {
                              var0.field2175 = new class208[var0.field2176];
                           }

                           if (var1.field2175 == null) {
                              var1.field2175 = new class208[var8];
                           }

                           class208 var16 = var0.field2175[var9];
                           if (var16 == null) {
                              var16 = var0.field2175[var9] = new class208(var10);
                           }

                           class208 var17 = var1.field2175[var14];
                           if (var17 == null) {
                              var17 = var1.field2175[var14] = new class208(var15);
                           }

                           var16.field2495 += var15.field2495;
                           var16.field2493 += var15.field2493;
                           var16.field2494 += var15.field2494;
                           var16.field2492 += var15.field2492;
                           var17.field2495 += var10.field2495;
                           var17.field2493 += var10.field2493;
                           var17.field2494 += var10.field2494;
                           var17.field2492 += var10.field2492;
                           ++var6;
                           field2184[var9] = field2186;
                           field2185[var14] = field2186;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field2153; ++var9) {
            if (field2184[var0.field2154[var9]] == field2186 && field2184[var0.field2155[var9]] == field2186 && field2184[var0.field2156[var9]] == field2186) {
               if (var0.field2173 == null) {
                  var0.field2173 = new byte[var0.field2153];
               }

               var0.field2173[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field2153; ++var9) {
            if (field2186 == field2185[var1.field2154[var9]] && field2186 == field2185[var1.field2155[var9]] && field2186 == field2185[var1.field2156[var9]]) {
               if (var1.field2173 == null) {
                  var1.field2173 = new byte[var1.field2153];
               }

               var1.field2173[var9] = 2;
            }
         }

      }
   }

   static final int method3742(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   static final int method3765(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }
}
