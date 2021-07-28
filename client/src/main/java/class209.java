public final class class209 {
   boolean field2499;
   int field2500;
   int field2501;
   int field2502;
   int field2503;
   int field2504;
   int field2505;

   class209(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field2499 = true;
      this.field2505 = var1;
      this.field2500 = var2;
      this.field2501 = var3;
      this.field2502 = var4;
      this.field2503 = var5;
      this.field2504 = var6;
      this.field2499 = var7;
   }

   static final void method4248() {
      boolean var1 = false;

      while(!var1) {
         var1 = true;

         for(int var2 = 0; var2 < client.field544 * -286331153 - 1; ++var2) {
            if (client.field547[var2] < 1000 && client.field547[var2 + 1] > 1000) {
               String var3 = client.field550[var2];
               client.field550[var2] = client.field550[var2 + 1];
               client.field550[var2 + 1] = var3;
               String var4 = client.field484[var2];
               client.field484[var2] = client.field484[var2 + 1];
               client.field484[var2 + 1] = var4;
               int var5 = client.field547[var2];
               client.field547[var2] = client.field547[var2 + 1];
               client.field547[var2 + 1] = var5;
               var5 = client.field677[var2];
               client.field677[var2] = client.field677[var2 + 1];
               client.field677[var2 + 1] = var5;
               var5 = client.field546[var2];
               client.field546[var2] = client.field546[var2 + 1];
               client.field546[var2 + 1] = var5;
               var5 = client.field548[var2];
               client.field548[var2] = client.field548[var2 + 1];
               client.field548[var2 + 1] = var5;
               boolean var6 = client.field673[var2];
               client.field673[var2] = client.field673[var2 + 1];
               client.field673[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

   }

   public static final void method4249(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            class257.method4803(var0 - 1L);
            class257.method4803(1L);
         } else {
            class257.method4803(var0);
         }

      }
   }

   static int method4250(int var0, class58 var1, boolean var2) {
      int var4;
      if (var0 == 4200) {
         var4 = class50.field746[--class50.field745];
         class50.field737[++class1.field3 - 1] = class10.method105(var4).field1835;
         return 1;
      } else {
         int var5;
         class156 var6;
         if (var0 == 4201) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            var6 = class10.method105(var4);
            if (var5 >= 1 && var5 <= 5 && var6.field1808[var5 - 1] != null) {
               class50.field737[++class1.field3 - 1] = var6.field1808[var5 - 1];
            } else {
               class50.field737[++class1.field3 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            class50.field745 -= 2;
            var4 = class50.field746[class50.field745];
            var5 = class50.field746[class50.field745 + 1];
            var6 = class10.method105(var4);
            if (var5 >= 1 && var5 <= 5 && var6.field1809[var5 - 1] != null) {
               class50.field737[++class1.field3 - 1] = var6.field1809[var5 - 1];
            } else {
               class50.field737[++class1.field3 - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var4 = class50.field746[--class50.field745];
            class50.field746[++class50.field745 - 1] = class10.method105(var4).field1806;
            return 1;
         } else if (var0 == 4204) {
            var4 = class50.field746[--class50.field745];
            class50.field746[++class50.field745 - 1] = class10.method105(var4).field1805 == 1 ? 1 : 0;
            return 1;
         } else {
            class156 var7;
            if (var0 == 4205) {
               var4 = class50.field746[--class50.field745];
               var7 = class10.method105(var4);
               if (var7.field1788 == -1 && var7.field1826 >= 0) {
                  class50.field746[++class50.field745 - 1] = var7.field1826;
               } else {
                  class50.field746[++class50.field745 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4206) {
               var4 = class50.field746[--class50.field745];
               var7 = class10.method105(var4);
               if (var7.field1788 >= 0 && var7.field1826 >= 0) {
                  class50.field746[++class50.field745 - 1] = var7.field1826;
               } else {
                  class50.field746[++class50.field745 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4207) {
               var4 = class50.field746[--class50.field745];
               class50.field746[++class50.field745 - 1] = class10.method105(var4).field1807 ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var4 = class50.field746[--class50.field745];
               var7 = class10.method105(var4);
               if (var7.field1819 == -1 && var7.field1837 >= 0) {
                  class50.field746[++class50.field745 - 1] = var7.field1837;
               } else {
                  class50.field746[++class50.field745 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4209) {
               var4 = class50.field746[--class50.field745];
               var7 = class10.method105(var4);
               if (var7.field1819 >= 0 && var7.field1837 >= 0) {
                  class50.field746[++class50.field745 - 1] = var7.field1837;
               } else {
                  class50.field746[++class50.field745 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4210) {
               String var8 = class50.field737[--class1.field3];
               var5 = class50.field746[--class50.field745];
               class184.method3596(var8, var5 == 1);
               class50.field746[++class50.field745 - 1] = class211.field2519;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  class81.field1164 = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var4 = class50.field746[--class50.field745];
                  var5 = class10.method105(var4).method2994();
                  if (var5 == -1) {
                     class50.field746[++class50.field745 - 1] = var5;
                  } else {
                     class50.field746[++class50.field745 - 1] = var5 + 1;
                  }

                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class77.field1136 != null && class81.field1164 < class211.field2519) {
                  class50.field746[++class50.field745 - 1] = class77.field1136[++class81.field1164 - 1] & '\uffff';
               } else {
                  class50.field746[++class50.field745 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
