public final class class363 {
   class353 field4107;
   class353 field4108;
   class353[] field4106;
   int field4105;
   int field4109;

   public class363(int var1) {
      this.field4109 = 0;
      this.field4105 = var1;
      this.field4106 = new class353[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class353 var3 = this.field4106[var2] = new class353();
         var3.field3964 = var3;
         var3.field3966 = var3;
      }

   }

   public class353 method6317() {
      this.field4109 = 0;
      return this.method6320();
   }

   public class353 method6327(long var1) {
      class353 var3 = this.field4106[(int)(var1 & (long)(this.field4105 - 1))];

      for(this.field4107 = var3.field3964; var3 != this.field4107; this.field4107 = this.field4107.field3964) {
         if (this.field4107.field3965 == var1) {
            class353 var4 = this.field4107;
            this.field4107 = this.field4107.field3964;
            return var4;
         }
      }

      this.field4107 = null;
      return null;
   }

   public class353 method6320() {
      class353 var1;
      if (this.field4109 > 0 && this.field4106[this.field4109 - 1] != this.field4108) {
         var1 = this.field4108;
         this.field4108 = var1.field3964;
         return var1;
      } else {
         do {
            if (this.field4109 >= this.field4105) {
               return null;
            }

            var1 = this.field4106[this.field4109++].field3964;
         } while(var1 == this.field4106[this.field4109 - 1]);

         this.field4108 = var1.field3964;
         return var1;
      }
   }

   public void method6318(class353 var1, long var2) {
      if (var1.field3966 != null) {
         var1.method6014();
      }

      class353 var4 = this.field4106[(int)(var2 & (long)(this.field4105 - 1))];
      var1.field3966 = var4.field3966;
      var1.field3964 = var4;
      var1.field3966.field3964 = var1;
      var1.field3964.field3966 = var1;
      var1.field3965 = var2;
   }
}
