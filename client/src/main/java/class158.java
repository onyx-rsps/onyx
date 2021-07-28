public class class158 extends class348 {
   public static class276 field1858;
   public static class276 field1870;
   public static class276 field1874;
   static class222 field1857;
   static class222 field1860;
   int[] field1869;
   int[] field1873;
   public boolean field1868;
   public int field1859;
   public int field1861;
   public int field1863;
   public int field1866;
   public int field1867;
   public int field1871;
   public int field1872;
   public int field1875;
   public int[] field1862;
   public int[] field1864;
   public int[] field1865;

   static {
      field1860 = new class222(64);
      field1857 = new class222(100);
   }

   class158() {
      this.field1861 = -1;
      this.field1868 = false;
      this.field1863 = 5;
      this.field1866 = -1;
      this.field1871 = -1;
      this.field1872 = 99;
      this.field1867 = -1;
      this.field1859 = -1;
      this.field1875 = 2;
   }

   void method3068(class384 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method6655();
         this.field1864 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1864[var5] = var1.method6655();
         }

         this.field1862 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1862[var5] = var1.method6655();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1862[var5] += var1.method6655() << 16;
         }
      } else if (var2 == 2) {
         this.field1861 = var1.method6655();
      } else if (var2 == 3) {
         var4 = var1.method6560();
         this.field1869 = new int[var4 + 1];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1869[var5] = var1.method6560();
         }

         this.field1869[var4] = 9999999;
      } else if (var2 == 4) {
         this.field1868 = true;
      } else if (var2 == 5) {
         this.field1863 = var1.method6560();
      } else if (var2 == 6) {
         this.field1866 = var1.method6655();
      } else if (var2 == 7) {
         this.field1871 = var1.method6655();
      } else if (var2 == 8) {
         this.field1872 = var1.method6560();
      } else if (var2 == 9) {
         this.field1867 = var1.method6560();
      } else if (var2 == 10) {
         this.field1859 = var1.method6560();
      } else if (var2 == 11) {
         this.field1875 = var1.method6560();
      } else if (var2 == 12) {
         var4 = var1.method6560();
         this.field1873 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1873[var5] = var1.method6655();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1873[var5] += var1.method6655() << 16;
         }
      } else if (var2 == 13) {
         var4 = var1.method6560();
         this.field1865 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1865[var5] = var1.method6564();
         }
      }

   }

   public class206 method3084(class206 var1, int var2) {
      var2 = this.field1862[var2];
      class202 var4 = class119.method2402(var2 >> 16);
      var2 &= 65535;
      if (var4 == null) {
         return var1.method4133(true);
      } else {
         class206 var5 = var1.method4133(!var4.method4100(var2));
         var5.method4141(var4, var2);
         return var5;
      }
   }

   public class206 method3072(class206 var1, int var2, class158 var3, int var4) {
      var2 = this.field1862[var2];
      class202 var6 = class119.method2402(var2 >> 16);
      var2 &= 65535;
      if (var6 == null) {
         return var3.method3084(var1, var4);
      } else {
         var4 = var3.field1862[var4];
         class202 var7 = class119.method2402(var4 >> 16);
         var4 &= 65535;
         class206 var8;
         if (var7 == null) {
            var8 = var1.method4133(!var6.method4100(var2));
            var8.method4141(var6, var2);
            return var8;
         } else {
            var8 = var1.method4133(!var6.method4100(var2) & !var7.method4100(var4));
            var8.method4174(var6, var2, var7, var4, this.field1869);
            return var8;
         }
      }
   }

   class206 method3070(class206 var1, int var2, int var3) {
      var2 = this.field1862[var2];
      class202 var5 = class119.method2402(var2 >> 16);
      var2 &= 65535;
      if (var5 == null) {
         return var1.method4133(true);
      } else {
         class206 var6 = var1.method4133(!var5.method4100(var2));
         var3 &= 3;
         if (var3 == 1) {
            var6.method4182();
         } else if (var3 == 2) {
            var6.method4144();
         } else if (var3 == 3) {
            var6.method4162();
         }

         var6.method4141(var5, var2);
         if (var3 == 1) {
            var6.method4162();
         } else if (var3 == 2) {
            var6.method4144();
         } else if (var3 == 3) {
            var6.method4182();
         }

         return var6;
      }
   }

   class206 method3071(class206 var1, int var2) {
      var2 = this.field1862[var2];
      class202 var4 = class119.method2402(var2 >> 16);
      var2 &= 65535;
      if (var4 == null) {
         return var1.method4134(true);
      } else {
         class206 var5 = var1.method4134(!var4.method4100(var2));
         var5.method4141(var4, var2);
         return var5;
      }
   }

   public class206 method3088(class206 var1, int var2) {
      int var4 = this.field1862[var2];
      class202 var5 = class119.method2402(var4 >> 16);
      var4 &= 65535;
      if (var5 == null) {
         return var1.method4133(true);
      } else {
         class202 var6 = null;
         int var7 = 0;
         if (this.field1873 != null && var2 < this.field1873.length) {
            var7 = this.field1873[var2];
            var6 = class119.method2402(var7 >> 16);
            var7 &= 65535;
         }

         class206 var8;
         if (var6 != null && var7 != 65535) {
            var8 = var1.method4133(!var5.method4100(var4) & !var6.method4100(var7));
            var8.method4141(var5, var4);
            var8.method4141(var6, var7);
            return var8;
         } else {
            var8 = var1.method4133(!var5.method4100(var4));
            var8.method4141(var5, var4);
            return var8;
         }
      }
   }

   void method3069() {
      if (this.field1867 == -1) {
         if (this.field1869 != null) {
            this.field1867 = 2;
         } else {
            this.field1867 = 0;
         }
      }

      if (this.field1859 == -1) {
         if (this.field1869 != null) {
            this.field1859 = 2;
         } else {
            this.field1859 = 0;
         }
      }

   }

   void method3099(class384 var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method3068(var1, var3);
      }
   }

   static final void method3098() {
      class19.method369("Your friend list is full. Max of 200 for free users, and 400 for members");
   }

   static int method3096(int var0, class58 var1, boolean var2) {
      int var4;
      if (var0 == 3903) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = client.field619[var4].method5081();
         return 1;
      } else if (var0 == 3904) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = client.field619[var4].field3653;
         return 1;
      } else if (var0 == 3905) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = client.field619[var4].field3655;
         return 1;
      } else if (var0 == 3906) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = client.field619[var4].field3652;
         return 1;
      } else if (var0 == 3907) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = client.field619[var4].field3656;
         return 1;
      } else if (var0 == 3908) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = client.field619[var4].field3658;
         return 1;
      } else {
         int var13;
         if (var0 == 3910) {
            var4 = class50.field746[--class50.field745];
            var13 = client.field619[var4].method5078();
            class50.field746[++class50.field745 - 1] = var13 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var4 = class50.field746[--class50.field745];
            var13 = client.field619[var4].method5078();
            class50.field746[++class50.field745 - 1] = var13 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var4 = class50.field746[--class50.field745];
            var13 = client.field619[var4].method5078();
            class50.field746[++class50.field745 - 1] = var13 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var4 = class50.field746[--class50.field745];
            var13 = client.field619[var4].method5078();
            class50.field746[++class50.field745 - 1] = var13 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var14;
            if (var0 == 3914) {
               var14 = class50.field746[--class50.field745] == 1;
               if (class292.field3710 != null) {
                  class292.field3710.method5018(class278.field3619, var14);
               }

               return 1;
            } else if (var0 == 3915) {
               var14 = class50.field746[--class50.field745] == 1;
               if (class292.field3710 != null) {
                  class292.field3710.method5018(class278.field3617, var14);
               }

               return 1;
            } else if (var0 == 3916) {
               class50.field745 -= 2;
               var14 = class50.field746[class50.field745] == 1;
               boolean var5 = class50.field746[class50.field745 + 1] == 1;
               if (class292.field3710 != null) {
                  client.field517.field398 = var5;
                  class292.field3710.method5018(client.field517, var14);
               }

               return 1;
            } else if (var0 == 3917) {
               var14 = class50.field746[--class50.field745] == 1;
               if (class292.field3710 != null) {
                  class292.field3710.method5018(class278.field3615, var14);
               }

               return 1;
            } else if (var0 == 3918) {
               var14 = class50.field746[--class50.field745] == 1;
               if (class292.field3710 != null) {
                  class292.field3710.method5018(class278.field3618, var14);
               }

               return 1;
            } else if (var0 == 3919) {
               class50.field746[++class50.field745 - 1] = class292.field3710 == null ? 0 : class292.field3710.field3616.size();
               return 1;
            } else {
               class284 var12;
               if (var0 == 3920) {
                  var4 = class50.field746[--class50.field745];
                  var12 = (class284)class292.field3710.field3616.get(var4);
                  class50.field746[++class50.field745 - 1] = var12.field3647;
                  return 1;
               } else if (var0 == 3921) {
                  var4 = class50.field746[--class50.field745];
                  var12 = (class284)class292.field3710.field3616.get(var4);
                  class50.field737[++class1.field3 - 1] = var12.method5065();
                  return 1;
               } else if (var0 == 3922) {
                  var4 = class50.field746[--class50.field745];
                  var12 = (class284)class292.field3710.field3616.get(var4);
                  class50.field737[++class1.field3 - 1] = var12.method5066();
                  return 1;
               } else if (var0 == 3923) {
                  var4 = class50.field746[--class50.field745];
                  var12 = (class284)class292.field3710.field3616.get(var4);
                  long var6 = class86.currentTime() - class177.field2066 - var12.field3645;
                  int var8 = (int)(var6 / 3600000L);
                  int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
                  int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * '\uea60')) / 1000L);
                  String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                  class50.field737[++class1.field3 - 1] = var11;
                  return 1;
               } else if (var0 == 3924) {
                  var4 = class50.field746[--class50.field745];
                  var12 = (class284)class292.field3710.field3616.get(var4);
                  class50.field746[++class50.field745 - 1] = var12.field3646.field3652;
                  return 1;
               } else if (var0 == 3925) {
                  var4 = class50.field746[--class50.field745];
                  var12 = (class284)class292.field3710.field3616.get(var4);
                  class50.field746[++class50.field745 - 1] = var12.field3646.field3655;
                  return 1;
               } else if (var0 == 3926) {
                  var4 = class50.field746[--class50.field745];
                  var12 = (class284)class292.field3710.field3616.get(var4);
                  class50.field746[++class50.field745 - 1] = var12.field3646.field3653;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
