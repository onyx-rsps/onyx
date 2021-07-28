import java.util.HashMap;

public class class290 {
   static int field3678;

   static {
      new HashMap();
   }

   static boolean method5130(class276 var0, int var1, int var2) {
      byte[] var4 = var0.method4920(var1, var2);
      if (var4 == null) {
         return false;
      } else {
         class203.method4102(var4);
         return true;
      }
   }

   static final void method5133(class147 var0, int var1, int var2, int var3) {
      if (client.field544 * -286331153 < 400) {
         if (var0.field1645 != null) {
            var0 = var0.method2759();
         }

         if (var0 != null) {
            if (var0.field1648) {
               if (!var0.field1650 || client.field509 == var1) {
                  String var5 = var0.field1619;
                  int var8;
                  int var9;
                  if (var0.field1615 != 0) {
                     var8 = var0.field1615;
                     var9 = class19.field139.field990;
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

                     var5 = var5 + var7 + " " + " (" + "level-" + var0.field1615 + ")";
                  }

                  if (var0.field1650 && client.field407) {
                     class7.method47("Examine", class43.method850(16776960) + var5, 1003, var1, var2, var3);
                  }

                  if (client.field560 == 1) {
                     class7.method47("Use", client.field529 + " " + "->" + " " + class43.method850(16776960) + var5, 7, var1, var2, var3);
                  } else if (client.field562) {
                     if ((class207.field2473 & 2) == 2) {
                        class7.method47(client.field565, client.field465 + " " + "->" + " " + class43.method850(16776960) + var5, 8, var1, var2, var3);
                     }
                  } else {
                     int var11 = var0.field1650 && client.field407 ? 2000 : 0;
                     String[] var12 = var0.field1635;
                     if (var12 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if (var12[var8] != null && !var12[var8].equalsIgnoreCase("Attack")) {
                              var9 = 0;
                              if (var8 == 0) {
                                 var9 = var11 + 9;
                              }

                              if (var8 == 1) {
                                 var9 = var11 + 10;
                              }

                              if (var8 == 2) {
                                 var9 = var11 + 11;
                              }

                              if (var8 == 3) {
                                 var9 = var11 + 12;
                              }

                              if (var8 == 4) {
                                 var9 = var11 + 13;
                              }

                              class7.method47(var12[var8], class43.method850(16776960) + var5, var9, var1, var2, var3);
                           }
                        }
                     }

                     if (var12 != null) {
                        for(var8 = 4; var8 >= 0; --var8) {
                           if (var12[var8] != null && var12[var8].equalsIgnoreCase("Attack")) {
                              short var13 = 0;
                              if (class80.field1159 != client.field432) {
                                 if (client.field432 == class80.field1155 || class80.field1153 == client.field432 && var0.field1615 > class19.field139.field990) {
                                    var13 = 2000;
                                 }

                                 var9 = 0;
                                 if (var8 == 0) {
                                    var9 = var13 + 9;
                                 }

                                 if (var8 == 1) {
                                    var9 = var13 + 10;
                                 }

                                 if (var8 == 2) {
                                    var9 = var13 + 11;
                                 }

                                 if (var8 == 3) {
                                    var9 = var13 + 12;
                                 }

                                 if (var8 == 4) {
                                    var9 = var13 + 13;
                                 }

                                 class7.method47(var12[var8], class43.method850(16776960) + var5, var9, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var0.field1650 || !client.field407) {
                        class7.method47("Examine", class43.method850(16776960) + var5, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }
}
