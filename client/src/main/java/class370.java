import java.util.Iterator;

class class370 implements Iterator {
   int field4147;
   // $FF: synthetic field
   final class371 this$0;

   class370(class371 var1) {
      this.this$0 = var1;
   }

   public Object next() {
      int var1 = ++this.field4147 - 1;
      class341 var2 = (class341)this.this$0.field4151.method4275((long)var1);
      return var2 != null ? var2 : this.this$0.method6415(var1);
   }

   public boolean hasNext() {
      return this.field4147 < this.this$0.method5968();
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public static boolean method6412(class276 var0, class276 var1) {
      class140.field1548 = var1;
      if (!var0.method4925()) {
         return false;
      } else {
         class140.field1531 = var0.method4946(35);
         class140.field1543 = new class140[class140.field1531];

         for(int var3 = 0; var3 < class140.field1531; ++var3) {
            byte[] var4 = var0.method4920(35, var3);
            class140.field1543[var3] = new class140(var3);
            if (var4 != null) {
               class140.field1543[var3].method2660(new Buffer(var4));
               class140.field1543[var3].method2666();
            }
         }

         return true;
      }
   }
}
