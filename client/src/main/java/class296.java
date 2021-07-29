public class class296 {
   Node field3719;
   public Node field3718;

   public class296() {
      this.field3718 = new Node();
      this.field3718.field3965 = this.field3718;
      this.field3718.field3967 = this.field3718;
   }

   public void method4671() {
      while(true) {
         Node var1 = this.field3718.field3965;
         if (var1 == this.field3718) {
            this.field3719 = null;
            return;
         }

         var1.method5437();
      }
   }

   public void method4672(Node var1) {
      if (var1.field3967 != null) {
         var1.method5437();
      }

      var1.field3967 = this.field3718.field3967;
      var1.field3965 = this.field3718;
      var1.field3967.field3965 = var1;
      var1.field3965.field3967 = var1;
   }

   public void method4673(Node var1) {
      if (var1.field3967 != null) {
         var1.method5437();
      }

      var1.field3967 = this.field3718;
      var1.field3965 = this.field3718.field3965;
      var1.field3967.field3965 = var1;
      var1.field3965.field3967 = var1;
   }

   public static void method4674(Node var0, Node var1) {
      if (var0.field3967 != null) {
         var0.method5437();
      }

      var0.field3967 = var1.field3967;
      var0.field3965 = var1;
      var0.field3967.field3965 = var0;
      var0.field3965.field3967 = var0;
   }

   public Node method4699() {
      Node var1 = this.field3718.field3965;
      if (var1 == this.field3718) {
         return null;
      } else {
         var1.method5437();
         return var1;
      }
   }

   public Node method4675() {
      Node var1 = this.field3718.field3967;
      if (var1 == this.field3718) {
         return null;
      } else {
         var1.method5437();
         return var1;
      }
   }

   public Node method4687() {
      Node var1 = this.field3718.field3965;
      if (var1 == this.field3718) {
         this.field3719 = null;
         return null;
      } else {
         this.field3719 = var1.field3965;
         return var1;
      }
   }

   public Node method4694() {
      Node var1 = this.field3718.field3967;
      if (var1 == this.field3718) {
         this.field3719 = null;
         return null;
      } else {
         this.field3719 = var1.field3967;
         return var1;
      }
   }

   public Node method4678() {
      Node var1 = this.field3719;
      if (var1 == this.field3718) {
         this.field3719 = null;
         return null;
      } else {
         this.field3719 = var1.field3965;
         return var1;
      }
   }

   public Node method4679() {
      Node var1 = this.field3719;
      if (var1 == this.field3718) {
         this.field3719 = null;
         return null;
      } else {
         this.field3719 = var1.field3967;
         return var1;
      }
   }
}
