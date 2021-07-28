public final class class69 extends class71 {
   boolean field1003;
   boolean field994;
   boolean field997;
   class206 field980;
   class246 field978;
   class328 field1000;
   class328 field1001;
   class328 field1002;
   class405 field979;
   int field1004;
   int field1005;
   int field1006;
   int field977;
   int field982;
   int field983;
   int field984;
   int field985;
   int field986;
   int field988;
   int field989;
   int field990;
   int field991;
   int field992;
   int field993;
   int field995;
   int field996;
   int field998;
   int field999;
   String[] field981;

   class69() {
      this.field995 = -1;
      this.field991 = -1;
      this.field981 = new String[3];

      for(int var1 = 0; var1 < 3; ++var1) {
         this.field981[var1] = "";
      }

      this.field990 = 0;
      this.field1006 = 0;
      this.field985 = 0;
      this.field986 = 0;
      this.field994 = false;
      this.field996 = 0;
      this.field997 = false;
      this.field1000 = class328.field3873;
      this.field1001 = class328.field3873;
      this.field1002 = class328.field3873;
      this.field1003 = false;
   }

   void method1756() {
      this.field1002 = client.field636[0] != null && client.field636[0].method2290(this.field979.method7141()) != -1 ? class328.field3871 : class328.field3872;
   }

   void method1755() {
      this.field1001 = class68.field971 != null && class68.field971.method5754(this.field979) ? class328.field3871 : class328.field3872;
   }

   void method1787() {
      this.field1000 = class12.field79.method1361(this.field979) ? class328.field3871 : class328.field3872;
   }

   protected final class206 vmethod4091() {
      if (this.field978 == null) {
         return null;
      } else {
         class158 var2 = super.field1052 != -1 && super.field1055 == 0 ? class47.method1355(super.field1052) : null;
         class158 var3 = super.field1049 != -1 && !this.field994 && (super.field1049 != super.field1029 || var2 == null) ? class47.method1355(super.field1049) : null;
         class206 var4 = this.field978.method4664(var2, super.field1053, var3, super.field1041);
         if (var4 == null) {
            return null;
         } else {
            var4.method4137();
            super.field1070 = var4.field2345;
            class206 var5;
            class206[] var6;
            if (!this.field994 && super.field1057 != -1 && super.field1027 != -1) {
               var5 = class24.method463(super.field1057).method2791(super.field1027);
               if (var5 != null) {
                  var5.method4147(0, -super.field1061, 0);
                  var6 = new class206[]{var4, var5};
                  var4 = new class206(var6, 2);
               }
            }

            if (!this.field994 && this.field980 != null) {
               if (client.field451 >= this.field986) {
                  this.field980 = null;
               }

               if (client.field451 >= this.field985 && client.field451 < this.field986) {
                  var5 = this.field980;
                  var5.method4147(this.field982 - super.field1068, this.field983 - this.field984, this.field989 - super.field1058);
                  if (super.field1042 == 512) {
                     var5.method4162();
                     var5.method4162();
                     var5.method4162();
                  } else if (super.field1042 == 1024) {
                     var5.method4162();
                     var5.method4162();
                  } else if (super.field1042 == 1536) {
                     var5.method4162();
                  }

                  var6 = new class206[]{var4, var5};
                  var4 = new class206(var6, 2);
                  if (super.field1042 == 512) {
                     var5.method4162();
                  } else if (super.field1042 == 1024) {
                     var5.method4162();
                     var5.method4162();
                  } else if (super.field1042 == 1536) {
                     var5.method4162();
                     var5.method4162();
                     var5.method4162();
                  }

                  var5.method4147(super.field1068 - this.field982, this.field984 - this.field983, super.field1058 - this.field989);
               }
            }

            var4.field2429 = true;
            return var4;
         }
      }
   }

   void method1771(int var1, int var2) {
      super.field1026 = 0;
      super.field1066 = 0;
      super.field1078 = 0;
      super.field1075[0] = var1;
      super.field1076[0] = var2;
      int var4 = this.method1759();
      super.field1068 = super.field1075[0] * 128 + var4 * 64;
      super.field1058 = var4 * 64 + super.field1076[0] * 128;
   }

   int method1759() {
      return this.field978 != null && this.field978.field2936 != -1 ? class96.method2133(this.field978.field2936).field1621 : 1;
   }

   void method1751() {
      this.field1000 = class328.field3873;
   }

   final void method1762(int var1, int var2, byte var3) {
      if (super.field1026 < 9) {
         ++super.field1026;
      }

      for(int var5 = super.field1026; var5 > 0; --var5) {
         super.field1075[var5] = super.field1075[var5 - 1];
         super.field1076[var5] = super.field1076[var5 - 1];
         super.field1030[var5] = super.field1030[var5 - 1];
      }

      super.field1075[0] = var1;
      super.field1076[0] = var2;
      super.field1030[0] = var3;
   }

   void method1754() {
      this.field1001 = class328.field3873;
   }

   void method1757() {
      this.field1002 = class328.field3873;
   }

   final void method1761(int var1, int var2, byte var3) {
      if (super.field1052 != -1 && class47.method1355(super.field1052).field1859 == 1) {
         super.field1052 = -1;
      }

      super.field1048 = -1;
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.field1075[0] >= 0 && super.field1075[0] < 104 && super.field1076[0] >= 0 && super.field1076[0] < 104) {
            if (var3 == 2) {
               class69 var5 = this;
               int var6 = super.field1075[0];
               int var7 = super.field1076[0];
               int var8 = this.method1759();
               if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) {
                  int var11 = this.method1759();
                  client.field493.field1893 = var1;
                  client.field493.field1891 = var2;
                  client.field493.field1892 = 1;
                  client.field493.field1890 = 1;
                  class45 var12 = client.field493;
                  int var13 = class123.method2440(var6, var7, var11, var12, client.field464[this.field998], true, client.field683, client.field665);
                  if (var13 >= 1) {
                     for(int var14 = 0; var14 < var13 - 1; ++var14) {
                        var5.method1762(client.field683[var14], client.field665[var14], (byte)2);
                     }
                  }
               }
            }

            this.method1762(var1, var2, var3);
         } else {
            this.method1771(var1, var2);
         }
      } else {
         this.method1771(var1, var2);
      }

   }

   final void method1749(class384 var1) {
      var1.field4181 = 0;
      int var3 = var1.method6560();
      this.field995 = var1.method6561();
      this.field991 = var1.method6561();
      int var4 = -1;
      this.field996 = 0;
      int[] var5 = new int[12];

      int var7;
      int var8;
      int var9;
      for(int var6 = 0; var6 < 12; ++var6) {
         var7 = var1.method6560();
         if (var7 == 0) {
            var5[var6] = 0;
         } else {
            var8 = var1.method6560();
            var5[var6] = var8 + (var7 << 8);
            if (var6 == 0 && var5[0] == 65535) {
               var4 = var1.method6655();
               break;
            }

            if (var5[var6] >= 512) {
               var9 = class10.method105(var5[var6] - 512).field1832;
               if (var9 != 0) {
                  this.field996 = var9;
               }
            }
         }
      }

      int[] var25 = new int[5];

      for(var7 = 0; var7 < 5; ++var7) {
         var8 = var1.method6560();
         if (var8 < 0 || var8 >= class243.field2914[var7].length) {
            var8 = 0;
         }

         var25[var7] = var8;
      }

      super.field1029 = var1.method6655();
      if (super.field1029 == 65535) {
         super.field1029 = -1;
      }

      super.field1051 = var1.method6655();
      if (super.field1051 == 65535) {
         super.field1051 = -1;
      }

      super.field1019 = super.field1051;
      super.field1028 = var1.method6655();
      if (super.field1028 == 65535) {
         super.field1028 = -1;
      }

      super.field1071 = var1.method6655();
      if (super.field1071 == 65535) {
         super.field1071 = -1;
      }

      super.field1045 = var1.method6655();
      if (super.field1045 == 65535) {
         super.field1045 = -1;
      }

      super.field1020 = var1.method6655();
      if (super.field1020 == 65535) {
         super.field1020 = -1;
      }

      super.field1032 = var1.method6655();
      if (super.field1032 == 65535) {
         super.field1032 = -1;
      }

      this.field979 = new class405(var1.method6569(), class51.field760);
      this.method1751();
      this.method1754();
      this.method1757();
      if (this == class19.field139) {
         class408.field4315 = this.field979.method7141();
      }

      this.field990 = var1.method6560();
      this.field1006 = var1.method6655();
      this.field997 = var1.method6560() == 1;
      if (client.field406 == 0 && client.field576 >= 2) {
         this.field997 = false;
      }

      class137[] var26 = null;
      boolean var27 = false;
      if (var1.field4181 * -1084587701 < var1.payload.length) {
         var9 = var1.method6655();
         var27 = (var9 >> 15 & 1) == 1;
         if (var9 > 0 && var9 != 32768) {
            var26 = new class137[12];

            for(int var10 = 0; var10 < 12; ++var10) {
               int var11 = var9 >> 12 - var10 & 1;
               if (var11 == 1) {
                  int var15 = var5[var10] - 512;
                  int var16 = var1.method6560();
                  boolean var17 = (var16 & 1) != 0;
                  boolean var18 = (var16 & 2) != 0;
                  class137 var19 = new class137(var15);
                  int var20;
                  int[] var21;
                  boolean var22;
                  int var23;
                  short var24;
                  if (var17) {
                     var20 = var1.method6560();
                     var21 = new int[]{var20 & 15, var20 >> 4 & 15};
                     var22 = var19.field1515 != null && var21.length == var19.field1515.length;

                     for(var23 = 0; var23 < 2; ++var23) {
                        if (var21[var23] != 15) {
                           var24 = (short)var1.method6655();
                           if (var22) {
                              var19.field1515[var21[var23]] = var24;
                           }
                        }
                     }
                  }

                  if (var18) {
                     var20 = var1.method6560();
                     var21 = new int[]{var20 & 15, var20 >> 4 & 15};
                     var22 = var19.field1518 != null && var21.length == var19.field1518.length;

                     for(var23 = 0; var23 < 2; ++var23) {
                        if (var21[var23] != 15) {
                           var24 = (short)var1.method6655();
                           if (var22) {
                              var19.field1518[var21[var23]] = var24;
                           }
                        }
                     }
                  }

                  var26[var10] = var19;
               }
            }
         }
      }

      if (this.field978 == null) {
         this.field978 = new class246();
      }

      this.field978.method4640(var5, var26, var27, var25, var3 == 1, var4);
   }

   final boolean vmethod1891() {
      return this.field978 != null;
   }

   boolean method1750() {
      if (this.field1000 == class328.field3873) {
         this.method1787();
      }

      return this.field1000 == class328.field3871;
   }

   boolean method1753() {
      if (this.field1001 == class328.field3873) {
         this.method1755();
      }

      return this.field1001 == class328.field3871;
   }

   boolean method1758() {
      if (this.field1002 == class328.field3873) {
         this.method1756();
      }

      return this.field1002 == class328.field3871;
   }

   static String method1765(String var0, class248 var1) {
      if (var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if (var4 == -1) {
                  break;
               }

               var0 = var0.substring(0, var4) + class10.method83(class130.method2549(var1, var3 - 1)) + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }
}
