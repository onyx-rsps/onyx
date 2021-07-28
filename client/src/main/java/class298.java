public class class298 {
   class347 field3724;
   class347 field3725;

   public class298() {
      this.field3725 = new class347();
      this.field3725.field3956 = this.field3725;
      this.field3725.field3955 = this.field3725;
   }

   public class347 method5309() {
      class347 var1 = this.field3725.field3956;
      if (var1 == this.field3725) {
         this.field3724 = null;
         return null;
      } else {
         this.field3724 = var1.field3956;
         return var1;
      }
   }

   public class347 method5310() {
      class347 var1 = this.field3724;
      if (var1 == this.field3725) {
         this.field3724 = null;
         return null;
      } else {
         this.field3724 = var1.field3956;
         return var1;
      }
   }

   public void method5307(class347 var1) {
      if (var1.field3955 != null) {
         var1.method6009();
      }

      var1.field3955 = this.field3725.field3955;
      var1.field3956 = this.field3725;
      var1.field3955.field3956 = var1;
      var1.field3956.field3955 = var1;
   }
}
