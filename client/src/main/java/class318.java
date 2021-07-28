public class class318 extends class325 {
   int field3828;
   final class366 field3826;
   public class298 field3829;

   public class318(class366 var1) {
      super(400);
      this.field3828 = 1;
      this.field3829 = new class298();
      this.field3826 = var1;
   }

   public void method5618(class384 var1, int var2) {
      while(true) {
         if (var1.field4181 * -1084587701 < var2) {
            boolean var4 = var1.method6560() == 1;
            class405 var5 = new class405(var1.method6569(), this.field3826);
            class405 var6 = new class405(var1.method6569(), this.field3826);
            int var7 = var1.method6655();
            int var8 = var1.method6560();
            int var9 = var1.method6560();
            boolean var10 = (var9 & 2) != 0;
            boolean var11 = (var9 & 1) != 0;
            if (var7 > 0) {
               var1.method6569();
               var1.method6560();
               var1.method6784();
            }

            var1.method6569();
            if (var5 != null && var5.method7143()) {
               class320 var12 = (class320)this.method5734(var5);
               if (var4) {
                  class320 var13 = (class320)this.method5734(var6);
                  if (var13 != null && var13 != var12) {
                     if (var12 != null) {
                        this.method5737(var13);
                     } else {
                        var12 = var13;
                     }
                  }
               }

               if (var12 != null) {
                  this.method5742(var12, var5, var6);
                  if (var7 != var12.field3864) {
                     boolean var15 = true;

                     for(class321 var14 = (class321)this.field3829.method5309(); var14 != null; var14 = (class321)this.field3829.method5310()) {
                        if (var14.field3843.equals(var5)) {
                           if (var7 != 0 && var14.field3845 == 0) {
                              var14.method6009();
                              var15 = false;
                           } else if (var7 == 0 && var14.field3845 != 0) {
                              var14.method6009();
                              var15 = false;
                           }
                        }
                     }

                     if (var15) {
                        this.field3829.method5307(new class321(var5, var7));
                     }
                  }
               } else {
                  if (this.method5744() >= 400) {
                     continue;
                  }

                  var12 = (class320)this.method5786(var5, var6);
               }

               if (var7 != var12.field3864) {
                  var12.field3868 = (++this.field3828 - 1) * 723168297;
                  if (var12.field3864 == -1 && var7 == 0) {
                     var12.field3868 = -var12.field3868;
                  }

                  var12.field3864 = var7;
               }

               var12.field3865 = var8;
               var12.field3842 = var10;
               var12.field3841 = var11;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method5741();
         return;
      }
   }

   class323 vmethod5731() {
      return new class320();
   }

   public boolean method5624(class405 var1, boolean var2) {
      class320 var4 = (class320)this.method5733(var1);
      if (var4 == null) {
         return false;
      } else {
         return !var2 || var4.field3864 != 0;
      }
   }

   class323[] vmethod5785(int var1) {
      return new class320[var1];
   }
}
