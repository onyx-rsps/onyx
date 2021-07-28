import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class325 {
   class323[] field3858;
   int field3857;
   Comparator field3856;
   HashMap field3860;
   HashMap field3861;
   final int field3859;

   class325(int var1) {
      this.field3857 = 0;
      this.field3856 = null;
      this.field3859 = var1;
      this.field3858 = this.vmethod5785(var1);
      this.field3860 = new HashMap(var1 / 8);
      this.field3861 = new HashMap(var1 / 8);
   }

   public class323 method5733(class405 var1) {
      class323 var3 = this.method5734(var1);
      return var3 != null ? var3 : this.method5735(var1);
   }

   final int method5743(class323 var1) {
      for(int var3 = 0; var3 < this.field3857; ++var3) {
         if (this.field3858[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   class323 method5786(class405 var1, class405 var2) {
      if (this.method5734(var1) != null) {
         throw new IllegalStateException();
      } else {
         class323 var4 = this.vmethod5731();
         var4.method5701(var1, var2);
         this.method5745(var4);
         this.method5746(var4);
         return var4;
      }
   }

   final void method5728(class323 var1) {
      if (this.field3860.remove(var1.field3852) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field3851 != null) {
            this.field3861.remove(var1.field3851);
         }

      }
   }

   class323 method5734(class405 var1) {
      return !var1.method7143() ? null : (class323)this.field3860.get(var1);
   }

   public int method5744() {
      return this.field3857;
   }

   public boolean method5797() {
      return this.field3859 == this.field3857;
   }

   public final void method5741() {
      if (this.field3856 == null) {
         Arrays.sort(this.field3858, 0, this.field3857);
      } else {
         Arrays.sort(this.field3858, 0, this.field3857, this.field3856);
      }

   }

   public boolean method5754(class405 var1) {
      if (!var1.method7143()) {
         return false;
      } else {
         return this.field3860.containsKey(var1) ? true : this.field3861.containsKey(var1);
      }
   }

   class323 method5735(class405 var1) {
      return !var1.method7143() ? null : (class323)this.field3861.get(var1);
   }

   abstract class323 vmethod5731();

   public void method5729() {
      this.field3857 = 0;
      Arrays.fill(this.field3858, (Object)null);
      this.field3860.clear();
      this.field3861.clear();
   }

   final void method5760(int var1) {
      --this.field3857;
      if (var1 < this.field3857) {
         System.arraycopy(this.field3858, var1 + 1, this.field3858, var1, this.field3857 - var1);
      }

   }

   final void method5737(class323 var1) {
      int var3 = this.method5743(var1);
      if (var3 != -1) {
         this.method5760(var3);
         this.method5728(var1);
      }
   }

   public final class323 method5740(int var1) {
      if (var1 >= 0 && var1 < this.field3857) {
         return this.field3858[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   final void method5746(class323 var1) {
      this.field3860.put(var1.field3852, var1);
      if (var1.field3851 != null) {
         class323 var3 = (class323)this.field3861.put(var1.field3851, var1);
         if (var3 != null && var3 != var1) {
            var3.field3851 = null;
         }
      }

   }

   abstract class323[] vmethod5785(int var1);

   public final boolean method5736(class405 var1) {
      class323 var3 = this.method5734(var1);
      if (var3 == null) {
         return false;
      } else {
         this.method5737(var3);
         return true;
      }
   }

   final void method5745(class323 var1) {
      this.field3858[++this.field3857 - 1] = var1;
   }

   class323 method5738(class405 var1) {
      return this.method5786(var1, (class405)null);
   }

   final void method5742(class323 var1, class405 var2, class405 var3) {
      this.method5728(var1);
      var1.method5701(var2, var3);
      this.method5746(var1);
   }

   public final void method5793() {
      this.field3856 = null;
   }

   public final void method5783(Comparator var1) {
      if (this.field3856 == null) {
         this.field3856 = var1;
      } else if (this.field3856 instanceof class324) {
         ((class324)this.field3856).method5721(var1);
      }

   }
}
