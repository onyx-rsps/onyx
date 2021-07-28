public final class class4 {
   static int field6;

   static class148[] method21() {
      return new class148[]{class148.field1653, class148.field1652, class148.field1654};
   }

   public static void method20(int var0) {
      if (var0 != -1) {
         if (class100.field1281[var0]) {
            class248.field2950.method4978(var0);
            if (class248.field3038[var0] != null) {
               boolean var2 = true;

               for(int var3 = 0; var3 < class248.field3038[var0].length; ++var3) {
                  if (class248.field3038[var0][var3] != null) {
                     if (class248.field3038[var0][var3].field2976 != 2) {
                        class248.field3038[var0][var3] = null;
                     } else {
                        var2 = false;
                     }
                  }
               }

               if (var2) {
                  class248.field3038[var0] = null;
               }

               class100.field1281[var0] = false;
            }
         }
      }
   }
}
