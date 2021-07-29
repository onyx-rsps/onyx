public class class154 extends class348 {
   public static class222 field1707;
   public static class222 field1708;
   public static class222 field1709;
   static class276 field1710;
   static class276 field1732;
   static int field1713;
   int field1714;
   int field1715;
   int field1717;
   int field1718;
   int field1719;
   int field1720;
   int field1728;
   String field1724;
   public int field1706;
   public int field1716;
   public int field1721;
   public int field1722;
   public int field1723;
   public int field1725;
   public int field1726;
   public int[] field1729;

   static {
      field1708 = new class222(64);
      field1707 = new class222(64);
      field1709 = new class222(20);
   }

   class154() {
      this.field1714 = -1;
      this.field1723 = 16777215;
      this.field1716 = 70;
      this.field1717 = -1;
      this.field1720 = -1;
      this.field1719 = -1;
      this.field1718 = -1;
      this.field1721 = 0;
      this.field1722 = 0;
      this.field1706 = -1;
      this.field1724 = "";
      this.field1725 = -1;
      this.field1726 = 0;
      this.field1728 = -1;
      this.field1715 = -1;
   }

   void method2914(Buffer var1, int var2) {
      if (var2 == 1) {
         this.field1714 = var1.method6577();
      } else if (var2 == 2) {
         this.field1723 = var1.method6564();
      } else if (var2 == 3) {
         this.field1717 = var1.method6577();
      } else if (var2 == 4) {
         this.field1719 = var1.method6577();
      } else if (var2 == 5) {
         this.field1720 = var1.method6577();
      } else if (var2 == 6) {
         this.field1718 = var1.method6577();
      } else if (var2 == 7) {
         this.field1721 = var1.method6563();
      } else if (var2 == 8) {
         this.field1724 = var1.method6706();
      } else if (var2 == 9) {
         this.field1716 = var1.method6655();
      } else if (var2 == 10) {
         this.field1722 = var1.method6563();
      } else if (var2 == 11) {
         this.field1706 = 0;
      } else if (var2 == 12) {
         this.field1725 = var1.method6560();
      } else if (var2 == 13) {
         this.field1726 = var1.method6563();
      } else if (var2 == 14) {
         this.field1706 = var1.method6655();
      } else if (var2 == 17 || var2 == 18) {
         this.field1728 = var1.method6655();
         if (this.field1728 == 65535) {
            this.field1728 = -1;
         }

         this.field1715 = var1.method6655();
         if (this.field1715 == 65535) {
            this.field1715 = -1;
         }

         int var4 = -1;
         if (var2 == 18) {
            var4 = var1.method6655();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         int var5 = var1.method6560();
         this.field1729 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field1729[var6] = var1.method6655();
            if (this.field1729[var6] == 65535) {
               this.field1729[var6] = -1;
            }
         }

         this.field1729[var5 + 1] = var4;
      }

   }

   void method2899(Buffer var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2914(var1, var3);
      }
   }

   public final class154 method2888() {
      int var2 = -1;
      if (this.field1728 != -1) {
         var2 = class174.method3506(this.field1728);
      } else if (this.field1715 != -1) {
         var2 = class243.field2910[this.field1715];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field1729.length - 1) {
         var3 = this.field1729[var2];
      } else {
         var3 = this.field1729[this.field1729.length - 1];
      }

      return var3 != -1 ? class155.method2975(var3) : null;
   }

   public class397 method2901() {
      if (this.field1717 < 0) {
         return null;
      } else {
         class397 var2 = (class397)field1707.method4306((long)this.field1717);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class207.method4246(class163.field1913, this.field1717, 0);
            if (var2 != null) {
               field1707.method4308(var2, (long)this.field1717);
            }

            return var2;
         }
      }
   }

   public class397 method2891() {
      if (this.field1720 < 0) {
         return null;
      } else {
         class397 var2 = (class397)field1707.method4306((long)this.field1720);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class207.method4246(class163.field1913, this.field1720, 0);
            if (var2 != null) {
               field1707.method4308(var2, (long)this.field1720);
            }

            return var2;
         }
      }
   }

   public class397 method2892() {
      if (this.field1719 < 0) {
         return null;
      } else {
         class397 var2 = (class397)field1707.method4306((long)this.field1719);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class207.method4246(class163.field1913, this.field1719, 0);
            if (var2 != null) {
               field1707.method4308(var2, (long)this.field1719);
            }

            return var2;
         }
      }
   }

   public class397 method2893() {
      if (this.field1718 < 0) {
         return null;
      } else {
         class397 var2 = (class397)field1707.method4306((long)this.field1718);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class207.method4246(class163.field1913, this.field1718, 0);
            if (var2 != null) {
               field1707.method4308(var2, (long)this.field1718);
            }

            return var2;
         }
      }
   }

   public class301 method2894() {
      if (this.field1714 == -1) {
         return null;
      } else {
         class301 var2 = (class301)field1709.method4306((long)this.field1714);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class251.method4762(class163.field1913, field1732, this.field1714, 0);
            if (var2 != null) {
               field1709.method4308(var2, (long)this.field1714);
            }

            return var2;
         }
      }
   }

   public String method2889(int var1) {
      String var3 = this.field1724;

      while(true) {
         int var4 = var3.indexOf("%1");
         if (var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + class240.method4607(var1, false) + var3.substring(var4 + 2);
      }
   }

   static long method2919(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   static void method2912() {
      if (class367.field4127 != null) {
         client.field679 = client.field451;
         class367.field4127.method5105();

         for(int var1 = 0; var1 < client.field523.length; ++var1) {
            if (client.field523[var1] != null) {
               class367.field4127.method5104((client.field523[var1].field1068 >> 7) + class280.field3624, (client.field523[var1].field1058 >> 7) + class77.field1133);
            }
         }
      }

   }
}
