public class class11 implements class32 {
   public static int field70;
   static class276 field71;
   static int field68;

   class11() {
   }

   public class24 vmethod732() {
      return new class13();
   }

   static char method109(char var0) {
      switch(var0) {
      case ' ':
      case '-':
      case '_':
      case '\u00a0':
         return '_';
      case '#':
      case '[':
      case ']':
         return var0;
      case '\u00c0':
      case '\u00c1':
      case '\u00c2':
      case '\u00c3':
      case '\u00c4':
      case '\u00e0':
      case '\u00e1':
      case '\u00e2':
      case '\u00e3':
      case '\u00e4':
         return 'a';
      case '\u00c7':
      case '\u00e7':
         return 'c';
      case '\u00c8':
      case '\u00c9':
      case '\u00ca':
      case '\u00cb':
      case '\u00e8':
      case '\u00e9':
      case '\u00ea':
      case '\u00eb':
         return 'e';
      case '\u00cd':
      case '\u00ce':
      case '\u00cf':
      case '\u00ed':
      case '\u00ee':
      case '\u00ef':
         return 'i';
      case '\u00d1':
      case '\u00f1':
         return 'n';
      case '\u00d2':
      case '\u00d3':
      case '\u00d4':
      case '\u00d5':
      case '\u00d6':
      case '\u00f2':
      case '\u00f3':
      case '\u00f4':
      case '\u00f5':
      case '\u00f6':
         return 'o';
      case '\u00d9':
      case '\u00da':
      case '\u00db':
      case '\u00dc':
      case '\u00f9':
      case '\u00fa':
      case '\u00fb':
      case '\u00fc':
         return 'u';
      case '\u00df':
         return 'b';
      case '\u00ff':
      case '\u0178':
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }

   static final void method112(String var0, boolean var1) {
      if (client.field522) {
         byte var3 = 4;
         int var4 = var3 + 6;
         int var5 = var3 + 6;
         int var6 = class257.field3164.method5421(var0, 250);
         int var7 = class257.field3164.method5401(var0, 250) * 13;
         class393.method6880(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 0);
         class393.method6907(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var3 + var7, 16777215);
         class257.field3164.method5376(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
         int var8 = var4 - var3;
         int var9 = var5 - var3;
         int var10 = var6 + var3 + var3;
         int var11 = var3 + var7 + var3;

         for(int var12 = 0; var12 < client.field590; ++var12) {
            if (client.field621[var12] + client.field622[var12] > var8 && client.field622[var12] < var10 + var8 && client.field618[var12] + client.field625[var12] > var9 && client.field625[var12] < var11 + var9) {
               client.field616[var12] = true;
            }
         }

         if (var1) {
            class263.field3193.vmethod6948(0, 0);
         } else {
            class147.method2761(var4, var5, var6, var7);
         }

      }
   }
}
