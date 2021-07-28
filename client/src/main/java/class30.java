public abstract class class30 extends class353 {
   class30 field251;
   class40 field252;
   int field253;
   volatile boolean field250;

   protected class30() {
      this.field250 = true;
   }

   protected abstract void vmethod4573(int[] var1, int var2, int var3);

   protected abstract void vmethod4574(int var1);

   final void method713(int[] var1, int var2, int var3) {
      if (this.field250) {
         this.vmethod4573(var1, var2, var3);
      } else {
         this.vmethod4574(var3);
      }

   }

   protected abstract class30 vmethod4576();

   protected abstract class30 vmethod4569();

   int vmethod716() {
      return 255;
   }

   protected abstract int vmethod4589();
}
