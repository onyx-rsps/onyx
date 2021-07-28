public class class122 extends class103 {
   static int field1425;
   int field1428;
   // $FF: synthetic field
   final class106 this$0;

   class122(class106 var1) {
      this.this$0 = var1;
      this.field1428 = -1;
   }

   void vmethod2499(class114 var1) {
      var1.method2300(this.field1428);
   }

   void vmethod2494(class384 var1) {
      this.field1428 = var1.method6655();
   }

   static final int method2438(int var0, int var1, int var2) {
      int var4 = var0 >> 7;
      int var5 = var1 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var2;
         if (var2 < 3 && (class61.field900[1][var4][var5] & 2) == 2) {
            var6 = var2 + 1;
         }

         int var7 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = (128 - var7) * class61.field910[var6][var4][var5] + var7 * class61.field910[var6][var4 + 1][var5] >> 7;
         int var10 = class61.field910[var6][var4][var5 + 1] * (128 - var7) + class61.field910[var6][var4 + 1][var5 + 1] * var7 >> 7;
         return var9 * (128 - var8) + var8 * var10 >> 7;
      } else {
         return 0;
      }
   }

   static class248 method2437(class248 var0) {
      int var2 = class6.method43(class240.method4608(var0));
      if (var2 == 0) {
         return null;
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            var0 = class86.method2063(var0.field3000);
            if (var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }

   static int method2439(int var0, class58 var1, boolean var2) {
      if (var0 == 3200) {
         class50.field745 -= 3;
         class127.method2504(class50.field746[class50.field745], class50.field746[class50.field745 + 1], class50.field746[class50.field745 + 2]);
         return 1;
      } else if (var0 == 3201) {
         class41.method844(class50.field746[--class50.field745]);
         return 1;
      } else if (var0 == 3202) {
         class50.field745 -= 2;
         class87.method2068(class50.field746[class50.field745], class50.field746[class50.field745 + 1]);
         return 1;
      } else {
         int var4;
         int var5;
         if (var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
            if (var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
               return 2;
            } else {
               var4 = 0;
               var5 = 0;
               if (var0 == 3210) {
                  var4 = class50.field746[--class50.field745];
               } else if (var0 == 3182) {
                  var4 = 6;
               } else if (var0 == 3204) {
                  var4 = 7;
               } else if (var0 == 3206) {
                  var4 = 8;
               } else if (var0 == 3208) {
                  var4 = 9;
               }

               if (var4 == 6) {
                  float var6 = 200.0F * ((float)class37.field307.field1117 - 0.5F);
                  var5 = 100 - Math.round(var6);
               } else if (var4 == 7) {
                  var5 = Math.round((float)class37.field307.field1118 / 2.55F);
               } else if (var4 == 8) {
                  var5 = Math.round((float)class37.field307.field1120 / 1.27F);
               } else if (var4 == 9) {
                  var5 = Math.round((float)class37.field307.field1115 / 1.27F);
               }

               class50.field746[++class50.field745 - 1] = var5;
               return 1;
            }
         } else {
            var4 = 0;
            var5 = class50.field746[--class50.field745];
            if (var0 == 3209) {
               var4 = class50.field746[--class50.field745];
            } else if (var0 == 3181) {
               var4 = 6;
            } else if (var0 == 3203) {
               var4 = 7;
            } else if (var0 == 3205) {
               var4 = 8;
            } else if (var0 == 3207) {
               var4 = 9;
            }

            if (var4 == 6) {
               var5 = 100 - Math.min(Math.max(var5, 0), 100);
               class95.method2132((double)(0.5F + (float)var5 / 200.0F));
            } else if (var4 == 7) {
               var5 = Math.min(Math.max(var5, 0), 100);
               class129.method2514(Math.round((float)var5 * 2.55F));
            } else if (var4 == 8) {
               var5 = Math.min(Math.max(var5, 0), 100);
               class98.method2141(Math.round(1.27F * (float)var5));
            } else if (var4 == 9) {
               var5 = Math.min(Math.max(var5, 0), 100);
               class16.method175(Math.round(1.27F * (float)var5));
            }

            return 1;
         }
      }
   }
}
