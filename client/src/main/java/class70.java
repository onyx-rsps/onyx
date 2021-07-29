import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class class70 extends class353 {
   int field1007;
   int field1008;
   int field1009;
   int field1010;
   int field1011;
   int field1012;
   int field1013;
   int field1014;
   int field1015;
   int field1016;
   int field1017;
   int field1018;

   class70() {
      this.field1007 = 0;
      this.field1018 = -1;
   }

   public static class142 method1801(int var0) {
      class142 var2 = (class142)class142.field1567.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class142.field1564.method4920(3, var0);
         var2 = new class142();
         if (var3 != null) {
            var2.method2688(new Buffer(var3));
         }

         class142.field1567.method4308(var2, (long)var0);
         return var2;
      }
   }

   public static void method1799(class383 var0) {
      class42 var2 = (class42)class41.field355.method5239();
      if (var2 != null) {
         int var3 = var0.field4181 * -1084587701;
         var0.writeInt(var2.field357);

         for(int var4 = 0; var4 < var2.field358; ++var4) {
            if (var2.field360[var4] != 0) {
               var0.writeByte(var2.field360[var4]);
            } else {
               try {
                  int var5 = var2.field359[var4];
                  Field var6;
                  int var7;
                  if (var5 == 0) {
                     var6 = var2.field363[var4];
                     var7 = var6.getInt((Object)null);
                     var0.writeByte(0);
                     var0.writeInt(var7);
                  } else if (var5 == 1) {
                     var6 = var2.field363[var4];
                     var6.setInt((Object)null, var2.field362[var4]);
                     var0.writeByte(0);
                  } else if (var5 == 2) {
                     var6 = var2.field363[var4];
                     var7 = var6.getModifiers();
                     var0.writeByte(0);
                     var0.writeInt(var7);
                  }

                  Method var26;
                  if (var5 != 3) {
                     if (var5 == 4) {
                        var26 = var2.field364[var4];
                        var7 = var26.getModifiers();
                        var0.writeByte(0);
                        var0.writeInt(var7);
                     }
                  } else {
                     var26 = var2.field364[var4];
                     byte[][] var11 = var2.field361[var4];
                     Object[] var8 = new Object[var11.length];

                     for(int var9 = 0; var9 < var11.length; ++var9) {
                        ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var11[var9]));
                        var8[var9] = var10.readObject();
                     }

                     Object var12 = var26.invoke((Object)null, var8);
                     if (var12 == null) {
                        var0.writeByte(0);
                     } else if (var12 instanceof Number) {
                        var0.writeByte(1);
                        var0.method6548(((Number)var12).longValue());
                     } else if (var12 instanceof String) {
                        var0.writeByte(2);
                        var0.method6550((String)var12);
                     } else {
                        var0.writeByte(4);
                     }
                  }
               } catch (ClassNotFoundException var14) {
                  var0.writeByte(-10);
               } catch (InvalidClassException var15) {
                  var0.writeByte(-11);
               } catch (StreamCorruptedException var16) {
                  var0.writeByte(-12);
               } catch (OptionalDataException var17) {
                  var0.writeByte(-13);
               } catch (IllegalAccessException var18) {
                  var0.writeByte(-14);
               } catch (IllegalArgumentException var19) {
                  var0.writeByte(-15);
               } catch (InvocationTargetException var20) {
                  var0.writeByte(-16);
               } catch (SecurityException var21) {
                  var0.writeByte(-17);
               } catch (IOException var22) {
                  var0.writeByte(-18);
               } catch (NullPointerException var23) {
                  var0.writeByte(-19);
               } catch (Exception var24) {
                  var0.writeByte(-20);
               } catch (Throwable var25) {
                  var0.writeByte(-21);
               }
            }
         }

         var0.method6700(var3);
         var2.method6014();
      }
   }

   static final void method1800(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var7 = var2 - var0;
      int var8 = var3 - var1;
      int var9 = var7 >= 0 ? var7 : -var7;
      int var10 = var8 >= 0 ? var8 : -var8;
      int var11 = var9;
      if (var9 < var10) {
         var11 = var10;
      }

      if (var11 != 0) {
         int var12 = (var7 << 16) / var11;
         int var13 = (var8 << 16) / var11;
         if (var13 <= var12) {
            var12 = -var12;
         } else {
            var13 = -var13;
         }

         int var14 = var5 * var13 >> 17;
         int var15 = var5 * var13 + 1 >> 17;
         int var16 = var5 * var12 >> 17;
         int var17 = var5 * var12 + 1 >> 17;
         var0 -= class393.field4248;
         var1 -= class393.field4246;
         int var18 = var0 + var14;
         int var19 = var0 - var15;
         int var20 = var0 + var7 - var15;
         int var21 = var0 + var14 + var7;
         int var22 = var16 + var1;
         int var23 = var1 - var17;
         int var24 = var8 + var1 - var17;
         int var25 = var16 + var8 + var1;
         class197.method3827(var18, var19, var20);
         class197.method3830(var22, var23, var24, var18, var19, var20, var4);
         class197.method3827(var18, var20, var21);
         class197.method3830(var22, var24, var25, var18, var20, var21, var4);
      }
   }
}
