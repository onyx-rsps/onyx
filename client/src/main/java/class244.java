public class class244 {
   static class248 field2922;
   public int field2919;
   public int field2920;
   public int field2921;

   public class244(class244 var1) {
      this.field2920 = var1.field2920;
      this.field2919 = var1.field2919;
      this.field2921 = var1.field2921;
   }

   public class244(int var1, int var2, int var3) {
      this.field2920 = var1;
      this.field2919 = var2;
      this.field2921 = var3;
   }

   public class244(int var1) {
      if (var1 == -1) {
         this.field2920 = -1;
      } else {
         this.field2920 = var1 >> 28 & 3;
         this.field2919 = var1 >> 14 & 16383;
         this.field2921 = var1 & 16383;
      }

   }

   String method4626(String var1) {
      return this.field2920 + var1 + (this.field2919 >> 6) + var1 + (this.field2921 >> 6) + var1 + (this.field2919 & 63) + var1 + (this.field2921 & 63);
   }

   public int method4628() {
      return this.field2920 << 28 | this.field2919 << 14 | this.field2921;
   }

   boolean method4625(class244 var1) {
      if (this.field2920 != var1.field2920) {
         return false;
      } else if (this.field2919 != var1.field2919) {
         return false;
      } else {
         return this.field2921 == var1.field2921;
      }
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class244) ? false : this.method4625((class244)var1);
      }
   }

   public int hashCode() {
      return this.method4628();
   }

   public String toString() {
      return this.method4626(",");
   }
}
