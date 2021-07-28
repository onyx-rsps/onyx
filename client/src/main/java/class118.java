import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class118 extends class103 {
   static int[] field1406;
   int field1404;
   String field1402;
   long field1403;
   // $FF: synthetic field
   final class106 this$0;

   class118(class106 var1) {
      this.this$0 = var1;
      this.field1403 = -1L;
      this.field1402 = null;
      this.field1404 = 0;
   }

   void vmethod2499(class114 var1) {
      var1.method2294(this.field1403, this.field1402, this.field1404);
   }

   void vmethod2494(class384 var1) {
      if (var1.method6560() != 255) {
         var1.field4181 -= 99;
         this.field1403 = var1.method6566();
      }

      this.field1402 = var1.method6568();
      this.field1404 = var1.method6655();
   }

   public static void method2392(class384 var0, int var1) {
      class42 var3 = new class42();
      var3.field358 = var0.method6560();
      var3.field357 = var0.method6784();
      var3.field359 = new int[var3.field358];
      var3.field360 = new int[var3.field358];
      var3.field363 = new Field[var3.field358];
      var3.field362 = new int[var3.field358];
      var3.field364 = new Method[var3.field358];
      var3.field361 = new byte[var3.field358][][];

      for(int var4 = 0; var4 < var3.field358; ++var4) {
         try {
            int var5 = var0.method6560();
            String var6;
            String var7;
            int var8;
            if (var5 != 0 && var5 != 1 && var5 != 2) {
               if (var5 == 3 || var5 == 4) {
                  var6 = var0.method6569();
                  var7 = var0.method6569();
                  var8 = var0.method6560();
                  String[] var9 = new String[var8];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[var10] = var0.method6569();
                  }

                  String var21 = var0.method6569();
                  byte[][] var11 = new byte[var8][];
                  int var13;
                  if (var5 == 3) {
                     for(int var12 = 0; var12 < var8; ++var12) {
                        var13 = var0.method6784();
                        var11[var12] = new byte[var13];
                        var0.method6572(var11[var12], 0, var13);
                     }
                  }

                  var3.field359[var4] = var5;
                  Class[] var22 = new Class[var8];

                  for(var13 = 0; var13 < var8; ++var13) {
                     var22[var13] = class248.method4722(var9[var13]);
                  }

                  Class var23 = class248.method4722(var21);
                  if (class248.method4722(var6).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var14 = class248.method4722(var6).getDeclaredMethods();
                  Method[] var15 = var14;

                  for(int var16 = 0; var16 < var15.length; ++var16) {
                     Method var17 = var15[var16];
                     if (var17.getName().equals(var7)) {
                        Class[] var18 = var17.getParameterTypes();
                        if (var22.length == var18.length) {
                           boolean var19 = true;

                           for(int var20 = 0; var20 < var22.length; ++var20) {
                              if (var22[var20] != var18[var20]) {
                                 var19 = false;
                                 break;
                              }
                           }

                           if (var19 && var23 == var17.getReturnType()) {
                              var3.field364[var4] = var17;
                           }
                        }
                     }
                  }

                  var3.field361[var4] = var11;
               }
            } else {
               var6 = var0.method6569();
               var7 = var0.method6569();
               var8 = 0;
               if (var5 == 1) {
                  var8 = var0.method6784();
               }

               var3.field359[var4] = var5;
               var3.field362[var4] = var8;
               if (class248.method4722(var6).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var3.field363[var4] = class248.method4722(var6).getDeclaredField(var7);
            }
         } catch (ClassNotFoundException var25) {
            var3.field360[var4] = -1;
         } catch (SecurityException var26) {
            var3.field360[var4] = -2;
         } catch (NullPointerException var27) {
            var3.field360[var4] = -3;
         } catch (Exception var28) {
            var3.field360[var4] = -4;
         } catch (Throwable var29) {
            var3.field360[var4] = -5;
         }
      }

      class41.field355.method5236(var3);
   }

   public static int method2393(int var0) {
      return class232.field2801[var0];
   }
}
