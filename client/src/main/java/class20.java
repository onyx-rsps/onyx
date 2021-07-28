public class class20 extends class30 {
   class295 field156;
   class295 field158;
   int field155;
   int field157;

   public class20() {
      this.field158 = new class295();
      this.field156 = new class295();
      this.field155 = 0;
      this.field157 = -1;
   }

   void method381(int[] var1, int var2, int var3) {
      for(class30 var4 = (class30)this.field158.method5202(); var4 != null; var4 = (class30)this.field158.method5193()) {
         var4.method713(var1, var2, var3);
      }

   }

   void method371(int var1) {
      for(class30 var2 = (class30)this.field158.method5202(); var2 != null; var2 = (class30)this.field158.method5193()) {
         var2.vmethod4574(var1);
      }

   }

   public final synchronized void vmethod4573(int[] var1, int var2, int var3) {
      do {
         if (this.field157 < 0) {
            this.method381(var1, var2, var3);
            return;
         }

         if (var3 + this.field155 < this.field157) {
            this.field155 += var3;
            this.method381(var1, var2, var3);
            return;
         }

         int var4 = this.field157 - this.field155;
         this.method381(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field155 += var4;
         this.method374();
         class35 var5 = (class35)this.field156.method5202();
         synchronized(var5) {
            int var7 = var5.method791(this);
            if (var7 < 0) {
               var5.field298 = 0;
               this.method376(var5);
            } else {
               var5.field298 = var7;
               this.method373(var5.field3964, var5);
            }
         }
      } while(var3 != 0);

   }

   public final synchronized void vmethod4574(int var1) {
      do {
         if (this.field157 < 0) {
            this.method371(var1);
            return;
         }

         if (this.field155 + var1 < this.field157) {
            this.field155 += var1;
            this.method371(var1);
            return;
         }

         int var2 = this.field157 - this.field155;
         this.method371(var2);
         var1 -= var2;
         this.field155 += var2;
         this.method374();
         class35 var3 = (class35)this.field156.method5202();
         synchronized(var3) {
            int var5 = var3.method791(this);
            if (var5 < 0) {
               var3.field298 = 0;
               this.method376(var3);
            } else {
               var3.field298 = var5;
               this.method373(var3.field3964, var3);
            }
         }
      } while(var1 != 0);

   }

   protected class30 vmethod4576() {
      return (class30)this.field158.method5193();
   }

   void method374() {
      if (this.field155 > 0) {
         for(class35 var1 = (class35)this.field156.method5202(); var1 != null; var1 = (class35)this.field156.method5193()) {
            var1.field298 -= this.field155;
         }

         this.field157 -= this.field155;
         this.field155 = 0;
      }

   }

   public final synchronized void method372(class30 var1) {
      this.field158.method5188(var1);
   }

   protected class30 vmethod4569() {
      return (class30)this.field158.method5202();
   }

   public final synchronized void method384(class30 var1) {
      var1.method6014();
   }

   void method376(class35 var1) {
      var1.method6014();
      var1.method790();
      class353 var2 = this.field156.field3717.field3964;
      if (var2 == this.field156.field3717) {
         this.field157 = -1;
      } else {
         this.field157 = ((class35)var2).field298;
      }

   }

   void method373(class353 var1, class35 var2) {
      while(this.field156.field3717 != var1 && ((class35)var1).field298 <= var2.field298) {
         var1 = var1.field3964;
      }

      class295.method5189(var2, var1);
      this.field157 = ((class35)this.field156.field3717.field3964).field298;
   }

   protected int vmethod4589() {
      return 0;
   }
}
