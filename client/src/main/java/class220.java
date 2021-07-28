public final class class220 {
   class219 field2553;
   class300 field2552;
   class362 field2551;
   int field2549;
   int field2550;

   public class220(int var1, int var2) {
      this.field2552 = new class300();
      this.field2549 = var1;
      this.field2550 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
      }

      this.field2551 = new class362(var3);
   }

   public class220(int var1) {
      this(var1, var1);
   }

   public void method4279(Object var1, long var2, int var4) {
      if (var4 > this.field2549) {
         throw new IllegalStateException();
      } else {
         this.method4276(var2);
         this.field2550 -= var4;

         while(this.field2550 < 0) {
            class224 var5 = (class224)this.field2552.method5326();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.vmethod4327()) {
            }

            this.method4277(var5);
            if (this.field2553 != null) {
               this.field2553.method4271(var5.vmethod4325());
            }
         }

         class223 var6 = new class223(var1, var4);
         this.field2551.method6308(var6, var2);
         this.field2552.method5324(var6);
         var6.field3957 = 0L;
      }
   }

   public void method4280(int var1) {
      for(class224 var2 = (class224)this.field2552.method5327(); var2 != null; var2 = (class224)this.field2552.method5329()) {
         if (var2.vmethod4327()) {
            if (var2.vmethod4325() == null) {
               var2.method6014();
               var2.method6012();
               this.field2550 += var2.field2561;
            }
         } else if (++var2.field3957 > (long)var1) {
            class221 var3 = new class221(var2.vmethod4325(), var2.field2561);
            this.field2551.method6308(var3, var2.field3965);
            class300.method5325(var3, var2);
            var2.method6014();
            var2.method6012();
         }
      }

   }

   void method4276(long var1) {
      class224 var3 = (class224)this.field2551.method6297(var1);
      this.method4277(var3);
   }

   public void method4281() {
      this.field2552.method5323();
      this.field2551.method6296();
      this.field2550 = this.field2549;
   }

   public Object method4275(long var1) {
      class224 var3 = (class224)this.field2551.method6297(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod4325();
         if (var4 == null) {
            var3.method6014();
            var3.method6012();
            this.field2550 += var3.field2561;
            return null;
         } else {
            if (var3.vmethod4327()) {
               class223 var5 = new class223(var4, var3.field2561);
               this.field2551.method6308(var5, var3.field3965);
               this.field2552.method5324(var5);
               var5.field3957 = 0L;
               var3.method6014();
               var3.method6012();
            } else {
               this.field2552.method5324(var3);
               var3.field3957 = 0L;
            }

            return var4;
         }
      }
   }

   void method4277(class224 var1) {
      if (var1 != null) {
         var1.method6014();
         var1.method6012();
         this.field2550 += var1.field2561;
      }

   }

   public void method4278(Object var1, long var2) {
      this.method4279(var1, var2, 1);
   }
}
