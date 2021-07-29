import java.util.Comparator;

public class class46 implements Comparator {
   static class301 field397;
   static class396 field396;
   boolean field398;

   class46() {
   }

   int method896(class284 var1, class284 var2) {
      if (var2.field3647 == var1.field3647) {
         return 0;
      } else {
         if (this.field398) {
            if (client.field404 == var1.field3647) {
               return -1;
            }

            if (var2.field3647 == client.field404) {
               return 1;
            }
         }

         return var1.field3647 < var2.field3647 ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method896((class284)var1, (class284)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final byte[] method897(byte[] var0) {
      Buffer var2 = new Buffer(var0);
      int var3 = var2.method6560();
      int var4 = var2.method6784();
      if (var4 >= 0 && (class276.field3591 == 0 || var4 <= class276.field3591)) {
         if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method6572(var5, 0, var4);
            return var5;
         } else {
            int var7 = var2.method6784();
            if (var7 < 0 || class276.field3591 != 0 && var7 > class276.field3591) {
               throw new RuntimeException();
            } else {
               byte[] var6 = new byte[var7];
               if (var3 == 1) {
                  class386.method6811(var6, var7, var0, var4, 9);
               } else {
                  class276.field3589.method7132(var2, var6);
               }

               return var6;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   static final void method889(String var0) {
      if (!var0.equals("")) {
         class228 var2 = class148.method2788(class226.field2654, client.field452.field1204);
         var2.field2690.writeByte(class280.method5040(var0));
         var2.field2690.method6550(var0);
         client.field452.method2031(var2);
      }
   }

   static final int method890(int var0, int var1, int var2, int var3) {
      int var5 = 65536 - class197.field2272[var2 * 1024 / var3] >> 1;
      return ((65536 - var5) * var0 >> 16) + (var5 * var1 >> 16);
   }
}
