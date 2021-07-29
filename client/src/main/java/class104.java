public abstract class class104 extends class354 {
   static class124 field1294;
   static int field1295;

   public static int method2082(int var0) {
      return var0 >> 11 & 63;
   }

   public static class229 method2090(int var0, String var1, class292 var2, int var3) {
      class229 var5 = class149.method2495(class227.field2644, client.field453.field1205);
      var5.field2691.method5931(0);
      int var6 = var5.field2691.field4182;
      var5.field2691.method5931(var0);
      String var7 = var1.toLowerCase();
      byte var8 = 0;
      if (var7.startsWith(class270.field3406)) {
         var8 = 0;
         var1 = var1.substring(class270.field3406.length());
      } else if (var7.startsWith(class270.field3391)) {
         var8 = 1;
         var1 = var1.substring(class270.field3391.length());
      } else if (var7.startsWith(class270.field3410)) {
         var8 = 2;
         var1 = var1.substring(class270.field3410.length());
      } else if (var7.startsWith(class270.field3439)) {
         var8 = 3;
         var1 = var1.substring(class270.field3439.length());
      } else if (var7.startsWith(class270.field3497)) {
         var8 = 4;
         var1 = var1.substring(class270.field3497.length());
      } else if (var7.startsWith(class270.field3416)) {
         var8 = 5;
         var1 = var1.substring(class270.field3416.length());
      } else if (var7.startsWith(class270.field3418)) {
         var8 = 6;
         var1 = var1.substring(class270.field3418.length());
      } else if (var7.startsWith(class270.field3529)) {
         var8 = 7;
         var1 = var1.substring(class270.field3529.length());
      } else if (var7.startsWith(class270.field3313)) {
         var8 = 8;
         var1 = var1.substring(class270.field3313.length());
      } else if (var7.startsWith(class270.field3424)) {
         var8 = 9;
         var1 = var1.substring(class270.field3424.length());
      } else if (var7.startsWith(class270.field3426)) {
         var8 = 10;
         var1 = var1.substring(class270.field3426.length());
      } else if (var7.startsWith(class270.field3364)) {
         var8 = 11;
         var1 = var1.substring(class270.field3364.length());
      } else if (class292.field3694 != var2) {
         if (var7.startsWith(class270.field3492)) {
            var8 = 0;
            var1 = var1.substring(class270.field3492.length());
         } else if (var7.startsWith(class270.field3409)) {
            var8 = 1;
            var1 = var1.substring(class270.field3409.length());
         } else if (var7.startsWith(class270.field3411)) {
            var8 = 2;
            var1 = var1.substring(class270.field3411.length());
         } else if (var7.startsWith(class270.field3413)) {
            var8 = 3;
            var1 = var1.substring(class270.field3413.length());
         } else if (var7.startsWith(class270.field3415)) {
            var8 = 4;
            var1 = var1.substring(class270.field3415.length());
         } else if (var7.startsWith(class270.field3417)) {
            var8 = 5;
            var1 = var1.substring(class270.field3417.length());
         } else if (var7.startsWith(class270.field3419)) {
            var8 = 6;
            var1 = var1.substring(class270.field3419.length());
         } else if (var7.startsWith(class270.field3421)) {
            var8 = 7;
            var1 = var1.substring(class270.field3421.length());
         } else if (var7.startsWith(class270.field3465)) {
            var8 = 8;
            var1 = var1.substring(class270.field3465.length());
         } else if (var7.startsWith(class270.field3425)) {
            var8 = 9;
            var1 = var1.substring(class270.field3425.length());
         } else if (var7.startsWith(class270.field3427)) {
            var8 = 10;
            var1 = var1.substring(class270.field3427.length());
         } else if (var7.startsWith(class270.field3429)) {
            var8 = 11;
            var1 = var1.substring(class270.field3429.length());
         }
      }

      var7 = var1.toLowerCase();
      byte var9 = 0;
      if (var7.startsWith(class270.field3430)) {
         var9 = 1;
         var1 = var1.substring(class270.field3430.length());
      } else if (var7.startsWith(class270.field3463)) {
         var9 = 2;
         var1 = var1.substring(class270.field3463.length());
      } else if (var7.startsWith(class270.field3469)) {
         var9 = 3;
         var1 = var1.substring(class270.field3469.length());
      } else if (var7.startsWith(class270.field3436)) {
         var9 = 4;
         var1 = var1.substring(class270.field3436.length());
      } else if (var7.startsWith(class270.field3438)) {
         var9 = 5;
         var1 = var1.substring(class270.field3438.length());
      } else if (var2 != class292.field3694) {
         if (var7.startsWith(class270.field3431)) {
            var9 = 1;
            var1 = var1.substring(class270.field3431.length());
         } else if (var7.startsWith(class270.field3269)) {
            var9 = 2;
            var1 = var1.substring(class270.field3269.length());
         } else if (var7.startsWith(class270.field3297)) {
            var9 = 3;
            var1 = var1.substring(class270.field3297.length());
         } else if (var7.startsWith(class270.field3373)) {
            var9 = 4;
            var1 = var1.substring(class270.field3373.length());
         } else if (var7.startsWith(class270.field3342)) {
            var9 = 5;
            var1 = var1.substring(class270.field3342.length());
         }
      }

      var5.field2691.method5931(var8);
      var5.field2691.method5931(var9);
      class243.method4149(var5.field2691, var1);
      if (var0 == class257.field3132.method4619()) {
         var5.field2691.method5931(var3);
      }

      var5.field2691.method5945(var5.field2691.field4182 - var6);
      return var5;
   }

   class104() {
   }

   abstract void method2083(class385 var1);

   abstract void method2084(class115 var1);
}
