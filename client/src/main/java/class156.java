public class class156 extends class348 {
   public static class222 field1836;
   static class222 field1789;
   static class222 field1790;
   class362 field1830;
   int field1785;
   int field1791;
   int field1794;
   int field1810;
   int field1811;
   int field1812;
   int field1814;
   int field1815;
   int field1816;
   int field1817;
   int field1818;
   int field1820;
   int field1822;
   int field1825;
   int field1828;
   int field1829;
   int field1834;
   int field1838;
   int field1840;
   int[] field1823;
   int[] field1824;
   public boolean field1807;
   public boolean field1833;
   public int field1788;
   public int field1792;
   public int field1799;
   public int field1800;
   public int field1801;
   public int field1802;
   public int field1803;
   public int field1804;
   public int field1805;
   public int field1806;
   public int field1819;
   public int field1821;
   public int field1826;
   public int field1831;
   public int field1832;
   public int field1837;
   public String field1835;
   public String[] field1808;
   public String[] field1809;
   public short[] field1795;
   public short[] field1796;
   public short[] field1797;
   public short[] field1798;

   static {
      field1789 = new class222(64);
      field1790 = new class222(50);
      field1836 = new class222(200);
   }

   class156() {
      this.field1835 = "null";
      this.field1799 = 2000;
      this.field1800 = 0;
      this.field1821 = 0;
      this.field1802 = 0;
      this.field1803 = 0;
      this.field1804 = 0;
      this.field1805 = 0;
      this.field1806 = 1;
      this.field1807 = false;
      this.field1808 = new String[]{null, null, "Take", null, null};
      this.field1809 = new String[]{null, null, null, null, "Drop"};
      this.field1791 = -2;
      this.field1811 = -1;
      this.field1812 = -1;
      this.field1840 = 0;
      this.field1814 = -1;
      this.field1810 = -1;
      this.field1816 = 0;
      this.field1817 = -1;
      this.field1818 = -1;
      this.field1815 = -1;
      this.field1820 = -1;
      this.field1834 = -1;
      this.field1822 = -1;
      this.field1826 = -1;
      this.field1788 = -1;
      this.field1838 = 128;
      this.field1825 = 128;
      this.field1829 = 128;
      this.field1792 = 0;
      this.field1831 = 0;
      this.field1832 = 0;
      this.field1833 = false;
      this.field1828 = -1;
      this.field1785 = -1;
      this.field1837 = -1;
      this.field1819 = -1;
   }

   void method2981(class384 var1, int var2) {
      if (var2 == 1) {
         this.field1794 = var1.method6655();
      } else if (var2 == 2) {
         this.field1835 = var1.method6569();
      } else if (var2 == 4) {
         this.field1799 = var1.method6655();
      } else if (var2 == 5) {
         this.field1800 = var1.method6655();
      } else if (var2 == 6) {
         this.field1821 = var1.method6655();
      } else if (var2 == 7) {
         this.field1803 = var1.method6655();
         if (this.field1803 > 32767) {
            this.field1803 -= 65536;
         }
      } else if (var2 == 8) {
         this.field1804 = var1.method6655();
         if (this.field1804 > 32767) {
            this.field1804 -= 65536;
         }
      } else if (var2 == 9) {
         var1.method6569();
      } else if (var2 == 11) {
         this.field1805 = 1;
      } else if (var2 == 12) {
         this.field1806 = var1.method6784();
      } else if (var2 == 16) {
         this.field1807 = true;
      } else if (var2 == 23) {
         this.field1811 = var1.method6655();
         this.field1840 = var1.method6560();
      } else if (var2 == 24) {
         this.field1812 = var1.method6655();
      } else if (var2 == 25) {
         this.field1814 = var1.method6655();
         this.field1816 = var1.method6560();
      } else if (var2 == 26) {
         this.field1810 = var1.method6655();
      } else if (var2 >= 30 && var2 < 35) {
         this.field1808[var2 - 30] = var1.method6569();
         if (this.field1808[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field1808[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.field1809[var2 - 35] = var1.method6569();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.method6560();
            this.field1795 = new short[var4];
            this.field1796 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1795[var5] = (short)var1.method6655();
               this.field1796[var5] = (short)var1.method6655();
            }
         } else if (var2 == 41) {
            var4 = var1.method6560();
            this.field1797 = new short[var4];
            this.field1798 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1797[var5] = (short)var1.method6655();
               this.field1798[var5] = (short)var1.method6655();
            }
         } else if (var2 == 42) {
            this.field1791 = var1.method6561();
         } else if (var2 == 65) {
            this.field1833 = true;
         } else if (var2 == 78) {
            this.field1817 = var1.method6655();
         } else if (var2 == 79) {
            this.field1818 = var1.method6655();
         } else if (var2 == 90) {
            this.field1815 = var1.method6655();
         } else if (var2 == 91) {
            this.field1834 = var1.method6655();
         } else if (var2 == 92) {
            this.field1820 = var1.method6655();
         } else if (var2 == 93) {
            this.field1822 = var1.method6655();
         } else if (var2 == 94) {
            var1.method6655();
         } else if (var2 == 95) {
            this.field1802 = var1.method6655();
         } else if (var2 == 97) {
            this.field1826 = var1.method6655();
         } else if (var2 == 98) {
            this.field1788 = var1.method6655();
         } else if (var2 >= 100 && var2 < 110) {
            if (this.field1823 == null) {
               this.field1823 = new int[10];
               this.field1824 = new int[10];
            }

            this.field1823[var2 - 100] = var1.method6655();
            this.field1824[var2 - 100] = var1.method6655();
         } else if (var2 == 110) {
            this.field1838 = var1.method6655();
         } else if (var2 == 111) {
            this.field1825 = var1.method6655();
         } else if (var2 == 112) {
            this.field1829 = var1.method6655();
         } else if (var2 == 113) {
            this.field1792 = var1.method6561();
         } else if (var2 == 114) {
            this.field1831 = var1.method6561() * 5;
         } else if (var2 == 115) {
            this.field1832 = var1.method6560();
         } else if (var2 == 139) {
            this.field1828 = var1.method6655();
         } else if (var2 == 140) {
            this.field1785 = var1.method6655();
         } else if (var2 == 148) {
            this.field1837 = var1.method6655();
         } else if (var2 == 149) {
            this.field1819 = var1.method6655();
         } else if (var2 == 249) {
            this.field1830 = class49.method1435(var1, this.field1830);
         }
      }

   }

   public final class206 method3014(int var1) {
      if (this.field1823 != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1824[var4] && this.field1824[var4] != 0) {
               var3 = this.field1823[var4];
            }
         }

         if (var3 != -1) {
            return class10.method105(var3).method3014(1);
         }
      }

      class206 var6 = (class206)field1790.method4306((long)this.field1801);
      if (var6 != null) {
         return var6;
      } else {
         class192 var7 = class192.method3720(class339.field3934, this.field1794, 0);
         if (var7 == null) {
            return null;
         } else {
            if (this.field1838 != 128 || this.field1825 != 128 || this.field1829 != 128) {
               var7.method3772(this.field1838, this.field1825, this.field1829);
            }

            int var5;
            if (this.field1795 != null) {
               for(var5 = 0; var5 < this.field1795.length; ++var5) {
                  var7.method3766(this.field1795[var5], this.field1796[var5]);
               }
            }

            if (this.field1797 != null) {
               for(var5 = 0; var5 < this.field1797.length; ++var5) {
                  var7.method3733(this.field1797[var5], this.field1798[var5]);
               }
            }

            var6 = var7.method3740(this.field1792 + 64, this.field1831 + 768, -50, -10, -50);
            var6.field2429 = true;
            field1790.method4308(var6, (long)this.field1801);
            return var6;
         }
      }
   }

   boolean method2995() {
      return this.field1796 != null;
   }

   public final class192 method2985(int var1) {
      int var4;
      if (this.field1823 != null && var1 > 1) {
         int var3 = -1;

         for(var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1824[var4] && this.field1824[var4] != 0) {
               var3 = this.field1823[var4];
            }
         }

         if (var3 != -1) {
            return class10.method105(var3).method2985(1);
         }
      }

      class192 var5 = class192.method3720(class339.field3934, this.field1794, 0);
      if (var5 == null) {
         return null;
      } else {
         if (this.field1838 != 128 || this.field1825 != 128 || this.field1829 != 128) {
            var5.method3772(this.field1838, this.field1825, this.field1829);
         }

         if (this.field1795 != null) {
            for(var4 = 0; var4 < this.field1795.length; ++var4) {
               var5.method3766(this.field1795[var4], this.field1796[var4]);
            }
         }

         if (this.field1797 != null) {
            for(var4 = 0; var4 < this.field1797.length; ++var4) {
               var5.method3733(this.field1797[var4], this.field1798[var4]);
            }
         }

         return var5;
      }
   }

   boolean method2996() {
      return this.field1798 != null;
   }

   void method2979() {
   }

   public final boolean method2990(boolean var1) {
      int var3 = this.field1815;
      int var4 = this.field1820;
      if (var1) {
         var3 = this.field1834;
         var4 = this.field1822;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!class339.field3934.method5008(var3, 0)) {
            var5 = false;
         }

         if (var4 != -1 && !class339.field3934.method5008(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   void method2980(class384 var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2981(var1, var3);
      }
   }

   public final class192 method2978(boolean var1) {
      int var3 = this.field1815;
      int var4 = this.field1820;
      if (var1) {
         var3 = this.field1834;
         var4 = this.field1822;
      }

      if (var3 == -1) {
         return null;
      } else {
         class192 var5 = class192.method3720(class339.field3934, var3, 0);
         if (var4 != -1) {
            class192 var6 = class192.method3720(class339.field3934, var4, 0);
            class192[] var7 = new class192[]{var5, var6};
            var5 = new class192(var7, 2);
         }

         int var8;
         if (this.field1795 != null) {
            for(var8 = 0; var8 < this.field1795.length; ++var8) {
               var5.method3766(this.field1795[var8], this.field1796[var8]);
            }
         }

         if (this.field1797 != null) {
            for(var8 = 0; var8 < this.field1797.length; ++var8) {
               var5.method3733(this.field1797[var8], this.field1798[var8]);
            }
         }

         return var5;
      }
   }

   public final boolean method2991(boolean var1) {
      int var3 = this.field1811;
      int var4 = this.field1812;
      int var5 = this.field1817;
      if (var1) {
         var3 = this.field1814;
         var4 = this.field1810;
         var5 = this.field1818;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var6 = true;
         if (!class339.field3934.method5008(var3, 0)) {
            var6 = false;
         }

         if (var4 != -1 && !class339.field3934.method5008(var4, 0)) {
            var6 = false;
         }

         if (var5 != -1 && !class339.field3934.method5008(var5, 0)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final class192 method2989(boolean var1) {
      int var3 = this.field1811;
      int var4 = this.field1812;
      int var5 = this.field1817;
      if (var1) {
         var3 = this.field1814;
         var4 = this.field1810;
         var5 = this.field1818;
      }

      if (var3 == -1) {
         return null;
      } else {
         class192 var6 = class192.method3720(class339.field3934, var3, 0);
         if (var4 != -1) {
            class192 var7 = class192.method3720(class339.field3934, var4, 0);
            if (var5 != -1) {
               class192 var8 = class192.method3720(class339.field3934, var5, 0);
               class192[] var9 = new class192[]{var6, var7, var8};
               var6 = new class192(var9, 3);
            } else {
               class192[] var11 = new class192[]{var6, var7};
               var6 = new class192(var11, 2);
            }
         }

         if (!var1 && this.field1840 != 0) {
            var6.method3731(0, this.field1840, 0);
         }

         if (var1 && this.field1816 != 0) {
            var6.method3731(0, this.field1816, 0);
         }

         int var10;
         if (this.field1795 != null) {
            for(var10 = 0; var10 < this.field1795.length; ++var10) {
               var6.method3766(this.field1795[var10], this.field1796[var10]);
            }
         }

         if (this.field1797 != null) {
            for(var10 = 0; var10 < this.field1797.length; ++var10) {
               var6.method3733(this.field1797[var10], this.field1798[var10]);
            }
         }

         return var6;
      }
   }

   void method2982(class156 var1, class156 var2) {
      this.field1794 = var1.field1794;
      this.field1799 = var1.field1799;
      this.field1800 = var1.field1800;
      this.field1821 = var1.field1821;
      this.field1802 = var1.field1802;
      this.field1803 = var1.field1803;
      this.field1804 = var1.field1804;
      this.field1795 = var1.field1795;
      this.field1796 = var1.field1796;
      this.field1797 = var1.field1797;
      this.field1798 = var1.field1798;
      this.field1835 = var2.field1835;
      this.field1807 = var2.field1807;
      this.field1806 = var2.field1806;
      this.field1805 = 1;
   }

   void method2983(class156 var1, class156 var2) {
      this.field1794 = var1.field1794;
      this.field1799 = var1.field1799;
      this.field1800 = var1.field1800;
      this.field1821 = var1.field1821;
      this.field1802 = var1.field1802;
      this.field1803 = var1.field1803;
      this.field1804 = var1.field1804;
      this.field1795 = var2.field1795;
      this.field1796 = var2.field1796;
      this.field1797 = var2.field1797;
      this.field1798 = var2.field1798;
      this.field1835 = var2.field1835;
      this.field1807 = var2.field1807;
      this.field1805 = var2.field1805;
      this.field1811 = var2.field1811;
      this.field1812 = var2.field1812;
      this.field1817 = var2.field1817;
      this.field1814 = var2.field1814;
      this.field1810 = var2.field1810;
      this.field1818 = var2.field1818;
      this.field1815 = var2.field1815;
      this.field1820 = var2.field1820;
      this.field1834 = var2.field1834;
      this.field1822 = var2.field1822;
      this.field1832 = var2.field1832;
      this.field1808 = var2.field1808;
      this.field1809 = new String[5];
      if (var2.field1809 != null) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.field1809[var4] = var2.field1809[var4];
         }
      }

      this.field1809[4] = "Discard";
      this.field1806 = 0;
   }

   void method2984(class156 var1, class156 var2) {
      this.field1794 = var1.field1794;
      this.field1799 = var1.field1799;
      this.field1800 = var1.field1800;
      this.field1821 = var1.field1821;
      this.field1802 = var1.field1802;
      this.field1803 = var1.field1803;
      this.field1804 = var1.field1804;
      this.field1795 = var1.field1795;
      this.field1796 = var1.field1796;
      this.field1797 = var1.field1797;
      this.field1798 = var1.field1798;
      this.field1805 = var1.field1805;
      this.field1835 = var2.field1835;
      this.field1806 = 0;
      this.field1807 = false;
      this.field1833 = false;
   }

   public class156 method2987(int var1) {
      if (this.field1823 != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1824[var4] && this.field1824[var4] != 0) {
               var3 = this.field1823[var4];
            }
         }

         if (var3 != -1) {
            return class10.method105(var3);
         }
      }

      return this;
   }

   public int method2994() {
      if (this.field1791 != -1 && this.field1809 != null) {
         if (this.field1791 >= 0) {
            return this.field1809[this.field1791] != null ? this.field1791 : -1;
         } else {
            return "Drop".equalsIgnoreCase(this.field1809[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   public String method2993(int var1, String var2) {
      class362 var5 = this.field1830;
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

   public int method3034(int var1, int var2) {
      class362 var5 = this.field1830;
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

   static void method3010(class47 var0) {
      if (var0.method1317() != client.field561) {
         client.field561 = var0.method1317();
         class150.method2823(var0.method1317());
      }

      if (var0.field699 != client.field405) {
         class274 var2 = class270.field3535;
         int var3 = var0.field699;
         if ((var3 & 536870912) != 0) {
            class88.field1228 = class117.method2382(var2, "logo_deadman_mode", "");
         } else if ((var3 & 1073741824) != 0) {
            class88.field1228 = class117.method2382(var2, "logo_seasonal_mode", "");
         } else {
            class88.field1228 = class117.method2382(var2, "logo", "");
         }
      }

      class243.field2917 = var0.field700;
      client.field404 = var0.field696;
      client.field405 = var0.field699;
      class169.field1981 = client.field406 == 0 ? '\uaa4a' : var0.field696 + '\u9c40';
      class4.field6 = client.field406 == 0 ? 443 : var0.field696 + '\uc350';
      class290.field3678 = class169.field1981;
   }

   static final void method3004(class248 var0, int var1, byte[] var2, byte[] var3) {
      if (var0.field2987 == null) {
         if (var2 == null) {
            return;
         }

         var0.field2987 = new byte[11][];
         var0.field3033 = new byte[11][];
         var0.field2993 = new int[11];
         var0.field3035 = new int[11];
      }

      var0.field2987[var1] = var2;
      if (var2 != null) {
         var0.field3031 = true;
      } else {
         var0.field3031 = false;

         for(int var5 = 0; var5 < var0.field2987.length; ++var5) {
            if (var0.field2987[var5] != null) {
               var0.field3031 = true;
               break;
            }
         }
      }

      var0.field3033[var1] = var3;
   }

   static int method3026(int var0, class58 var1, boolean var2) {
      if (var0 == 6200) {
         class50.field745 -= 2;
         client.field660 = (short)class281.method5054(class50.field746[class50.field745]);
         if (client.field660 <= 0) {
            client.field660 = 256;
         }

         client.field631 = (short)class281.method5054(class50.field746[class50.field745 + 1]);
         if (client.field631 <= 0) {
            client.field631 = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         class50.field745 -= 2;
         client.field662 = (short)class50.field746[class50.field745];
         if (client.field662 <= 0) {
            client.field662 = 256;
         }

         client.field448 = (short)class50.field746[class50.field745 + 1];
         if (client.field448 <= 0) {
            client.field448 = 320;
         }

         return 1;
      } else if (var0 == 6202) {
         class50.field745 -= 4;
         client.field472 = (short)class50.field746[class50.field745];
         if (client.field472 <= 0) {
            client.field472 = 1;
         }

         client.field542 = (short)class50.field746[class50.field745 + 1];
         if (client.field542 <= 0) {
            client.field542 = 32767;
         } else if (client.field542 < client.field472) {
            client.field542 = client.field472;
         }

         client.field666 = (short)class50.field746[class50.field745 + 2];
         if (client.field666 <= 0) {
            client.field666 = 1;
         }

         client.field667 = (short)class50.field746[class50.field745 + 3];
         if (client.field667 <= 0) {
            client.field667 = 32767;
         } else if (client.field667 < client.field666) {
            client.field667 = client.field666;
         }

         return 1;
      } else if (var0 == 6203) {
         if (client.field579 != null) {
            class50.method1568(0, 0, client.field579.field2972, client.field579.field2989, false);
            class50.field746[++class50.field745 - 1] = client.field670;
            class50.field746[++class50.field745 - 1] = client.field671;
         } else {
            class50.field746[++class50.field745 - 1] = -1;
            class50.field746[++class50.field745 - 1] = -1;
         }

         return 1;
      } else if (var0 == 6204) {
         class50.field746[++class50.field745 - 1] = client.field662;
         class50.field746[++class50.field745 - 1] = client.field448;
         return 1;
      } else if (var0 == 6205) {
         class50.field746[++class50.field745 - 1] = class147.method2778(client.field660);
         class50.field746[++class50.field745 - 1] = class147.method2778(client.field631);
         return 1;
      } else if (var0 == 6220) {
         class50.field746[++class50.field745 - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         class50.field746[++class50.field745 - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         class50.field746[++class50.field745 - 1] = class68.field970;
         return 1;
      } else if (var0 == 6223) {
         class50.field746[++class50.field745 - 1] = client.field686;
         return 1;
      } else {
         return 2;
      }
   }
}
