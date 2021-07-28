import java.util.Iterator;

public class class361 implements Iterator {
   class353 field4097;
   class353 field4099;
   class362 field4098;
   int field4096;

   class361(class362 var1) {
      this.field4099 = null;
      this.field4098 = var1;
      this.method6294();
   }

   void method6294() {
      this.field4097 = this.field4098.field4101[0].field3964;
      this.field4096 = 1;
      this.field4099 = null;
   }

   public Object next() {
      class353 var1;
      if (this.field4098.field4101[this.field4096 - 1] != this.field4097) {
         var1 = this.field4097;
         this.field4097 = var1.field3964;
         this.field4099 = var1;
         return var1;
      } else {
         do {
            if (this.field4096 >= this.field4098.field4103) {
               return null;
            }

            var1 = this.field4098.field4101[this.field4096++].field3964;
         } while(var1 == this.field4098.field4101[this.field4096 - 1]);

         this.field4097 = var1.field3964;
         this.field4099 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.field4098.field4101[this.field4096 - 1] != this.field4097) {
         return true;
      } else {
         while(this.field4096 < this.field4098.field4103) {
            if (this.field4098.field4101[this.field4096++].field3964 != this.field4098.field4101[this.field4096 - 1]) {
               this.field4097 = this.field4098.field4101[this.field4096 - 1].field3964;
               return true;
            }

            this.field4097 = this.field4098.field4101[this.field4096 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.field4099 == null) {
         throw new IllegalStateException();
      } else {
         this.field4099.method6014();
         this.field4099 = null;
      }
   }
}
