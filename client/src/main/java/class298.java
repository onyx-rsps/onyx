import java.util.Collection;
import java.util.Iterator;

public class class298 implements Iterable, Collection {
   Node field3723;
   Node field3724;

   public class298() {
      this.field3723 = new Node();
      this.field3723.field3965 = this.field3723;
      this.field3723.field3967 = this.field3723;
   }

   public void method4763() {
      while(this.field3723.field3965 != this.field3723) {
         this.field3723.field3965.method5437();
      }

   }

   public void method4721(Node var1) {
      if (var1.field3967 != null) {
         var1.method5437();
      }

      var1.field3967 = this.field3723.field3967;
      var1.field3965 = this.field3723;
      var1.field3967.field3965 = var1;
      var1.field3965.field3967 = var1;
   }

   public void method4722(Node var1) {
      if (var1.field3967 != null) {
         var1.method5437();
      }

      var1.field3967 = this.field3723;
      var1.field3965 = this.field3723.field3965;
      var1.field3967.field3965 = var1;
      var1.field3965.field3967 = var1;
   }

   public static void method4778(Node var0, Node var1) {
      if (var0.field3967 != null) {
         var0.method5437();
      }

      var0.field3967 = var1;
      var0.field3965 = var1.field3965;
      var0.field3967.field3965 = var0;
      var0.field3965.field3967 = var0;
   }

   public Node method4724() {
      return this.method4725((Node)null);
   }

   Node method4725(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.field3723.field3965;
      } else {
         var2 = var1;
      }

      if (var2 == this.field3723) {
         this.field3724 = null;
         return null;
      } else {
         this.field3724 = var2.field3965;
         return var2;
      }
   }

   public Node method4726() {
      Node var1 = this.field3724;
      if (var1 == this.field3723) {
         this.field3724 = null;
         return null;
      } else {
         this.field3724 = var1.field3965;
         return var1;
      }
   }

   int method4733() {
      int var1 = 0;

      for(Node var2 = this.field3723.field3965; var2 != this.field3723; var2 = var2.field3965) {
         ++var1;
      }

      return var1;
   }

   public boolean method4788() {
      return this.field3723.field3965 == this.field3723;
   }

   Node[] method4729() {
      Node[] var1 = new Node[this.method4733()];
      int var2 = 0;

      for(Node var3 = this.field3723.field3965; var3 != this.field3723; var3 = var3.field3965) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Iterator iterator() {
      return new class297(this);
   }

   public int size() {
      return this.method4733();
   }

   public boolean isEmpty() {
      return this.method4788();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.method4729();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(Node var3 = this.field3723.field3965; var3 != this.field3723; var3 = var3.field3965) {
         var1[var2++] = var3;
      }

      return var1;
   }

   boolean method4732(Node var1) {
      this.method4721(var1);
      return true;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.method4763();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean add(Object var1) { throw new RuntimeException(); }

}
