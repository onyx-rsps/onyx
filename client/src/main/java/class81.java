public class class81 implements class290 {
   static int field1161;
   static int[] field1162;
   static final class81 field1154;
   static final class81 field1156;
   static final class81 field1157;
   static final class81 field1158;
   static final class81 field1160;
   final int field1159;

   public static int method1872(int var0) {
      return class346.field3942[var0 & 16383];
   }

   static void method1871() {
      if (null == class56.field809 || class56.field809.length() <= 0) {
         if (null != class38.field308.field1123) {
            class56.field809 = class38.field308.field1123;
            client.field443 = true;
         } else {
            client.field443 = false;
         }

      }
   }

   static boolean method1870(class156 var0) {
      if (var0.field1762 != null) {
         int[] var2 = var0.field1762;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            class156 var5 = class124.method2243(var4);
            if (var5.field1763 != -1) {
               return true;
            }
         }
      } else if (-1 != var0.field1763) {
         return true;
      }

      return false;
   }

   static int method1863(int var0, class59 var1, boolean var2) {
      class249 var4 = var2 ? class286.field3660 : class51.field750;
      if (var0 == 1500) {
         class51.field747[++class51.field746 - 1] = var4.field2971;
         return 1;
      } else if (var0 == 1501) {
         class51.field747[++class51.field746 - 1] = var4.field2972;
         return 1;
      } else if (var0 == 1502) {
         class51.field747[++class51.field746 - 1] = var4.field2973;
         return 1;
      } else if (var0 == 1503) {
         class51.field747[++class51.field746 - 1] = var4.field2990;
         return 1;
      } else if (1504 == var0) {
         class51.field747[++class51.field746 - 1] = var4.field2978 ? 1 : 0;
         return 1;
      } else if (1505 == var0) {
         class51.field747[++class51.field746 - 1] = var4.field3001;
         return 1;
      } else {
         return 2;
      }
   }

   static void method1868(class249[] var0, class249 var1, boolean var2) {
      int var4 = var1.field2981 != 0 ? 13396411 * var1.field2981 * 1852896115 : var1.field2973 * -396764045 * 1408116923;
      int var5 = 0 != var1.field3091 ? 1927321653 * var1.field3091 * -2086667747 : var1.field2990 * 1874739101 * 1272528565;
      class202.method3691(var0, var1.field2958, var4, var5, var2);
      if (var1.field3061 != null) {
         class202.method3691(var1.field3061, var1.field2958, var4, var5, var2);
      }

      class67 var6 = (class67)client.field569.method5746((long)var1.field2958);
      if (null != var6) {
         int var7 = var6.field950;
         if (class251.method4294(var7)) {
            class202.method3691(class249.field3039[var7], -1, var4, var5, var2);
         }
      }

      if (var1.field2962 == 1337) {
      }

   }

   static void method1869(class249 var0) {
      if (var0.field3100 == client.field616) {
         client.field617[var0.field2966] = true;
      }

   }

   static {
      field1154 = new class81(0);
      field1156 = new class81(1);
      field1157 = new class81(2);
      field1160 = new class81(3);
      field1158 = new class81(4);
   }

   class81(int var1) {
      this.field1159 = var1;
   }

   public int method4619() {
      return this.field1159;
   }
}
