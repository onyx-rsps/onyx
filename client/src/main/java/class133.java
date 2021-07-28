import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class class133 extends class329 implements Runnable {
   boolean field1489;
   boolean field1495;
   byte[] field1492;
   class129 field1488;
   class135 field1494;
   int field1490;
   int field1491;
   InputStream field1497;
   OutputStream field1487;
   Socket field1486;
   final int field1493;
   final int field1496;

   public class133(Socket var1, class129 var2, int var3) throws IOException {
      this.field1489 = false;
      this.field1490 = 0;
      this.field1491 = 0;
      this.field1495 = false;
      this.field1488 = var2;
      this.field1486 = var1;
      this.field1496 = var3;
      this.field1493 = var3 - 100;
      this.field1486.setSoTimeout(30000);
      this.field1486.setTcpNoDelay(true);
      this.field1486.setReceiveBufferSize(65536);
      this.field1486.setSendBufferSize(65536);
      this.field1497 = this.field1486.getInputStream();
      this.field1487 = this.field1486.getOutputStream();
   }

   void method2568(byte[] var1, int var2, int var3) throws IOException {
      if (!this.field1489) {
         if (this.field1495) {
            this.field1495 = false;
            throw new IOException();
         } else {
            if (this.field1492 == null) {
               this.field1492 = new byte[this.field1496];
            }

            synchronized(this) {
               for(int var6 = 0; var6 < var3; ++var6) {
                  this.field1492[this.field1491] = var1[var6 + var2];
                  this.field1491 = (this.field1491 + 1) % this.field1496;
                  if ((this.field1490 + this.field1493) % this.field1496 == this.field1491) {
                     throw new IOException();
                  }
               }

               if (this.field1494 == null) {
                  this.field1494 = this.field1488.method2512(this, 3);
               }

               this.notifyAll();
            }
         }
      }
   }

   public void vmethod5858() {
      if (!this.field1489) {
         synchronized(this) {
            this.field1489 = true;
            this.notifyAll();
         }

         if (this.field1494 != null) {
            while(this.field1494.field1510 == 0) {
               class209.method4249(1L);
            }

            if (this.field1494.field1510 == 1) {
               try {
                  ((Thread)this.field1494.field1509).join();
               } catch (InterruptedException var4) {
               }
            }
         }

         this.field1494 = null;
      }
   }

   public boolean vmethod5862(int var1) throws IOException {
      if (this.field1489) {
         return false;
      } else {
         return this.field1497.available() >= var1;
      }
   }

   public int vmethod5856(byte[] var1, int var2, int var3) throws IOException {
      if (this.field1489) {
         return 0;
      } else {
         int var5;
         int var6;
         for(var5 = var3; var3 > 0; var3 -= var6) {
            var6 = this.field1497.read(var1, var2, var3);
            if (var6 <= 0) {
               throw new EOFException();
            }

            var2 += var6;
         }

         return var5;
      }
   }

   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.method2568(var1, var2, var3);
   }

   public int available() throws IOException {
      return this.field1489 ? 0 : this.field1497.available();
   }

   public int read() throws IOException {
      return this.field1489 ? 0 : this.field1497.read();
   }

   public void run() {
      try {
         while(true) {
            label84: {
               int var1;
               int var2;
               synchronized(this) {
                  if (this.field1491 == this.field1490) {
                     if (this.field1489) {
                        break label84;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var10) {
                     }
                  }

                  var2 = this.field1490;
                  if (this.field1491 >= this.field1490) {
                     var1 = this.field1491 - this.field1490;
                  } else {
                     var1 = this.field1496 - this.field1490;
                  }
               }

               if (var1 <= 0) {
                  continue;
               }

               try {
                  this.field1487.write(this.field1492, var2, var1);
               } catch (IOException var9) {
                  this.field1495 = true;
               }

               this.field1490 = (var1 + this.field1490) % this.field1496;

               try {
                  if (this.field1491 == this.field1490) {
                     this.field1487.flush();
                  }
               } catch (IOException var8) {
                  this.field1495 = true;
               }
               continue;
            }

            try {
               if (this.field1497 != null) {
                  this.field1497.close();
               }

               if (this.field1487 != null) {
                  this.field1487.close();
               }

               if (this.field1486 != null) {
                  this.field1486.close();
               }
            } catch (IOException var7) {
            }

            this.field1492 = null;
            break;
         }
      } catch (Exception var12) {
         class332.method5902((String)null, var12);
      }

   }

   protected void finalize() {
      this.vmethod5858();
   }

   static void method2592(class274 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var7 = (long)((var1 << 16) + var2);
      class275 var9 = (class275)class277.field3597.method6327(var7);
      if (var9 == null) {
         var9 = (class275)class277.field3599.method6327(var7);
         if (var9 == null) {
            var9 = (class275)class277.field3614.method6327(var7);
            if (var9 != null) {
               if (var5) {
                  var9.method6012();
                  class277.field3597.method6318(var9, var7);
                  --class277.field3603;
                  ++class277.field3598;
               }

            } else {
               if (!var5) {
                  var9 = (class275)class277.field3610.method6327(var7);
                  if (var9 != null) {
                     return;
                  }
               }

               var9 = new class275();
               var9.field3576 = var0;
               var9.field3573 = var3;
               var9.field3572 = var4;
               if (var5) {
                  class277.field3597.method6318(var9, var7);
                  ++class277.field3598;
               } else {
                  class277.field3601.method5174(var9);
                  class277.field3614.method6318(var9, var7);
                  ++class277.field3603;
               }

            }
         }
      }
   }

   public static final class24 method2566(class129 var0, int var1, int var2) {
      if (class281.field3633 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            class24 var4 = class181.field2086.vmethod732();
            var4.field182 = new int[256 * (class24.field198 ? 2 : 1)];
            var4.field180 = var2;
            var4.vmethod458();
            var4.field186 = (var2 & -1024) + 1024;
            if (var4.field186 > 16384) {
               var4.field186 = 16384;
            }

            var4.vmethod459(var4.field186);
            if (class24.field181 > 0 && class211.field2517 == null) {
               class211.field2517 = new class26();
               class333.field3902 = Executors.newScheduledThreadPool(1);
               class333.field3902.scheduleAtFixedRate(class211.field2517, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class211.field2517 != null) {
               if (class211.field2517.field218[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class211.field2517.field218[var1] = var4;
            }

            return var4;
         } catch (Throwable var5) {
            return new class24();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method2561() {
      for(int var1 = 0; var1 < client.field684; ++var1) {
         int var2 = client.field449[var1];
         class77 var3 = client.field566[var2];
         if (var3 != null) {
            class16.method177(var3, var3.field1131.field1621);
         }
      }

   }
}
