public class class320 extends class327 {
   boolean field3841;
   boolean field3842;

   class320() {
   }

   int method5674(class320 var1) {
      if (super.field3864 == client.field404 && client.field404 != var1.field3864) {
         return -1;
      } else if (client.field404 == var1.field3864 && super.field3864 != client.field404) {
         return 1;
      } else if (super.field3864 != 0 && var1.field3864 == 0) {
         return -1;
      } else if (var1.field3864 != 0 && super.field3864 == 0) {
         return 1;
      } else if (this.field3842 && !var1.field3842) {
         return -1;
      } else if (!this.field3842 && var1.field3842) {
         return 1;
      } else if (this.field3841 && !var1.field3841) {
         return -1;
      } else if (!this.field3841 && var1.field3841) {
         return 1;
      } else {
         return super.field3864 != 0 ? super.field3868 * -2065584103 - var1.field3868 * -2065584103 : var1.field3868 * -2065584103 - super.field3868 * -2065584103;
      }
   }

   public int vmethod5812(class323 var1) {
      return this.method5674((class320)var1);
   }

   public int compareTo(Object var1) {
      return this.method5674((class320)var1);
   }
}
