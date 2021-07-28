public class class140 extends class348 {
   public static int field1531;
   static class140[] field1543;
   static class222 field1540;
   static class276 field1548;
   byte[] field1551;
   int field1535;
   int field1537;
   int field1544;
   int field1545;
   int field1546;
   int[] field1530;
   int[] field1550;
   public boolean field1529;
   public boolean field1541;
   public class146 field1539;
   public class148 field1549;
   public int field1534;
   public int field1538;
   public int field1547;
   public int field1552;
   public String field1536;
   public String field1542;
   public String[] field1532;
   public final int field1533;

   static {
      field1540 = new class222(256);
   }

   class140(int var1) {
      this.field1534 = -1;
      this.field1535 = -1;
      this.field1538 = 0;
      this.field1529 = true;
      this.field1541 = false;
      this.field1532 = new String[5];
      this.field1544 = Integer.MAX_VALUE;
      this.field1545 = Integer.MAX_VALUE;
      this.field1546 = Integer.MIN_VALUE;
      this.field1537 = Integer.MIN_VALUE;
      this.field1539 = class146.field1607;
      this.field1549 = class148.field1653;
      this.field1552 = -1;
      this.field1533 = var1;
   }

   public class397 method2651(boolean var1) {
      int var3 = this.field1534;
      return this.method2655(var3);
   }

   class397 method2655(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         class397 var3 = (class397)field1540.method4306((long)var1);
         if (var3 != null) {
            return var3;
         } else {
            var3 = class207.method4246(field1548, var1, 0);
            if (var3 != null) {
               field1540.method4308(var3, (long)var1);
            }

            return var3;
         }
      }
   }

   void method2647(class384 var1, int var2) {
      if (var2 == 1) {
         this.field1534 = var1.method6577();
      } else if (var2 == 2) {
         this.field1535 = var1.method6577();
      } else if (var2 == 3) {
         this.field1536 = var1.method6569();
      } else if (var2 == 4) {
         this.field1547 = var1.method6564();
      } else if (var2 == 5) {
         var1.method6564();
      } else if (var2 == 6) {
         this.field1538 = var1.method6560();
      } else {
         int var4;
         if (var2 == 7) {
            var4 = var1.method6560();
            if ((var4 & 1) == 0) {
               this.field1529 = false;
            }

            if ((var4 & 2) == 2) {
               this.field1541 = true;
            }
         } else if (var2 == 8) {
            var1.method6560();
         } else if (var2 >= 10 && var2 <= 14) {
            this.field1532[var2 - 10] = var1.method6569();
         } else if (var2 == 15) {
            var4 = var1.method6560();
            this.field1530 = new int[var4 * 2];

            int var5;
            for(var5 = 0; var5 < var4 * 2; ++var5) {
               this.field1530[var5] = var1.method6563();
            }

            var1.method6784();
            var5 = var1.method6560();
            this.field1550 = new int[var5];

            int var6;
            for(var6 = 0; var6 < this.field1550.length; ++var6) {
               this.field1550[var6] = var1.method6784();
            }

            this.field1551 = new byte[var4];

            for(var6 = 0; var6 < var4; ++var6) {
               this.field1551[var6] = var1.method6561();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.field1542 = var1.method6569();
            } else if (var2 == 18) {
               var1.method6577();
            } else if (var2 == 19) {
               this.field1552 = var1.method6655();
            } else if (var2 == 21) {
               var1.method6784();
            } else if (var2 == 22) {
               var1.method6784();
            } else if (var2 == 23) {
               var1.method6560();
               var1.method6560();
               var1.method6560();
            } else if (var2 == 24) {
               var1.method6563();
               var1.method6563();
            } else if (var2 == 25) {
               var1.method6577();
            } else if (var2 == 28) {
               var1.method6560();
            } else if (var2 == 29) {
               class146[] var7 = new class146[]{class146.field1607, class146.field1608, class146.field1612};
               this.field1539 = (class146)class250.method4750(var7, var1.method6560());
            } else if (var2 == 30) {
               this.field1549 = (class148)class250.method4750(class4.method21(), var1.method6560());
            }
         }
      }

   }

   public int method2664() {
      return this.field1533;
   }

   void method2660(class384 var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2647(var1, var3);
      }
   }

   void method2666() {
      if (this.field1530 != null) {
         for(int var2 = 0; var2 < this.field1530.length; var2 += 2) {
            if (this.field1530[var2] < this.field1544) {
               this.field1544 = this.field1530[var2];
            } else if (this.field1530[var2] > this.field1546) {
               this.field1546 = this.field1530[var2];
            }

            if (this.field1530[var2 + 1] < this.field1545) {
               this.field1545 = this.field1530[var2 + 1];
            } else if (this.field1530[var2 + 1] > this.field1537) {
               this.field1537 = this.field1530[var2 + 1];
            }
         }
      }

   }
}
