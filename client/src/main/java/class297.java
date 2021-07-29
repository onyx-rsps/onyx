import java.util.Iterator;

public class class297 implements Iterator {
   class298 field3720;
   Node field3721;
   Node field3722;

   class297(class298 var1) {
      this.field3722 = null;
      this.method4704(var1);
   }

   void method4704(class298 var1) {
      this.field3720 = var1;
      this.method4705();
   }

   void method4705() {
      this.field3721 = this.field3720 != null ? this.field3720.field3723.field3965 : null;
      this.field3722 = null;
   }

   public Object next() {
      Node var1 = this.field3721;
      if (var1 == this.field3720.field3723) {
         var1 = null;
         this.field3721 = null;
      } else {
         this.field3721 = var1.field3965;
      }

      this.field3722 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field3721 != this.field3720.field3723 && this.field3721 != null;
   }

   public void remove() {
      if (this.field3722 == null) {
         throw new IllegalStateException();
      } else {
         this.field3722.method5437();
         this.field3722 = null;
      }
   }
}
