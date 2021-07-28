public class class323 implements Comparable {
   class405 field3851;
   class405 field3852;

   class323() {
   }

   public int vmethod5812(class323 var1) {
      return this.field3852.method7144(var1.field3852);
   }

   public class405 method5711() {
      return this.field3852;
   }

   void method5701(class405 var1, class405 var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field3852 = var1;
         this.field3851 = var2;
      }
   }

   public String method5699() {
      return this.field3852 == null ? "" : this.field3852.method7141();
   }

   public String method5700() {
      return this.field3851 == null ? "" : this.field3851.method7141();
   }

   public int compareTo(Object var1) {
      return this.vmethod5812((class323)var1);
   }

   static void method5698(int var0, boolean var1, int var2, boolean var3) {
      if (class15.field85 != null) {
         class367.method6346(0, class15.field85.length - 1, var0, var1, var2, var3);
      }

   }
}
