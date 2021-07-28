public class class148 implements class289 {
   static final class148 field1652;
   static final class148 field1653;
   static final class148 field1654;
   final int field1656;
   public final int field1657;

   static {
      field1652 = new class148(1, 0);
      field1653 = new class148(0, 1);
      field1654 = new class148(2, 2);
   }

   class148(int var1, int var2) {
      this.field1657 = var1;
      this.field1656 = var2;
   }

   public int vmethod6962() {
      return this.field1656;
   }

   public static class228 method2788(class226 var0, class400 var1) {
      class228 var3 = class159.method3136();
      var3.field2684 = var0;
      var3.field2685 = var0.field2669;
      if (var3.field2685 == -1) {
         var3.field2690 = new class383(260);
      } else if (var3.field2685 == -2) {
         var3.field2690 = new class383(10000);
      } else if (var3.field2685 <= 18) {
         var3.field2690 = new class383(20);
      } else if (var3.field2685 <= 98) {
         var3.field2690 = new class383(100);
      } else {
         var3.field2690 = new class383(260);
      }

      var3.field2690.method6498(var1);
      var3.field2690.method6499(var3.field2684.field2668);
      var3.field2687 = 0;
      return var3;
   }
}
