public class class311 {
   int field3779;
   int field3783;
   int field3786;
   int field3787;
   long field3780;
   long field3782;
   long field3784;
   long field3785;
   long field3788;
   public boolean field3781;

   public class311() {
      this.field3785 = -1L;
      this.field3780 = -1L;
      this.field3781 = false;
      this.field3782 = 0L;
      this.field3784 = 0L;
      this.field3788 = 0L;
      this.field3786 = 0;
      this.field3779 = 0;
      this.field3787 = 0;
      this.field3783 = 0;
   }

   public void method5594() {
      if (-1L != this.field3780) {
         this.field3782 = class86.currentTime() - this.field3780;
         this.field3780 = -1L;
      }

      ++this.field3787;
      this.field3781 = true;
   }

   public void method5575() {
      if (this.field3785 != -1L) {
         this.field3784 = class86.currentTime() - this.field3785;
         this.field3785 = -1L;
      }

   }

   public void method5579(int var1) {
      this.field3780 = class86.currentTime();
      this.field3786 = var1;
   }

   public void method5574() {
      this.field3785 = class86.currentTime();
   }

   public void method5584(Buffer var1) {
      class262.method4818(var1, this.field3784);
      class262.method4818(var1, this.field3782);
      class262.method4818(var1, this.field3788);
      var1.method6734(this.field3786);
      var1.method6734(this.field3779);
      var1.method6734(this.field3787);
      var1.method6734(this.field3783);
   }

   public void method5578() {
      this.field3781 = false;
      this.field3779 = 0;
   }

   public void method5583() {
      this.method5594();
   }

   static final void method5596(int var0) {
      if (class250.method4757(var0)) {
         class248[] var2 = class248.field3038[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class248 var4 = var2[var3];
            if (var4 != null) {
               var4.field3093 = 0;
               var4.field3089 = 0;
            }
         }

      }
   }
}
