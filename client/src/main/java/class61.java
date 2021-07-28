public final class class61 {
   static byte[][][] field900;
   static byte[][][] field909;
   static byte[][][] field915;
   static class274 field916;
   static int field899;
   static int field901;
   static int field911;
   static int field913;
   static int[] field902;
   static int[][] field904;
   static int[][][] field910;
   static final int[] field903;
   static final int[] field905;
   static final int[] field907;
   static final int[] field908;
   static final int[] field912;
   static final int[] field914;

   static {
      field910 = new int[4][105][105];
      field900 = new byte[4][104][104];
      field901 = 99;
      field907 = new int[]{1, 2, 4, 8};
      field908 = new int[]{16, 32, 64, 128};
      field905 = new int[]{1, 0, -1, 0};
      field912 = new int[]{0, -1, 0, 1};
      field903 = new int[]{1, -1, -1, 1};
      field914 = new int[]{-1, -1, 1, 1};
      field913 = (int)(Math.random() * 17.0D) - 8;
      field899 = (int)(Math.random() * 33.0D) - 16;
   }

   public static class264[] method1701() {
      return new class264[]{class264.field3195, class264.field3196, class264.field3198, class264.field3197};
   }

   static final void method1679(class383 var0) {
      int var2 = 0;
      var0.method6504();

      byte[] var10000;
      int var3;
      int var4;
      int var5;
      for(var3 = 0; var3 < class82.field1171; ++var3) {
         var4 = class82.field1177[var3];
         if ((class82.field1174[var4] & 1) == 0) {
            if (var2 > 0) {
               --var2;
               var10000 = class82.field1174;
               var10000[var4] = (byte)(var10000[var4] | 2);
            } else {
               var5 = var0.method6505(1);
               if (var5 == 0) {
                  var2 = class249.method4748(var0);
                  var10000 = class82.field1174;
                  var10000[var4] = (byte)(var10000[var4] | 2);
               } else {
                  class200.method4094(var0, var4);
               }
            }
         }
      }

      var0.method6525();
      if (var2 != 0) {
         throw new RuntimeException();
      } else {
         var0.method6504();

         for(var3 = 0; var3 < class82.field1171; ++var3) {
            var4 = class82.field1177[var3];
            if ((class82.field1174[var4] & 1) != 0) {
               if (var2 > 0) {
                  --var2;
                  var10000 = class82.field1174;
                  var10000[var4] = (byte)(var10000[var4] | 2);
               } else {
                  var5 = var0.method6505(1);
                  if (var5 == 0) {
                     var2 = class249.method4748(var0);
                     var10000 = class82.field1174;
                     var10000[var4] = (byte)(var10000[var4] | 2);
                  } else {
                     class200.method4094(var0, var4);
                  }
               }
            }
         }

         var0.method6525();
         if (var2 != 0) {
            throw new RuntimeException();
         } else {
            var0.method6504();

            for(var3 = 0; var3 < class82.field1173; ++var3) {
               var4 = class82.field1169[var3];
               if ((class82.field1174[var4] & 1) != 0) {
                  if (var2 > 0) {
                     --var2;
                     var10000 = class82.field1174;
                     var10000[var4] = (byte)(var10000[var4] | 2);
                  } else {
                     var5 = var0.method6505(1);
                     if (var5 == 0) {
                        var2 = class249.method4748(var0);
                        var10000 = class82.field1174;
                        var10000[var4] = (byte)(var10000[var4] | 2);
                     } else if (class102.method2172(var0, var4)) {
                        var10000 = class82.field1174;
                        var10000[var4] = (byte)(var10000[var4] | 2);
                     }
                  }
               }
            }

            var0.method6525();
            if (var2 != 0) {
               throw new RuntimeException();
            } else {
               var0.method6504();

               for(var3 = 0; var3 < class82.field1173; ++var3) {
                  var4 = class82.field1169[var3];
                  if ((class82.field1174[var4] & 1) == 0) {
                     if (var2 > 0) {
                        --var2;
                        var10000 = class82.field1174;
                        var10000[var4] = (byte)(var10000[var4] | 2);
                     } else {
                        var5 = var0.method6505(1);
                        if (var5 == 0) {
                           var2 = class249.method4748(var0);
                           var10000 = class82.field1174;
                           var10000[var4] = (byte)(var10000[var4] | 2);
                        } else if (class102.method2172(var0, var4)) {
                           var10000 = class82.field1174;
                           var10000[var4] = (byte)(var10000[var4] | 2);
                        }
                     }
                  }
               }

               var0.method6525();
               if (var2 != 0) {
                  throw new RuntimeException();
               } else {
                  class82.field1171 = 0;
                  class82.field1173 = 0;

                  for(var3 = 1; var3 < 2048; ++var3) {
                     var10000 = class82.field1174;
                     var10000[var3] = (byte)(var10000[var3] >> 1);
                     class69 var6 = client.field523[var3];
                     if (var6 != null) {
                        class82.field1177[++class82.field1171 - 1] = var3;
                     } else {
                        class82.field1169[++class82.field1173 - 1] = var3;
                     }
                  }

               }
            }
         }
      }
   }
}
