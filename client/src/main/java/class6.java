import java.awt.Font;

public class class6 implements class289 {
   public static final class6 field16;
   static class68 field13;
   static class73 field15;
   static int field14;
   static Font field12;
   final int field20;
   public final int field10;

   static {
      field16 = new class6(0, 0);
   }

   class6(int var1, int var2) {
      this.field10 = var1;
      this.field20 = var2;
   }

   public int vmethod6962() {
      return this.field20;
   }

   public static int method43(int var0) {
      return var0 >> 17 & 7;
   }

   static int method38(int var0, class58 var1, boolean var2) {
      class248 var4 = var2 ? class285.field3659 : class50.field749;
      if (var0 == 1600) {
         class50.field746[++class50.field745 - 1] = var4.field3053;
         return 1;
      } else if (var0 == 1601) {
         class50.field746[++class50.field745 - 1] = var4.field2967;
         return 1;
      } else if (var0 == 1602) {
         class50.field737[++class1.field3 - 1] = var4.field3041;
         return 1;
      } else if (var0 == 1603) {
         class50.field746[++class50.field745 - 1] = var4.field2980;
         return 1;
      } else if (var0 == 1604) {
         class50.field746[++class50.field745 - 1] = var4.field3090;
         return 1;
      } else if (var0 == 1605) {
         class50.field746[++class50.field745 - 1] = var4.field2999;
         return 1;
      } else if (var0 == 1606) {
         class50.field746[++class50.field745 - 1] = var4.field3008;
         return 1;
      } else if (var0 == 1607) {
         class50.field746[++class50.field745 - 1] = var4.field3010;
         return 1;
      } else if (var0 == 1608) {
         class50.field746[++class50.field745 - 1] = var4.field3009;
         return 1;
      } else if (var0 == 1609) {
         class50.field746[++class50.field745 - 1] = var4.field2988;
         return 1;
      } else if (var0 == 1610) {
         class50.field746[++class50.field745 - 1] = var4.field3102;
         return 1;
      } else if (var0 == 1611) {
         class50.field746[++class50.field745 - 1] = var4.field2982;
         return 1;
      } else if (var0 == 1612) {
         class50.field746[++class50.field745 - 1] = var4.field2983;
         return 1;
      } else if (var0 == 1613) {
         class50.field746[++class50.field745 - 1] = var4.field3070.vmethod6962();
         return 1;
      } else if (var0 == 1614) {
         class50.field746[++class50.field745 - 1] = var4.field3015 ? 1 : 0;
         return 1;
      } else if (var0 != 1615 && var0 != 1616) {
         return 2;
      } else {
         ++class50.field745;
         return 1;
      }
   }
}
