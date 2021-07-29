public class class242 extends class348 {
   public final int field2905;
   public final int field2909;
   public final int[] field2904;
   public final int[] field2907;

   class242(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field2909 = var1;
      this.field2905 = var2;
      this.field2904 = var3;
      this.field2907 = var4;
   }

   public boolean method4616(int var1, int var2) {
      if (var2 >= 0 && var2 < this.field2907.length) {
         int var4 = this.field2907[var2];
         if (var1 >= var4 && var1 <= var4 + this.field2904[var2]) {
            return true;
         }
      }

      return false;
   }

   static int method4618(int var0) {
      class44 var2 = (class44)class84.field1193.method6297((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var2.field3959 == class84.field1194.field3730 ? -1 : ((class44)var2.field3959).field377;
      }
   }

   public static int method4617(Buffer var0, String var1) {
      int var3 = var0.field4181 * -1084587701;
      byte[] var4 = class104.method2197(var1);
      var0.method6558(var4.length);
      var0.field4181 = (var0.field4181 * -1084587701 + class251.field3116.method4752(var4, 0, var4.length, var0.payload, var0.field4181 * -1084587701)) * 99;
      return var0.field4181 * -1084587701 - var3;
   }
}
