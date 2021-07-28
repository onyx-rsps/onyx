import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class class86 implements Runnable {
   Queue field1219;
   final Thread field1216;
   volatile boolean field1217;

   public class86() {
      this.field1219 = new LinkedList();
      this.field1216 = new Thread(this);
      this.field1216.setPriority(1);
      this.field1216.start();
   }

   public void method2052() {
      this.field1217 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1216.join();
      } catch (InterruptedException var5) {
      }

   }

   public class87 method2051(URL var1) {
      class87 var3 = new class87(var1);
      synchronized(this) {
         this.field1219.add(var3);
         this.notify();
         return var3;
      }
   }

   public void run() {
      while(!this.field1217) {
         try {
            class87 var1;
            synchronized(this) {
               var1 = (class87)this.field1219.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var13) {
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.field1221.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(5000);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var7 = var3.getContentLength();
               if (var7 >= 0) {
                  byte[] var5 = new byte[var7];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.field1223 = var5;
               }

               var1.field1222 = true;
            } catch (IOException var14) {
               var1.field1222 = true;
            } finally {
               if (var2 != null) {
                  var2.close();
               }

               if (var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var17) {
            class332.method5902((String)null, var17);
         }
      }

   }

   public static final synchronized long currentTime() {
      long var1 = System.currentTimeMillis();
      if (var1 < class280.field3625) {
         class381.field4173 += class280.field3625 - var1;
      }

      class280.field3625 = var1;
      return class381.field4173 + var1;
   }

   public static class248 method2063(int var0) {
      int var2 = var0 >> 16;
      int var3 = var0 & '\uffff';
      if (class248.field3038[var2] == null || class248.field3038[var2][var3] == null) {
         boolean var4 = class250.method4757(var2);
         if (!var4) {
            return null;
         }
      }

      return class248.field3038[var2][var3];
   }

   public static void method2058() {
      class246.field2937.method4309();
   }
}
