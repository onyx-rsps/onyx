public class class149 implements class290 {
   static final class149 field1653;
   static final class149 field1654;
   static final class149 field1655;
   final int field1657;
   public final int field1658;

   static {
      field1653 = new class149(1, 0);
      field1654 = new class149(0, 1);
      field1655 = new class149(2, 2);
   }

   class149(int var1, int var2) {
      this.field1658 = var1;
      this.field1657 = var2;
   }

   public int method4619() {
      return this.field1657;
   }

   public static class229 method2495(class227 var0, class401 var1) {
      class229 var3 = class160.method2843();
      var3.field2685 = var0;
      var3.field2686 = var0.field2670;
      if (-1 == var3.field2686) {
         var3.field2691 = new class384(260);
      } else if (-2 == var3.field2686) {
         var3.field2691 = new class384(10000);
      } else if (var3.field2686 <= 18) {
         var3.field2691 = new class384(20);
      } else if (var3.field2686 <= 98) {
         var3.field2691 = new class384(100);
      } else {
         var3.field2691 = new class384(260);
      }

      var3.field2691.method5886(var1);
      var3.field2691.method5887(var3.field2685.field2669);
      var3.field2688 = 0;
      return var3;
   }
}
