public class class141 extends class348 {
   public static class276 field1560;
   static class222 field1555;
   static class24 field1559;
   public boolean field1556;

   static {
      field1555 = new class222(64);
   }

   class141() {
      this.field1556 = false;
   }

   void method2674(class384 var1, int var2) {
      if (var2 == 2) {
         this.field1556 = true;
      }

   }

   void method2683(class384 var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         this.method2674(var1, var3);
      }
   }

   static final void method2682(class248[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class248 var4 = var0[var3];
         if (var4 != null && var4.field3000 == var1 && (!var4.field2992 || !class150.method2824(var4))) {
            int var6;
            if (var4.field2976 == 0) {
               if (!var4.field2992 && class150.method2824(var4) && var4 != class244.field2922) {
                  continue;
               }

               method2682(var0, var4.field2957);
               if (var4.field3060 != null) {
                  method2682(var4.field3060, var4.field2957);
               }

               class66 var5 = (class66)client.field568.method6327((long)var4.field2957);
               if (var5 != null) {
                  var6 = var5.field949;
                  if (class250.method4757(var6)) {
                     method2682(class248.field3038[var6], -1);
                  }
               }
            }

            if (var4.field2976 == 6) {
               if (var4.field3004 != -1 || var4.field3047 != -1) {
                  boolean var8 = class143.method2730(var4);
                  if (var8) {
                     var6 = var4.field3047;
                  } else {
                     var6 = var4.field3004;
                  }

                  if (var6 != -1) {
                     class158 var7 = class47.method1355(var6);

                     for(var4.field3089 += client.field555; var4.field3089 > var7.field1864[var4.field3093]; class80.method1934(var4)) {
                        var4.field3089 -= var7.field1864[var4.field3093];
                        ++var4.field3093;
                        if (var4.field3093 >= var7.field1862.length) {
                           var4.field3093 -= var7.field1861;
                           if (var4.field3093 < 0 || var4.field3093 >= var7.field1862.length) {
                              var4.field3093 = 0;
                           }
                        }
                     }
                  }
               }

               if (var4.field3013 != 0 && !var4.field2992) {
                  int var9 = var4.field3013 >> 16;
                  var6 = var4.field3013 << 16 >> 16;
                  var9 *= client.field555;
                  var6 *= client.field555;
                  var4.field3008 = var9 + var4.field3008 & 2047;
                  var4.field3009 = var6 + var4.field3009 & 2047;
                  class80.method1934(var4);
               }
            }
         }
      }

   }

   static void method2672() {
      for(class49 var1 = (class49)class49.field719.method5202(); var1 != null; var1 = (class49)class49.field719.method5193()) {
         if (var1.field732 != null) {
            var1.method1429();
         }
      }

   }
}
