public class class309 {
   public static byte[][][] field3774;
   public static int[] field3773;
   static byte[][] field3769;
   static byte[][] field3770;
   static byte[][] field3771;
   static int field3767;
   static int field3768;
   static int field3772;
   static String field3775;

   static {
      field3767 = 0;
      field3772 = 0;
      field3768 = 0;
      field3770 = new byte[1000][];
      field3771 = new byte[250][];
      field3769 = new byte[50][];
   }

   static synchronized byte[] method5564(int var0, boolean var1) {
      byte[] var3;
      if (var0 != 100) {
         if (var0 < 100) {
         }
      } else if (field3767 > 0) {
         var3 = field3770[--field3767];
         field3770[field3767] = null;
         return var3;
      }

      if (var0 != 5000) {
         if (var0 < 5000) {
         }
      } else if (field3772 > 0) {
         var3 = field3771[--field3772];
         field3771[field3772] = null;
         return var3;
      }

      if (var0 != 30000) {
         if (var0 < 30000) {
         }
      } else if (field3768 > 0) {
         var3 = field3769[--field3768];
         field3769[field3768] = null;
         return var3;
      }

      if (field3774 != null) {
         for(int var5 = 0; var5 < field3773.length; ++var5) {
            if (field3773[var5] != var0) {
               if (var0 < field3773[var5]) {
               }
            } else if (class127.field1459[var5] > 0) {
               byte[] var4 = field3774[var5][--class127.field1459[var5]];
               field3774[var5][class127.field1459[var5]] = null;
               return var4;
            }
         }
      }

      return new byte[var0];
   }
}
