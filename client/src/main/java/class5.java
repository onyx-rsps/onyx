public final class class5 {
   static int field7;

   static class149[] method17() {
      return new class149[]{class149.field1654, class149.field1653, class149.field1655};
   }

   public static void method16(int var0) {
      if (-1 != var0) {
         if (class101.field1282[var0]) {
            class249.field2951.method4470(var0);
            if (class249.field3039[var0] != null) {
               boolean var2 = true;

               for(int var3 = 0; var3 < class249.field3039[var0].length; ++var3) {
                  if (null != class249.field3039[var0][var3]) {
                     if (class249.field3039[var0][var3].field2977 != 2) {
                        class249.field3039[var0][var3] = null;
                     } else {
                        var2 = false;
                     }
                  }
               }

               if (var2) {
                  class249.field3039[var0] = null;
               }

               class101.field1282[var0] = false;
            }
         }
      }
   }
}
