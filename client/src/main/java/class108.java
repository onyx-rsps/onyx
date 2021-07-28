public class class108 extends class103 {
   static class274 field1325;
   int field1326;
   int field1327;
   int field1330;
   int field1331;
   // $FF: synthetic field
   final class106 this$0;

   class108(class106 var1) {
      this.this$0 = var1;
   }

   void vmethod2499(class114 var1) {
      var1.method2304(this.field1331, this.field1330, this.field1326, this.field1327);
   }

   void vmethod2494(class384 var1) {
      this.field1331 = var1.method6784();
      this.field1330 = var1.method6784();
      this.field1326 = var1.method6560();
      this.field1327 = var1.method6560();
   }

   static void method2226() {
      if (client.field489 && class19.field139 != null) {
         int var1 = class19.field139.field1075[0];
         int var2 = class19.field139.field1076[0];
         if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
            return;
         }

         class10.field65 = class19.field139.field1068;
         int var3 = class122.method2438(class19.field139.field1068, class19.field139.field1058, class284.field3651) - client.field482;
         if (var3 < class270.field3532) {
            class270.field3532 = var3;
         }

         class272.field3552 = class19.field139.field1058;
         client.field489 = false;
      }

   }

   static void method2236(int var0, String var1) {
      int var3 = class82.field1171;
      int[] var4 = class82.field1177;
      boolean var5 = false;
      class405 var6 = new class405(var1, class51.field760);

      for(int var7 = 0; var7 < var3; ++var7) {
         class69 var8 = client.field523[var4[var7]];
         if (var8 != null && var8 != class19.field139 && var8.field979 != null && var8.field979.equals(var6)) {
            class228 var9;
            if (var0 == 1) {
               var9 = class148.method2788(class226.field2624, client.field452.field1204);
               var9.field2690.writeByte(0);
               var9.field2690.method6689(var4[var7]);
               client.field452.method2031(var9);
            } else if (var0 == 4) {
               var9 = class148.method2788(class226.field2650, client.field452.field1204);
               var9.field2690.method6596(var4[var7]);
               var9.field2690.method6679(0);
               client.field452.method2031(var9);
            } else if (var0 == 6) {
               var9 = class148.method2788(class226.field2569, client.field452.field1204);
               var9.field2690.method6734(var4[var7]);
               var9.field2690.method6588(0);
               client.field452.method2031(var9);
            } else if (var0 == 7) {
               var9 = class148.method2788(class226.field2627, client.field452.field1204);
               var9.field2690.method6586(0);
               var9.field2690.method6596(var4[var7]);
               client.field452.method2031(var9);
            }

            var5 = true;
            break;
         }
      }

      if (!var5) {
         class120.method2408(4, "", "Unable to find " + var1);
      }

   }
}
