public class class285 {
   static class248 field3659;
   byte field3654;
   public int field3652;
   public int field3653;
   public int field3655;
   public int field3656;
   public int field3658;

   public class285() {
   }

   public class285(Buffer var1, boolean var2) {
      this.field3654 = var1.method6561();
      this.field3653 = var1.method6655();
      this.field3655 = var1.method6784();
      this.field3652 = var1.method6784();
      this.field3656 = var1.method6784();
      this.field3658 = var1.method6784();
   }

   void method5079(int var1) {
      this.field3654 &= -8;
      this.field3654 = (byte)(this.field3654 | var1 & 7);
   }

   void method5080(int var1) {
      this.field3654 &= -9;
      if (var1 == 1) {
         this.field3654 = (byte)(this.field3654 | 8);
      }

   }

   public int method5081() {
      return (this.field3654 & 8) == 8 ? 1 : 0;
   }

   public int method5078() {
      return this.field3654 & 7;
   }

   public static String method5089(String var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];
      byte var4 = 2;

      for(int var5 = 0; var5 < var2; ++var5) {
         char var6 = var0.charAt(var5);
         if (var4 == 0) {
            var6 = Character.toLowerCase(var6);
         } else if (var4 == 2 || Character.isUpperCase(var6)) {
            var6 = class136.method2610(var6);
         }

         if (Character.isLetter(var6)) {
            var4 = 0;
         } else if (var6 != '.' && var6 != '?' && var6 != '!') {
            if (Character.isSpaceChar(var6)) {
               if (var4 != 2) {
                  var4 = 1;
               }
            } else {
               var4 = 1;
            }
         } else {
            var4 = 2;
         }

         var3[var5] = var6;
      }

      return new String(var3);
   }

   static void method5090() {
      class84.field1195.clear();
      class84.field1193.method6296();
      class84.field1194.method5323();
      class84.field1199 = 0;
   }
}
