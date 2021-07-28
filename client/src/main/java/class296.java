import java.util.Iterator;

public class class296 implements Iterator {
   class297 field3719;
   class353 field3720;
   class353 field3721;

   class296(class297 var1) {
      this.field3721 = null;
      this.method5219(var1);
   }

   void method5220() {
      this.field3720 = this.field3719 != null ? this.field3719.field3722.field3964 : null;
      this.field3721 = null;
   }

   void method5219(class297 var1) {
      this.field3719 = var1;
      this.method5220();
   }

   public Object next() {
      class353 var1 = this.field3720;
      if (var1 == this.field3719.field3722) {
         var1 = null;
         this.field3720 = null;
      } else {
         this.field3720 = var1.field3964;
      }

      this.field3721 = var1;
      return var1;
   }

   public void remove() {
      this.field3721.method6014();
      this.field3721 = null;
   }

   public boolean hasNext() {
      return this.field3719.field3722 != this.field3720 && this.field3720 != null;
   }
}
