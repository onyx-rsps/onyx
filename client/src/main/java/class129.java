import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class129 implements Runnable {
   public static String field1462;
   public static String field1468;
   static class301 field1467;
   boolean field1466;
   class135 field1461;
   class135 field1464;
   Thread field1465;

   public class129() {
      this.field1464 = null;
      this.field1461 = null;
      this.field1466 = false;
      field1468 = "Unknown";
      field1462 = "1.6";

      try {
         field1468 = System.getProperty("java.vendor");
         field1462 = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.field1466 = false;
      this.field1465 = new Thread(this);
      this.field1465.setPriority(10);
      this.field1465.setDaemon(true);
      this.field1465.start();
   }

   final class135 method2529(int var1, int var2, int var3, Object var4) {
      class135 var6 = new class135();
      var6.field1511 = var1;
      var6.field1514 = var2;
      var6.field1513 = var4;
      synchronized(this) {
         if (this.field1461 != null) {
            this.field1461.field1506 = var6;
            this.field1461 = var6;
         } else {
            this.field1461 = this.field1464 = var6;
         }

         this.notify();
         return var6;
      }
   }

   public final class135 method2512(Runnable var1, int var2) {
      return this.method2529(2, var2, 0, var1);
   }

   public final class135 method2513(String var1, int var2) {
      return this.method2529(1, var2, 0, var1);
   }

   public final void method2523() {
      synchronized(this) {
         this.field1466 = true;
         this.notifyAll();
      }

      try {
         this.field1465.join();
      } catch (InterruptedException var4) {
      }

   }

   public final void run() {
      while(true) {
         class135 var1;
         synchronized(this) {
            while(true) {
               if (this.field1466) {
                  return;
               }

               if (this.field1464 != null) {
                  var1 = this.field1464;
                  this.field1464 = this.field1464.field1506;
                  if (this.field1464 == null) {
                     this.field1461 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var8) {
               }
            }
         }

         try {
            int var5 = var1.field1511;
            if (var5 == 1) {
               var1.field1509 = new Socket(InetAddress.getByName((String)var1.field1513), var1.field1514);
            } else if (var5 == 2) {
               Thread var3 = new Thread((Runnable)var1.field1513);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field1514);
               var1.field1509 = var3;
            } else if (var5 == 4) {
               var1.field1509 = new DataInputStream(((URL)var1.field1513).openStream());
            }

            var1.field1510 = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.field1510 = 2;
         }
      }
   }

   static void method2531(int var0, String var1, String var2, String var3) {
      class60 var5 = (class60)class84.field1195.get(var0);
      if (var5 == null) {
         var5 = new class60();
         class84.field1195.put(var0, var5);
      }

      class44 var6 = var5.method1665(var0, var1, var2, var3);
      class84.field1193.method6308(var6, (long)var6.field377);
      class84.field1194.method5324(var6);
      client.field601 = client.field592;
   }

   static final void method2514(int var0) {
      var0 = Math.min(Math.max(var0, 0), 255);
      if (var0 != class37.field307.field1118) {
         if (class37.field307.field1118 == 0 && client.field639 != -1) {
            class82.method1954(class108.field1325, client.field639, 0, var0, false);
            client.field647 = false;
         } else if (var0 == 0) {
            class59.method1659();
            client.field647 = false;
         } else {
            class360.method6281(var0);
         }

         class37.field307.field1118 = var0;
         class134.method2603();
      }

   }

   static class44 method2532(int var0) {
      return (class44)class84.field1193.method6297((long)var0);
   }
}
