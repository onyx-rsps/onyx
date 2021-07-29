public class class54 {
   static int[] field788;
   int field786;
   int field787;
   int field789;
   int field791;
   String field790;

   public static void method1542() {
      class143.field1568.method3883();
   }

   static int method1543(int var0, class59 var1, boolean var2) {
      if (var0 == 5630) {
         client.field571 = 250;
         return 1;
      } else if (5631 != var0 && var0 != 5633) {
         if (5632 == var0) {
            class51.field747[++class51.field746 - 1] = 26;
            return 1;
         } else {
            return 2;
         }
      } else {
         class2.field4 -= 2;
         return 1;
      }
   }

   static final void method1541(class249 var0, int var1, int var2) {
      if (client.field646 == 0 || 3 == client.field646) {
         if (!client.field544 && (class20.field149 == 1 || !class311.field3777 && class20.field149 == 4)) {
            class243 var4 = var0.method4227(true);
            if (var4 == null) {
               return;
            }

            int var5 = class20.field150 - var1;
            int var6 = class20.field151 - var2;
            if (var4.method4148(var5, var6)) {
               var5 -= var4.field2910 / 2;
               var6 -= var4.field2906 / 2;
               int var7 = client.field445 & 2047;
               int var8 = class198.field2266[var7];
               int var9 = class198.field2273[var7];
               int var10 = var8 * var6 + var5 * var9 >> 11;
               int var11 = var6 * var9 - var8 * var5 >> 11;
               int var12 = class20.field140.field1069 + var10 >> 7;
               int var13 = class20.field140.field1059 - var11 >> 7;
               class229 var14 = class149.method2495(class227.field2586, client.field453.field1205);
               var14.field2691.method5931(18);
               var14.field2691.method6077(var12 + class281.field3625);
               var14.field2691.method6122(class78.field1134 + var13);
               var14.field2691.method5931(class11.field46[82] ? (class11.field46[81] ? 2 : 1) : 0);
               var14.field2691.method5931(var5);
               var14.field2691.method5931(var6);
               var14.field2691.method6122(client.field445);
               var14.field2691.method5931(57);
               var14.field2691.method5931(0);
               var14.field2691.method5931(0);
               var14.field2691.method5931(89);
               var14.field2691.method6122(class20.field140.field1069);
               var14.field2691.method6122(class20.field140.field1059);
               var14.field2691.method5931(63);
               client.field453.method1963(var14);
               client.field644 = var12;
               client.field597 = var13;
            }
         }

      }
   }

   class54() {
   }
}
