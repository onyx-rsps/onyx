public abstract class class185 {
   int field2108;
   int field2111;
   public final class244 field2109;
   public final class244 field2110;

   class185(class244 var1, class244 var2) {
      this.field2110 = var1;
      this.field2109 = var2;
   }

   abstract class180 vmethod3613();

   boolean method3617(int var1, int var2) {
      if (!this.method3616()) {
         return false;
      } else {
         class140 var4 = class72.method1825(this.vmethod3612());
         int var5 = this.vmethod3631();
         int var6 = this.vmethod3615();
         switch(var4.field1539.field1610) {
         case 0:
            if (var1 < this.field2111 - var5 / 2 || var1 > var5 / 2 + this.field2111) {
               return false;
            }
            break;
         case 1:
            if (var1 < this.field2111 || var1 >= var5 + this.field2111) {
               return false;
            }
            break;
         case 2:
            if (var1 <= this.field2111 - var5 || var1 > this.field2111) {
               return false;
            }
         }

         switch(var4.field1549.field1657) {
         case 0:
            if (var2 >= this.field2108 - var6 / 2 && var2 <= var6 / 2 + this.field2108) {
               break;
            }

            return false;
         case 1:
            if (var2 > this.field2108 - var6 && var2 <= this.field2108) {
               break;
            }

            return false;
         case 2:
            if (var2 < this.field2108 || var2 >= var6 + this.field2108) {
               return false;
            }
         }

         return true;
      }
   }

   boolean method3616() {
      return this.vmethod3612() >= 0;
   }

   public abstract int vmethod3612();

   boolean method3638(int var1, int var2) {
      class180 var4 = this.vmethod3613();
      if (var4 == null) {
         return false;
      } else if (var1 >= this.field2111 - var4.field2078 / 2 && var1 <= var4.field2078 / 2 + this.field2111) {
         return var2 >= this.field2108 && var2 <= this.field2108 + var4.field2084;
      } else {
         return false;
      }
   }

   abstract int vmethod3631();

   abstract int vmethod3615();

   boolean method3610(int var1, int var2) {
      if (this.method3617(var1, var2)) {
         return true;
      } else {
         return this.method3638(var1, var2);
      }
   }

   static final boolean method3641(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (class267.method4842(var0)) {
         return true;
      } else {
         char[] var2 = class367.field4124;

         int var3;
         char var4;
         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            if (var0 == var4) {
               return true;
            }
         }

         var2 = class367.field4126;

         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            if (var0 == var4) {
               return true;
            }
         }

         return false;
      }
   }

   static void method3644() {
      int var18;
      if (client.field410 == 0) {
         class165.field1924 = new class199(4, 104, 104, class61.field910);

         for(var18 = 0; var18 < 4; ++var18) {
            client.field464[var18] = new class159(104, 104);
         }

         class376.field4166 = new class397(512, 512);
         class55.field806 = "Starting game engine...";
         class55.field805 = 5;
         client.field410 = 20;
      } else if (client.field410 == 20) {
         class55.field806 = "Prepared visibility map";
         class55.field805 = 10;
         client.field410 = 30;
      } else if (client.field410 == 30) {
         class120.field1416 = class91.method2103(0, false, true, true);
         class291.field3692 = class91.method2103(1, false, true, true);
         class191.field2148 = class91.method2103(2, true, false, true);
         class37.field306 = class91.method2103(3, false, true, true);
         class138.field1520 = class91.method2103(4, false, true, true);
         class198.field2276 = class91.method2103(5, true, true, true);
         class108.field1325 = class91.method2103(6, true, true, true);
         class74.field1106 = class91.method2103(7, false, true, true);
         class270.field3535 = class91.method2103(8, false, true, true);
         class126.field1453 = class91.method2103(9, false, true, true);
         class105.field1300 = class91.method2103(10, false, true, true);
         class339.field3937 = class91.method2103(11, false, true, true);
         class45.field390 = class91.method2103(12, false, true, true);
         class123.field1439 = class91.method2103(13, true, false, true);
         class191.field2138 = class91.method2103(14, false, true, true);
         class61.field916 = class91.method2103(15, false, true, true);
         class18.field95 = class91.method2103(17, true, true, true);
         class15.field84 = class91.method2103(18, false, true, true);
         class37.field301 = class91.method2103(19, false, true, true);
         class322.field3847 = class91.method2103(20, false, true, true);
         class55.field806 = "Connecting to update server";
         class55.field805 = 20;
         client.field410 = 40;
      } else if (client.field410 != 40) {
         class274 var2;
         class274 var3;
         class274 var4;
         if (client.field410 == 45) {
            class63.method1713(22050, !client.field408, 2);
            class235 var24 = new class235();
            var24.method4408(9, 128);
            class178.field2069 = class133.method2566(class18.field100, 0, 22050);
            class178.field2069.method466(var24);
            var2 = class61.field916;
            var3 = class191.field2138;
            var4 = class138.field1520;
            class234.field2817 = var2;
            class234.field2814 = var3;
            class234.field2816 = var4;
            class234.field2815 = var24;
            class141.field1559 = class133.method2566(class18.field100, 1, 2048);
            class81.field1162 = new class20();
            class141.field1559.method466(class81.field1162);
            class157.field1841 = new class37(22050, class281.field3633);
            class55.field806 = "Prepared sound engine";
            class55.field805 = 35;
            client.field410 = 50;
            class226.field2601 = new class359(class270.field3535, class123.field1439);
         } else {
            int var13;
            if (client.field410 == 50) {
               class360[] var23 = new class360[]{class360.field4085, class360.field4092, class360.field4086, class360.field4084, class360.field4095, class360.field4087};
               var13 = var23.length;
               class359 var19 = class226.field2601;
               class360[] var20 = new class360[]{class360.field4085, class360.field4092, class360.field4086, class360.field4084, class360.field4095, class360.field4087};
               client.field494 = var19.method6275(var20);
               if (client.field494.size() < var13) {
                  class55.field806 = "Loading fonts - " + client.field494.size() * 100 / var13 + "%";
                  class55.field805 = 40;
               } else {
                  class46.field397 = (class301)client.field494.get(class360.field4084);
                  class257.field3164 = (class301)client.field494.get(class360.field4092);
                  class129.field1467 = (class301)client.field494.get(class360.field4085);
                  class229.field2788 = client.field558.vmethod6044();
                  class55.field806 = "Loaded fonts";
                  class55.field805 = 40;
                  client.field410 = 60;
               }
            } else {
               int var14;
               if (client.field410 == 60) {
                  var2 = class105.field1300;
                  var3 = class270.field3535;
                  var14 = 0;
                  if (var2.method4976("title.jpg", "")) {
                     ++var14;
                  }

                  if (var3.method4976("logo", "")) {
                     ++var14;
                  }

                  if (var3.method4976("logo_deadman_mode", "")) {
                     ++var14;
                  }

                  if (var3.method4976("logo_seasonal_mode", "")) {
                     ++var14;
                  }

                  if (var3.method4976("titlebox", "")) {
                     ++var14;
                  }

                  if (var3.method4976("titlebutton", "")) {
                     ++var14;
                  }

                  if (var3.method4976("runes", "")) {
                     ++var14;
                  }

                  if (var3.method4976("title_mute", "")) {
                     ++var14;
                  }

                  if (var3.method4976("options_radio_buttons,0", "")) {
                     ++var14;
                  }

                  if (var3.method4976("options_radio_buttons,2", "")) {
                     ++var14;
                  }

                  if (var3.method4976("options_radio_buttons,4", "")) {
                     ++var14;
                  }

                  if (var3.method4976("options_radio_buttons,6", "")) {
                     ++var14;
                  }

                  var3.method4976("sl_back", "");
                  var3.method4976("sl_flags", "");
                  var3.method4976("sl_arrows", "");
                  var3.method4976("sl_stars", "");
                  var3.method4976("sl_button", "");
                  byte var21 = 12;
                  if (var14 < var21) {
                     class55.field806 = "Loading title screen - " + var14 * 100 / var21 + "%";
                     class55.field805 = 50;
                  } else {
                     class55.field806 = "Loaded title screen";
                     class55.field805 = 50;
                     class16.method163(5);
                     client.field410 = 70;
                  }
               } else if (client.field410 == 70) {
                  if (!class191.field2148.method4925()) {
                     class55.field806 = "Loading config - " + class191.field2148.method4888() + "%";
                     class55.field805 = 60;
                  } else {
                     class274 var22 = class191.field2148;
                     class157.field1854 = var22;
                     class56.method1634(class191.field2148);
                     var2 = class191.field2148;
                     var3 = class74.field1106;
                     class142.field1564 = var2;
                     class75.field1119 = var3;
                     class142.field1563 = class142.field1564.method4946(3);
                     class110.method2250(class191.field2148, class74.field1106, client.field408);
                     var4 = class191.field2148;
                     class274 var15 = class74.field1106;
                     class147.field1636 = var4;
                     class147.field1616 = var15;
                     class274 var16 = class191.field2148;
                     class153.field1702 = var16;
                     method3646(class191.field2148, class74.field1106, client.field561, class46.field397);
                     class274 var7 = class191.field2148;
                     class274 var8 = class120.field1416;
                     class274 var9 = class291.field3692;
                     class158.field1874 = var7;
                     class158.field1858 = var8;
                     class158.field1870 = var9;
                     class87.method2073(class191.field2148, class74.field1106);
                     class48.method1384(class191.field2148);
                     class47.method1335(class191.field2148);
                     class137.method2617(class37.field306, class74.field1106, class270.field3535, class123.field1439);
                     class78.method1901(class191.field2148);
                     class274 var10 = class191.field2148;
                     class145.field1600 = var10;
                     class274 var11 = class191.field2148;
                     class141.field1560 = var11;
                     class330.method5869(class191.field2148);
                     class99.field1271 = new class371(class68.field975, 54, class283.field3643, class191.field2148);
                     class286.field3663 = new class371(class68.field975, 47, class283.field3643, class191.field2148);
                     class37.field310 = new class83();
                     class292.method5170(class191.field2148, class270.field3535, class123.field1439);
                     class292.method5156(class191.field2148, class270.field3535);
                     class370.method6412(class191.field2148, class270.field3535);
                     class55.field806 = "Loaded config";
                     class55.field805 = 60;
                     client.field410 = 80;
                  }
               } else if (client.field410 == 80) {
                  var18 = 0;
                  if (class49.field735 == null) {
                     class49.field735 = class207.method4246(class270.field3535, class188.field2121.field3916, 0);
                  } else {
                     ++var18;
                  }

                  if (class144.field1593 == null) {
                     class144.field1593 = class207.method4246(class270.field3535, class188.field2121.field3915, 0);
                  } else {
                     ++var18;
                  }

                  if (class275.field3574 == null) {
                     class275.field3574 = class132.method2560(class270.field3535, class188.field2121.field3909, 0);
                  } else {
                     ++var18;
                  }

                  if (class88.field1229 == null) {
                     class88.field1229 = class71.method1816(class270.field3535, class188.field2121.field3907, 0);
                  } else {
                     ++var18;
                  }

                  if (class265.field3210 == null) {
                     class265.field3210 = class71.method1816(class270.field3535, class188.field2121.field3910, 0);
                  } else {
                     ++var18;
                  }

                  if (class149.field1676 == null) {
                     class149.field1676 = class71.method1816(class270.field3535, class188.field2121.field3912, 0);
                  } else {
                     ++var18;
                  }

                  if (class150.field1678 == null) {
                     class150.field1678 = class71.method1816(class270.field3535, class188.field2121.field3908, 0);
                  } else {
                     ++var18;
                  }

                  if (class83.field1189 == null) {
                     class83.field1189 = class71.method1816(class270.field3535, class188.field2121.field3914, 0);
                  } else {
                     ++var18;
                  }

                  if (class126.field1451 == null) {
                     class126.field1451 = class71.method1816(class270.field3535, class188.field2121.field3913, 0);
                  } else {
                     ++var18;
                  }

                  if (class44.field385 == null) {
                     class44.field385 = class132.method2560(class270.field3535, class188.field2121.field3911, 0);
                  } else {
                     ++var18;
                  }

                  if (class249.field3106 == null) {
                     class249.field3106 = class132.method2560(class270.field3535, class188.field2121.field3917, 0);
                  } else {
                     ++var18;
                  }

                  if (var18 < 11) {
                     class55.field806 = "Loading sprites - " + var18 * 100 / 12 + "%";
                     class55.field805 = 70;
                  } else {
                     class302.field3740 = class249.field3106;
                     class144.field1593.method6991();
                     var13 = (int)(Math.random() * 21.0D) - 10;
                     int var17 = (int)(Math.random() * 21.0D) - 10;
                     var14 = (int)(Math.random() * 21.0D) - 10;
                     int var5 = (int)(Math.random() * 41.0D) - 20;
                     class275.field3574[0].method6971(var5 + var13, var5 + var17, var14 + var5);
                     class55.field806 = "Loaded sprites";
                     class55.field805 = 70;
                     client.field410 = 90;
                  }
               } else if (client.field410 == 90) {
                  if (!class126.field1453.method4925()) {
                     class55.field806 = "Loading textures - " + "0%";
                     class55.field805 = 90;
                  } else {
                     class179.field2076 = new class204(class126.field1453, class270.field3535, 20, class37.field307.field1117, client.field408 ? 64 : 128);
                     class197.method3823(class179.field2076);
                     class197.method3824(class37.field307.field1117);
                     client.field410 = 100;
                  }
               } else if (client.field410 == 100) {
                  var18 = class179.field2076.method4104();
                  if (var18 < 100) {
                     class55.field806 = "Loading textures - " + var18 + "%";
                     class55.field805 = 90;
                  } else {
                     class55.field806 = "Loaded textures";
                     class55.field805 = 90;
                     client.field410 = 110;
                  }
               } else if (client.field410 == 110) {
                  class6.field13 = new class68();
                  class18.field100.method2512(class6.field13, 10);
                  class55.field806 = "Loaded input handler";
                  class55.field805 = 92;
                  client.field410 = 120;
               } else if (client.field410 == 120) {
                  if (!class105.field1300.method4976("huffman", "")) {
                     class55.field806 = "Loading wordpack - " + 0 + "%";
                     class55.field805 = 94;
                  } else {
                     class250 var12 = new class250(class105.field1300.method4940("huffman", ""));
                     class101.method2161(var12);
                     class55.field806 = "Loaded wordpack";
                     class55.field805 = 94;
                     client.field410 = 130;
                  }
               } else if (client.field410 == 130) {
                  if (!class37.field306.method4925()) {
                     class55.field806 = "Loading interfaces - " + class37.field306.method4888() * 4 / 5 + "%";
                     class55.field805 = 96;
                  } else if (!class45.field390.method4925()) {
                     class55.field806 = "Loading interfaces - " + (80 + class45.field390.method4888() / 6) + "%";
                     class55.field805 = 96;
                  } else if (!class123.field1439.method4925()) {
                     class55.field806 = "Loading interfaces - " + (96 + class123.field1439.method4888() / 50) + "%";
                     class55.field805 = 96;
                  } else {
                     class55.field806 = "Loaded interfaces";
                     class55.field805 = 98;
                     client.field410 = 140;
                  }
               } else if (client.field410 == 140) {
                  class55.field805 = 100;
                  if (!class37.field301.method4942(class186.field2117.field2113)) {
                     class55.field806 = "Loading world map - " + class37.field301.method4944(class186.field2117.field2113) / 10 + "%";
                  } else {
                     if (class24.field201 == null) {
                        class24.field201 = new class358();
                        class24.field201.method6125(class37.field301, class15.field84, class322.field3847, class129.field1467, client.field494, class275.field3574);
                     }

                     class55.field806 = "Loaded world map";
                     client.field410 = 150;
                  }
               } else if (client.field410 == 150) {
                  class16.method163(10);
               }
            }
         }
      } else {
         byte var1 = 0;
         var18 = var1 + class120.field1416.method4914() * 4 / 100;
         var18 += class291.field3692.method4914() * 4 / 100;
         var18 += class191.field2148.method4914() * 2 / 100;
         var18 += class37.field306.method4914() * 2 / 100;
         var18 += class138.field1520.method4914() * 6 / 100;
         var18 += class198.field2276.method4914() * 4 / 100;
         var18 += class108.field1325.method4914() * 2 / 100;
         var18 += class74.field1106.method4914() * 56 / 100;
         var18 += class270.field3535.method4914() * 2 / 100;
         var18 += class126.field1453.method4914() * 2 / 100;
         var18 += class105.field1300.method4914() * 2 / 100;
         var18 += class339.field3937.method4914() * 2 / 100;
         var18 += class45.field390.method4914() * 2 / 100;
         var18 += class123.field1439.method4914() * 2 / 100;
         var18 += class191.field2138.method4914() * 2 / 100;
         var18 += class61.field916.method4914() * 2 / 100;
         var18 += class37.field301.method4914() / 100;
         var18 += class15.field84.method4914() / 100;
         var18 += class322.field3847.method4914() / 100;
         var18 += class18.field95.method4877() && class18.field95.method4925() ? 1 : 0;
         if (var18 != 100) {
            if (var18 != 0) {
               class55.field806 = "Checking for updates - " + var18 + "%";
            }

            class55.field805 = 30;
         } else {
            class88.method2075(class120.field1416, "Animations");
            class88.method2075(class291.field3692, "Skeletons");
            class88.method2075(class138.field1520, "Sound FX");
            class88.method2075(class198.field2276, "Maps");
            class88.method2075(class108.field1325, "Music Tracks");
            class88.method2075(class74.field1106, "Models");
            class88.method2075(class270.field3535, "Sprites");
            class88.method2075(class339.field3937, "Music Jingles");
            class88.method2075(class191.field2138, "Music Samples");
            class88.method2075(class61.field916, "Music Patches");
            class88.method2075(class37.field301, "World Map");
            class88.method2075(class15.field84, "World Map Geography");
            class88.method2075(class322.field3847, "World Map Ground");
            class188.field2121 = new class335();
            class188.field2121.method5931(class18.field95);
            class55.field806 = "Loaded update list";
            class55.field805 = 30;
            client.field410 = 45;
         }
      }
   }

   static final void method3623(int var0, int var1, int var2, int var3) {
      ++client.field504;
      if (class19.field139.field1068 >> 7 == client.field643 && class19.field139.field1058 >> 7 == client.field596) {
         client.field643 = 0;
      }

      class88.method2081();
      if (client.field534 >= 0 && client.field523[client.field534] != null) {
         class45.method883(client.field523[client.field534], false);
      }

      class123.method2464(true);
      int var5 = class82.field1171;
      int[] var6 = class82.field1177;

      int var7;
      for(var7 = 0; var7 < var5; ++var7) {
         if (var6[var7] != client.field534 && var6[var7] != client.field664) {
            class45.method883(client.field523[var6[var7]], true);
         }
      }

      class123.method2464(false);
      class64.method1725();
      class52.method1585();
      class50.method1568(var0, var1, var2, var3, true);
      var0 = client.field668;
      var1 = client.field478;
      var2 = client.field670;
      var3 = client.field671;
      class393.method6894(var0, var1, var0 + var2, var3 + var1);
      class197.method3819();
      int var8;
      int var9;
      int var10;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var19;
      int var20;
      int var29;
      if (!client.field614) {
         var5 = client.field475;
         if (client.field492 / 256 > var5) {
            var5 = client.field492 / 256;
         }

         if (client.field655[4] && client.field608[4] + 128 > var5) {
            var5 = client.field608[4] + 128;
         }

         var29 = client.field444 & 2047;
         var7 = class10.field65;
         var8 = class270.field3532;
         var9 = class272.field3552;
         var10 = var5 * 3 + 600;
         var13 = var3 - 334;
         if (var13 < 0) {
            var13 = 0;
         } else if (var13 > 100) {
            var13 = 100;
         }

         var14 = (client.field448 - client.field662) * var13 / 100 + client.field662;
         var12 = var14 * var10 / 256;
         var13 = 2048 - var5 & 2047;
         var14 = 2048 - var29 & 2047;
         var15 = 0;
         var16 = 0;
         var17 = var12;
         int var18;
         if (var13 != 0) {
            var18 = class197.field2265[var13];
            var19 = class197.field2272[var13];
            var20 = var16 * var19 - var12 * var18 >> 16;
            var17 = var16 * var18 + var12 * var19 >> 16;
            var16 = var20;
         }

         if (var14 != 0) {
            var18 = class197.field2265[var14];
            var19 = class197.field2272[var14];
            var20 = var18 * var17 + var15 * var19 >> 16;
            var17 = var17 * var19 - var18 * var15 >> 16;
            var15 = var20;
         }

         class64.field933 = var7 - var15;
         class336.field3923 = var8 - var16;
         class357.field4011 = var9 - var17;
         class116.field1397 = var5;
         class117.field1399 = var29;
         if (client.field481 == 1 && client.field576 >= 2 && client.field451 % 50 == 0 && (class10.field65 >> 7 != class19.field139.field1068 >> 7 || class272.field3552 >> 7 != class19.field139.field1058 >> 7)) {
            var18 = class19.field139.field998;
            var19 = (class10.field65 >> 7) + class280.field3624;
            var20 = (class272.field3552 >> 7) + class77.field1133;
            class342.method5996(var19, var20, var18, true);
         }
      }

      if (!client.field614) {
         var5 = class88.method2082();
      } else {
         var5 = class191.method3718();
      }

      var29 = class64.field933;
      var7 = class336.field3923;
      var8 = class357.field4011;
      var9 = class116.field1397;
      var10 = class117.field1399;

      int var11;
      for(var11 = 0; var11 < 5; ++var11) {
         if (client.field655[var11]) {
            var12 = (int)(Math.random() * (double)(client.field436[var11] * 2 + 1) - (double)client.field436[var11] + Math.sin((double)client.field658[var11] / 100.0D * (double)client.field659[var11]) * (double)client.field608[var11]);
            if (var11 == 0) {
               class64.field933 += var12;
            }

            if (var11 == 1) {
               class336.field3923 += var12;
            }

            if (var11 == 2) {
               class357.field4011 += var12;
            }

            if (var11 == 3) {
               class117.field1399 = var12 + class117.field1399 & 2047;
            }

            if (var11 == 4) {
               class116.field1397 += var12;
               if (class116.field1397 < 128) {
                  class116.field1397 = 128;
               }

               if (class116.field1397 > 383) {
                  class116.field1397 = 383;
               }
            }
         }
      }

      var11 = class19.field141;
      var12 = class19.field144;
      if (class19.field148 != 0) {
         var11 = class19.field149;
         var12 = class19.field150;
      }

      if (var11 >= var0 && var11 < var0 + var2 && var12 >= var1 && var12 < var3 + var1) {
         var13 = var11 - var0;
         var14 = var12 - var1;
         class207.field2487 = var13;
         class207.field2475 = var14;
         class207.field2489 = true;
         class207.field2483 = 0;
         class207.field2476 = false;
      } else {
         class64.method1715();
      }

      class262.method4817();
      class393.method6880(var0, var1, var2, var3, 0);
      class262.method4817();
      var13 = class197.field2261;
      class197.field2261 = client.field594;
      class165.field1924.method4019(class64.field933, class336.field3923, class357.field4011, class116.field1397, class117.field1399, var5);
      class197.field2261 = var13;
      class262.method4817();
      class165.field1924.method3991();
      client.field649 = 0;
      boolean var33 = false;
      var15 = -1;
      var16 = -1;
      var17 = class82.field1171;
      int[] var30 = class82.field1177;

      for(var19 = 0; var19 < var17 + client.field684; ++var19) {
         Object var31;
         if (var19 < var17) {
            var31 = client.field523[var30[var19]];
            if (var30[var19] == client.field534) {
               var33 = true;
               var15 = var19;
               continue;
            }

            if (var31 == class19.field139) {
               var16 = var19;
               continue;
            }
         } else {
            var31 = client.field566[client.field449[var19 - var17]];
         }

         class208.method4247((class71)var31, var19, var0, var1, var2, var3);
      }

      if (client.field526 && var16 != -1) {
         class208.method4247(class19.field139, var16, var0, var1, var2, var3);
      }

      if (var33) {
         class208.method4247(client.field523[client.field534], var15, var0, var1, var2, var3);
      }

      for(var19 = 0; var19 < client.field649; ++var19) {
         var20 = client.field495[var19];
         int var21 = client.field496[var19];
         int var22 = client.field498[var19];
         int var23 = client.field441[var19];
         boolean var24 = true;

         while(var24) {
            var24 = false;

            for(int var25 = 0; var25 < var19; ++var25) {
               if (var21 + 2 > client.field496[var25] - client.field441[var25] && var21 - var23 < client.field496[var25] + 2 && var20 - var22 < client.field498[var25] + client.field495[var25] && var20 + var22 > client.field495[var25] - client.field498[var25] && client.field496[var25] - client.field441[var25] < var21) {
                  var21 = client.field496[var25] - client.field441[var25];
                  var24 = true;
               }
            }
         }

         client.field505 = client.field495[var19] * -286331153;
         client.field506 = client.field496[var19] = var21;
         String var32 = client.field502[var19];
         if (client.field571 == 0) {
            int var26 = 16776960;
            if (client.field499[var19] < 6) {
               var26 = client.field626[client.field499[var19]];
            }

            if (client.field499[var19] == 6) {
               var26 = client.field504 % 20 < 10 ? 16711680 : 16776960;
            }

            if (client.field499[var19] == 7) {
               var26 = client.field504 % 20 < 10 ? 255 : '\uffff';
            }

            if (client.field499[var19] == 8) {
               var26 = client.field504 % 20 < 10 ? '\ub000' : 8454016;
            }

            int var27;
            if (client.field499[var19] == 9) {
               var27 = 150 - client.field663[var19];
               if (var27 < 50) {
                  var26 = var27 * 1280 + 16711680;
               } else if (var27 < 100) {
                  var26 = 16776960 - (var27 - 50) * 327680;
               } else if (var27 < 150) {
                  var26 = (var27 - 100) * 5 + '\uff00';
               }
            }

            if (client.field499[var19] == 10) {
               var27 = 150 - client.field663[var19];
               if (var27 < 50) {
                  var26 = var27 * 5 + 16711680;
               } else if (var27 < 100) {
                  var26 = 16711935 - (var27 - 50) * 327680;
               } else if (var27 < 150) {
                  var26 = (var27 - 100) * 327680 + 255 - (var27 - 100) * 5;
               }
            }

            if (client.field499[var19] == 11) {
               var27 = 150 - client.field663[var19];
               if (var27 < 50) {
                  var26 = 16777215 - var27 * 327685;
               } else if (var27 < 100) {
                  var26 = (var27 - 50) * 327685 + '\uff00';
               } else if (var27 < 150) {
                  var26 = 16777215 - (var27 - 100) * 327680;
               }
            }

            if (client.field661[var19] == 0) {
               class129.field1467.method5441(var32, var0 + client.field505 * 15, client.field506 + var1, var26, 0);
            }

            if (client.field661[var19] == 1) {
               class129.field1467.method5377(var32, var0 + client.field505 * 15, client.field506 + var1, var26, 0, client.field504);
            }

            if (client.field661[var19] == 2) {
               class129.field1467.method5392(var32, var0 + client.field505 * 15, client.field506 + var1, var26, 0, client.field504);
            }

            if (client.field661[var19] == 3) {
               class129.field1467.method5379(var32, var0 + client.field505 * 15, client.field506 + var1, var26, 0, client.field504, 150 - client.field663[var19]);
            }

            if (client.field661[var19] == 4) {
               var27 = (150 - client.field663[var19]) * (class129.field1467.method5367(var32) + 100) / 150;
               class393.method6873(var0 + client.field505 * 15 - 50, var1, var0 + client.field505 * 15 + 50, var3 + var1);
               class129.field1467.method5372(var32, var0 + client.field505 * 15 + 50 - var27, client.field506 + var1, var26, 0);
               class393.method6894(var0, var1, var0 + var2, var3 + var1);
            }

            if (client.field661[var19] == 5) {
               var27 = 150 - client.field663[var19];
               int var28 = 0;
               if (var27 < 25) {
                  var28 = var27 - 25;
               } else if (var27 > 125) {
                  var28 = var27 - 125;
               }

               class393.method6873(var0, client.field506 + var1 - class129.field1467.field3737 - 1, var0 + var2, client.field506 + var1 + 5);
               class129.field1467.method5441(var32, var0 + client.field505 * 15, var28 + client.field506 + var1, var26, 0);
               class393.method6894(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class129.field1467.method5441(var32, var0 + client.field505 * 15, client.field506 + var1, 16776960, 0);
         }
      }

      if (client.field423 == 2) {
         class321.method5676((client.field476 - class280.field3624 << 7) + client.field429, (client.field453 - class77.field1133 << 7) + client.field552, client.field428 * 2);
         if (client.field505 * 15 > -1 && client.field451 % 20 < 10) {
            class149.field1676[0].method7024(var0 + client.field505 * 15 - 12, client.field506 + var1 - 28);
         }
      }

      ((class204)class197.field2268).method4110(client.field555);
      client.field521 = 0;
      var14 = (class19.field139.field1068 >> 7) + class280.field3624;
      var15 = (class19.field139.field1058 >> 7) + class77.field1133;
      if (var14 >= 3053 && var14 <= 3156 && var15 >= 3056 && var15 <= 3136) {
         client.field521 = 1;
      }

      if (var14 >= 3072 && var14 <= 3118 && var15 >= 9492 && var15 <= 9535) {
         client.field521 = 1;
      }

      if (client.field521 == 1 && var14 >= 3139 && var14 <= 3199 && var15 >= 3008 && var15 <= 3062) {
         client.field521 = 0;
      }

      class64.field933 = var29;
      class336.field3923 = var7;
      class357.field4011 = var8;
      class116.field1397 = var9;
      class117.field1399 = var10;
      if (client.field414) {
         byte var34 = 0;
         var15 = var34 + class277.field3598 + class277.field3606;
         if (var15 == 0) {
            client.field414 = false;
         }
      }

      if (client.field414) {
         class393.method6880(var0, var1, var2, var3, 0);
         class11.method112("Loading - please wait.", false);
      }

   }

   public static void method3646(class276 var0, class276 var1, boolean var2, class301 var3) {
      class26.field216 = var0;
      class339.field3934 = var1;
      class144.field1594 = var2;
      class150.field1686 = class26.field216.method4946(10);
      class63.field927 = var3;
   }

   static class358 method3625() {
      return class24.field201;
   }
}
