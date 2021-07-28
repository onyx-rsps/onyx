public final class class193 {
   int field2189;
   int field2190;
   int field2191;
   int field2192;
   public class200 field2194;
   public long field2193;

   class193() {
   }

   static final void method3804() {
      for(int var1 = 0; var1 < client.field497; ++var1) {
         int var10002 = client.field651[var1]--;
         if (client.field651[var1] >= -10) {
            class21 var10 = client.field653[var1];
            if (var10 == null) {
               Object var10000 = null;
               var10 = class21.method417(class138.field1520, client.field628[var1], 0);
               if (var10 == null) {
                  continue;
               }

               int[] var14 = client.field651;
               var14[var1] += var10.method421();
               client.field653[var1] = var10;
            }

            if (client.field651[var1] < 0) {
               int var3;
               if (client.field652[var1] != 0) {
                  int var4 = (client.field652[var1] & 255) * 128;
                  int var5 = client.field652[var1] >> 16 & 255;
                  int var6 = var5 * 128 + 64 - class19.field139.field1068;
                  if (var6 < 0) {
                     var6 = -var6;
                  }

                  int var7 = client.field652[var1] >> 8 & 255;
                  int var8 = var7 * 128 + 64 - class19.field139.field1058;
                  if (var8 < 0) {
                     var8 = -var8;
                  }

                  int var9 = var8 + var6 - 128;
                  if (var9 > var4) {
                     client.field651[var1] = -100;
                     continue;
                  }

                  if (var9 < 0) {
                     var9 = 0;
                  }

                  var3 = (var4 - var9) * class37.field307.field1115 / var4;
               } else {
                  var3 = class37.field307.field1120;
               }

               if (var3 > 0) {
                  class22 var11 = var10.method411().method422(class157.field1841);
                  class29 var12 = class29.method609(var11, 100, var3);
                  var12.method641(client.field650[var1] - 1);
                  class81.field1162.method372(var12);
               }

               client.field651[var1] = -100;
            }
         } else {
            --client.field497;

            for(int var2 = var1; var2 < client.field497; ++var2) {
               client.field628[var2] = client.field628[var2 + 1];
               client.field653[var2] = client.field653[var2 + 1];
               client.field650[var2] = client.field650[var2 + 1];
               client.field651[var2] = client.field651[var2 + 1];
               client.field652[var2] = client.field652[var2 + 1];
            }

            --var1;
         }
      }

      if (client.field647) {
         boolean var13;
         if (class234.field2818 != 0) {
            var13 = true;
         } else {
            var13 = class234.field2815.method4410();
         }

         if (!var13) {
            if (class37.field307.field1118 != 0 && client.field639 != -1) {
               class82.method1954(class108.field1325, client.field639, 0, class37.field307.field1118, false);
            }

            client.field647 = false;
         }
      }

   }
}
