import java.io.IOException;

public class class85 {
   boolean field1210;
   class229 field1205;
   class229 field1211;
   class229 field1212;
   class229 field1213;
   class297 field1201;
   class329 field1207;
   class383 field1200;
   class384 field1203;
   int field1202;
   int field1208;
   int field1209;
   int field1215;
   public class400 field1204;

   class85() {
      this.field1201 = new class297();
      this.field1202 = 0;
      this.field1203 = new class384(5000);
      this.field1200 = new class383(40000);
      this.field1205 = null;
      this.field1208 = 0;
      this.field1210 = true;
      this.field1209 = 0;
      this.field1215 = 0;
   }

   class329 method2036() {
      return this.field1207;
   }

   void method2033() {
      if (this.field1207 != null) {
         this.field1207.vmethod5858();
         this.field1207 = null;
      }

   }

   void method2029() {
      this.field1207 = null;
   }

   public final void method2031(class228 var1) {
      this.field1201.method5236(var1);
      var1.field2687 = var1.field2690.field4181 * -1084587701;
      var1.field2690.field4181 = 0;
      this.field1202 += var1.field2687;
   }

   final void method2043() {
      this.field1201.method5275();
      this.field1202 = 0;
   }

   final void method2030() throws IOException {
      if (this.field1207 != null && this.field1202 > 0) {
         this.field1203.field4181 = 0;

         while(true) {
            class228 var2 = (class228)this.field1201.method5239();
            if (var2 == null || var2.field2687 > this.field1203.payload.length - this.field1203.field4181 * -1084587701) {
               this.field1207.write(this.field1203.payload, 0, this.field1203.field4181 * -1084587701);
               this.field1215 = 0;
               break;
            }

            this.field1203.method6615(var2.field2690.payload, 0, var2.field2687);
            this.field1202 -= var2.field2687;
            var2.method6014();
            var2.field2690.method6553();
            var2.method4337();
         }
      }

   }

   void method2032(class329 var1) {
      this.field1207 = var1;
   }

   public static int method2049(int var0) {
      return class345.field3945[var0 & 16383];
   }
}
