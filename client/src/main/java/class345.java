public class class345 {
   static final int[] field3941;
   static final int[] field3945;

   static {
      field3941 = new int[16384];
      field3945 = new int[16384];
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field3941[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
         field3945[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
      }

   }

   static final void method6005(class248 var0, int var1, int var2, int var3) {
      class242 var5 = var0.method4690(false);
      if (var5 != null) {
         if (client.field645 < 3) {
            class49.field735.method7016(var1, var2, var5.field2909, var5.field2905, 25, 25, client.field444, 256, var5.field2907, var5.field2904);
         } else {
            class393.method6892(var1, var2, 0, var5.field2907, var5.field2904);
         }

      }
   }
}
