import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class class41 {
   public static class297 field355;
   static class114 field354;
   static int[] field356;

   static {
      field355 = new class297();
   }

   static final void method845(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (class250.method4757(var0)) {
         class87.field1224 = null;
         class153.method2879(class248.field3038[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (class87.field1224 != null) {
            class153.method2879(class87.field1224, -1412584499, var1, var2, var3, var4, class24.field191, class68.field976, var7);
            class87.field1224 = null;
         }

      } else {
         if (var7 != -1) {
            client.field616[var7] = true;
         } else {
            for(int var9 = 0; var9 < 100; ++var9) {
               client.field616[var9] = true;
            }
         }

      }
   }

   static void method846(String var0, boolean var1, String var2, boolean var3) {
      if (var1) {
         if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var6) {
            }
         }

         if (class16.field87.startsWith("win") && !var3) {
            class155.method2946(var0, 0, "openjs");
            return;
         }

         if (class16.field87.startsWith("mac")) {
            class155.method2946(var0, 1, var2);
            return;
         }

         class155.method2946(var0, 2, "openjs");
      } else {
         class155.method2946(var0, 3, "openjs");
      }

   }

   static void method844(int var0) {
      if (var0 == -1 && !client.field647) {
         class59.method1659();
      } else if (var0 != -1 && var0 != client.field639 && class37.field307.field1118 != 0 && !client.field647) {
         class91.method2094(2, class108.field1325, var0, 0, class37.field307.field1118, false);
      }

      client.field639 = var0;
   }

   static int method837(int var0) {
      class60 var2 = (class60)class84.field1195.get(var0);
      return var2 == null ? 0 : var2.method1660();
   }

   static int method836(char var0, class291 var1) {
      int var3 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = (var0 << 4) + 1;
      }

      if (var0 == 241 && var1 == class291.field3685) {
         var3 = 1762;
      }

      return var3;
   }
}
