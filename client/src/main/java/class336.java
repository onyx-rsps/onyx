public class class336 {
   static int field3923;
   public int field3920;
   public int field3921;
   public int field3922;
   public int field3924;

   public class336(int var1, int var2, int var3, int var4) {
      this.method5936(var1, var2);
      this.method5937(var3, var4);
   }

   public class336(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   void method5940(class336 var1, class336 var2) {
      var2.field3924 = this.field3924;
      var2.field3922 = this.field3922;
      if (this.field3924 < var1.field3924) {
         var2.field3922 -= var1.field3924 - this.field3924;
         var2.field3924 = var1.field3924;
      }

      if (var2.method5941() > var1.method5941()) {
         var2.field3922 -= var2.method5941() - var1.method5941();
      }

      if (var2.field3922 < 0) {
         var2.field3922 = 0;
      }

   }

   public void method5936(int var1, int var2) {
      this.field3924 = var1;
      this.field3921 = var2;
   }

   void method5944(class336 var1, class336 var2) {
      var2.field3921 = this.field3921;
      var2.field3920 = this.field3920;
      if (this.field3921 < var1.field3921) {
         var2.field3920 -= var1.field3921 - this.field3921;
         var2.field3921 = var1.field3921;
      }

      if (var2.method5942() > var1.method5942()) {
         var2.field3920 -= var2.method5942() - var1.method5942();
      }

      if (var2.field3920 < 0) {
         var2.field3920 = 0;
      }

   }

   public void method5937(int var1, int var2) {
      this.field3922 = var1;
      this.field3920 = var2;
   }

   int method5941() {
      return this.field3924 + this.field3922;
   }

   int method5942() {
      return this.field3920 + this.field3921;
   }

   public void method5938(class336 var1, class336 var2) {
      this.method5940(var1, var2);
      this.method5944(var1, var2);
   }

   public String toString() {
      return null;
   }
}
