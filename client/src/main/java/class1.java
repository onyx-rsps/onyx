import java.util.concurrent.Callable;

public class class1 implements Callable {
   static int field3;
   final class3 field0;
   final Buffer field1;
   // $FF: synthetic field
   final class7 this$0;

   class1(class7 var1, Buffer var2, class3 var3) {
      this.this$0 = var1;
      this.field1 = var2;
      this.field0 = var3;
   }

   public Object call() {
      return this.field0.vmethod15(this.field1);
   }

   static final void method10(class69 var0, int var1, int var2, int var3) {
      if (class19.field139 != var0) {
         if (client.field544 * -286331153 < 400) {
            String var5;
            int var8;
            if (var0.field1006 == 0) {
               String var6 = var0.field981[0] + var0.field979 + var0.field981[1];
               var8 = var0.field990;
               int var9 = class19.field139.field990;
               int var10 = var9 - var8;
               String var7;
               if (var10 < -9) {
                  var7 = class43.method850(16711680);
               } else if (var10 < -6) {
                  var7 = class43.method850(16723968);
               } else if (var10 < -3) {
                  var7 = class43.method850(16740352);
               } else if (var10 < 0) {
                  var7 = class43.method850(16756736);
               } else if (var10 > 9) {
                  var7 = class43.method850(65280);
               } else if (var10 > 6) {
                  var7 = class43.method850(4259584);
               } else if (var10 > 3) {
                  var7 = class43.method850(8453888);
               } else if (var10 > 0) {
                  var7 = class43.method850(12648192);
               } else {
                  var7 = class43.method850(16776960);
               }

               var5 = var6 + var7 + " " + " (" + "level-" + var0.field990 + ")" + var0.field981[2];
            } else {
               var5 = var0.field981[0] + var0.field979 + var0.field981[1] + " " + " (" + "skill-" + var0.field1006 + ")" + var0.field981[2];
            }

            int var11;
            if (client.field560 == 1) {
               class7.method47("Use", client.field529 + " " + "->" + " " + class43.method850(16777215) + var5, 14, var1, var2, var3);
            } else if (client.field562) {
               if ((class207.field2473 & 8) == 8) {
                  class7.method47(client.field565, client.field465 + " " + "->" + " " + class43.method850(16777215) + var5, 15, var1, var2, var3);
               }
            } else {
               for(var11 = 7; var11 >= 0; --var11) {
                  if (client.field531[var11] != null) {
                     short var12 = 0;
                     if (client.field531[var11].equalsIgnoreCase("Attack")) {
                        if (class80.field1159 == client.field458) {
                           continue;
                        }

                        if (class80.field1155 == client.field458 || class80.field1153 == client.field458 && var0.field990 > class19.field139.field990) {
                           var12 = 2000;
                        }

                        if (class19.field139.field996 != 0 && var0.field996 != 0) {
                           if (var0.field996 == class19.field139.field996) {
                              var12 = 2000;
                           } else {
                              var12 = 0;
                           }
                        } else if (class80.field1157 == client.field458 && var0.method1758()) {
                           var12 = 2000;
                        }
                     } else if (client.field532[var11]) {
                        var12 = 2000;
                     }

                     boolean var13 = false;
                     var8 = client.field530[var11] + var12;
                     class7.method47(client.field531[var11], class43.method850(16777215) + var5, var8, var1, var2, var3);
                  }
               }
            }

            for(var11 = 0; var11 < client.field544 * -286331153; ++var11) {
               if (client.field547[var11] == 23) {
                  client.field550[var11] = class43.method850(16777215) + var5;
                  break;
               }
            }

         }
      }
   }

   static class44 method13(int var0, int var1) {
      class60 var3 = (class60)class84.field1195.get(var0);
      return var3.method1662(var1);
   }
}
