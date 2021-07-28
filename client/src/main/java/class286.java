import java.util.Comparator;

final class class286 implements Comparator {
   static class371 field3663;

   class286() {
   }

   int method5098(class284 var1, class284 var2) {
      return var1.field3646.field3655 < var2.field3646.field3655 ? -1 : (var2.field3646.field3655 == var1.field3646.field3655 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method5098((class284)var1, (class284)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static void method5100(class248 var0, int var1, int var2, boolean var3) {
      int var5 = var0.field2972;
      int var6 = var0.field2989;
      if (var0.field3032 == 0) {
         var0.field2972 = var0.field2968;
      } else if (var0.field3032 == 1) {
         var0.field2972 = var1 - var0.field2968;
      } else if (var0.field3032 == 2) {
         var0.field2972 = var0.field2968 * var1 >> 14;
      }

      if (var0.field3091 == 0) {
         var0.field2989 = var0.field2969;
      } else if (var0.field3091 == 1) {
         var0.field2989 = var2 - var0.field2969;
      } else if (var0.field3091 == 2) {
         var0.field2989 = var2 * var0.field2969 >> 14;
      }

      if (var0.field3032 == 4) {
         var0.field2972 = var0.field2989 * var0.field2974 / var0.field2975;
      }

      if (var0.field3091 == 4) {
         var0.field2989 = var0.field2975 * var0.field2972 / var0.field2974;
      }

      if (var0.field2961 == 1337) {
         client.field579 = var0;
      }

      if (var3 && var0.field3071 != null && (var5 != var0.field2972 || var6 != var0.field2989)) {
         class67 var7 = new class67();
         var7.field960 = var0;
         var7.field954 = var0.field3071;
         client.field610.method5187(var7);
      }

   }
}
