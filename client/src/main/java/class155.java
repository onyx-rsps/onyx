import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.URL;

public class class155 extends class348 {
   public static class222 field1737;
   static boolean field1741;
   static class192[] field1740;
   static class222 field1738;
   static class222 field1739;
   static class222 field1783;
   static class276 field1734;
   static class276 field1747;
   boolean field1759;
   boolean field1770;
   boolean field1784;
   class362 field1769;
   int field1735;
   int field1736;
   int field1754;
   int field1760;
   int field1766;
   int field1767;
   int field1771;
   int field1772;
   int field1775;
   int field1776;
   int field1777;
   int[] field1742;
   int[] field1743;
   short[] field1745;
   short[] field1746;
   short[] field1748;
   short[] field1773;
   public boolean field1733;
   public boolean field1756;
   public boolean field1758;
   public boolean field1764;
   public boolean field1778;
   public int field1744;
   public int field1749;
   public int field1750;
   public int field1751;
   public int field1752;
   public int field1753;
   public int field1755;
   public int field1757;
   public int field1762;
   public int field1763;
   public int field1765;
   public int field1774;
   public int field1779;
   public int field1781;
   public int[] field1761;
   public int[] field1780;
   public String field1768;
   public String[] field1782;

   static {
      field1741 = false;
      field1783 = new class222(4096);
      field1737 = new class222(500);
      field1738 = new class222(30);
      field1739 = new class222(30);
      field1740 = new class192[4];
   }

   class155() {
      this.field1768 = "null";
      this.field1749 = 1;
      this.field1750 = 1;
      this.field1751 = 2;
      this.field1778 = true;
      this.field1753 = -1;
      this.field1754 = -1;
      this.field1770 = false;
      this.field1756 = false;
      this.field1757 = -1;
      this.field1744 = 16;
      this.field1736 = 0;
      this.field1760 = 0;
      this.field1782 = new String[5];
      this.field1762 = -1;
      this.field1763 = -1;
      this.field1759 = false;
      this.field1764 = true;
      this.field1766 = 128;
      this.field1767 = 128;
      this.field1775 = 128;
      this.field1735 = 0;
      this.field1772 = 0;
      this.field1771 = 0;
      this.field1758 = false;
      this.field1784 = false;
      this.field1774 = -1;
      this.field1776 = -1;
      this.field1777 = -1;
      this.field1765 = -1;
      this.field1779 = 0;
      this.field1755 = 0;
      this.field1781 = 0;
      this.field1733 = true;
   }

   public final class155 method2931() {
      int var2 = -1;
      if (this.field1776 != -1) {
         var2 = class174.method3506(this.field1776);
      } else if (this.field1777 != -1) {
         var2 = class243.field2910[this.field1777];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field1761.length - 1) {
         var3 = this.field1761[var2];
      } else {
         var3 = this.field1761[this.field1761.length - 1];
      }

      return var3 != -1 ? class123.method2465(var3) : null;
   }

   void method2923(Buffer var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method6560();
         if (var4 > 0) {
            if (this.field1742 != null && !field1741) {
               var1.field4181 = (var1.field4181 * -1084587701 + var4 * 3) * 99;
            } else {
               this.field1743 = new int[var4];
               this.field1742 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field1742[var5] = var1.method6655();
                  this.field1743[var5] = var1.method6560();
               }
            }
         }
      } else if (var2 == 2) {
         this.field1768 = var1.method6569();
      } else if (var2 == 5) {
         var4 = var1.method6560();
         if (var4 > 0) {
            if (this.field1742 != null && !field1741) {
               var1.field4181 = (var1.field4181 * -1084587701 + 2 * var4) * 99;
            } else {
               this.field1743 = null;
               this.field1742 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field1742[var5] = var1.method6655();
               }
            }
         }
      } else if (var2 == 14) {
         this.field1749 = var1.method6560();
      } else if (var2 == 15) {
         this.field1750 = var1.method6560();
      } else if (var2 == 17) {
         this.field1751 = 0;
         this.field1778 = false;
      } else if (var2 == 18) {
         this.field1778 = false;
      } else if (var2 == 19) {
         this.field1753 = var1.method6560();
      } else if (var2 == 21) {
         this.field1754 = 0;
      } else if (var2 == 22) {
         this.field1770 = true;
      } else if (var2 == 23) {
         this.field1756 = true;
      } else if (var2 == 24) {
         this.field1757 = var1.method6655();
         if (this.field1757 == 65535) {
            this.field1757 = -1;
         }
      } else if (var2 == 27) {
         this.field1751 = 1;
      } else if (var2 == 28) {
         this.field1744 = var1.method6560();
      } else if (var2 == 29) {
         this.field1736 = var1.method6561();
      } else if (var2 == 39) {
         this.field1760 = var1.method6561();
      } else if (var2 >= 30 && var2 < 35) {
         this.field1782[var2 - 30] = var1.method6569();
         if (this.field1782[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field1782[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.method6560();
         this.field1745 = new short[var4];
         this.field1746 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1745[var5] = (short)var1.method6655();
            this.field1746[var5] = (short)var1.method6655();
         }
      } else if (var2 == 41) {
         var4 = var1.method6560();
         this.field1773 = new short[var4];
         this.field1748 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1773[var5] = (short)var1.method6655();
            this.field1748[var5] = (short)var1.method6655();
         }
      } else if (var2 == 61) {
         var1.method6655();
      } else if (var2 == 62) {
         this.field1759 = true;
      } else if (var2 == 64) {
         this.field1764 = false;
      } else if (var2 == 65) {
         this.field1766 = var1.method6655();
      } else if (var2 == 66) {
         this.field1767 = var1.method6655();
      } else if (var2 == 67) {
         this.field1775 = var1.method6655();
      } else if (var2 == 68) {
         this.field1763 = var1.method6655();
      } else if (var2 == 69) {
         var1.method6560();
      } else if (var2 == 70) {
         this.field1735 = var1.method6563();
      } else if (var2 == 71) {
         this.field1772 = var1.method6563();
      } else if (var2 == 72) {
         this.field1771 = var1.method6563();
      } else if (var2 == 73) {
         this.field1758 = true;
      } else if (var2 == 74) {
         this.field1784 = true;
      } else if (var2 == 75) {
         this.field1774 = var1.method6560();
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.field1765 = var1.method6655();
            this.field1779 = var1.method6560();
         } else if (var2 == 79) {
            this.field1755 = var1.method6655();
            this.field1781 = var1.method6655();
            this.field1779 = var1.method6560();
            var4 = var1.method6560();
            this.field1780 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1780[var5] = var1.method6655();
            }
         } else if (var2 == 81) {
            this.field1754 = var1.method6560() * 256;
         } else if (var2 == 82) {
            this.field1762 = var1.method6655();
         } else if (var2 == 89) {
            this.field1733 = false;
         } else if (var2 == 249) {
            this.field1769 = class49.method1435(var1, this.field1769);
         }
      } else {
         this.field1776 = var1.method6655();
         if (this.field1776 == 65535) {
            this.field1776 = -1;
         }

         this.field1777 = var1.method6655();
         if (this.field1777 == 65535) {
            this.field1777 = -1;
         }

         var4 = -1;
         if (var2 == 92) {
            var4 = var1.method6655();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         var5 = var1.method6560();
         this.field1761 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field1761[var6] = var1.method6655();
            if (this.field1761[var6] == 65535) {
               this.field1761[var6] = -1;
            }
         }

         this.field1761[var5 + 1] = var4;
      }

   }

   final class192 method2929(int var1, int var2) {
      class192 var4 = null;
      boolean var5;
      int var6;
      int var8;
      if (this.field1743 == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.field1742 == null) {
            return null;
         }

         var5 = this.field1759;
         if (var1 == 2 && var2 > 3) {
            var5 = !var5;
         }

         var6 = this.field1742.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            var8 = this.field1742[var7];
            if (var5) {
               var8 += 65536;
            }

            var4 = (class192)field1737.method4306((long)var8);
            if (var4 == null) {
               var4 = class192.method3720(field1747, var8 & '\uffff', 0);
               if (var4 == null) {
                  return null;
               }

               if (var5) {
                  var4.method3734();
               }

               field1737.method4308(var4, (long)var8);
            }

            if (var6 > 1) {
               field1740[var7] = var4;
            }
         }

         if (var6 > 1) {
            var4 = new class192(field1740, var6);
         }
      } else {
         int var10 = -1;

         for(var6 = 0; var6 < this.field1743.length; ++var6) {
            if (this.field1743[var6] == var1) {
               var10 = var6;
               break;
            }
         }

         if (var10 == -1) {
            return null;
         }

         var6 = this.field1742[var10];
         boolean var11 = this.field1759 ^ var2 > 3;
         if (var11) {
            var6 += 65536;
         }

         var4 = (class192)field1737.method4306((long)var6);
         if (var4 == null) {
            var4 = class192.method3720(field1747, var6 & '\uffff', 0);
            if (var4 == null) {
               return null;
            }

            if (var11) {
               var4.method3734();
            }

            field1737.method4308(var4, (long)var6);
         }
      }

      if (this.field1766 == 128 && this.field1767 == 128 && this.field1775 == 128) {
         var5 = false;
      } else {
         var5 = true;
      }

      boolean var12;
      if (this.field1735 == 0 && this.field1772 == 0 && this.field1771 == 0) {
         var12 = false;
      } else {
         var12 = true;
      }

      class192 var9 = new class192(var4, var2 == 0 && !var5 && !var12, null == this.field1745, null == this.field1773, true);
      if (var1 == 4 && var2 > 3) {
         var9.method3783(256);
         var9.method3731(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var9.method3719();
      } else if (var2 == 2) {
         var9.method3728();
      } else if (var2 == 3) {
         var9.method3729();
      }

      if (this.field1745 != null) {
         for(var8 = 0; var8 < this.field1745.length; ++var8) {
            var9.method3766(this.field1745[var8], this.field1746[var8]);
         }
      }

      if (this.field1773 != null) {
         for(var8 = 0; var8 < this.field1773.length; ++var8) {
            var9.method3733(this.field1773[var8], this.field1748[var8]);
         }
      }

      if (var5) {
         var9.method3772(this.field1766, this.field1767, this.field1775);
      }

      if (var12) {
         var9.method3731(this.field1735, this.field1772, this.field1771);
      }

      return var9;
   }

   void method2921() {
      if (this.field1753 == -1) {
         this.field1753 = 0;
         if (this.field1742 != null && (this.field1743 == null || this.field1743[0] == 10)) {
            this.field1753 = 1;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if (this.field1782[var2] != null) {
               this.field1753 = 1;
            }
         }
      }

      if (this.field1774 == -1) {
         this.field1774 = this.field1751 != 0 ? 1 : 0;
      }

   }

   void method2930(Buffer var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2923(var1, var3);
      }
   }

   public final class206 method2928(int var1, int var2, int[][] var3, int var4, int var5, int var6, class158 var7, int var8) {
      long var10;
      if (this.field1743 == null) {
         var10 = (long)(var2 + (this.field1752 << 10));
      } else {
         var10 = (long)(var2 + (var1 << 3) + (this.field1752 << 10));
      }

      class206 var12 = (class206)field1739.method4306(var10);
      if (var12 == null) {
         class192 var13 = this.method2929(var1, var2);
         if (var13 == null) {
            return null;
         }

         var12 = var13.method3740(this.field1736 + 64, this.field1760 * 25 + 768, -50, -10, -50);
         field1739.method4308(var12, var10);
      }

      if (var7 == null && this.field1754 == -1) {
         return var12;
      } else {
         if (var7 != null) {
            var12 = var7.method3070(var12, var8, var2);
         } else {
            var12 = var12.method4133(true);
         }

         if (this.field1754 >= 0) {
            var12 = var12.method4132(var3, var4, var5, var6, false, this.field1754);
         }

         return var12;
      }
   }

   public final class206 method2937(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (this.field1743 == null) {
         var8 = (long)(var2 + (this.field1752 << 10));
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field1752 << 10));
      }

      class206 var10 = (class206)field1739.method4306(var8);
      if (var10 == null) {
         class192 var11 = this.method2929(var1, var2);
         if (var11 == null) {
            return null;
         }

         var10 = var11.method3740(this.field1736 + 64, this.field1760 * 25 + 768, -50, -10, -50);
         field1739.method4308(var10, var8);
      }

      if (this.field1754 >= 0) {
         var10 = var10.method4132(var3, var4, var5, var6, true, this.field1754);
      }

      return var10;
   }

   public final boolean method2924(int var1) {
      if (this.field1743 != null) {
         for(int var5 = 0; var5 < this.field1743.length; ++var5) {
            if (this.field1743[var5] == var1) {
               return field1747.method5008(this.field1742[var5] & '\uffff', 0);
            }
         }

         return true;
      } else if (this.field1742 == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.field1742.length; ++var4) {
            var3 &= field1747.method5008(this.field1742[var4] & '\uffff', 0);
         }

         return var3;
      }
   }

   public final boolean method2925() {
      if (this.field1742 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field1742.length; ++var3) {
            var2 &= field1747.method5008(this.field1742[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   public boolean method2933() {
      if (this.field1761 == null) {
         return this.field1765 != -1 || this.field1780 != null;
      } else {
         for(int var2 = 0; var2 < this.field1761.length; ++var2) {
            if (this.field1761[var2] != -1) {
               class155 var3 = class123.method2465(this.field1761[var2]);
               if (var3.field1765 != -1 || var3.field1780 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public int method2966(int var1, int var2) {
      class362 var5 = this.field1769;
      int var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class352 var6 = (class352)var5.method6297((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = var6.field3963;
         }
      }

      return var4;
   }

   public String method2932(int var1, String var2) {
      class362 var5 = this.field1769;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class349 var6 = (class349)var5.method6297((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = (String)var6.field3960;
         }
      }

      return var4;
   }

   public final class200 method2926(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (this.field1743 == null) {
         var8 = (long)(var2 + (this.field1752 << 10));
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field1752 << 10));
      }

      Object var10 = (class200)field1738.method4306(var8);
      if (var10 == null) {
         class192 var11 = this.method2929(var1, var2);
         if (var11 == null) {
            return null;
         }

         if (!this.field1770) {
            var10 = var11.method3740(this.field1736 + 64, this.field1760 * 25 + 768, -50, -10, -50);
         } else {
            var11.field2174 = (short)(this.field1736 + 64);
            var11.field2177 = (short)(this.field1760 * 25 + 768);
            var11.method3736();
            var10 = var11;
         }

         field1738.method4308((class348)var10, var8);
      }

      if (this.field1770) {
         var10 = ((class192)var10).method3724();
      }

      if (this.field1754 >= 0) {
         if (var10 instanceof class206) {
            var10 = ((class206)var10).method4132(var3, var4, var5, var6, true, this.field1754);
         } else if (var10 instanceof class192) {
            var10 = ((class192)var10).method3725(var3, var4, var5, var6, true, this.field1754);
         }
      }

      return (class200)var10;
   }

   public static class154 method2975(int var0) {
      class154 var2 = (class154)class154.field1708.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class154.field1710.method4920(32, var0);
         var2 = new class154();
         if (var3 != null) {
            var2.method2899(new Buffer(var3));
         }

         class154.field1708.method4308(var2, (long)var0);
         return var2;
      }
   }

   public static class396 method2977(class276 var0, int var1) {
      byte[] var4 = var0.method4927(var1);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         class203.method4102(var4);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         class396 var5 = new class396();
         var5.field4266 = class398.field4280;
         var5.field4267 = class398.field4285;
         var5.field4264 = class398.field4283[0];
         var5.field4265 = class398.field4284[0];
         var5.field4262 = class105.field1307[0];
         var5.field4263 = class374.field4155[0];
         var5.field4260 = class118.field1406;
         var5.field4261 = class398.field4282[0];
         class398.field4283 = null;
         class398.field4284 = null;
         class105.field1307 = null;
         class374.field4155 = null;
         class118.field1406 = null;
         class398.field4282 = null;
         return var5;
      }
   }

   static void method2938(class18 var0) {
      int var3;
      int var4;
      int var33;
      if (class55.field799) {
         while(true) {
            if (!class316.method5611()) {
               if (class19.field148 != 1 && (class310.field3776 || class19.field148 != 4)) {
                  break;
               }

               int var2 = class55.field824 + 280;
               if (class19.field149 >= var2 && class19.field149 <= var2 + 14 && class19.field150 >= 4 && class19.field150 <= 18) {
                  class291.method5153(0, 0);
                  break;
               }

               if (class19.field149 >= var2 + 15 && class19.field149 <= var2 + 80 && class19.field150 >= 4 && class19.field150 <= 18) {
                  class291.method5153(0, 1);
                  break;
               }

               var3 = class55.field824 + 390;
               if (class19.field149 >= var3 && class19.field149 <= var3 + 14 && class19.field150 >= 4 && class19.field150 <= 18) {
                  class291.method5153(1, 0);
                  break;
               }

               if (class19.field149 >= var3 + 15 && class19.field149 <= var3 + 80 && class19.field150 >= 4 && class19.field150 <= 18) {
                  class291.method5153(1, 1);
                  break;
               }

               var4 = class55.field824 + 500;
               if (class19.field149 >= var4 && class19.field149 <= var4 + 14 && class19.field150 >= 4 && class19.field150 <= 18) {
                  class291.method5153(2, 0);
                  break;
               }

               if (class19.field149 >= var4 + 15 && class19.field149 <= var4 + 80 && class19.field150 >= 4 && class19.field150 <= 18) {
                  class291.method5153(2, 1);
                  break;
               }

               var33 = class55.field824 + 610;
               if (class19.field149 >= var33 && class19.field149 <= var33 + 14 && class19.field150 >= 4 && class19.field150 <= 18) {
                  class291.method5153(3, 0);
                  break;
               }

               if (class19.field149 >= var33 + 15 && class19.field149 <= var33 + 80 && class19.field150 >= 4 && class19.field150 <= 18) {
                  class291.method5153(3, 1);
                  break;
               }

               if (class19.field149 >= class55.field824 + 708 && class19.field150 >= 4 && class19.field149 <= class55.field824 + 708 + 50 && class19.field150 <= 20) {
                  class114.method2354();
                  break;
               }

               if (class55.field825 != -1) {
                  class47 var6 = class15.field85[class55.field825];
                  class156.method3010(var6);
                  class114.method2354();
               } else {
                  if (class55.field826 > 0 && class137.field1519 != null && class19.field149 >= 0 && class19.field149 <= class137.field1519.field4262 && class19.field150 >= client.field686 / 2 - 50 && class19.field150 <= client.field686 / 2 + 50) {
                     --class55.field826;
                  }

                  if (class55.field826 < class55.field827 && class95.field1256 != null && class19.field149 >= class68.field970 - class95.field1256.field4262 - 5 && class19.field149 <= class68.field970 && class19.field150 >= client.field686 / 2 - 50 && class19.field150 <= client.field686 / 2 + 50) {
                     ++class55.field826;
                  }
               }
               break;
            }

            if (class120.field1417 == 13) {
               class114.method2354();
               break;
            }

            if (class120.field1417 == 96) {
               if (class55.field826 > 0 && class137.field1519 != null) {
                  --class55.field826;
               }
            } else if (class120.field1417 == 97 && class55.field826 < class55.field827 && class95.field1256 != null) {
               ++class55.field826;
            }
         }

      } else {
         if ((class19.field148 == 1 || !class310.field3776 && class19.field148 == 4) && class19.field149 >= class55.field824 + 765 - 50 && class19.field150 >= 453) {
            class37.field307.field1113 = !class37.field307.field1113;
            class134.method2603();
            if (!class37.field307.field1113) {
               class274 var21 = class108.field1325;
               var3 = var21.method4936("scape main");
               var4 = var21.method4938(var3, "");
               class82.method1954(var21, var3, var4, 255, false);
            } else {
               class59.method1659();
            }
         }

         if (client.gameState != 5) {
            if (class55.field828 == -1L) {
               class55.field828 = class86.currentTime() + 1000L;
            }

            long var22 = class86.currentTime();
            if (class16.method173() && -1L == class55.field812) {
               class55.field812 = var22;
               if (class55.field812 > class55.field828) {
                  class55.field828 = class55.field812;
               }
            }

            if (client.gameState == 10 || client.gameState == 11) {
               if (class283.field3643 == class291.field3693) {
                  if (class19.field148 == 1 || !class310.field3776 && class19.field148 == 4) {
                     var4 = class55.field824 + 5;
                     short var5 = 463;
                     byte var24 = 100;
                     byte var7 = 35;
                     if (class19.field149 >= var4 && class19.field149 <= var4 + var24 && class19.field150 >= var5 && class19.field150 <= var7 + var5) {
                        if (class269.method4848()) {
                           class55.field799 = true;
                           class55.field826 = 0;
                           class55.field827 = 0;
                        }

                        return;
                     }
                  }

                  if (class77.field1134 != null && class269.method4848()) {
                     class55.field799 = true;
                     class55.field826 = 0;
                     class55.field827 = 0;
                  }
               }

               var4 = class19.field148;
               var33 = class19.field149;
               int var44 = class19.field150;
               if (var4 == 0) {
                  var33 = class19.field141;
                  var44 = class19.field144;
               }

               if (!class310.field3776 && var4 == 4) {
                  var4 = 1;
               }

               short var36;
               int var37;
               if (class55.field811 == 0) {
                  boolean var41 = false;

                  while(class316.method5611()) {
                     if (class120.field1417 == 84) {
                        var41 = true;
                     }
                  }

                  var37 = class166.field1931 - 80;
                  var36 = 291;
                  if (var4 == 1 && var33 >= var37 - 75 && var33 <= var37 + 75 && var44 >= var36 - 20 && var44 <= var36 + 20) {
                     class138.method2628(class91.method2099("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var37 = class166.field1931 + 80;
                  if (var4 == 1 && var33 >= var37 - 75 && var33 <= var37 + 75 && var44 >= var36 - 20 && var44 <= var36 + 20 || var41) {
                     if ((client.field405 & 33554432) != 0) {
                        class55.field798 = "";
                        class55.field822 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class55.field813 = "Your normal account will not be affected.";
                        class55.field815 = "";
                        class55.field811 = 1;
                        if (client.field442 && class55.field808 != null && class55.field808.length() > 0) {
                           class55.field821 = 1;
                        } else {
                           class55.field821 = 0;
                        }
                     } else if ((client.field405 & 4) != 0) {
                        if ((client.field405 & 1024) != 0) {
                           class55.field822 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class55.field813 = "Players can attack each other almost everywhere";
                           class55.field815 = "and the Protect Item prayer won't work.";
                        } else {
                           class55.field822 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class55.field813 = "Players can attack each other";
                           class55.field815 = "almost everywhere.";
                        }

                        class55.field798 = "Warning!";
                        class55.field811 = 1;
                        if (client.field442 && class55.field808 != null && class55.field808.length() > 0) {
                           class55.field821 = 1;
                        } else {
                           class55.field821 = 0;
                        }
                     } else if ((client.field405 & 1024) != 0) {
                        class55.field822 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class55.field813 = "The Protect Item prayer will";
                        class55.field815 = "not work on this world.";
                        class55.field798 = "Warning!";
                        class55.field811 = 1;
                        if (client.field442 && class55.field808 != null && class55.field808.length() > 0) {
                           class55.field821 = 1;
                        } else {
                           class55.field821 = 0;
                        }
                     } else {
                        class107.method2221(false);
                     }
                  }
               } else {
                  short var8;
                  int var34;
                  if (class55.field811 == 1) {
                     while(true) {
                        if (!class316.method5611()) {
                           var34 = class166.field1931 - 80;
                           var8 = 321;
                           if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                              class107.method2221(false);
                           }

                           var34 = class166.field1931 + 80;
                           if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                              class55.field811 = 0;
                           }
                           break;
                        }

                        if (class120.field1417 == 84) {
                           class107.method2221(false);
                        } else if (class120.field1417 == 13) {
                           class55.field811 = 0;
                        }
                     }
                  } else {
                     short var35;
                     boolean var38;
                     if (class55.field811 == 2) {
                        var35 = 201;
                        var34 = var35 + 52;
                        if (var4 == 1 && var44 >= var34 - 12 && var44 < var34 + 2) {
                           class55.field821 = 0;
                        }

                        var34 += 15;
                        if (var4 == 1 && var44 >= var34 - 12 && var44 < var34 + 2) {
                           class55.field821 = 1;
                        }

                        var34 += 15;
                        var35 = 361;
                        if (class18.field127 != null) {
                           var37 = class18.field127.field3922 / 2;
                           if (var4 == 1 && var33 >= class18.field127.field3924 - var37 && var33 <= var37 + class18.field127.field3924 && var44 >= var35 - 15 && var44 < var35) {
                              switch(class55.field809) {
                              case 1:
                                 client.method1315("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                 class55.field811 = 5;
                                 return;
                              case 2:
                                 class138.method2628("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var37 = class166.field1931 - 80;
                        var36 = 321;
                        if (var4 == 1 && var33 >= var37 - 75 && var33 <= var37 + 75 && var44 >= var36 - 20 && var44 <= var36 + 20) {
                           class55.field808 = class55.field808.trim();
                           if (class55.field808.length() == 0) {
                              client.method1315("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (class55.field817.length() == 0) {
                              client.method1315("", "Please enter your password.", "");
                              return;
                           }

                           client.method1315("", "Connecting to server...", "");
                           class50.method1511(false);
                           class16.method163(20);
                           return;
                        }

                        var37 = class55.field816 + 180 + 80;
                        if (var4 == 1 && var33 >= var37 - 75 && var33 <= var37 + 75 && var44 >= var36 - 20 && var44 <= var36 + 20) {
                           class55.field811 = 0;
                           class55.field808 = "";
                           class55.field817 = "";
                           class282.field3639 = 0;
                           class146.field1614 = "";
                           class55.field820 = true;
                        }

                        var37 = class166.field1931 + -117;
                        var36 = 277;
                        class55.field829 = var33 >= var37 && var33 < var37 + class114.field1386 && var44 >= var36 && var44 < var36 + class47.field704;
                        if (var4 == 1 && class55.field829) {
                           client.field442 = !client.field442;
                           if (!client.field442 && class37.field307.field1122 != null) {
                              class37.field307.field1122 = null;
                              class134.method2603();
                           }
                        }

                        var37 = class166.field1931 + 24;
                        var36 = 277;
                        class55.field819 = var33 >= var37 && var33 < var37 + class114.field1386 && var44 >= var36 && var44 < var36 + class47.field704;
                        if (var4 == 1 && class55.field819) {
                           class37.field307.field1116 = !class37.field307.field1116;
                           if (!class37.field307.field1116) {
                              class55.field808 = "";
                              class37.field307.field1122 = null;
                              if (client.field442 && class55.field808 != null && class55.field808.length() > 0) {
                                 class55.field821 = 1;
                              } else {
                                 class55.field821 = 0;
                              }
                           }

                           class134.method2603();
                        }

                        label996:
                        while(true) {
                           Transferable var26;
                           int var40;
                           do {
                              while(true) {
                                 char var39;
                                 label910:
                                 do {
                                    while(true) {
                                       while(class316.method5611()) {
                                          if (class120.field1417 != 13) {
                                             if (class55.field821 != 0) {
                                                continue label910;
                                             }

                                             class177.method3570(class126.field1449);
                                             if (class120.field1417 == 85 && class55.field808.length() > 0) {
                                                class55.field808 = class55.field808.substring(0, class55.field808.length() - 1);
                                             }

                                             if (class120.field1417 == 84 || class120.field1417 == 80) {
                                                class55.field821 = 1;
                                             }

                                             var39 = class126.field1449;
                                             var38 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var39) != -1;
                                             if (var38 && class55.field808.length() < 320) {
                                                class55.field808 = class55.field808 + class126.field1449;
                                             }
                                          } else {
                                             class55.field811 = 0;
                                             class55.field808 = "";
                                             class55.field817 = "";
                                             class282.field3639 = 0;
                                             class146.field1614 = "";
                                             class55.field820 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(class55.field821 != 1);

                                 if (class120.field1417 == 85 && class55.field817.length() > 0) {
                                    class55.field817 = class55.field817.substring(0, class55.field817.length() - 1);
                                 } else if (class120.field1417 == 84 || class120.field1417 == 80) {
                                    class55.field821 = 0;
                                    if (class120.field1417 == 84) {
                                       class55.field808 = class55.field808.trim();
                                       if (class55.field808.length() == 0) {
                                          client.method1315("", "Please enter your username/email address.", "");
                                          return;
                                       }

                                       if (class55.field817.length() == 0) {
                                          client.method1315("", "Please enter your password.", "");
                                          return;
                                       }

                                       client.method1315("", "Connecting to server...", "");
                                       class50.method1511(false);
                                       class16.method163(20);
                                       return;
                                    }
                                 }

                                 if ((class10.field45[82] || class10.field45[87]) && class120.field1417 == 67) {
                                    Clipboard var25 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var26 = var25.getContents(class58.field873);
                                    var40 = 20 - class55.field817.length();
                                    break;
                                 }

                                 var39 = class126.field1449;
                                 if (var39 >= ' ' && var39 < 127 || var39 > 127 && var39 < 160 || var39 > 160 && var39 <= 255) {
                                    var38 = true;
                                 } else {
                                    label1138: {
                                       if (var39 != 0) {
                                          char[] var28 = class303.field3754;

                                          for(int var29 = 0; var29 < var28.length; ++var29) {
                                             char var14 = var28[var29];
                                             if (var14 == var39) {
                                                var38 = true;
                                                break label1138;
                                             }
                                          }
                                       }

                                       var38 = false;
                                    }
                                 }

                                 if (var38) {
                                    char var45 = class126.field1449;
                                    boolean var12 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var45) != -1;
                                    if (var12 && class55.field817.length() < 20) {
                                       class55.field817 = class55.field817 + class126.field1449;
                                    }
                                 }
                              }
                           } while(var40 <= 0);

                           try {
                              String var13 = (String)var26.getTransferData(DataFlavor.stringFlavor);
                              int var42 = Math.min(var40, var13.length());
                              int var15 = 0;

                              while(true) {
                                 if (var15 >= var42) {
                                    class55.field817 = class55.field817 + var13.substring(0, var42);
                                    continue label996;
                                 }

                                 char var17 = var13.charAt(var15);
                                 boolean var16;
                                 if (var17 >= ' ' && var17 < 127 || var17 > 127 && var17 < 160 || var17 > 160 && var17 <= 255) {
                                    var16 = true;
                                 } else {
                                    label1139: {
                                       if (var17 != 0) {
                                          char[] var18 = class303.field3754;

                                          for(int var19 = 0; var19 < var18.length; ++var19) {
                                             char var20 = var18[var19];
                                             if (var17 == var20) {
                                                var16 = true;
                                                break label1139;
                                             }
                                          }
                                       }

                                       var16 = false;
                                    }
                                 }

                                 if (!var16) {
                                    break;
                                 }

                                 char var43 = var13.charAt(var15);
                                 boolean var27 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var43) != -1;
                                 if (!var27) {
                                    break;
                                 }

                                 ++var15;
                              }

                              class55.field811 = 3;
                              return;
                           } catch (UnsupportedFlavorException var31) {
                           } catch (IOException var32) {
                           }
                        }
                     } else if (class55.field811 == 3) {
                        var34 = class55.field816 + 180;
                        var8 = 276;
                        if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                           class107.method2221(false);
                        }

                        var34 = class55.field816 + 180;
                        var8 = 326;
                        if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                           client.method1315("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class55.field811 = 5;
                           return;
                        }
                     } else {
                        int var10;
                        if (class55.field811 == 4) {
                           var34 = class55.field816 + 180 - 80;
                           var8 = 321;
                           if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                              class146.field1614.trim();
                              if (class146.field1614.length() != 6) {
                                 client.method1315("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              class282.field3639 = Integer.parseInt(class146.field1614);
                              class146.field1614 = "";
                              class50.method1511(true);
                              client.method1315("", "Connecting to server...", "");
                              class16.method163(20);
                              return;
                           }

                           if (var4 == 1 && var33 >= class55.field816 + 180 - 9 && var33 <= class55.field816 + 180 + 130 && var44 >= 263 && var44 <= 296) {
                              class55.field820 = !class55.field820;
                           }

                           if (var4 == 1 && var33 >= class55.field816 + 180 - 34 && var33 <= class55.field816 + 34 + 180 && var44 >= 351 && var44 <= 363) {
                              class138.method2628(class91.method2099("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var34 = class55.field816 + 180 + 80;
                           if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                              class55.field811 = 0;
                              class55.field808 = "";
                              class55.field817 = "";
                              class282.field3639 = 0;
                              class146.field1614 = "";
                           }

                           while(class316.method5611()) {
                              boolean var9 = false;

                              for(var10 = 0; var10 < "1234567890".length(); ++var10) {
                                 if (class126.field1449 == "1234567890".charAt(var10)) {
                                    var9 = true;
                                    break;
                                 }
                              }

                              if (class120.field1417 == 13) {
                                 class55.field811 = 0;
                                 class55.field808 = "";
                                 class55.field817 = "";
                                 class282.field3639 = 0;
                                 class146.field1614 = "";
                              } else {
                                 if (class120.field1417 == 85 && class146.field1614.length() > 0) {
                                    class146.field1614 = class146.field1614.substring(0, class146.field1614.length() - 1);
                                 }

                                 if (class120.field1417 == 84) {
                                    class146.field1614.trim();
                                    if (class146.field1614.length() != 6) {
                                       client.method1315("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    class282.field3639 = Integer.parseInt(class146.field1614);
                                    class146.field1614 = "";
                                    class50.method1511(true);
                                    client.method1315("", "Connecting to server...", "");
                                    class16.method163(20);
                                    return;
                                 }

                                 if (var9 && class146.field1614.length() < 6) {
                                    class146.field1614 = class146.field1614 + class126.field1449;
                                 }
                              }
                           }
                        } else if (class55.field811 == 5) {
                           var34 = class55.field816 + 180 - 80;
                           var8 = 321;
                           if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                              class292.method5157();
                              return;
                           }

                           var34 = class55.field816 + 180 + 80;
                           if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                              class107.method2221(true);
                           }

                           var36 = 361;
                           if (class307.field3766 != null) {
                              var10 = class307.field3766.field3922 / 2;
                              if (var4 == 1 && var33 >= class307.field3766.field3924 - var10 && var33 <= var10 + class307.field3766.field3924 && var44 >= var36 - 15 && var44 < var36) {
                                 class138.method2628(class91.method2099("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                              }
                           }

                           while(class316.method5611()) {
                              var38 = false;

                              for(int var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) {
                                 if (class126.field1449 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) {
                                    var38 = true;
                                    break;
                                 }
                              }

                              if (class120.field1417 == 13) {
                                 class107.method2221(true);
                              } else {
                                 if (class120.field1417 == 85 && class55.field808.length() > 0) {
                                    class55.field808 = class55.field808.substring(0, class55.field808.length() - 1);
                                 }

                                 if (class120.field1417 == 84) {
                                    class292.method5157();
                                    return;
                                 }

                                 if (var38 && class55.field808.length() < 320) {
                                    class55.field808 = class55.field808 + class126.field1449;
                                 }
                              }
                           }
                        } else if (class55.field811 != 6) {
                           if (class55.field811 == 7) {
                              var34 = class55.field816 + 180 - 80;
                              var8 = 321;
                              if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                                 class138.method2628(class91.method2099("secure", true) + "m=dob/set_dob.ws", true, false);
                                 client.method1315("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 class55.field811 = 6;
                                 return;
                              }

                              var34 = class55.field816 + 180 + 80;
                              if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                                 class107.method2221(true);
                              }
                           } else if (class55.field811 == 8) {
                              var34 = class55.field816 + 180 - 80;
                              var8 = 321;
                              if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                                 class138.method2628("https://www.jagex.com/terms/privacy", true, false);
                                 client.method1315("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 class55.field811 = 6;
                                 return;
                              }

                              var34 = class55.field816 + 180 + 80;
                              if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                                 class107.method2221(true);
                              }
                           } else if (class55.field811 == 12) {
                              String var30 = "";
                              switch(class55.field804) {
                              case 0:
                                 var30 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                 break;
                              case 1:
                                 var30 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                 break;
                              default:
                                 class107.method2221(false);
                              }

                              var37 = class55.field816 + 180;
                              var36 = 276;
                              if (var4 == 1 && var33 >= var37 - 75 && var33 <= var37 + 75 && var44 >= var36 - 20 && var44 <= var36 + 20) {
                                 class138.method2628(var30, true, false);
                                 client.method1315("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 class55.field811 = 6;
                                 return;
                              }

                              var37 = class55.field816 + 180;
                              var36 = 326;
                              if (var4 == 1 && var33 >= var37 - 75 && var33 <= var37 + 75 && var44 >= var36 - 20 && var44 <= var36 + 20) {
                                 class107.method2221(false);
                              }
                           } else if (class55.field811 == 24) {
                              var34 = class55.field816 + 180;
                              var8 = 301;
                              if (var4 == 1 && var33 >= var34 - 75 && var33 <= var34 + 75 && var44 >= var8 - 20 && var44 <= var8 + 20) {
                                 class107.method2221(false);
                              }
                           }
                        } else {
                           while(true) {
                              do {
                                 if (!class316.method5611()) {
                                    var35 = 321;
                                    if (var4 == 1 && var44 >= var35 - 20 && var44 <= var35 + 20) {
                                       class107.method2221(true);
                                    }

                                    return;
                                 }
                              } while(class120.field1417 != 84 && class120.field1417 != 13);

                              class107.method2221(true);
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   static final void method2944(class71 var0) {
      var0.field1049 = var0.field1029;
      if (var0.field1026 == 0) {
         var0.field1078 = 0;
      } else {
         if (var0.field1052 != -1 && var0.field1055 == 0) {
            class158 var2 = class47.method1355(var0.field1052);
            if (var0.field1066 > 0 && var2.field1867 == 0) {
               ++var0.field1078;
               return;
            }

            if (var0.field1066 <= 0 && var2.field1859 == 0) {
               ++var0.field1078;
               return;
            }
         }

         int var11 = var0.field1068;
         int var3 = var0.field1058;
         int var4 = var0.field1075[var0.field1026 - 1] * 128 + var0.field1023 * 64;
         int var5 = var0.field1076[var0.field1026 - 1] * 128 + var0.field1023 * 64;
         if (var11 < var4) {
            if (var3 < var5) {
               var0.field1042 = 1280;
            } else if (var3 > var5) {
               var0.field1042 = 1792;
            } else {
               var0.field1042 = 1536;
            }
         } else if (var11 > var4) {
            if (var3 < var5) {
               var0.field1042 = 768;
            } else if (var3 > var5) {
               var0.field1042 = 256;
            } else {
               var0.field1042 = 512;
            }
         } else if (var3 < var5) {
            var0.field1042 = 1024;
         } else if (var3 > var5) {
            var0.field1042 = 0;
         }

         byte var6 = var0.field1030[var0.field1026 - 1];
         if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
            int var7 = var0.field1042 - var0.field1021 & 2047;
            if (var7 > 1024) {
               var7 -= 2048;
            }

            int var8 = var0.field1071;
            if (var7 >= -256 && var7 <= 256) {
               var8 = var0.field1028;
            } else if (var7 >= 256 && var7 < 768) {
               var8 = var0.field1020;
            } else if (var7 >= -768 && var7 <= -256) {
               var8 = var0.field1045;
            }

            if (var8 == -1) {
               var8 = var0.field1028;
            }

            var0.field1049 = var8;
            int var9 = 4;
            boolean var10 = true;
            if (var0 instanceof class77) {
               var10 = ((class77)var0).field1131.field1622;
            }

            if (var10) {
               if (var0.field1021 != var0.field1042 && var0.field1046 == -1 && var0.field1074 != 0) {
                  var9 = 2;
               }

               if (var0.field1026 > 2) {
                  var9 = 6;
               }

               if (var0.field1026 > 3) {
                  var9 = 8;
               }

               if (var0.field1078 > 0 && var0.field1026 > 1) {
                  var9 = 8;
                  --var0.field1078;
               }
            } else {
               if (var0.field1026 > 1) {
                  var9 = 6;
               }

               if (var0.field1026 > 2) {
                  var9 = 8;
               }

               if (var0.field1078 > 0 && var0.field1026 > 1) {
                  var9 = 8;
                  --var0.field1078;
               }
            }

            if (var6 == 2) {
               var9 <<= 1;
            }

            if (var9 >= 8 && var0.field1049 == var0.field1028 && var0.field1032 != -1) {
               var0.field1049 = var0.field1032;
            }

            if (var4 != var11 || var5 != var3) {
               if (var11 < var4) {
                  var0.field1068 += var9;
                  if (var0.field1068 > var4) {
                     var0.field1068 = var4;
                  }
               } else if (var11 > var4) {
                  var0.field1068 -= var9;
                  if (var0.field1068 < var4) {
                     var0.field1068 = var4;
                  }
               }

               if (var3 < var5) {
                  var0.field1058 += var9;
                  if (var0.field1058 > var5) {
                     var0.field1058 = var5;
                  }
               } else if (var3 > var5) {
                  var0.field1058 -= var9;
                  if (var0.field1058 < var5) {
                     var0.field1058 = var5;
                  }
               }
            }

            if (var4 == var0.field1068 && var5 == var0.field1058) {
               --var0.field1026;
               if (var0.field1066 > 0) {
                  --var0.field1066;
               }
            }

         } else {
            var0.field1068 = var4;
            var0.field1058 = var5;
            --var0.field1026;
            if (var0.field1066 > 0) {
               --var0.field1066;
            }

         }
      }
   }

   static boolean method2946(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!class16.field87.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var5 = 0; var5 < var0.length(); ++var5) {
                  if (var11.indexOf(var0.charAt(var5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Object var4 = class14.method155(class16.field89, var2, new Object[]{(new URL(class16.field89.getCodeBase(), var0)).toString()});
            return var4 != null;
         } catch (Throwable var7) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            class16.field89.getAppletContext().showDocument(new URL(class16.field89.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            class14.method148(class16.field89, "loggedout");
         } catch (Throwable var10) {
         }

         try {
            class16.field89.getAppletContext().showDocument(new URL(class16.field89.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var9) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
