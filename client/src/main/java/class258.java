public class class258 implements class290 {
   public static final class258 field3140;
   public static final class258 field3143;
   public static final class258 field3149;
   public static final class258 field3160;
   public static final class258 field3162;
   static class302 field3165;
   static final class258 field3141;
   static final class258 field3142;
   static final class258 field3144;
   static final class258 field3145;
   static final class258 field3146;
   static final class258 field3147;
   static final class258 field3148;
   static final class258 field3150;
   static final class258 field3151;
   static final class258 field3152;
   static final class258 field3153;
   static final class258 field3154;
   static final class258 field3155;
   static final class258 field3156;
   static final class258 field3157;
   static final class258 field3158;
   static final class258 field3159;
   static final class258 field3161;
   public final int field3163;

   static {
      field3149 = new class258(0);
      field3141 = new class258(1);
      field3140 = new class258(2);
      field3143 = new class258(3);
      field3160 = new class258(9);
      field3161 = new class258(4);
      field3142 = new class258(5);
      field3145 = new class258(6);
      field3148 = new class258(7);
      field3146 = new class258(8);
      field3150 = new class258(12);
      field3144 = new class258(13);
      field3152 = new class258(14);
      field3153 = new class258(15);
      field3147 = new class258(16);
      field3155 = new class258(17);
      field3156 = new class258(18);
      field3157 = new class258(19);
      field3158 = new class258(20);
      field3159 = new class258(21);
      field3151 = new class258(10);
      field3154 = new class258(11);
      field3162 = new class258(22);
   }

   static final void method4324(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }

   }

   static int method4326(int var0, int var1) {
      class65 var3 = (class65)class65.field935.method5746((long)var0);
      if (var3 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.field932.length; ++var5) {
            if (var3.field931[var5] == var1) {
               var4 += var3.field932[var5];
            }
         }

         return var4;
      }
   }

   class258(int var1) {
      this.field3163 = var1;
   }

   static class264[] method4330() {
      return new class264[]{class264.field3192, class264.field3190};
   }

   public int method4619() {
      return this.field3163;
   }
}
