public class class147 extends class348 {
   public static class222 field1617;
   public static class222 field1620;
   public static class276 field1616;
   public static class276 field1636;
   class362 field1646;
   int field1634;
   int field1637;
   int field1639;
   int field1641;
   int field1647;
   int field1651;
   int[] field1618;
   int[] field1638;
   short[] field1631;
   short[] field1632;
   short[] field1633;
   short[] field1649;
   public boolean field1622;
   public boolean field1640;
   public boolean field1642;
   public boolean field1648;
   public boolean field1650;
   public int field1615;
   public int field1621;
   public int field1623;
   public int field1624;
   public int field1625;
   public int field1626;
   public int field1627;
   public int field1628;
   public int field1629;
   public int field1630;
   public int field1643;
   public int field1644;
   public int[] field1645;
   public String field1619;
   public String[] field1635;

   static {
      field1617 = new class222(64);
      field1620 = new class222(50);
   }

   class147() {
      this.field1619 = "null";
      this.field1621 = 1;
      this.field1624 = -1;
      this.field1625 = -1;
      this.field1623 = -1;
      this.field1627 = -1;
      this.field1628 = -1;
      this.field1629 = -1;
      this.field1630 = -1;
      this.field1635 = new String[5];
      this.field1642 = true;
      this.field1615 = -1;
      this.field1641 = 128;
      this.field1639 = 128;
      this.field1640 = false;
      this.field1651 = 0;
      this.field1637 = 0;
      this.field1643 = -1;
      this.field1644 = 32;
      this.field1634 = -1;
      this.field1647 = -1;
      this.field1648 = true;
      this.field1622 = true;
      this.field1650 = false;
   }

   public final class147 method2759() {
      int var2 = -1;
      if (this.field1634 != -1) {
         var2 = class174.method3506(this.field1634);
      } else if (this.field1647 != -1) {
         var2 = class243.field2910[this.field1647];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field1645.length - 1) {
         var3 = this.field1645[var2];
      } else {
         var3 = this.field1645[this.field1645.length - 1];
      }

      return var3 != -1 ? class96.method2133(var3) : null;
   }

   void method2756(Buffer var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method6560();
         this.field1638 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1638[var5] = var1.method6655();
         }
      } else if (var2 == 2) {
         this.field1619 = var1.method6569();
      } else if (var2 == 12) {
         this.field1621 = var1.method6560();
      } else if (var2 == 13) {
         this.field1624 = var1.method6655();
      } else if (var2 == 14) {
         this.field1627 = var1.method6655();
      } else if (var2 == 15) {
         this.field1625 = var1.method6655();
      } else if (var2 == 16) {
         this.field1623 = var1.method6655();
      } else if (var2 == 17) {
         this.field1627 = var1.method6655();
         this.field1628 = var1.method6655();
         this.field1629 = var1.method6655();
         this.field1630 = var1.method6655();
      } else if (var2 == 18) {
         var1.method6655();
      } else if (var2 >= 30 && var2 < 35) {
         this.field1635[var2 - 30] = var1.method6569();
         if (this.field1635[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field1635[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.method6560();
         this.field1631 = new short[var4];
         this.field1632 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1631[var5] = (short)var1.method6655();
            this.field1632[var5] = (short)var1.method6655();
         }
      } else if (var2 == 41) {
         var4 = var1.method6560();
         this.field1633 = new short[var4];
         this.field1649 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1633[var5] = (short)var1.method6655();
            this.field1649[var5] = (short)var1.method6655();
         }
      } else if (var2 == 60) {
         var4 = var1.method6560();
         this.field1618 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1618[var5] = var1.method6655();
         }
      } else if (var2 == 93) {
         this.field1642 = false;
      } else if (var2 == 95) {
         this.field1615 = var1.method6655();
      } else if (var2 == 97) {
         this.field1641 = var1.method6655();
      } else if (var2 == 98) {
         this.field1639 = var1.method6655();
      } else if (var2 == 99) {
         this.field1640 = true;
      } else if (var2 == 100) {
         this.field1651 = var1.method6561();
      } else if (var2 == 101) {
         this.field1637 = var1.method6561();
      } else if (var2 == 102) {
         this.field1643 = var1.method6655();
      } else if (var2 == 103) {
         this.field1644 = var1.method6655();
      } else if (var2 != 106 && var2 != 118) {
         if (var2 == 107) {
            this.field1648 = false;
         } else if (var2 == 109) {
            this.field1622 = false;
         } else if (var2 == 111) {
            this.field1650 = true;
         } else if (var2 == 249) {
            this.field1646 = class49.method1435(var1, this.field1646);
         }
      } else {
         this.field1634 = var1.method6655();
         if (this.field1634 == 65535) {
            this.field1634 = -1;
         }

         this.field1647 = var1.method6655();
         if (this.field1647 == 65535) {
            this.field1647 = -1;
         }

         var4 = -1;
         if (var2 == 118) {
            var4 = var1.method6655();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         var5 = var1.method6560();
         this.field1645 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field1645[var6] = var1.method6655();
            if (this.field1645[var6] == 65535) {
               this.field1645[var6] = -1;
            }
         }

         this.field1645[var5 + 1] = var4;
      }

   }

   public final class192 method2758() {
      if (this.field1645 != null) {
         class147 var2 = this.method2759();
         return var2 == null ? null : var2.method2758();
      } else if (this.field1618 == null) {
         return null;
      } else {
         boolean var6 = false;

         for(int var3 = 0; var3 < this.field1618.length; ++var3) {
            if (!field1616.method5008(this.field1618[var3], 0)) {
               var6 = true;
            }
         }

         if (var6) {
            return null;
         } else {
            class192[] var7 = new class192[this.field1618.length];

            for(int var4 = 0; var4 < this.field1618.length; ++var4) {
               var7[var4] = class192.method3720(field1616, this.field1618[var4], 0);
            }

            class192 var8;
            if (var7.length == 1) {
               var8 = var7[0];
            } else {
               var8 = new class192(var7, var7.length);
            }

            int var5;
            if (this.field1631 != null) {
               for(var5 = 0; var5 < this.field1631.length; ++var5) {
                  var8.method3766(this.field1631[var5], this.field1632[var5]);
               }
            }

            if (this.field1633 != null) {
               for(var5 = 0; var5 < this.field1633.length; ++var5) {
                  var8.method3733(this.field1633[var5], this.field1649[var5]);
               }
            }

            return var8;
         }
      }
   }

   public final class206 method2779(class158 var1, int var2, class158 var3, int var4) {
      if (this.field1645 != null) {
         class147 var13 = this.method2759();
         return var13 == null ? null : var13.method2779(var1, var2, var3, var4);
      } else {
         class206 var6 = (class206)field1620.method4306((long)this.field1626);
         if (var6 == null) {
            boolean var7 = false;

            for(int var8 = 0; var8 < this.field1638.length; ++var8) {
               if (!field1616.method5008(this.field1638[var8], 0)) {
                  var7 = true;
               }
            }

            if (var7) {
               return null;
            }

            class192[] var9 = new class192[this.field1638.length];

            int var10;
            for(var10 = 0; var10 < this.field1638.length; ++var10) {
               var9[var10] = class192.method3720(field1616, this.field1638[var10], 0);
            }

            class192 var12;
            if (var9.length == 1) {
               var12 = var9[0];
            } else {
               var12 = new class192(var9, var9.length);
            }

            if (this.field1631 != null) {
               for(var10 = 0; var10 < this.field1631.length; ++var10) {
                  var12.method3766(this.field1631[var10], this.field1632[var10]);
               }
            }

            if (this.field1633 != null) {
               for(var10 = 0; var10 < this.field1633.length; ++var10) {
                  var12.method3733(this.field1633[var10], this.field1649[var10]);
               }
            }

            var6 = var12.method3740(this.field1651 + 64, this.field1637 * 5 + 850, -30, -50, -30);
            field1620.method4308(var6, (long)this.field1626);
         }

         class206 var11;
         if (var1 != null && var3 != null) {
            var11 = var1.method3072(var6, var2, var3, var4);
         } else if (var1 != null) {
            var11 = var1.method3084(var6, var2);
         } else if (var3 != null) {
            var11 = var3.method3084(var6, var4);
         } else {
            var11 = var6.method4133(true);
         }

         if (this.field1641 != 128 || this.field1639 != 128) {
            var11.method4153(this.field1641, this.field1639, this.field1641);
         }

         return var11;
      }
   }

   void method2754() {
   }

   void method2757(Buffer var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2756(var1, var3);
      }
   }

   public boolean method2760() {
      if (this.field1645 == null) {
         return true;
      } else {
         int var2 = -1;
         if (this.field1634 != -1) {
            var2 = class174.method3506(this.field1634);
         } else if (this.field1647 != -1) {
            var2 = class243.field2910[this.field1647];
         }

         if (var2 >= 0 && var2 < this.field1645.length) {
            return this.field1645[var2] != -1;
         } else {
            return this.field1645[this.field1645.length - 1] != -1;
         }
      }
   }

   public String method2762(int var1, String var2) {
      class362 var5 = this.field1646;
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

   public int method2763(int var1, int var2) {
      class362 var5 = this.field1646;
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

   static final void method2761(int var0, int var1, int var2, int var3) {
      for(int var5 = 0; var5 < client.field590; ++var5) {
         if (client.field622[var5] + client.field621[var5] > var0 && client.field622[var5] < var0 + var2 && client.field618[var5] + client.field625[var5] > var1 && client.field625[var5] < var3 + var1) {
            client.field617[var5] = true;
         }
      }

   }

   static int method2772(int var0, class58 var1, boolean var2) {
      class248 var4 = class86.method2063(class50.field746[--class50.field745]);
      if (var0 == 2500) {
         class50.field746[++class50.field745 - 1] = var4.field2970;
         return 1;
      } else if (var0 == 2501) {
         class50.field746[++class50.field745 - 1] = var4.field2971;
         return 1;
      } else if (var0 == 2502) {
         class50.field746[++class50.field745 - 1] = var4.field2972;
         return 1;
      } else if (var0 == 2503) {
         class50.field746[++class50.field745 - 1] = var4.field2989;
         return 1;
      } else if (var0 == 2504) {
         class50.field746[++class50.field745 - 1] = var4.field2977 ? 1 : 0;
         return 1;
      } else if (var0 == 2505) {
         class50.field746[++class50.field745 - 1] = var4.field3000;
         return 1;
      } else {
         return 2;
      }
   }

   static int method2778(int var0) {
      return (int)((Math.log((double)var0) / class50.field756 - 7.0D) * 256.0D);
   }
}
