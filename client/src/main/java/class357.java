public class class357 {
   static int field4011;
   boolean field4019;
   class276 field4015;
   int field4016;
   String field4017;

   class357(class276 var1) {
      this.field4016 = 0;
      this.field4019 = false;
      this.field4015 = var1;
   }

   int method6050() {
      if (this.field4016 < 33) {
         if (!this.field4015.method4976(class186.field2115.field2113, this.field4017)) {
            return this.field4016;
         }

         this.field4016 = 33;
      }

      if (this.field4016 == 33) {
         if (this.field4015.method4939(class186.field2114.field2113, this.field4017) && !this.field4015.method4976(class186.field2114.field2113, this.field4017)) {
            return this.field4016;
         }

         this.field4016 = 66;
      }

      if (this.field4016 == 66) {
         if (!this.field4015.method4976(this.field4017, class186.field2116.field2113)) {
            return this.field4016;
         }

         this.field4016 = 100;
         this.field4019 = true;
      }

      return this.field4016;
   }

   boolean method6051() {
      return this.field4019;
   }

   void method6049(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (var1 != this.field4017) {
            this.field4017 = var1;
            this.field4016 = 0;
            this.field4019 = false;
            this.method6050();
         }
      }
   }

   int method6055() {
      return this.field4016;
   }
}
