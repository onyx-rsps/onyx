import java.io.IOException;

public class class86 {
   boolean field1211;
   class230 field1206;
   class230 field1212;
   class230 field1213;
   class230 field1214;
   class298 field1202;
   class330 field1208;
   class384 field1201;
   class385 field1204;
   int field1203;
   int field1209;
   int field1210;
   int field1216;
   public class401 field1205;

   class86() {
      this.field1202 = new class298();
      this.field1203 = 0;
      this.field1204 = new class385(5000);
      this.field1201 = new class384(40000);
      this.field1206 = null;
      this.field1209 = 0;
      this.field1211 = true;
      this.field1210 = 0;
      this.field1216 = 0;
   }

   final void method1975() {
      this.field1202.method4763();
      this.field1203 = 0;
   }

   public static int method1981(int var0) {
      return class346.field3946[var0 & 16383];
   }

   final void method1962() throws IOException {
      if (this.field1208 != null && this.field1203 > 0) {
         this.field1204.field4182 = 0;

         while(true) {
            class229 var2 = (class229)this.field1202.method4724();
            if (var2 == null || var2.field2688 > this.field1204.field4184.length - this.field1204.field4182) {
               this.field1208.method5283(this.field1204.field4184, 0, this.field1204.field4182);
               this.field1216 = 0;
               break;
            }

            this.field1204.method6003(var2.field2691.field4184, 0, var2.field2688);
            this.field1203 -= var2.field2688;
            var2.method5437();
            var2.field2691.method5941();
            var2.method3903();
         }
      }

   }

   public final void method1963(class229 var1) {
      this.field1202.method4721(var1);
      var1.field2688 = var1.field2691.field4182;
      var1.field2691.field4182 = 0;
      this.field1203 += var1.field2688;
   }

   void method1964(class330 var1) {
      this.field1208 = var1;
   }

   void method1965() {
      if (this.field1208 != null) {
         this.field1208.method5279();
         this.field1208 = null;
      }

   }

   void method1961() {
      this.field1208 = null;
   }

   class330 method1968() {
      return this.field1208;
   }
}
