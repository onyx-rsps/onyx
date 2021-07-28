public class class150 extends class348 {
   public static class222 field1679;
   public static class276 field1682;
   public static int field1686;
   static class397[] field1678;
   int field1680;
   public int field1681;
   public int field1683;
   public int field1684;
   public int field1685;

   static {
      field1679 = new class222(64);
   }

   public class150() {
      this.field1680 = 0;
   }

   void method2807(int var1) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0D;
      double var5 = (double)(var1 >> 8 & 255) / 256.0D;
      double var7 = (double)(var1 & 255) / 256.0D;
      double var9 = var3;
      if (var5 < var3) {
         var9 = var5;
      }

      if (var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if (var5 > var3) {
         var11 = var5;
      }

      if (var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = (var9 + var11) / 2.0D;
      if (var9 != var11) {
         if (var17 < 0.5D) {
            var15 = (var11 - var9) / (var9 + var11);
         }

         if (var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if (var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var5 == var11) {
            var13 = 2.0D + (var7 - var3) / (var11 - var9);
         } else if (var7 == var11) {
            var13 = 4.0D + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0D;
      this.field1685 = (int)(var15 * 256.0D);
      this.field1683 = (int)(var17 * 256.0D);
      if (this.field1685 < 0) {
         this.field1685 = 0;
      } else if (this.field1685 > 255) {
         this.field1685 = 255;
      }

      if (this.field1683 < 0) {
         this.field1683 = 0;
      } else if (this.field1683 > 255) {
         this.field1683 = 255;
      }

      if (var17 > 0.5D) {
         this.field1684 = (int)(var15 * (1.0D - var17) * 512.0D);
      } else {
         this.field1684 = (int)(var15 * var17 * 512.0D);
      }

      if (this.field1684 < 1) {
         this.field1684 = 1;
      }

      this.field1681 = (int)(var13 * (double)this.field1684);
   }

   void method2810(class384 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field1680 = var1.method6564();
      }

   }

   public void method2808() {
      this.method2807(this.field1680);
   }

   public void method2809(class384 var1, int var2) {
      while(true) {
         int var4 = var1.method6560();
         if (var4 == 0) {
            return;
         }

         this.method2810(var1, var4, var2);
      }
   }

   static void method2815(int var0, int var1) {
      int var3 = class129.field1467.method5367("Choose Option");

      int var4;
      for(var4 = 0; var4 < client.field544 * -286331153; ++var4) {
         class301 var5 = class129.field1467;
         String var6;
         if (var4 < 0) {
            var6 = "";
         } else if (client.field550[var4].length() > 0) {
            var6 = client.field484[var4] + " " + client.field550[var4];
         } else {
            var6 = client.field484[var4];
         }

         int var7 = var5.method5367(var6);
         if (var7 > var3) {
            var3 = var7;
         }
      }

      var3 += 8;
      var4 = client.field544 + 22;
      int var8 = var0 - var3 / 2;
      if (var3 + var8 > class68.field970) {
         var8 = class68.field970 - var3;
      }

      if (var8 < 0) {
         var8 = 0;
      }

      int var9 = var1;
      if (var4 + var1 > client.field686) {
         var9 = client.field686 - var4;
      }

      if (var9 < 0) {
         var9 = 0;
      }

      class149.field1658 = var8;
      class334.field3906 = var9;
      class11.field68 = var3;
      class51.field771 = client.field544 + 22;
   }

   static boolean method2824(class248 var0) {
      return var0.field2977;
   }

   public static void method2823(boolean var0) {
      if (var0 != class144.field1594) {
         class151.method2829();
         class144.field1594 = var0;
      }

   }
}
