import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class class134 extends class330 implements Runnable {
   boolean field1490;
   boolean field1496;
   byte[] field1493;
   class130 field1489;
   class136 field1495;
   int field1491;
   int field1492;
   InputStream field1498;
   OutputStream field1488;
   Socket field1487;
   final int field1494;
   final int field1497;

   public class134(Socket var1, class130 var2, int var3) throws IOException {
      this.field1490 = false;
      this.field1491 = 0;
      this.field1492 = 0;
      this.field1496 = false;
      this.field1489 = var2;
      this.field1487 = var1;
      this.field1497 = var3;
      this.field1494 = var3 - 100;
      this.field1487.setSoTimeout(30000);
      this.field1487.setTcpNoDelay(true);
      this.field1487.setReceiveBufferSize(65536);
      this.field1487.setSendBufferSize(65536);
      this.field1498 = this.field1487.getInputStream();
      this.field1488 = this.field1487.getOutputStream();
   }

   public void method5279() {
      if (!this.field1490) {
         synchronized(this) {
            this.field1490 = true;
            this.notifyAll();
         }

         if (this.field1495 != null) {
            while(0 == this.field1495.field1511) {
               class210.method3831(1L);
            }

            if (1 == this.field1495.field1511) {
               try {
                  ((Thread)this.field1495.field1510).join();
               } catch (InterruptedException var4) {
               }
            }
         }

         this.field1495 = null;
      }
   }

   public static final class25 method2307(class130 var0, int var1, int var2) {
      if (class282.field3634 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            class25 var4 = class182.field2087.method652();
            var4.field183 = new int[256 * (class25.field199 ? 2 : 1)];
            var4.field181 = var2;
            var4.method398();
            var4.field187 = 1024 + (var2 & -1024);
            if (var4.field187 > 16384) {
               var4.field187 = 16384;
            }

            var4.method399(var4.field187);
            if (class25.field182 > 0 && null == class212.field2518) {
               class212.field2518 = new class27();
               class334.field3903 = Executors.newScheduledThreadPool(1);
               class334.field3903.scheduleAtFixedRate(class212.field2518, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (null != class212.field2518) {
               if (class212.field2518.field219[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class212.field2518.field219[var1] = var4;
            }

            return var4;
         } catch (Throwable var5) {
            return new class25();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   protected void finalize() {
      this.method5279();
   }

   public int method5281() throws IOException {
      return this.field1490 ? 0 : this.field1498.read();
   }

   public int available() throws IOException {
      return this.field1490 ? 0 : this.field1498.available();
   }

   public boolean method5294(int var1) throws IOException {
      if (this.field1490) {
         return false;
      } else {
         return this.field1498.available() >= var1;
      }
   }

   public int method5282(byte[] var1, int var2, int var3) throws IOException {
      if (this.field1490) {
         return 0;
      } else {
         int var5;
         int var6;
         for(var5 = var3; var3 > 0; var3 -= var6) {
            var6 = this.field1498.read(var1, var2, var3);
            if (var6 <= 0) {
               throw new EOFException();
            }

            var2 += var6;
         }

         return var5;
      }
   }

   void method2308(byte[] var1, int var2, int var3) throws IOException {
      if (!this.field1490) {
         if (this.field1496) {
            this.field1496 = false;
            throw new IOException();
         } else {
            if (this.field1493 == null) {
               this.field1493 = new byte[this.field1497];
            }

            synchronized(this) {
               for(int var6 = 0; var6 < var3; ++var6) {
                  this.field1493[this.field1492] = var1[var6 + var2];
                  this.field1492 = (1 + this.field1492) % this.field1497;
                  if ((this.field1491 + this.field1494) % this.field1497 == this.field1492) {
                     throw new IOException();
                  }
               }

               if (this.field1495 == null) {
                  this.field1495 = this.field1489.method2257(this, 3);
               }

               this.notifyAll();
            }
         }
      }
   }

   static void method2317(class275 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var7 = (long)((var1 << 16) + var2);
      CacheBuffer var9 = (CacheBuffer) JS5Worker.pendingPriority.method5746(var7);
      if (var9 == null) {
         var9 = (CacheBuffer) JS5Worker.pendingPriorityReceived.method5746(var7);
         if (var9 == null) {
            var9 = (CacheBuffer) JS5Worker.field3615.method5746(var7);
            if (null != var9) {
               if (var5) {
                  var9.method5435();
                  JS5Worker.pendingPriority.put(var9, var7);
                  --JS5Worker.pendingCount;
                  ++JS5Worker.pendingPriorityCount;
               }

            } else {
               if (!var5) {
                  var9 = (CacheBuffer) JS5Worker.field3611.method5746(var7);
                  if (var9 != null) {
                     return;
                  }
               }

               var9 = new CacheBuffer();
               var9.field3577 = var0;
               var9.field3574 = var3;
               var9.field3573 = var4;
               if (var5) {
                  JS5Worker.pendingPriority.put(var9, var7);
                  ++JS5Worker.pendingPriorityCount;
               } else {
                  JS5Worker.field3602.method4659(var9);
                  JS5Worker.field3615.put(var9, var7);
                  ++JS5Worker.pendingCount;
               }

            }
         }
      }
   }

   public void run() {
      try {
         while(true) {
            label84: {
               int var1;
               int var2;
               synchronized(this) {
                  if (this.field1492 == this.field1491) {
                     if (this.field1490) {
                        break label84;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var9) {
                     }
                  }

                  var2 = this.field1491;
                  if (this.field1492 >= this.field1491) {
                     var1 = this.field1492 - this.field1491;
                  } else {
                     var1 = this.field1497 - this.field1491;
                  }
               }

               if (var1 <= 0) {
                  continue;
               }

               try {
                  this.field1488.write(this.field1493, var2, var1);
               } catch (IOException var8) {
                  this.field1496 = true;
               }

               this.field1491 = (this.field1491 + var1) % this.field1497;

               try {
                  if (this.field1492 == this.field1491) {
                     this.field1488.flush();
                  }
               } catch (IOException var7) {
                  this.field1496 = true;
               }
               continue;
            }

            try {
               if (null != this.field1498) {
                  this.field1498.close();
               }

               if (null != this.field1488) {
                  this.field1488.close();
               }

               if (this.field1487 != null) {
                  this.field1487.close();
               }
            } catch (IOException var6) {
            }

            this.field1493 = null;
            break;
         }
      } catch (Exception var11) {
         class333.method5330((String)null, var11);
      }

   }

   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.method2308(var1, var2, var3);
   }

   static final void method2306() {
      for(int var1 = 0; var1 < client.field685; ++var1) {
         int var2 = client.field450[var1];
         class78 var3 = client.field567[var2];
         if (null != var3) {
            class17.method142(var3, var3.field1132.field1622);
         }
      }

   }
}
