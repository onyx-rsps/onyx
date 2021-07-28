import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;

public class class292 implements class289 {
   static class248 field3698;
   static class278 field3710;
   static int field3713;
   static final class292 field3696;
   static final class292 field3697;
   static final class292 field3699;
   static final class292 field3700;
   static final class292 field3702;
   static final class292 field3703;
   static final class292 field3704;
   static final class292 field3705;
   static final class292 field3706;
   static final class292 field3707;
   static final class292 field3708;
   static final class292 field3714;
   static final class292 field3715;
   final int field3701;
   final Set field3709;

   static {
      field3715 = new class292("", 0, new class288[]{class288.field3673});
      field3696 = new class292("", 1, new class288[]{class288.field3674, class288.field3673});
      field3697 = new class292("", 2, new class288[]{class288.field3674, class288.field3672, class288.field3673});
      field3700 = new class292("", 3, new class288[]{class288.field3674});
      field3699 = new class292("", 4);
      field3708 = new class292("", 5, new class288[]{class288.field3674, class288.field3673});
      field3714 = new class292("", 6, new class288[]{class288.field3673});
      field3702 = new class292("", 8, new class288[]{class288.field3674, class288.field3673});
      field3703 = new class292("", 9, new class288[]{class288.field3674, class288.field3672});
      field3704 = new class292("", 10, new class288[]{class288.field3674});
      field3705 = new class292("", 11, new class288[]{class288.field3674});
      field3706 = new class292("", 12, new class288[]{class288.field3674, class288.field3673});
      field3707 = new class292("", 13, new class288[]{class288.field3674});
      method5158();
   }

   class292(String var1, int var2, class288[] var3) {
      this.field3709 = new HashSet();
      this.field3701 = var2;
      class288[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class288 var6 = var4[var5];
         this.field3709.add(var6);
      }

   }

   class292(String var1, int var2) {
      this.field3709 = new HashSet();
      this.field3701 = var2;
   }

   public int vmethod6962() {
      return this.field3701;
   }

   public static String method5168(byte[] var0, int var1, int var2) {
      char[] var4 = new char[var2];
      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var0[var6 + var1] & 255;
         if (var7 != 0) {
            if (var7 >= 128 && var7 < 160) {
               char var8 = class303.field3754[var7 - 128];
               if (var8 == 0) {
                  var8 = '?';
               }

               var7 = var8;
            }

            var4[var5++] = (char)var7;
         }
      }

      return new String(var4, 0, var5);
   }

   static void method5172(class301 var0, class301 var1, class301 var2) {
      class55.field824 = (class68.field970 - 765) / 2;
      class55.field816 = class55.field824 + 202;
      class166.field1931 = class55.field816 + 180;
      if (class55.field799) {
         class51.method1578(var0, var1);
      } else {
         class55.field814.method7066(class55.field824, 0);
         class55.field802.method7066(class55.field824 + 382, 0);
         class88.field1228.method6969(class55.field824 + 382 - class88.field1228.field4262 / 2, 18);
         int var5;
         if (client.field412 == 0 || client.field412 == 5) {
            byte var4 = 20;
            var0.method5441("RuneScape is loading - please wait...", class55.field816 + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            class393.method6907(class55.field816 + 180 - 152, var5, 304, 34, 9179409);
            class393.method6907(class55.field816 + 180 - 151, var5 + 1, 302, 32, 0);
            class393.method6880(class55.field816 + 180 - 150, var5 + 2, class55.field805 * 3, 30, 9179409);
            class393.method6880(class55.field816 + 180 - 150 + class55.field805 * 3, var5 + 2, 300 - class55.field805 * 3, 30, 0);
            var0.method5441(class55.field806, class55.field816 + 180, 276 - var4, 16777215, -1);
         }

         String var6;
         String var14;
         short var17;
         int var18;
         short var19;
         if (client.field412 == 20) {
            class304.field3759.method6969(class55.field816 + 180 - class304.field3759.field4262 / 2, 271 - class304.field3759.field4263 / 2);
            var17 = 201;
            var0.method5441(class55.field822, class55.field816 + 180, var17, 16776960, 0);
            var18 = var17 + 15;
            var0.method5441(class55.field813, class55.field816 + 180, var18, 16776960, 0);
            var18 += 15;
            var0.method5441(class55.field815, class55.field816 + 180, var18, 16776960, 0);
            var18 += 15;
            var18 += 7;
            if (class55.field811 != 4) {
               var0.method5372("Login: ", class55.field816 + 180 - 110, var18, 16777215, 0);
               var19 = 200;

               for(var6 = class107.method2224(); var0.method5367(var6) > var19; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.method5372(class302.method5434(var6), class55.field816 + 180 - 70, var18, 16777215, 0);
               var18 += 15;

               for(var14 = class16.method176(class55.field817); var0.method5367(var14) > var19; var14 = var14.substring(1)) {
               }

               var0.method5372("Password: " + var14, class55.field816 + 180 - 108, var18, 16777215, 0);
               var18 += 15;
            }
         }

         if (client.field412 == 10 || client.field412 == 11) {
            class304.field3759.method6969(class55.field816, 171);
            short var12;
            if (class55.field811 == 0) {
               var17 = 251;
               var0.method5441("Welcome to RuneScape", class55.field816 + 180, var17, 16776960, 0);
               var18 = var17 + 30;
               var5 = class55.field816 + 180 - 80;
               var12 = 291;
               class55.field800.method6969(var5 - 73, var12 - 20);
               var0.method5376("New User", var5 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = class55.field816 + 180 + 80;
               class55.field800.method6969(var5 - 73, var12 - 20);
               var0.method5376("Existing User", var5 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class55.field811 == 1) {
               var0.method5441(class55.field798, class55.field816 + 180, 201, 16776960, 0);
               var17 = 236;
               var0.method5441(class55.field822, class55.field816 + 180, var17, 16777215, 0);
               var18 = var17 + 15;
               var0.method5441(class55.field813, class55.field816 + 180, var18, 16777215, 0);
               var18 += 15;
               var0.method5441(class55.field815, class55.field816 + 180, var18, 16777215, 0);
               var18 += 15;
               var5 = class55.field816 + 180 - 80;
               var12 = 321;
               class55.field800.method6969(var5 - 73, var12 - 20);
               var0.method5441("Continue", var5, var12 + 5, 16777215, 0);
               var5 = class55.field816 + 180 + 80;
               class55.field800.method6969(var5 - 73, var12 - 20);
               var0.method5441("Cancel", var5, var12 + 5, 16777215, 0);
            } else {
               int var8;
               if (class55.field811 == 2) {
                  var17 = 201;
                  var0.method5441(class55.field822, class166.field1931, var17, 16776960, 0);
                  var18 = var17 + 15;
                  var0.method5441(class55.field813, class166.field1931, var18, 16776960, 0);
                  var18 += 15;
                  var0.method5441(class55.field815, class166.field1931, var18, 16776960, 0);
                  var18 += 15;
                  var18 += 7;
                  var0.method5372("Login: ", class166.field1931 - 110, var18, 16777215, 0);
                  var19 = 200;

                  for(var6 = class107.method2224(); var0.method5367(var6) > var19; var6 = var6.substring(1)) {
                  }

                  var0.method5372(class302.method5434(var6) + (class55.field821 == 0 & client.field451 % 40 < 20 ? class43.method850(16776960) + "|" : ""), class166.field1931 - 70, var18, 16777215, 0);
                  var18 += 15;

                  for(var14 = class16.method176(class55.field817); var0.method5367(var14) > var19; var14 = var14.substring(1)) {
                  }

                  var0.method5372("Password: " + var14 + (class55.field821 == 1 & client.field451 % 40 < 20 ? class43.method850(16776960) + "|" : ""), class166.field1931 - 108, var18, 16777215, 0);
                  var18 += 15;
                  var17 = 277;
                  var8 = class166.field1931 + -117;
                  class396 var9 = method5166(client.field442, class55.field829);
                  var9.method6969(var8, var17);
                  var8 = var8 + var9.field4262 + 5;
                  var1.method5372("Remember username", var8, var17 + 13, 16776960, 0);
                  var8 = class166.field1931 + 24;
                  var9 = method5166(class37.field307.field1116, class55.field819);
                  var9.method6969(var8, var17);
                  var8 = var8 + var9.field4262 + 5;
                  var1.method5372("Hide username", var8, var17 + 13, 16776960, 0);
                  var18 = var17 + 15;
                  int var10 = class166.field1931 - 80;
                  short var11 = 321;
                  class55.field800.method6969(var10 - 73, var11 - 20);
                  var0.method5441("Login", var10, var11 + 5, 16777215, 0);
                  var10 = class166.field1931 + 80;
                  class55.field800.method6969(var10 - 73, var11 - 20);
                  var0.method5441("Cancel", var10, var11 + 5, 16777215, 0);
                  var17 = 357;
                  switch(class55.field809) {
                  case 2:
                     class47.field703 = "Having trouble logging in?";
                     break;
                  default:
                     class47.field703 = "Can't login? Click here.";
                  }

                  class18.field127 = new class336(class166.field1931, var17, var1.method5367(class47.field703), 11);
                  class307.field3766 = new class336(class166.field1931, var17, var1.method5367("Still having trouble logging in?"), 11);
                  var1.method5441(class47.field703, class166.field1931, var17, 16777215, 0);
               } else if (class55.field811 == 3) {
                  var17 = 201;
                  var0.method5441("Invalid credentials.", class55.field816 + 180, var17, 16776960, 0);
                  var18 = var17 + 20;
                  var1.method5441("For accounts created after 24th November 2010, please use your", class55.field816 + 180, var18, 16776960, 0);
                  var18 += 15;
                  var1.method5441("email address to login. Otherwise please login with your username.", class55.field816 + 180, var18, 16776960, 0);
                  var18 += 15;
                  var5 = class55.field816 + 180;
                  var12 = 276;
                  class55.field800.method6969(var5 - 73, var12 - 20);
                  var2.method5441("Try again", var5, var12 + 5, 16777215, 0);
                  var5 = class55.field816 + 180;
                  var12 = 326;
                  class55.field800.method6969(var5 - 73, var12 - 20);
                  var2.method5441("Forgotten password?", var5, var12 + 5, 16777215, 0);
               } else {
                  short var15;
                  if (class55.field811 == 4) {
                     var0.method5441("Authenticator", class55.field816 + 180, 201, 16776960, 0);
                     var17 = 236;
                     var0.method5441(class55.field822, class55.field816 + 180, var17, 16777215, 0);
                     var18 = var17 + 15;
                     var0.method5441(class55.field813, class55.field816 + 180, var18, 16777215, 0);
                     var18 += 15;
                     var0.method5441(class55.field815, class55.field816 + 180, var18, 16777215, 0);
                     var18 += 15;
                     var0.method5372("PIN: " + class16.method176(class146.field1614) + (client.field451 % 40 < 20 ? class43.method850(16776960) + "|" : ""), class55.field816 + 180 - 108, var18, 16777215, 0);
                     var18 -= 8;
                     var0.method5372("Trust this computer", class55.field816 + 180 - 9, var18, 16776960, 0);
                     var18 += 15;
                     var0.method5372("for 30 days: ", class55.field816 + 180 - 9, var18, 16776960, 0);
                     var5 = 180 + class55.field816 - 9 + var0.method5367("for 30 days: ") + 15;
                     int var22 = var18 - var0.field3737;
                     class396 var24;
                     if (class55.field820) {
                        var24 = class172.field2013;
                     } else {
                        var24 = class46.field396;
                     }

                     var24.method6969(var5, var22);
                     var18 += 15;
                     var8 = class55.field816 + 180 - 80;
                     var15 = 321;
                     class55.field800.method6969(var8 - 73, var15 - 20);
                     var0.method5441("Continue", var8, var15 + 5, 16777215, 0);
                     var8 = class55.field816 + 180 + 80;
                     class55.field800.method6969(var8 - 73, var15 - 20);
                     var0.method5441("Cancel", var8, var15 + 5, 16777215, 0);
                     var1.method5441("<u=ff>Can't Log In?</u>", class55.field816 + 180, var15 + 36, 255, 0);
                  } else if (class55.field811 == 5) {
                     var0.method5441("Forgotten your password?", class55.field816 + 180, 201, 16776960, 0);
                     var17 = 221;
                     var2.method5441(class55.field822, class55.field816 + 180, var17, 16776960, 0);
                     var18 = var17 + 15;
                     var2.method5441(class55.field813, class55.field816 + 180, var18, 16776960, 0);
                     var18 += 15;
                     var2.method5441(class55.field815, class55.field816 + 180, var18, 16776960, 0);
                     var18 += 15;
                     var18 += 14;
                     var0.method5372("Username/email: ", class55.field816 + 180 - 145, var18, 16777215, 0);
                     var19 = 174;

                     for(var6 = class107.method2224(); var0.method5367(var6) > var19; var6 = var6.substring(1)) {
                     }

                     var0.method5372(class302.method5434(var6) + (client.field451 % 40 < 20 ? class43.method850(16776960) + "|" : ""), class55.field816 + 180 - 34, var18, 16777215, 0);
                     var18 += 15;
                     int var7 = class55.field816 + 180 - 80;
                     short var21 = 321;
                     class55.field800.method6969(var7 - 73, var21 - 20);
                     var0.method5441("Recover", var7, var21 + 5, 16777215, 0);
                     var7 = class55.field816 + 180 + 80;
                     class55.field800.method6969(var7 - 73, var21 - 20);
                     var0.method5441("Back", var7, var21 + 5, 16777215, 0);
                     var21 = 356;
                     var1.method5441("Still having trouble logging in?", class166.field1931, var21, 268435455, 0);
                  } else if (class55.field811 == 6) {
                     var17 = 201;
                     var0.method5441(class55.field822, class55.field816 + 180, var17, 16776960, 0);
                     var18 = var17 + 15;
                     var0.method5441(class55.field813, class55.field816 + 180, var18, 16776960, 0);
                     var18 += 15;
                     var0.method5441(class55.field815, class55.field816 + 180, var18, 16776960, 0);
                     var18 += 15;
                     var5 = class55.field816 + 180;
                     var12 = 321;
                     class55.field800.method6969(var5 - 73, var12 - 20);
                     var0.method5441("Back", var5, var12 + 5, 16777215, 0);
                  } else if (class55.field811 == 7) {
                     var17 = 216;
                     var0.method5441("Your date of birth isn't set.", class55.field816 + 180, var17, 16776960, 0);
                     var18 = var17 + 15;
                     var2.method5441("Please verify your account status by", class55.field816 + 180, var18, 16776960, 0);
                     var18 += 15;
                     var2.method5441("setting your date of birth.", class55.field816 + 180, var18, 16776960, 0);
                     var18 += 15;
                     var5 = class55.field816 + 180 - 80;
                     var12 = 321;
                     class55.field800.method6969(var5 - 73, var12 - 20);
                     var0.method5441("Set Date of Birth", var5, var12 + 5, 16777215, 0);
                     var5 = class55.field816 + 180 + 80;
                     class55.field800.method6969(var5 - 73, var12 - 20);
                     var0.method5441("Back", var5, var12 + 5, 16777215, 0);
                  } else if (class55.field811 == 8) {
                     var17 = 216;
                     var0.method5441("Sorry, but your account is not eligible to play.", class55.field816 + 180, var17, 16776960, 0);
                     var18 = var17 + 15;
                     var2.method5441("For more information, please take a look at", class55.field816 + 180, var18, 16776960, 0);
                     var18 += 15;
                     var2.method5441("our privacy policy.", class55.field816 + 180, var18, 16776960, 0);
                     var18 += 15;
                     var5 = class55.field816 + 180 - 80;
                     var12 = 321;
                     class55.field800.method6969(var5 - 73, var12 - 20);
                     var0.method5441("Privacy Policy", var5, var12 + 5, 16777215, 0);
                     var5 = class55.field816 + 180 + 80;
                     class55.field800.method6969(var5 - 73, var12 - 20);
                     var0.method5441("Back", var5, var12 + 5, 16777215, 0);
                  } else if (class55.field811 == 12) {
                     var17 = 201;
                     String var16 = "";
                     var6 = "";
                     var14 = "";
                     switch(class55.field804) {
                     case 0:
                        var16 = "Your account has been disabled.";
                        var6 = class269.field3298;
                        var14 = "";
                        break;
                     case 1:
                        var16 = "Account locked as we suspect it has been stolen.";
                        var6 = class269.field3467;
                        var14 = "";
                        break;
                     default:
                        class107.method2221(false);
                     }

                     var0.method5441(var16, class55.field816 + 180, var17, 16776960, 0);
                     var18 = var17 + 15;
                     var2.method5441(var6, class55.field816 + 180, var18, 16776960, 0);
                     var18 += 15;
                     var2.method5441(var14, class55.field816 + 180, var18, 16776960, 0);
                     var18 += 15;
                     var8 = class55.field816 + 180;
                     var15 = 276;
                     class55.field800.method6969(var8 - 73, var15 - 20);
                     var0.method5441("Support Page", var8, var15 + 5, 16777215, 0);
                     var8 = class55.field816 + 180;
                     var15 = 326;
                     class55.field800.method6969(var8 - 73, var15 - 20);
                     var0.method5441("Back", var8, var15 + 5, 16777215, 0);
                  } else if (class55.field811 == 24) {
                     var17 = 221;
                     var0.method5441(class55.field822, class55.field816 + 180, var17, 16777215, 0);
                     var18 = var17 + 15;
                     var0.method5441(class55.field813, class55.field816 + 180, var18, 16777215, 0);
                     var18 += 15;
                     var0.method5441(class55.field815, class55.field816 + 180, var18, 16777215, 0);
                     var18 += 15;
                     var5 = class55.field816 + 180;
                     var12 = 301;
                     class55.field800.method6969(var5 - 73, var12 - 20);
                     var0.method5441("Ok", var5, var12 + 5, 16777215, 0);
                  }
               }
            }
         }

         if (client.field412 >= 10) {
            int[] var13 = new int[4];
            class393.method6874(var13);
            class393.method6894(class55.field824, 0, class55.field824 + 765, client.field686);
            class6.field15.method1830(class55.field824 - 22, client.field451);
            class6.field15.method1830(class55.field824 + 22 + 765 - 128, client.field451);
            class393.method6875(var13);
         }

         class132.field1485[class37.field307.field1113 ? 1 : 0].method6969(class55.field824 + 765 - 40, 463);
         if (client.field412 > 5 && class283.field3643 == class291.field3693) {
            if (class235.field2846 != null) {
               var18 = class55.field824 + 5;
               var19 = 463;
               byte var23 = 100;
               byte var20 = 35;
               class235.field2846.method6969(var18, var19);
               var0.method5441("World" + " " + client.field404, var23 / 2 + var18, var20 / 2 + var19 - 2, 16777215, 0);
               if (class77.field1134 != null) {
                  var1.method5441("Loading...", var23 / 2 + var18, var20 / 2 + var19 + 12, 16777215, 0);
               } else {
                  var1.method5441("Click to switch", var23 / 2 + var18, var20 / 2 + var19 + 12, 16777215, 0);
               }
            } else {
               class235.field2846 = class117.method2382(class270.field3535, "sl_button", "");
            }
         }

      }
   }

   static class292[] method5158() {
      return new class292[]{field3705, field3702, field3707, field3700, field3703, field3696, field3714, field3715, field3697, field3699, field3708, field3706, field3704};
   }

   static class396 method5166(boolean var0, boolean var1) {
      return var0 ? (var1 ? class335.field3919 : class172.field2013) : (var1 ? class91.field1239 : class46.field396);
   }

   static void method5157() {
      class55.field808 = class55.field808.trim();
      if (class55.field808.length() == 0) {
         client.method1315("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var2;
         try {
            URL var4 = new URL(class91.method2099("services", false) + "m=accountappeal/login.ws");
            URLConnection var5 = var4.openConnection();
            var5.setRequestProperty("connection", "close");
            var5.setDoInput(true);
            var5.setDoOutput(true);
            var5.setConnectTimeout(5000);
            OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
            var6.write("data1=req");
            var6.flush();
            InputStream var7 = var5.getInputStream();
            class384 var8 = new class384(new byte[1000]);

            while(true) {
               int var9 = var7.read(var8.payload, var8.field4181 * -1084587701, 1000 - var8.field4181 * -1084587701);
               if (var9 == -1) {
                  var8.field4181 = 0;
                  long var11 = var8.method6566();
                  var2 = var11;
                  break;
               }

               var8.field4181 = (var8.field4181 * -1084587701 + var9) * 99;
               if (var8.field4181 * -1084587701 >= 1000) {
                  var2 = 0L;
                  break;
               }
            }
         } catch (Exception var15) {
            var2 = 0L;
         }

         int var1;
         if (var2 == 0L) {
            var1 = 5;
         } else {
            var1 = client.method1313(var2, class55.field808);
         }

         switch(var1) {
         case 2:
            client.method1315(class269.field3495, class269.field3354, class269.field3319);
            class55.field811 = 6;
            break;
         case 3:
            client.method1315("", "Error connecting to server.", "");
            break;
         case 4:
            client.method1315("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            client.method1315("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            client.method1315("", "Error connecting to server.", "");
            break;
         case 7:
            client.method1315("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }

   public static void method5170(class276 var0, class276 var1, class276 var2) {
      class154.field1710 = var0;
      class163.field1913 = var1;
      class154.field1732 = var2;
   }

   public static void method5156(class276 var0, class276 var1) {
      class11.field71 = var0;
      class143.field1590 = var1;
   }

   static int method5162(int var0, class58 var1, boolean var2) {
      int var4 = -1;
      class248 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class50.field746[--class50.field745];
         var5 = class86.method2063(var4);
      } else {
         var5 = var2 ? class285.field3659 : class50.field749;
      }

      if (var0 == 1000) {
         class50.field745 -= 4;
         var5.field2946 = class50.field746[class50.field745];
         var5.field3018 = class50.field746[class50.field745 + 1];
         var5.field3062 = class50.field746[class50.field745 + 2];
         var5.field2963 = class50.field746[class50.field745 + 3];
         class80.method1934(var5);
         class58.field873.method918(var5);
         if (var4 != -1 && var5.field2976 == 0) {
            class80.method1933(class248.field3038[var4 >> 16], var5, false);
         }

         return 1;
      } else if (var0 == 1001) {
         class50.field745 -= 4;
         var5.field2968 = class50.field746[class50.field745];
         var5.field2969 = class50.field746[class50.field745 + 1];
         var5.field3032 = class50.field746[class50.field745 + 2];
         var5.field3091 = class50.field746[class50.field745 + 3];
         class80.method1934(var5);
         class58.field873.method918(var5);
         if (var4 != -1 && var5.field2976 == 0) {
            class80.method1933(class248.field3038[var4 >> 16], var5, false);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var6 = class50.field746[--class50.field745] == 1;
         if (var6 != var5.field2977) {
            var5.field2977 = var6;
            class80.method1934(var5);
         }

         return 1;
      } else if (var0 == 1005) {
         var5.field3101 = class50.field746[--class50.field745] == 1;
         return 1;
      } else if (var0 == 1006) {
         var5.field3077 = class50.field746[--class50.field745] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   static final boolean method5171() {
      return client.field543;
   }
}
