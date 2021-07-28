import java.util.Comparator;

public class class389 implements Comparator {
   final boolean field4238;

   public class389(boolean var1) {
      this.field4238 = var1;
   }

   int method6847(class323 var1, class323 var2) {
      return this.field4238 ? var1.vmethod5812(var2) : var2.vmethod5812(var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method6847((class323)var1, (class323)var2);
   }
}
