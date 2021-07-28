public class class29 extends class30 {
   boolean field245;
   int field235;
   int field236;
   int field237;
   int field238;
   int field239;
   int field240;
   int field241;
   int field242;
   int field243;
   int field244;
   int field246;
   int field247;
   int field248;
   int field249;

   class29(class22 var1, int var2, int var3, int var4) {
      super.field252 = var1;
      this.field240 = var1.field165;
      this.field235 = var1.field166;
      this.field245 = var1.field167;
      this.field236 = var2;
      this.field237 = var3;
      this.field238 = var4;
      this.field242 = 0;
      this.method555();
   }

   class29(class22 var1, int var2, int var3) {
      super.field252 = var1;
      this.field240 = var1.field165;
      this.field235 = var1.field166;
      this.field245 = var1.field167;
      this.field236 = var2;
      this.field237 = var3;
      this.field238 = 8192;
      this.field242 = 0;
      this.method555();
   }

   public synchronized int method561() {
      return this.field238 < 0 ? -1 : this.field238;
   }

   synchronized void method558(int var1) {
      this.method559(var1, this.method561());
   }

   synchronized void method559(int var1, int var2) {
      this.field237 = var1;
      this.field238 = var2;
      this.field244 = 0;
      this.method555();
   }

   public synchronized void method566(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method559(var2, var3);
      } else {
         int var4 = method660(var2, var3);
         int var5 = method634(var2, var3);
         if (var4 == this.field247 && var5 == this.field241) {
            this.field244 = 0;
         } else {
            int var6 = var2 - this.field239;
            if (this.field239 - var2 > var6) {
               var6 = this.field239 - var2;
            }

            if (var4 - this.field247 > var6) {
               var6 = var4 - this.field247;
            }

            if (this.field247 - var4 > var6) {
               var6 = this.field247 - var4;
            }

            if (var5 - this.field241 > var6) {
               var6 = var5 - this.field241;
            }

            if (this.field241 - var5 > var6) {
               var6 = this.field241 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field244 = var1;
            this.field237 = var2;
            this.field238 = var3;
            this.field243 = (var2 - this.field239) / var1;
            this.field248 = (var4 - this.field247) / var1;
            this.field249 = (var5 - this.field241) / var1;
         }
      }
   }

   public synchronized void vmethod4573(int[] var1, int var2, int var3) {
      if (this.field237 == 0 && this.field244 == 0) {
         this.vmethod4574(var3);
      } else {
         class22 var4 = (class22)super.field252;
         int var5 = this.field240 << 8;
         int var6 = this.field235 << 8;
         int var7 = var4.field164.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field246 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field242 < 0) {
            if (this.field236 <= 0) {
               this.method610();
               this.method6014();
               return;
            }

            this.field242 = 0;
         }

         if (this.field242 >= var7) {
            if (this.field236 >= 0) {
               this.method610();
               this.method6014();
               return;
            }

            this.field242 = var7 - 1;
         }

         if (this.field246 < 0) {
            if (this.field245) {
               if (this.field236 < 0) {
                  var9 = this.method687(var1, var2, var5, var3, var4.field164[this.field240]);
                  if (this.field242 >= var5) {
                     return;
                  }

                  this.field242 = var5 + var5 - 1 - this.field242;
                  this.field236 = -this.field236;
               }

               while(true) {
                  var9 = this.method696(var1, var9, var6, var3, var4.field164[this.field235 - 1]);
                  if (this.field242 < var6) {
                     return;
                  }

                  this.field242 = var6 + var6 - 1 - this.field242;
                  this.field236 = -this.field236;
                  var9 = this.method687(var1, var9, var5, var3, var4.field164[this.field240]);
                  if (this.field242 >= var5) {
                     return;
                  }

                  this.field242 = var5 + var5 - 1 - this.field242;
                  this.field236 = -this.field236;
               }
            } else if (this.field236 < 0) {
               while(true) {
                  var9 = this.method687(var1, var9, var5, var3, var4.field164[this.field235 - 1]);
                  if (this.field242 >= var5) {
                     return;
                  }

                  this.field242 = var6 - 1 - (var6 - 1 - this.field242) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method696(var1, var9, var6, var3, var4.field164[this.field240]);
                  if (this.field242 < var6) {
                     return;
                  }

                  this.field242 = var5 + (this.field242 - var5) % var8;
               }
            }
         } else {
            if (this.field246 > 0) {
               if (this.field245) {
                  label130: {
                     if (this.field236 < 0) {
                        var9 = this.method687(var1, var2, var5, var3, var4.field164[this.field240]);
                        if (this.field242 >= var5) {
                           return;
                        }

                        this.field242 = var5 + var5 - 1 - this.field242;
                        this.field236 = -this.field236;
                        if (--this.field246 == 0) {
                           break label130;
                        }
                     }

                     do {
                        var9 = this.method696(var1, var9, var6, var3, var4.field164[this.field235 - 1]);
                        if (this.field242 < var6) {
                           return;
                        }

                        this.field242 = var6 + var6 - 1 - this.field242;
                        this.field236 = -this.field236;
                        if (--this.field246 == 0) {
                           break;
                        }

                        var9 = this.method687(var1, var9, var5, var3, var4.field164[this.field240]);
                        if (this.field242 >= var5) {
                           return;
                        }

                        this.field242 = var5 + var5 - 1 - this.field242;
                        this.field236 = -this.field236;
                     } while(--this.field246 != 0);
                  }
               } else {
                  int var10;
                  if (this.field236 < 0) {
                     while(true) {
                        var9 = this.method687(var1, var9, var5, var3, var4.field164[this.field235 - 1]);
                        if (this.field242 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field242) / var8;
                        if (var10 >= this.field246) {
                           this.field242 += var8 * this.field246;
                           this.field246 = 0;
                           break;
                        }

                        this.field242 += var8 * var10;
                        this.field246 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method696(var1, var9, var6, var3, var4.field164[this.field240]);
                        if (this.field242 < var6) {
                           return;
                        }

                        var10 = (this.field242 - var5) / var8;
                        if (var10 >= this.field246) {
                           this.field242 -= var8 * this.field246;
                           this.field246 = 0;
                           break;
                        }

                        this.field242 -= var8 * var10;
                        this.field246 -= var10;
                     }
                  }
               }
            }

            if (this.field236 < 0) {
               this.method687(var1, var9, 0, var3, 0);
               if (this.field242 < 0) {
                  this.field242 = -1;
                  this.method610();
                  this.method6014();
               }
            } else {
               this.method696(var1, var9, var7, var3, 0);
               if (this.field242 >= var7) {
                  this.field242 = var7;
                  this.method610();
                  this.method6014();
               }
            }

         }
      }
   }

   public synchronized void vmethod4574(int var1) {
      if (this.field244 > 0) {
         if (var1 >= this.field244) {
            if (this.field237 == Integer.MIN_VALUE) {
               this.field237 = 0;
               this.field241 = 0;
               this.field247 = 0;
               this.field239 = 0;
               this.method6014();
               var1 = this.field244;
            }

            this.field244 = 0;
            this.method555();
         } else {
            this.field239 += this.field243 * var1;
            this.field247 += this.field248 * var1;
            this.field241 += this.field249 * var1;
            this.field244 -= var1;
         }
      }

      class22 var2 = (class22)super.field252;
      int var3 = this.field240 << 8;
      int var4 = this.field235 << 8;
      int var5 = var2.field164.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field246 = 0;
      }

      if (this.field242 < 0) {
         if (this.field236 <= 0) {
            this.method610();
            this.method6014();
            return;
         }

         this.field242 = 0;
      }

      if (this.field242 >= var5) {
         if (this.field236 >= 0) {
            this.method610();
            this.method6014();
            return;
         }

         this.field242 = var5 - 1;
      }

      this.field242 += this.field236 * var1;
      if (this.field246 < 0) {
         if (!this.field245) {
            if (this.field236 < 0) {
               if (this.field242 >= var3) {
                  return;
               }

               this.field242 = var4 - 1 - (var4 - 1 - this.field242) % var6;
            } else {
               if (this.field242 < var4) {
                  return;
               }

               this.field242 = var3 + (this.field242 - var3) % var6;
            }

         } else {
            if (this.field236 < 0) {
               if (this.field242 >= var3) {
                  return;
               }

               this.field242 = var3 + var3 - 1 - this.field242;
               this.field236 = -this.field236;
            }

            while(this.field242 >= var4) {
               this.field242 = var4 + var4 - 1 - this.field242;
               this.field236 = -this.field236;
               if (this.field242 >= var3) {
                  return;
               }

               this.field242 = var3 + var3 - 1 - this.field242;
               this.field236 = -this.field236;
            }

         }
      } else {
         if (this.field246 > 0) {
            if (this.field245) {
               label120: {
                  if (this.field236 < 0) {
                     if (this.field242 >= var3) {
                        return;
                     }

                     this.field242 = var3 + var3 - 1 - this.field242;
                     this.field236 = -this.field236;
                     if (--this.field246 == 0) {
                        break label120;
                     }
                  }

                  do {
                     if (this.field242 < var4) {
                        return;
                     }

                     this.field242 = var4 + var4 - 1 - this.field242;
                     this.field236 = -this.field236;
                     if (--this.field246 == 0) {
                        break;
                     }

                     if (this.field242 >= var3) {
                        return;
                     }

                     this.field242 = var3 + var3 - 1 - this.field242;
                     this.field236 = -this.field236;
                  } while(--this.field246 != 0);
               }
            } else {
               label152: {
                  int var7;
                  if (this.field236 < 0) {
                     if (this.field242 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field242) / var6;
                     if (var7 >= this.field246) {
                        this.field242 += var6 * this.field246;
                        this.field246 = 0;
                        break label152;
                     }

                     this.field242 += var6 * var7;
                     this.field246 -= var7;
                  } else {
                     if (this.field242 < var4) {
                        return;
                     }

                     var7 = (this.field242 - var3) / var6;
                     if (var7 >= this.field246) {
                        this.field242 -= var6 * this.field246;
                        this.field246 = 0;
                        break label152;
                     }

                     this.field242 -= var6 * var7;
                     this.field246 -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field236 < 0) {
            if (this.field242 < 0) {
               this.field242 = -1;
               this.method610();
               this.method6014();
            }
         } else if (this.field242 >= var5) {
            this.field242 = var5;
            this.method610();
            this.method6014();
         }

      }
   }

   void method555() {
      this.field239 = this.field237;
      this.field247 = method660(this.field237, this.field238);
      this.field241 = method634(this.field237, this.field238);
   }

   public synchronized void method562(int var1) {
      int var2 = ((class22)super.field252).field164.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field242 = var1;
   }

   protected class30 vmethod4576() {
      return null;
   }

   public boolean method623() {
      return this.field242 < 0 || this.field242 >= ((class22)super.field252).field164.length << 8;
   }

   public synchronized void method568(int var1) {
      if (this.field236 < 0) {
         this.field236 = -var1;
      } else {
         this.field236 = var1;
      }

   }

   public synchronized void method567(int var1) {
      if (var1 == 0) {
         this.method558(0);
         this.method6014();
      } else if (this.field247 == 0 && this.field241 == 0) {
         this.field244 = 0;
         this.field237 = 0;
         this.field239 = 0;
         this.method6014();
      } else {
         int var2 = -this.field239;
         if (this.field239 > var2) {
            var2 = this.field239;
         }

         if (-this.field247 > var2) {
            var2 = -this.field247;
         }

         if (this.field247 > var2) {
            var2 = this.field247;
         }

         if (-this.field241 > var2) {
            var2 = -this.field241;
         }

         if (this.field241 > var2) {
            var2 = this.field241;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field244 = var1;
         this.field237 = Integer.MIN_VALUE;
         this.field243 = -this.field239 / var1;
         this.field248 = -this.field247 / var1;
         this.field249 = -this.field241 / var1;
      }
   }

   public boolean method571() {
      return this.field244 != 0;
   }

   void method610() {
      if (this.field244 != 0) {
         if (this.field237 == Integer.MIN_VALUE) {
            this.field237 = 0;
         }

         this.field244 = 0;
         this.method555();
      }

   }

   public synchronized void method563(boolean var1) {
      this.field236 = (this.field236 ^ this.field236 >> 31) + (this.field236 >>> 31);
      this.field236 = -this.field236;
   }

   protected class30 vmethod4569() {
      return null;
   }

   int vmethod716() {
      int var1 = this.field239 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field246 == 0) {
         var1 -= var1 * this.field242 / (((class22)super.field252).field164.length << 8);
      } else if (this.field246 >= 0) {
         var1 -= var1 * this.field240 / ((class22)super.field252).field164.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   public synchronized int method569() {
      return this.field236 < 0 ? -this.field236 : this.field236;
   }

   boolean method579() {
      int var1 = this.field237;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method660(var1, this.field238);
         var3 = method634(var1, this.field238);
      }

      if (var1 == this.field239 && var2 == this.field247 && var3 == this.field241) {
         if (this.field237 == Integer.MIN_VALUE) {
            this.field237 = 0;
            this.field241 = 0;
            this.field247 = 0;
            this.field239 = 0;
            this.method6014();
            return true;
         } else {
            this.method555();
            return false;
         }
      } else {
         if (this.field239 < var1) {
            this.field243 = 1;
            this.field244 = var1 - this.field239;
         } else if (this.field239 > var1) {
            this.field243 = -1;
            this.field244 = this.field239 - var1;
         } else {
            this.field243 = 0;
         }

         if (this.field247 < var2) {
            this.field248 = 1;
            if (this.field244 == 0 || this.field244 > var2 - this.field247) {
               this.field244 = var2 - this.field247;
            }
         } else if (this.field247 > var2) {
            this.field248 = -1;
            if (this.field244 == 0 || this.field244 > this.field247 - var2) {
               this.field244 = this.field247 - var2;
            }
         } else {
            this.field248 = 0;
         }

         if (this.field241 < var3) {
            this.field249 = 1;
            if (this.field244 == 0 || this.field244 > var3 - this.field241) {
               this.field244 = var3 - this.field241;
            }
         } else if (this.field241 > var3) {
            this.field249 = -1;
            if (this.field244 == 0 || this.field244 > this.field241 - var3) {
               this.field244 = this.field241 - var3;
            }
         } else {
            this.field249 = 0;
         }

         return false;
      }
   }

   int method696(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field244 > 0) {
            int var6 = var2 + this.field244;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field244 += var2;
            if (this.field236 == 256 && (this.field242 & 255) == 0) {
               if (class24.field198) {
                  var2 = method589(0, ((class22)super.field252).field164, var1, this.field242, var2, this.field247, this.field241, this.field248, this.field249, 0, var6, var3, this);
               } else {
                  var2 = method588(((class22)super.field252).field164, var1, this.field242, var2, this.field239, this.field243, 0, var6, var3, this);
               }
            } else if (class24.field198) {
               var2 = method593(0, 0, ((class22)super.field252).field164, var1, this.field242, var2, this.field247, this.field241, this.field248, this.field249, 0, var6, var3, this, this.field236, var5);
            } else {
               var2 = method592(0, 0, ((class22)super.field252).field164, var1, this.field242, var2, this.field239, this.field243, 0, var6, var3, this, this.field236, var5);
            }

            this.field244 -= var2;
            if (this.field244 != 0) {
               return var2;
            }

            if (!this.method579()) {
               continue;
            }

            return var4;
         }

         if (this.field236 == 256 && (this.field242 & 255) == 0) {
            if (class24.field198) {
               return method581(0, ((class22)super.field252).field164, var1, this.field242, var2, this.field247, this.field241, 0, var4, var3, this);
            }

            return method580(((class22)super.field252).field164, var1, this.field242, var2, this.field239, 0, var4, var3, this);
         }

         if (class24.field198) {
            return method585(0, 0, ((class22)super.field252).field164, var1, this.field242, var2, this.field247, this.field241, 0, var4, var3, this, this.field236, var5);
         }

         return method584(0, 0, ((class22)super.field252).field164, var1, this.field242, var2, this.field239, 0, var4, var3, this, this.field236, var5);
      }
   }

   int method687(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field244 > 0) {
            int var6 = var2 + this.field244;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field244 += var2;
            if (this.field236 == -256 && (this.field242 & 255) == 0) {
               if (class24.field198) {
                  var2 = method591(0, ((class22)super.field252).field164, var1, this.field242, var2, this.field247, this.field241, this.field248, this.field249, 0, var6, var3, this);
               } else {
                  var2 = method590(((class22)super.field252).field164, var1, this.field242, var2, this.field239, this.field243, 0, var6, var3, this);
               }
            } else if (class24.field198) {
               var2 = method553(0, 0, ((class22)super.field252).field164, var1, this.field242, var2, this.field247, this.field241, this.field248, this.field249, 0, var6, var3, this, this.field236, var5);
            } else {
               var2 = method594(0, 0, ((class22)super.field252).field164, var1, this.field242, var2, this.field239, this.field243, 0, var6, var3, this, this.field236, var5);
            }

            this.field244 -= var2;
            if (this.field244 != 0) {
               return var2;
            }

            if (!this.method579()) {
               continue;
            }

            return var4;
         }

         if (this.field236 == -256 && (this.field242 & 255) == 0) {
            if (class24.field198) {
               return method583(0, ((class22)super.field252).field164, var1, this.field242, var2, this.field247, this.field241, 0, var4, var3, this);
            }

            return method655(((class22)super.field252).field164, var1, this.field242, var2, this.field239, 0, var4, var3, this);
         }

         if (class24.field198) {
            return method587(0, 0, ((class22)super.field252).field164, var1, this.field242, var2, this.field247, this.field241, 0, var4, var3, this, this.field236, var5);
         }

         return method586(0, 0, ((class22)super.field252).field164, var1, this.field242, var2, this.field239, 0, var4, var3, this, this.field236, var5);
      }
   }

   public synchronized int method560() {
      return this.field237 == Integer.MIN_VALUE ? 0 : this.field237;
   }

   public synchronized void method641(int var1) {
      this.field246 = var1;
   }

   protected int vmethod4589() {
      return this.field237 == 0 && this.field244 == 0 ? 0 : 1;
   }

   public synchronized void method565(int var1, int var2) {
      this.method566(var1, var2, this.method561());
   }

   public synchronized void method557(int var1) {
      this.method559(var1 << 6, this.method561());
   }

   static int method660(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int method634(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   static int method584(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class29 var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field242 = var4;
      return var5;
   }

   static int method586(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class29 var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field242 = var4;
      return var5;
   }

   static int method580(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class29 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field242 = var2 << 8;
      return var3;
   }

   static int method585(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class29 var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field242 = var4;
      return var5 >> 1;
   }

   static int method655(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class29 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field242 = var2 << 8;
      return var3;
   }

   static int method587(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class29 var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field242 = var4;
      return var5 >> 1;
   }

   static int method581(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class29 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field242 = var3 << 8;
      return var4 >> 1;
   }

   static int method583(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class29 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field242 = var3 << 8;
      return var4 >> 1;
   }

   static int method592(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class29 var11, int var12, int var13) {
      var11.field247 -= var11.field248 * var5;
      var11.field241 -= var11.field249 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field247 += var11.field248 * var5;
      var11.field241 += var11.field249 * var5;
      var11.field239 = var6;
      var11.field242 = var4;
      return var5;
   }

   static int method594(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class29 var11, int var12, int var13) {
      var11.field247 -= var11.field248 * var5;
      var11.field241 -= var11.field249 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field247 += var11.field248 * var5;
      var11.field241 += var11.field249 * var5;
      var11.field239 = var6;
      var11.field242 = var4;
      return var5;
   }

   static int method588(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class29 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field247 += var9.field248 * (var6 - var3);
      var9.field241 += var9.field249 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field239 = var4 >> 2;
      var9.field242 = var2 << 8;
      return var3;
   }

   static int method590(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class29 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field247 += var9.field248 * (var6 - var3);
      var9.field241 += var9.field249 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field239 = var4 >> 2;
      var9.field242 = var2 << 8;
      return var3;
   }

   static int method593(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class29 var13, int var14, int var15) {
      var13.field239 -= var5 * var13.field243;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field239 += var13.field243 * var5;
      var13.field247 = var6;
      var13.field241 = var7;
      var13.field242 = var4;
      return var5;
   }

   static int method553(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class29 var13, int var14, int var15) {
      var13.field239 -= var5 * var13.field243;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field239 += var13.field243 * var5;
      var13.field247 = var6;
      var13.field241 = var7;
      var13.field242 = var4;
      return var5;
   }

   static int method589(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class29 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var11 + var4 - var3) > var10) {
         var9 = var10;
      }

      var12.field239 += var12.field243 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field247 = var5 >> 2;
      var12.field241 = var6 >> 2;
      var12.field242 = var3 << 8;
      return var4 >> 1;
   }

   static int method591(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class29 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field239 += var12.field243 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field247 = var5 >> 2;
      var12.field241 = var6 >> 2;
      var12.field242 = var3 << 8;
      return var4 >> 1;
   }

   public static class29 method554(class22 var0, int var1, int var2, int var3) {
      return var0.field164 != null && var0.field164.length != 0 ? new class29(var0, var1, var2, var3) : null;
   }

   public static class29 method609(class22 var0, int var1, int var2) {
      return var0.field164 != null && var0.field164.length != 0 ? new class29(var0, (int)((long)var0.field163 * 256L * (long)var1 / (long)(class281.field3633 * 100)), var2 << 6) : null;
   }
}
