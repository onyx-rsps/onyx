import java.applet.Applet;
import java.io.IOException;

public class class16 {
   static Applet field89;
   static String field87;

   static {
      field89 = null;
      field87 = "";
   }

   static void method163(int var0) {
      if (var0 != client.field412) {
         if (client.field412 == 0) {
            class58.field873.method224();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45) {
            client.field672 = 0;
            client.field438 = 0;
            client.field439 = 0;
            client.field457.method5579(var0);
            if (var0 != 20) {
               class50.method1511(false);
            }
         }

         if (var0 != 20 && var0 != 40 && client.field644 != null) {
            client.field644.vmethod5858();
            client.field644 = null;
         }

         if (client.field412 == 25) {
            client.field463 = 0;
            client.field459 = 0;
            client.field460 = 1;
            client.field461 = 0;
            client.field549 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               class237.method4563(class105.field1300, class270.field3535, true, client.field412 == 11 ? 4 : 0);
            } else if (var0 == 11) {
               class237.method4563(class105.field1300, class270.field3535, false, 4);
            } else if (class55.field797) {
               class304.field3759 = null;
               class55.field800 = null;
               class55.field796 = null;
               class55.field814 = null;
               class55.field802 = null;
               class88.field1228 = null;
               class132.field1485 = null;
               class46.field396 = null;
               class172.field2013 = null;
               class188.field2126 = null;
               class51.field769 = null;
               class45.field391 = null;
               class60.field896 = null;
               class235.field2846 = null;
               class6.field15.method1849();
               class234.field2818 = 1;
               class234.field2819 = null;
               class234.field2821 = -1;
               class96.field1263 = -1;
               class146.field1611 = 0;
               class145.field1597 = false;
               class123.field1438 = 2;
               if (class277.field3613 != null) {
                  try {
                     class384 var2 = new class384(4);
                     var2.writeByte(2);
                     var2.method6723(0);
                     class277.field3613.write(var2.payload, 0, 4);
                  } catch (IOException var5) {
                     try {
                        class277.field3613.vmethod5858();
                     } catch (Exception var4) {
                     }

                     ++class277.field3604;
                     class277.field3613 = null;
                  }
               }

               class55.field797 = false;
            }
         } else {
            class237.method4563(class105.field1300, class270.field3535, true, 0);
         }

         client.field412 = var0;
      }
   }

   public static String method176(CharSequence var0) {
      int var3 = var0.length();
      char[] var4 = new char[var3];

      for(int var5 = 0; var5 < var3; ++var5) {
         var4[var5] = '*';
      }

      String var2 = new String(var4);
      return var2;
   }

   static boolean method173() {
      if (client.field680 != null && client.field681 < client.field680.size()) {
         while(client.field681 < client.field680.size()) {
            class63 var1 = (class63)client.field680.get(client.field681);
            if (!var1.method1710()) {
               return false;
            }

            ++client.field681;
         }

         return true;
      } else {
         return true;
      }
   }

   static final void method177(class71 var0, int var1) {
      if (var0.field1073 >= client.field451) {
         class47.method1358(var0);
      } else if (var0.field1067 >= client.field451) {
         class44.method878(var0);
      } else {
         class155.method2944(var0);
      }

      if (var0.field1068 < 128 || var0.field1058 < 128 || var0.field1068 >= 13184 || var0.field1058 >= 13184) {
         var0.field1052 = -1;
         var0.field1057 = -1;
         var0.field1073 = 0;
         var0.field1067 = 0;
         var0.field1068 = var0.field1075[0] * 128 + var0.field1023 * 64;
         var0.field1058 = var0.field1076[0] * 128 + var0.field1023 * 64;
         var0.method1804();
      }

      if (class19.field139 == var0 && (var0.field1068 < 1536 || var0.field1058 < 1536 || var0.field1068 >= 11776 || var0.field1058 >= 11776)) {
         var0.field1052 = -1;
         var0.field1057 = -1;
         var0.field1073 = 0;
         var0.field1067 = 0;
         var0.field1068 = var0.field1075[0] * 128 + var0.field1023 * 64;
         var0.field1058 = var0.field1076[0] * 128 + var0.field1023 * 64;
         var0.method1804();
      }

      class42.method848(var0);
      class109.method2245(var0);
   }

   static final void method175(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class37.field307.field1115 = var0;
      class134.method2603();
   }
}
