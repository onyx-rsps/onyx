import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class class263 {
   public static class394 field3193;
   static final class263 field3189;
   static final class263 field3191;
   final int field3190;
   final int field3192;

   static {
      field3191 = new class263(51, 27, 800, 0, 16, 16);
      field3189 = new class263(25, 28, 800, 656, 40, 40);
   }

   class263(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field3190 = var5;
      this.field3192 = var6;
   }

   public static int method4824(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var7 + var1);
         if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
            if (var8 == 8364) {
               var3[var7 + var4] = -128;
            } else if (var8 == 8218) {
               var3[var7 + var4] = -126;
            } else if (var8 == 402) {
               var3[var7 + var4] = -125;
            } else if (var8 == 8222) {
               var3[var7 + var4] = -124;
            } else if (var8 == 8230) {
               var3[var7 + var4] = -123;
            } else if (var8 == 8224) {
               var3[var7 + var4] = -122;
            } else if (var8 == 8225) {
               var3[var7 + var4] = -121;
            } else if (var8 == 710) {
               var3[var7 + var4] = -120;
            } else if (var8 == 8240) {
               var3[var7 + var4] = -119;
            } else if (var8 == 352) {
               var3[var7 + var4] = -118;
            } else if (var8 == 8249) {
               var3[var7 + var4] = -117;
            } else if (var8 == 338) {
               var3[var7 + var4] = -116;
            } else if (var8 == 381) {
               var3[var7 + var4] = -114;
            } else if (var8 == 8216) {
               var3[var7 + var4] = -111;
            } else if (var8 == 8217) {
               var3[var7 + var4] = -110;
            } else if (var8 == 8220) {
               var3[var7 + var4] = -109;
            } else if (var8 == 8221) {
               var3[var7 + var4] = -108;
            } else if (var8 == 8226) {
               var3[var7 + var4] = -107;
            } else if (var8 == 8211) {
               var3[var7 + var4] = -106;
            } else if (var8 == 8212) {
               var3[var7 + var4] = -105;
            } else if (var8 == 732) {
               var3[var7 + var4] = -104;
            } else if (var8 == 8482) {
               var3[var7 + var4] = -103;
            } else if (var8 == 353) {
               var3[var7 + var4] = -102;
            } else if (var8 == 8250) {
               var3[var7 + var4] = -101;
            } else if (var8 == 339) {
               var3[var7 + var4] = -100;
            } else if (var8 == 382) {
               var3[var7 + var4] = -98;
            } else if (var8 == 376) {
               var3[var7 + var4] = -97;
            } else {
               var3[var7 + var4] = 63;
            }
         } else {
            var3[var7 + var4] = (byte)var8;
         }
      }

      return var6;
   }

   protected static int method4823() {
      int var1 = 0;
      if (class151.field1693 == null || !class151.field1693.isValid()) {
         try {
            Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var2.hasNext()) {
               GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
               if (var3.isValid()) {
                  class151.field1693 = var3;
                  class18.field126 = -1L;
                  class18.field122 = -1L;
               }
            }
         } catch (Throwable var12) {
         }
      }

      if (class151.field1693 != null) {
         long var10 = class86.currentTime();
         long var4 = class151.field1693.getCollectionTime();
         if (-1L != class18.field122) {
            long var6 = var4 - class18.field122;
            long var8 = var10 - class18.field126;
            if (0L != var8) {
               var1 = (int)(100L * var6 / var8);
            }
         }

         class18.field122 = var4;
         class18.field126 = var10;
      }

      return var1;
   }
}
