public class class257 implements class289 {
   public static final class257 field3139;
   public static final class257 field3142;
   public static final class257 field3148;
   public static final class257 field3159;
   public static final class257 field3161;
   static class301 field3164;
   static final class257 field3140;
   static final class257 field3141;
   static final class257 field3143;
   static final class257 field3144;
   static final class257 field3145;
   static final class257 field3146;
   static final class257 field3147;
   static final class257 field3149;
   static final class257 field3150;
   static final class257 field3151;
   static final class257 field3152;
   static final class257 field3153;
   static final class257 field3154;
   static final class257 field3155;
   static final class257 field3156;
   static final class257 field3157;
   static final class257 field3158;
   static final class257 field3160;
   public final int field3162;

   static {
      field3148 = new class257(0);
      field3140 = new class257(1);
      field3139 = new class257(2);
      field3142 = new class257(3);
      field3159 = new class257(9);
      field3160 = new class257(4);
      field3141 = new class257(5);
      field3144 = new class257(6);
      field3147 = new class257(7);
      field3145 = new class257(8);
      field3149 = new class257(12);
      field3143 = new class257(13);
      field3151 = new class257(14);
      field3152 = new class257(15);
      field3146 = new class257(16);
      field3154 = new class257(17);
      field3155 = new class257(18);
      field3156 = new class257(19);
      field3157 = new class257(20);
      field3158 = new class257(21);
      field3150 = new class257(10);
      field3153 = new class257(11);
      field3161 = new class257(22);
   }

   class257(int var1) {
      this.field3162 = var1;
   }

   public int vmethod6962() {
      return this.field3162;
   }

   static class263[] method4814() {
      return new class263[]{class263.field3191, class263.field3189};
   }

   static final void method4803(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }

   }

   static int method4810(int var0, int var1) {
      class64 var3 = (class64)class64.field934.method6327((long)var0);
      if (var3 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.field931.length; ++var5) {
            if (var3.field930[var5] == var1) {
               var4 += var3.field931[var5];
            }
         }

         return var4;
      }
   }
}
