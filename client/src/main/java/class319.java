public class class319 extends class325 {
   public static class369[] field3839;
   int field3837;
   final class317 field3835;
   final class366 field3830;
   public byte field3831;
   public int field3836;
   public String field3832;
   public String field3833;

   public class319(class366 var1, class317 var2) {
      super(100);
      this.field3833 = null;
      this.field3832 = null;
      this.field3837 = 1;
      this.field3830 = var1;
      this.field3835 = var2;
   }

   final void method5636(String var1) {
      this.field3832 = class324.method5727(var1);
   }

   class323 vmethod5731() {
      return new class322();
   }

   final void method5635(String var1) {
      this.field3833 = class324.method5727(var1);
   }

   class323[] vmethod5785(int var1) {
      return new class322[var1];
   }

   public final void method5639() {
      for(int var2 = 0; var2 < this.method5744(); ++var2) {
         ((class322)this.method5740(var2)).method5695();
      }

   }

   public final void method5656() {
      for(int var2 = 0; var2 < this.method5744(); ++var2) {
         ((class322)this.method5740(var2)).method5682();
      }

   }

   final void method5651(class322 var1) {
      if (var1.method5711().equals(this.field3835.vmethod5612())) {
         this.field3836 = var1.field3865;
      }

   }

   public final void method5638(Buffer var1) {
      class405 var3 = new class405(var1.method6569(), this.field3830);
      int var4 = var1.method6655();
      byte var5 = var1.method6561();
      boolean var6 = false;
      if (var5 == -128) {
         var6 = true;
      }

      class322 var7;
      if (var6) {
         if (this.method5744() == 0) {
            return;
         }

         var7 = (class322)this.method5734(var3);
         if (var7 != null && var7.method5819() == var4) {
            this.method5737(var7);
         }
      } else {
         var1.method6569();
         var7 = (class322)this.method5734(var3);
         if (var7 == null) {
            if (this.method5744() > super.field3859) {
               return;
            }

            var7 = (class322)this.method5738(var3);
         }

         var7.method5826(var4, ++this.field3837 - 1);
         var7.field3865 = var5;
         this.method5651(var7);
      }

   }

   public final void method5650(Buffer var1) {
      this.method5636(var1.method6569());
      long var3 = var1.method6566();
      long var6 = var3;
      String var5;
      int var8;
      if (var3 > 0L && var3 < 6582952005840035281L) {
         if (0L == var3 % 37L) {
            var5 = null;
         } else {
            var8 = 0;

            for(long var14 = var3; 0L != var14; var14 /= 37L) {
               ++var8;
            }

            StringBuilder var16 = new StringBuilder(var8);

            while(0L != var6) {
               long var12 = var6;
               var6 /= 37L;
               var16.append(class307.field3763[(int)(var12 - var6 * 37L)]);
            }

            var5 = var16.reverse().toString();
         }
      } else {
         var5 = null;
      }

      this.method5635(var5);
      this.field3831 = var1.method6561();
      var8 = var1.method6560();
      if (var8 != 255) {
         this.method5729();

         for(int var9 = 0; var9 < var8; ++var9) {
            class322 var10 = (class322)this.method5738(new class405(var1.method6569(), this.field3830));
            int var11 = var1.method6655();
            var10.method5826(var11, ++this.field3837 - 1);
            var10.field3865 = var1.method6561();
            var1.method6569();
            this.method5651(var10);
         }

      }
   }
}
