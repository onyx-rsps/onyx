import java.util.Locale;

public class class291 implements class289 {
   public static final class291 field3685;
   public static final class291 field3690;
   public static final class291 field3693;
   static class274 field3692;
   static int field3694;
   static final class291 field3681;
   static final class291 field3683;
   static final class291 field3684;
   static final class291 field3686;
   static final class291[] field3682;
   final int field3680;
   final String field3687;
   final String field3688;

   static {
      field3693 = new class291("EN", "en", "English", class292.field3715, 0, "GB");
      field3681 = new class291("DE", "de", "German", class292.field3715, 1, "DE");
      field3690 = new class291("FR", "fr", "French", class292.field3715, 2, "FR");
      field3683 = new class291("PT", "pt", "Portuguese", class292.field3715, 3, "BR");
      field3684 = new class291("NL", "nl", "Dutch", class292.field3700, 4, "NL");
      field3685 = new class291("ES", "es", "Spanish", class292.field3700, 5, "ES");
      field3686 = new class291("ES_MX", "es-mx", "Spanish (Latin American)", class292.field3715, 6, "MX");
      class291[] var0 = method5139();
      field3682 = new class291[var0.length];
      class291[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class291 var3 = var1[var2];
         if (field3682[var3.field3680] != null) {
            throw new IllegalStateException();
         }

         field3682[var3.field3680] = var3;
      }

   }

   class291(String var1, String var2, String var3, class292 var4, int var5, String var6) {
      this.field3687 = var1;
      this.field3688 = var2;
      this.field3680 = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   String method5135() {
      return this.field3688;
   }

   public int vmethod6962() {
      return this.field3680;
   }

   public String toString() {
      return this.method5135().toLowerCase(Locale.ENGLISH);
   }

   public static class291 method5137(int var0) {
      return var0 >= 0 && var0 < field3682.length ? field3682[var0] : null;
   }

   public static void method5149(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         short var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method5149(var0, var1, var2, var6 - 1);
         method5149(var0, var1, var6 + 1, var3);
      }

   }

   static class291[] method5139() {
      return new class291[]{field3683, field3690, field3681, field3685, field3693, field3686, field3684};
   }

   static void method5153(int var0, int var1) {
      int[] var3 = new int[4];
      int[] var4 = new int[4];
      var3[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var6 = 0; var6 < 4; ++var6) {
         if (class47.field695[var6] != var0) {
            var3[var5] = class47.field695[var6];
            var4[var5] = class47.field694[var6];
            ++var5;
         }
      }

      class47.field695 = var3;
      class47.field694 = var4;
      class83.method1973(class15.field85, 0, class15.field85.length - 1, class47.field695, class47.field694);
   }

   static class80[] method5152() {
      return new class80[]{class80.field1153, class80.field1157, class80.field1155, class80.field1156, class80.field1159};
   }

   static final void method5155(int var0, int var1, int var2) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            class61.field910[var0][var4 + var1][var5 + var2] = 0;
         }
      }

      if (var1 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            class61.field910[var0][var1][var4 + var2] = class61.field910[var0][var1 - 1][var4 + var2];
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            class61.field910[var0][var4 + var1][var2] = class61.field910[var0][var4 + var1][var2 - 1];
         }
      }

      if (var1 > 0 && class61.field910[var0][var1 - 1][var2] != 0) {
         class61.field910[var0][var1][var2] = class61.field910[var0][var1 - 1][var2];
      } else if (var2 > 0 && class61.field910[var0][var1][var2 - 1] != 0) {
         class61.field910[var0][var1][var2] = class61.field910[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && class61.field910[var0][var1 - 1][var2 - 1] != 0) {
         class61.field910[var0][var1][var2] = class61.field910[var0][var1 - 1][var2 - 1];
      }

   }
}
