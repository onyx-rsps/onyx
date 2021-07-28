public class class264 {
   static final class264 field3195;
   static final class264 field3196;
   static final class264 field3197;
   static final class264 field3198;
   public final int field3199;
   public final String field3201;

   static {
      field3198 = new class264("LIVE", 0);
      field3195 = new class264("BUILDLIVE", 3);
      field3196 = new class264("RC", 1);
      field3197 = new class264("WIP", 2);
   }

   class264(String var1, int var2) {
      this.field3201 = var1;
      this.field3199 = var2;
   }

   static final void method4826(int var0, int var1, int var2, int var3) {
      if (client.field560 == 0 && !client.field562) {
         class7.method47("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var5 = -1L;
      long var7 = -1L;

      int var9;
      for(var9 = 0; var9 < class77.method1892(); ++var9) {
         long var10 = class207.field2484[var9];
         if (var7 != var10) {
            var7 = var10;
            int var14 = class198.method3900(var9);
            int var15 = class284.method5074(var9);
            int var16 = class266.method4838(class207.field2484[var9]);
            int var18 = class78.method1904(class207.field2484[var9]);
            int var19 = var18;
            if (var16 == 2 && class165.field1924.method3931(class284.field3651, var14, var15, var10) >= 0) {
               class155 var20 = class123.method2465(var18);
               if (var20.field1761 != null) {
                  var20 = var20.method2931();
               }

               if (var20 == null) {
                  continue;
               }

               if (client.field560 == 1) {
                  class7.method47("Use", client.field529 + " " + "->" + " " + class43.method850(65535) + var20.field1768, 1, var18, var14, var15);
               } else if (client.field562) {
                  if ((class207.field2473 & 4) == 4) {
                     class7.method47(client.field565, client.field465 + " " + "->" + " " + class43.method850(65535) + var20.field1768, 2, var18, var14, var15);
                  }
               } else {
                  String[] var27 = var20.field1782;
                  if (var27 != null) {
                     for(int var28 = 4; var28 >= 0; --var28) {
                        if (var27[var28] != null) {
                           short var23 = 0;
                           if (var28 == 0) {
                              var23 = 3;
                           }

                           if (var28 == 1) {
                              var23 = 4;
                           }

                           if (var28 == 2) {
                              var23 = 5;
                           }

                           if (var28 == 3) {
                              var23 = 6;
                           }

                           if (var28 == 4) {
                              var23 = 1001;
                           }

                           class7.method47(var27[var28], class43.method850(65535) + var20.field1768, var23, var19, var14, var15);
                        }
                     }
                  }

                  class7.method47("Examine", class43.method850(65535) + var20.field1768, 1002, var20.field1752, var14, var15);
               }
            }

            int var21;
            class77 var22;
            class69 var24;
            int[] var34;
            int var36;
            if (var16 == 1) {
               class77 var31 = client.field566[var19];
               if (var31 == null) {
                  continue;
               }

               if (var31.field1131.field1621 == 1 && (var31.field1068 & 127) == 64 && (var31.field1058 & 127) == 64) {
                  for(var21 = 0; var21 < client.field684; ++var21) {
                     var22 = client.field566[client.field449[var21]];
                     if (var22 != null && var22 != var31 && var22.field1131.field1621 == 1 && var22.field1068 == var31.field1068 && var31.field1058 == var22.field1058) {
                        class290.method5133(var22.field1131, client.field449[var21], var14, var15);
                     }
                  }

                  var21 = class82.field1171;
                  var34 = class82.field1177;

                  for(var36 = 0; var36 < var21; ++var36) {
                     var24 = client.field523[var34[var36]];
                     if (var24 != null && var31.field1068 == var24.field1068 && var24.field1058 == var31.field1058) {
                        class1.method10(var24, var34[var36], var14, var15);
                     }
                  }
               }

               class290.method5133(var31.field1131, var19, var14, var15);
            }

            if (var16 == 0) {
               class69 var32 = client.field523[var19];
               if (var32 == null) {
                  continue;
               }

               if ((var32.field1068 & 127) == 64 && (var32.field1058 & 127) == 64) {
                  for(var21 = 0; var21 < client.field684; ++var21) {
                     var22 = client.field566[client.field449[var21]];
                     if (var22 != null && var22.field1131.field1621 == 1 && var22.field1068 == var32.field1068 && var32.field1058 == var22.field1058) {
                        class290.method5133(var22.field1131, client.field449[var21], var14, var15);
                     }
                  }

                  var21 = class82.field1171;
                  var34 = class82.field1177;

                  for(var36 = 0; var36 < var21; ++var36) {
                     var24 = client.field523[var34[var36]];
                     if (var24 != null && var24 != var32 && var32.field1068 == var24.field1068 && var32.field1058 == var24.field1058) {
                        class1.method10(var24, var34[var36], var14, var15);
                     }
                  }
               }

               if (var19 != client.field534) {
                  class1.method10(var32, var19, var14, var15);
               } else {
                  var5 = var10;
               }
            }

            if (var16 == 3) {
               class295 var33 = client.field535[class284.field3651][var14][var15];
               if (var33 != null) {
                  for(class81 var37 = (class81)var33.method5209(); var37 != null; var37 = (class81)var33.method5194()) {
                     class156 var35 = class10.method105(var37.field1166);
                     if (client.field560 == 1) {
                        class7.method47("Use", client.field529 + " " + "->" + " " + class43.method850(16748608) + var35.field1835, 16, var37.field1166, var14, var15);
                     } else if (client.field562) {
                        if ((class207.field2473 & 1) == 1) {
                           class7.method47(client.field565, client.field465 + " " + "->" + " " + class43.method850(16748608) + var35.field1835, 17, var37.field1166, var14, var15);
                        }
                     } else {
                        String[] var29 = var35.field1808;

                        for(int var30 = 4; var30 >= 0; --var30) {
                           if (var29 != null && var29[var30] != null) {
                              byte var25 = 0;
                              if (var30 == 0) {
                                 var25 = 18;
                              }

                              if (var30 == 1) {
                                 var25 = 19;
                              }

                              if (var30 == 2) {
                                 var25 = 20;
                              }

                              if (var30 == 3) {
                                 var25 = 21;
                              }

                              if (var30 == 4) {
                                 var25 = 22;
                              }

                              class7.method47(var29[var30], class43.method850(16748608) + var35.field1835, var25, var37.field1166, var14, var15);
                           } else if (var30 == 2) {
                              class7.method47("Take", class43.method850(16748608) + var35.field1835, 20, var37.field1166, var14, var15);
                           }
                        }

                        class7.method47("Examine", class43.method850(16748608) + var35.field1835, 1004, var37.field1166, var14, var15);
                     }
                  }
               }
            }
         }
      }

      if (var5 != -1L) {
         var9 = class45.method880(var5);
         int var26 = class79.method1922(var5);
         class69 var11 = client.field523[client.field534];
         class1.method10(var11, client.field534, var9, var26);
      }

   }
}
