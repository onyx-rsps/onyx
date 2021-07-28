public class class346 {
   static final int[] field3942;
   static final int[] field3946;

   static {
      field3942 = new int[16384];
      field3946 = new int[16384];
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field3942[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
         field3946[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
      }

   }

   static final void method5428(class249 var0, int var1, int var2, int var3) {
      class243 var5 = var0.method4227(false);
      if (var5 != null) {
         if (client.field646 < 3) {
            class50.field736.method6396(var1, var2, var5.field2910, var5.field2906, 25, 25, client.field445, 256, var5.field2908, var5.field2905);
         } else {
            class394.method6277(var1, var2, 0, var5.field2908, var5.field2905);
         }

      }
   }
}
