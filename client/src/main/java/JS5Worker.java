import java.util.zip.CRC32;

public class JS5Worker {
   public static byte field3613;
   public static class275[] field3612;
   public static CacheBuffer field3595;
   public static class295 field3602;
   public static class330 connection;
   public static class364 pendingPriority;
   public static class364 pendingPriorityReceived;
   public static class364 field3611;
   public static Buffer field3603;
   public static Buffer field3608;
   public static int latency;
   public static int pendingPriorityCount;
   public static int crcMismatchCount;
   public static int pendingCount;
   public static int field3605;
   public static int pendingResponseCount;
   public static int pendingPriorityResponseCount;
   public static int field3609;
   public static CRC32 field3610;
   public static long lastAttemptTime;
   static class364 field3615;

   static {
      latency = 0;
      pendingPriority = new class364(4096);
      pendingPriorityCount = 0;
      pendingPriorityReceived = new class364(32);
      pendingPriorityResponseCount = 0;
      field3602 = new class295();
      field3615 = new class364(4096);
      pendingCount = 0;
      field3611 = new class364(4096);
      pendingResponseCount = 0;
      field3608 = new Buffer(8);
      field3609 = 0;
      field3610 = new CRC32();
      field3612 = new class275[256];
      field3613 = 0;
      crcMismatchCount = 0;
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
