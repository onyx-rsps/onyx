public abstract class class252 {
   class252() {
   }

   abstract byte[] vmethod4786();

   public abstract void vmethod4787(byte[] var1);

   static final void method4765() {
      class171.method3482();
      if (class68.field971 != null) {
         class68.field971.method5656();
      }

   }

   public static void method4782() {
      class150.field1679.method4309();
   }

   static final void method4780() {
      for(class70 var1 = (class70)client.field536.method5202(); var1 != null; var1 = (class70)client.field536.method5193()) {
         if (var1.field1018 > 0) {
            --var1.field1018;
         }

         if (var1.field1018 == 0) {
            if (var1.field1011 < 0 || class127.method2493(var1.field1011, var1.field1009)) {
               class200.method4089(var1.field1017, var1.field1008, var1.field1015, var1.field1010, var1.field1011, var1.field1012, var1.field1009);
               var1.method6014();
            }
         } else {
            if (var1.field1007 > 0) {
               --var1.field1007;
            }

            if (var1.field1007 == 0 && var1.field1015 >= 1 && var1.field1010 >= 1 && var1.field1015 <= 102 && var1.field1010 <= 102) {
               if (var1.field1014 >= 0) {
                  int var3 = var1.field1014;
                  int var4 = var1.field1016;
                  class155 var5 = class123.method2465(var3);
                  if (var4 == 11) {
                     var4 = 10;
                  }

                  if (var4 >= 5 && var4 <= 8) {
                     var4 = 4;
                  }

                  boolean var2 = var5.method2924(var4);
                  if (!var2) {
                     continue;
                  }
               }

               class200.method4089(var1.field1017, var1.field1008, var1.field1015, var1.field1010, var1.field1014, var1.field1013, var1.field1016);
               var1.field1007 = -1;
               if (var1.field1011 == var1.field1014 && var1.field1011 == -1) {
                  var1.method6014();
               } else if (var1.field1011 == var1.field1014 && var1.field1012 == var1.field1013 && var1.field1009 == var1.field1016) {
                  var1.method6014();
               }
            }
         }
      }

   }
}
