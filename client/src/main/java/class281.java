import java.util.Comparator;

final class class281 implements Comparator {
   public static int field3630;
   public static int field3633;

   class281() {
   }

   int method5042(class284 var1, class284 var2) {
      return var1.field3645 < var2.field3645 ? -1 : (var1.field3645 == var2.field3645 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method5042((class284)var1, (class284)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static int method5053(String var0) {
      return var0.length() + 2;
   }

   public static boolean method5041(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   static final int method5048(int var0, int var1) {
      int var3 = class152.method2856(var0 - 1, var1 - 1) + class152.method2856(1 + var0, var1 - 1) + class152.method2856(var0 - 1, var1 + 1) + class152.method2856(1 + var0, var1 + 1);
      int var4 = class152.method2856(var0 - 1, var1) + class152.method2856(var0 + 1, var1) + class152.method2856(var0, var1 - 1) + class152.method2856(var0, 1 + var1);
      int var5 = class152.method2856(var0, var1);
      return var3 / 16 + var4 / 8 + var5 / 4;
   }

   static int method5054(int var0) {
      return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
   }
}
