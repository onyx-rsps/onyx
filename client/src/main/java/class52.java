import java.math.BigInteger;

public class class52 {
   static final BigInteger field772;
   static final BigInteger field775;

   static {
      field775 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
      field772 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   }

   static String method1580(String var0) {
      class271[] var2 = class84.method2027();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class271 var4 = var2[var3];
         if (var4.field3542 != -1 && var0.startsWith(class76.method1877(var4.field3542))) {
            var0 = var0.substring(6 + Integer.toString(var4.field3542).length());
            break;
         }
      }

      return var0;
   }

   public static void method1583() {
      class158.field1860.method4309();
      class158.field1857.method4309();
   }

   static final void method1585() {
      for(class51 var1 = (class51)client.field538.method5202(); var1 != null; var1 = (class51)client.field538.method5193()) {
         if (var1.field759 == class284.field3651 && !var1.field766) {
            if (client.field451 >= var1.field758) {
               var1.method1575(client.field555);
               if (var1.field766) {
                  var1.method6014();
               } else {
                  class165.field1924.method3912(var1.field759, var1.field757, var1.field761, var1.field762, 60, var1, 0, -1L, false);
               }
            }
         } else {
            var1.method6014();
         }
      }

   }

   static final int method1584(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }
}
