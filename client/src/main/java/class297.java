import java.util.Collection;
import java.util.Iterator;

public class class297 implements Iterable, Collection {
   class353 field3722;
   class353 field3723;

   public class297() {
      this.field3722 = new class353();
      this.field3722.field3964 = this.field3722;
      this.field3722.field3966 = this.field3722;
   }

   class353[] method5244() {
      class353[] var1 = new class353[this.method5248()];
      int var2 = 0;

      for(class353 var3 = this.field3722.field3964; var3 != this.field3722; var3 = var3.field3964) {
         var1[var2++] = var3;
      }

      return var1;
   }

   boolean method5247(class353 var1) {
      this.method5236(var1);
      return true;
   }

   int method5248() {
      int var1 = 0;

      for(class353 var2 = this.field3722.field3964; var2 != this.field3722; var2 = var2.field3964) {
         ++var1;
      }

      return var1;
   }

   public void method5275() {
      while(this.field3722.field3964 != this.field3722) {
         this.field3722.field3964.method6014();
      }

   }

   class353 method5240(class353 var1) {
      class353 var2;
      if (var1 == null) {
         var2 = this.field3722.field3964;
      } else {
         var2 = var1;
      }

      if (var2 == this.field3722) {
         this.field3723 = null;
         return null;
      } else {
         this.field3723 = var2.field3964;
         return var2;
      }
   }

   public boolean method5300() {
      return this.field3722.field3964 == this.field3722;
   }

   public void method5236(class353 var1) {
      if (var1.field3966 != null) {
         var1.method6014();
      }

      var1.field3966 = this.field3722.field3966;
      var1.field3964 = this.field3722;
      var1.field3966.field3964 = var1;
      var1.field3964.field3966 = var1;
   }

   public class353 method5239() {
      return this.method5240((class353)null);
   }

   public class353 method5241() {
      class353 var1 = this.field3723;
      if (var1 == this.field3722) {
         this.field3723 = null;
         return null;
      } else {
         this.field3723 = var1.field3964;
         return var1;
      }
   }

   public void method5237(class353 var1) {
      if (var1.field3966 != null) {
         var1.method6014();
      }

      var1.field3966 = this.field3722;
      var1.field3964 = this.field3722.field3964;
      var1.field3966.field3964 = var1;
      var1.field3964.field3966 = var1;
   }

   public Iterator iterator() {
      return new class296(this);
   }

   public int size() {
      return this.method5248();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(class353 var3 = this.field3722.field3964; var3 != this.field3722; var3 = var3.field3964) {
         var1[var2++] = var3;
      }

      return var1;
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

   public void clear() {
      this.method5275();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean isEmpty() {
      return this.method5300();
   }

   public Object[] toArray() {
      return this.method5244();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean add(Object var1) { throw new RuntimeException(); }

   public static void method5290(class353 var0, class353 var1) {
      if (var0.field3966 != null) {
         var0.method6014();
      }

      var0.field3966 = var1;
      var0.field3964 = var1.field3964;
      var0.field3966.field3964 = var0;
      var0.field3964.field3966 = var0;
   }
}
