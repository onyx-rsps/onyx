public class class239 extends class31 {
   static class136 field2879;
   class21 field2878;
   class236 field2880;
   class296 field2877;

   class239(class236 var1) {
      this.field2877 = new class296();
      this.field2878 = new class21();
      this.field2880 = var1;
   }

   protected class31 method643() {
      class241 var1 = (class241)this.field2877.method4687();
      if (null == var1) {
         return null;
      } else {
         return (class31)(var1.field2901 != null ? var1.field2901 : this.method631());
      }
   }

   protected class31 method631() {
      class241 var1;
      do {
         var1 = (class241)this.field2877.method4678();
         if (null == var1) {
            return null;
         }
      } while(var1.field2901 == null);

      return var1.field2901;
   }

   protected int method632() {
      return 0;
   }

   protected void method641(int[] var1, int var2, int var3) {
      this.field2878.method641(var1, var2, var3);

      for(class241 var6 = (class241)this.field2877.method4687(); var6 != null; var6 = (class241)this.field2877.method4678()) {
         if (!this.field2880.method3993(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field2902) {
                  this.method4121(var6, var1, var4, var5, var5 + var4);
                  var6.field2902 -= var5;
                  break;
               }

               this.method4121(var6, var1, var4, var6.field2902, var5 + var4);
               var4 += var6.field2902;
               var5 -= var6.field2902;
            } while(!this.field2880.method3994(var6, var1, var4, var5));
         }
      }

   }

   protected void method635(int var1) {
      this.field2878.method635(var1);

      for(class241 var3 = (class241)this.field2877.method4687(); null != var3; var3 = (class241)this.field2877.method4678()) {
         if (!this.field2880.method3993(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field2902) {
                  this.method4120(var3, var2);
                  var3.field2902 -= var2;
                  break;
               }

               this.method4120(var3, var3.field2902);
               var2 -= var3.field2902;
            } while(!this.field2880.method3994(var3, (int[])null, 0, var2));
         }
      }

   }

   void method4121(class241 var1, int[] var2, int var3, int var4, int var5) {
      if ((this.field2880.field2831[var1.field2903] & 4) != 0 && var1.field2897 < 0) {
         int var7 = this.field2880.field2842[var1.field2903] / class282.field3634;

         while(true) {
            int var8 = (var7 + 1048575 - var1.field2899) / var7;
            if (var8 > var4) {
               var1.field2899 += var4 * var7;
               break;
            }

            var1.field2901.method641(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.field2899 += var7 * var8 - 1048576;
            int var9 = class282.field3634 / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            class30 var11 = var1.field2901;
            if (this.field2880.field2840[var1.field2903] == 0) {
               var1.field2901 = class30.method493(var1.field2885, var11.method508(), var11.method499(), var11.method500());
            } else {
               var1.field2901 = class30.method493(var1.field2885, var11.method508(), 0, var11.method500());
               this.field2880.method3965(var1, var1.field2891.field2869[var1.field2894] < 0);
               var1.field2901.method504(var9, var11.method499());
            }

            if (var1.field2891.field2869[var1.field2894] < 0) {
               var1.field2901.method566(-1);
            }

            var11.method506(var9);
            var11.method641(var2, var3, var5 - var3);
            if (var11.method510()) {
               this.field2878.method329(var11);
            }
         }
      }

      var1.field2901.method641(var2, var3, var4);
   }

   void method4120(class241 var1, int var2) {
      if (0 != (this.field2880.field2831[var1.field2903] & 4) && var1.field2897 < 0) {
         int var4 = this.field2880.field2842[var1.field2903] / class282.field3634;
         int var5 = (1048575 + var4 - var1.field2899) / var4;
         var1.field2899 = var2 * var4 + var1.field2899 & 1048575;
         if (var5 <= var2) {
            if (0 == this.field2880.field2840[var1.field2903]) {
               var1.field2901 = class30.method493(var1.field2885, var1.field2901.method508(), var1.field2901.method499(), var1.field2901.method500());
            } else {
               var1.field2901 = class30.method493(var1.field2885, var1.field2901.method508(), 0, var1.field2901.method500());
               this.field2880.method3965(var1, var1.field2891.field2869[var1.field2894] < 0);
            }

            if (var1.field2891.field2869[var1.field2894] < 0) {
               var1.field2901.method566(-1);
            }

            var2 = var1.field2899 / var4;
         }
      }

      var1.field2901.method635(var2);
   }

   static final void method4119() {
      if (class83.field1183) {
         for(int var1 = 0; var1 < class83.field1172; ++var1) {
            class70 var2 = client.field524[class83.field1178[var1]];
            var2.method1708();
         }

         class83.field1183 = false;
      }

   }

   static final void decodeRebuildRegion(boolean isDynamic, class384 buf) {
      client.inDynamicRegion = isDynamic;
      int chunkY;
      int regionCount;
      int region;
      int i;
      int ry;
      int regionId;
      if (!client.inDynamicRegion) {
         chunkY = buf.readUnsignedShortADD();
         int chunkX = buf.readUnsignedShortLE();
         regionCount = buf.readUnsignedShort();
         class44.regionXteas = new int[regionCount][4];

         for(region = 0; region < regionCount; ++region) {
            for(i = 0; i < 4; ++i) {
               class44.regionXteas[region][i] = buf.readInt();
            }
         }

         class235.regionIds = new int[regionCount];
         class251.regionMapFiles = new int[regionCount];
         class97.regionLandscapeFiles = new int[regionCount];
         class227.field2673 = new byte[regionCount][];
         class356.field4011 = new byte[regionCount][];
         boolean forceSend = false;
         if ((48 == chunkX / 8 || chunkX / 8 == 49) && 48 == chunkY / 8) {
            forceSend = true;
         }

         if (48 == chunkX / 8 && chunkY / 8 == 148) {
            forceSend = true;
         }

         regionCount = 0;

         for(int rx = (chunkX - 6) / 8; rx <= (chunkX + 6) / 8; ++rx) {
            for(ry = (chunkY - 6) / 8; ry <= (chunkY + 6) / 8; ++ry) {
               regionId = (rx << 8) + ry;
               if (!forceSend || ry != 49 && ry != 149 && 147 != ry && rx != 50 && (rx != 49 || 47 != ry)) {
                  class235.regionIds[regionCount] = regionId;
                  class251.regionMapFiles[regionCount] = class199.field2277.method4428("m" + rx + "_" + ry);
                  class97.regionLandscapeFiles[regionCount] = class199.field2277.method4428("l" + rx + "_" + ry);
                  ++regionCount;
               }
            }
         }

         class99.method2072(chunkX, chunkY, true);
      } else {
         chunkY = buf.method5988();
         boolean var16 = buf.method5979() == 1;
         regionCount = buf.readUnsignedShort();
         region = buf.readUnsignedShort();
         buf.toBitMode();

         int var10;
         for(i = 0; i < 4; ++i) {
            for(ry = 0; ry < 13; ++ry) {
               for(regionId = 0; regionId < 13; ++regionId) {
                  var10 = buf.method5893(1);
                  if (1 == var10) {
                     client.field467[i][ry][regionId] = buf.method5893(26);
                  } else {
                     client.field467[i][ry][regionId] = -1;
                  }
               }
            }
         }

         buf.toByteMode();
         class44.regionXteas = new int[region][4];

         for(i = 0; i < region; ++i) {
            for(ry = 0; ry < 4; ++ry) {
               class44.regionXteas[i][ry] = buf.readInt();
            }
         }

         class235.regionIds = new int[region];
         class251.regionMapFiles = new int[region];
         class97.regionLandscapeFiles = new int[region];
         class227.field2673 = new byte[region][];
         class356.field4011 = new byte[region][];
         region = 0;

         for(i = 0; i < 4; ++i) {
            for(ry = 0; ry < 13; ++ry) {
               for(regionId = 0; regionId < 13; ++regionId) {
                  var10 = client.field467[i][ry][regionId];
                  if (var10 != -1) {
                     int var11 = var10 >> 14 & 1023;
                     int var12 = var10 >> 3 & 2047;
                     int var13 = (var11 / 8 << 8) + var12 / 8;

                     int var14;
                     for(var14 = 0; var14 < region; ++var14) {
                        if (var13 == class235.regionIds[var14]) {
                           var13 = -1;
                           break;
                        }
                     }

                     if (var13 != -1) {
                        class235.regionIds[region] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        class251.regionMapFiles[region] = class199.field2277.method4428("m" + var14 + "_" + var15);
                        class97.regionLandscapeFiles[region] = class199.field2277.method4428("l" + var14 + "_" + var15);
                        ++region;
                     }
                  }
               }
            }
         }

         class99.method2072(chunkY, regionCount, !var16);
      }

   }
}
