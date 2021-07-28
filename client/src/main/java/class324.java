import java.util.Comparator;

public abstract class class324 implements Comparator {
   static int[] field3853;
   Comparator field3855;

   protected class324() {
   }

   protected final int method5724(class323 var1, class323 var2) {
      return this.field3855 == null ? 0 : this.field3855.compare(var1, var2);
   }

   final void method5721(Comparator var1) {
      if (this.field3855 == null) {
         this.field3855 = var1;
      } else if (this.field3855 instanceof class324) {
         ((class324)this.field3855).method5721(var1);
      }

   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static String method5727(CharSequence var0) {
      String var2 = class83.method1996(class287.method5123(var0));
      if (var2 == null) {
         var2 = "";
      }

      return var2;
   }
}
