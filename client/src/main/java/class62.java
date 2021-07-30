public final class class62 {
   static byte[][][] field901;
   static byte[][][] field910;
   static byte[][][] field916;
   static class275 field917;
   static int field900;
   static int field902;
   static int field912;
   static int field914;
   static int[] field903;
   static int[][] field905;
   static int[][][] field911;
   static final int[] field904;
   static final int[] field906;
   static final int[] field908;
   static final int[] field909;
   static final int[] field913;
   static final int[] field915;

   public static class265[] method1652() {
      return new class265[]{class265.field3196, class265.field3197, class265.field3199, class265.field3198};
   }

   static {
      field911 = new int[4][105][105];
      field901 = new byte[4][104][104];
      field902 = 99;
      field908 = new int[]{1, 2, 4, 8};
      field909 = new int[]{16, 32, 64, 128};
      field906 = new int[]{1, 0, -1, 0};
      field913 = new int[]{0, -1, 0, 1};
      field904 = new int[]{1, -1, -1, 1};
      field915 = new int[]{-1, -1, 1, 1};
      field914 = (int)(Math.random() * 17.0D) - 8;
      field900 = (int)(Math.random() * 33.0D) - 16;
   }

   static final void method1630(class384 var0) {
      int var2 = 0;
      var0.toBitMode();

      byte[] var10000;
      int var3;
      int var4;
      int var5;
      for(var3 = 0; var3 < class83.field1172; ++var3) {
         var4 = class83.field1178[var3];
         if ((class83.field1175[var4] & 1) == 0) {
            if (var2 > 0) {
               --var2;
               var10000 = class83.field1175;
               var10000[var4] = (byte)(var10000[var4] | 2);
            } else {
               var5 = var0.method5893(1);
               if (0 == var5) {
                  var2 = class250.method4285(var0);
                  var10000 = class83.field1175;
                  var10000[var4] = (byte)(var10000[var4] | 2);
               } else {
                  class201.method3690(var0, var4);
               }
            }
         }
      }

      var0.toByteMode();
      if (0 != var2) {
         throw new RuntimeException();
      } else {
         var0.toBitMode();

         for(var3 = 0; var3 < class83.field1172; ++var3) {
            var4 = class83.field1178[var3];
            if (0 != (class83.field1175[var4] & 1)) {
               if (var2 > 0) {
                  --var2;
                  var10000 = class83.field1175;
                  var10000[var4] = (byte)(var10000[var4] | 2);
               } else {
                  var5 = var0.method5893(1);
                  if (var5 == 0) {
                     var2 = class250.method4285(var0);
                     var10000 = class83.field1175;
                     var10000[var4] = (byte)(var10000[var4] | 2);
                  } else {
                     class201.method3690(var0, var4);
                  }
               }
            }
         }

         var0.toByteMode();
         if (var2 != 0) {
            throw new RuntimeException();
         } else {
            var0.toBitMode();

            for(var3 = 0; var3 < class83.field1174; ++var3) {
               var4 = class83.field1170[var3];
               if ((class83.field1175[var4] & 1) != 0) {
                  if (var2 > 0) {
                     --var2;
                     var10000 = class83.field1175;
                     var10000[var4] = (byte)(var10000[var4] | 2);
                  } else {
                     var5 = var0.method5893(1);
                     if (var5 == 0) {
                        var2 = class250.method4285(var0);
                        var10000 = class83.field1175;
                        var10000[var4] = (byte)(var10000[var4] | 2);
                     } else if (class103.method2081(var0, var4)) {
                        var10000 = class83.field1175;
                        var10000[var4] = (byte)(var10000[var4] | 2);
                     }
                  }
               }
            }

            var0.toByteMode();
            if (var2 != 0) {
               throw new RuntimeException();
            } else {
               var0.toBitMode();

               for(var3 = 0; var3 < class83.field1174; ++var3) {
                  var4 = class83.field1170[var3];
                  if ((class83.field1175[var4] & 1) == 0) {
                     if (var2 > 0) {
                        --var2;
                        var10000 = class83.field1175;
                        var10000[var4] = (byte)(var10000[var4] | 2);
                     } else {
                        var5 = var0.method5893(1);
                        if (var5 == 0) {
                           var2 = class250.method4285(var0);
                           var10000 = class83.field1175;
                           var10000[var4] = (byte)(var10000[var4] | 2);
                        } else if (class103.method2081(var0, var4)) {
                           var10000 = class83.field1175;
                           var10000[var4] = (byte)(var10000[var4] | 2);
                        }
                     }
                  }
               }

               var0.toByteMode();
               if (0 != var2) {
                  throw new RuntimeException();
               } else {
                  class83.field1172 = 0;
                  class83.field1174 = 0;

                  for(var3 = 1; var3 < 2048; ++var3) {
                     var10000 = class83.field1175;
                     var10000[var3] = (byte)(var10000[var3] >> 1);
                     class70 var6 = client.field524[var3];
                     if (null != var6) {
                        class83.field1178[++class83.field1172 - 1] = var3;
                     } else {
                        class83.field1170[++class83.field1174 - 1] = var3;
                     }
                  }

               }
            }
         }
      }
   }
}
