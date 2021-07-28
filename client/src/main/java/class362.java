import java.util.Iterator;

public final class class362 implements Iterable {
   class353 field4100;
   class353 field4102;
   class353[] field4101;
   int field4103;
   int field4104;

   public class362(int var1) {
      this.field4104 = 0;
      this.field4103 = var1;
      this.field4101 = new class353[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class353 var3 = this.field4101[var2] = new class353();
         var3.field3964 = var3;
         var3.field3966 = var3;
      }

   }

   public class353 method6297(long var1) {
      class353 var3 = this.field4101[(int)(var1 & (long)(this.field4103 - 1))];

      for(this.field4102 = var3.field3964; var3 != this.field4102; this.field4102 = this.field4102.field3964) {
         if (this.field4102.field3965 == var1) {
            class353 var4 = this.field4102;
            this.field4102 = this.field4102.field3964;
            return var4;
         }
      }

      this.field4102 = null;
      return null;
   }

   public class353 method6301() {
      class353 var1;
      if (this.field4104 > 0 && this.field4101[this.field4104 - 1] != this.field4100) {
         var1 = this.field4100;
         this.field4100 = var1.field3964;
         return var1;
      } else {
         do {
            if (this.field4104 >= this.field4103) {
               return null;
            }

            var1 = this.field4101[this.field4104++].field3964;
         } while(var1 == this.field4101[this.field4104 - 1]);

         this.field4100 = var1.field3964;
         return var1;
      }
   }

   public void method6296() {
      for(int var1 = 0; var1 < this.field4103; ++var1) {
         class353 var2 = this.field4101[var1];

         while(true) {
            class353 var3 = var2.field3964;
            if (var3 == var2) {
               break;
            }

            var3.method6014();
         }
      }

      this.field4102 = null;
      this.field4100 = null;
   }

   public void method6308(class353 var1, long var2) {
      if (var1.field3966 != null) {
         var1.method6014();
      }

      class353 var4 = this.field4101[(int)(var2 & (long)(this.field4103 - 1))];
      var1.field3966 = var4.field3966;
      var1.field3964 = var4;
      var1.field3966.field3964 = var1;
      var1.field3964.field3966 = var1;
      var1.field3965 = var2;
   }

   public Iterator iterator() {
      return new class361(this);
   }

   public class353 method6300() {
      this.field4104 = 0;
      return this.method6301();
   }
}
