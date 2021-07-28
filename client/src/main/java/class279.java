import java.util.Comparator;

final class class279 implements Comparator {
   class279() {
   }

   int method5027(class284 var1, class284 var2) {
      return var1.field3646.field3652 < var2.field3646.field3652 ? -1 : (var2.field3646.field3652 == var1.field3646.field3652 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method5027((class284)var1, (class284)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
