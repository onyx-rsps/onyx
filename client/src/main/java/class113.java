public class class113 extends class103 {
   int field1356;
   String field1355;
   // $FF: synthetic field
   final class106 this$0;

   class113(class106 var1) {
      this.this$0 = var1;
   }

   void vmethod2499(class114 var1) {
      var1.method2309(this.field1356, this.field1355);
   }

   void vmethod2494(Buffer var1) {
      this.field1356 = var1.method6784();
      this.field1355 = var1.method6569();
   }

   public static String method2279(CharSequence var0, class366 var1) {
      if (var0 == null) {
         return null;
      } else {
         int var3 = 0;

         int var4;
         boolean var5;
         char var6;
         for(var4 = var0.length(); var3 < var4; ++var3) {
            var6 = var0.charAt(var3);
            var5 = var6 == 160 || var6 == ' ' || var6 == '_' || var6 == '-';
            if (!var5) {
               break;
            }
         }

         while(var4 > var3) {
            var6 = var0.charAt(var4 - 1);
            var5 = var6 == 160 || var6 == ' ' || var6 == '_' || var6 == '-';
            if (!var5) {
               break;
            }

            --var4;
         }

         int var11 = var4 - var3;
         if (var11 >= 1 && var11 <= class346.method6006(var1)) {
            StringBuilder var10 = new StringBuilder(var11);

            for(int var7 = var3; var7 < var4; ++var7) {
               char var8 = var0.charAt(var7);
               if (class185.method3641(var8)) {
                  char var9 = class11.method109(var8);
                  if (var9 != 0) {
                     var10.append(var9);
                  }
               }
            }

            if (var10.length() == 0) {
               return null;
            } else {
               return var10.toString();
            }
         } else {
            return null;
         }
      }
   }
}
