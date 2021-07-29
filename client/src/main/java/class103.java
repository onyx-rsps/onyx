public abstract class class103 extends class353 {
   static class123 field1293;
   static int field1294;

   class103() {
   }

   abstract void vmethod2499(class114 var1);

   abstract void vmethod2494(Buffer var1);

   public static int method2182(int var0) {
      return var0 >> 11 & 63;
   }

   public static class228 method2190(int var0, String var1, class291 var2, int var3) {
      class228 var5 = class148.method2788(class226.field2643, client.field452.field1204);
      var5.field2690.writeByte(0);
      int var6 = var5.field2690.field4181 * -1084587701;
      var5.field2690.writeByte(var0);
      String var7 = var1.toLowerCase();
      byte var8 = 0;
      if (var7.startsWith("yellow:")) {
         var8 = 0;
         var1 = var1.substring("yellow:".length());
      } else if (var7.startsWith("red:")) {
         var8 = 1;
         var1 = var1.substring("red:".length());
      } else if (var7.startsWith("green:")) {
         var8 = 2;
         var1 = var1.substring("green:".length());
      } else if (var7.startsWith("cyan:")) {
         var8 = 3;
         var1 = var1.substring("cyan:".length());
      } else if (var7.startsWith("purple:")) {
         var8 = 4;
         var1 = var1.substring("purple:".length());
      } else if (var7.startsWith("white:")) {
         var8 = 5;
         var1 = var1.substring("white:".length());
      } else if (var7.startsWith("flash1:")) {
         var8 = 6;
         var1 = var1.substring("flash1:".length());
      } else if (var7.startsWith("flash2:")) {
         var8 = 7;
         var1 = var1.substring("flash2:".length());
      } else if (var7.startsWith("flash3:")) {
         var8 = 8;
         var1 = var1.substring("flash3:".length());
      } else if (var7.startsWith("glow1:")) {
         var8 = 9;
         var1 = var1.substring("glow1:".length());
      } else if (var7.startsWith("glow2:")) {
         var8 = 10;
         var1 = var1.substring("glow2:".length());
      } else if (var7.startsWith("glow3:")) {
         var8 = 11;
         var1 = var1.substring("glow3:".length());
      } else if (var2 != class291.field3693) {
         if (var7.startsWith("yellow:")) {
            var8 = 0;
            var1 = var1.substring("yellow:".length());
         } else if (var7.startsWith("red:")) {
            var8 = 1;
            var1 = var1.substring("red:".length());
         } else if (var7.startsWith("green:")) {
            var8 = 2;
            var1 = var1.substring("green:".length());
         } else if (var7.startsWith("cyan:")) {
            var8 = 3;
            var1 = var1.substring("cyan:".length());
         } else if (var7.startsWith("purple:")) {
            var8 = 4;
            var1 = var1.substring("purple:".length());
         } else if (var7.startsWith("white:")) {
            var8 = 5;
            var1 = var1.substring("white:".length());
         } else if (var7.startsWith("flash1:")) {
            var8 = 6;
            var1 = var1.substring("flash1:".length());
         } else if (var7.startsWith("flash2:")) {
            var8 = 7;
            var1 = var1.substring("flash2:".length());
         } else if (var7.startsWith("flash3:")) {
            var8 = 8;
            var1 = var1.substring("flash3:".length());
         } else if (var7.startsWith("glow1:")) {
            var8 = 9;
            var1 = var1.substring("glow1:".length());
         } else if (var7.startsWith("glow2:")) {
            var8 = 10;
            var1 = var1.substring("glow2:".length());
         } else if (var7.startsWith("glow3:")) {
            var8 = 11;
            var1 = var1.substring("glow3:".length());
         }
      }

      var7 = var1.toLowerCase();
      byte var9 = 0;
      if (var7.startsWith("wave:")) {
         var9 = 1;
         var1 = var1.substring("wave:".length());
      } else if (var7.startsWith("wave2:")) {
         var9 = 2;
         var1 = var1.substring("wave2:".length());
      } else if (var7.startsWith("shake:")) {
         var9 = 3;
         var1 = var1.substring("shake:".length());
      } else if (var7.startsWith("scroll:")) {
         var9 = 4;
         var1 = var1.substring("scroll:".length());
      } else if (var7.startsWith("slide:")) {
         var9 = 5;
         var1 = var1.substring("slide:".length());
      } else if (var2 != class291.field3693) {
         if (var7.startsWith("wave:")) {
            var9 = 1;
            var1 = var1.substring("wave:".length());
         } else if (var7.startsWith("wave2:")) {
            var9 = 2;
            var1 = var1.substring("wave2:".length());
         } else if (var7.startsWith("shake:")) {
            var9 = 3;
            var1 = var1.substring("shake:".length());
         } else if (var7.startsWith("scroll:")) {
            var9 = 4;
            var1 = var1.substring("scroll:".length());
         } else if (var7.startsWith("slide:")) {
            var9 = 5;
            var1 = var1.substring("slide:".length());
         }
      }

      var5.field2690.writeByte(var8);
      var5.field2690.writeByte(var9);
      class242.method4617(var5.field2690, var1);
      if (var0 == class256.field3131.vmethod6962()) {
         var5.field2690.writeByte(var3);
      }

      var5.field2690.method6557(var5.field2690.field4181 * -1084587701 - var6);
      return var5;
   }
}
