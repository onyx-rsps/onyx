import java.net.URL;

public class class269 {
   public static String field3298;
   public static String field3319;
   public static String field3354;
   public static String field3467;
   public static String field3495;
   static int field3397;

   static {
      field3298 = "Please visit the support page for assistance.";
      field3467 = "Please visit the support page for assistance.";
      field3495 = "";
      field3354 = "Page has opened in a new window.";
      field3319 = "(Please check your popup blocker.)";
   }

   static boolean method4848() {
      try {
         if (class77.field1134 == null) {
            class77.field1134 = class169.field1991.method2051(new URL(class309.field3775));
         } else if (class77.field1134.method2067()) {
            byte[] var1 = class77.field1134.method2066();
            class384 var2 = new class384(var1);
            var2.method6784();
            class47.field691 = var2.method6655();
            class15.field85 = new class47[class47.field691];

            class47 var4;
            for(int var3 = 0; var3 < class47.field691; var4.field702 = var3++) {
               var4 = class15.field85[var3] = new class47();
               var4.field696 = var2.method6655();
               var4.field699 = var2.method6784();
               var4.field700 = var2.method6569();
               var4.field689 = var2.method6569();
               var4.field701 = var2.method6560();
               var4.field698 = var2.method6563();
            }

            class83.method1973(class15.field85, 0, class15.field85.length - 1, class47.field695, class47.field694);
            class77.field1134 = null;
            return true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         class77.field1134 = null;
      }

      return false;
   }
}
