public class class22 extends class40 {
   int field166;
   public boolean field167;
   public byte[] field164;
   public int field163;
   public int field165;

   class22(int var1, byte[] var2, int var3, int var4) {
      this.field163 = var1;
      this.field164 = var2;
      this.field165 = var3;
      this.field166 = var4;
   }

   class22(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field163 = var1;
      this.field164 = var2;
      this.field165 = var3;
      this.field166 = var4;
      this.field167 = var5;
   }

   public class22 method422(class37 var1) {
      this.field164 = var1.method807(this.field164);
      this.field163 = var1.method800(this.field163);
      if (this.field165 == this.field166) {
         this.field165 = this.field166 = var1.method801(this.field165);
      } else {
         this.field165 = var1.method801(this.field165);
         this.field166 = var1.method801(this.field166);
         if (this.field165 == this.field166) {
            --this.field165;
         }
      }

      return this;
   }
}
