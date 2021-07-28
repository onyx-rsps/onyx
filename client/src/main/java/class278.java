import java.util.zip.CRC32;

public class class278 {
   public static byte field3613;
   public static class275[] field3612;
   public static class276 field3595;
   public static class295 field3602;
   public static class330 field3614;
   public static class364 field3598;
   public static class364 field3600;
   public static class364 field3611;
   public static class385 field3603;
   public static class385 field3608;
   public static int field3596;
   public static int field3599;
   public static int field3601;
   public static int field3604;
   public static int field3605;
   public static int field3606;
   public static int field3607;
   public static int field3609;
   public static CRC32 field3610;
   public static long field3597;
   static class364 field3615;

   static {
      field3596 = 0;
      field3598 = new class364(4096);
      field3599 = 0;
      field3600 = new class364(32);
      field3607 = 0;
      field3602 = new class295();
      field3615 = new class364(4096);
      field3604 = 0;
      field3611 = new class364(4096);
      field3606 = 0;
      field3608 = new class385(8);
      field3609 = 0;
      field3610 = new CRC32();
      field3612 = new class275[256];
      field3613 = 0;
      field3601 = 0;
      field3605 = 0;
   }

   public static int method4502(CharSequence var0) {
      return class44.method772(var0, 10, true);
   }

   static final boolean method4503(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = class208.field2476 + var6;
      if (var8 < var0 && var8 < var1 && var8 < var2) {
         return false;
      } else {
         var8 = class208.field2476 - var6;
         if (var8 > var0 && var8 > var1 && var8 > var2) {
            return false;
         } else {
            var8 = var6 + class208.field2488;
            if (var8 < var3 && var8 < var4 && var8 < var5) {
               return false;
            } else {
               var8 = class208.field2488 - var6;
               return var8 <= var3 || var8 <= var4 || var8 <= var5;
            }
         }
      }
   }
}
