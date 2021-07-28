import java.util.Iterator;

public class class299 implements Iterator {
   class300 field3728;
   class348 field3726;
   class348 field3727;

   class299(class300 var1) {
      this.field3727 = null;
      this.field3728 = var1;
      this.field3726 = this.field3728.field3730.field3958;
      this.field3727 = null;
   }

   public Object next() {
      class348 var1 = this.field3726;
      if (var1 == this.field3728.field3730) {
         var1 = null;
         this.field3726 = null;
      } else {
         this.field3726 = var1.field3958;
      }

      this.field3727 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field3728.field3730 != this.field3726;
   }

   public void remove() {
      if (this.field3727 == null) {
         throw new IllegalStateException();
      } else {
         this.field3727.method6012();
         this.field3727 = null;
      }
   }
}
