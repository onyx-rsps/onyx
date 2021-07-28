import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class331 implements Runnable {
   byte[] field3880;
   int field3881;
   int field3883;
   int field3884;
   IOException field3885;
   InputStream field3879;
   Thread field3882;

   class331(InputStream var1, int var2) {
      this.field3883 = 0;
      this.field3884 = 0;
      this.field3879 = var1;
      this.field3881 = var2 + 1;
      this.field3880 = new byte[this.field3881];
      this.field3882 = new Thread(this);
      this.field3882.setDaemon(true);
      this.field3882.start();
   }

   boolean method5877(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.field3881) {
         synchronized(this) {
            int var4;
            if (this.field3883 <= this.field3884) {
               var4 = this.field3884 - this.field3883;
            } else {
               var4 = this.field3881 - this.field3883 + this.field3884;
            }

            if (var4 < var1) {
               if (this.field3885 != null) {
                  throw new IOException(this.field3885.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method5875() throws IOException {
      synchronized(this) {
         if (this.field3884 == this.field3883) {
            if (this.field3885 != null) {
               throw new IOException(this.field3885.toString());
            } else {
               return -1;
            }
         } else {
            int var3 = this.field3880[this.field3883] & 255;
            this.field3883 = (this.field3883 + 1) % this.field3881;
            this.notifyAll();
            return var3;
         }
      }
   }

   int method5879(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var6;
            if (this.field3883 <= this.field3884) {
               var6 = this.field3884 - this.field3883;
            } else {
               var6 = this.field3881 - this.field3883 + this.field3884;
            }

            if (var3 > var6) {
               var3 = var6;
            }

            if (var3 == 0 && this.field3885 != null) {
               throw new IOException(this.field3885.toString());
            } else {
               if (var3 + this.field3883 <= this.field3881) {
                  System.arraycopy(this.field3880, this.field3883, var1, var2, var3);
               } else {
                  int var7 = this.field3881 - this.field3883;
                  System.arraycopy(this.field3880, this.field3883, var1, var2, var7);
                  System.arraycopy(this.field3880, 0, var1, var7 + var2, var3 - var7);
               }

               this.field3883 = (var3 + this.field3883) % this.field3881;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method5897() throws IOException {
      synchronized(this) {
         int var3;
         if (this.field3883 <= this.field3884) {
            var3 = this.field3884 - this.field3883;
         } else {
            var3 = this.field3881 - this.field3883 + this.field3884;
         }

         if (var3 <= 0 && this.field3885 != null) {
            throw new IOException(this.field3885.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   void method5882() {
      synchronized(this) {
         if (this.field3885 == null) {
            this.field3885 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field3882.join();
      } catch (InterruptedException var4) {
      }

   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field3885 != null) {
                  return;
               }

               if (this.field3883 == 0) {
                  var1 = this.field3881 - this.field3884 - 1;
               } else if (this.field3883 <= this.field3884) {
                  var1 = this.field3881 - this.field3884;
               } else {
                  var1 = this.field3883 - this.field3884 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var10) {
               }
            }
         }

         int var7;
         try {
            var7 = this.field3879.read(this.field3880, this.field3884, var1);
            if (var7 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var3 = var11;
            synchronized(this) {
               this.field3885 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field3884 = (var7 + this.field3884) % this.field3881;
         }
      }
   }

   public static void method5899() {
      class41.field355 = new class297();
   }
}
