public class class145 {
   static boolean field1595;
   static class398 field1594;

   static final void method2449() {
      client.field453.method1965();
      class233.method3946();
      class253.method4319();
      class54.method1542();
      class8.method49();
      class148.field1618.method3883();
      class148.field1621.method3883();
      class152.method2536();
      class53.method1538();
      class395.method6339();
      class152.field1689.method3883();
      class140.field1526.method3883();
      class100.field1272.method5832();
      class287.field3664.method5832();
      class155.field1709.method3883();
      class155.field1708.method3883();
      class155.field1710.method3883();
      class144.field1580.method3883();
      class144.field1581.method3883();
      class135.method2319();
      class153.field1697.method3883();
      class44.method771();
      Clock.method1990();
      class13.method108();
      ((class205)class198.field2269).method3700();
      class59.field862.method3883();
      class121.field1417.method4427();
      class292.field3693.method4427();
      class38.field307.method4427();
      class139.field1521.method4427();
      class199.field2277.method4427();
      class109.field1326.method4427();
      class75.field1107.method4427();
      class271.field3536.method4427();
      class127.field1454.method4427();
      class106.field1301.method4427();
      class340.field3938.method4427();
      class46.field391.method4427();
      class166.field1925.method3658();

      for(int var1 = 0; var1 < 4; ++var1) {
         client.field465[var1].method2808();
      }

      System.gc();
      class235.field2819 = 1;
      class235.field2820 = null;
      class235.field2822 = -1;
      class97.field1264 = -1;
      class147.field1612 = 0;
      class146.field1598 = false;
      class124.field1439 = 2;
      client.field640 = -1;
      client.field648 = false;

      for(class50 var2 = (class50)class50.field720.method4687(); null != var2; var2 = (class50)class50.field720.method4678()) {
         if (var2.field727 != null) {
            class82.field1163.method336(var2.field727);
            var2.field727 = null;
         }

         if (var2.field725 != null) {
            class82.field1163.method336(var2.field725);
            var2.field725 = null;
         }
      }

      class50.field720.method4671();
      class17.method128(10);
   }

   static void method2450(byte[] var0, int var1) {
      if (null == client.field447) {
         client.field447 = new byte[24];
      }

      class309.method5038(var0, var1, client.field447, 0, 24);
   }

   static void method2451(Buffer var0) {
      if (null != client.field447) {
         var0.method6003(client.field447, 0, client.field447.length);
      } else {
         byte[] var2 = class139.method2346();
         var0.method6003(var2, 0, var2.length);
      }
   }
}
