public class class143 extends class348 {
   public static class222 field1579;
   public static class222 field1580;
   static class276 field1590;
   int field1584;
   int field1587;
   public int field1578;
   public int field1582;
   public int field1583;
   public int field1585;
   public int field1586;
   public int field1588;
   public int field1589;
   public int field1591;

   static {
      field1579 = new class222(64);
      field1580 = new class222(64);
   }

   class143() {
      this.field1582 = 255;
      this.field1588 = 255;
      this.field1583 = -1;
      this.field1585 = 1;
      this.field1586 = 70;
      this.field1587 = -1;
      this.field1584 = -1;
      this.field1589 = 30;
      this.field1591 = 0;
   }

   void method2713(Buffer var1, int var2) {
      if (var2 == 1) {
         var1.method6655();
      } else if (var2 == 2) {
         this.field1582 = var1.method6560();
      } else if (var2 == 3) {
         this.field1588 = var1.method6560();
      } else if (var2 == 4) {
         this.field1583 = 0;
      } else if (var2 == 5) {
         this.field1586 = var1.method6655();
      } else if (var2 == 6) {
         var1.method6560();
      } else if (var2 == 7) {
         this.field1587 = var1.method6577();
      } else if (var2 == 8) {
         this.field1584 = var1.method6577();
      } else if (var2 == 11) {
         this.field1583 = var1.method6655();
      } else if (var2 == 14) {
         this.field1589 = var1.method6560();
      } else if (var2 == 15) {
         this.field1591 = var1.method6560();
      }

   }

   void method2722(Buffer var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2713(var1, var3);
      }
   }

   public class397 method2715() {
      if (this.field1584 < 0) {
         return null;
      } else {
         class397 var2 = (class397)field1580.method4306((long)this.field1584);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class207.method4246(field1590, this.field1584, 0);
            if (var2 != null) {
               field1580.method4308(var2, (long)this.field1584);
            }

            return var2;
         }
      }
   }

   public class397 method2726() {
      if (this.field1587 < 0) {
         return null;
      } else {
         class397 var2 = (class397)field1580.method4306((long)this.field1587);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class207.method4246(field1590, this.field1587, 0);
            if (var2 != null) {
               field1580.method4308(var2, (long)this.field1587);
            }

            return var2;
         }
      }
   }

   static final boolean method2730(class248 var0) {
      if (var0.field3098 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.field3098.length; ++var2) {
            int var3 = class130.method2549(var0, var2);
            int var4 = var0.field3081[var2];
            if (var0.field3098[var2] == 2) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var0.field3098[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var0.field3098[var2] == 4) {
               if (var3 == var4) {
                  return false;
               }
            } else if (var4 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   static int method2729(int var0, class58 var1, boolean var2) {
      int var4;
      if (var0 == 3500) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = class114.method2349(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = class267.method4844(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         var4 = class50.field746[--class50.field745];
         class50.field746[++class50.field745 - 1] = class120.method2416(var4) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }
}
