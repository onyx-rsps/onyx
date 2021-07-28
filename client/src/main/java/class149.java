public class class149 extends class348 {
   static class114 field1668;
   static class222 field1659;
   static class222 field1661;
   static class276 field1674;
   static class397[] field1676;
   static int field1658;
   static String field1660;
   int field1662;
   int field1664;
   int field1669;
   int field1670;
   int field1672;
   int field1673;
   int field1677;
   short[] field1665;
   short[] field1666;
   short[] field1667;
   short[] field1671;
   public int field1663;

   static {
      field1659 = new class222(64);
      field1661 = new class222(30);
   }

   class149() {
      this.field1663 = -1;
      this.field1664 = 128;
      this.field1669 = 128;
      this.field1670 = 0;
      this.field1673 = 0;
      this.field1672 = 0;
   }

   void method2804(class384 var1, int var2) {
      if (var2 == 1) {
         this.field1662 = var1.method6655();
      } else if (var2 == 2) {
         this.field1663 = var1.method6655();
      } else if (var2 == 4) {
         this.field1664 = var1.method6655();
      } else if (var2 == 5) {
         this.field1669 = var1.method6655();
      } else if (var2 == 6) {
         this.field1670 = var1.method6655();
      } else if (var2 == 7) {
         this.field1673 = var1.method6560();
      } else if (var2 == 8) {
         this.field1672 = var1.method6560();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.method6560();
            this.field1671 = new short[var4];
            this.field1665 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1671[var5] = (short)var1.method6655();
               this.field1665[var5] = (short)var1.method6655();
            }
         } else if (var2 == 41) {
            var4 = var1.method6560();
            this.field1666 = new short[var4];
            this.field1667 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1666[var5] = (short)var1.method6655();
               this.field1667[var5] = (short)var1.method6655();
            }
         }
      }

   }

   public final class206 method2791(int var1) {
      class206 var3 = (class206)field1661.method4306((long)this.field1677);
      if (var3 == null) {
         class192 var4 = class192.method3720(class406.field4312, this.field1662, 0);
         if (var4 == null) {
            return null;
         }

         int var5;
         if (this.field1671 != null) {
            for(var5 = 0; var5 < this.field1671.length; ++var5) {
               var4.method3766(this.field1671[var5], this.field1665[var5]);
            }
         }

         if (this.field1666 != null) {
            for(var5 = 0; var5 < this.field1666.length; ++var5) {
               var4.method3733(this.field1666[var5], this.field1667[var5]);
            }
         }

         var3 = var4.method3740(this.field1673 + 64, this.field1672 + 850, -30, -50, -30);
         field1661.method4308(var3, (long)this.field1677);
      }

      class206 var6;
      if (this.field1663 != -1 && var1 != -1) {
         var6 = class47.method1355(this.field1663).method3071(var3, var1);
      } else {
         var6 = var3.method4134(true);
      }

      if (this.field1664 != 128 || this.field1669 != 128) {
         var6.method4153(this.field1664, this.field1669, this.field1664);
      }

      if (this.field1670 != 0) {
         if (this.field1670 == 90) {
            var6.method4162();
         }

         if (this.field1670 == 180) {
            var6.method4162();
            var6.method4162();
         }

         if (this.field1670 == 270) {
            var6.method4162();
            var6.method4162();
            var6.method4162();
         }
      }

      return var6;
   }

   void method2797(class384 var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2804(var1, var3);
      }
   }

   public static void method2806(int var0, class276 var1, String var2, String var3, int var4, boolean var5) {
      int var7 = var1.method4936(var2);
      int var8 = var1.method4938(var7, var3);
      class91.method2094(var0, var1, var7, var8, var4, var5);
   }
}
