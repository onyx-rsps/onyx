import java.util.Date;

public class class64 extends class353 {
   static class363 field934;
   static int field933;
   int[] field930;
   int[] field931;

   static {
      field934 = new class363(32);
   }

   class64() {
      this.field930 = new int[]{-1};
      this.field931 = new int[]{0};
   }

   public static String method1724(long var0) {
      class253.field3122.setTime(new Date(var0));
      int var2 = class253.field3122.get(7);
      int var3 = class253.field3122.get(5);
      int var4 = class253.field3122.get(2);
      int var5 = class253.field3122.get(1);
      int var6 = class253.field3122.get(11);
      int var7 = class253.field3122.get(12);
      int var8 = class253.field3122.get(13);
      return class253.field3121[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + class253.field3120[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }

   static final void method1714(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class70 var10 = null;

      for(class70 var11 = (class70)client.field536.method5202(); var11 != null; var11 = (class70)client.field536.method5193()) {
         if (var0 == var11.field1017 && var11.field1015 == var1 && var2 == var11.field1010 && var3 == var11.field1008) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         var10 = new class70();
         var10.field1017 = var0;
         var10.field1008 = var3;
         var10.field1015 = var1;
         var10.field1010 = var2;
         class84.method2026(var10);
         client.field536.method5187(var10);
      }

      var10.field1014 = var4;
      var10.field1016 = var5;
      var10.field1013 = var6;
      var10.field1007 = var7;
      var10.field1018 = var8;
   }

   static final void method1725() {
      for(class56 var1 = (class56)client.field537.method5202(); var1 != null; var1 = (class56)client.field537.method5193()) {
         if (var1.field836 == class284.field3651 && client.field451 <= var1.field843) {
            if (client.field451 >= var1.field838) {
               if (var1.field855 > 0) {
                  class77 var2 = client.field566[var1.field855 - 1];
                  if (var2 != null && var2.field1068 >= 0 && var2.field1068 < 13312 && var2.field1058 >= 0 && var2.field1058 < 13312) {
                     var1.method1627(var2.field1068, var2.field1058, class122.method2438(var2.field1068, var2.field1058, var1.field836) - var1.field845, client.field451);
                  }
               }

               if (var1.field855 < 0) {
                  int var3 = -var1.field855 - 1;
                  class69 var4;
                  if (var3 == client.field664) {
                     var4 = class19.field139;
                  } else {
                     var4 = client.field523[var3];
                  }

                  if (var4 != null && var4.field1068 >= 0 && var4.field1068 < 13312 && var4.field1058 >= 0 && var4.field1058 < 13312) {
                     var1.method1627(var4.field1068, var4.field1058, class122.method2438(var4.field1068, var4.field1058, var1.field836) - var1.field845, client.field451);
                  }
               }

               var1.method1628(client.field555);
               class165.field1924.method3912(class284.field3651, (int)var1.field831, (int)var1.field844, (int)var1.field832, 60, var1, var1.field851, -1L, false);
            }
         } else {
            var1.method6014();
         }
      }

   }

   public static final void method1715() {
      class207.field2489 = false;
      class207.field2483 = 0;
   }

   static int method1717(int var0, class58 var1, boolean var2) {
      class248 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class86.method2063(class50.field746[--class50.field745]);
      } else {
         var4 = var2 ? class285.field3659 : class50.field749;
      }

      class80.method1934(var4);
      if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if (var0 == 1201) {
            var4.field2949 = 2;
            var4.field3001 = class50.field746[--class50.field745];
            return 1;
         } else if (var0 == 1202) {
            var4.field2949 = 3;
            var4.field3001 = class19.field139.field978.method4661();
            return 1;
         } else {
            return 2;
         }
      } else {
         class50.field745 -= 2;
         int var5 = class50.field746[class50.field745];
         int var6 = class50.field746[class50.field745 + 1];
         var4.field3087 = var5;
         var4.field3088 = var6;
         class156 var7 = class10.method105(var5);
         var4.field3008 = var7.field1800;
         var4.field3009 = var7.field1821;
         var4.field3010 = var7.field1802;
         var4.field3006 = var7.field1803;
         var4.field2959 = var7.field1804;
         var4.field2999 = var7.field1799;
         if (var0 == 1205) {
            var4.field2990 = 0;
         } else if (var0 == 1212 | 1 == var7.field1805) {
            var4.field2990 = 1;
         } else {
            var4.field2990 = 2;
         }

         if (var4.field3012 > 0) {
            var4.field2999 = var4.field2999 * 32 / var4.field3012;
         } else if (var4.field2968 > 0) {
            var4.field2999 = var4.field2999 * 32 / var4.field2968;
         }

         return 1;
      }
   }

   static final void method1726(class248 var0, int var1, int var2) {
      if (client.field580 == null && !client.field543) {
         if (var0 != null) {
            class248 var5 = class122.method2437(var0);
            if (var5 == null) {
               var5 = var0.field3063;
            }

            if (var5 != null) {
               client.field580 = var0;
               var5 = class122.method2437(var0);
               if (var5 == null) {
                  var5 = var0.field3063;
               }

               client.field581 = var5;
               client.field582 = var1;
               client.field524 = var2;
               class106.field1318 = 0;
               client.field591 = false;
               int var6 = class159.method3135();
               if (var6 != -1) {
                  class105.field1304 = new class53();
                  class105.field1304.field790 = client.field677[var6];
                  class105.field1304.field786 = client.field546[var6];
                  class105.field1304.field785 = client.field547[var6];
                  class105.field1304.field788 = client.field548[var6];
                  class105.field1304.field789 = client.field484[var6];
               }

               return;
            }
         }

      }
   }
}
