import java.util.zip.CRC32;

public class class274 extends class276 {
   static CRC32 field3568;
   boolean field3566;
   class333 field3563;
   class333 field3565;
   int field3560;
   int field3562;
   int field3569;
   int field3571;
   volatile boolean field3570;
   volatile boolean[] field3567;

   static {
      field3568 = new CRC32();
   }

   public class274(class333 var1, class333 var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field3570 = false;
      this.field3566 = false;
      this.field3571 = -1;
      this.field3563 = var1;
      this.field3565 = var2;
      this.field3562 = var3;
      this.field3566 = var6;
      int var8 = this.field3562;
      if (class277.field3602 != null) {
         class277.field3602.field4181 = (var8 * 8 + 5) * 99;
         int var9 = class277.field3602.method6784();
         int var10 = class277.field3602.method6784();
         this.method4881(var9, var10);
      } else {
         class133.method2592((class274)null, 255, 255, 0, (byte)0, true);
         class277.field3611[var8] = this;
      }

   }

   void vmethod4930(int var1) {
      if (this.field3563 != null && this.field3567 != null && this.field3567[var1]) {
         class333 var3 = this.field3563;
         byte[] var5 = null;
         synchronized(class273.field3557) {
            for(class272 var7 = (class272)class273.field3557.method5202(); var7 != null; var7 = (class272)class273.field3557.method5193()) {
               if ((long)var1 == var7.field3965 && var3 == var7.field3551 && var7.field3554 == 0) {
                  var5 = var7.field3550;
                  break;
               }
            }
         }

         if (var5 != null) {
            this.method4883(var3, var1, var5, true);
         } else {
            byte[] var6 = var3.method5918(var1);
            this.method4883(var3, var1, var6, true);
         }
      } else {
         class133.method2592(this, this.field3562, var1, super.field3583[var1], (byte)2, true);
      }

   }

   public boolean method4878(int var1) {
      return this.method4989(var1) != null;
   }

   int vmethod4979(int var1) {
      if (super.field3587[var1] != null) {
         return 100;
      } else if (this.field3567[var1]) {
         return 100;
      } else {
         int var4 = this.field3562;
         long var5 = (long)((var4 << 16) + var1);
         int var3;
         if (class277.field3594 != null && var5 == class277.field3594.field3965) {
            var3 = class93.field1247.field4181 / (class93.field1247.payload.length - class277.field3594.field3572) + 1;
         } else {
            var3 = 0;
         }

         return var3;
      }
   }

   void method4899() {
      this.field3567 = new boolean[super.field3587.length];

      int var2;
      for(var2 = 0; var2 < this.field3567.length; ++var2) {
         this.field3567[var2] = false;
      }

      if (this.field3563 == null) {
         this.field3570 = true;
      } else {
         this.field3571 = -1;

         for(var2 = 0; var2 < this.field3567.length; ++var2) {
            if (super.field3582[var2] > 0) {
               class333 var3 = this.field3563;
               class272 var5 = new class272();
               var5.field3554 = 1;
               var5.field3965 = (long)var2;
               var5.field3551 = var3;
               var5.field3549 = this;
               synchronized(class273.field3557) {
                  class273.field3557.method5187(var5);
               }

               synchronized(class273.field3558) {
                  if (class273.field3556 == 0) {
                     class273.field3559 = new Thread(new class273());
                     class273.field3559.setDaemon(true);
                     class273.field3559.start();
                     class273.field3559.setPriority(5);
                  }

                  class273.field3556 = 600;
               }

               this.field3571 = var2;
            }
         }

         if (this.field3571 == -1) {
            this.field3570 = true;
         }

      }
   }

   void vmethod4919(int var1) {
      class136.method2604(this.field3562, var1);
   }

   public boolean method4886(int var1) {
      return this.field3567[var1];
   }

   void method4883(class333 var1, int var2, byte[] var3, boolean var4) {
      int var6;
      if (var1 == this.field3565) {
         if (this.field3570) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            class133.method2592(this, 255, this.field3562, this.field3569, (byte)0, true);
            return;
         }

         field3568.reset();
         field3568.update(var3, 0, var3.length);
         var6 = (int)field3568.getValue();
         if (var6 != this.field3569) {
            class133.method2592(this, 255, this.field3562, this.field3569, (byte)0, true);
            return;
         }

         class384 var12 = new class384(class46.method897(var3));
         int var13 = var12.method6560();
         if (var13 != 5 && var13 != 6) {
            throw new RuntimeException(var13 + "," + this.field3562 + "," + var2);
         }

         int var9 = 0;
         if (var13 >= 6) {
            var9 = var12.method6784();
         }

         if (var9 != this.field3560) {
            class133.method2592(this, 255, this.field3562, this.field3569, (byte)0, true);
            return;
         }

         this.method4918(var3);
         this.method4899();
      } else {
         if (!var4 && var2 == this.field3571) {
            this.field3570 = true;
         }

         if (var3 == null || var3.length <= 2) {
            this.field3567[var2] = false;
            if (this.field3566 || var4) {
               class133.method2592(this, this.field3562, var2, super.field3583[var2], (byte)2, var4);
            }

            return;
         }

         field3568.reset();
         field3568.update(var3, 0, var3.length - 2);
         var6 = (int)field3568.getValue();
         int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (var6 != super.field3583[var2] || var7 != super.field3584[var2]) {
            this.field3567[var2] = false;
            if (this.field3566 || var4) {
               class133.method2592(this, this.field3562, var2, super.field3583[var2], (byte)2, var4);
            }

            return;
         }

         this.field3567[var2] = true;
         if (var4) {
            Object[] var8 = super.field3587;
            Object var10;
            if (var3 == null) {
               var10 = null;
            } else if (var3.length > 136) {
               class254 var11 = new class254();
               var11.vmethod4787(var3);
               var10 = var11;
            } else {
               var10 = var3;
            }

            var8[var2] = var10;
         }
      }

   }

   public void method4881(int var1, int var2) {
      this.field3569 = var1;
      this.field3560 = var2;
      if (this.field3565 != null) {
         int var4 = this.field3562;
         class333 var5 = this.field3565;
         byte[] var7 = null;
         synchronized(class273.field3557) {
            for(class272 var9 = (class272)class273.field3557.method5202(); var9 != null; var9 = (class272)class273.field3557.method5193()) {
               if ((long)var4 == var9.field3965 && var5 == var9.field3551 && var9.field3554 == 0) {
                  var7 = var9.field3550;
                  break;
               }
            }
         }

         if (var7 != null) {
            this.method4883(var5, var4, var7, true);
         } else {
            byte[] var8 = var5.method5918(var4);
            this.method4883(var5, var4, var8, true);
         }
      } else {
         class133.method2592(this, 255, this.field3562, this.field3569, (byte)0, true);
      }

   }

   public int method4914() {
      if (this.field3570) {
         return 100;
      } else if (super.field3587 != null) {
         return 99;
      } else {
         int var3 = this.field3562;
         long var4 = (long)(var3 + 16711680);
         int var2;
         if (class277.field3594 != null && class277.field3594.field3965 == var4) {
            var2 = class93.field1247.field4181 / (class93.field1247.payload.length - class277.field3594.field3572) + 1;
         } else {
            var2 = 0;
         }

         int var6 = var2;
         if (var2 >= 100) {
            var6 = 99;
         }

         return var6;
      }
   }

   public void method4905(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field3570) {
            throw new RuntimeException();
         }

         if (this.field3565 != null) {
            int var6 = this.field3562;
            class333 var7 = this.field3565;
            class272 var8 = new class272();
            var8.field3554 = 0;
            var8.field3965 = (long)var6;
            var8.field3550 = var2;
            var8.field3551 = var7;
            synchronized(class273.field3557) {
               class273.field3557.method5187(var8);
            }

            synchronized(class273.field3558) {
               if (class273.field3556 == 0) {
                  class273.field3559 = new Thread(new class273());
                  class273.field3559.setDaemon(true);
                  class273.field3559.start();
                  class273.field3559.setPriority(5);
               }

               class273.field3556 = 600;
            }
         }

         this.method4918(var2);
         this.method4899();
      } else {
         var2[var2.length - 2] = (byte)(super.field3584[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field3584[var1];
         if (this.field3563 != null) {
            class333 var14 = this.field3563;
            class272 var20 = new class272();
            var20.field3554 = 0;
            var20.field3965 = (long)var1;
            var20.field3550 = var2;
            var20.field3551 = var14;
            synchronized(class273.field3557) {
               class273.field3557.method5187(var20);
            }

            synchronized(class273.field3558) {
               if (class273.field3556 == 0) {
                  class273.field3559 = new Thread(new class273());
                  class273.field3559.setDaemon(true);
                  class273.field3559.start();
                  class273.field3559.setPriority(5);
               }

               class273.field3556 = 600;
            }

            this.field3567[var1] = true;
         }

         if (var4) {
            Object[] var22 = super.field3587;
            Object var21;
            if (var2 == null) {
               var21 = null;
            } else if (var2.length > 136) {
               class254 var9 = new class254();
               var9.vmethod4787(var2);
               var21 = var9;
            } else {
               var21 = var2;
            }

            var22[var1] = var21;
         }
      }

   }

   public int method4888() {
      int var2 = 0;
      int var3 = 0;

      int var4;
      for(var4 = 0; var4 < super.field3587.length; ++var4) {
         if (super.field3582[var4] > 0) {
            var2 += 100;
            var3 += this.vmethod4979(var4);
         }
      }

      if (var2 == 0) {
         return 100;
      } else {
         var4 = var3 * 100 / var2;
         return var4;
      }
   }

   public boolean method4877() {
      return this.field3570;
   }
}
