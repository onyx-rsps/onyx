public class class108 extends class104 {
   static int field1324;
   byte field1321;
   int field1322;
   // $FF: synthetic field
   final class107 this$0;

   class108(class107 var1) {
      this.this$0 = var1;
      this.field1322 = -1;
   }

   void method2083(Buffer var1) {
      this.field1322 = var1.readUnsignedShort();
      this.field1321 = var1.method5949();
   }

   void method2084(class115 var1) {
      var1.method2129(this.field1322, this.field1321);
   }

   static String method2106() {
      return class38.field308.field1117 ? class17.method141(class56.field809) : class56.field809;
   }

   static void method2103(boolean var0) {
      class56.field823 = class270.field3441;
      class56.field814 = class270.field3335;
      class56.field816 = class270.field3444;
      class56.field812 = 2;
      if (var0) {
         class56.field818 = "";
      }

      class81.method1871();
      if (client.field443 && null != class56.field809 && class56.field809.length() > 0) {
         class56.field822 = 1;
      } else {
         class56.field822 = 0;
      }

   }

   static final void method2104() {
      int[] var1 = class83.field1178;

      int var2;
      for(var2 = 0; var2 < class83.field1172; ++var2) {
         class70 var3 = client.field524[var1[var2]];
         if (null != var3 && var3.field1037 > 0) {
            --var3.field1037;
            if (var3.field1037 == 0) {
               var3.field1034 = null;
            }
         }
      }

      for(var2 = 0; var2 < client.field685; ++var2) {
         int var5 = client.field450[var2];
         class78 var4 = client.field567[var5];
         if (null != var4 && var4.field1037 > 0) {
            --var4.field1037;
            if (0 == var4.field1037) {
               var4.field1034 = null;
            }
         }
      }

   }

   static void method2105() {
      for(class67 var1 = (class67)client.field569.first(); var1 != null; var1 = (class67)client.field569.method5739()) {
         int var2 = var1.field950;
         if (class251.method4294(var2)) {
            boolean var3 = true;
            class249[] var4 = class249.field3039[var2];

            int var5;
            for(var5 = 0; var5 < var4.length; ++var5) {
               if (null != var4[var5]) {
                  var3 = var4[var5].field2993;
                  break;
               }
            }

            if (!var3) {
               var5 = (int)var1.key;
               class249 var6 = Clock.method1995(var5);
               if (null != var6) {
                  class81.method1869(var6);
               }
            }
         }
      }

   }

   static final void method2107() {
      for(int var1 = 0; var1 < class83.field1172; ++var1) {
         class70 var2 = client.field524[class83.field1178[var1]];
         var2.method1702();
      }

      class20.method306();
      if (class69.field972 != null) {
         class69.field972.method5107();
      }

   }
}
