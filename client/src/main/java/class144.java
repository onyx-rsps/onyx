public class class144 {
   static boolean field1594;
   static class397 field1593;

   static void method2733(byte[] var0, int var1) {
      if (client.field446 == null) {
         client.field446 = new byte[24];
      }

      class308.method5557(var0, var1, client.field446, 0, 24);
   }

   static final void method2732() {
      client.field452.method2033();
      class232.method4380();
      class252.method4782();
      class53.method1587();
      class7.method58();
      class147.field1617.method4309();
      class147.field1620.method4309();
      class151.method2829();
      class52.method1583();
      class394.method6954();
      class151.field1688.method4309();
      class139.field1525.method4309();
      class99.field1271.method6416();
      class286.field3663.method6416();
      class154.field1708.method4309();
      class154.field1707.method4309();
      class154.field1709.method4309();
      class143.field1579.method4309();
      class143.field1580.method4309();
      class134.method2602();
      class152.field1696.method4309();
      class43.method851();
      class86.method2058();
      class12.method123();
      ((class204)class197.field2268).method4109();
      class58.field861.method4309();
      class120.field1416.method4935();
      class291.field3692.method4935();
      class37.field306.method4935();
      class138.field1520.method4935();
      class198.field2276.method4935();
      class108.field1325.method4935();
      class74.field1106.method4935();
      class270.field3535.method4935();
      class126.field1453.method4935();
      class105.field1300.method4935();
      class339.field3937.method4935();
      class45.field390.method4935();
      class165.field1924.method4062();

      for(int var1 = 0; var1 < 4; ++var1) {
         client.field464[var1].method3101();
      }

      System.gc();
      class234.field2818 = 1;
      class234.field2819 = null;
      class234.field2821 = -1;
      class96.field1263 = -1;
      class146.field1611 = 0;
      class145.field1597 = false;
      class123.field1438 = 2;
      client.field639 = -1;
      client.field647 = false;

      for(class49 var2 = (class49)class49.field719.method5202(); var2 != null; var2 = (class49)class49.field719.method5193()) {
         if (var2.field726 != null) {
            class81.field1162.method384(var2.field726);
            var2.field726 = null;
         }

         if (var2.field724 != null) {
            class81.field1162.method384(var2.field724);
            var2.field724 = null;
         }
      }

      class49.field719.method5186();
      class16.method163(10);
   }

   static void method2734(Buffer var0) {
      if (client.field446 != null) {
         var0.method6615(client.field446, 0, client.field446.length);
      } else {
         byte[] var2 = class138.method2629();
         var0.method6615(var2, 0, var2.length);
      }
   }
}
