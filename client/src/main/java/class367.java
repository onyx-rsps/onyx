public class class367 {
   public static class287 field4127;
   static final char[] field4124;
   static final char[] field4126;

   static {
      field4124 = new char[]{' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};
      field4126 = new char[]{'[', ']', '#'};
   }

   static void method6346(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var7 = (var0 + var1) / 2;
         int var8 = var0;
         class47 var9 = class15.field85[var7];
         class15.field85[var7] = class15.field85[var1];
         class15.field85[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            if (class57.method1645(class15.field85[var10], var9, var2, var3, var4, var5) <= 0) {
               class47 var11 = class15.field85[var10];
               class15.field85[var10] = class15.field85[var8];
               class15.field85[var8++] = var11;
            }
         }

         class15.field85[var1] = class15.field85[var8];
         class15.field85[var8] = var9;
         method6346(var0, var8 - 1, var2, var3, var4, var5);
         method6346(var8 + 1, var1, var2, var3, var4, var5);
      }

   }
}
