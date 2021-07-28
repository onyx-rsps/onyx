import java.util.Iterator;

public class class371 extends class340 implements class218 {
   final class220 field4151;
   final class276 field4150;
   final int field4149;

   public class371(class265 var1, int var2, class291 var3, class276 var4) {
      super(var1, var3, var4 != null ? var4.method4946(var2) : 0);
      this.field4151 = new class220(64);
      this.field4150 = var4;
      this.field4149 = var2;
   }

   protected class342 vmethod6414(int var1) {
      synchronized(this.field4151) {
         class341 var3 = (class341)this.field4151.method4275((long)var1);
         if (var3 == null) {
            var3 = this.method6415(var1);
            this.field4151.method4278(var3, (long)var1);
         }

         return var3;
      }
   }

   class341 method6415(int var1) {
      byte[] var3 = this.field4150.method4920(this.field4149, var1);
      class341 var4 = new class341(var1);
      if (var3 != null) {
         var4.method5988(new class384(var3));
      }

      return var4;
   }

   public void method6416() {
      synchronized(this.field4151) {
         this.field4151.method4281();
      }
   }

   public Iterator iterator() {
      return new class370(this);
   }
}
