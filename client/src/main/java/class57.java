import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class57 {
   static int field858;
   ExecutorService field857;
   Future field856;

   class57() {
      this.field857 = Executors.newSingleThreadExecutor();
      this.field856 = this.field857.submit(new class62());
   }

   boolean method1644() {
      return this.field856.isDone();
   }

   SecureRandom method1638() {
      try {
         return (SecureRandom)this.field856.get();
      } catch (Exception var5) {
         SecureRandom var4 = new SecureRandom();
         var4.nextInt();
         return var4;
      }
   }

   void method1636() {
      this.field857.shutdown();
      this.field857 = null;
   }

   public static class141 method1637(int var0) {
      class141 var2 = (class141)class141.field1555.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class141.field1560.method4920(19, var0);
         var2 = new class141();
         if (var3 != null) {
            var2.method2683(new class384(var3));
         }

         class141.field1555.method4308(var2, (long)var0);
         return var2;
      }
   }

   static void method1643() {
      class150.method2815(class11.field68 / 2 + class149.field1658, class334.field3906);
   }

   static int method1645(class47 var0, class47 var1, int var2, boolean var3, int var4, boolean var5) {
      int var7 = class137.method2616(var0, var1, var2, var3);
      if (var7 != 0) {
         return var3 ? -var7 : var7;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var8 = class137.method2616(var0, var1, var4, var5);
         return var5 ? -var8 : var8;
      }
   }
}
