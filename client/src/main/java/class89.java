import java.util.Comparator;

public class class89 implements Comparator {
   static class397 field1229;
   static class398[] field1230;
   final boolean field1227;

   public class89(boolean var1) {
      this.field1227 = var1;
   }

   int method2006(class328 var1, class328 var2) {
      return this.field1227 ? var1.field3869 - var2.field3869 : var2.field3869 - var1.field3869;
   }

   public int compare(Object var1, Object var2) {
      return this.method2006((class328)var1, (class328)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static void method2007(class275 var0, String var1) {
      class64 var3 = new class64(var0, var1);
      client.field681.add(var3);
      client.field683 += var3.field925;
   }

   static void method2013() {
      if (client.field527) {
         class46.method802(class20.field140, false);
      }

   }

   static final int method2014() {
      if (class38.field308.field1113) {
         return class285.field3652;
      } else {
         int var1 = 3;
         if (class117.field1398 < 310) {
            int var2;
            int var3;
            if (1 == client.field482) {
               var2 = class11.field66 >> 7;
               var3 = class273.field3553 >> 7;
            } else {
               var2 = class20.field140.field1069 >> 7;
               var3 = class20.field140.field1059 >> 7;
            }

            int var4 = class65.field934 >> 7;
            int var5 = class358.field4012 >> 7;
            if (var4 < 0 || var5 < 0 || var4 >= 104 || var5 >= 104) {
               return class285.field3652;
            }

            if (var2 < 0 || var3 < 0 || var2 >= 104 || var3 >= 104) {
               return class285.field3652;
            }

            if (0 != (class62.field901[class285.field3652][var4][var5] & 4)) {
               var1 = class285.field3652;
            }

            int var6;
            if (var2 > var4) {
               var6 = var2 - var4;
            } else {
               var6 = var4 - var2;
            }

            int var7;
            if (var3 > var5) {
               var7 = var3 - var5;
            } else {
               var7 = var5 - var3;
            }

            int var8;
            int var9;
            if (var6 > var7) {
               var8 = var7 * 65536 / var6;
               var9 = 32768;

               while(var4 != var2) {
                  if (var4 < var2) {
                     ++var4;
                  } else if (var4 > var2) {
                     --var4;
                  }

                  if (0 != (class62.field901[class285.field3652][var4][var5] & 4)) {
                     var1 = class285.field3652;
                  }

                  var9 += var8;
                  if (var9 >= 65536) {
                     var9 -= 65536;
                     if (var5 < var3) {
                        ++var5;
                     } else if (var5 > var3) {
                        --var5;
                     }

                     if (0 != (class62.field901[class285.field3652][var4][var5] & 4)) {
                        var1 = class285.field3652;
                     }
                  }
               }
            } else if (var7 > 0) {
               var8 = 65536 * var6 / var7;
               var9 = 32768;

               while(var5 != var3) {
                  if (var5 < var3) {
                     ++var5;
                  } else if (var5 > var3) {
                     --var5;
                  }

                  if (0 != (class62.field901[class285.field3652][var4][var5] & 4)) {
                     var1 = class285.field3652;
                  }

                  var9 += var8;
                  if (var9 >= 65536) {
                     var9 -= 65536;
                     if (var4 < var2) {
                        ++var4;
                     } else if (var4 > var2) {
                        --var4;
                     }

                     if (0 != (class62.field901[class285.field3652][var4][var5] & 4)) {
                        var1 = class285.field3652;
                     }
                  }
               }
            }
         }

         if (class20.field140.field1069 >= 0 && class20.field140.field1059 >= 0 && class20.field140.field1069 < 13312 && class20.field140.field1059 < 13312) {
            if (0 != (class62.field901[class285.field3652][class20.field140.field1069 >> 7][class20.field140.field1059 >> 7] & 4)) {
               var1 = class285.field3652;
            }

            return var1;
         } else {
            return class285.field3652;
         }
      }
   }
}
