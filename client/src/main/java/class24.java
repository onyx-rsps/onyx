import java.io.IOException;

public class class24 {
   protected static boolean field198;
   static class358 field201;
   static int field181;
   static int field184;
   static int field191;
   boolean field197;
   class30 field183;
   class30[] field189;
   class30[] field196;
   int field180;
   int field186;
   int field187;
   int field188;
   int field190;
   int field192;
   int field194;
   int field195;
   long field185;
   long field193;
   long field199;
   protected int[] field182;

   protected class24() {
      this.field194 = 32;
      this.field185 = class86.currentTime();
      this.field199 = 0L;
      this.field190 = 0;
      this.field187 = 0;
      this.field192 = 0;
      this.field193 = 0L;
      this.field197 = true;
      this.field195 = 0;
      this.field196 = new class30[8];
      this.field189 = new class30[8];
   }

   protected void vmethod470() throws Exception {
   }

   protected void vmethod462() {
   }

   public final synchronized void method451() {
      if (this.field182 != null) {
         long var2 = class86.currentTime();

         try {
            if (this.field199 != 0L) {
               if (var2 < this.field199) {
                  return;
               }

               this.vmethod459(this.field186);
               this.field199 = 0L;
               this.field197 = true;
            }

            int var4 = this.vmethod483();
            if (this.field192 - var4 > this.field190) {
               this.field190 = this.field192 - var4;
            }

            int var5 = this.field180 + this.field188;
            if (var5 + 256 > 16384) {
               var5 = 16128;
            }

            if (var5 + 256 > this.field186) {
               this.field186 += 1024;
               if (this.field186 > 16384) {
                  this.field186 = 16384;
               }

               this.vmethod462();
               this.vmethod459(this.field186);
               var4 = 0;
               this.field197 = true;
               if (var5 + 256 > this.field186) {
                  var5 = this.field186 - 256;
                  this.field188 = var5 - this.field180;
               }
            }

            while(var4 < var5) {
               this.method456(this.field182, 256);
               this.vmethod457();
               var4 += 256;
            }

            if (var2 > this.field193) {
               if (!this.field197) {
                  if (this.field190 == 0 && this.field187 == 0) {
                     this.vmethod462();
                     this.field199 = var2 + 2000L;
                     return;
                  }

                  this.field188 = Math.min(this.field187, this.field190);
                  this.field187 = this.field190;
               } else {
                  this.field197 = false;
               }

               this.field190 = 0;
               this.field193 = 2000L + var2;
            }

            this.field192 = var4;
         } catch (Exception var8) {
            this.vmethod462();
            this.field199 = 2000L + var2;
         }

         try {
            if (var2 > 500000L + this.field185) {
               var2 = this.field185;
            }

            while(var2 > 5000L + this.field185) {
               this.method455(256);
               this.field185 += (long)(256000 / class281.field3633);
            }
         } catch (Exception var7) {
            this.field185 = var2;
         }

      }
   }

   protected void vmethod459(int var1) throws Exception {
   }

   protected int vmethod483() throws Exception {
      return this.field186;
   }

   public final synchronized void method453() {
      this.field197 = true;

      try {
         this.vmethod470();
      } catch (Exception var3) {
         this.vmethod462();
         this.field199 = class86.currentTime() + 2000L;
      }

   }

   final void method455(int var1) {
      this.field195 -= var1;
      if (this.field195 < 0) {
         this.field195 = 0;
      }

      if (this.field183 != null) {
         this.field183.vmethod4574(var1);
      }

   }

   public final synchronized void method454() {
      if (class211.field2517 != null) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if (this == class211.field2517.field218[var3]) {
               class211.field2517.field218[var3] = null;
            }

            if (class211.field2517.field218[var3] != null) {
               var2 = false;
            }
         }

         if (var2) {
            class333.field3902.shutdownNow();
            class333.field3902 = null;
            class211.field2517 = null;
         }
      }

      this.vmethod462();
      this.field182 = null;
   }

   final void method449(class30 var1, int var2) {
      int var4 = var2 >> 5;
      class30 var5 = this.field189[var4];
      if (var5 == null) {
         this.field196[var4] = var1;
      } else {
         var5.field251 = var1;
      }

      this.field189[var4] = var1;
      var1.field253 = var2;
   }

   public final void method479() {
      this.field197 = true;
   }

   final void method456(int[] var1, int var2) {
      int var3 = var2;
      if (field198) {
         var3 = var2 << 1;
      }

      class308.method5546(var1, 0, var3);
      this.field195 -= var2;
      if (this.field183 != null && this.field195 <= 0) {
         this.field195 += class281.field3633 >> 4;
         class12.method121(this.field183);
         this.method449(this.field183, this.field183.vmethod716());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class30 var10;
         label103:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class30 var11 = this.field196[var7];

                  label97:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label97;
                        }

                        class40 var12 = var11.field252;
                        if (var12 != null && var12.field349 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field251;
                        } else {
                           var11.field250 = true;
                           int var13 = var11.vmethod4589();
                           var4 += var13;
                           if (var12 != null) {
                              var12.field349 += var13;
                           }

                           if (var4 >= this.field194) {
                              break label103;
                           }

                           class30 var14 = var11.vmethod4569();
                           if (var14 != null) {
                              for(int var15 = var11.field253; var14 != null; var14 = var11.vmethod4576()) {
                                 this.method449(var14, var15 * var14.vmethod716() >> 8);
                              }
                           }

                           class30 var18 = var11.field251;
                           var11.field251 = null;
                           if (var10 == null) {
                              this.field196[var7] = var18;
                           } else {
                              var10.field251 = var18;
                           }

                           if (var18 == null) {
                              this.field189[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class30 var16 = this.field196[var6];
            class30[] var17 = this.field196;
            this.field189[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field251;
               var16.field251 = null;
            }
         }
      }

      if (this.field195 < 0) {
         this.field195 = 0;
      }

      if (this.field183 != null) {
         this.field183.vmethod4573(var1, 0, var2);
      }

      this.field185 = class86.currentTime();
   }

   protected void vmethod457() throws Exception {
   }

   public final synchronized void method466(class30 var1) {
      this.field183 = var1;
   }

   protected void vmethod458() throws Exception {
   }

   public static class149 method463(int var0) {
      class149 var2 = (class149)class149.field1659.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class149.field1674.method4920(13, var0);
         var2 = new class149();
         var2.field1677 = var0;
         if (var3 != null) {
            var2.method2797(new class384(var3));
         }

         class149.field1659.method4308(var2, (long)var0);
         return var2;
      }
   }

   static boolean method510(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if (var8 == 0) {
               if (var9 == '-') {
                  var4 = true;
                  continue;
               }

               if (var9 == '+') {
                  continue;
               }
            }

            int var11;
            if (var9 >= '0' && var9 <= '9') {
               var11 = var9 - 48;
            } else if (var9 >= 'A' && var9 <= 'Z') {
               var11 = var9 - 55;
            } else {
               if (var9 < 'a' || var9 > 'z') {
                  return false;
               }

               var11 = var9 - 87;
            }

            if (var11 >= var1) {
               return false;
            }

            if (var4) {
               var11 = -var11;
            }

            int var10 = var6 * var1 + var11;
            if (var10 / var1 != var6) {
               return false;
            }

            var6 = var10;
            var5 = true;
         }

         return var5;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static class75 method497() {
      class368 var1 = null;
      class75 var2 = new class75();

      try {
         var1 = class77.method1897("", class68.field975.field3207, false);
         byte[] var3 = new byte[(int)var1.method6357()];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var1.method6363(var3, var4, var3.length - var4);
            if (var5 == -1) {
               throw new IOException();
            }
         }

         var2 = new class75(new class384(var3));
      } catch (Exception var7) {
      }

      try {
         if (var1 != null) {
            var1.method6360();
         }
      } catch (Exception var6) {
      }

      return var2;
   }

   static final void method460(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (!client.field543) {
         if (client.field544 * -286331153 < 500) {
            client.field484[client.field544 * -286331153] = var0;
            client.field550[client.field544 * -286331153] = var1;
            client.field547[client.field544 * -286331153] = var2;
            client.field548[client.field544 * -286331153] = var3;
            client.field677[client.field544 * -286331153] = var4;
            client.field546[client.field544 * -286331153] = var5;
            client.field673[client.field544 * -286331153] = var6;
            client.field544 += 15;
         }

      }
   }

   static final void method506() {
      class228 var1 = class148.method2788(class226.field2656, client.field452.field1204);
      client.field452.method2031(var1);

      for(class66 var2 = (class66)client.field568.method6317(); var2 != null; var2 = (class66)client.field568.method6320()) {
         if (var2.field948 == 0 || var2.field948 == 3) {
            class161.method3143(var2, true);
         }
      }

      if (client.field573 != null) {
         class80.method1934(client.field573);
         client.field573 = null;
      }

   }

   static String method473(class248 var0) {
      if (class103.method2182(class240.method4608(var0)) == 0) {
         return null;
      } else {
         return var0.field3042 != null && var0.field3042.trim().length() != 0 ? var0.field3042 : null;
      }
   }
}
