import java.io.File;
import java.io.IOException;

public final class class77 extends class71 {
   static class87 field1134;
   static int field1133;
   static short[] field1136;
   class147 field1131;

   class77() {
   }

   protected final class206 vmethod4091() {
      if (this.field1131 == null) {
         return null;
      } else {
         class158 var2 = super.field1052 != -1 && super.field1055 == 0 ? class47.method1355(super.field1052) : null;
         class158 var3 = super.field1049 != -1 && (super.field1029 != super.field1049 || var2 == null) ? class47.method1355(super.field1049) : null;
         class206 var4 = this.field1131.method2779(var2, super.field1053, var3, super.field1041);
         if (var4 == null) {
            return null;
         } else {
            var4.method4137();
            super.field1070 = var4.field2345;
            if (super.field1057 != -1 && super.field1027 != -1) {
               class206 var5 = class24.method463(super.field1057).method2791(super.field1027);
               if (var5 != null) {
                  var5.method4147(0, -super.field1061, 0);
                  class206[] var6 = new class206[]{var4, var5};
                  var4 = new class206(var6, 2);
               }
            }

            if (this.field1131.field1621 == 1) {
               var4.field2429 = true;
            }

            return var4;
         }
      }
   }

   final boolean vmethod1891() {
      return this.field1131 != null;
   }

   final void method1888(int var1, byte var2) {
      int var4 = super.field1075[0];
      int var5 = super.field1076[0];
      if (var1 == 0) {
         --var4;
         ++var5;
      }

      if (var1 == 1) {
         ++var5;
      }

      if (var1 == 2) {
         ++var4;
         ++var5;
      }

      if (var1 == 3) {
         --var4;
      }

      if (var1 == 4) {
         ++var4;
      }

      if (var1 == 5) {
         --var4;
         --var5;
      }

      if (var1 == 6) {
         --var5;
      }

      if (var1 == 7) {
         ++var4;
         --var5;
      }

      if (super.field1052 != -1 && class47.method1355(super.field1052).field1859 == 1) {
         super.field1052 = -1;
      }

      if (super.field1026 < 9) {
         ++super.field1026;
      }

      for(int var6 = super.field1026; var6 > 0; --var6) {
         super.field1075[var6] = super.field1075[var6 - 1];
         super.field1076[var6] = super.field1076[var6 - 1];
         super.field1030[var6] = super.field1030[var6 - 1];
      }

      super.field1075[0] = var4;
      super.field1076[0] = var5;
      super.field1030[0] = var2;
   }

   final void method1889(int var1, int var2, boolean var3) {
      if (super.field1052 != -1 && class47.method1355(super.field1052).field1859 == 1) {
         super.field1052 = -1;
      }

      if (!var3) {
         int var5 = var1 - super.field1075[0];
         int var6 = var2 - super.field1076[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if (super.field1026 < 9) {
               ++super.field1026;
            }

            for(int var7 = super.field1026; var7 > 0; --var7) {
               super.field1075[var7] = super.field1075[var7 - 1];
               super.field1076[var7] = super.field1076[var7 - 1];
               super.field1030[var7] = super.field1030[var7 - 1];
            }

            super.field1075[0] = var1;
            super.field1076[0] = var2;
            super.field1030[0] = 1;
            return;
         }
      }

      super.field1026 = 0;
      super.field1066 = 0;
      super.field1078 = 0;
      super.field1075[0] = var1;
      super.field1076[0] = var2;
      super.field1068 = super.field1023 * 64 + super.field1075[0] * 128;
      super.field1058 = super.field1023 * 64 + super.field1076[0] * 128;
   }

   public static class368 method1897(String var0, String var1, boolean var2) {
      File var4 = new File(class130.field1474, "preferences" + var0 + ".dat");
      if (var4.exists()) {
         try {
            class368 var11 = new class368(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
         }
      }

      String var5 = "";
      if (class80.field1160 == 33) {
         var5 = "_rc";
      } else if (class80.field1160 == 34) {
         var5 = "_wip";
      }

      File var6 = new File(class234.field2822, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      class368 var7;
      if (!var2 && var6.exists()) {
         try {
            var7 = new class368(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
         }
      }

      try {
         var7 = new class368(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }

   public static int method1892() {
      return class207.field2483;
   }
}
