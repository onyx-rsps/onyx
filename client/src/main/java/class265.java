public class class265 implements class289 {
   public static final class265 field3205;
   static class135 field3213;
   static class397[] field3210;
   static final class265 field3203;
   static final class265 field3204;
   static final class265 field3206;
   static final class265 field3211;
   static final class265 field3212;
   final int field3209;
   public final String field3207;

   static {
      field3212 = new class265("runescape", "RuneScape", 0);
      field3203 = new class265("stellardawn", "Stellar Dawn", 1);
      field3204 = new class265("game3", "Game 3", 2);
      field3211 = new class265("game4", "Game 4", 3);
      field3206 = new class265("game5", "Game 5", 4);
      field3205 = new class265("oldscape", "RuneScape 2007", 5);
   }

   class265(String var1, String var2, int var3) {
      this.field3207 = var1;
      this.field3209 = var3;
   }

   public int vmethod6962() {
      return this.field3209;
   }

   static class397 method4836(int var0, int var1, int var2) {
      return (class397)class168.field1961.method4275(class154.method2919(var0, var1, var2));
   }

   static void method4837(int var0) {
      if (var0 == -3) {
         client.method1315("Connection timed out.", "Please try using a different world.", "");
      } else if (var0 == -2) {
         client.method1315("Error connecting to server.", "Please try using a different world.", "");
      } else if (var0 == -1) {
         client.method1315("No response from server.", "Please try using a different world.", "");
      } else if (var0 == 3) {
         class55.field811 = 3;
         class55.field809 = 1;
      } else if (var0 == 4) {
         class55.field811 = 12;
         class55.field804 = 0;
      } else if (var0 == 5) {
         class55.field809 = 2;
         client.method1315("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if (var0 != 68 && (client.field411 || var0 != 6)) {
         if (var0 == 7) {
            client.method1315("This world is full.", "Please use a different world.", "");
         } else if (var0 == 8) {
            client.method1315("Unable to connect.", "Login server offline.", "");
         } else if (var0 == 9) {
            client.method1315("Login limit exceeded.", "Too many connections from your address.", "");
         } else if (var0 == 10) {
            client.method1315("Unable to connect.", "Bad session id.", "");
         } else if (var0 == 11) {
            client.method1315("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
         } else if (var0 == 12) {
            client.method1315("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
         } else if (var0 == 13) {
            client.method1315("Could not complete login.", "Please try using a different world.", "");
         } else if (var0 == 14) {
            client.method1315("The server is being updated.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 16) {
            client.method1315("Too many login attempts.", "Please wait a few minutes before trying again.", "");
         } else if (var0 == 17) {
            client.method1315("You are standing in a members-only area.", "To play on this world move to a free area first", "");
         } else if (var0 == 18) {
            class55.field811 = 12;
            class55.field804 = 1;
         } else if (var0 == 19) {
            client.method1315("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
         } else if (var0 == 20) {
            client.method1315("Invalid loginserver requested.", "Please try using a different world.", "");
         } else if (var0 == 22) {
            client.method1315("Malformed login packet.", "Please try again.", "");
         } else if (var0 == 23) {
            client.method1315("No reply from loginserver.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 24) {
            client.method1315("Error loading your profile.", "Please contact customer support.", "");
         } else if (var0 == 25) {
            client.method1315("Unexpected loginserver response.", "Please try using a different world.", "");
         } else if (var0 == 26) {
            client.method1315("This computers address has been blocked", "as it was used to break our rules.", "");
         } else if (var0 == 27) {
            client.method1315("", "Service unavailable.", "");
         } else if (var0 == 31) {
            client.method1315("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
         } else if (var0 == 32) {
            client.method1315("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
         } else if (var0 == 37) {
            client.method1315("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
         } else if (var0 == 38) {
            client.method1315("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
         } else if (var0 == 55) {
            class55.field811 = 8;
         } else {
            if (var0 == 56) {
               client.method1315("Enter the 6-digit code generated by your", "authenticator app.", "");
               class16.method163(11);
               return;
            }

            if (var0 == 57) {
               client.method1315("The code you entered was incorrect.", "Please try again.", "");
               class16.method163(11);
               return;
            }

            if (var0 == 61) {
               class55.field811 = 7;
            } else {
               client.method1315("Unexpected server response", "Please try using a different world.", "");
            }
         }
      } else {
         client.method1315("RuneScape has been updated!", "Please reload this page.", "");
      }

      class16.method163(10);
   }
}
