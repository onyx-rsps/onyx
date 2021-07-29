import java.util.Iterator;
import java.util.LinkedList;

public class class167 {
   boolean field1946;
   class244 field1948;
   int field1947;
   int field1949;
   int field1950;
   int field1951;
   int field1952;
   int field1955;
   int field1956;
   String field1944;
   String field1945;
   LinkedList field1954;

   public class167() {
      this.field1949 = -1;
      this.field1955 = -1;
      this.field1947 = -1;
      this.field1948 = null;
      this.field1952 = Integer.MAX_VALUE;
      this.field1950 = 0;
      this.field1951 = Integer.MAX_VALUE;
      this.field1956 = 0;
      this.field1946 = false;
   }

   public void method3220(Buffer var1, int var2) {
      this.field1949 = var2;
      this.field1944 = var1.method6569();
      this.field1945 = var1.method6569();
      this.field1948 = new class244(var1.method6784());
      this.field1955 = var1.method6784();
      var1.method6560();
      this.field1946 = var1.method6560() == 1;
      this.field1947 = var1.method6560();
      int var4 = var1.method6560();
      this.field1954 = new LinkedList();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field1954.add(this.method3221(var1));
      }

      this.method3262();
   }

   public boolean method3223(int var1, int var2) {
      int var4 = var1 / 64;
      int var5 = var2 / 64;
      if (var4 >= this.field1952 && var4 <= this.field1950) {
         if (var5 >= this.field1951 && var5 <= this.field1956) {
            Iterator var6 = this.field1954.iterator();

            class187 var7;
            do {
               if (!var6.hasNext()) {
                  return false;
               }

               var7 = (class187)var6.next();
            } while(!var7.vmethod3650(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int[] method3258(int var1, int var2, int var3) {
      Iterator var5 = this.field1954.iterator();

      class187 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class187)var5.next();
      } while(!var6.vmethod3652(var1, var2, var3));

      return var6.vmethod3651(var1, var2, var3);
   }

   public int method3227() {
      return this.field1949;
   }

   public int method3279() {
      return this.field1952;
   }

   public int method3235() {
      return this.field1951;
   }

   public boolean method3222(int var1, int var2, int var3) {
      Iterator var5 = this.field1954.iterator();

      class187 var6;
      do {
         if (!var5.hasNext()) {
            return false;
         }

         var6 = (class187)var5.next();
      } while(!var6.vmethod3652(var1, var2, var3));

      return true;
   }

   public class244 method3225(int var1, int var2) {
      Iterator var4 = this.field1954.iterator();

      class187 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (class187)var4.next();
      } while(!var5.vmethod3650(var1, var2));

      return var5.vmethod3653(var1, var2);
   }

   public int method3238() {
      return this.field1948.field2920;
   }

   public String method3229() {
      return this.field1944;
   }

   public int method3248() {
      return this.field1948.field2919;
   }

   public int method3239() {
      return this.field1948.field2921;
   }

   public int method3255() {
      return this.field1947;
   }

   void method3262() {
      Iterator var2 = this.field1954.iterator();

      while(var2.hasNext()) {
         class187 var3 = (class187)var2.next();
         var3.vmethod3649(this);
      }

   }

   class187 method3221(Buffer var1) {
      int var3 = var1.method6560();
      class175 var4 = (class175)class250.method4750(class175.method3527(), var3);
      Object var5 = null;
      switch(var4.field2037) {
      case 0:
         var5 = new class171();
         break;
      case 1:
         var5 = new class166();
         break;
      case 2:
         var5 = new class174();
         break;
      case 3:
         var5 = new class184();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class187)var5).vmethod3660(var1);
      return (class187)var5;
   }

   public int method3234() {
      return this.field1950;
   }

   public boolean method3219() {
      return this.field1946;
   }

   public int method3236() {
      return this.field1956;
   }

   int method3231() {
      return this.field1955;
   }

   public String method3230() {
      return this.field1945;
   }

   public class244 method3240() {
      return new class244(this.field1948);
   }

   static void method3287(int var0, int var1, int var2, class155 var3, int var4) {
      class49 var6 = new class49();
      var6.field721 = var0;
      var6.field720 = var1 * 128;
      var6.field730 = var2 * 128;
      int var7 = var3.field1749;
      int var8 = var3.field1750;
      if (var4 == 1 || var4 == 3) {
         var7 = var3.field1750;
         var8 = var3.field1749;
      }

      var6.field722 = (var7 + var1) * 128;
      var6.field723 = (var8 + var2) * 128;
      var6.field733 = var3.field1765;
      var6.field718 = var3.field1779 * 128;
      var6.field727 = var3.field1755;
      var6.field728 = var3.field1781;
      var6.field729 = var3.field1780;
      if (var3.field1761 != null) {
         var6.field732 = var3;
         var6.method1429();
      }

      class49.field719.method5187(var6);
      if (var6.field729 != null) {
         var6.field725 = var6.field727 + (int)(Math.random() * (double)(var6.field728 - var6.field727));
      }

   }
}
