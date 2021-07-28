public class class316 extends class325 {
   final class366 field3820;

   public class316(class366 var1) {
      super(400);
      this.field3820 = var1;
   }

   class323 vmethod5731() {
      return new class326();
   }

   class323[] vmethod5785(int var1) {
      return new class326[var1];
   }

   public void method5602(class384 var1, int var2) {
      while(true) {
         if (var1.field4181 * -1084587701 < var2) {
            int var4 = var1.method6560();
            boolean var5 = (var4 & 1) == 1;
            class405 var6 = new class405(var1.method6569(), this.field3820);
            class405 var7 = new class405(var1.method6569(), this.field3820);
            var1.method6569();
            if (var6 != null && var6.method7143()) {
               class326 var8 = (class326)this.method5734(var6);
               if (var5) {
                  class326 var9 = (class326)this.method5734(var7);
                  if (var9 != null && var9 != var8) {
                     if (var8 != null) {
                        this.method5737(var9);
                     } else {
                        var8 = var9;
                     }
                  }
               }

               if (var8 != null) {
                  this.method5742(var8, var6, var7);
                  continue;
               }

               if (this.method5744() < 400) {
                  int var10 = this.method5744();
                  var8 = (class326)this.method5786(var6, var7);
                  var8.field3862 = var10;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }

   public static final boolean method5611() {
      synchronized(class10.field58) {
         if (class10.field59 == class10.field57) {
            return false;
         } else {
            class120.field1417 = class10.field54[class10.field57];
            class126.field1449 = class10.field51[class10.field57];
            class10.field57 = class10.field57 + 1 & 127;
            return true;
         }
      }
   }
}
