import java.util.Random;

public abstract class class302 extends class393 {
   public static class396[] field3740;
   static int field3734;
   static int field3736;
   static int field3742;
   static int field3743;
   static int field3744;
   static int field3745;
   static int field3748;
   static int field3749;
   static int field3750;
   static String[] field3752;
   static Random field3751;
   byte[] field3741;
   byte[][] field3731;
   int[] field3732;
   int[] field3733;
   int[] field3735;
   int[] field3746;
   int[] field3747;
   public int field3737;
   public int field3738;
   public int field3739;

   static {
      field3743 = -1;
      field3748 = -1;
      field3744 = -1;
      field3745 = -1;
      field3734 = 0;
      field3742 = 0;
      field3736 = 256;
      field3749 = 0;
      field3750 = 0;
      field3751 = new Random();
      field3752 = new String[100];
   }

   class302(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field3731 = new byte[256][];
      this.field3737 = 0;
      this.field3735 = var2;
      this.field3746 = var3;
      this.field3733 = var4;
      this.field3747 = var5;
      this.method5369(var1);
      this.field3731 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if (this.field3746[var10] < var8 && this.field3747[var10] != 0) {
            var8 = this.field3746[var10];
         }

         if (this.field3746[var10] + this.field3747[var10] > var9) {
            var9 = this.field3746[var10] + this.field3747[var10];
         }
      }

      this.field3738 = this.field3737 - var8;
      this.field3739 = var9 - this.field3737;
   }

   class302(byte[] var1) {
      this.field3731 = new byte[256][];
      this.field3737 = 0;
      this.method5369(var1);
   }

   void method5381(int var1, int var2) {
      field3743 = -1;
      field3748 = -1;
      field3744 = var2;
      field3745 = var2;
      field3734 = var1;
      field3742 = var1;
      field3736 = 256;
      field3749 = 0;
      field3750 = 0;
   }

   public int method5367(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = class277.method5010(var7.substring(4));
                              var4 += field3740[var8].field4266;
                              var3 = -1;
                           } catch (Exception var10) {
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.field3732[(char)(class273.method4875(var6) & 255)];
                  if (this.field3741 != null && var3 != -1) {
                     var4 += this.field3741[var6 + (var3 << 8)];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public int method5386(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.method5366('<');
                     if (this.field3741 != null && var11 != -1) {
                        var4 += this.field3741[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.method5366('>');
                     if (this.field3741 != null && var11 != -1) {
                        var4 += this.field3741[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = class277.method5010(var16.substring(4));
                        var4 += field3740[var17].field4266;
                        var11 = 0;
                     } catch (Exception var20) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.method5366(var15);
                     if (this.field3741 != null && var11 != -1) {
                        var4 += this.field3741[var15 + (var11 << 8)];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if (var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   void method5430(String var1, int var2, int var3) {
      var3 -= this.field3737;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(class273.method4875(var1.charAt(var6)) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              var9 = class277.method5010(var8.substring(4));
                              class396 var10 = field3740[var9];
                              var10.method6969(var2, var3 + this.field3737 - var10.field4267);
                              var2 += var10.field4266;
                              var5 = -1;
                           } catch (Exception var14) {
                           }
                        } else {
                           this.method5382(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.field3741 != null && var5 != -1) {
                     var2 += this.field3741[var7 + (var5 << 8)];
                  }

                  int var12 = this.field3733[var7];
                  var9 = this.field3747[var7];
                  if (var7 != ' ') {
                     if (field3736 == 256) {
                        if (field3745 != -1) {
                           method5387(this.field3731[var7], var2 + this.field3735[var7] + 1, var3 + this.field3746[var7] + 1, var12, var9, field3745);
                        }

                        this.vmethod5393(this.field3731[var7], var2 + this.field3735[var7], var3 + this.field3746[var7], var12, var9, field3742);
                     } else {
                        if (field3745 != -1) {
                           method5460(this.field3731[var7], var2 + this.field3735[var7] + 1, var3 + this.field3746[var7] + 1, var12, var9, field3745, field3736);
                        }

                        this.vmethod5364(this.field3731[var7], var2 + this.field3735[var7], var3 + this.field3746[var7], var12, var9, field3742, field3736);
                     }
                  } else if (field3749 > 0) {
                     field3750 += field3749;
                     var2 += field3750 >> 8;
                     field3750 &= 255;
                  }

                  int var13 = this.field3732[var7];
                  if (field3743 != -1) {
                     class393.method6886(var2, var3 + (int)((double)this.field3737 * 0.7D), var13, field3743);
                  }

                  if (field3748 != -1) {
                     class393.method6886(var2, var3 + this.field3737 + 1, var13, field3748);
                  }

                  var2 += var13;
                  var5 = var7;
               }
            }
         }
      }

   }

   void method5369(byte[] var1) {
      this.field3732 = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.field3732.length; ++var2) {
            this.field3732[var2] = var1[var2] & 255;
         }

         this.field3737 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field3732[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field3741 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if (var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.field3741[var8 + (var13 << 8)] = (byte)method5365(var11, var12, var4, this.field3732, var10, var13, var8);
                  }
               }
            }
         }

         this.field3737 = var4[32] + var10[32];
      }

   }

   void method5385(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field3737;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if (var1.charAt(var9) != 0) {
            char var10 = (char)(class273.method4875(var1.charAt(var9)) & 255);
            if (var10 == '<') {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if (var10 == '>' && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if (var11.equals("lt")) {
                     var10 = '<';
                  } else {
                     if (!var11.equals("gt")) {
                        if (var11.startsWith("img=")) {
                           try {
                              if (var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if (var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = class277.method5010(var11.substring(4));
                              class396 var15 = field3740[var14];
                              var15.method6969(var12 + var2, var13 + (var3 + this.field3737 - var15.field4267));
                              var2 += var15.field4266;
                              var7 = -1;
                           } catch (Exception var19) {
                           }
                        } else {
                           this.method5382(var11);
                        }
                        continue;
                     }

                     var10 = '>';
                  }
               }

               if (var10 == 160) {
                  var10 = ' ';
               }

               if (var6 == -1) {
                  if (this.field3741 != null && var7 != -1) {
                     var2 += this.field3741[var10 + (var7 << 8)];
                  }

                  int var17 = this.field3733[var10];
                  var12 = this.field3747[var10];
                  if (var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if (var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if (var10 != ' ') {
                     if (field3736 == 256) {
                        if (field3745 != -1) {
                           method5387(this.field3731[var10], var13 + var2 + this.field3735[var10] + 1, var3 + var14 + this.field3746[var10] + 1, var17, var12, field3745);
                        }

                        this.vmethod5393(this.field3731[var10], var13 + var2 + this.field3735[var10], var3 + var14 + this.field3746[var10], var17, var12, field3742);
                     } else {
                        if (field3745 != -1) {
                           method5460(this.field3731[var10], var13 + var2 + this.field3735[var10] + 1, var3 + var14 + this.field3746[var10] + 1, var17, var12, field3745, field3736);
                        }

                        this.vmethod5364(this.field3731[var10], var13 + var2 + this.field3735[var10], var3 + var14 + this.field3746[var10], var17, var12, field3742, field3736);
                     }
                  } else if (field3749 > 0) {
                     field3750 += field3749;
                     var2 += field3750 >> 8;
                     field3750 &= 255;
                  }

                  int var18 = this.field3732[var10];
                  if (field3743 != -1) {
                     class393.method6886(var2, var3 + (int)((double)this.field3737 * 0.7D), var18, field3743);
                  }

                  if (field3748 != -1) {
                     class393.method6886(var2, var3 + this.field3737, var18, field3748);
                  }

                  var2 += var18;
                  var7 = var10;
               }
            }
         }
      }

   }

   int method5366(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.field3732[class273.method4875(var1) & 255];
   }

   public int method5401(String var1, int var2) {
      return this.method5386(var1, new int[]{var2}, field3752);
   }

   void method5382(String var1) {
      try {
         if (var1.startsWith("col=")) {
            field3742 = class125.method2472(var1.substring(4), 16);
         } else if (var1.equals("/col")) {
            field3742 = field3734;
         } else {
            int var2;
            String var3;
            if (var1.startsWith("str=")) {
               var3 = var1.substring(4);
               var2 = class43.method852(var3, 16, true);
               field3743 = var2;
            } else if (var1.equals("str")) {
               field3743 = 8388608;
            } else if (var1.equals("/str")) {
               field3743 = -1;
            } else if (var1.startsWith("u=")) {
               field3748 = class125.method2472(var1.substring(2), 16);
            } else if (var1.equals("u")) {
               field3748 = 0;
            } else if (var1.equals("/u")) {
               field3748 = -1;
            } else if (var1.startsWith("shad=")) {
               var3 = var1.substring(5);
               var2 = class43.method852(var3, 16, true);
               field3745 = var2;
            } else if (var1.equals("shad")) {
               field3745 = 0;
            } else if (var1.equals("/shad")) {
               field3745 = field3744;
            } else if (var1.equals("br")) {
               this.method5381(field3734, field3744);
            }
         }
      } catch (Exception var5) {
      }

   }

   public int method5376(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var1 == null) {
         return 0;
      } else {
         this.method5381(var6, var7);
         if (var10 == 0) {
            var10 = this.field3737;
         }

         int[] var11 = new int[]{var4};
         if (var5 < var10 + this.field3738 + this.field3739 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method5386(var1, var11, field3752);
         if (var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if (var9 == 0) {
            var13 = var3 + this.field3738;
         } else if (var9 == 1) {
            var13 = var3 + (var5 - this.field3738 - this.field3739 - var10 * (var12 - 1)) / 2 + this.field3738;
         } else if (var9 == 2) {
            var13 = var3 + var5 - this.field3739 - var10 * (var12 - 1);
         } else {
            var14 = (var5 - this.field3738 - this.field3739 - var10 * (var12 - 1)) / (var12 + 1);
            if (var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + var14 + this.field3738;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if (var8 == 0) {
               this.method5430(field3752[var14], var2, var13);
            } else if (var8 == 1) {
               this.method5430(field3752[var14], var2 + (var4 - this.method5367(field3752[var14])) / 2, var13);
            } else if (var8 == 2) {
               this.method5430(field3752[var14], var2 + var4 - this.method5367(field3752[var14]), var13);
            } else if (var14 == var12 - 1) {
               this.method5430(field3752[var14], var2, var13);
            } else {
               this.method5383(field3752[var14], var4);
               this.method5430(field3752[var14], var2, var13);
               field3749 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   void method5383(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         field3749 = (var2 - this.method5367(var1) << 8) / var3;
      }

   }

   abstract void vmethod5393(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void vmethod5364(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public int method5421(String var1, int var2) {
      int var3 = this.method5386(var1, new int[]{var2}, field3752);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method5367(field3752[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public void method5441(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method5381(var4, var5);
         this.method5430(var1, var2 - this.method5367(var1) / 2, var3);
      }
   }

   public void method5380(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method5381(var4, var5);
         field3751.setSeed((long)var6);
         field3736 = 192 + (field3751.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((field3751.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method5385(var1, var2, var3, var7, (int[])null);
      }
   }

   public void method5372(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method5381(var4, var5);
         this.method5430(var1, var2, var3);
      }
   }

   public void method5440(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method5381(var4, var5);
         this.method5430(var1, var2 - this.method5367(var1), var3);
      }
   }

   public void method5377(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method5381(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method5385(var1, var2 - this.method5367(var1) / 2, var3, (int[])null, var7);
      }
   }

   public void method5392(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method5381(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method5385(var1, var2 - this.method5367(var1) / 2, var3, var7, var8);
      }
   }

   public void method5379(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null) {
         this.method5381(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if (var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method5385(var1, var2 - this.method5367(var1) / 2, var3, (int[])null, var10);
      }
   }

   public void method5384(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method5381(var4, var5);
         field3736 = var6;
         this.method5430(var1, var2, var3);
      }
   }

   static int method5365(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   static void method5387(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class393.field4244;
      int var7 = class393.field4244 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < class393.field4246) {
         var10 = class393.field4246 - var2;
         var4 -= var10;
         var2 = class393.field4246;
         var9 += var3 * var10;
         var6 += var10 * class393.field4244;
      }

      if (var2 + var4 > class393.field4243) {
         var4 -= var2 + var4 - class393.field4243;
      }

      if (var1 < class393.field4248) {
         var10 = class393.field4248 - var1;
         var3 -= var10;
         var1 = class393.field4248;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 + var1 > class393.field4247) {
         var10 = var3 + var1 - class393.field4247;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         method5388(class393.field4249, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   static void method5388(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method5390(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & '\uff00') * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & '\uff00') * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method5460(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class393.field4244;
      int var8 = class393.field4244 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < class393.field4246) {
         var11 = class393.field4246 - var2;
         var4 -= var11;
         var2 = class393.field4246;
         var10 += var3 * var11;
         var7 += var11 * class393.field4244;
      }

      if (var2 + var4 > class393.field4243) {
         var4 -= var2 + var4 - class393.field4243;
      }

      if (var1 < class393.field4248) {
         var11 = class393.field4248 - var1;
         var3 -= var11;
         var1 = class393.field4248;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 + var1 > class393.field4247) {
         var11 = var3 + var1 - class393.field4247;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         method5390(class393.field4249, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   public static String method5434(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }
}
