public class class99 implements class289 {
   public static final class99 field1267;
   public static final class99 field1268;
   public static final class99 field1270;
   public static final class99 field1276;
   static class371 field1271;
   final int field1272;
   public final int field1269;

   static {
      field1276 = new class99(3, 0);
      field1268 = new class99(0, 1);
      field1267 = new class99(2, 2);
      field1270 = new class99(1, 3);
   }

   class99(int var1, int var2) {
      this.field1269 = var1;
      this.field1272 = var2;
   }

   public int vmethod6962() {
      return this.field1272;
   }

   public static class145 method2143(int var0) {
      class145 var2 = (class145)class145.field1596.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class145.field1600.method4920(8, var0);
         var2 = new class145();
         if (var3 != null) {
            var2.method2737(new class384(var3));
         }

         class145.field1596.method4308(var2, (long)var0);
         return var2;
      }
   }
}
