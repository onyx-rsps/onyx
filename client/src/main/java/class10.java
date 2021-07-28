import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class class10 implements KeyListener, FocusListener {
   public static boolean[] field38;
   public static boolean[] field45;
   public static boolean[] field46;
   public static class10 field58;
   public static int field35;
   public static int field49;
   public static int field50;
   public static int field52;
   public static int field57;
   public static int field59;
   public static int field64;
   public static int[] field48;
   public static int[] field53;
   public static int[] field55;
   public static volatile int field60;
   static char[] field51;
   static int field40;
   static int field65;
   static int[] field39;
   static int[] field54;

   static {
      field58 = new class10();
      field45 = new boolean[112];
      field46 = new boolean[112];
      field38 = new boolean[112];
      field48 = new int[128];
      field49 = 0;
      field50 = 0;
      field51 = new char[128];
      field54 = new int[128];
      field53 = new int[128];
      field35 = 0;
      field55 = new int[128];
      field64 = 0;
      field57 = 0;
      field52 = 0;
      field59 = 0;
      field60 = 0;
      field39 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   }

   class10() {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field58 != null) {
         field50 = -1;
      }

   }

   public final synchronized void keyPressed(KeyEvent var1) {
      if (field58 != null) {
         int var2 = var1.getKeyCode();
         if (var2 >= 0 && var2 < field39.length) {
            var2 = field39[var2];
            if ((var2 & 128) != 0) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if (field50 >= 0 && var2 >= 0) {
            field48[field50] = var2;
            field50 = field50 + 1 & 127;
            if (field49 == field50) {
               field50 = -1;
            }
         }

         int var3;
         if (var2 >= 0) {
            var3 = field52 + 1 & 127;
            if (var3 != field57) {
               field54[field52] = var2;
               field51[field52] = 0;
               field52 = var3;
            }
         }

         var3 = var1.getModifiers();
         if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
            var1.consume();
         }
      }

   }

   public final synchronized void keyReleased(KeyEvent var1) {
      if (field58 != null) {
         int var2 = var1.getKeyCode();
         if (var2 >= 0 && var2 < field39.length) {
            var2 = field39[var2] & -129;
         } else {
            var2 = -1;
         }

         if (field50 >= 0 && var2 >= 0) {
            field48[field50] = ~var2;
            field50 = field50 + 1 & 127;
            if (field50 == field49) {
               field50 = -1;
            }
         }
      }

      var1.consume();
   }

   public final void focusGained(FocusEvent var1) {
   }

   public final void keyTyped(KeyEvent var1) {
      if (field58 != null) {
         char var2 = var1.getKeyChar();
         if (var2 != 0 && var2 != '\uffff' && class213.method4266(var2)) {
            int var3 = field52 + 1 & 127;
            if (var3 != field57) {
               field54[field52] = -1;
               field51[field52] = var2;
               field52 = var3;
            }
         }
      }

      var1.consume();
   }

   public static class156 method105(int var0) {
      class156 var2 = (class156)class156.field1789.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class26.field216.method4920(10, var0);
         var2 = new class156();
         var2.field1801 = var0;
         if (var3 != null) {
            var2.method2980(new class384(var3));
         }

         var2.method2979();
         if (var2.field1788 != -1) {
            var2.method2982(method105(var2.field1788), method105(var2.field1826));
         }

         if (var2.field1785 != -1) {
            var2.method2983(method105(var2.field1785), method105(var2.field1828));
         }

         if (var2.field1819 != -1) {
            var2.method2984(method105(var2.field1819), method105(var2.field1837));
         }

         if (!class144.field1594 && var2.field1807) {
            var2.field1835 = "Members object";
            var2.field1833 = false;

            int var4;
            for(var4 = 0; var4 < var2.field1808.length; ++var4) {
               var2.field1808[var4] = null;
            }

            for(var4 = 0; var4 < var2.field1809.length; ++var4) {
               if (var4 != 4) {
                  var2.field1809[var4] = null;
               }
            }

            var2.field1791 = -2;
            var2.field1832 = 0;
            if (var2.field1830 != null) {
               boolean var7 = false;

               for(class353 var5 = var2.field1830.method6300(); var5 != null; var5 = var2.field1830.method6301()) {
                  class152 var6 = class383.method6540((int)var5.field3965);
                  if (var6.field1698) {
                     var5.method6014();
                  } else {
                     var7 = true;
                  }
               }

               if (!var7) {
                  var2.field1830 = null;
               }
            }
         }

         class156.field1789.method4308(var2, (long)var0);
         return var2;
      }
   }

   static void method106() {
      class115.method2363();
      client.field484[0] = "Cancel";
      client.field550[0] = "";
      client.field547[0] = 1006;
      client.field673[0] = false;
      client.field544 = 15;
   }

   static final boolean method107(int var0, int var1, class160 var2, class159 var3) {
      int var5 = var0;
      int var6 = var1;
      byte var7 = 64;
      byte var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      class161.field1898[var7][var8] = 99;
      class161.field1899[var7][var8] = 0;
      byte var11 = 0;
      int var12 = 0;
      class161.field1901[var11] = var0;
      byte var10001 = var11;
      int var19 = var11 + 1;
      class161.field1904[var10001] = var1;
      int[][] var13 = var3.field1888;

      while(var19 != var12) {
         var5 = class161.field1901[var12];
         var6 = class161.field1904[var12];
         var12 = var12 + 1 & 4095;
         int var17 = var5 - var9;
         int var18 = var6 - var10;
         int var14 = var5 - var3.field1884;
         int var15 = var6 - var3.field1887;
         if (var2.vmethod3137(2, var5, var6, var3)) {
            class26.field219 = var5;
            class161.field1896 = var6;
            return true;
         }

         int var16 = class161.field1899[var17][var18] + 1;
         if (var17 > 0 && class161.field1898[var17 - 1][var18] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + 1] & 19136824) == 0) {
            class161.field1901[var19] = var5 - 1;
            class161.field1904[var19] = var6;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 - 1][var18] = 2;
            class161.field1899[var17 - 1][var18] = var16;
         }

         if (var17 < 126 && class161.field1898[var17 + 1][var18] == 0 && (var13[var14 + 2][var15] & 19136899) == 0 && (var13[var14 + 2][var15 + 1] & 19136992) == 0) {
            class161.field1901[var19] = var5 + 1;
            class161.field1904[var19] = var6;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 + 1][var18] = 8;
            class161.field1899[var17 + 1][var18] = var16;
         }

         if (var18 > 0 && class161.field1898[var17][var18 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + 1][var15 - 1] & 19136899) == 0) {
            class161.field1901[var19] = var5;
            class161.field1904[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17][var18 - 1] = 1;
            class161.field1899[var17][var18 - 1] = var16;
         }

         if (var18 < 126 && class161.field1898[var17][var18 + 1] == 0 && (var13[var14][var15 + 2] & 19136824) == 0 && (var13[var14 + 1][var15 + 2] & 19136992) == 0) {
            class161.field1901[var19] = var5;
            class161.field1904[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17][var18 + 1] = 4;
            class161.field1899[var17][var18 + 1] = var16;
         }

         if (var17 > 0 && var18 > 0 && class161.field1898[var17 - 1][var18 - 1] == 0 && (var13[var14 - 1][var15] & 19136830) == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0 && (var13[var14][var15 - 1] & 19136911) == 0) {
            class161.field1901[var19] = var5 - 1;
            class161.field1904[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 - 1][var18 - 1] = 3;
            class161.field1899[var17 - 1][var18 - 1] = var16;
         }

         if (var17 < 126 && var18 > 0 && class161.field1898[var17 + 1][var18 - 1] == 0 && (var13[var14 + 1][var15 - 1] & 19136911) == 0 && (var13[var14 + 2][var15 - 1] & 19136899) == 0 && (var13[var14 + 2][var15] & 19136995) == 0) {
            class161.field1901[var19] = var5 + 1;
            class161.field1904[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 + 1][var18 - 1] = 9;
            class161.field1899[var17 + 1][var18 - 1] = var16;
         }

         if (var17 > 0 && var18 < 126 && class161.field1898[var17 - 1][var18 + 1] == 0 && (var13[var14 - 1][var15 + 1] & 19136830) == 0 && (var13[var14 - 1][var15 + 2] & 19136824) == 0 && (var13[var14][var15 + 2] & 19137016) == 0) {
            class161.field1901[var19] = var5 - 1;
            class161.field1904[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 - 1][var18 + 1] = 6;
            class161.field1899[var17 - 1][var18 + 1] = var16;
         }

         if (var17 < 126 && var18 < 126 && class161.field1898[var17 + 1][var18 + 1] == 0 && (var13[var14 + 1][var15 + 2] & 19137016) == 0 && (var13[var14 + 2][var15 + 2] & 19136992) == 0 && (var13[var14 + 2][var15 + 1] & 19136995) == 0) {
            class161.field1901[var19] = var5 + 1;
            class161.field1904[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class161.field1898[var17 + 1][var18 + 1] = 12;
            class161.field1899[var17 + 1][var18 + 1] = var16;
         }
      }

      class26.field219 = var5;
      class161.field1896 = var6;
      return false;
   }

   static final String method83(int var0) {
      return var0 < 999999999 ? Integer.toString(var0) : "*";
   }
}
