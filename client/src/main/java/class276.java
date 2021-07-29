public abstract class class276 {
   static class402 field3589;
   static int field3591;
   boolean field3586;
   boolean field3592;
   class403 field3580;
   class403[] field3585;
   int field3593;
   int[] field3578;
   int[] field3579;
   int[] field3582;
   int[] field3583;
   int[] field3584;
   int[][] field3577;
   int[][] field3581;
   Object[] field3587;
   Object[][] field3588;
   public int field3590;

   static {
      field3589 = new class402();
      field3591 = 0;
   }

   class276(boolean var1, boolean var2) {
      this.field3586 = var1;
      this.field3592 = var2;
   }

   public int[] method4989(int var1) {
      return var1 >= 0 && var1 < this.field3581.length ? this.field3581[var1] : null;
   }

   public byte[] method4921(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field3588.length && this.field3588[var1] != null && var2 >= 0 && var2 < this.field3588[var1].length) {
         if (this.field3588[var1][var2] == null) {
            boolean var5 = this.method4980(var1, var3);
            if (!var5) {
               this.vmethod4930(var1);
               var5 = this.method4980(var1, var3);
               if (!var5) {
                  return null;
               }
            }
         }

         byte[] var6 = class240.method4610(this.field3588[var1][var2], false);
         if (this.field3592) {
            this.field3588[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   public int method4932() {
      return this.field3588.length;
   }

   public int method4946(int var1) {
      return this.field3588[var1].length;
   }

   public byte[] method4927(int var1) {
      if (this.field3588.length == 1) {
         return this.method4920(0, var1);
      } else if (this.field3588[var1].length == 1) {
         return this.method4920(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] method4928(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3588.length && this.field3588[var1] != null && var2 >= 0 && var2 < this.field3588[var1].length) {
         if (this.field3588[var1][var2] == null) {
            boolean var4 = this.method4980(var1, (int[])null);
            if (!var4) {
               this.vmethod4930(var1);
               var4 = this.method4980(var1, (int[])null);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class240.method4610(this.field3588[var1][var2], false);
         return var5;
      } else {
         return null;
      }
   }

   public boolean method5008(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3588.length && this.field3588[var1] != null && var2 >= 0 && var2 < this.field3588[var1].length) {
         if (this.field3588[var1][var2] != null) {
            return true;
         } else if (this.field3587[var1] != null) {
            return true;
         } else {
            this.vmethod4930(var1);
            return this.field3587[var1] != null;
         }
      } else {
         return false;
      }
   }

   public byte[] method4920(int var1, int var2) {
      return this.method4921(var1, var2, (int[])null);
   }

   void vmethod4930(int var1) {
   }

   public byte[] method4987(int var1) {
      if (this.field3588.length == 1) {
         return this.method4928(0, var1);
      } else if (this.field3588[var1].length == 1) {
         return this.method4928(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   int vmethod4979(int var1) {
      return this.field3587[var1] != null ? 100 : 0;
   }

   void method4918(byte[] var1) {
      this.field3590 = class228.method4345(var1, var1.length);
      Buffer var3 = new Buffer(class46.method897(var1));
      int var4 = var3.method6560();
      if (var4 >= 5 && var4 <= 7) {
         if (var4 >= 6) {
            var3.method6784();
         }

         int var5 = var3.method6560();
         if (var4 >= 7) {
            this.field3593 = var3.method6741();
         } else {
            this.field3593 = var3.method6655();
         }

         int var6 = 0;
         int var7 = -1;
         this.field3578 = new int[this.field3593];
         int var8;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field3593; ++var8) {
               this.field3578[var8] = var6 += var3.method6741();
               if (this.field3578[var8] > var7) {
                  var7 = this.field3578[var8];
               }
            }
         } else {
            for(var8 = 0; var8 < this.field3593; ++var8) {
               this.field3578[var8] = var6 += var3.method6655();
               if (this.field3578[var8] > var7) {
                  var7 = this.field3578[var8];
               }
            }
         }

         this.field3583 = new int[var7 + 1];
         this.field3584 = new int[var7 + 1];
         this.field3582 = new int[var7 + 1];
         this.field3581 = new int[var7 + 1][];
         this.field3587 = new Object[var7 + 1];
         this.field3588 = new Object[var7 + 1][];
         if (var5 != 0) {
            this.field3579 = new int[var7 + 1];

            for(var8 = 0; var8 < this.field3593; ++var8) {
               this.field3579[this.field3578[var8]] = var3.method6784();
            }

            this.field3580 = new class403(this.field3579);
         }

         for(var8 = 0; var8 < this.field3593; ++var8) {
            this.field3583[this.field3578[var8]] = var3.method6784();
         }

         for(var8 = 0; var8 < this.field3593; ++var8) {
            this.field3584[this.field3578[var8]] = var3.method6784();
         }

         for(var8 = 0; var8 < this.field3593; ++var8) {
            this.field3582[this.field3578[var8]] = var3.method6655();
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field3593; ++var8) {
               var9 = this.field3578[var8];
               var10 = this.field3582[var9];
               var6 = 0;
               var11 = -1;
               this.field3581[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field3581[var9][var12] = var6 += var3.method6741();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field3588[var9] = new Object[var11 + 1];
            }
         } else {
            for(var8 = 0; var8 < this.field3593; ++var8) {
               var9 = this.field3578[var8];
               var10 = this.field3582[var9];
               var6 = 0;
               var11 = -1;
               this.field3581[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field3581[var9][var12] = var6 += var3.method6655();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field3588[var9] = new Object[var11 + 1];
            }
         }

         if (var5 != 0) {
            this.field3577 = new int[var7 + 1][];
            this.field3585 = new class403[var7 + 1];

            for(var8 = 0; var8 < this.field3593; ++var8) {
               var9 = this.field3578[var8];
               var10 = this.field3582[var9];
               this.field3577[var9] = new int[this.field3588[var9].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.field3577[var9][this.field3581[var9][var11]] = var3.method6784();
               }

               this.field3585[var9] = new class403(this.field3577[var9]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public boolean method4976(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3580.method7136(class18.method346(var1));
      int var5 = this.field3585[var4].method7136(class18.method346(var2));
      return this.method5008(var4, var5);
   }

   void vmethod4919(int var1) {
   }

   public boolean method4924(int var1) {
      if (this.field3587[var1] != null) {
         return true;
      } else {
         this.vmethod4930(var1);
         return this.field3587[var1] != null;
      }
   }

   public boolean method4939(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3580.method7136(class18.method346(var1));
      if (var4 < 0) {
         return false;
      } else {
         int var5 = this.field3585[var4].method7136(class18.method346(var2));
         return var5 >= 0;
      }
   }

   public int method4936(String var1) {
      var1 = var1.toLowerCase();
      return this.field3580.method7136(class18.method346(var1));
   }

   public int method4938(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field3585[var1].method7136(class18.method346(var2));
   }

   public boolean method4947(int var1) {
      if (this.field3588.length == 1) {
         return this.method5008(0, var1);
      } else if (this.field3588[var1].length == 1) {
         return this.method5008(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   boolean method4980(int var1, int[] var2) {
      if (this.field3587[var1] == null) {
         return false;
      } else {
         int var4 = this.field3582[var1];
         int[] var5 = this.field3581[var1];
         Object[] var6 = this.field3588[var1];
         boolean var7 = true;

         for(int var8 = 0; var8 < var4; ++var8) {
            if (var6[var5[var8]] == null) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            return true;
         } else {
            byte[] var22;
            if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
               var22 = class240.method4610(this.field3587[var1], false);
            } else {
               var22 = class240.method4610(this.field3587[var1], true);
               Buffer var9 = new Buffer(var22);
               var9.method6654(var2, 5, var9.payload.length);
            }

            byte[] var26 = class46.method897(var22);
            if (this.field3586) {
               this.field3587[var1] = null;
            }

            int var11;
            if (var4 > 1) {
               int var10 = var26.length;
               --var10;
               var11 = var26[var10] & 255;
               var10 -= var11 * var4 * 4;
               Buffer var12 = new Buffer(var26);
               int[] var13 = new int[var4];
               var12.field4181 = var10 * 99;

               int var15;
               int var16;
               for(int var14 = 0; var14 < var11; ++var14) {
                  var15 = 0;

                  for(var16 = 0; var16 < var4; ++var16) {
                     var15 += var12.method6784();
                     var13[var16] += var15;
                  }
               }

               byte[][] var23 = new byte[var4][];

               for(var15 = 0; var15 < var4; ++var15) {
                  var23[var15] = new byte[var13[var15]];
                  var13[var15] = 0;
               }

               var12.field4181 = var10 * 99;
               var15 = 0;

               int var18;
               for(var16 = 0; var16 < var11; ++var16) {
                  int var17 = 0;

                  for(var18 = 0; var18 < var4; ++var18) {
                     var17 += var12.method6784();
                     System.arraycopy(var26, var15, var23[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var15 += var17;
                  }
               }

               for(var16 = 0; var16 < var4; ++var16) {
                  if (!this.field3592) {
                     var18 = var5[var16];
                     byte[] var20 = var23[var16];
                     Object var19;
                     if (var20 == null) {
                        var19 = null;
                     } else if (var20.length > 136) {
                        class254 var21 = new class254();
                        var21.vmethod4787(var20);
                        var19 = var21;
                     } else {
                        var19 = var20;
                     }

                     var6[var18] = var19;
                  } else {
                     var6[var5[var16]] = var23[var16];
                  }
               }
            } else if (!this.field3592) {
               var11 = var5[0];
               Object var27;
               if (var26 == null) {
                  var27 = null;
               } else if (var26.length > 136) {
                  class254 var28 = new class254();
                  var28.vmethod4787(var26);
                  var27 = var28;
               } else {
                  var27 = var26;
               }

               var6[var11] = var27;
            } else {
               var6[var5[0]] = var26;
            }

            return true;
         }
      }
   }

   public byte[] method4940(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3580.method7136(class18.method346(var1));
      int var5 = this.field3585[var4].method7136(class18.method346(var2));
      return this.method4920(var4, var5);
   }

   public void method4933() {
      for(int var2 = 0; var2 < this.field3587.length; ++var2) {
         this.field3587[var2] = null;
      }

   }

   public void method4935() {
      for(int var2 = 0; var2 < this.field3588.length; ++var2) {
         if (this.field3588[var2] != null) {
            for(int var3 = 0; var3 < this.field3588[var2].length; ++var3) {
               this.field3588[var2][var3] = null;
            }
         }
      }

   }

   public boolean method4925() {
      boolean var2 = true;

      for(int var3 = 0; var3 < this.field3578.length; ++var3) {
         int var4 = this.field3578[var3];
         if (this.field3587[var4] == null) {
            this.vmethod4930(var4);
            if (this.field3587[var4] == null) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public boolean method4942(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field3580.method7136(class18.method346(var1));
      return this.method4924(var3);
   }

   public int method4944(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field3580.method7136(class18.method346(var1));
      return this.vmethod4979(var3);
   }

   public void method4978(int var1) {
      for(int var3 = 0; var3 < this.field3588[var1].length; ++var3) {
         this.field3588[var1][var3] = null;
      }

   }

   public void method4943(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field3580.method7136(class18.method346(var1));
      if (var3 >= 0) {
         this.vmethod4919(var3);
      }
   }
}
