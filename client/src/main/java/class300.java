import java.util.Iterator;

public class class300 implements Iterable {
   class348 field3729;
   public class348 field3730;

   public class300() {
      this.field3730 = new class348();
      this.field3730.field3958 = this.field3730;
      this.field3730.field3959 = this.field3730;
   }

   class348 method5328(class348 var1) {
      class348 var2;
      if (var1 == null) {
         var2 = this.field3730.field3958;
      } else {
         var2 = var1;
      }

      if (var2 == this.field3730) {
         this.field3729 = null;
         return null;
      } else {
         this.field3729 = var2.field3958;
         return var2;
      }
   }

   public class348 method5327() {
      return this.method5328((class348)null);
   }

   public void method5323() {
      while(this.field3730.field3958 != this.field3730) {
         this.field3730.field3958.method6012();
      }

   }

   public class348 method5326() {
      class348 var1 = this.field3730.field3958;
      if (var1 == this.field3730) {
         return null;
      } else {
         var1.method6012();
         return var1;
      }
   }

   public void method5324(class348 var1) {
      if (var1.field3959 != null) {
         var1.method6012();
      }

      var1.field3959 = this.field3730.field3959;
      var1.field3958 = this.field3730;
      var1.field3959.field3958 = var1;
      var1.field3958.field3959 = var1;
   }

   public class348 method5329() {
      class348 var1 = this.field3729;
      if (var1 == this.field3730) {
         this.field3729 = null;
         return null;
      } else {
         this.field3729 = var1.field3958;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class299(this);
   }

   public static void method5325(class348 var0, class348 var1) {
      if (var0.field3959 != null) {
         var0.method6012();
      }

      var0.field3959 = var1;
      var0.field3958 = var1.field3958;
      var0.field3959.field3958 = var0;
      var0.field3958.field3959 = var0;
   }
}
