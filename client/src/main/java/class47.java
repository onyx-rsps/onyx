import java.util.Comparator;

public class class47 implements Comparator {
   static class302 field398;
   static class397 field397;
   boolean field399;

   static final byte[] method815(byte[] var0) {
      class385 var2 = new class385(var0);
      int var3 = var2.method5948();
      int var4 = var2.method6172();
      if (var4 < 0 || class277.field3592 != 0 && var4 > class277.field3592) {
         throw new RuntimeException();
      } else if (0 == var3) {
         byte[] var7 = new byte[var4];
         var2.method5960(var7, 0, var4);
         return var7;
      } else {
         int var5 = var2.method6172();
         if (var5 >= 0 && (class277.field3592 == 0 || var5 <= class277.field3592)) {
            byte[] var6 = new byte[var5];
            if (1 == var3) {
               class387.method6199(var6, var5, var0, var4, 9);
            } else {
               class277.field3590.method6512(var2, var6);
            }

            return var6;
         } else {
            throw new RuntimeException();
         }
      }
   }

   static final int method808(int var0, int var1, int var2, int var3) {
      int var5 = 65536 - class198.field2273[var2 * 1024 / var3] >> 1;
      return (var5 * var1 >> 16) + ((65536 - var5) * var0 >> 16);
   }

   static final void method807(String var0) {
      if (!var0.equals("")) {
         class229 var2 = class149.method2495(class227.field2655, client.field453.field1205);
         var2.field2691.method5931(class281.method4532(var0));
         var2.field2691.method5938(var0);
         client.field453.method1963(var2);
      }
   }

   class47() {
   }

   int method814(class285 var1, class285 var2) {
      if (var2.field3648 == var1.field3648) {
         return 0;
      } else {
         if (this.field399) {
            if (client.field405 == var1.field3648) {
               return -1;
            }

            if (var2.field3648 == client.field405) {
               return 1;
            }
         }

         return var1.field3648 < var2.field3648 ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method814((class285)var1, (class285)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}