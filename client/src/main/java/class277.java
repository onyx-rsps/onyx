import java.util.zip.CRC32;

public class class277 {
   public static byte field3612;
   public static class274[] field3611;
   public static class275 field3594;
   public static class294 field3601;
   public static class329 field3613;
   public static class363 field3597;
   public static class363 field3599;
   public static class363 field3610;
   public static class384 field3602;
   public static class384 field3607;
   public static int field3595;
   public static int field3598;
   public static int field3600;
   public static int field3603;
   public static int field3604;
   public static int field3605;
   public static int field3606;
   public static int field3608;
   public static CRC32 field3609;
   public static long field3596;
   static class363 field3614;

   static {
      field3595 = 0;
      field3597 = new class363(4096);
      field3598 = 0;
      field3599 = new class363(32);
      field3606 = 0;
      field3601 = new class294();
      field3614 = new class363(4096);
      field3603 = 0;
      field3610 = new class363(4096);
      field3605 = 0;
      field3607 = new class384(8);
      field3608 = 0;
      field3609 = new CRC32();
      field3611 = new class274[256];
      field3612 = 0;
      field3600 = 0;
      field3604 = 0;
   }

   public static int method5010(CharSequence var0) {
      return class43.method852(var0, 10, true);
   }

   static final boolean method5011(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = class207.field2475 + var6;
      if (var8 < var0 && var8 < var1 && var8 < var2) {
         return false;
      } else {
         var8 = class207.field2475 - var6;
         if (var8 > var0 && var8 > var1 && var8 > var2) {
            return false;
         } else {
            var8 = class207.field2487 + var6;
            if (var8 < var3 && var8 < var4 && var8 < var5) {
               return false;
            } else {
               var8 = class207.field2487 - var6;
               return var8 <= var3 || var8 <= var4 || var8 <= var5;
            }
         }
      }
   }
}
