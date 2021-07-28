public class class104 extends class103 {
   boolean field1298;
   int field1297;
   // $FF: synthetic field
   final class106 this$0;

   class104(class106 var1) {
      this.this$0 = var1;
      this.field1297 = -1;
   }

   void vmethod2499(class114 var1) {
      var1.method2301(this.field1297, this.field1298);
   }

   void vmethod2494(class384 var1) {
      this.field1297 = var1.method6655();
      this.field1298 = var1.method6560() == 1;
   }

   static int method2204(int var0, int var1) {
      class157 var4 = (class157)class157.field1842.method4306((long)var0);
      class157 var3;
      if (var4 != null) {
         var3 = var4;
      } else {
         byte[] var5 = class157.field1854.method4920(4, var0);
         var4 = new class157();
         if (var5 != null) {
            var4.method3051(new class384(var5), var0);
         }

         var4.method3050();
         class157.field1842.method4308(var4, (long)var0);
         var3 = var4;
      }

      if (var3 == null) {
         return var1;
      } else if (var3.field1847 >= 0) {
         return var3.field1847 | -16777216;
      } else {
         int var7;
         if (var3.field1855 >= 0) {
            var7 = class84.method2004(class197.field2268.vmethod4253(var3.field1855), 96);
            return class197.field2267[var7] | -16777216;
         } else if (var3.field1843 == 16711935) {
            return var1;
         } else {
            var7 = class81.method1939(var3.field1846, var3.field1848, var3.field1849);
            int var6 = class84.method2004(var7, 96);
            return class197.field2267[var6] | -16777216;
         }
      }
   }

   static void method2194(int var0) {
      class64 var2 = (class64)class64.field934.method6327((long)var0);
      if (var2 != null) {
         for(int var3 = 0; var3 < var2.field930.length; ++var3) {
            var2.field930[var3] = -1;
            var2.field931[var3] = 0;
         }

      }
   }

   public static byte[] method2197(CharSequence var0) {
      int var2 = var0.length();
      byte[] var3 = new byte[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 > 0 && var5 < 128 || var5 >= 160 && var5 <= 255) {
            var3[var4] = (byte)var5;
         } else if (var5 == 8364) {
            var3[var4] = -128;
         } else if (var5 == 8218) {
            var3[var4] = -126;
         } else if (var5 == 402) {
            var3[var4] = -125;
         } else if (var5 == 8222) {
            var3[var4] = -124;
         } else if (var5 == 8230) {
            var3[var4] = -123;
         } else if (var5 == 8224) {
            var3[var4] = -122;
         } else if (var5 == 8225) {
            var3[var4] = -121;
         } else if (var5 == 710) {
            var3[var4] = -120;
         } else if (var5 == 8240) {
            var3[var4] = -119;
         } else if (var5 == 352) {
            var3[var4] = -118;
         } else if (var5 == 8249) {
            var3[var4] = -117;
         } else if (var5 == 338) {
            var3[var4] = -116;
         } else if (var5 == 381) {
            var3[var4] = -114;
         } else if (var5 == 8216) {
            var3[var4] = -111;
         } else if (var5 == 8217) {
            var3[var4] = -110;
         } else if (var5 == 8220) {
            var3[var4] = -109;
         } else if (var5 == 8221) {
            var3[var4] = -108;
         } else if (var5 == 8226) {
            var3[var4] = -107;
         } else if (var5 == 8211) {
            var3[var4] = -106;
         } else if (var5 == 8212) {
            var3[var4] = -105;
         } else if (var5 == 732) {
            var3[var4] = -104;
         } else if (var5 == 8482) {
            var3[var4] = -103;
         } else if (var5 == 353) {
            var3[var4] = -102;
         } else if (var5 == 8250) {
            var3[var4] = -101;
         } else if (var5 == 339) {
            var3[var4] = -100;
         } else if (var5 == 382) {
            var3[var4] = -98;
         } else if (var5 == 376) {
            var3[var4] = -97;
         } else {
            var3[var4] = 63;
         }
      }

      return var3;
   }
}
