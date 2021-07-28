import java.io.EOFException;
import java.io.IOException;

public class class369 {
   byte[] field4134;
   byte[] field4137;
   class368 field4133;
   int field4139;
   int field4140;
   long field4132;
   long field4136;
   long field4138;
   long field4141;
   long field4142;
   long field4143;

   public class369(class368 var1, int var2, int var3) throws IOException {
      this.field4132 = -1L;
      this.field4138 = -1L;
      this.field4139 = 0;
      this.field4133 = var1;
      this.field4142 = this.field4143 = var1.method6357();
      this.field4134 = new byte[var2];
      this.field4137 = new byte[var3];
      this.field4141 = 0L;
   }

   void method6383() throws IOException {
      if (-1L != this.field4138) {
         if (this.field4138 != this.field4136 * -490411647L) {
            this.field4133.method6358(this.field4138);
            this.field4136 = this.field4138 * 9102639854618236545L;
         }

         this.field4133.method6364(this.field4137, 0, this.field4139 * -490411647);
         this.field4136 += (long)this.field4139;
         if (this.field4136 * -490411647L > this.field4143) {
            this.field4143 = this.field4136 * -490411647L;
         }

         long var2 = -1L;
         long var4 = -1L;
         if (this.field4138 >= this.field4132 && this.field4138 < (long)this.field4140 + this.field4132) {
            var2 = this.field4138;
         } else if (this.field4132 >= this.field4138 && this.field4132 < this.field4138 + (long)this.field4139 * -6947160076226074239L) {
            var2 = this.field4132;
         }

         if (this.field4138 + (long)this.field4139 * -6947160076226074239L > this.field4132 && this.field4138 + (long)this.field4139 * -6947160076226074239L <= this.field4132 + (long)this.field4140) {
            var4 = this.field4138 + (long)this.field4139 * -6947160076226074239L;
         } else if (this.field4132 + (long)this.field4140 > this.field4138 && this.field4132 + (long)this.field4140 <= this.field4138 + (long)this.field4139 * -6947160076226074239L) {
            var4 = this.field4132 + (long)this.field4140;
         }

         if (var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.field4137, (int)(var2 - this.field4138), this.field4134, (int)(var2 - this.field4132), var6);
         }

         this.field4138 = -1L;
         this.field4139 = 0;
      }

   }

   public void method6394(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (this.field4138 != -1L && this.field4141 >= this.field4138 && (long)var3 + this.field4141 <= (long)this.field4139 * -6947160076226074239L + this.field4138) {
            System.arraycopy(this.field4137, (int)(this.field4141 - this.field4138), var1, var2, var3);
            this.field4141 += (long)var3;
            return;
         }

         long var5 = this.field4141;
         int var8 = var3;
         int var9;
         if (this.field4141 >= this.field4132 && this.field4141 < (long)this.field4140 + this.field4132) {
            var9 = (int)((long)this.field4140 - (this.field4141 - this.field4132));
            if (var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.field4134, (int)(this.field4141 - this.field4132), var1, var2, var9);
            this.field4141 += (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if (var3 > this.field4134.length) {
            this.field4133.method6358(this.field4141);

            for(this.field4136 = this.field4141 * 9102639854618236545L; var3 > 0; var3 -= var9) {
               var9 = this.field4133.method6363(var1, var2, var3);
               if (var9 == -1) {
                  break;
               }

               this.field4136 = (this.field4136 * -490411647L + (long)var9) * 9102639854618236545L;
               this.field4141 += (long)var9;
               var2 += var9;
            }
         } else if (var3 > 0) {
            this.method6382();
            var9 = var3;
            if (var3 > this.field4140) {
               var9 = this.field4140;
            }

            System.arraycopy(this.field4134, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.field4141 += (long)var9;
         }

         if (this.field4138 != -1L) {
            if (this.field4138 > this.field4141 && var3 > 0) {
               var9 = var2 + (int)(this.field4138 - this.field4141);
               if (var9 > var3 + var2) {
                  var9 = var3 + var2;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field4141;
               }
            }

            long var14 = -1L;
            long var11 = -1L;
            if (this.field4138 >= var5 && this.field4138 < var5 + (long)var8) {
               var14 = this.field4138;
            } else if (var5 >= this.field4138 && var5 < (long)this.field4139 * -6947160076226074239L + this.field4138) {
               var14 = var5;
            }

            if ((long)this.field4139 * -6947160076226074239L + this.field4138 > var5 && (long)this.field4139 * -6947160076226074239L + this.field4138 <= var5 + (long)var8) {
               var11 = (long)this.field4139 * -6947160076226074239L + this.field4138;
            } else if (var5 + (long)var8 > this.field4138 && var5 + (long)var8 <= (long)this.field4139 * -6947160076226074239L + this.field4138) {
               var11 = var5 + (long)var8;
            }

            if (var14 > -1L && var11 > var14) {
               int var13 = (int)(var11 - var14);
               System.arraycopy(this.field4137, (int)(var14 - this.field4138), var1, (int)(var14 - var5) + var2, var13);
               if (var11 > this.field4141) {
                  var3 = (int)((long)var3 - (var11 - this.field4141));
                  this.field4141 = var11;
               }
            }
         }
      } catch (IOException var17) {
         this.field4136 = -9102639854618236545L;
         throw var17;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   public long method6396() {
      return this.field4142;
   }

   public void method6378(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field4141 = var1;
      }
   }

   public void method6380(byte[] var1) throws IOException {
      this.method6394(var1, 0, var1.length);
   }

   public void method6384(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.field4141 > this.field4142) {
            this.field4142 = this.field4141 + (long)var3;
         }

         if (-1L != this.field4138 && (this.field4141 < this.field4138 || this.field4141 > (long)this.field4139 * -6947160076226074239L + this.field4138)) {
            this.method6383();
         }

         if (-1L != this.field4138 && this.field4141 + (long)var3 > this.field4138 + (long)this.field4137.length) {
            int var5 = (int)((long)this.field4137.length - (this.field4141 - this.field4138));
            System.arraycopy(var1, var2, this.field4137, (int)(this.field4141 - this.field4138), var5);
            this.field4141 += (long)var5;
            var2 += var5;
            var3 -= var5;
            this.field4139 = this.field4137.length * 1289049729;
            this.method6383();
         }

         if (var3 <= this.field4137.length) {
            if (var3 > 0) {
               if (this.field4138 == -1L) {
                  this.field4138 = this.field4141;
               }

               System.arraycopy(var1, var2, this.field4137, (int)(this.field4141 - this.field4138), var3);
               this.field4141 += (long)var3;
               if (this.field4141 - this.field4138 > (long)this.field4139 * -6947160076226074239L) {
                  this.field4139 = (int)(this.field4141 - this.field4138) * 1289049729;
               }

            }
         } else {
            if (this.field4136 * -490411647L != this.field4141) {
               this.field4133.method6358(this.field4141);
               this.field4136 = this.field4141 * 9102639854618236545L;
            }

            this.field4133.method6364(var1, var2, var3);
            this.field4136 = (this.field4136 * -490411647L + (long)var3) * 9102639854618236545L;
            if (this.field4136 * -490411647L > this.field4143) {
               this.field4143 = this.field4136 * -490411647L;
            }

            long var10 = -1L;
            long var7 = -1L;
            if (this.field4141 >= this.field4132 && this.field4141 < this.field4132 + (long)this.field4140) {
               var10 = this.field4141;
            } else if (this.field4132 >= this.field4141 && this.field4132 < this.field4141 + (long)var3) {
               var10 = this.field4132;
            }

            if (this.field4141 + (long)var3 > this.field4132 && this.field4141 + (long)var3 <= (long)this.field4140 + this.field4132) {
               var7 = this.field4141 + (long)var3;
            } else if ((long)this.field4140 + this.field4132 > this.field4141 && this.field4132 + (long)this.field4140 <= this.field4141 + (long)var3) {
               var7 = this.field4132 + (long)this.field4140;
            }

            if (var10 > -1L && var7 > var10) {
               int var9 = (int)(var7 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - this.field4141), this.field4134, (int)(var10 - this.field4132), var9);
            }

            this.field4141 += (long)var3;
         }
      } catch (IOException var13) {
         this.field4136 = -9102639854618236545L;
         throw var13;
      }
   }

   void method6382() throws IOException {
      this.field4140 = 0;
      if (this.field4141 != this.field4136 * -490411647L) {
         this.field4133.method6358(this.field4141);
         this.field4136 = this.field4141 * 9102639854618236545L;
      }

      int var3;
      for(this.field4132 = this.field4141; this.field4140 < this.field4134.length; this.field4140 += var3) {
         int var2 = this.field4134.length - this.field4140;
         if (var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.field4133.method6363(this.field4134, this.field4140, var2);
         if (var3 == -1) {
            break;
         }

         this.field4136 = (this.field4136 * -490411647L + (long)var3) * 9102639854618236545L;
      }

   }

   public void method6398() throws IOException {
      this.method6383();
      this.field4133.method6360();
   }
}
