public class class107 extends class103 {
   static int field1323;
   byte field1320;
   int field1321;
   // $FF: synthetic field
   final class106 this$0;

   class107(class106 var1) {
      this.this$0 = var1;
      this.field1321 = -1;
   }

   void vmethod2499(class114 var1) {
      var1.method2299(this.field1321, this.field1320);
   }

   void vmethod2494(class384 var1) {
      this.field1321 = var1.method6655();
      this.field1320 = var1.method6561();
   }

   static final void method2225() {
      for(int var1 = 0; var1 < class82.field1171; ++var1) {
         class69 var2 = client.field523[class82.field1177[var1]];
         var2.method1751();
      }

      class19.method349();
      if (class68.field971 != null) {
         class68.field971.method5639();
      }

   }

   static String method2224() {
      return class37.field307.field1116 ? class16.method176(class55.field808) : class55.field808;
   }

   static void method2221(boolean var0) {
      class55.field822 = "";
      class55.field813 = "Enter your username/email & password.";
      class55.field815 = "";
      class55.field811 = 2;
      if (var0) {
         class55.field817 = "";
      }

      class80.method1937();
      if (client.field442 && class55.field808 != null && class55.field808.length() > 0) {
         class55.field821 = 1;
      } else {
         class55.field821 = 0;
      }

   }

   static void method2223() {
      for(class66 var1 = (class66)client.field568.method6317(); var1 != null; var1 = (class66)client.field568.method6320()) {
         int var2 = var1.field949;
         if (class250.method4757(var2)) {
            boolean var3 = true;
            class248[] var4 = class248.field3038[var2];

            int var5;
            for(var5 = 0; var5 < var4.length; ++var5) {
               if (var4[var5] != null) {
                  var3 = var4[var5].field2992;
                  break;
               }
            }

            if (!var3) {
               var5 = (int)var1.field3965;
               class248 var6 = class86.method2063(var5);
               if (var6 != null) {
                  class80.method1934(var6);
               }
            }
         }
      }

   }

   static final void method2222() {
      int[] var1 = class82.field1177;

      int var2;
      for(var2 = 0; var2 < class82.field1171; ++var2) {
         class69 var3 = client.field523[var1[var2]];
         if (var3 != null && var3.field1036 > 0) {
            --var3.field1036;
            if (var3.field1036 == 0) {
               var3.field1033 = null;
            }
         }
      }

      for(var2 = 0; var2 < client.field684; ++var2) {
         int var5 = client.field449[var2];
         class77 var4 = client.field566[var5];
         if (var4 != null && var4.field1036 > 0) {
            --var4.field1036;
            if (var4.field1036 == 0) {
               var4.field1033 = null;
            }
         }
      }

   }
}
