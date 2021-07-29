public class class122 extends class104 {
   int field1421;
   int field1422;
   // $FF: synthetic field
   final class107 this$0;

   class122(class107 var1) {
      this.this$0 = var1;
   }

   void method2083(class385 var1) {
      this.field1422 = var1.method6172();
      this.field1421 = var1.method6172();
   }

   void method2084(class115 var1) {
      var1.method2133(this.field1422, this.field1421);
   }

   static final void method2213(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         class38.field308.field1113 = !class38.field308.field1113;
         class135.method2320();
         if (class38.field308.field1113) {
            class121.method2204(99, "", "Roofs are now all hidden");
         } else {
            class121.method2204(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         client.field422 = !client.field422;
      }

      if (var0.equalsIgnoreCase("renderself")) {
         client.field527 = !client.field527;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         client.field578 = !client.field578;
      }

      if (client.field577 >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            class25.field202.field4026 = !class25.field202.field4026;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            client.field422 = true;
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            client.field422 = false;
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            class175.method3140();
         }
      }

      class229 var2 = class149.method2495(class227.field2666, client.field453.field1205);
      var2.field2691.writeByte(var0.length() + 1);
      var2.field2691.method5938(var0);
      client.field453.method1963(var2);
   }

   static final void method2214(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      class229 var9;
      if (37 == var2) {
         var9 = class149.method2495(class227.field2660, client.field453.field1205);
         var9.field2691.method5992(var1);
         var9.field2691.method6077(var3);
         var9.field2691.method5983(var0);
         client.field453.method1963(var9);
         client.field513 = 0;
         class13.field78 = class87.method1995(var1);
         client.field514 = var0;
      }

      class229 var10;
      class70 var12;
      if (46 == var2) {
         var12 = client.field524[var3];
         if (var12 != null) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var10 = class149.method2495(class227.field2661, client.field453.field1205);
            var10.field2691.method5976(class11.field46[82] ? 1 : 0);
            var10.field2691.method6077(var3);
            client.field453.method1963(var10);
         }
      }

      class78 var13;
      if (var2 == 10) {
         var13 = client.field567[var3];
         if (null != var13) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var10 = class149.method2495(class227.field2575, client.field453.field1205);
            var10.field2691.method6122(var3);
            var10.field2691.method6067(class11.field46[82] ? 1 : 0);
            client.field453.method1963(var10);
         }
      }

      if (47 == var2) {
         var12 = client.field524[var3];
         if (var12 != null) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var10 = class149.method2495(class227.field2651, client.field453.field1205);
            var10.field2691.method5984(var3);
            var10.field2691.method6067(class11.field46[82] ? 1 : 0);
            client.field453.method1963(var10);
         }
      }

      if (45 == var2) {
         var12 = client.field524[var3];
         if (null != var12) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var10 = class149.method2495(class227.field2605, client.field453.field1205);
            var10.field2691.method6122(var3);
            var10.field2691.method6067(class11.field46[82] ? 1 : 0);
            client.field453.method1963(var10);
         }
      }

      if (var2 == 1002) {
         client.field508 = var6;
         client.field463 = var7;
         client.field511 = 2;
         client.field540 = 0;
         var9 = class149.method2495(class227.field2621, client.field453.field1205);
         var9.field2691.method5984(var3);
         client.field453.method1963(var9);
      }

      if (var2 == 35) {
         var9 = class149.method2495(class227.field2582, client.field453.field1205);
         var9.field2691.method5984(var3);
         var9.field2691.method5992(var1);
         var9.field2691.method6122(var0);
         client.field453.method1963(var9);
         client.field513 = 0;
         class13.field78 = class87.method1995(var1);
         client.field514 = var0;
      }

      if (var2 == 31) {
         var9 = class149.method2495(class227.field2629, client.field453.field1205);
         var9.field2691.method5994(class62.field912);
         var9.field2691.method6122(class104.field1295);
         var9.field2691.method5972(var1);
         var9.field2691.method5983(var3);
         var9.field2691.method5983(var0);
         var9.field2691.method5983(class11.field41);
         client.field453.method1963(var9);
         client.field513 = 0;
         class13.field78 = class87.method1995(var1);
         client.field514 = var0;
      }

      if (var2 == 51) {
         var12 = client.field524[var3];
         if (null != var12) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var10 = class149.method2495(class227.field2589, client.field453.field1205);
            var10.field2691.method6122(var3);
            var10.field2691.method6067(class11.field46[82] ? 1 : 0);
            client.field453.method1963(var10);
         }
      }

      if (40 == var2) {
         var9 = class149.method2495(class227.field2615, client.field453.field1205);
         var9.field2691.method5992(var1);
         var9.field2691.method5983(var0);
         var9.field2691.method5984(var3);
         client.field453.method1963(var9);
         client.field513 = 0;
         class13.field78 = class87.method1995(var1);
         client.field514 = var0;
      }

      if (50 == var2) {
         var12 = client.field524[var3];
         if (null != var12) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var10 = class149.method2495(class227.field2628, client.field453.field1205);
            var10.field2691.method5974(class11.field46[82] ? 1 : 0);
            var10.field2691.method5984(var3);
            client.field453.method1963(var10);
         }
      }

      if (18 == var2) {
         client.field508 = var6;
         client.field463 = var7;
         client.field511 = 2;
         client.field540 = 0;
         client.field644 = var0;
         client.field597 = var1;
         var9 = class149.method2495(class227.field2595, client.field453.field1205);
         var9.field2691.method5983(var3);
         var9.field2691.method6077(class281.field3625 + var0);
         var9.field2691.method5983(var1 + class78.field1134);
         var9.field2691.writeByte(class11.field46[82] ? 1 : 0);
         client.field453.method1963(var9);
      }

      if (7 == var2) {
         var13 = client.field567[var3];
         if (null != var13) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var10 = class149.method2495(class227.field2616, client.field453.field1205);
            var10.field2691.method6077(class104.field1295);
            var10.field2691.method5992(class62.field912);
            var10.field2691.method5983(var3);
            var10.field2691.writeByte(class11.field46[82] ? 1 : 0);
            var10.field2691.method6122(class11.field41);
            client.field453.method1963(var10);
         }
      }

      if (1004 == var2) {
         client.field508 = var6;
         client.field463 = var7;
         client.field511 = 2;
         client.field540 = 0;
         var9 = class149.method2495(class227.field2587, client.field453.field1205);
         var9.field2691.method5984(var3);
         client.field453.method1963(var9);
      }

      class249 var15;
      if (1005 == var2) {
         var15 = class87.method1995(var1);
         if (null != var15 && var15.field3087[var0] >= 100000) {
            class121.method2204(27, "", var15.field3087[var0] + " x " + class11.method93(var3).field1836);
         } else {
            var10 = class149.method2495(class227.field2587, client.field453.field1205);
            var10.field2691.method5984(var3);
            client.field453.method1963(var10);
         }

         client.field513 = 0;
         class13.field78 = class87.method1995(var1);
         client.field514 = var0;
      }

      if (var2 == 34) {
         var9 = class149.method2495(class227.field2630, client.field453.field1205);
         var9.field2691.method5972(var1);
         var9.field2691.method6077(var3);
         var9.field2691.method6122(var0);
         client.field453.method1963(var9);
         client.field513 = 0;
         class13.field78 = class87.method1995(var1);
         client.field514 = var0;
      }

      if (var2 == 48) {
         var12 = client.field524[var3];
         if (var12 != null) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var10 = class149.method2495(class227.field2611, client.field453.field1205);
            var10.field2691.method6077(var3);
            var10.field2691.writeByte(class11.field46[82] ? 1 : 0);
            client.field453.method1963(var10);
         }
      }

      if (var2 == 49) {
         var12 = client.field524[var3];
         if (null != var12) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var10 = class149.method2495(class227.field2570, client.field453.field1205);
            var10.field2691.method6122(var3);
            var10.field2691.method5976(class11.field46[82] ? 1 : 0);
            client.field453.method1963(var10);
         }
      }

      if (12 == var2) {
         var13 = client.field567[var3];
         if (var13 != null) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var10 = class149.method2495(class227.field2627, client.field453.field1205);
            var10.field2691.method6067(class11.field46[82] ? 1 : 0);
            var10.field2691.method5984(var3);
            client.field453.method1963(var10);
         }
      }

      if (23 == var2) {
         if (client.field544) {
            class166.field1925.method3678();
         } else {
            class166.field1925.method3534(class285.field3652, var0, var1, true);
         }
      }

      if (var2 == 19) {
         client.field508 = var6;
         client.field463 = var7;
         client.field511 = 2;
         client.field540 = 0;
         client.field644 = var0;
         client.field597 = var1;
         var9 = class149.method2495(class227.field2590, client.field453.field1205);
         var9.field2691.method6077(class78.field1134 + var1);
         var9.field2691.method6077(class281.field3625 + var0);
         var9.field2691.writeByte(class11.field46[82] ? 1 : 0);
         var9.field2691.method6077(var3);
         client.field453.method1963(var9);
      }

      if (var2 == 43) {
         var9 = class149.method2495(class227.field2668, client.field453.field1205);
         var9.field2691.method5992(var1);
         var9.field2691.method5983(var3);
         var9.field2691.method6077(var0);
         client.field453.method1963(var9);
         client.field513 = 0;
         class13.field78 = class87.method1995(var1);
         client.field514 = var0;
      }

      if (1 == var2) {
         client.field508 = var6;
         client.field463 = var7;
         client.field511 = 2;
         client.field540 = 0;
         client.field644 = var0;
         client.field597 = var1;
         var9 = class149.method2495(class227.field2618, client.field453.field1205);
         var9.field2691.writeByte(class11.field46[82] ? 1 : 0);
         var9.field2691.method5984(class11.field41);
         var9.field2691.method5994(class62.field912);
         var9.field2691.method6122(var3);
         var9.field2691.method6122(class104.field1295);
         var9.field2691.method6122(class281.field3625 + var0);
         var9.field2691.method6077(class78.field1134 + var1);
         client.field453.method1963(var9);
      }

      if (var2 == 17) {
         client.field508 = var6;
         client.field463 = var7;
         client.field511 = 2;
         client.field540 = 0;
         client.field644 = var0;
         client.field597 = var1;
         var9 = class149.method2495(class227.field2566, client.field453.field1205);
         var9.field2691.method5972(class25.field185);
         var9.field2691.method5983(var3);
         var9.field2691.method5976(class11.field46[82] ? 1 : 0);
         var9.field2691.method5983(client.field564);
         var9.field2691.method5984(var0 + class281.field3625);
         var9.field2691.method5984(var1 + class78.field1134);
         var9.field2691.method5984(client.field565);
         client.field453.method1963(var9);
      }

      if (var2 == 22) {
         client.field508 = var6;
         client.field463 = var7;
         client.field511 = 2;
         client.field540 = 0;
         client.field644 = var0;
         client.field597 = var1;
         var9 = class149.method2495(class227.field2597, client.field453.field1205);
         var9.field2691.method6077(var0 + class281.field3625);
         var9.field2691.method6077(var1 + class78.field1134);
         var9.field2691.method5984(var3);
         var9.field2691.method5976(class11.field46[82] ? 1 : 0);
         client.field453.method1963(var9);
      }

      if (16 == var2) {
         client.field508 = var6;
         client.field463 = var7;
         client.field511 = 2;
         client.field540 = 0;
         client.field644 = var0;
         client.field597 = var1;
         var9 = class149.method2495(class227.field2594, client.field453.field1205);
         var9.field2691.method6077(var1 + class78.field1134);
         var9.field2691.method6077(class11.field41);
         var9.field2691.method5992(class62.field912);
         var9.field2691.writeByte(class11.field46[82] ? 1 : 0);
         var9.field2691.method5983(var3);
         var9.field2691.method6077(class104.field1295);
         var9.field2691.method5984(var0 + class281.field3625);
         client.field453.method1963(var9);
      }

      class229 var11;
      if (var2 == 1003) {
         client.field508 = var6;
         client.field463 = var7;
         client.field511 = 2;
         client.field540 = 0;
         var13 = client.field567[var3];
         if (var13 != null) {
            class148 var16 = var13.field1132;
            if (var16.field1646 != null) {
               var16 = var16.method2471();
            }

            if (var16 != null) {
               var11 = class149.method2495(class227.field2648, client.field453.field1205);
               var11.field2691.method5983(var16.field1627);
               client.field453.method1963(var11);
            }
         }
      }

      if (var2 == 2) {
         client.field508 = var6;
         client.field463 = var7;
         client.field511 = 2;
         client.field540 = 0;
         client.field644 = var0;
         client.field597 = var1;
         var9 = class149.method2495(class227.field2598, client.field453.field1205);
         var9.field2691.method6067(class11.field46[82] ? 1 : 0);
         var9.field2691.method5984(var3);
         var9.field2691.method6077(var1 + class78.field1134);
         var9.field2691.writeInt(class25.field185);
         var9.field2691.method6077(var0 + class281.field3625);
         var9.field2691.method6077(client.field565);
         var9.field2691.method6077(client.field564);
         client.field453.method1963(var9);
      }

      if (38 == var2) {
         class166.method2877();
         var15 = class87.method1995(var1);
         client.field561 = 1;
         class11.field41 = var0;
         class62.field912 = var1;
         class104.field1295 = var3;
         class81.method1869(var15);
         client.field530 = class44.method770(16748608) + class11.method93(var3).field1836 + class44.method770(16777215);
         if (client.field530 == null) {
            client.field530 = class270.field3234;
         }

      } else {
         if (3 == var2) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var9 = class149.method2495(class227.field2623, client.field453.field1205);
            var9.field2691.method6067(class11.field46[82] ? 1 : 0);
            var9.field2691.method5984(var1 + class78.field1134);
            var9.field2691.method5984(var0 + class281.field3625);
            var9.field2691.method5984(var3);
            client.field453.method1963(var9);
         }

         if (15 == var2) {
            var12 = client.field524[var3];
            if (var12 != null) {
               client.field508 = var6;
               client.field463 = var7;
               client.field511 = 2;
               client.field540 = 0;
               client.field644 = var0;
               client.field597 = var1;
               var10 = class149.method2495(class227.field2593, client.field453.field1205);
               var10.field2691.method6077(client.field565);
               var10.field2691.method5994(class25.field185);
               var10.field2691.method6067(class11.field46[82] ? 1 : 0);
               var10.field2691.method6077(client.field564);
               var10.field2691.method6122(var3);
               client.field453.method1963(var10);
            }
         }

         if (20 == var2) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var9 = class149.method2495(class227.field2600, client.field453.field1205);
            var9.field2691.method5984(class281.field3625 + var0);
            var9.field2691.method5976(class11.field46[82] ? 1 : 0);
            var9.field2691.method5984(class78.field1134 + var1);
            var9.field2691.method5984(var3);
            client.field453.method1963(var9);
         }

         if (var2 == 36) {
            var9 = class149.method2495(class227.field2620, client.field453.field1205);
            var9.field2691.method6122(var0);
            var9.field2691.method6077(var3);
            var9.field2691.method5992(var1);
            client.field453.method1963(var9);
            client.field513 = 0;
            class13.field78 = class87.method1995(var1);
            client.field514 = var0;
         }

         if (41 == var2) {
            var9 = class149.method2495(class227.field2636, client.field453.field1205);
            var9.field2691.method5972(var1);
            var9.field2691.method5983(var3);
            var9.field2691.method6122(var0);
            client.field453.method1963(var9);
            client.field513 = 0;
            class13.field78 = class87.method1995(var1);
            client.field514 = var0;
         }

         if (30 == var2 && client.field574 == null) {
            class197.method3413(var1, var0);
            client.field574 = class50.method1394(var1, var0);
            class81.method1869(client.field574);
         }

         if (33 == var2) {
            var9 = class149.method2495(class227.field2563, client.field453.field1205);
            var9.field2691.method5972(var1);
            var9.field2691.method5984(var0);
            var9.field2691.method5984(var3);
            client.field453.method1963(var9);
            client.field513 = 0;
            class13.field78 = class87.method1995(var1);
            client.field514 = var0;
         }

         if (42 == var2) {
            var9 = class149.method2495(class227.field2567, client.field453.field1205);
            var9.field2691.method5984(var3);
            var9.field2691.method6122(var0);
            var9.field2691.method5992(var1);
            client.field453.method1963(var9);
            client.field513 = 0;
            class13.field78 = class87.method1995(var1);
            client.field514 = var0;
         }

         if (39 == var2) {
            var9 = class149.method2495(class227.field2573, client.field453.field1205);
            var9.field2691.method6122(var3);
            var9.field2691.method5983(var0);
            var9.field2691.writeInt(var1);
            client.field453.method1963(var9);
            client.field513 = 0;
            class13.field78 = class87.method1995(var1);
            client.field514 = var0;
         }

         if (var2 == 11) {
            var13 = client.field567[var3];
            if (var13 != null) {
               client.field508 = var6;
               client.field463 = var7;
               client.field511 = 2;
               client.field540 = 0;
               client.field644 = var0;
               client.field597 = var1;
               var10 = class149.method2495(class227.field2610, client.field453.field1205);
               var10.field2691.method5984(var3);
               var10.field2691.method5974(class11.field46[82] ? 1 : 0);
               client.field453.method1963(var10);
            }
         }

         if (var2 == 32) {
            var9 = class149.method2495(class227.field2631, client.field453.field1205);
            var9.field2691.method6077(var3);
            var9.field2691.method5972(var1);
            var9.field2691.method5983(var0);
            var9.field2691.method5994(class25.field185);
            var9.field2691.method5984(client.field564);
            client.field453.method1963(var9);
            client.field513 = 0;
            class13.field78 = class87.method1995(var1);
            client.field514 = var0;
         }

         if (var2 == 1001) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var9 = class149.method2495(class227.field2612, client.field453.field1205);
            var9.field2691.method6122(var3);
            var9.field2691.method5984(var1 + class78.field1134);
            var9.field2691.writeByte(class11.field46[82] ? 1 : 0);
            var9.field2691.method5984(class281.field3625 + var0);
            client.field453.method1963(var9);
         }

         if (var2 == 26) {
            class25.method446();
         }

         if (6 == var2) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var9 = class149.method2495(class227.field2619, client.field453.field1205);
            var9.field2691.method5984(var1 + class78.field1134);
            var9.field2691.method6077(var0 + class281.field3625);
            var9.field2691.method5983(var3);
            var9.field2691.method5974(class11.field46[82] ? 1 : 0);
            client.field453.method1963(var9);
         }

         if (44 == var2) {
            var12 = client.field524[var3];
            if (var12 != null) {
               client.field508 = var6;
               client.field463 = var7;
               client.field511 = 2;
               client.field540 = 0;
               client.field644 = var0;
               client.field597 = var1;
               var10 = class149.method2495(class227.field2625, client.field453.field1205);
               var10.field2691.writeByte(class11.field46[82] ? 1 : 0);
               var10.field2691.method6077(var3);
               client.field453.method1963(var10);
            }
         }

         if (9 == var2) {
            var13 = client.field567[var3];
            if (null != var13) {
               client.field508 = var6;
               client.field463 = var7;
               client.field511 = 2;
               client.field540 = 0;
               client.field644 = var0;
               client.field597 = var1;
               var10 = class149.method2495(class227.field2607, client.field453.field1205);
               var10.field2691.method6077(var3);
               var10.field2691.method5974(class11.field46[82] ? 1 : 0);
               client.field453.method1963(var10);
            }
         }

         int var14;
         class249 var17;
         if (28 == var2) {
            var9 = class149.method2495(class227.field2652, client.field453.field1205);
            var9.field2691.writeInt(var1);
            client.field453.method1963(var9);
            var17 = class87.method1995(var1);
            if (var17.field3080 != null && var17.field3080[0][0] == 5) {
               var14 = var17.field3080[0][1];
               class244.field2911[var14] = 1 - class244.field2911[var14];
               class46.method801(var14);
            }
         }

         if (var2 == 5) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var9 = class149.method2495(class227.field2592, client.field453.field1205);
            var9.field2691.method5983(var1 + class78.field1134);
            var9.field2691.method5984(var3);
            var9.field2691.method6077(class281.field3625 + var0);
            var9.field2691.method6067(class11.field46[82] ? 1 : 0);
            client.field453.method1963(var9);
         }

         if (var2 == 57 || 1007 == var2) {
            var15 = class50.method1394(var1, var0);
            if (null != var15) {
               class184.method3200(var3, var1, var0, var15.field3088, var5);
            }
         }

         if (var2 == 13) {
            var13 = client.field567[var3];
            if (null != var13) {
               client.field508 = var6;
               client.field463 = var7;
               client.field511 = 2;
               client.field540 = 0;
               client.field644 = var0;
               client.field597 = var1;
               var10 = class149.method2495(class227.field2632, client.field453.field1205);
               var10.field2691.writeByte(class11.field46[82] ? 1 : 0);
               var10.field2691.method5983(var3);
               client.field453.method1963(var10);
            }
         }

         if (29 == var2) {
            var9 = class149.method2495(class227.field2652, client.field453.field1205);
            var9.field2691.writeInt(var1);
            client.field453.method1963(var9);
            var17 = class87.method1995(var1);
            if (var17.field3080 != null && 5 == var17.field3080[0][0]) {
               var14 = var17.field3080[0][1];
               if (var17.field3082[0] != class244.field2911[var14]) {
                  class244.field2911[var14] = var17.field3082[0];
                  class46.method801(var14);
               }
            }
         }

         if (var2 == 4) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var9 = class149.method2495(class227.field2639, client.field453.field1205);
            var9.field2691.method5974(class11.field46[82] ? 1 : 0);
            var9.field2691.method5983(var1 + class78.field1134);
            var9.field2691.method5983(var0 + class281.field3625);
            var9.field2691.method6122(var3);
            client.field453.method1963(var9);
         }

         if (var2 == 24) {
            var15 = class87.method1995(var1);
            boolean var18 = true;
            if (var15.field2962 > 0) {
               var18 = class377.method5858(var15);
            }

            if (var18) {
               var11 = class149.method2495(class227.field2652, client.field453.field1205);
               var11.field2691.writeInt(var1);
               client.field453.method1963(var11);
            }
         }

         if (14 == var2) {
            var12 = client.field524[var3];
            if (null != var12) {
               client.field508 = var6;
               client.field463 = var7;
               client.field511 = 2;
               client.field540 = 0;
               client.field644 = var0;
               client.field597 = var1;
               var10 = class149.method2495(class227.field2656, client.field453.field1205);
               var10.field2691.method5984(var3);
               var10.field2691.method6122(class104.field1295);
               var10.field2691.method5994(class62.field912);
               var10.field2691.method6077(class11.field41);
               var10.field2691.method6067(class11.field46[82] ? 1 : 0);
               client.field453.method1963(var10);
            }
         }

         if (8 == var2) {
            var13 = client.field567[var3];
            if (var13 != null) {
               client.field508 = var6;
               client.field463 = var7;
               client.field511 = 2;
               client.field540 = 0;
               client.field644 = var0;
               client.field597 = var1;
               var10 = class149.method2495(class227.field2603, client.field453.field1205);
               var10.field2691.method6122(client.field565);
               var10.field2691.method5974(class11.field46[82] ? 1 : 0);
               var10.field2691.method6122(client.field564);
               var10.field2691.method5994(class25.field185);
               var10.field2691.method5984(var3);
               client.field453.method1963(var10);
            }
         }

         if (var2 == 58) {
            var15 = class50.method1394(var1, var0);
            if (var15 != null) {
               var10 = class149.method2495(class227.field2606, client.field453.field1205);
               var10.field2691.method5983(var15.field3088);
               var10.field2691.method5992(var1);
               var10.field2691.method6122(var0);
               var10.field2691.method5984(client.field565);
               var10.field2691.method5992(class25.field185);
               var10.field2691.method6122(client.field564);
               client.field453.method1963(var10);
            }
         }

         if (1008 == var2 || var2 == 1009 || 1010 == var2 || 1011 == var2 || 1012 == var2) {
            class25.field202.method5537(var2, var3, new class245(var0), new class245(var1));
         }

         if (21 == var2) {
            client.field508 = var6;
            client.field463 = var7;
            client.field511 = 2;
            client.field540 = 0;
            client.field644 = var0;
            client.field597 = var1;
            var9 = class149.method2495(class227.field2585, client.field453.field1205);
            var9.field2691.method5984(var3);
            var9.field2691.method5983(var0 + class281.field3625);
            var9.field2691.method6077(var1 + class78.field1134);
            var9.field2691.method5974(class11.field46[82] ? 1 : 0);
            client.field453.method1963(var9);
         }

         if (var2 == 25) {
            var15 = class50.method1394(var1, var0);
            if (null != var15) {
               class166.method2877();
               class46.method803(var1, var0, class104.method2082(class241.method4140(var15)), var15.field3088);
               client.field561 = 0;
               client.field566 = class25.method413(var15);
               if (client.field566 == null) {
                  client.field566 = class270.field3234;
               }

               if (var15.field2993) {
                  client.field466 = var15.field3037 + class44.method770(16777215);
               } else {
                  client.field466 = class44.method770(65280) + var15.field3041 + class44.method770(16777215);
               }
            }

         } else {
            if (client.field561 != 0) {
               client.field561 = 0;
               class81.method1869(class87.method1995(class62.field912));
            }

            if (client.field563) {
               class166.method2877();
            }

            if (null != class13.field78 && client.field513 == 0) {
               class81.method1869(class13.field78);
            }

         }
      }
   }
}
