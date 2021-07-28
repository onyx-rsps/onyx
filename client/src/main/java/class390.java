import java.util.Comparator;

public class class390 implements Comparator {
   final boolean field4239;

   public class390(boolean var1) {
      this.field4239 = var1;
   }

   int method6857(class323 var1, class323 var2) {
      return this.field4239 ? var1.method5711().method7144(var2.method5711()) : var2.method5711().method7144(var1.method5711());
   }

   public int compare(Object var1, Object var2) {
      return this.method6857((class323)var1, (class323)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
