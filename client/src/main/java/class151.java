import java.lang.management.GarbageCollectorMXBean;

public class class151 extends class348 {
   public static class222 field1688;
   public static class276 field1691;
   static GarbageCollectorMXBean field1693;
   static final int[] field1690;
   public int field1687;
   public int field1689;
   public int field1694;

   static {
      field1688 = new class222(64);
      field1690 = new int[32];
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field1690[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public class151() {
   }

   void method2828(class384 var1, int var2) {
      if (var2 == 1) {
         this.field1689 = var1.method6655();
         this.field1694 = var1.method6560();
         this.field1687 = var1.method6560();
      }

   }

   public void method2827(class384 var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2828(var1, var3);
      }
   }

   public static void method2829() {
      class156.field1789.method4309();
      class156.field1790.method4309();
      class156.field1836.method4309();
   }

   static char method2836(char var0, class291 var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && var1 != class291.field3685) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (var0 == 241 && var1 != class291.field3685) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else {
         return var0 == 376 ? 'Y' : var0;
      }
   }
}
