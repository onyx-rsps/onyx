public class class8 {
   final int field27;
   final int field28;
   final String field29;

   class8(class384 var1) {
      this(var1.method6560(), var1.method6560(), var1.method6569());
   }

   class8(int var1, int var2, String var3) {
      this.field28 = var1;
      this.field27 = var2;
      this.field29 = var3;
   }

   int method67() {
      return this.field27;
   }

   String method61() {
      return Integer.toHexString(this.field28) + Integer.toHexString(this.field27) + this.field29;
   }
}
