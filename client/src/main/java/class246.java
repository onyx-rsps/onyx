public class class246 {
   static class222 field2937;
   static final int[] field2932;
   boolean field2935;
   class137[] field2934;
   int[] field2928;
   int[] field2931;
   long field2929;
   long field2933;
   public boolean field2930;
   public int field2936;

   static {
      field2932 = new int[]{8, 11, 4, 6, 9, 7, 10};
      field2937 = new class222(260);
   }

   public class246() {
      this.field2935 = false;
   }

   public void method4660(int[] var1, int[] var2, boolean var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var6 = 0; var6 < 7; ++var6) {
            for(int var7 = 0; var7 < class142.field1563; ++var7) {
               class142 var8 = class70.method1801(var7);
               if (var8 != null && !var8.field1572 && var6 + (var3 ? 7 : 0) == var8.field1565) {
                  var1[field2932[var6]] = var7 + 256;
                  break;
               }
            }
         }
      }

      this.field2928 = var1;
      this.field2931 = var2;
      this.field2930 = var3;
      this.field2936 = var4;
      this.method4645();
   }

   void method4645() {
      long var2 = this.field2933;
      int var4 = this.field2928[5];
      int var5 = this.field2928[9];
      this.field2928[5] = var5;
      this.field2928[9] = var4;
      this.field2933 = 0L;

      int var6;
      for(var6 = 0; var6 < 12; ++var6) {
         this.field2933 <<= 4;
         if (this.field2928[var6] >= 256) {
            this.field2933 += (long)(this.field2928[var6] - 256);
         }
      }

      if (this.field2928[0] >= 256) {
         this.field2933 += (long)(this.field2928[0] - 256 >> 4);
      }

      if (this.field2928[1] >= 256) {
         this.field2933 += (long)(this.field2928[1] - 256 >> 8);
      }

      for(var6 = 0; var6 < 5; ++var6) {
         this.field2933 <<= 3;
         this.field2933 += (long)this.field2931[var6];
      }

      this.field2933 <<= 1;
      this.field2933 += (long)(this.field2930 ? 1 : 0);
      this.field2928[5] = var4;
      this.field2928[9] = var5;
      if (0L != var2 && var2 != this.field2933 || this.field2935) {
         field2937.method4315(var2);
      }

   }

   public class206 method4664(class158 var1, int var2, class158 var3, int var4) {
      if (this.field2936 != -1) {
         return class96.method2133(this.field2936).method2779(var1, var2, var3, var4);
      } else {
         long var6 = this.field2933;
         int[] var8 = this.field2928;
         if (var1 != null && (var1.field1866 >= 0 || var1.field1871 >= 0)) {
            var8 = new int[12];

            for(int var19 = 0; var19 < 12; ++var19) {
               var8[var19] = this.field2928[var19];
            }

            if (var1.field1866 >= 0) {
               var6 += (long)(var1.field1866 - this.field2928[5] << 40);
               var8[5] = var1.field1866;
            }

            if (var1.field1871 >= 0) {
               var6 += (long)(var1.field1871 - this.field2928[3] << 48);
               var8[3] = var1.field1871;
            }
         }

         class206 var9 = (class206)field2937.method4306(var6);
         if (var9 == null) {
            boolean var10 = false;

            int var12;
            for(int var11 = 0; var11 < 12; ++var11) {
               var12 = var8[var11];
               if (var12 >= 256 && var12 < 512 && !class70.method1801(var12 - 256).method2687()) {
                  var10 = true;
               }

               if (var12 >= 512 && !class10.method105(var12 - 512).method2991(this.field2930)) {
                  var10 = true;
               }
            }

            if (var10) {
               if (this.field2929 != -1L) {
                  var9 = (class206)field2937.method4306(this.field2929);
               }

               if (var9 == null) {
                  return null;
               }
            }

            if (var9 == null) {
               class192[] var20 = new class192[12];
               var12 = 0;

               int var14;
               for(int var13 = 0; var13 < 12; ++var13) {
                  var14 = var8[var13];
                  if (var14 >= 256 && var14 < 512) {
                     class192 var15 = class70.method1801(var14 - 256).method2709();
                     if (var15 != null) {
                        var20[var12++] = var15;
                     }
                  }

                  if (var14 >= 512) {
                     class156 var23 = class10.method105(var14 - 512);
                     class192 var16 = var23.method2989(this.field2930);
                     if (var16 != null) {
                        if (this.field2934 != null) {
                           class137 var17 = this.field2934[var13];
                           if (var17 != null) {
                              int var18;
                              if (var17.field1515 != null && var23.field1795 != null && var17.field1515.length == var23.field1796.length) {
                                 for(var18 = 0; var18 < var23.field1795.length; ++var18) {
                                    var16.method3766(var23.field1796[var18], var17.field1515[var18]);
                                 }
                              }

                              if (var17.field1518 != null && var23.field1797 != null && var23.field1798.length == var17.field1518.length) {
                                 for(var18 = 0; var18 < var23.field1797.length; ++var18) {
                                    var16.method3733(var23.field1798[var18], var17.field1518[var18]);
                                 }
                              }
                           }
                        }

                        var20[var12++] = var16;
                     }
                  }
               }

               class192 var22 = new class192(var20, var12);

               for(var14 = 0; var14 < 5; ++var14) {
                  if (this.field2931[var14] < class243.field2914[var14].length) {
                     var22.method3766(class282.field3634[var14], class243.field2914[var14][this.field2931[var14]]);
                  }

                  if (this.field2931[var14] < class208.field2498[var14].length) {
                     var22.method3766(class7.field25[var14], class208.field2498[var14][this.field2931[var14]]);
                  }
               }

               var9 = var22.method3740(64, 850, -30, -50, -30);
               field2937.method4308(var9, var6);
               this.field2929 = var6;
            }
         }

         if (var1 == null && var3 == null) {
            return var9;
         } else {
            class206 var21;
            if (var1 != null && var3 != null) {
               var21 = var1.method3072(var9, var2, var3, var4);
            } else if (var1 != null) {
               var21 = var1.method3084(var9, var2);
            } else {
               var21 = var3.method3084(var9, var4);
            }

            return var21;
         }
      }
   }

   class192 method4647() {
      if (this.field2936 != -1) {
         return class96.method2133(this.field2936).method2758();
      } else {
         boolean var2 = false;

         int var4;
         for(int var3 = 0; var3 < 12; ++var3) {
            var4 = this.field2928[var3];
            if (var4 >= 256 && var4 < 512 && !class70.method1801(var4 - 256).method2686()) {
               var2 = true;
            }

            if (var4 >= 512 && !class10.method105(var4 - 512).method2990(this.field2930)) {
               var2 = true;
            }
         }

         if (var2) {
            return null;
         } else {
            class192[] var8 = new class192[12];
            var4 = 0;

            int var6;
            for(int var5 = 0; var5 < 12; ++var5) {
               var6 = this.field2928[var5];
               class192 var7;
               if (var6 >= 256 && var6 < 512) {
                  var7 = class70.method1801(var6 - 256).method2692();
                  if (var7 != null) {
                     var8[var4++] = var7;
                  }
               }

               if (var6 >= 512) {
                  var7 = class10.method105(var6 - 512).method2978(this.field2930);
                  if (var7 != null) {
                     var8[var4++] = var7;
                  }
               }
            }

            class192 var9 = new class192(var8, var4);

            for(var6 = 0; var6 < 5; ++var6) {
               if (this.field2931[var6] < class243.field2914[var6].length) {
                  var9.method3766(class282.field3634[var6], class243.field2914[var6][this.field2931[var6]]);
               }

               if (this.field2931[var6] < class208.field2498[var6].length) {
                  var9.method3766(class7.field25[var6], class208.field2498[var6][this.field2931[var6]]);
               }
            }

            return var9;
         }
      }
   }

   public int method4661() {
      return this.field2936 == -1 ? (this.field2928[0] << 15) + this.field2928[1] + (this.field2928[11] << 5) + (this.field2928[8] << 10) + (this.field2931[0] << 25) + (this.field2931[4] << 20) : 305419896 + class96.method2133(this.field2936).field1626;
   }

   public void method4640(int[] var1, class137[] var2, boolean var3, int[] var4, boolean var5, int var6) {
      this.field2934 = var2;
      this.field2935 = var3;
      this.method4660(var1, var4, var5, var6);
   }

   public void method4653(int var1, boolean var2) {
      if (var1 != 1 || !this.field2930) {
         int var4 = this.field2928[field2932[var1]];
         if (var4 != 0) {
            var4 -= 256;

            class142 var5;
            do {
               if (!var2) {
                  --var4;
                  if (var4 < 0) {
                     var4 = class142.field1563 - 1;
                  }
               } else {
                  ++var4;
                  if (var4 >= class142.field1563) {
                     var4 = 0;
                  }
               }

               var5 = class70.method1801(var4);
            } while(var5 == null || var5.field1572 || var1 + (this.field2930 ? 7 : 0) != var5.field1565);

            this.field2928[field2932[var1]] = var4 + 256;
            this.method4645();
         }
      }
   }

   public void method4646(int var1, boolean var2) {
      int var4 = this.field2931[var1];
      if (!var2) {
         do {
            --var4;
            if (var4 < 0) {
               var4 = class243.field2914[var1].length - 1;
            }
         } while(!class15.method162(var1, var4));
      } else {
         do {
            ++var4;
            if (var4 >= class243.field2914[var1].length) {
               var4 = 0;
            }
         } while(!class15.method162(var1, var4));
      }

      this.field2931[var1] = var4;
      this.method4645();
   }

   public void method4643(boolean var1) {
      if (this.field2930 != var1) {
         this.method4660((int[])null, this.field2931, var1, -1);
      }
   }

   public void method4644(class384 var1) {
      var1.writeByte(this.field2930 ? 1 : 0);

      int var3;
      for(var3 = 0; var3 < 7; ++var3) {
         int var4 = this.field2928[field2932[var3]];
         if (var4 == 0) {
            var1.writeByte(-1);
         } else {
            var1.writeByte(var4 - 256);
         }
      }

      for(var3 = 0; var3 < 5; ++var3) {
         var1.writeByte(this.field2931[var3]);
      }

   }

   static int method4677(int var0, class58 var1, boolean var2) {
      int var4;
      int var5;
      int var7;
      if (var0 == 3400) {
         class50.field745 -= 2;
         var4 = class50.field746[class50.field745];
         var5 = class50.field746[class50.field745 + 1];
         class145 var6 = class99.method2143(var4);
         if (var6.field1598 != 's') {
         }

         for(var7 = 0; var7 < var6.field1601; ++var7) {
            if (var5 == var6.field1602[var7]) {
               class50.field737[++class1.field3 - 1] = var6.field1604[var7];
               var6 = null;
               break;
            }
         }

         if (var6 != null) {
            class50.field737[++class1.field3 - 1] = var6.field1599;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            var4 = class50.field746[--class50.field745];
            class145 var11 = class99.method2143(var4);
            class50.field746[++class50.field745 - 1] = var11.method2742();
            return 1;
         } else {
            return 2;
         }
      } else {
         class50.field745 -= 4;
         var4 = class50.field746[class50.field745];
         var5 = class50.field746[class50.field745 + 1];
         int var10 = class50.field746[class50.field745 + 2];
         var7 = class50.field746[class50.field745 + 3];
         class145 var8 = class99.method2143(var10);
         if (var4 == var8.field1595 && var5 == var8.field1598) {
            for(int var9 = 0; var9 < var8.field1601; ++var9) {
               if (var7 == var8.field1602[var9]) {
                  if (var5 == 115) {
                     class50.field737[++class1.field3 - 1] = var8.field1604[var9];
                  } else {
                     class50.field746[++class50.field745 - 1] = var8.field1605[var9];
                  }

                  var8 = null;
                  break;
               }
            }

            if (var8 != null) {
               if (var5 == 115) {
                  class50.field737[++class1.field3 - 1] = var8.field1599;
               } else {
                  class50.field746[++class50.field745 - 1] = var8.field1603;
               }
            }

            return 1;
         } else {
            if (var5 == 115) {
               class50.field737[++class1.field3 - 1] = "null";
            } else {
               class50.field746[++class50.field745 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static int method4676(int var0) {
      class44 var2 = (class44)class84.field1193.method6297((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var2.field3958 == class84.field1194.field3730 ? -1 : ((class44)var2.field3958).field377;
      }
   }
}
