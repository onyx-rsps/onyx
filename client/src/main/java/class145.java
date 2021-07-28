public class class145 extends class348 {
   public static boolean field1597;
   public static class276 field1600;
   static class222 field1596;
   public char field1595;
   public char field1598;
   public int field1601;
   public int field1603;
   public int[] field1602;
   public int[] field1605;
   public String field1599;
   public String[] field1604;

   static {
      field1596 = new class222(64);
   }

   class145() {
      this.field1599 = "null";
      this.field1601 = 0;
   }

   void method2744(class384 var1, int var2) {
      if (var2 == 1) {
         this.field1595 = (char)var1.method6560();
      } else if (var2 == 2) {
         this.field1598 = (char)var1.method6560();
      } else if (var2 == 3) {
         this.field1599 = var1.method6569();
      } else if (var2 == 4) {
         this.field1603 = var1.method6784();
      } else {
         int var4;
         if (var2 == 5) {
            this.field1601 = var1.method6655();
            this.field1602 = new int[this.field1601];
            this.field1604 = new String[this.field1601];

            for(var4 = 0; var4 < this.field1601; ++var4) {
               this.field1602[var4] = var1.method6784();
               this.field1604[var4] = var1.method6569();
            }
         } else if (var2 == 6) {
            this.field1601 = var1.method6655();
            this.field1602 = new int[this.field1601];
            this.field1605 = new int[this.field1601];

            for(var4 = 0; var4 < this.field1601; ++var4) {
               this.field1602[var4] = var1.method6784();
               this.field1605[var4] = var1.method6784();
            }
         }
      }

   }

   public int method2742() {
      return this.field1601;
   }

   void method2737(class384 var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2744(var1, var3);
      }
   }
}
