public final class class70 extends class72 {
   boolean field1004;
   boolean field995;
   boolean field998;
   class207 field981;
   class247 field979;
   class329 field1001;
   class329 field1002;
   class329 field1003;
   class406 field980;
   int field1000;
   int field1005;
   int field1006;
   int field1007;
   int field978;
   int field983;
   int field984;
   int field985;
   int field986;
   int field987;
   int field989;
   int field990;
   int field991;
   int field992;
   int field993;
   int field994;
   int field996;
   int field997;
   int field999;
   String[] field982;

   class70() {
      this.field996 = -1;
      this.field992 = -1;
      this.field982 = new String[3];

      for(int var1 = 0; var1 < 3; ++var1) {
         this.field982[var1] = "";
      }

      this.field991 = 0;
      this.field1007 = 0;
      this.field986 = 0;
      this.field987 = 0;
      this.field995 = false;
      this.field997 = 0;
      this.field998 = false;
      this.field1001 = class329.field3874;
      this.field1002 = class329.field3874;
      this.field1003 = class329.field3874;
      this.field1004 = false;
   }

   final void method1700(class385 var1) {
      var1.field4182 = 0;
      int var3 = var1.method5948();
      this.field996 = var1.method5949();
      this.field992 = var1.method5949();
      int var4 = -1;
      this.field997 = 0;
      int[] var5 = new int[12];

      int var7;
      int var8;
      int var9;
      for(int var6 = 0; var6 < 12; ++var6) {
         var7 = var1.method5948();
         if (0 == var7) {
            var5[var6] = 0;
         } else {
            var8 = var1.method5948();
            var5[var6] = (var7 << 8) + var8;
            if (0 == var6 && var5[0] == 65535) {
               var4 = var1.method6043();
               break;
            }

            if (var5[var6] >= 512) {
               var9 = class11.method93(var5[var6] - 512).field1833;
               if (0 != var9) {
                  this.field997 = var9;
               }
            }
         }
      }

      int[] var25 = new int[5];

      for(var7 = 0; var7 < 5; ++var7) {
         var8 = var1.method5948();
         if (var8 < 0 || var8 >= class244.field2915[var7].length) {
            var8 = 0;
         }

         var25[var7] = var8;
      }

      super.field1030 = var1.method6043();
      if (super.field1030 == 65535) {
         super.field1030 = -1;
      }

      super.field1052 = var1.method6043();
      if (65535 == super.field1052) {
         super.field1052 = -1;
      }

      super.field1020 = super.field1052;
      super.field1029 = var1.method6043();
      if (65535 == super.field1029) {
         super.field1029 = -1;
      }

      super.field1072 = var1.method6043();
      if (super.field1072 == 65535) {
         super.field1072 = -1;
      }

      super.field1046 = var1.method6043();
      if (65535 == super.field1046) {
         super.field1046 = -1;
      }

      super.field1021 = var1.method6043();
      if (65535 == super.field1021) {
         super.field1021 = -1;
      }

      super.field1033 = var1.method6043();
      if (65535 == super.field1033) {
         super.field1033 = -1;
      }

      this.field980 = new class406(var1.method5957(), class52.field761);
      this.method1702();
      this.method1705();
      this.method1708();
      if (this == class20.field140) {
         class409.field4316 = this.field980.method6521();
      }

      this.field991 = var1.method5948();
      this.field1007 = var1.method6043();
      this.field998 = var1.method5948() == 1;
      if (client.field407 == 0 && client.field577 >= 2) {
         this.field998 = false;
      }

      class138[] var26 = null;
      boolean var27 = false;
      if (var1.field4182 < var1.field4184.length) {
         var9 = var1.method6043();
         var27 = (var9 >> 15 & 1) == 1;
         if (var9 > 0 && 32768 != var9) {
            var26 = new class138[12];

            for(int var10 = 0; var10 < 12; ++var10) {
               int var11 = var9 >> 12 - var10 & 1;
               if (1 == var11) {
                  int var15 = var5[var10] - 512;
                  int var16 = var1.method5948();
                  boolean var17 = (var16 & 1) != 0;
                  boolean var18 = (var16 & 2) != 0;
                  class138 var19 = new class138(var15);
                  int var20;
                  int[] var21;
                  boolean var22;
                  int var23;
                  short var24;
                  if (var17) {
                     var20 = var1.method5948();
                     var21 = new int[]{var20 & 15, var20 >> 4 & 15};
                     var22 = null != var19.field1516 && var21.length == var19.field1516.length;

                     for(var23 = 0; var23 < 2; ++var23) {
                        if (15 != var21[var23]) {
                           var24 = (short)var1.method6043();
                           if (var22) {
                              var19.field1516[var21[var23]] = var24;
                           }
                        }
                     }
                  }

                  if (var18) {
                     var20 = var1.method5948();
                     var21 = new int[]{var20 & 15, var20 >> 4 & 15};
                     var22 = null != var19.field1519 && var21.length == var19.field1519.length;

                     for(var23 = 0; var23 < 2; ++var23) {
                        if (var21[var23] != 15) {
                           var24 = (short)var1.method6043();
                           if (var22) {
                              var19.field1519[var21[var23]] = var24;
                           }
                        }
                     }
                  }

                  var26[var10] = var19;
               }
            }
         }
      }

      if (this.field979 == null) {
         this.field979 = new class247();
      }

      this.field979.method4177(var5, var26, var27, var25, 1 == var3, var4);
   }

   boolean method1701() {
      if (this.field1001 == class329.field3874) {
         this.method1736();
      }

      return this.field1001 == class329.field3872;
   }

   void method1702() {
      this.field1001 = class329.field3874;
   }

   void method1736() {
      this.field1001 = class13.field80.method1318(this.field980) ? class329.field3872 : class329.field3873;
   }

   boolean method1704() {
      if (class329.field3874 == this.field1002) {
         this.method1706();
      }

      return class329.field3872 == this.field1002;
   }

   void method1705() {
      this.field1002 = class329.field3874;
   }

   void method1706() {
      this.field1002 = null != class69.field972 && class69.field972.method5210(this.field980) ? class329.field3872 : class329.field3873;
   }

   void method1707() {
      this.field1003 = null != client.field637[0] && client.field637[0].method2120(this.field980.method6521()) != -1 ? class329.field3872 : class329.field3873;
   }

   void method1708() {
      this.field1003 = class329.field3874;
   }

   boolean method1709() {
      if (class329.field3874 == this.field1003) {
         this.method1707();
      }

      return this.field1003 == class329.field3872;
   }

   int method1710() {
      return this.field979 != null && this.field979.field2937 != -1 ? class97.method2065(this.field979.field2937).field1622 : 1;
   }

   protected final class207 method3687() {
      if (this.field979 == null) {
         return null;
      } else {
         class159 var2 = super.field1053 != -1 && super.field1056 == 0 ? class48.method1312(super.field1053) : null;
         class159 var3 = -1 == super.field1050 || this.field995 || super.field1050 == super.field1030 && null != var2 ? null : class48.method1312(super.field1050);
         class207 var4 = this.field979.method4201(var2, super.field1054, var3, super.field1042);
         if (var4 == null) {
            return null;
         } else {
            var4.method3721();
            super.field1071 = var4.field2346;
            class207 var5;
            class207[] var6;
            if (!this.field995 && -1 != super.field1058 && -1 != super.field1028) {
               var5 = class25.method403(super.field1058).method2498(super.field1028);
               if (null != var5) {
                  var5.method3731(0, -super.field1062, 0);
                  var6 = new class207[]{var4, var5};
                  var4 = new class207(var6, 2);
               }
            }

            if (!this.field995 && this.field981 != null) {
               if (client.field452 >= this.field987) {
                  this.field981 = null;
               }

               if (client.field452 >= this.field986 && client.field452 < this.field987) {
                  var5 = this.field981;
                  var5.method3731(this.field983 - super.field1069, this.field984 - this.field985, this.field990 - super.field1059);
                  if (512 == super.field1043) {
                     var5.method3744();
                     var5.method3744();
                     var5.method3744();
                  } else if (1024 == super.field1043) {
                     var5.method3744();
                     var5.method3744();
                  } else if (1536 == super.field1043) {
                     var5.method3744();
                  }

                  var6 = new class207[]{var4, var5};
                  var4 = new class207(var6, 2);
                  if (512 == super.field1043) {
                     var5.method3744();
                  } else if (super.field1043 == 1024) {
                     var5.method3744();
                     var5.method3744();
                  } else if (super.field1043 == 1536) {
                     var5.method3744();
                     var5.method3744();
                     var5.method3744();
                  }

                  var5.method3731(super.field1069 - this.field983, this.field985 - this.field984, super.field1059 - this.field990);
               }
            }

            var4.field2430 = true;
            return var4;
         }
      }
   }

   final void method1711(int var1, int var2, byte var3) {
      if (super.field1053 != -1 && class48.method1312(super.field1053).field1860 == 1) {
         super.field1053 = -1;
      }

      super.field1049 = -1;
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.field1076[0] >= 0 && super.field1076[0] < 104 && super.field1077[0] >= 0 && super.field1077[0] < 104) {
            if (var3 == 2) {
               class70 var5 = this;
               int var6 = super.field1076[0];
               int var7 = super.field1077[0];
               int var8 = this.method1710();
               if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) {
                  int var11 = this.method1710();
                  client.field494.field1894 = var1;
                  client.field494.field1892 = var2;
                  client.field494.field1893 = 1;
                  client.field494.field1891 = 1;
                  class46 var12 = client.field494;
                  int var13 = class124.method2218(var6, var7, var11, var12, client.field465[this.field999], true, client.field684, client.field666);
                  if (var13 >= 1) {
                     for(int var14 = 0; var14 < var13 - 1; ++var14) {
                        var5.method1712(client.field684[var14], client.field666[var14], (byte)2);
                     }
                  }
               }
            }

            this.method1712(var1, var2, var3);
         } else {
            this.method1720(var1, var2);
         }
      } else {
         this.method1720(var1, var2);
      }

   }

   void method1720(int var1, int var2) {
      super.field1027 = 0;
      super.field1067 = 0;
      super.field1079 = 0;
      super.field1076[0] = var1;
      super.field1077[0] = var2;
      int var4 = this.method1710();
      super.field1069 = 128 * super.field1076[0] + var4 * 64;
      super.field1059 = 64 * var4 + super.field1077[0] * 128;
   }

   final void method1712(int var1, int var2, byte var3) {
      if (super.field1027 < 9) {
         ++super.field1027;
      }

      for(int var5 = super.field1027; var5 > 0; --var5) {
         super.field1076[var5] = super.field1076[var5 - 1];
         super.field1077[var5] = super.field1077[var5 - 1];
         super.field1031[var5] = super.field1031[var5 - 1];
      }

      super.field1076[0] = var1;
      super.field1077[0] = var2;
      super.field1031[0] = var3;
   }

   final boolean method1748() {
      return null != this.field979;
   }

   static String method1714(String var0, class249 var1) {
      if (var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if (var4 == -1) {
                  break;
               }

               var0 = var0.substring(0, var4) + class11.method71(class131.method2294(var1, var3 - 1)) + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }
}
