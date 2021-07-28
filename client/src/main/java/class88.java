import java.util.Comparator;

public class class88 implements Comparator {
   static class396 field1228;
   static class397[] field1229;
   final boolean field1226;

   public class88(boolean var1) {
      this.field1226 = var1;
   }

   int method2074(class327 var1, class327 var2) {
      return this.field1226 ? var1.field3868 * -2065584103 - var2.field3868 * -2065584103 : var2.field3868 * -2065584103 - var1.field3868 * -2065584103;
   }

   public int compare(Object var1, Object var2) {
      return this.method2074((class327)var1, (class327)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static void method2081() {
      if (client.field526) {
         class45.method883(class19.field139, false);
      }

   }

   static void method2075(class274 var0, String var1) {
      class63 var3 = new class63(var0, var1);
      client.field680.add(var3);
      client.field682 += var3.field924;
   }

   static final int method2082() {
      if (class37.field307.field1112) {
         return class284.field3651;
      } else {
         int var1 = 3;
         if (class116.field1397 < 310) {
            int var2;
            int var3;
            if (client.field481 == 1) {
               var2 = class10.field65 >> 7;
               var3 = class272.field3552 >> 7;
            } else {
               var2 = class19.field139.field1068 >> 7;
               var3 = class19.field139.field1058 >> 7;
            }

            int var4 = class64.field933 >> 7;
            int var5 = class357.field4011 >> 7;
            if (var4 < 0 || var5 < 0 || var4 >= 104 || var5 >= 104) {
               return class284.field3651;
            }

            if (var2 < 0 || var3 < 0 || var2 >= 104 || var3 >= 104) {
               return class284.field3651;
            }

            if ((class61.field900[class284.field3651][var4][var5] & 4) != 0) {
               var1 = class284.field3651;
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

                  if ((class61.field900[class284.field3651][var4][var5] & 4) != 0) {
                     var1 = class284.field3651;
                  }

                  var9 += var8;
                  if (var9 >= 65536) {
                     var9 -= 65536;
                     if (var5 < var3) {
                        ++var5;
                     } else if (var5 > var3) {
                        --var5;
                     }

                     if ((class61.field900[class284.field3651][var4][var5] & 4) != 0) {
                        var1 = class284.field3651;
                     }
                  }
               }
            } else if (var7 > 0) {
               var8 = var6 * 65536 / var7;
               var9 = 32768;

               while(var5 != var3) {
                  if (var5 < var3) {
                     ++var5;
                  } else if (var5 > var3) {
                     --var5;
                  }

                  if ((class61.field900[class284.field3651][var4][var5] & 4) != 0) {
                     var1 = class284.field3651;
                  }

                  var9 += var8;
                  if (var9 >= 65536) {
                     var9 -= 65536;
                     if (var4 < var2) {
                        ++var4;
                     } else if (var4 > var2) {
                        --var4;
                     }

                     if ((class61.field900[class284.field3651][var4][var5] & 4) != 0) {
                        var1 = class284.field3651;
                     }
                  }
               }
            }
         }

         if (class19.field139.field1068 >= 0 && class19.field139.field1058 >= 0 && class19.field139.field1068 < 13312 && class19.field139.field1058 < 13312) {
            if ((class61.field900[class284.field3651][class19.field139.field1068 >> 7][class19.field139.field1058 >> 7] & 4) != 0) {
               var1 = class284.field3651;
            }

            return var1;
         } else {
            return class284.field3651;
         }
      }
   }
}
