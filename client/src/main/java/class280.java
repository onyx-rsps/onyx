import java.util.Comparator;

final class class280 implements Comparator {
   static int field3624;
   static int field3628;
   static long field3625;

   class280() {
   }

   int method5029(class284 var1, class284 var2) {
      return var1.method5065().compareTo(var2.method5065());
   }

   public int compare(Object var1, Object var2) {
      return this.method5029((class284)var1, (class284)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static int method5040(String var0) {
      return var0.length() + 1;
   }
}
