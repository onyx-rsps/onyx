public class class53 {
   static int[] field787;
   int field785;
   int field786;
   int field788;
   int field790;
   String field789;

   class53() {
   }

   public static void method1587() {
      class142.field1567.method4309();
   }

   static final void method1586(class248 var0, int var1, int var2) {
      if (client.field645 == 0 || client.field645 == 3) {
         if (!client.field543 && (class19.field148 == 1 || !class310.field3776 && class19.field148 == 4)) {
            class242 var4 = var0.method4690(true);
            if (var4 == null) {
               return;
            }

            int var5 = class19.field149 - var1;
            int var6 = class19.field150 - var2;
            if (var4.method4616(var5, var6)) {
               var5 -= var4.field2909 / 2;
               var6 -= var4.field2905 / 2;
               int var7 = client.field444 & 2047;
               int var8 = class197.field2265[var7];
               int var9 = class197.field2272[var7];
               int var10 = var8 * var6 + var5 * var9 >> 11;
               int var11 = var6 * var9 - var8 * var5 >> 11;
               int var12 = var10 + class19.field139.field1068 >> 7;
               int var13 = class19.field139.field1058 - var11 >> 7;
               class228 var14 = class148.method2788(class226.field2585, client.field452.field1204);
               var14.field2690.writeByte(18);
               var14.field2690.method6689(var12 + class280.field3624);
               var14.field2690.method6734(var13 + class77.field1133);
               var14.field2690.writeByte(class10.field45[82] ? (class10.field45[81] ? 2 : 1) : 0);
               var14.field2690.writeByte(var5);
               var14.field2690.writeByte(var6);
               var14.field2690.method6734(client.field444);
               var14.field2690.writeByte(57);
               var14.field2690.writeByte(0);
               var14.field2690.writeByte(0);
               var14.field2690.writeByte(89);
               var14.field2690.method6734(class19.field139.field1068);
               var14.field2690.method6734(class19.field139.field1058);
               var14.field2690.writeByte(63);
               client.field452.method2031(var14);
               client.field643 = var12;
               client.field596 = var13;
            }
         }

      }
   }

   static int method1588(int var0, class58 var1, boolean var2) {
      if (var0 == 5630) {
         client.field570 = 250;
         return 1;
      } else if (var0 != 5631 && var0 != 5633) {
         if (var0 == 5632) {
            class50.field746[++class50.field745 - 1] = 26;
            return 1;
         } else {
            return 2;
         }
      } else {
         class1.field3 -= 2;
         return 1;
      }
   }
}
