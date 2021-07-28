import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;

public class class50 {
   static boolean field740;
   static boolean field752;
   static class248 field749;
   static class43[] field748;
   static int field742;
   static int field745;
   static int field747;
   static int[] field746;
   static int[] field750;
   static int[][] field743;
   static String[] field737;
   static String[] field741;
   static ArrayList field754;
   static Calendar field744;
   static final double field756;
   static final String[] field751;

   static {
      field750 = new int[5];
      field743 = new int[5][5000];
      field746 = new int[1000];
      field737 = new String[1000];
      field747 = 0;
      field748 = new class43[50];
      field744 = Calendar.getInstance();
      field751 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
      field752 = false;
      field740 = false;
      field754 = new ArrayList();
      field742 = 0;
      field756 = Math.log(2.0D);
   }

   static final void method1511(boolean var0) {
      if (var0) {
         client.field447 = class55.field820 ? class99.field1268 : class99.field1270;
      } else {
         LinkedHashMap var2 = class37.field307.field1114;
         String var4 = class55.field808;
         int var5 = var4.length();
         int var6 = 0;

         for(int var7 = 0; var7 < var5; ++var7) {
            var6 = (var6 << 5) - var6 + var4.charAt(var7);
         }

         client.field447 = var2.containsKey(var6) ? class99.field1276 : class99.field1267;
      }

   }

   static final void method1568(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      int var7;
      if (var6 < 0) {
         var7 = client.field660;
      } else if (var6 >= 100) {
         var7 = client.field631;
      } else {
         var7 = (client.field631 - client.field660) * var6 / 100 + client.field660;
      }

      int var8 = var3 * var7 * 512 / (var2 * 334);
      int var9;
      int var10;
      short var19;
      if (var8 < client.field666) {
         var19 = client.field666;
         var7 = var19 * var2 * 334 / (var3 * 512);
         if (var7 > client.field542) {
            var7 = client.field542;
            var9 = var3 * var7 * 512 / (var19 * 334);
            var10 = (var2 - var9) / 2;
            if (var4) {
               class393.method6910();
               class393.method6880(var0, var1, var10, var3, -16777216);
               class393.method6880(var0 + var2 - var10, var1, var10, var3, -16777216);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if (var8 > client.field667) {
         var19 = client.field667;
         var7 = var19 * var2 * 334 / (var3 * 512);
         if (var7 < client.field472) {
            var7 = client.field472;
            var9 = var19 * var2 * 334 / (var7 * 512);
            var10 = (var3 - var9) / 2;
            if (var4) {
               class393.method6910();
               class393.method6880(var0, var1, var2, var10, -16777216);
               class393.method6880(var0, var3 + var1 - var10, var2, var10, -16777216);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      client.field594 = var3 * var7 / 334;
      if (var2 != client.field670 || var3 != client.field671) {
         int[] var18 = new int[9];

         for(var10 = 0; var10 < var18.length; ++var10) {
            int var11 = var10 * 32 + 15 + 128;
            int var12 = var11 * 3 + 600;
            int var14 = class197.field2265[var11];
            int var16 = var3 - 334;
            if (var16 < 0) {
               var16 = 0;
            } else if (var16 > 100) {
               var16 = 100;
            }

            int var17 = (client.field448 - client.field662) * var16 / 100 + client.field662;
            int var15 = var12 * var17 / 256;
            var18[var10] = var14 * var15 >> 16;
         }

         class199.method3936(var18, 500, 800, var2 * 334 / var3, 334);
      }

      client.field668 = var0;
      client.field478 = var1;
      client.field670 = var2;
      client.field671 = var3;
   }

   static final void method1567() {
      client.field604 = client.field592;
      class82.field1182 = true;
   }
}
