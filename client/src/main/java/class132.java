import java.io.File;
import java.util.Hashtable;

public class class132 {
   static boolean field1482;
   static class396[] field1485;
   static int field1484;
   static File field1481;
   static Hashtable field1483;

   static {
      field1482 = false;
      field1483 = new Hashtable(16);
   }

   public static class396[] method2560(class276 var0, int var1, int var2) {
      if (!class290.method5130(var0, var1, var2)) {
         return null;
      } else {
         class396[] var5 = new class396[class398.field4281];

         for(int var6 = 0; var6 < class398.field4281; ++var6) {
            class396 var7 = var5[var6] = new class396();
            var7.field4266 = class398.field4280;
            var7.field4267 = class398.field4285;
            var7.field4264 = class398.field4283[var6];
            var7.field4265 = class398.field4284[var6];
            var7.field4262 = class105.field1307[var6];
            var7.field4263 = class374.field4155[var6];
            var7.field4260 = class118.field1406;
            var7.field4261 = class398.field4282[var6];
         }

         class398.field4283 = null;
         class398.field4284 = null;
         class105.field1307 = null;
         class374.field4155 = null;
         class118.field1406 = null;
         class398.field4282 = null;
         return var5;
      }
   }

   static int method2553(int var0, class58 var1, boolean var2) {
      if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
         if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
            if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
               if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
                  if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
                     if (var0 != 7031 && var0 != 7032) {
                        if (var0 == 7033) {
                           --class1.field3;
                           return 1;
                        } else if (var0 != 7036 && var0 != 7037) {
                           if (var0 == 7038) {
                              --class50.field745;
                              return 1;
                           } else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
                              return 2;
                           } else {
                              --class50.field745;
                              return 1;
                           }
                        } else {
                           class50.field745 -= 2;
                           return 1;
                        }
                     } else {
                        --class1.field3;
                        --class50.field745;
                        return 1;
                     }
                  } else {
                     --class50.field745;
                     return 1;
                  }
               } else {
                  class50.field745 -= 2;
                  return 1;
               }
            } else {
               class50.field745 -= 2;
               return 1;
            }
         } else {
            class50.field745 -= 3;
            return 1;
         }
      } else {
         class50.field745 -= 5;
         return 1;
      }
   }
}
