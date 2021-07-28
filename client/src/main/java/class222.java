public final class class222 {
   class300 field2558;
   class348 field2559;
   class362 field2555;
   int field2556;
   int field2557;

   public class222(int var1) {
      this.field2559 = new class348();
      this.field2558 = new class300();
      this.field2556 = var1;
      this.field2557 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.field2555 = new class362(var2);
   }

   public class348 method4306(long var1) {
      class348 var3 = (class348)this.field2555.method6297(var1);
      if (var3 != null) {
         this.field2558.method5324(var3);
      }

      return var3;
   }

   public void method4308(class348 var1, long var2) {
      if (this.field2557 == 0) {
         class348 var4 = this.field2558.method5326();
         var4.method6014();
         var4.method6012();
         if (var4 == this.field2559) {
            var4 = this.field2558.method5326();
            var4.method6014();
            var4.method6012();
         }
      } else {
         --this.field2557;
      }

      this.field2555.method6308(var1, var2);
      this.field2558.method5324(var1);
   }

   public void method4309() {
      this.field2558.method5323();
      this.field2555.method6296();
      this.field2559 = new class348();
      this.field2557 = this.field2556;
   }

   public void method4315(long var1) {
      class348 var3 = (class348)this.field2555.method6297(var1);
      if (var3 != null) {
         var3.method6014();
         var3.method6012();
         ++this.field2557;
      }

   }
}
