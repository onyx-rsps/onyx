public class class157 extends class348 {
   public static class222 field1842;
   public static class276 field1854;
   static class37 field1841;
   public boolean field1845;
   public int field1843;
   public int field1846;
   public int field1847;
   public int field1848;
   public int field1849;
   public int field1850;
   public int field1851;
   public int field1852;
   public int field1855;

   static {
      field1842 = new class222(64);
   }

   public class157() {
      this.field1843 = 0;
      this.field1855 = -1;
      this.field1845 = true;
      this.field1847 = -1;
   }

   void method3052(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.field1843 = var1.method6564();
      } else if (var2 == 2) {
         this.field1855 = var1.method6560();
      } else if (var2 == 5) {
         this.field1845 = false;
      } else if (var2 == 7) {
         this.field1847 = var1.method6564();
      } else if (var2 == 8) {
      }

   }

   void method3053(int var1) {
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
            var15 = (var11 - var9) / (var11 + var9);
         }

         if (var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if (var11 == var3) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var5 == var11) {
            var13 = (var7 - var3) / (var11 - var9) + 2.0D;
         } else if (var11 == var7) {
            var13 = 4.0D + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0D;
      this.field1846 = (int)(256.0D * var13);
      this.field1848 = (int)(256.0D * var15);
      this.field1849 = (int)(256.0D * var17);
      if (this.field1848 < 0) {
         this.field1848 = 0;
      } else if (this.field1848 > 255) {
         this.field1848 = 255;
      }

      if (this.field1849 < 0) {
         this.field1849 = 0;
      } else if (this.field1849 > 255) {
         this.field1849 = 255;
      }

   }

   public void method3050() {
      if (this.field1847 != -1) {
         this.method3053(this.field1847);
         this.field1850 = this.field1846;
         this.field1851 = this.field1848;
         this.field1852 = this.field1849;
      }

      this.method3053(this.field1843);
   }

   public void method3051(Buffer var1, int var2) {
      while(true) {
         int var4 = var1.method6560();
         if (var4 == 0) {
            return;
         }

         this.method3052(var1, var4, var2);
      }
   }

   public static class401 method3065(int var0) {
      class401[] var2 = new class401[]{class401.field4297, class401.field4299, class401.field4298};
      class401[] var3 = var2;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class401 var5 = var3[var4];
         if (var0 == var5.field4300) {
            return var5;
         }
      }

      return null;
   }
}
