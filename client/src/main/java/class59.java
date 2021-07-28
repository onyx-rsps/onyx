public class class59 extends class200 {
   class158 field884;
   int field879;
   int field880;
   int field881;
   int field882;
   int field883;
   int field885;
   int field886;
   int field889;

   class59(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class200 var9) {
      this.field883 = var1;
      this.field879 = var2;
      this.field880 = var3;
      this.field889 = var4;
      this.field882 = var5;
      this.field885 = var6;
      if (var7 != -1) {
         this.field884 = class47.method1355(var7);
         this.field881 = 0;
         this.field886 = client.field451 - 1;
         if (this.field884.field1875 == 0 && var9 != null && var9 instanceof class59) {
            class59 var10 = (class59)var9;
            if (var10.field884 == this.field884) {
               this.field881 = var10.field881;
               this.field886 = var10.field886;
               return;
            }
         }

         if (var8 && this.field884.field1861 != -1) {
            this.field881 = (int)(Math.random() * (double)this.field884.field1862.length);
            this.field886 -= (int)(Math.random() * (double)this.field884.field1864[this.field881]);
         }
      }

   }

   protected final class206 vmethod4091() {
      if (this.field884 != null) {
         int var2 = client.field451 - this.field886;
         if (var2 > 100 && this.field884.field1861 > 0) {
            var2 = 100;
         }

         label46: {
            do {
               do {
                  if (var2 <= this.field884.field1864[this.field881]) {
                     break label46;
                  }

                  var2 -= this.field884.field1864[this.field881];
                  ++this.field881;
               } while(this.field881 < this.field884.field1862.length);

               this.field881 -= this.field884.field1861;
            } while(this.field881 >= 0 && this.field881 < this.field884.field1862.length);

            this.field884 = null;
         }

         this.field886 = client.field451 - var2;
      }

      class155 var13 = class123.method2465(this.field883);
      if (var13.field1761 != null) {
         var13 = var13.method2931();
      }

      if (var13 == null) {
         return null;
      } else {
         int var3;
         int var4;
         if (this.field880 != 1 && this.field880 != 3) {
            var3 = var13.field1749;
            var4 = var13.field1750;
         } else {
            var3 = var13.field1750;
            var4 = var13.field1749;
         }

         int var5 = (var3 >> 1) + this.field882;
         int var6 = (var3 + 1 >> 1) + this.field882;
         int var7 = (var4 >> 1) + this.field885;
         int var8 = (var4 + 1 >> 1) + this.field885;
         int[][] var9 = class61.field910[this.field889];
         int var10 = var9[var6][var7] + var9[var5][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
         int var11 = (this.field882 << 7) + (var3 << 6);
         int var12 = (this.field885 << 7) + (var4 << 6);
         return var13.method2928(this.field879, this.field880, var9, var11, var10, var12, this.field884, this.field881);
      }
   }

   public static void method1659() {
      class234.field2815.method4406();
      class234.field2818 = 1;
      class234.field2819 = null;
   }
}
