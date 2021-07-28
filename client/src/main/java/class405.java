public class class405 implements Comparable {
   String field4310;
   String field4311;

   public class405(String var1, class366 var2) {
      this.field4311 = var1;
      this.field4310 = class113.method2279(var1, var2);
   }

   public class405(String var1) {
      this.field4311 = var1;
      this.field4310 = class113.method2279(var1, class366.field4122);
   }

   public int method7144(class405 var1) {
      if (this.field4310 == null) {
         return var1.field4310 == null ? 0 : 1;
      } else {
         return var1.field4310 == null ? -1 : this.field4310.compareTo(var1.field4310);
      }
   }

   public boolean method7143() {
      return this.field4310 != null;
   }

   public String method7141() {
      return this.field4311;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class405) {
         class405 var2 = (class405)var1;
         if (this.field4310 == null) {
            return var2.field4310 == null;
         } else if (var2.field4310 == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.field4310.equals(var2.field4310);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field4310 == null ? 0 : this.field4310.hashCode();
   }

   public String method7142() {
      return this.field4310;
   }

   public int compareTo(Object var1) {
      return this.method7144((class405)var1);
   }

   public String toString() {
      return this.method7141();
   }
}
