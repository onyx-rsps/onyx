import java.io.File;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

public class class62 implements Callable {
   class62() {
   }

   public Object call() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   static File method1704(String var0) {
      if (!class132.field1482) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)class132.field1483.get(var0);
         if (var2 != null) {
            return var2;
         } else {
            File var3 = new File(class132.field1481, var0);
            RandomAccessFile var4 = null;

            try {
               File var5 = new File(var3.getParent());
               if (!var5.exists()) {
                  throw new RuntimeException("");
               } else {
                  var4 = new RandomAccessFile(var3, "rw");
                  int var6 = var4.read();
                  var4.seek(0L);
                  var4.write(var6);
                  var4.seek(0L);
                  var4.close();
                  class132.field1483.put(var0, var3);
                  return var3;
               }
            } catch (Exception var9) {
               try {
                  if (var4 != null) {
                     var4.close();
                     var4 = null;
                  }
               } catch (Exception var8) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   static void method1708(class384 var0, int var1) {
      class144.method2733(var0.payload, var1);
      class66.method1730(var0, var1);
   }

   static final void method1709(String var0) {
      if (class68.field971 != null) {
         class228 var2 = class148.method2788(class226.field2632, client.field452.field1204);
         var2.field2690.writeByte(class280.method5040(var0));
         var2.field2690.method6550(var0);
         client.field452.method2031(var2);
      }
   }

   static final int method1703(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var4;
   }
}
