public class class80 implements class289 {
   static int field1160;
   static int[] field1161;
   static final class80 field1153;
   static final class80 field1155;
   static final class80 field1156;
   static final class80 field1157;
   static final class80 field1159;
   final int field1158;

   static {
      field1153 = new class80(0);
      field1155 = new class80(1);
      field1156 = new class80(2);
      field1159 = new class80(3);
      field1157 = new class80(4);
   }

   class80(int var1) {
      this.field1158 = var1;
   }

   public int vmethod6962() {
      return this.field1158;
   }

   static void method1934(class248 var0) {
      if (var0.field3099 == client.field615) {
         client.field616[var0.field2965] = true;
      }

   }

   static boolean method1935(class155 var0) {
      if (var0.field1761 != null) {
         int[] var2 = var0.field1761;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            class155 var5 = class123.method2465(var4);
            if (var5.field1762 != -1) {
               return true;
            }
         }
      } else if (var0.field1762 != -1) {
         return true;
      }

      return false;
   }

   static void method1933(class248[] var0, class248 var1, boolean var2) {
      int var4 = var1.field2980 != 0 ? var1.field2980 : var1.field2972;
      int var5 = var1.field3090 != 0 ? var1.field3090 : var1.field2989;
      class201.method4095(var0, var1.field2957, var4, var5, var2);
      if (var1.field3060 != null) {
         class201.method4095(var1.field3060, var1.field2957, var4, var5, var2);
      }

      class66 var6 = (class66)client.field568.method6327((long)var1.field2957);
      if (var6 != null) {
         int var7 = var6.field949;
         if (class250.method4757(var7)) {
            class201.method4095(class248.field3038[var7], -1, var4, var5, var2);
         }
      }

      if (var1.field2961 == 1337) {
      }

   }

   static void method1937() {
      if (class55.field808 == null || class55.field808.length() <= 0) {
         if (class37.field307.field1122 != null) {
            class55.field808 = class37.field307.field1122;
            client.field442 = true;
         } else {
            client.field442 = false;
         }

      }
   }

   static int method1926(int var0, class58 var1, boolean var2) {
      class248 var4 = var2 ? class285.field3659 : class50.field749;
      if (var0 == 1500) {
         class50.field746[++class50.field745 - 1] = var4.field2970;
         return 1;
      } else if (var0 == 1501) {
         class50.field746[++class50.field745 - 1] = var4.field2971;
         return 1;
      } else if (var0 == 1502) {
         class50.field746[++class50.field745 - 1] = var4.field2972;
         return 1;
      } else if (var0 == 1503) {
         class50.field746[++class50.field745 - 1] = var4.field2989;
         return 1;
      } else if (var0 == 1504) {
         class50.field746[++class50.field745 - 1] = var4.field2977 ? 1 : 0;
         return 1;
      } else if (var0 == 1505) {
         class50.field746[++class50.field745 - 1] = var4.field3000;
         return 1;
      } else {
         return 2;
      }
   }

   public static int method1938(int var0) {
      return class345.field3941[var0 & 16383];
   }
}
