public final class class294 {
   class348 field3716;

   public class294() {
      this.field3716 = new class348();
      this.field3716.field3958 = this.field3716;
      this.field3716.field3959 = this.field3716;
   }

   public void method5175(class348 var1) {
      if (var1.field3959 != null) {
         var1.method6012();
      }

      var1.field3959 = this.field3716;
      var1.field3958 = this.field3716.field3958;
      var1.field3959.field3958 = var1;
      var1.field3958.field3959 = var1;
   }

   public void method5174(class348 var1) {
      if (var1.field3959 != null) {
         var1.method6012();
      }

      var1.field3959 = this.field3716.field3959;
      var1.field3958 = this.field3716;
      var1.field3959.field3958 = var1;
      var1.field3958.field3959 = var1;
   }

   public class348 method5179() {
      class348 var1 = this.field3716.field3958;
      return var1 == this.field3716 ? null : var1;
   }
}
