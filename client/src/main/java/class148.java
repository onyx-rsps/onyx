public class class148 extends class349 {
   public static class223 field1618;
   public static class223 field1621;
   public static class277 field1617;
   public static class277 field1637;
   class363 field1647;
   int field1635;
   int field1638;
   int field1640;
   int field1642;
   int field1648;
   int field1652;
   int[] field1619;
   int[] field1639;
   short[] field1632;
   short[] field1633;
   short[] field1634;
   short[] field1650;
   public boolean field1623;
   public boolean field1641;
   public boolean field1643;
   public boolean field1649;
   public boolean field1651;
   public int field1616;
   public int field1622;
   public int field1624;
   public int field1625;
   public int field1626;
   public int field1627;
   public int field1628;
   public int field1629;
   public int field1630;
   public int field1631;
   public int field1644;
   public int field1645;
   public int[] field1646;
   public String field1620;
   public String[] field1636;

   static {
      field1618 = new class223(64);
      field1621 = new class223(50);
   }

   class148() {
      this.field1620 = class270.field3234;
      this.field1622 = 1;
      this.field1625 = -1;
      this.field1626 = -1;
      this.field1624 = -1;
      this.field1628 = -1;
      this.field1629 = -1;
      this.field1630 = -1;
      this.field1631 = -1;
      this.field1636 = new String[5];
      this.field1643 = true;
      this.field1616 = -1;
      this.field1642 = 128;
      this.field1640 = 128;
      this.field1641 = false;
      this.field1652 = 0;
      this.field1638 = 0;
      this.field1644 = -1;
      this.field1645 = 32;
      this.field1635 = -1;
      this.field1648 = -1;
      this.field1649 = true;
      this.field1623 = true;
      this.field1651 = false;
   }

   void method2466() {
   }

   void method2469(Buffer var1) {
      while(true) {
         int var3 = var1.method5948();
         if (0 == var3) {
            return;
         }

         this.method2468(var1, var3);
      }
   }

   void method2468(Buffer var1, int var2) {
      int var4;
      int var5;
      if (1 == var2) {
         var4 = var1.method5948();
         this.field1639 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1639[var5] = var1.readUnsignedShort();
         }
      } else if (var2 == 2) {
         this.field1620 = var1.method5957();
      } else if (var2 == 12) {
         this.field1622 = var1.method5948();
      } else if (var2 == 13) {
         this.field1625 = var1.readUnsignedShort();
      } else if (14 == var2) {
         this.field1628 = var1.readUnsignedShort();
      } else if (var2 == 15) {
         this.field1626 = var1.readUnsignedShort();
      } else if (16 == var2) {
         this.field1624 = var1.readUnsignedShort();
      } else if (var2 == 17) {
         this.field1628 = var1.readUnsignedShort();
         this.field1629 = var1.readUnsignedShort();
         this.field1630 = var1.readUnsignedShort();
         this.field1631 = var1.readUnsignedShort();
      } else if (18 == var2) {
         var1.readUnsignedShort();
      } else if (var2 >= 30 && var2 < 35) {
         this.field1636[var2 - 30] = var1.method5957();
         if (this.field1636[var2 - 30].equalsIgnoreCase(class270.field3525)) {
            this.field1636[var2 - 30] = null;
         }
      } else if (40 == var2) {
         var4 = var1.method5948();
         this.field1632 = new short[var4];
         this.field1633 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1632[var5] = (short)var1.readUnsignedShort();
            this.field1633[var5] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 41) {
         var4 = var1.method5948();
         this.field1634 = new short[var4];
         this.field1650 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1634[var5] = (short)var1.readUnsignedShort();
            this.field1650[var5] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 60) {
         var4 = var1.method5948();
         this.field1619 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1619[var5] = var1.readUnsignedShort();
         }
      } else if (var2 == 93) {
         this.field1643 = false;
      } else if (var2 == 95) {
         this.field1616 = var1.readUnsignedShort();
      } else if (97 == var2) {
         this.field1642 = var1.readUnsignedShort();
      } else if (98 == var2) {
         this.field1640 = var1.readUnsignedShort();
      } else if (99 == var2) {
         this.field1641 = true;
      } else if (var2 == 100) {
         this.field1652 = var1.method5949();
      } else if (var2 == 101) {
         this.field1638 = var1.method5949() * 5;
      } else if (var2 == 102) {
         this.field1644 = var1.readUnsignedShort();
      } else if (103 == var2) {
         this.field1645 = var1.readUnsignedShort();
      } else if (var2 != 106 && var2 != 118) {
         if (107 == var2) {
            this.field1649 = false;
         } else if (var2 == 109) {
            this.field1623 = false;
         } else if (111 == var2) {
            this.field1651 = true;
         } else if (249 == var2) {
            this.field1647 = class50.method1392(var1, this.field1647);
         }
      } else {
         this.field1635 = var1.readUnsignedShort();
         if (this.field1635 == 65535) {
            this.field1635 = -1;
         }

         this.field1648 = var1.readUnsignedShort();
         if (65535 == this.field1648) {
            this.field1648 = -1;
         }

         var4 = -1;
         if (118 == var2) {
            var4 = var1.readUnsignedShort();
            if (65535 == var4) {
               var4 = -1;
            }
         }

         var5 = var1.method5948();
         this.field1646 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field1646[var6] = var1.readUnsignedShort();
            if (65535 == this.field1646[var6]) {
               this.field1646[var6] = -1;
            }
         }

         this.field1646[1 + var5] = var4;
      }

   }

   public final class207 method2491(class159 var1, int var2, class159 var3, int var4) {
      if (this.field1646 != null) {
         class148 var12 = this.method2471();
         return var12 == null ? null : var12.method2491(var1, var2, var3, var4);
      } else {
         class207 var6 = (class207)field1621.method3880((long)this.field1627);
         if (var6 == null) {
            boolean var7 = false;

            for(int var8 = 0; var8 < this.field1639.length; ++var8) {
               if (!field1617.method4500(this.field1639[var8], 0)) {
                  var7 = true;
               }
            }

            if (var7) {
               return null;
            }

            class193[] var9 = new class193[this.field1639.length];

            int var10;
            for(var10 = 0; var10 < this.field1639.length; ++var10) {
               var9[var10] = class193.method3316(field1617, this.field1639[var10], 0);
            }

            class193 var13;
            if (1 == var9.length) {
               var13 = var9[0];
            } else {
               var13 = new class193(var9, var9.length);
            }

            if (this.field1632 != null) {
               for(var10 = 0; var10 < this.field1632.length; ++var10) {
                  var13.method3362(this.field1632[var10], this.field1633[var10]);
               }
            }

            if (this.field1634 != null) {
               for(var10 = 0; var10 < this.field1634.length; ++var10) {
                  var13.method3329(this.field1634[var10], this.field1650[var10]);
               }
            }

            var6 = var13.method3336(this.field1652 + 64, 850 + this.field1638, -30, -50, -30);
            field1621.method3882(var6, (long)this.field1627);
         }

         class207 var11;
         if (var1 != null && var3 != null) {
            var11 = var1.method2779(var6, var2, var3, var4);
         } else if (var1 != null) {
            var11 = var1.method2791(var6, var2);
         } else if (var3 != null) {
            var11 = var3.method2791(var6, var4);
         } else {
            var11 = var6.method3717(true);
         }

         if (128 != this.field1642 || 128 != this.field1640) {
            var11.method3736(this.field1642, this.field1640, this.field1642);
         }

         return var11;
      }
   }

   public final class193 method2470() {
      if (this.field1646 != null) {
         class148 var6 = this.method2471();
         return var6 == null ? null : var6.method2470();
      } else if (null == this.field1619) {
         return null;
      } else {
         boolean var2 = false;

         for(int var3 = 0; var3 < this.field1619.length; ++var3) {
            if (!field1617.method4500(this.field1619[var3], 0)) {
               var2 = true;
            }
         }

         if (var2) {
            return null;
         } else {
            class193[] var7 = new class193[this.field1619.length];

            for(int var4 = 0; var4 < this.field1619.length; ++var4) {
               var7[var4] = class193.method3316(field1617, this.field1619[var4], 0);
            }

            class193 var8;
            if (var7.length == 1) {
               var8 = var7[0];
            } else {
               var8 = new class193(var7, var7.length);
            }

            int var5;
            if (null != this.field1632) {
               for(var5 = 0; var5 < this.field1632.length; ++var5) {
                  var8.method3362(this.field1632[var5], this.field1633[var5]);
               }
            }

            if (null != this.field1634) {
               for(var5 = 0; var5 < this.field1634.length; ++var5) {
                  var8.method3329(this.field1634[var5], this.field1650[var5]);
               }
            }

            return var8;
         }
      }
   }

   public final class148 method2471() {
      int var2 = -1;
      if (-1 != this.field1635) {
         var2 = class175.method3139(this.field1635);
      } else if (this.field1648 != -1) {
         var2 = class244.field2911[this.field1648];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field1646.length - 1) {
         var3 = this.field1646[var2];
      } else {
         var3 = this.field1646[this.field1646.length - 1];
      }

      return -1 != var3 ? class97.method2065(var3) : null;
   }

   public boolean method2472() {
      if (this.field1646 == null) {
         return true;
      } else {
         int var2 = -1;
         if (-1 != this.field1635) {
            var2 = class175.method3139(this.field1635);
         } else if (this.field1648 != -1) {
            var2 = class244.field2911[this.field1648];
         }

         if (var2 >= 0 && var2 < this.field1646.length) {
            return this.field1646[var2] != -1;
         } else {
            return -1 != this.field1646[this.field1646.length - 1];
         }
      }
   }

   public int method2475(int var1, int var2) {
      class363 var5 = this.field1647;
      int var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class353 var6 = (class353)var5.method5716((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = var6.field3964;
         }
      }

      return var4;
   }

   public String method2474(int var1, String var2) {
      class363 var5 = this.field1647;
      String var4;
      if (null == var5) {
         var4 = var2;
      } else {
         class350 var6 = (class350)var5.method5716((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field3961;
         }
      }

      return var4;
   }

   static int method2484(int var0, class59 var1, boolean var2) {
      class249 var4 = Clock.method1995(class51.field747[--class51.field746]);
      if (2500 == var0) {
         class51.field747[++class51.field746 - 1] = var4.field2971;
         return 1;
      } else if (var0 == 2501) {
         class51.field747[++class51.field746 - 1] = var4.field2972;
         return 1;
      } else if (2502 == var0) {
         class51.field747[++class51.field746 - 1] = var4.field2973;
         return 1;
      } else if (2503 == var0) {
         class51.field747[++class51.field746 - 1] = var4.field2990;
         return 1;
      } else if (2504 == var0) {
         class51.field747[++class51.field746 - 1] = var4.field2978 ? 1 : 0;
         return 1;
      } else if (2505 == var0) {
         class51.field747[++class51.field746 - 1] = var4.field3001;
         return 1;
      } else {
         return 2;
      }
   }

   static int method2490(int var0) {
      return (int)((Math.log((double)var0) / class51.field757 - 7.0D) * 256.0D);
   }

   static final void method2473(int var0, int var1, int var2, int var3) {
      for(int var5 = 0; var5 < client.field591; ++var5) {
         if (client.field623[var5] + client.field622[var5] > var0 && client.field623[var5] < var2 + var0 && client.field619[var5] + client.field626[var5] > var1 && client.field626[var5] < var3 + var1) {
            client.field618[var5] = true;
         }
      }

   }
}
