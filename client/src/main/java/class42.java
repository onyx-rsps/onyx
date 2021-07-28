import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class42 extends class353 {
   byte[][][] field361;
   int field357;
   int field358;
   int[] field359;
   int[] field360;
   int[] field362;
   Field[] field363;
   Method[] field364;

   class42() {
   }

   static final void method848(class71 var0) {
      if (var0.field1074 != 0) {
         if (var0.field1046 != -1) {
            Object var2 = null;
            if (var0.field1046 < 32768) {
               var2 = client.field566[var0.field1046];
            } else if (var0.field1046 >= 32768) {
               var2 = client.field523[var0.field1046 - '\u8000'];
            }

            if (var2 != null) {
               int var3 = var0.field1068 - ((class71)var2).field1068;
               int var4 = var0.field1058 - ((class71)var2).field1058;
               if (var3 != 0 || var4 != 0) {
                  var0.field1042 = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
               }
            } else if (var0.field1031) {
               var0.field1046 = -1;
               var0.field1031 = false;
            }
         }

         if (var0.field1048 != -1 && (var0.field1026 == 0 || var0.field1078 > 0)) {
            var0.field1042 = var0.field1048;
            var0.field1048 = -1;
         }

         int var5 = var0.field1042 - var0.field1021 & 2047;
         if (var5 == 0 && var0.field1031) {
            var0.field1046 = -1;
            var0.field1031 = false;
         }

         if (var5 != 0) {
            ++var0.field1072;
            boolean var7;
            if (var5 > 1024) {
               var0.field1021 -= var0.field1074;
               var7 = true;
               if (var5 < var0.field1074 || var5 > 2048 - var0.field1074) {
                  var0.field1021 = var0.field1042;
                  var7 = false;
               }

               if (var0.field1049 == var0.field1029 && (var0.field1072 > 25 || var7)) {
                  if (var0.field1051 != -1) {
                     var0.field1049 = var0.field1051;
                  } else {
                     var0.field1049 = var0.field1028;
                  }
               }
            } else {
               var0.field1021 += var0.field1074;
               var7 = true;
               if (var5 < var0.field1074 || var5 > 2048 - var0.field1074) {
                  var0.field1021 = var0.field1042;
                  var7 = false;
               }

               if (var0.field1029 == var0.field1049 && (var0.field1072 > 25 || var7)) {
                  if (var0.field1019 != -1) {
                     var0.field1049 = var0.field1019;
                  } else {
                     var0.field1049 = var0.field1028;
                  }
               }
            }

            var0.field1021 &= 2047;
         } else {
            var0.field1072 = 0;
         }

      }
   }

   static boolean method847() {
      return client.field554;
   }
}
