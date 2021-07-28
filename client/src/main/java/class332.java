import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;

public class class332 implements Runnable {
   static int[] field3896;
   boolean field3893;
   byte[] field3895;
   int field3886;
   int field3891;
   int field3894;
   IOException field3892;
   OutputStream field3890;
   Thread field3888;

   class332(OutputStream var1, int var2) {
      this.field3886 = 0;
      this.field3891 = 0;
      this.field3890 = var1;
      this.field3894 = var2 + 1;
      this.field3895 = new byte[this.field3894];
      this.field3888 = new Thread(this);
      this.field3888.setDaemon(true);
      this.field3888.start();
   }

   void method5916(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if (this.field3892 != null) {
               throw new IOException(this.field3892.toString());
            } else {
               int var6;
               if (this.field3886 <= this.field3891) {
                  var6 = this.field3894 - this.field3891 + this.field3886 - 1;
               } else {
                  var6 = this.field3886 - this.field3891 - 1;
               }

               if (var6 < var3) {
                  throw new IOException("");
               } else {
                  if (var3 + this.field3891 <= this.field3894) {
                     System.arraycopy(var1, var2, this.field3895, this.field3891, var3);
                  } else {
                     int var7 = this.field3894 - this.field3891;
                     System.arraycopy(var1, var2, this.field3895, this.field3891, var7);
                     System.arraycopy(var1, var7 + var2, this.field3895, 0, var3 - var7);
                  }

                  this.field3891 = (var3 + this.field3891) % this.field3894;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method5903() {
      synchronized(this) {
         this.field3893 = true;
         this.notifyAll();
      }

      try {
         this.field3888.join();
      } catch (InterruptedException var4) {
      }

   }

   boolean method5908() {
      if (this.field3893) {
         try {
            this.field3890.close();
            if (this.field3892 == null) {
               this.field3892 = new IOException("");
            }
         } catch (IOException var3) {
            if (this.field3892 == null) {
               this.field3892 = new IOException(var3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field3892 != null) {
                  return;
               }

               if (this.field3886 <= this.field3891) {
                  var1 = this.field3891 - this.field3886;
               } else {
                  var1 = this.field3894 - this.field3886 + this.field3891;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field3890.flush();
               } catch (IOException var11) {
                  this.field3892 = var11;
                  return;
               }

               if (this.method5908()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var12) {
               }
            }
         }

         try {
            if (var1 + this.field3886 <= this.field3894) {
               this.field3890.write(this.field3895, this.field3886, var1);
            } else {
               int var7 = this.field3894 - this.field3886;
               this.field3890.write(this.field3895, this.field3886, var7);
               this.field3890.write(this.field3895, 0, var1 - var7);
            }
         } catch (IOException var10) {
            IOException var2 = var10;
            synchronized(this) {
               this.field3892 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field3886 = (var1 + this.field3886) % this.field3894;
         }
      } while(!this.method5908());

   }

   public static void method5902(String var0, Throwable var1) {
      try {
         String var3 = "";
         if (var1 != null) {
            var3 = class398.method7118(var1);
         }

         if (var0 != null) {
            if (var1 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if (class408.field4317 == null) {
            return;
         }

         URL var4 = new URL(class408.field4317.getCodeBase(), "clienterror.ws?c=" + class408.field4316 + "&u=" + class408.field4315 + "&v1=" + class129.field1468 + "&v2=" + class129.field1462 + "&ct=" + class96.field1258 + "&e=" + var3);
         DataInputStream var5 = new DataInputStream(var4.openStream());
         var5.read();
         var5.close();
      } catch (Exception var6) {
      }

   }
}
