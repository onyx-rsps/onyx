public class class284 {
   static int field3651;
   String field3648;
   String field3650;
   public final class285 field3646;
   public final int field3647;
   public final long field3645;

   class284(class384 var1, byte var2, int var3) {
      this.field3650 = var1.method6569();
      this.field3648 = var1.method6569();
      this.field3647 = var1.method6655();
      this.field3645 = var1.method6566();
      int var4 = var1.method6784();
      int var5 = var1.method6784();
      this.field3646 = new class285();
      this.field3646.method5079(2);
      this.field3646.method5080(var2);
      this.field3646.field3655 = var4;
      this.field3646.field3652 = var5;
      this.field3646.field3656 = 0;
      this.field3646.field3658 = 0;
      this.field3646.field3653 = var3;
   }

   public String method5065() {
      return this.field3650;
   }

   public String method5066() {
      return this.field3648;
   }

   public static int method5074(int var0) {
      long var3 = class207.field2484[var0];
      int var2 = (int)(var3 >>> 7 & 127L);
      return var2;
   }

   static int method5070(int var0, class58 var1, boolean var2) {
      if (var0 == 3600) {
         if (class12.field79.field713 == 0) {
            class50.field746[++class50.field745 - 1] = -2;
         } else if (class12.field79.field713 == 1) {
            class50.field746[++class50.field745 - 1] = -1;
         } else {
            class50.field746[++class50.field745 - 1] = class12.field79.field711.method5744();
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3601) {
            var4 = class50.field746[--class50.field745];
            if (class12.field79.method1405() && var4 >= 0 && var4 < class12.field79.field711.method5744()) {
               class320 var9 = (class320)class12.field79.field711.method5740(var4);
               class50.field737[++class1.field3 - 1] = var9.method5699();
               class50.field737[++class1.field3 - 1] = var9.method5700();
            } else {
               class50.field737[++class1.field3 - 1] = "";
               class50.field737[++class1.field3 - 1] = "";
            }

            return 1;
         } else if (var0 == 3602) {
            var4 = class50.field746[--class50.field745];
            if (class12.field79.method1405() && var4 >= 0 && var4 < class12.field79.field711.method5744()) {
               class50.field746[++class50.field745 - 1] = ((class327)class12.field79.field711.method5740(var4)).field3864;
            } else {
               class50.field746[++class50.field745 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3603) {
            var4 = class50.field746[--class50.field745];
            if (class12.field79.method1405() && var4 >= 0 && var4 < class12.field79.field711.method5744()) {
               class50.field746[++class50.field745 - 1] = ((class327)class12.field79.field711.method5740(var4)).field3865;
            } else {
               class50.field746[++class50.field745 - 1] = 0;
            }

            return 1;
         } else {
            String var6;
            if (var0 == 3604) {
               var6 = class50.field737[--class1.field3];
               int var7 = class50.field746[--class50.field745];
               class321.method5677(var6, var7);
               return 1;
            } else if (var0 == 3605) {
               var6 = class50.field737[--class1.field3];
               class12.field79.method1369(var6);
               return 1;
            } else if (var0 == 3606) {
               var6 = class50.field737[--class1.field3];
               class12.field79.method1373(var6);
               return 1;
            } else if (var0 == 3607) {
               var6 = class50.field737[--class1.field3];
               class12.field79.method1427(var6);
               return 1;
            } else if (var0 == 3608) {
               var6 = class50.field737[--class1.field3];
               class12.field79.method1413(var6);
               return 1;
            } else if (var0 == 3609) {
               var6 = class50.field737[--class1.field3];
               var6 = class52.method1580(var6);
               class50.field746[++class50.field745 - 1] = class12.field79.method1367(new class405(var6, class51.field760), false) ? 1 : 0;
               return 1;
            } else if (var0 == 3611) {
               if (class68.field971 != null) {
                  class50.field737[++class1.field3 - 1] = class68.field971.field3833;
               } else {
                  class50.field737[++class1.field3 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (class68.field971 != null) {
                  class50.field746[++class50.field745 - 1] = class68.field971.method5744();
               } else {
                  class50.field746[++class50.field745 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var4 = class50.field746[--class50.field745];
               if (class68.field971 != null && var4 < class68.field971.method5744()) {
                  class50.field737[++class1.field3 - 1] = class68.field971.method5740(var4).method5711().method7141();
               } else {
                  class50.field737[++class1.field3 - 1] = "";
               }

               return 1;
            } else if (var0 == 3614) {
               var4 = class50.field746[--class50.field745];
               if (class68.field971 != null && var4 < class68.field971.method5744()) {
                  class50.field746[++class50.field745 - 1] = ((class327)class68.field971.method5740(var4)).method5819();
               } else {
                  class50.field746[++class50.field745 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3615) {
               var4 = class50.field746[--class50.field745];
               if (class68.field971 != null && var4 < class68.field971.method5744()) {
                  class50.field746[++class50.field745 - 1] = ((class327)class68.field971.method5740(var4)).field3865;
               } else {
                  class50.field746[++class50.field745 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3616) {
               class50.field746[++class50.field745 - 1] = class68.field971 != null ? class68.field971.field3831 : 0;
               return 1;
            } else if (var0 == 3617) {
               var6 = class50.field737[--class1.field3];
               class62.method1709(var6);
               return 1;
            } else if (var0 == 3618) {
               class50.field746[++class50.field745 - 1] = class68.field971 != null ? class68.field971.field3836 : 0;
               return 1;
            } else if (var0 == 3619) {
               var6 = class50.field737[--class1.field3];
               class46.method889(var6);
               return 1;
            } else if (var0 == 3620) {
               class55.method1625();
               return 1;
            } else if (var0 == 3621) {
               if (!class12.field79.method1405()) {
                  class50.field746[++class50.field745 - 1] = -1;
               } else {
                  class50.field746[++class50.field745 - 1] = class12.field79.field712.method5744();
               }

               return 1;
            } else if (var0 == 3622) {
               var4 = class50.field746[--class50.field745];
               if (class12.field79.method1405() && var4 >= 0 && var4 < class12.field79.field712.method5744()) {
                  class326 var5 = (class326)class12.field79.field712.method5740(var4);
                  class50.field737[++class1.field3 - 1] = var5.method5699();
                  class50.field737[++class1.field3 - 1] = var5.method5700();
               } else {
                  class50.field737[++class1.field3 - 1] = "";
                  class50.field737[++class1.field3 - 1] = "";
               }

               return 1;
            } else if (var0 == 3623) {
               var6 = class50.field737[--class1.field3];
               var6 = class52.method1580(var6);
               class50.field746[++class50.field745 - 1] = class12.field79.method1368(new class405(var6, class51.field760)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var4 = class50.field746[--class50.field745];
               if (class68.field971 != null && var4 < class68.field971.method5744() && class68.field971.method5740(var4).method5711().equals(class19.field139.field979)) {
                  class50.field746[++class50.field745 - 1] = 1;
               } else {
                  class50.field746[++class50.field745 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3625) {
               if (class68.field971 != null && class68.field971.field3832 != null) {
                  class50.field737[++class1.field3 - 1] = class68.field971.field3832;
               } else {
                  class50.field737[++class1.field3 - 1] = "";
               }

               return 1;
            } else if (var0 == 3626) {
               var4 = class50.field746[--class50.field745];
               if (class68.field971 != null && var4 < class68.field971.method5744() && ((class322)class68.field971.method5740(var4)).method5678()) {
                  class50.field746[++class50.field745 - 1] = 1;
               } else {
                  class50.field746[++class50.field745 - 1] = 0;
               }

               return 1;
            } else if (var0 != 3627) {
               if (var0 == 3628) {
                  class12.field79.field711.method5793();
                  return 1;
               } else {
                  boolean var8;
                  if (var0 == 3629) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class389(var8));
                     return 1;
                  } else if (var0 == 3630) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class390(var8));
                     return 1;
                  } else if (var0 == 3631) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class92(var8));
                     return 1;
                  } else if (var0 == 3632) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class88(var8));
                     return 1;
                  } else if (var0 == 3633) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class91(var8));
                     return 1;
                  } else if (var0 == 3634) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class96(var8));
                     return 1;
                  } else if (var0 == 3635) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class90(var8));
                     return 1;
                  } else if (var0 == 3636) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class89(var8));
                     return 1;
                  } else if (var0 == 3637) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class93(var8));
                     return 1;
                  } else if (var0 == 3638) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class94(var8));
                     return 1;
                  } else if (var0 == 3639) {
                     class12.field79.field711.method5741();
                     return 1;
                  } else if (var0 == 3640) {
                     class12.field79.field712.method5793();
                     return 1;
                  } else if (var0 == 3641) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field712.method5783(new class389(var8));
                     return 1;
                  } else if (var0 == 3642) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field712.method5783(new class390(var8));
                     return 1;
                  } else if (var0 == 3643) {
                     class12.field79.field712.method5741();
                     return 1;
                  } else if (var0 == 3644) {
                     if (class68.field971 != null) {
                        class68.field971.method5793();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class389(var8));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class390(var8));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class92(var8));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class88(var8));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class91(var8));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class96(var8));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class90(var8));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class89(var8));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class93(var8));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class94(var8));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (class68.field971 != null) {
                        class68.field971.method5741();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var8 = class50.field746[--class50.field745] == 1;
                     class12.field79.field711.method5783(new class95(var8));
                     return 1;
                  } else if (var0 == 3657) {
                     var8 = class50.field746[--class50.field745] == 1;
                     if (class68.field971 != null) {
                        class68.field971.method5783(new class95(var8));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = class50.field746[--class50.field745];
               if (class68.field971 != null && var4 < class68.field971.method5744() && ((class322)class68.field971.method5740(var4)).method5683()) {
                  class50.field746[++class50.field745 - 1] = 1;
               } else {
                  class50.field746[++class50.field745 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
