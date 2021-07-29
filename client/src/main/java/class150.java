public class class150 extends class349 {
   static class115 field1669;
   static class223 field1660;
   static class223 field1662;
   static class277 field1675;
   static class398[] field1677;
   static int field1659;
   static String field1661;
   int field1663;
   int field1665;
   int field1670;
   int field1671;
   int field1673;
   int field1674;
   int field1678;
   short[] field1666;
   short[] field1667;
   short[] field1668;
   short[] field1672;
   public int field1664;

   static {
      field1660 = new class223(64);
      field1662 = new class223(30);
   }

   class150() {
      this.field1664 = -1;
      this.field1665 = 128;
      this.field1670 = 128;
      this.field1671 = 0;
      this.field1674 = 0;
      this.field1673 = 0;
   }

   public static void method2513(int var0, class277 var1, String var2, String var3, int var4, boolean var5) {
      int var7 = var1.method4428(var2);
      int var8 = var1.method4430(var7, var3);
      class92.method2026(var0, var1, var7, var8, var4, var5);
   }

   void method2504(class385 var1) {
      while(true) {
         int var3 = var1.method5948();
         if (var3 == 0) {
            return;
         }

         this.method2511(var1, var3);
      }
   }

   void method2511(class385 var1, int var2) {
      if (var2 == 1) {
         this.field1663 = var1.method6043();
      } else if (2 == var2) {
         this.field1664 = var1.method6043();
      } else if (var2 == 4) {
         this.field1665 = var1.method6043();
      } else if (var2 == 5) {
         this.field1670 = var1.method6043();
      } else if (6 == var2) {
         this.field1671 = var1.method6043();
      } else if (7 == var2) {
         this.field1674 = var1.method5948();
      } else if (var2 == 8) {
         this.field1673 = var1.method5948();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.method5948();
            this.field1672 = new short[var4];
            this.field1666 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1672[var5] = (short)var1.method6043();
               this.field1666[var5] = (short)var1.method6043();
            }
         } else if (var2 == 41) {
            var4 = var1.method5948();
            this.field1667 = new short[var4];
            this.field1668 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1667[var5] = (short)var1.method6043();
               this.field1668[var5] = (short)var1.method6043();
            }
         }
      }

   }

   public final class207 method2498(int var1) {
      class207 var3 = (class207)field1662.method3880((long)this.field1678);
      if (null == var3) {
         class193 var4 = class193.method3316(class407.field4313, this.field1663, 0);
         if (null == var4) {
            return null;
         }

         int var5;
         if (null != this.field1672) {
            for(var5 = 0; var5 < this.field1672.length; ++var5) {
               var4.method3362(this.field1672[var5], this.field1666[var5]);
            }
         }

         if (this.field1667 != null) {
            for(var5 = 0; var5 < this.field1667.length; ++var5) {
               var4.method3329(this.field1667[var5], this.field1668[var5]);
            }
         }

         var3 = var4.method3336(64 + this.field1674, this.field1673 + 850, -30, -50, -30);
         field1662.method3882(var3, (long)this.field1678);
      }

      class207 var6;
      if (this.field1664 != -1 && var1 != -1) {
         var6 = class48.method1312(this.field1664).method2778(var3, var1);
      } else {
         var6 = var3.method3718(true);
      }

      if (this.field1665 != 128 || 128 != this.field1670) {
         var6.method3736(this.field1665, this.field1670, this.field1665);
      }

      if (0 != this.field1671) {
         if (90 == this.field1671) {
            var6.method3744();
         }

         if (180 == this.field1671) {
            var6.method3744();
            var6.method3744();
         }

         if (this.field1671 == 270) {
            var6.method3744();
            var6.method3744();
            var6.method3744();
         }
      }

      return var6;
   }
}
