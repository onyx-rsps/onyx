import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class7 {
   public static short[] field25;
   static int field26;
   ExecutorService field21;
   Future field23;
   final class3 field24;
   final class384 field22;

   public class7(class384 var1, class3 var2) {
      this.field21 = Executors.newSingleThreadExecutor();
      this.field22 = var1;
      this.field24 = var2;
      this.method48();
   }

   void method48() {
      this.field23 = this.field21.submit(new class1(this, this.field22, this.field24));
   }

   public boolean method46() {
      return this.field23.isDone();
   }

   public class384 method57() {
      try {
         return (class384)this.field23.get();
      } catch (Exception var3) {
         return null;
      }
   }

   public void method49() {
      this.field21.shutdown();
      this.field21 = null;
   }

   public static class202 method59(class276 var0, class276 var1, int var2, boolean var3) {
      boolean var5 = true;
      int[] var6 = var0.method4989(var2);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         byte[] var8 = var0.method4928(var2, var6[var7]);
         if (var8 == null) {
            var5 = false;
         } else {
            int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
            byte[] var10;
            if (var3) {
               var10 = var1.method4928(0, var9);
            } else {
               var10 = var1.method4928(var9, 0);
            }

            if (var10 == null) {
               var5 = false;
            }
         }
      }

      if (!var5) {
         return null;
      } else {
         try {
            return new class202(var0, var1, var2, var3);
         } catch (Exception var12) {
            return null;
         }
      }
   }

   public static void method58() {
      class155.field1783.method4309();
      class155.field1737.method4309();
      class155.field1738.method4309();
      class155.field1739.method4309();
   }

   public static final void method47(String var0, String var1, int var2, int var3, int var4, int var5) {
      class24.method460(var0, var1, var2, var3, var4, var5, false);
   }

   static class58 method45(int var0) {
      class58 var2 = (class58)class58.field861.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class45.field390.method4920(var0, 0);
         if (var3 == null) {
            return null;
         } else {
            var2 = class210.method4251(var3);
            class58.field861.method4308(var2, (long)var0);
            return var2;
         }
      }
   }

   static int method52(int var0, class58 var1, boolean var2) {
      if (var0 != 3700 && var0 != 3701) {
         if (var0 == 3702) {
            ++class50.field745;
            return 1;
         } else {
            return 2;
         }
      } else {
         --class50.field745;
         --class1.field3;
         return 1;
      }
   }
}
