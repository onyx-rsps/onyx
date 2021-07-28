import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public final class client extends class19 implements class318 {
   public static boolean field562;
   public static int field405;
   public static int field680;
   public static int field687;
   public static final class86 field453;
   static boolean field408;
   static boolean field409;
   static boolean field412;
   static boolean field415;
   static boolean field421;
   static boolean field422;
   static boolean field443;
   static boolean field455;
   static boolean field456;
   static boolean field457;
   static boolean field481;
   static boolean field490;
   static boolean field492;
   static boolean field512;
   static boolean field520;
   static boolean field523;
   static boolean field527;
   static boolean field544;
   static boolean field554;
   static boolean field555;
   static boolean field563;
   static boolean field578;
   static boolean field586;
   static boolean field589;
   static boolean field592;
   static boolean field603;
   static boolean field613;
   static boolean field615;
   static boolean field635;
   static boolean field648;
   static boolean[] field509;
   static boolean[] field533;
   static boolean[] field617;
   static boolean[] field618;
   static boolean[] field656;
   static boolean[] field674;
   static byte[] field447;
   static class100 field448;
   static class115[] field637;
   static class124[] field638;
   static class160[] field465;
   static class22[] field654;
   static class247 field598;
   static class249 field515;
   static class249 field574;
   static class249 field580;
   static class249 field581;
   static class249 field582;
   static class249 field585;
   static class249 field688;
   static class286[] field620;
   static class296 field537;
   static class296 field538;
   static class296 field539;
   static class296 field611;
   static class296 field612;
   static class296 field686;
   static class296[][][] field536;
   static class312 field458;
   static class330 field645;
   static class357 field559;
   static class364 field469;
   static class364 field569;
   static class398[] field643;
   static class47 field518;
   static class58 field444;
   static class70[] field524;
   static class78[] field567;
   static class81 field433;
   static class81 field459;
   static int field404;
   static int field406;
   static int field407;
   static int field410;
   static int field411;
   static int field413;
   static int field416;
   static int field418;
   static int field419;
   static int field423;
   static int field424;
   static int field425;
   static int field426;
   static int field427;
   static int field429;
   static int field430;
   static int field432;
   static int field434;
   static int field436;
   static int field438;
   static int field439;
   static int field440;
   static int field441;
   static int field445;
   static int field451;
   static int field452;
   static int field454;
   static int field460;
   static int field461;
   static int field462;
   static int field463;
   static int field464;
   static int field470;
   static int field471;
   static int field472;
   static int field474;
   static int field476;
   static int field477;
   static int field478;
   static int field479;
   static int field480;
   static int field482;
   static int field483;
   static int field484;
   static int field486;
   static int field487;
   static int field488;
   static int field489;
   static int field491;
   static int field493;
   static int field498;
   static int field501;
   static int field504;
   static int field505;
   static int field506;
   static int field507;
   static int field508;
   static int field510;
   static int field511;
   static int field513;
   static int field514;
   static int field516;
   static int field517;
   static int field519;
   static int field521;
   static int field522;
   static int field525;
   static int field526;
   static int field528;
   static int field529;
   static int field535;
   static int field540;
   static int field545;
   static int field546;
   static int field550;
   static int field552;
   static int field553;
   static int field556;
   static int field557;
   static int field558;
   static int field560;
   static int field561;
   static int field564;
   static int field565;
   static int field568;
   static int field570;
   static int field571;
   static int field572;
   static int field575;
   static int field576;
   static int field577;
   static int field579;
   static int field583;
   static int field584;
   static int field587;
   static int field588;
   static int field590;
   static int field591;
   static int field593;
   static int field595;
   static int field597;
   static int field599;
   static int field601;
   static int field602;
   static int field604;
   static int field605;
   static int field606;
   static int field607;
   static int field608;
   static int field610;
   static int field616;
   static int field621;
   static int field624;
   static int field631;
   static int field633;
   static int field639;
   static int field640;
   static int field644;
   static int field646;
   static int field647;
   static int field649;
   static int field650;
   static int field655;
   static int field657;
   static int field658;
   static int field665;
   static int field669;
   static int field670;
   static int field671;
   static int field672;
   static int field673;
   static int field675;
   static int field676;
   static int field677;
   static int field679;
   static int field682;
   static int field683;
   static int field685;
   static int[] field428;
   static int[] field431;
   static int[] field435;
   static int[] field437;
   static int[] field442;
   static int[] field450;
   static int[] field475;
   static int[] field496;
   static int[] field497;
   static int[] field499;
   static int[] field500;
   static int[] field534;
   static int[] field541;
   static int[] field542;
   static int[] field547;
   static int[] field548;
   static int[] field549;
   static int[] field594;
   static int[] field600;
   static int[] field609;
   static int[] field614;
   static int[] field619;
   static int[] field622;
   static int[] field623;
   static int[] field626;
   static int[] field627;
   static int[] field628;
   static int[] field629;
   static int[] field634;
   static int[] field641;
   static int[] field642;
   static int[] field651;
   static int[] field652;
   static int[] field653;
   static int[] field659;
   static int[] field660;
   static int[] field662;
   static int[] field664;
   static int[] field666;
   static int[] field678;
   static int[] field684;
   static int[][] field502;
   static int[][][] field467;
   static String field466;
   static String field530;
   static String field566;
   static String field630;
   static String[] field485;
   static String[] field503;
   static String[] field532;
   static String[] field551;
   static ArrayList field681;
   static HashMap field495;
   static long field417;
   static long field420;
   static long field625;
   static long field636;
   static long[] field573;
   static short field449;
   static short field473;
   static short field543;
   static short field632;
   static short field661;
   static short field663;
   static short field667;
   static short field668;
   static final class46 field494;
   static final int[] field468;
   static final int[] field531;
   class385 field596;
   class8 field446;

   static final int method1270(long var0, String var2) {
      Random var4 = new Random();
      class385 var5 = new class385(128);
      class385 var6 = new class385(128);
      int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
      var5.method5931(10);

      int var8;
      for(var8 = 0; var8 < 4; ++var8) {
         var5.method5934(var4.nextInt());
      }

      var5.method5934(var7[0]);
      var5.method5934(var7[1]);
      var5.method5936(var0);
      var5.method5936(0L);

      for(var8 = 0; var8 < 4; ++var8) {
         var5.method5934(var4.nextInt());
      }

      var5.method5971(class53.field776, class53.field773);
      var6.method5931(10);

      for(var8 = 0; var8 < 3; ++var8) {
         var6.method5934(var4.nextInt());
      }

      var6.method5936(var4.nextLong());
      var6.method6023(var4.nextLong());
      class145.method2451(var6);
      var6.method5936(var4.nextLong());
      var6.method5971(class53.field776, class53.field773);
      var8 = class281.method4532(var2);
      if (var8 % 8 != 0) {
         var8 += 8 - var8 % 8;
      }

      class385 var9 = new class385(var8);
      var9.method5938(var2);
      var9.field4182 = var8;
      var9.method5932(var7);
      class385 var10 = new class385(var9.field4182 + var6.field4182 + 5 + var5.field4182);
      var10.method5931(2);
      var10.method5931(var5.field4182);
      var10.method6003(var5.field4184, 0, var5.field4182);
      var10.method5931(var6.field4182);
      var10.method6003(var6.field4184, 0, var6.field4182);
      var10.method6122(var9.field4182);
      var10.method6003(var9.field4184, 0, var9.field4182);
      byte[] var12 = var10.field4184;
      int var14 = var12.length;
      StringBuilder var15 = new StringBuilder();

      int var18;
      for(int var16 = 0; var16 < var14 + 0; var16 += 3) {
         int var17 = var12[var16] & 255;
         var15.append(class305.field3756[var17 >>> 2]);
         if (var16 < var14 - 1) {
            var18 = var12[var16 + 1] & 255;
            var15.append(class305.field3756[(var17 & 3) << 4 | var18 >>> 4]);
            if (var16 < var14 - 2) {
               int var19 = var12[2 + var16] & 255;
               var15.append(class305.field3756[(var18 & 15) << 2 | var19 >>> 6]).append(class305.field3756[var19 & 63]);
            } else {
               var15.append(class305.field3756[(var18 & 15) << 2]).append("=");
            }
         } else {
            var15.append(class305.field3756[(var17 & 3) << 4]).append("==");
         }
      }

      String var13 = var15.toString();
      var13 = var13;

      try {
         URL var23 = new URL(class92.method2031("services", false) + "m=accountappeal/login.ws");
         URLConnection var24 = var23.openConnection();
         var24.setDoInput(true);
         var24.setDoOutput(true);
         var24.setConnectTimeout(5000);
         OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
         var25.write("data2=" + class137.method2328(var13) + "&dest=" + class137.method2328("passwordchoice.ws"));
         var25.flush();
         InputStream var26 = var24.getInputStream();
         var10 = new class385(new byte[1000]);

         do {
            var18 = var26.read(var10.field4184, var10.field4182, 1000 - var10.field4182);
            if (var18 == -1) {
               var25.close();
               var26.close();
               String var27 = new String(var10.field4184);
               if (var27.startsWith("OFFLINE")) {
                  return 4;
               } else if (var27.startsWith("WRONG")) {
                  return 7;
               } else if (var27.startsWith("RELOAD")) {
                  return 3;
               } else if (var27.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var10.method5968(var7);

                  while(var10.field4182 > 0 && 0 == var10.field4184[var10.field4182 - 1]) {
                     --var10.field4182;
                  }

                  var27 = new String(var10.field4184, 0, var10.field4182);
                  boolean var28;
                  if (null == var27) {
                     var28 = false;
                  } else {
                     label99: {
                        try {
                           new URL(var27);
                        } catch (MalformedURLException var21) {
                           var28 = false;
                           break label99;
                        }

                        var28 = true;
                     }
                  }

                  if (var28) {
                     class139.method2345(var27, true, false);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var10.field4182 += var18;
         } while(var10.field4182 < 1000);

         return 5;
      } catch (Throwable var22) {
         var22.printStackTrace();
         return 5;
      }
   }

   public client() {
   }

   static {
      field635 = true;
      field405 = 1;
      field406 = 0;
      field407 = 0;
      field562 = false;
      field409 = false;
      field410 = -1;
      field474 = -1;
      field412 = false;
      field413 = 0;
      field415 = true;
      field452 = 0;
      field417 = -1L;
      field418 = -1;
      field419 = -1;
      field420 = -1L;
      field421 = true;
      field422 = false;
      field423 = 0;
      field424 = 0;
      field425 = 0;
      field426 = 0;
      field477 = 0;
      field454 = 0;
      field429 = 0;
      field430 = 0;
      field553 = 0;
      field459 = class81.field1160;
      field433 = class81.field1160;
      field411 = 0;
      field438 = 0;
      field436 = 0;
      field504 = 0;
      field673 = 0;
      field439 = 0;
      field440 = 0;
      field590 = 0;
      field448 = class100.field1268;
      field443 = false;
      field444 = new class58();
      field447 = null;
      field567 = new class78['\u8000'];
      field685 = 0;
      field450 = new int['\u8000'];
      field501 = 0;
      field475 = new int[250];
      field453 = new class86();
      field571 = 0;
      field456 = false;
      field457 = true;
      field458 = new class312();
      field495 = new HashMap();
      field460 = 0;
      field461 = 1;
      field462 = 0;
      field550 = 1;
      field464 = 0;
      field465 = new class160[4];
      field481 = false;
      field467 = new int[4][13][13];
      field468 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field556 = 0;
      field470 = 2301979;
      field471 = 5063219;
      field472 = 3353893;
      field633 = 7759444;
      field455 = false;
      field416 = 0;
      field476 = 128;
      field445 = 0;
      field478 = 0;
      field658 = 0;
      field491 = 0;
      field546 = 0;
      field482 = 0;
      field483 = 50;
      field434 = 0;
      field441 = 0;
      field486 = 0;
      field487 = 12;
      field488 = 6;
      field489 = 0;
      field490 = false;
      field608 = 0;
      field492 = false;
      field493 = 0;
      field650 = 0;
      field579 = 50;
      field496 = new int[field579];
      field497 = new int[field579];
      field442 = new int[field579];
      field499 = new int[field579];
      field500 = new int[field579];
      field662 = new int[field579];
      field664 = new int[field579];
      field503 = new String[field579];
      field502 = new int[104][104];
      field505 = 0;
      field506 = -1;
      field507 = -1;
      field508 = 0;
      field463 = 0;
      field540 = 0;
      field511 = 0;
      field512 = true;
      field513 = 0;
      field514 = 0;
      field516 = 0;
      field404 = 0;
      field584 = 0;
      field519 = 0;
      field520 = false;
      field521 = 0;
      field522 = 0;
      field523 = true;
      field524 = new class70[2048];
      field665 = -1;
      field526 = 0;
      field527 = true;
      field427 = 0;
      field529 = 0;
      field628 = new int[1000];
      field531 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      field532 = new String[8];
      field533 = new boolean[8];
      field534 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field535 = -1;
      field536 = new class296[4][104][104];
      field537 = new class296();
      field538 = new class296();
      field539 = new class296();
      field435 = new int[25];
      field541 = new int[25];
      field542 = new int[25];
      field528 = 0;
      field544 = false;
      field545 = 0;
      field678 = new int[500];
      field547 = new int[500];
      field548 = new int[500];
      field549 = new int[500];
      field485 = new String[500];
      field551 = new String[500];
      field674 = new boolean[500];
      field408 = false;
      field554 = false;
      field555 = false;
      field578 = true;
      field557 = -1;
      field558 = -1;
      field649 = 0;
      field560 = 50;
      field561 = 0;
      field530 = null;
      field563 = false;
      field564 = -1;
      field565 = -1;
      field566 = null;
      field466 = null;
      field568 = -1;
      field569 = new class364(8);
      field570 = 0;
      field484 = -1;
      field572 = 0;
      field655 = 0;
      field574 = null;
      field432 = 0;
      field576 = 0;
      field577 = 0;
      field510 = -1;
      field603 = false;
      field580 = null;
      field581 = null;
      field582 = null;
      field583 = 0;
      field525 = 0;
      field585 = null;
      field586 = false;
      field587 = -1;
      field588 = -1;
      field589 = false;
      field679 = -1;
      field677 = -1;
      field592 = false;
      field593 = 1;
      field594 = new int[32];
      field552 = 0;
      field641 = new int[32];
      field575 = 0;
      field428 = new int[32];
      field599 = 0;
      field600 = new int[32];
      field601 = 0;
      field602 = 0;
      field610 = 0;
      field604 = 0;
      field605 = 0;
      field606 = 0;
      field607 = 0;
      field480 = 0;
      field517 = 0;
      field657 = 0;
      field611 = new class296();
      field612 = new class296();
      field686 = new class296();
      field469 = new class364(512);
      field591 = 0;
      field616 = -2;
      field617 = new boolean[100];
      field618 = new boolean[100];
      field509 = new boolean[100];
      field623 = new int[100];
      field626 = new int[100];
      field622 = new int[100];
      field619 = new int[100];
      field624 = 0;
      field625 = 0L;
      field613 = true;
      field627 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field670 = 0;
      field647 = 0;
      field630 = "";
      field573 = new long[100];
      field631 = 0;
      field451 = 0;
      field634 = new int[128];
      field431 = new int[128];
      field636 = -1L;
      field637 = new class115[1];
      field638 = new class124[1];
      field639 = -1;
      field621 = 0;
      field614 = new int[1000];
      field642 = new int[1000];
      field643 = new class398[1000];
      field644 = 0;
      field597 = 0;
      field646 = 0;
      field640 = -1;
      field648 = false;
      field498 = 0;
      field629 = new int[50];
      field651 = new int[50];
      field652 = new int[50];
      field653 = new int[50];
      field654 = new class22[50];
      field615 = false;
      field656 = new boolean[5];
      field437 = new int[5];
      field609 = new int[5];
      field659 = new int[5];
      field660 = new int[5];
      field661 = 256;
      field632 = 205;
      field663 = 256;
      field449 = 320;
      field473 = 1;
      field543 = 32767;
      field667 = 1;
      field668 = 32767;
      field669 = 0;
      field479 = 0;
      field671 = 0;
      field672 = 0;
      field595 = 0;
      field598 = new class247();
      field675 = -1;
      field676 = -1;
      field559 = new class355();
      field620 = new class286[8];
      field518 = new class47();
      field680 = -1;
      field681 = new ArrayList(10);
      field682 = 0;
      field683 = 0;
      field494 = new class46();
      field684 = new int[50];
      field666 = new int[50];
   }

   static final void method1271(int var0, int var1, int var2, int var3, int var4, int var5, class200 var6, class160 var7) {
      if (!field409 || 0 != (class62.field901[0][var1][var2] & 2) || (class62.field901[var0][var1][var2] & 16) == 0) {
         if (var0 < class62.field902) {
            class62.field902 = var0;
         }

         class156 var9 = class124.method2243(var3);
         int var10;
         int var11;
         if (var4 != 1 && 3 != var4) {
            var10 = var9.field1750;
            var11 = var9.field1751;
         } else {
            var10 = var9.field1751;
            var11 = var9.field1750;
         }

         int var12;
         int var13;
         if (var1 + var10 <= 104) {
            var12 = var1 + (var10 >> 1);
            var13 = (1 + var10 >> 1) + var1;
         } else {
            var12 = var1;
            var13 = var1 + 1;
         }

         int var14;
         int var15;
         if (var11 + var2 <= 104) {
            var14 = var2 + (var11 >> 1);
            var15 = var2 + (var11 + 1 >> 1);
         } else {
            var14 = var2;
            var15 = 1 + var2;
         }

         int[][] var16 = class62.field911[var0];
         int var17 = var16[var13][var15] + var16[var12][var15] + var16[var12][var14] + var16[var13][var14] >> 2;
         int var18 = (var1 << 7) + (var10 << 6);
         int var19 = (var2 << 7) + (var11 << 6);
         long var20 = class172.method3133(var1, var2, 2, var9.field1754 == 0, var3);
         int var22 = var5 + (var4 << 6);
         if (1 == var9.field1775) {
            var22 += 256;
         }

         if (var9.method2640()) {
            class168.method2957(var0, var1, var2, var9, var4);
         }

         Object var23;
         if (var5 == 22) {
            if (!field409 || 0 != var9.field1754 || 1 == var9.field1752 || var9.field1759) {
               if (var9.field1758 == -1 && null == var9.field1762) {
                  var23 = var9.method2633(22, var4, var16, var18, var17, var19);
               } else {
                  var23 = new class60(var3, 22, var4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
               }

               var6.method3625(var0, var1, var2, var17, (class201)var23, var20, var22);
               if (var9.field1752 == 1 && null != var7) {
                  var7.method2834(var1, var2);
               }

            }
         } else {
            int var24;
            if (10 != var5 && 11 != var5) {
               int[] var10000;
               if (var5 >= 12) {
                  if (-1 == var9.field1758 && var9.field1762 == null) {
                     var23 = var9.method2633(var5, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class60(var3, var5, var4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                  }

                  var6.method3507(var0, var1, var2, var17, 1, 1, (class201)var23, 0, var20, var22);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     var10000 = class164.field1915[var0][var1];
                     var10000[var2] |= 2340;
                  }

                  if (0 != var9.field1752 && var7 != null) {
                     var7.method2840(var1, var2, var10, var11, var9.field1779);
                  }

               } else if (0 == var5) {
                  if (var9.field1758 == -1 && var9.field1762 == null) {
                     var23 = var9.method2633(0, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class60(var3, 0, var4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                  }

                  var6.method3505(var0, var1, var2, var17, (class201)var23, (class201)null, class62.field908[var4], 0, var20, var22);
                  if (0 == var4) {
                     if (var9.field1765) {
                        class251.field3114[var0][var1][var2] = 50;
                        class251.field3114[var0][var1][var2 + 1] = 50;
                     }

                     if (var9.field1757) {
                        var10000 = class164.field1915[var0][var1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 1) {
                     if (var9.field1765) {
                        class251.field3114[var0][var1][1 + var2] = 50;
                        class251.field3114[var0][var1 + 1][1 + var2] = 50;
                     }

                     if (var9.field1757) {
                        var10000 = class164.field1915[var0][var1];
                        var10000[var2 + 1] |= 1170;
                     }
                  } else if (var4 == 2) {
                     if (var9.field1765) {
                        class251.field3114[var0][1 + var1][var2] = 50;
                        class251.field3114[var0][1 + var1][1 + var2] = 50;
                     }

                     if (var9.field1757) {
                        var10000 = class164.field1915[var0][1 + var1];
                        var10000[var2] |= 585;
                     }
                  } else if (3 == var4) {
                     if (var9.field1765) {
                        class251.field3114[var0][var1][var2] = 50;
                        class251.field3114[var0][1 + var1][var2] = 50;
                     }

                     if (var9.field1757) {
                        var10000 = class164.field1915[var0][var1];
                        var10000[var2] |= 1170;
                     }
                  }

                  if (0 != var9.field1752 && var7 != null) {
                     var7.method2809(var1, var2, var5, var4, var9.field1779);
                  }

                  if (16 != var9.field1745) {
                     var6.method3513(var0, var1, var2, var9.field1745);
                  }

               } else if (1 == var5) {
                  if (-1 == var9.field1758 && null == var9.field1762) {
                     var23 = var9.method2633(1, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class60(var3, 1, var4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                  }

                  var6.method3505(var0, var1, var2, var17, (class201)var23, (class201)null, class62.field909[var4], 0, var20, var22);
                  if (var9.field1765) {
                     if (0 == var4) {
                        class251.field3114[var0][var1][1 + var2] = 50;
                     } else if (1 == var4) {
                        class251.field3114[var0][var1 + 1][var2 + 1] = 50;
                     } else if (2 == var4) {
                        class251.field3114[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        class251.field3114[var0][var1][var2] = 50;
                     }
                  }

                  if (var9.field1752 != 0 && null != var7) {
                     var7.method2809(var1, var2, var5, var4, var9.field1779);
                  }

               } else {
                  int var29;
                  if (2 == var5) {
                     var29 = var4 + 1 & 3;
                     Object var31;
                     Object var32;
                     if (var9.field1758 == -1 && null == var9.field1762) {
                        var32 = var9.method2633(2, 4 + var4, var16, var18, var17, var19);
                        var31 = var9.method2633(2, var29, var16, var18, var17, var19);
                     } else {
                        var32 = new class60(var3, 2, var4 + 4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                        var31 = new class60(var3, 2, var29, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                     }

                     var6.method3505(var0, var1, var2, var17, (class201)var32, (class201)var31, class62.field908[var4], class62.field908[var29], var20, var22);
                     if (var9.field1757) {
                        if (var4 == 0) {
                           var10000 = class164.field1915[var0][var1];
                           var10000[var2] |= 585;
                           var10000 = class164.field1915[var0][var1];
                           var10000[var2 + 1] |= 1170;
                        } else if (1 == var4) {
                           var10000 = class164.field1915[var0][var1];
                           var10000[1 + var2] |= 1170;
                           var10000 = class164.field1915[var0][1 + var1];
                           var10000[var2] |= 585;
                        } else if (var4 == 2) {
                           var10000 = class164.field1915[var0][var1 + 1];
                           var10000[var2] |= 585;
                           var10000 = class164.field1915[var0][var1];
                           var10000[var2] |= 1170;
                        } else if (var4 == 3) {
                           var10000 = class164.field1915[var0][var1];
                           var10000[var2] |= 1170;
                           var10000 = class164.field1915[var0][var1];
                           var10000[var2] |= 585;
                        }
                     }

                     if (0 != var9.field1752 && null != var7) {
                        var7.method2809(var1, var2, var5, var4, var9.field1779);
                     }

                     if (16 != var9.field1745) {
                        var6.method3513(var0, var1, var2, var9.field1745);
                     }

                  } else if (3 == var5) {
                     if (-1 == var9.field1758 && var9.field1762 == null) {
                        var23 = var9.method2633(3, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class60(var3, 3, var4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                     }

                     var6.method3505(var0, var1, var2, var17, (class201)var23, (class201)null, class62.field909[var4], 0, var20, var22);
                     if (var9.field1765) {
                        if (var4 == 0) {
                           class251.field3114[var0][var1][1 + var2] = 50;
                        } else if (1 == var4) {
                           class251.field3114[var0][var1 + 1][1 + var2] = 50;
                        } else if (var4 == 2) {
                           class251.field3114[var0][1 + var1][var2] = 50;
                        } else if (var4 == 3) {
                           class251.field3114[var0][var1][var2] = 50;
                        }
                     }

                     if (0 != var9.field1752 && var7 != null) {
                        var7.method2809(var1, var2, var5, var4, var9.field1779);
                     }

                  } else if (9 == var5) {
                     if (var9.field1758 == -1 && var9.field1762 == null) {
                        var23 = var9.method2633(var5, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class60(var3, var5, var4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                     }

                     var6.method3507(var0, var1, var2, var17, 1, 1, (class201)var23, 0, var20, var22);
                     if (0 != var9.field1752 && var7 != null) {
                        var7.method2840(var1, var2, var10, var11, var9.field1779);
                     }

                     if (var9.field1745 != 16) {
                        var6.method3513(var0, var1, var2, var9.field1745);
                     }

                  } else if (4 == var5) {
                     if (var9.field1758 == -1 && var9.field1762 == null) {
                        var23 = var9.method2633(4, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class60(var3, 4, var4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                     }

                     var6.method3506(var0, var1, var2, var17, (class201)var23, (class201)null, class62.field908[var4], 0, 0, 0, var20, var22);
                  } else {
                     long var30;
                     Object var33;
                     if (5 == var5) {
                        var29 = 16;
                        var30 = var6.method3523(var0, var1, var2);
                        if (var30 != 0L) {
                           var29 = class124.method2243(class79.method1843(var30)).field1745;
                        }

                        if (-1 == var9.field1758 && var9.field1762 == null) {
                           var33 = var9.method2633(4, var4, var16, var18, var17, var19);
                        } else {
                           var33 = new class60(var3, 4, var4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                        }

                        var6.method3506(var0, var1, var2, var17, (class201)var33, (class201)null, class62.field908[var4], 0, class62.field906[var4] * var29, class62.field913[var4] * var29, var20, var22);
                     } else if (6 == var5) {
                        var29 = 8;
                        var30 = var6.method3523(var0, var1, var2);
                        if (var30 != 0L) {
                           var29 = class124.method2243(class79.method1843(var30)).field1745 / 2;
                        }

                        if (-1 == var9.field1758 && null == var9.field1762) {
                           var33 = var9.method2633(4, var4 + 4, var16, var18, var17, var19);
                        } else {
                           var33 = new class60(var3, 4, var4 + 4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                        }

                        var6.method3506(var0, var1, var2, var17, (class201)var33, (class201)null, 256, var4, class62.field904[var4] * var29, class62.field915[var4] * var29, var20, var22);
                     } else if (var5 == 7) {
                        var24 = 2 + var4 & 3;
                        if (-1 == var9.field1758 && null == var9.field1762) {
                           var23 = var9.method2633(4, var24 + 4, var16, var18, var17, var19);
                        } else {
                           var23 = new class60(var3, 4, 4 + var24, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                        }

                        var6.method3506(var0, var1, var2, var17, (class201)var23, (class201)null, 256, var24, 0, 0, var20, var22);
                     } else if (var5 == 8) {
                        var29 = 8;
                        var30 = var6.method3523(var0, var1, var2);
                        if (0L != var30) {
                           var29 = class124.method2243(class79.method1843(var30)).field1745 / 2;
                        }

                        int var28 = 2 + var4 & 3;
                        Object var27;
                        if (var9.field1758 == -1 && null == var9.field1762) {
                           var33 = var9.method2633(4, 4 + var4, var16, var18, var17, var19);
                           var27 = var9.method2633(4, 4 + var28, var16, var18, var17, var19);
                        } else {
                           var33 = new class60(var3, 4, var4 + 4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                           var27 = new class60(var3, 4, var28 + 4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
                        }

                        var6.method3506(var0, var1, var2, var17, (class201)var33, (class201)var27, 256, var4, class62.field904[var4] * var29, var29 * class62.field915[var4], var20, var22);
                     }
                  }
               }
            } else {
               if (var9.field1758 == -1 && null == var9.field1762) {
                  var23 = var9.method2633(10, var4, var16, var18, var17, var19);
               } else {
                  var23 = new class60(var3, 10, var4, var0, var1, var2, var9.field1758, var9.field1734, (class201)null);
               }

               if (null != var23 && var6.method3507(var0, var1, var2, var17, var10, var11, (class201)var23, 11 == var5 ? 256 : 0, var20, var22) && var9.field1765) {
                  var24 = 15;
                  if (var23 instanceof class207) {
                     var24 = ((class207)var23).method3723() / 4;
                     if (var24 > 30) {
                        var24 = 30;
                     }
                  }

                  for(int var25 = 0; var25 <= var10; ++var25) {
                     for(int var26 = 0; var26 <= var11; ++var26) {
                        if (var24 > class251.field3114[var0][var25 + var1][var26 + var2]) {
                           class251.field3114[var0][var1 + var25][var2 + var26] = (byte)var24;
                        }
                     }
                  }
               }

               if (0 != var9.field1752 && var7 != null) {
                  var7.method2840(var1, var2, var10, var11, var9.field1779);
               }

            }
         }
      }
   }

   protected final void method186() {
   }

   public final void init() {
      if (this.method154()) {
         for(int var1 = 0; var1 <= 20; ++var1) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (null != var2) {
               switch(var1) {
               case 1:
                  field457 = Integer.parseInt(var2) != 0;
               case 2:
               case 11:
               case 13:
               case 16:
               default:
                  break;
               case 3:
                  if (var2.equalsIgnoreCase(class79.field1142)) {
                     field562 = true;
                  } else {
                     field562 = false;
                  }
                  break;
               case 4:
                  if (field410 == -1) {
                     field410 = Integer.parseInt(var2);
                  }
                  break;
               case 5:
                  field406 = Integer.parseInt(var2);
                  break;
               case 6:
                  class284.field3644 = class292.method4628(Integer.parseInt(var2));
                  break;
               case 7:
                  int var4 = Integer.parseInt(var2);
                  class265[] var5 = class62.method1652();
                  int var6 = 0;

                  class265 var3;
                  while(true) {
                     if (var6 >= var5.length) {
                        var3 = null;
                        break;
                     }

                     class265 var7 = var5[var6];
                     if (var7.field3200 == var4) {
                        var3 = var7;
                        break;
                     }

                     ++var6;
                  }

                  class202.field2350 = var3;
                  break;
               case 8:
                  if (var2.equalsIgnoreCase(class79.field1142)) {
                  }
                  break;
               case 9:
                  class150.field1661 = var2;
                  break;
               case 10:
                  class69.field976 = (class266)class251.method4287(class208.method3827(), Integer.parseInt(var2));
                  if (class69.field976 == class266.field3206) {
                     class52.field761 = class367.field4123;
                  } else {
                     class52.field761 = class367.field4122;
                  }
                  break;
               case 12:
                  field405 = Integer.parseInt(var2);
                  break;
               case 14:
                  class408.field4314 = Integer.parseInt(var2);
                  break;
               case 15:
                  field407 = Integer.parseInt(var2);
                  break;
               case 17:
                  class310.field3776 = var2;
               }
            }
         }

         class251.method4293();
         class244.field2918 = this.getCodeBase().getHost();
         String var9 = class202.field2350.field3202;
         byte var10 = 0;

         try {
            class214.method3847("oldschool", var9, var10, 21);
         } catch (Exception var8) {
            class333.method5330((String)null, var8);
         }

         class59.field874 = this;
         class97.field1259 = field410;
         if (-1 == field474) {
            field474 = 0;
         }

         this.method217(765, 503, 198);
      }
   }

   protected final void method275() {
      int[] var2 = new int[]{20, 260, 10000};
      int[] var3 = new int[]{1000, 100, 500};
      if (var2 != null && var3 != null) {
         class310.field3774 = var2;
         class128.field1460 = new int[var2.length];
         class310.field3775 = new byte[var2.length][][];

         for(int var4 = 0; var4 < class310.field3774.length; ++var4) {
            class310.field3775[var4] = new byte[var3[var4]][];
         }
      } else {
         class310.field3774 = null;
         class128.field1460 = null;
         class310.field3775 = (byte[][][])null;
      }

      class170.field1982 = field407 == 0 ? '\uaa4a' : '\u9c40' + field405;
      class5.field7 = field407 == 0 ? 443 : '\uc350' + field405;
      class291.field3679 = class170.field1982;
      class283.field3635 = class248.field2942;
      class244.field2915 = class248.field2944;
      class8.field26 = class248.field2941;
      class209.field2499 = class248.field2943;
      class170.field1992 = new class87();
      this.method157();
      this.method158();
      class13.field79 = this.method155();
      class308.field3766 = new class334(255, class131.field1477, class131.field1479, 500000);
      class38.field308 = class25.method437();
      this.method156();
      class66.method1679(this, class95.field1249);
      if (0 != field407) {
         field422 = true;
      }

      class165.method2864(class38.field308.field1122);
      class13.field80 = new class49(class52.field761);
   }

   protected final void method178() {
      ++field452;
      this.method1131();
      class269.method4358();

      int var2;
      try {
         if (1 == class235.field2819) {
            var2 = class235.field2816.method3967();
            if (var2 > 0 && class235.field2816.method3975()) {
               var2 -= class124.field1439;
               if (var2 < 0) {
                  var2 = 0;
               }

               class235.field2816.method3966(var2);
            } else {
               class235.field2816.method3972();
               class235.field2816.method3970();
               if (class235.field2820 != null) {
                  class235.field2819 = 2;
               } else {
                  class235.field2819 = 0;
               }

               class181.field2080 = null;
               class143.field1576 = null;
            }
         }
      } catch (Exception var50) {
         var50.printStackTrace();
         class235.field2816.method3972();
         class235.field2819 = 0;
         class181.field2080 = null;
         class143.field1576 = null;
         class235.field2820 = null;
      }

      class263.method4333();
      int var3;
      synchronized(class11.field59) {
         ++class11.field61;
         class11.field58 = class11.field60;
         class11.field36 = 0;
         class11.field65 = 0;
         Arrays.fill(class11.field47, false);
         Arrays.fill(class11.field39, false);
         if (class11.field51 < 0) {
            Arrays.fill(class11.field46, false);
            class11.field51 = class11.field50;
         } else {
            while(class11.field51 != class11.field50) {
               var3 = class11.field49[class11.field50];
               class11.field50 = class11.field50 + 1 & 127;
               if (var3 < 0) {
                  var3 = ~var3;
                  if (class11.field46[var3]) {
                     class11.field46[var3] = false;
                     class11.field39[var3] = true;
                     class11.field56[class11.field65] = var3;
                     ++class11.field65;
                  }
               } else {
                  if (!class11.field46[var3] && class11.field36 < class11.field54.length - 1) {
                     class11.field47[var3] = true;
                     class11.field54[++class11.field36 - 1] = var3;
                  }

                  class11.field46[var3] = true;
               }
            }
         }

         if (class11.field36 > 0) {
            class11.field61 = 0;
         }

         class11.field60 = class11.field53;
      }

      synchronized(class20.field135) {
         class20.field141 = class20.field143;
         class20.field142 = class20.field138;
         class20.field145 = class20.field139;
         class20.field144 = class20.field133;
         class20.field149 = class20.field154;
         class20.field150 = class20.field136;
         class20.field151 = class20.field147;
         class20.field152 = class20.field148;
         class20.field154 = 0;
      }

      if (null != class13.field79) {
         var2 = class13.field79.method2295();
         field657 = var2;
      }

      if (0 == field413) {
         class186.method3240();
         class85.field1199.method2322();

         for(var2 = 0; var2 < 32; ++var2) {
            class19.field105[var2] = 0L;
         }

         for(var2 = 0; var2 < 32; ++var2) {
            class19.field112[var2] = 0L;
         }

         class259.field3167 = 0;
      } else if (5 == field413) {
         class156.method2645(this);
         class186.method3240();
         class85.field1199.method2322();

         for(var2 = 0; var2 < 32; ++var2) {
            class19.field105[var2] = 0L;
         }

         for(var2 = 0; var2 < 32; ++var2) {
            class19.field112[var2] = 0L;
         }

         class259.field3167 = 0;
      } else if (10 != field413 && field413 != 11) {
         if (20 == field413) {
            class156.method2645(this);
            this.method1094();
         } else if (field413 == 25) {
            class232.method3924(false);
            field460 = 0;
            boolean var53 = true;

            for(var3 = 0; var3 < class227.field2673.length; ++var3) {
               if (class251.field3110[var3] != -1 && null == class227.field2673[var3]) {
                  class227.field2673[var3] = class199.field2277.method4412(class251.field3110[var3], 0);
                  if (class227.field2673[var3] == null) {
                     var53 = false;
                     ++field460;
                  }
               }

               if (class97.field1263[var3] != -1 && class356.field4011[var3] == null) {
                  class356.field4011[var3] = class199.field2277.method4413(class97.field1263[var3], 0, class44.field370[var3]);
                  if (class356.field4011[var3] == null) {
                     var53 = false;
                     ++field460;
                  }
               }
            }

            if (!var53) {
               field464 = 1;
            } else {
               field462 = 0;
               var53 = true;

               int var5;
               int var6;
               class385 var10;
               int var11;
               int var12;
               int var13;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               for(var3 = 0; var3 < class227.field2673.length; ++var3) {
                  byte[] var4 = class356.field4011[var3];
                  if (var4 != null) {
                     var5 = 64 * (class235.field2821[var3] >> 8) - class281.field3625;
                     var6 = 64 * (class235.field2821[var3] & 255) - class78.field1134;
                     if (field481) {
                        var5 = 10;
                        var6 = 10;
                     }

                     boolean var9 = true;
                     var10 = new class385(var4);
                     var11 = -1;

                     label1339:
                     while(true) {
                        var12 = var10.method6171();
                        if (var12 == 0) {
                           var53 &= var9;
                           break;
                        }

                        var11 += var12;
                        var13 = 0;
                        boolean var14 = false;

                        while(true) {
                           while(!var14) {
                              var15 = var10.method5962();
                              if (var15 == 0) {
                                 continue label1339;
                              }

                              var13 += var15 - 1;
                              var16 = var13 & 63;
                              var17 = var13 >> 6 & 63;
                              var18 = var10.method5948() >> 2;
                              var19 = var17 + var5;
                              var20 = var16 + var6;
                              if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                                 class156 var21 = class124.method2243(var11);
                                 if (22 != var18 || !field409 || 0 != var21.field1754 || 1 == var21.field1752 || var21.field1759) {
                                    if (!var21.method2632()) {
                                       ++field462;
                                       var9 = false;
                                    }

                                    var14 = true;
                                 }
                              }
                           }

                           var15 = var10.method5962();
                           if (var15 == 0) {
                              break;
                           }

                           var10.method5948();
                        }
                     }
                  }
               }

               if (!var53) {
                  field464 = 2;
               } else {
                  if (field464 != 0) {
                     class12.method98(class270.field3237 + class79.field1144 + class79.field1141 + 100 + "%" + class79.field1139, true);
                  }

                  class263.method4333();
                  class166.field1925.method3658();

                  for(var3 = 0; var3 < 4; ++var3) {
                     field465[var3].method2808();
                  }

                  int var51;
                  for(var3 = 0; var3 < 4; ++var3) {
                     for(var51 = 0; var51 < 104; ++var51) {
                        for(var5 = 0; var5 < 104; ++var5) {
                           class62.field901[var3][var51][var5] = 0;
                        }
                     }
                  }

                  class263.method4333();
                  class62.field902 = 99;
                  class340.field3937 = new byte[4][104][104];
                  class61.field895 = new byte[4][104][104];
                  class62.field916 = new byte[4][104][104];
                  class62.field910 = new byte[4][104][104];
                  class164.field1915 = new int[4][105][105];
                  class251.field3114 = new byte[4][105][105];
                  class62.field905 = new int[105][105];
                  class54.field788 = new int[104];
                  class62.field903 = new int[104];
                  class257.field3138 = new int[104];
                  class338.field3926 = new int[104];
                  class81.field1162 = new int[104];
                  var3 = class227.field2673.length;

                  for(class50 var52 = (class50)class50.field720.method4687(); var52 != null; var52 = (class50)class50.field720.method4678()) {
                     if (null != var52.field727) {
                        class82.field1163.method336(var52.field727);
                        var52.field727 = null;
                     }

                     if (var52.field725 != null) {
                        class82.field1163.method336(var52.field725);
                        var52.field725 = null;
                     }
                  }

                  class50.field720.method4671();
                  class232.method3924(true);
                  int var22;
                  int var23;
                  int var55;
                  int var65;
                  int var67;
                  if (!field481) {
                     byte[] var7;
                     for(var51 = 0; var51 < var3; ++var51) {
                        var5 = (class235.field2821[var51] >> 8) * 64 - class281.field3625;
                        var6 = (class235.field2821[var51] & 255) * 64 - class78.field1134;
                        var7 = class227.field2673[var51];
                        if (var7 != null) {
                           class263.method4333();
                           class57.method1586(var7, var5, var6, class20.field137 * 8 - 48, class8.field27 * 8 - 48, field465);
                        }
                     }

                     for(var51 = 0; var51 < var3; ++var51) {
                        var5 = 64 * (class235.field2821[var51] >> 8) - class281.field3625;
                        var6 = 64 * (class235.field2821[var51] & 255) - class78.field1134;
                        var7 = class227.field2673[var51];
                        if (null == var7 && class8.field27 < 800) {
                           class263.method4333();
                           class166.method2879(var5, var6, 64, 64);
                        }
                     }

                     class232.method3924(true);

                     for(var51 = 0; var51 < var3; ++var51) {
                        byte[] var54 = class356.field4011[var51];
                        if (null != var54) {
                           var6 = 64 * (class235.field2821[var51] >> 8) - class281.field3625;
                           var55 = (class235.field2821[var51] & 255) * 64 - class78.field1134;
                           class263.method4333();
                           class200 var8 = class166.field1925;
                           class160[] var60 = field465;
                           var10 = new class385(var54);
                           var11 = -1;

                           while(true) {
                              var12 = var10.method6171();
                              if (var12 == 0) {
                                 break;
                              }

                              var11 += var12;
                              var13 = 0;

                              while(true) {
                                 var65 = var10.method5962();
                                 if (var65 == 0) {
                                    break;
                                 }

                                 var13 += var65 - 1;
                                 var15 = var13 & 63;
                                 var16 = var13 >> 6 & 63;
                                 var17 = var13 >> 12;
                                 var18 = var10.method5948();
                                 var19 = var18 >> 2;
                                 var20 = var18 & 3;
                                 var67 = var16 + var6;
                                 var22 = var15 + var55;
                                 if (var67 > 0 && var22 > 0 && var67 < 103 && var22 < 103) {
                                    var23 = var17;
                                    if ((class62.field901[1][var67][var22] & 2) == 2) {
                                       var23 = var17 - 1;
                                    }

                                    class160 var24 = null;
                                    if (var23 >= 0) {
                                       var24 = var60[var23];
                                    }

                                    method1271(var17, var67, var22, var11, var20, var19, var8, var24);
                                 }
                              }
                           }
                        }
                     }
                  }

                  int var57;
                  int var61;
                  int var63;
                  if (field481) {
                     var51 = 0;

                     label1238:
                     while(true) {
                        if (var51 >= 4) {
                           for(var51 = 0; var51 < 13; ++var51) {
                              for(var5 = 0; var5 < 13; ++var5) {
                                 var6 = field467[0][var51][var5];
                                 if (-1 == var6) {
                                    class166.method2879(8 * var51, var5 * 8, 8, 8);
                                 }
                              }
                           }

                           class232.method3924(true);
                           var51 = 0;

                           while(true) {
                              if (var51 >= 4) {
                                 break label1238;
                              }

                              class263.method4333();

                              for(var5 = 0; var5 < 13; ++var5) {
                                 for(var6 = 0; var6 < 13; ++var6) {
                                    var55 = field467[var51][var5][var6];
                                    if (var55 != -1) {
                                       var57 = var55 >> 24 & 3;
                                       var61 = var55 >> 1 & 3;
                                       var63 = var55 >> 14 & 1023;
                                       var11 = var55 >> 3 & 2047;
                                       var12 = (var63 / 8 << 8) + var11 / 8;

                                       for(var13 = 0; var13 < class235.field2821.length; ++var13) {
                                          if (class235.field2821[var13] == var12 && class356.field4011[var13] != null) {
                                             class138.method2332(class356.field4011[var13], var51, 8 * var5, 8 * var6, var57, 8 * (var63 & 7), (var11 & 7) * 8, var61, class166.field1925, field465);
                                             break;
                                          }
                                       }
                                    }
                                 }
                              }

                              ++var51;
                           }
                        }

                        class263.method4333();

                        for(var5 = 0; var5 < 13; ++var5) {
                           for(var6 = 0; var6 < 13; ++var6) {
                              boolean var56 = false;
                              var57 = field467[var51][var5][var6];
                              if (var57 != -1) {
                                 var61 = var57 >> 24 & 3;
                                 var63 = var57 >> 1 & 3;
                                 var11 = var57 >> 14 & 1023;
                                 var12 = var57 >> 3 & 2047;
                                 var13 = var12 / 8 + (var11 / 8 << 8);

                                 for(var65 = 0; var65 < class235.field2821.length; ++var65) {
                                    if (class235.field2821[var65] == var13 && class227.field2673[var65] != null) {
                                       class169.method3068(class227.field2673[var65], var51, var5 * 8, 8 * var6, var61, 8 * (var11 & 7), 8 * (var12 & 7), var63, field465);
                                       var56 = true;
                                       break;
                                    }
                                 }
                              }

                              if (!var56) {
                                 class292.method4645(var51, var5 * 8, 8 * var6);
                              }
                           }
                        }

                        ++var51;
                     }
                  }

                  class232.method3924(true);
                  class263.method4333();
                  class200 var58 = class166.field1925;
                  class160[] var59 = field465;

                  for(var6 = 0; var6 < 4; ++var6) {
                     for(var55 = 0; var55 < 104; ++var55) {
                        for(var57 = 0; var57 < 104; ++var57) {
                           if (1 == (class62.field901[var6][var55][var57] & 1)) {
                              var61 = var6;
                              if (2 == (class62.field901[1][var55][var57] & 2)) {
                                 var61 = var6 - 1;
                              }

                              if (var61 >= 0) {
                                 var59[var61].method2807(var55, var57);
                              }
                           }
                        }
                     }
                  }

                  class62.field914 += (int)(Math.random() * 5.0D) - 2;
                  if (class62.field914 < -8) {
                     class62.field914 = -8;
                  }

                  if (class62.field914 > 8) {
                     class62.field914 = 8;
                  }

                  class62.field900 += (int)(Math.random() * 5.0D) - 2;
                  if (class62.field900 < -16) {
                     class62.field900 = -16;
                  }

                  if (class62.field900 > 16) {
                     class62.field900 = 16;
                  }

                  int[] var10000;
                  for(var6 = 0; var6 < 4; ++var6) {
                     byte[][] var62 = class251.field3114[var6];
                     var13 = (int)Math.sqrt(5100.0D);
                     var65 = 768 * var13 >> 8;

                     int var74;
                     for(var15 = 1; var15 < 103; ++var15) {
                        for(var16 = 1; var16 < 103; ++var16) {
                           var17 = class62.field911[var6][1 + var16][var15] - class62.field911[var6][var16 - 1][var15];
                           var18 = class62.field911[var6][var16][var15 + 1] - class62.field911[var6][var16][var15 - 1];
                           var19 = (int)Math.sqrt((double)(var18 * var18 + var17 * var17 + 65536));
                           var20 = (var17 << 8) / var19;
                           var67 = 65536 / var19;
                           var22 = (var18 << 8) / var19;
                           var23 = (var67 * -10 + var20 * -50 + -50 * var22) / var65 + 96;
                           var74 = (var62[var16][var15] >> 1) + (var62[var16 + 1][var15] >> 3) + (var62[var16 - 1][var15] >> 2) + (var62[var16][var15 - 1] >> 2) + (var62[var16][var15 + 1] >> 3);
                           class62.field905[var16][var15] = var23 - var74;
                        }
                     }

                     for(var15 = 0; var15 < 104; ++var15) {
                        class54.field788[var15] = 0;
                        class62.field903[var15] = 0;
                        class257.field3138[var15] = 0;
                        class338.field3926[var15] = 0;
                        class81.field1162[var15] = 0;
                     }

                     for(var15 = -5; var15 < 109; ++var15) {
                        for(var16 = 0; var16 < 104; ++var16) {
                           var17 = var15 + 5;
                           int var10002;
                           if (var17 >= 0 && var17 < 104) {
                              var18 = class340.field3937[var6][var17][var16] & 255;
                              if (var18 > 0) {
                                 var20 = var18 - 1;
                                 class151 var70 = (class151)class151.field1680.method3880((long)var20);
                                 class151 var66;
                                 if (null != var70) {
                                    var66 = var70;
                                 } else {
                                    byte[] var71 = class151.field1683.method4412(1, var20);
                                    var70 = new class151();
                                    if (null != var71) {
                                       var70.method2516(new class385(var71), var20);
                                    }

                                    var70.method2515();
                                    class151.field1680.method3882(var70, (long)var20);
                                    var66 = var70;
                                 }

                                 var10000 = class54.field788;
                                 var10000[var16] += var66.field1682;
                                 var10000 = class62.field903;
                                 var10000[var16] += var66.field1686;
                                 var10000 = class257.field3138;
                                 var10000[var16] += var66.field1684;
                                 var10000 = class338.field3926;
                                 var10000[var16] += var66.field1685;
                                 var10002 = class81.field1162[var16]++;
                              }
                           }

                           var18 = var15 - 5;
                           if (var18 >= 0 && var18 < 104) {
                              var19 = class340.field3937[var6][var18][var16] & 255;
                              if (var19 > 0) {
                                 var67 = var19 - 1;
                                 class151 var72 = (class151)class151.field1680.method3880((long)var67);
                                 class151 var68;
                                 if (null != var72) {
                                    var68 = var72;
                                 } else {
                                    byte[] var73 = class151.field1683.method4412(1, var67);
                                    var72 = new class151();
                                    if (null != var73) {
                                       var72.method2516(new class385(var73), var67);
                                    }

                                    var72.method2515();
                                    class151.field1680.method3882(var72, (long)var67);
                                    var68 = var72;
                                 }

                                 var10000 = class54.field788;
                                 var10000[var16] -= var68.field1682;
                                 var10000 = class62.field903;
                                 var10000[var16] -= var68.field1686;
                                 var10000 = class257.field3138;
                                 var10000[var16] -= var68.field1684;
                                 var10000 = class338.field3926;
                                 var10000[var16] -= var68.field1685;
                                 var10002 = class81.field1162[var16]--;
                              }
                           }
                        }

                        if (var15 >= 1 && var15 < 103) {
                           var16 = 0;
                           var17 = 0;
                           var18 = 0;
                           var19 = 0;
                           var20 = 0;

                           for(var67 = -5; var67 < 109; ++var67) {
                              var22 = 5 + var67;
                              if (var22 >= 0 && var22 < 104) {
                                 var16 += class54.field788[var22];
                                 var17 += class62.field903[var22];
                                 var18 += class257.field3138[var22];
                                 var19 += class338.field3926[var22];
                                 var20 += class81.field1162[var22];
                              }

                              var23 = var67 - 5;
                              if (var23 >= 0 && var23 < 104) {
                                 var16 -= class54.field788[var23];
                                 var17 -= class62.field903[var23];
                                 var18 -= class257.field3138[var23];
                                 var19 -= class338.field3926[var23];
                                 var20 -= class81.field1162[var23];
                              }

                              if (var67 >= 1 && var67 < 103 && (!field409 || 0 != (class62.field901[0][var15][var67] & 2) || (class62.field901[var6][var15][var67] & 16) == 0)) {
                                 if (var6 < class62.field902) {
                                    class62.field902 = var6;
                                 }

                                 var74 = class340.field3937[var6][var15][var67] & 255;
                                 int var25 = class61.field895[var6][var15][var67] & 255;
                                 if (var74 > 0 || var25 > 0) {
                                    int var26 = class62.field911[var6][var15][var67];
                                    int var27 = class62.field911[var6][1 + var15][var67];
                                    int var28 = class62.field911[var6][1 + var15][var67 + 1];
                                    int var29 = class62.field911[var6][var15][1 + var67];
                                    int var30 = class62.field905[var15][var67];
                                    int var31 = class62.field905[1 + var15][var67];
                                    int var32 = class62.field905[1 + var15][1 + var67];
                                    int var33 = class62.field905[var15][1 + var67];
                                    int var34 = -1;
                                    int var35 = -1;
                                    int var36;
                                    int var37;
                                    int var38;
                                    if (var74 > 0) {
                                       var36 = 256 * var16 / var19;
                                       var37 = var17 / var20;
                                       var38 = var18 / var20;
                                       var34 = class63.method1654(var36, var37, var38);
                                       var36 = var36 + class62.field914 & 255;
                                       var38 += class62.field900;
                                       if (var38 < 0) {
                                          var38 = 0;
                                       } else if (var38 > 255) {
                                          var38 = 255;
                                       }

                                       var35 = class63.method1654(var36, var37, var38);
                                    }

                                    class158 var39;
                                    if (var6 > 0) {
                                       boolean var75 = true;
                                       if (0 == var74 && class62.field916[var6][var15][var67] != 0) {
                                          var75 = false;
                                       }

                                       if (var25 > 0) {
                                          var38 = var25 - 1;
                                          var39 = (class158)class158.field1843.method3880((long)var38);
                                          class158 var76;
                                          if (var39 != null) {
                                             var76 = var39;
                                          } else {
                                             byte[] var40 = class158.field1855.method4412(4, var38);
                                             var39 = new class158();
                                             if (null != var40) {
                                                var39.method2758(new class385(var40), var38);
                                             }

                                             var39.method2757();
                                             class158.field1843.method3882(var39, (long)var38);
                                             var76 = var39;
                                          }

                                          if (!var76.field1846) {
                                             var75 = false;
                                          }
                                       }

                                       if (var75 && var27 == var26 && var28 == var26 && var29 == var26) {
                                          var10000 = class164.field1915[var6][var15];
                                          var10000[var67] |= 2340;
                                       }
                                    }

                                    var36 = 0;
                                    if (var35 != -1) {
                                       var36 = class198.field2268[class53.method1539(var35, 96)];
                                    }

                                    if (var25 == 0) {
                                       var58.method3677(var6, var15, var67, 0, 0, -1, var26, var27, var28, var29, class53.method1539(var34, var30), class53.method1539(var34, var31), class53.method1539(var34, var32), class53.method1539(var34, var33), 0, 0, 0, 0, var36, 0);
                                    } else {
                                       var37 = 1 + class62.field916[var6][var15][var67];
                                       byte var77 = class62.field910[var6][var15][var67];
                                       int var78 = var25 - 1;
                                       class158 var41 = (class158)class158.field1843.method3880((long)var78);
                                       if (var41 != null) {
                                          var39 = var41;
                                       } else {
                                          byte[] var42 = class158.field1855.method4412(4, var78);
                                          var41 = new class158();
                                          if (null != var42) {
                                             var41.method2758(new class385(var42), var78);
                                          }

                                          var41.method2757();
                                          class158.field1843.method3882(var41, (long)var78);
                                          var39 = var41;
                                       }

                                       int var79 = var39.field1856;
                                       int var43;
                                       int var44;
                                       int var45;
                                       int var46;
                                       if (var79 >= 0) {
                                          var44 = class198.field2269.method3835(var79);
                                          var43 = -1;
                                       } else if (var39.field1844 == 16711935) {
                                          var43 = -2;
                                          var79 = -1;
                                          var44 = -2;
                                       } else {
                                          var43 = class63.method1654(var39.field1847, var39.field1849, var39.field1850);
                                          var45 = var39.field1847 + class62.field914 & 255;
                                          var46 = class62.field900 + var39.field1850;
                                          if (var46 < 0) {
                                             var46 = 0;
                                          } else if (var46 > 255) {
                                             var46 = 255;
                                          }

                                          var44 = class63.method1654(var45, var39.field1849, var46);
                                       }

                                       var45 = 0;
                                       if (-2 != var44) {
                                          var45 = class198.field2268[class52.method1527(var44, 96)];
                                       }

                                       if (-1 != var39.field1848) {
                                          var46 = class62.field914 + var39.field1851 & 255;
                                          int var47 = var39.field1853 + class62.field900;
                                          if (var47 < 0) {
                                             var47 = 0;
                                          } else if (var47 > 255) {
                                             var47 = 255;
                                          }

                                          var44 = class63.method1654(var46, var39.field1852, var47);
                                          var45 = class198.field2268[class52.method1527(var44, 96)];
                                       }

                                       var58.method3677(var6, var15, var67, var37, var77, var79, var26, var27, var28, var29, class53.method1539(var34, var30), class53.method1539(var34, var31), class53.method1539(var34, var32), class53.method1539(var34, var33), class52.method1527(var43, var30), class52.method1527(var43, var31), class52.method1527(var43, var32), class52.method1527(var43, var33), var36, var45);
                                    }
                                 }
                              }
                           }
                        }
                     }

                     for(var15 = 1; var15 < 103; ++var15) {
                        for(var16 = 1; var16 < 103; ++var16) {
                           if ((class62.field901[var6][var16][var15] & 8) != 0) {
                              var67 = 0;
                           } else if (var6 > 0 && 0 != (class62.field901[1][var16][var15] & 2)) {
                              var67 = var6 - 1;
                           } else {
                              var67 = var6;
                           }

                           var58.method3502(var6, var16, var15, var67);
                        }
                     }

                     class340.field3937[var6] = (byte[][])null;
                     class61.field895[var6] = (byte[][])null;
                     class62.field916[var6] = (byte[][])null;
                     class62.field910[var6] = (byte[][])null;
                     class251.field3114[var6] = (byte[][])null;
                  }

                  var58.method3528(-50, -10, -50);

                  for(var6 = 0; var6 < 104; ++var6) {
                     for(var55 = 0; var55 < 104; ++var55) {
                        if ((class62.field901[1][var6][var55] & 2) == 2) {
                           var58.method3612(var6, var55);
                        }
                     }
                  }

                  var6 = 1;
                  var55 = 2;
                  var57 = 4;

                  for(var61 = 0; var61 < 4; ++var61) {
                     if (var61 > 0) {
                        var6 <<= 3;
                        var55 <<= 3;
                        var57 <<= 3;
                     }

                     for(var63 = 0; var63 <= var61; ++var63) {
                        for(var11 = 0; var11 <= 104; ++var11) {
                           for(var12 = 0; var12 <= 104; ++var12) {
                              short var69;
                              if (0 != (class164.field1915[var63][var12][var11] & var6)) {
                                 var13 = var11;
                                 var65 = var11;
                                 var15 = var63;

                                 for(var16 = var63; var13 > 0 && (class164.field1915[var63][var12][var13 - 1] & var6) != 0; --var13) {
                                 }

                                 while(var65 < 104 && 0 != (class164.field1915[var63][var12][var65 + 1] & var6)) {
                                    ++var65;
                                 }

                                 label923:
                                 while(var15 > 0) {
                                    for(var17 = var13; var17 <= var65; ++var17) {
                                       if (0 == (class164.field1915[var15 - 1][var12][var17] & var6)) {
                                          break label923;
                                       }
                                    }

                                    --var15;
                                 }

                                 label912:
                                 while(var16 < var61) {
                                    for(var17 = var13; var17 <= var65; ++var17) {
                                       if (0 == (class164.field1915[1 + var16][var12][var17] & var6)) {
                                          break label912;
                                       }
                                    }

                                    ++var16;
                                 }

                                 var17 = (var65 - var13 + 1) * (1 + var16 - var15);
                                 if (var17 >= 8) {
                                    var69 = 240;
                                    var19 = class62.field911[var16][var12][var13] - var69;
                                    var20 = class62.field911[var15][var12][var13];
                                    class200.method3501(var61, 1, var12 * 128, var12 * 128, 128 * var13, 128 * var65 + 128, var19, var20);

                                    for(var67 = var15; var67 <= var16; ++var67) {
                                       for(var22 = var13; var22 <= var65; ++var22) {
                                          var10000 = class164.field1915[var67][var12];
                                          var10000[var22] &= ~var6;
                                       }
                                    }
                                 }
                              }

                              if ((class164.field1915[var63][var12][var11] & var55) != 0) {
                                 var13 = var12;
                                 var65 = var12;
                                 var15 = var63;

                                 for(var16 = var63; var13 > 0 && (class164.field1915[var63][var13 - 1][var11] & var55) != 0; --var13) {
                                 }

                                 while(var65 < 104 && (class164.field1915[var63][var65 + 1][var11] & var55) != 0) {
                                    ++var65;
                                 }

                                 label976:
                                 while(var15 > 0) {
                                    for(var17 = var13; var17 <= var65; ++var17) {
                                       if ((class164.field1915[var15 - 1][var17][var11] & var55) == 0) {
                                          break label976;
                                       }
                                    }

                                    --var15;
                                 }

                                 label965:
                                 while(var16 < var61) {
                                    for(var17 = var13; var17 <= var65; ++var17) {
                                       if (0 == (class164.field1915[1 + var16][var17][var11] & var55)) {
                                          break label965;
                                       }
                                    }

                                    ++var16;
                                 }

                                 var17 = (1 + (var65 - var13)) * (var16 + 1 - var15);
                                 if (var17 >= 8) {
                                    var69 = 240;
                                    var19 = class62.field911[var16][var13][var11] - var69;
                                    var20 = class62.field911[var15][var13][var11];
                                    class200.method3501(var61, 2, 128 * var13, 128 + var65 * 128, 128 * var11, var11 * 128, var19, var20);

                                    for(var67 = var15; var67 <= var16; ++var67) {
                                       for(var22 = var13; var22 <= var65; ++var22) {
                                          var10000 = class164.field1915[var67][var22];
                                          var10000[var11] &= ~var55;
                                       }
                                    }
                                 }
                              }

                              if ((class164.field1915[var63][var12][var11] & var57) != 0) {
                                 var13 = var12;
                                 var65 = var12;
                                 var15 = var11;

                                 for(var16 = var11; var15 > 0 && 0 != (class164.field1915[var63][var12][var15 - 1] & var57); --var15) {
                                 }

                                 while(var16 < 104 && 0 != (class164.field1915[var63][var12][var16 + 1] & var57)) {
                                    ++var16;
                                 }

                                 label1029:
                                 while(var13 > 0) {
                                    for(var17 = var15; var17 <= var16; ++var17) {
                                       if (0 == (class164.field1915[var63][var13 - 1][var17] & var57)) {
                                          break label1029;
                                       }
                                    }

                                    --var13;
                                 }

                                 label1018:
                                 while(var65 < 104) {
                                    for(var17 = var15; var17 <= var16; ++var17) {
                                       if (0 == (class164.field1915[var63][1 + var65][var17] & var57)) {
                                          break label1018;
                                       }
                                    }

                                    ++var65;
                                 }

                                 if ((1 + (var16 - var15)) * (var65 - var13 + 1) >= 4) {
                                    var17 = class62.field911[var63][var13][var15];
                                    class200.method3501(var61, 4, var13 * 128, var65 * 128 + 128, 128 * var15, var16 * 128 + 128, var17, var17);

                                    for(var18 = var13; var18 <= var65; ++var18) {
                                       for(var19 = var15; var19 <= var16; ++var19) {
                                          var10000 = class164.field1915[var63][var18];
                                          var10000[var19] &= ~var57;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  class232.method3924(true);
                  var6 = class62.field902;
                  if (var6 > class285.field3652) {
                     var6 = class285.field3652;
                  }

                  if (var6 < class285.field3652 - 1) {
                     var6 = class285.field3652 - 1;
                  }

                  if (field409) {
                     class166.field1925.method3556(class62.field902);
                  } else {
                     class166.field1925.method3556(0);
                  }

                  for(var55 = 0; var55 < 104; ++var55) {
                     for(var57 = 0; var57 < 104; ++var57) {
                        class49.method1382(var55, var57);
                     }
                  }

                  class263.method4333();
                  class162.method2848();
                  class156.field1738.method3883();
                  class229 var64;
                  if (class59.field874.method185()) {
                     var64 = class149.method2495(class227.field2622, field453.field1205);
                     var64.field2691.method5934(1057001181);
                     field453.method1963(var64);
                  }

                  if (!field481) {
                     var55 = (class20.field137 - 6) / 8;
                     var57 = (class20.field137 + 6) / 8;
                     var61 = (class8.field27 - 6) / 8;
                     var63 = (class8.field27 + 6) / 8;

                     for(var11 = var55 - 1; var11 <= 1 + var57; ++var11) {
                        for(var12 = var61 - 1; var12 <= var63 + 1; ++var12) {
                           if (var11 < var55 || var11 > var57 || var12 < var61 || var12 > var63) {
                              class199.field2277.method4435("m" + var11 + "_" + var12);
                              class199.field2277.method4435("l" + var11 + "_" + var12);
                           }
                        }
                     }
                  }

                  class17.method128(30);
                  class263.method4333();
                  class340.field3937 = (byte[][][])null;
                  class61.field895 = (byte[][][])null;
                  class62.field916 = (byte[][][])null;
                  class62.field910 = (byte[][][])null;
                  class164.field1915 = (int[][][])null;
                  class251.field3114 = (byte[][][])null;
                  class62.field905 = (int[][])null;
                  class54.field788 = null;
                  class62.field903 = null;
                  class257.field3138 = null;
                  class338.field3926 = null;
                  class81.field1162 = null;
                  var64 = class149.method2495(class227.field2577, field453.field1205);
                  field453.method1963(var64);
                  class85.field1199.method2322();

                  for(var57 = 0; var57 < 32; ++var57) {
                     class19.field105[var57] = 0L;
                  }

                  for(var57 = 0; var57 < 32; ++var57) {
                     class19.field112[var57] = 0L;
                  }

                  class259.field3167 = 0;
               }
            }
         }
      } else {
         class156.method2645(this);
      }

      if (30 == field413) {
         this.method825();
      } else if (field413 == 40 || field413 == 45) {
         this.method1094();
      }

   }

   static void method1272(String var0, String var1, String var2) {
      class56.field823 = var0;
      class56.field814 = var1;
      class56.field816 = var2;
   }

   protected final void method190(boolean var1) {
      boolean var3 = class19.method302();
      if (var3 && field648 && null != class179.field2070) {
         class179.field2070.method393();
      }

      if ((10 == field413 || 20 == field413 || field413 == 30) && 0L != field625 && class87.method1989() > field625) {
         class165.method2864(class238.method4117());
      }

      int var4;
      if (var1) {
         for(var4 = 0; var4 < 100; ++var4) {
            field617[var4] = true;
         }
      }

      if (0 == field413) {
         this.method180(class56.field806, class56.field807, var1);
      } else if (5 == field413) {
         class293.method4657(class130.field1468, class47.field398, class258.field3165);
      } else if (10 != field413 && 11 != field413) {
         if (field413 == 20) {
            class293.method4657(class130.field1468, class47.field398, class258.field3165);
         } else if (25 == field413) {
            if (1 == field464) {
               if (field460 > field461) {
                  field461 = field460;
               }

               var4 = (field461 * 50 - field460 * 50) / field461;
               class12.method98(class270.field3237 + class79.field1144 + class79.field1141 + var4 + "%" + class79.field1139, false);
            } else if (2 == field464) {
               if (field462 > field550) {
                  field550 = field462;
               }

               var4 = (field550 * 50 - field462 * 50) / field550 + 50;
               class12.method98(class270.field3237 + class79.field1144 + class79.field1141 + var4 + "%" + class79.field1139, false);
            } else {
               class12.method98(class270.field3237, false);
            }
         } else if (field413 == 30) {
            this.method1114();
         } else if (field413 == 40) {
            class12.method98(class270.field3238 + class79.field1144 + class270.field3354, false);
         } else if (45 == field413) {
            class12.method98(class270.field3388, false);
         }
      } else {
         class293.method4657(class130.field1468, class47.field398, class258.field3165);
      }

      if (30 == field413 && 0 == field624 && !var1 && !field613) {
         for(var4 = 0; var4 < field591; ++var4) {
            if (field618[var4]) {
               class264.field3194.method6332(field623[var4], field626[var4], field622[var4], field619[var4]);
               field618[var4] = false;
            }
         }
      } else if (field413 > 0) {
         class264.field3194.method6333(0, 0);

         for(var4 = 0; var4 < field591; ++var4) {
            field618[var4] = false;
         }
      }

   }

   protected final void method179() {
      if (class38.field311.method1921()) {
         class38.field311.method1895();
      }

      if (null != class7.field14) {
         class7.field14.field966 = false;
      }

      class7.field14 = null;
      field453.method1965();
      class227.method3900();
      if (class20.field135 != null) {
         synchronized(class20.field135) {
            class20.field135 = null;
         }
      }

      class13.field79 = null;
      if (class179.field2070 != null) {
         class179.field2070.method394();
      }

      if (null != class142.field1560) {
         class142.field1560.method394();
      }

      if (null != class278.field3614) {
         class278.field3614.method5279();
      }

      class249.method4258();
      if (class170.field1992 != null) {
         class170.field1992.method1984();
         class170.field1992 = null;
      }

      try {
         class131.field1477.method5815();

         for(int var2 = 0; var2 < class12.field71; ++var2) {
            class320.field3840[var2].method5815();
         }

         class131.field1479.method5815();
         class131.field1471.method5815();
      } catch (Exception var5) {
      }

   }

   void method1131() {
      if (field413 != 1000) {
         long var3 = class87.method1989();
         int var5 = (int)(var3 - class278.field3597);
         class278.field3597 = var3;
         if (var5 > 200) {
            var5 = 200;
         }

         class278.field3596 += var5;
         boolean var2;
         if (0 == class278.field3606 && class278.field3607 == 0 && 0 == class278.field3604 && class278.field3599 == 0) {
            var2 = true;
         } else if (null == class278.field3614) {
            var2 = false;
         } else {
            try {
               label242: {
                  if (class278.field3596 > 30000) {
                     throw new IOException();
                  }

                  class276 var6;
                  class385 var7;
                  while(class278.field3607 < 200 && class278.field3599 > 0) {
                     var6 = (class276)class278.field3598.method5736();
                     var7 = new class385(4);
                     var7.method5931(1);
                     var7.method6111((int)var6.field3966);
                     class278.field3614.method5283(var7.field4184, 0, 4);
                     class278.field3600.method5737(var6, var6.field3966);
                     --class278.field3599;
                     ++class278.field3607;
                  }

                  while(class278.field3606 < 200 && class278.field3604 > 0) {
                     var6 = (class276)class278.field3602.method4664();
                     var7 = new class385(4);
                     var7.method5931(0);
                     var7.method6111((int)var6.field3966);
                     class278.field3614.method5283(var7.field4184, 0, 4);
                     var6.method5435();
                     class278.field3611.method5737(var6, var6.field3966);
                     --class278.field3604;
                     ++class278.field3606;
                  }

                  for(int var21 = 0; var21 < 100; ++var21) {
                     int var22 = class278.field3614.method5280();
                     if (var22 < 0) {
                        throw new IOException();
                     }

                     if (0 == var22) {
                        break;
                     }

                     class278.field3596 = 0;
                     byte var8 = 0;
                     if (null == class278.field3595) {
                        var8 = 8;
                     } else if (0 == class278.field3609) {
                        var8 = 1;
                     }

                     int var9;
                     int var10;
                     int var11;
                     int var13;
                     byte[] var10000;
                     int var10001;
                     class385 var25;
                     if (var8 > 0) {
                        var9 = var8 - class278.field3608.field4182;
                        if (var9 > var22) {
                           var9 = var22;
                        }

                        class278.field3614.method5282(class278.field3608.field4184, class278.field3608.field4182, var9);
                        if (class278.field3613 != 0) {
                           for(var10 = 0; var10 < var9; ++var10) {
                              var10000 = class278.field3608.field4184;
                              var10001 = class278.field3608.field4182 + var10;
                              var10000[var10001] ^= class278.field3613;
                           }
                        }

                        var25 = class278.field3608;
                        var25.field4182 += var9;
                        if (class278.field3608.field4182 < var8) {
                           break;
                        }

                        if (class278.field3595 == null) {
                           class278.field3608.field4182 = 0;
                           var10 = class278.field3608.method5948();
                           var11 = class278.field3608.method6043();
                           int var12 = class278.field3608.method5948();
                           var13 = class278.field3608.method6172();
                           long var14 = (long)((var10 << 16) + var11);
                           class276 var16 = (class276)class278.field3600.method5746(var14);
                           class59.field878 = true;
                           if (null == var16) {
                              var16 = (class276)class278.field3611.method5746(var14);
                              class59.field878 = false;
                           }

                           if (null == var16) {
                              throw new IOException();
                           }

                           int var17 = var12 == 0 ? 5 : 9;
                           class278.field3595 = var16;
                           class94.field1248 = new class385(var17 + var13 + class278.field3595.field3573);
                           class94.field1248.method5931(var12);
                           class94.field1248.method5934(var13);
                           class278.field3609 = 8;
                           class278.field3608.field4182 = 0;
                        } else if (class278.field3609 == 0) {
                           if (-1 == class278.field3608.field4184[0]) {
                              class278.field3609 = 1;
                              class278.field3608.field4182 = 0;
                           } else {
                              class278.field3595 = null;
                           }
                        }
                     } else {
                        var9 = class94.field1248.field4184.length - class278.field3595.field3573;
                        var10 = 512 - class278.field3609;
                        if (var10 > var9 - class94.field1248.field4182) {
                           var10 = var9 - class94.field1248.field4182;
                        }

                        if (var10 > var22) {
                           var10 = var22;
                        }

                        class278.field3614.method5282(class94.field1248.field4184, class94.field1248.field4182, var10);
                        if (0 != class278.field3613) {
                           for(var11 = 0; var11 < var10; ++var11) {
                              var10000 = class94.field1248.field4184;
                              var10001 = var11 + class94.field1248.field4182;
                              var10000[var10001] ^= class278.field3613;
                           }
                        }

                        var25 = class94.field1248;
                        var25.field4182 += var10;
                        class278.field3609 += var10;
                        if (var9 == class94.field1248.field4182) {
                           if (class278.field3595.field3966 == 16711935L) {
                              class278.field3603 = class94.field1248;

                              for(var11 = 0; var11 < 256; ++var11) {
                                 class275 var23 = class278.field3612[var11];
                                 if (null != var23) {
                                    class278.field3603.field4182 = 5 + 8 * var11;
                                    var13 = class278.field3603.method6172();
                                    int var24 = class278.field3603.method6172();
                                    var23.method4380(var13, var24);
                                 }
                              }
                           } else {
                              class278.field3610.reset();
                              class278.field3610.update(class94.field1248.field4184, 0, var9);
                              var11 = (int)class278.field3610.getValue();
                              if (var11 != class278.field3595.field3574) {
                                 try {
                                    class278.field3614.method5279();
                                 } catch (Exception var19) {
                                 }

                                 ++class278.field3601;
                                 class278.field3614 = null;
                                 class278.field3613 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                 var2 = false;
                                 break label242;
                              }

                              class278.field3601 = 0;
                              class278.field3605 = 0;
                              class278.field3595.field3577.method4398((int)(class278.field3595.field3966 & 65535L), class94.field1248.field4184, (class278.field3595.field3966 & 16711680L) == 16711680L, class59.field878);
                           }

                           class278.field3595.method5437();
                           if (class59.field878) {
                              --class278.field3607;
                           } else {
                              --class278.field3606;
                           }

                           class278.field3609 = 0;
                           class278.field3595 = null;
                           class94.field1248 = null;
                        } else {
                           if (512 != class278.field3609) {
                              break;
                           }

                           class278.field3609 = 0;
                        }
                     }
                  }

                  var2 = true;
               }
            } catch (IOException var20) {
               try {
                  class278.field3614.method5279();
               } catch (Exception var18) {
               }

               ++class278.field3605;
               class278.field3614 = null;
               var2 = false;
            }
         }

         if (!var2) {
            this.method1113();
         }

      }
   }

   void method1113() {
      if (class278.field3601 >= 4) {
         this.method182("js5crc");
         field413 = 1000;
      } else {
         if (class278.field3605 >= 4) {
            if (field413 <= 5) {
               this.method182("js5io");
               field413 = 1000;
               return;
            }

            field436 = 3000;
            class278.field3605 = 3;
         }

         if (--field436 + 1 <= 0) {
            try {
               if (field438 == 0) {
                  class239.field2879 = class19.field101.method2258(class244.field2918, class291.field3679);
                  ++field438;
               }

               if (field438 == 1) {
                  if (2 == class239.field2879.field1511) {
                     this.method823(-1);
                     return;
                  }

                  if (class239.field2879.field1511 == 1) {
                     ++field438;
                  }
               }

               if (2 == field438) {
                  if (field457) {
                     Socket var3 = (Socket)class239.field2879.field1510;
                     class331 var2 = new class331(var3, 40000, 5000);
                     class85.field1197 = var2;
                  } else {
                     class85.field1197 = new class134((Socket)class239.field2879.field1510, class19.field101, 5000);
                  }

                  class385 var5 = new class385(5);
                  var5.method5931(15);
                  var5.method5934(198);
                  class85.field1197.method5283(var5.field4184, 0, 5);
                  ++field438;
                  class147.field1610 = class87.method1989();
               }

               if (field438 == 3) {
                  if (class85.field1197.method5280() > 0 || !field457 && field413 <= 5) {
                     int var6 = class85.field1197.method5281();
                     if (var6 != 0) {
                        this.method823(var6);
                        return;
                     }

                     ++field438;
                  } else if (class87.method1989() - class147.field1610 > 30000L) {
                     this.method823(-2);
                     return;
                  }
               }

               if (field438 == 4) {
                  class125.method2248(class85.field1197, field413 > 20);
                  class239.field2879 = null;
                  class85.field1197 = null;
                  field438 = 0;
                  field504 = 0;
               }
            } catch (IOException var4) {
               this.method823(-3);
            }

         }
      }
   }

   void method823(int var1) {
      class239.field2879 = null;
      class85.field1197 = null;
      field438 = 0;
      if (class170.field1982 == class291.field3679) {
         class291.field3679 = class5.field7;
      } else {
         class291.field3679 = class170.field1982;
      }

      ++field504;
      if (field504 >= 2 && (7 == var1 || var1 == 9)) {
         if (field413 <= 5) {
            this.method182("js5connect_full");
            field413 = 1000;
         } else {
            field436 = 3000;
         }
      } else if (field504 >= 2 && 6 == var1) {
         this.method182("js5connect_outofdate");
         field413 = 1000;
      } else if (field504 >= 4) {
         if (field413 <= 5) {
            this.method182("js5connect");
            field413 = 1000;
         } else {
            field436 = 3000;
         }
      }

   }

   final void method1094() {
      Object var2 = field453.method1968();
      class384 var3 = field453.field1201;

      try {
         if (field673 == 0) {
            if (class99.field1267 == null && (field444.method1597() || field439 > 250)) {
               class99.field1267 = field444.method1591();
               field444.method1589();
               field444 = null;
            }

            if (class99.field1267 != null) {
               if (var2 != null) {
                  ((class330)var2).method5279();
                  var2 = null;
               }

               class266.field3214 = null;
               field456 = false;
               field439 = 0;
               field673 = 1;
            }
         }

         if (field673 == 1) {
            if (null == class266.field3214) {
               class266.field3214 = class19.field101.method2258(class244.field2918, class291.field3679);
            }

            if (2 == class266.field3214.field1511) {
               throw new IOException();
            }

            if (class266.field3214.field1511 == 1) {
               if (field457) {
                  Socket var5 = (Socket)class266.field3214.field1510;
                  class331 var4 = new class331(var5, 40000, 5000);
                  var2 = var4;
               } else {
                  var2 = new class134((Socket)class266.field3214.field1510, class19.field101, 5000);
               }

               field453.method1964((class330)var2);
               class266.field3214 = null;
               field673 = 2;
            }
         }

         if (2 == field673) {
            field453.method1975();
            class229 var16 = class64.method1662();
            var16.field2691.method5931(class231.field2792.field2796);
            field453.method1963(var16);
            field453.method1962();
            var3.field4182 = 0;
            field673 = 3;
         }

         boolean var17;
         int var18;
         if (3 == field673) {
            if (null != class179.field2070) {
               class179.field2070.method419();
            }

            if (class142.field1560 != null) {
               class142.field1560.method419();
            }

            var17 = true;
            if (field457 && !((class330)var2).method5294(1)) {
               var17 = false;
            }

            if (var17) {
               var18 = ((class330)var2).method5281();
               if (null != class179.field2070) {
                  class179.field2070.method419();
               }

               if (class142.field1560 != null) {
                  class142.field1560.method419();
               }

               if (var18 != 0) {
                  class266.method4348(var18);
                  return;
               }

               var3.field4182 = 0;
               field673 = 4;
            }
         }

         int var19;
         if (field673 == 4) {
            if (var3.field4182 < 8) {
               var19 = ((class330)var2).method5280();
               if (var19 > 8 - var3.field4182) {
                  var19 = 8 - var3.field4182;
               }

               if (var19 > 0) {
                  ((class330)var2).method5282(var3.field4184, var3.field4182, var19);
                  var3.field4182 += var19;
               }
            }

            if (var3.field4182 == 8) {
               var3.field4182 = 0;
               class187.field2120 = var3.method5954();
               field673 = 5;
            }
         }

         int var8;
         if (field673 == 5) {
            field453.field1201.field4182 = 0;
            field453.method1975();
            class384 var24 = new class384(500);
            int[] var20 = new int[]{class99.field1267.nextInt(), class99.field1267.nextInt(), class99.field1267.nextInt(), class99.field1267.nextInt()};
            var24.field4182 = 0;
            var24.method5931(1);
            var24.method5934(var20[0]);
            var24.method5934(var20[1]);
            var24.method5934(var20[2]);
            var24.method5934(var20[3]);
            var24.method5936(class187.field2120);
            if (40 == field413) {
               var24.method5934(class42.field357[0]);
               var24.method5934(class42.field357[1]);
               var24.method5934(class42.field357[2]);
               var24.method5934(class42.field357[3]);
            } else {
               var24.method5931(field448.method4619());
               switch(field448.field1270) {
               case 0:
               case 1:
                  var24.method6111(class283.field3640);
                  ++var24.field4182;
                  break;
               case 2:
                  var24.field4182 += 4;
                  break;
               case 3:
                  var24.method5934((Integer)class38.field308.field1115.get(class166.method2881(class56.field809)));
               }

               var24.method5931(class389.field4231.method4619());
               var24.method5938(class56.field818);
            }

            var24.method5971(class55.field793, class55.field792);
            class42.field357 = var20;
            class229 var7 = class160.method2843();
            var7.field2685 = null;
            var7.field2686 = 0;
            var7.field2691 = new class384(5000);
            var7.field2691.field4182 = 0;
            if (40 == field413) {
               var7.field2691.method5931(class231.field2793.field2796);
            } else {
               var7.field2691.method5931(class231.field2790.field2796);
            }

            var7.field2691.method6122(0);
            var8 = var7.field2691.field4182;
            var7.field2691.method5934(198);
            var7.field2691.method5934(1);
            var7.field2691.method5931(field410);
            var7.field2691.method5931(field474);
            var7.field2691.method6003(var24.field4184, 0, var24.field4182);
            int var9 = var7.field2691.field4182;
            var7.field2691.method5938(class56.field809);
            var7.field2691.method5931((field613 ? 1 : 0) << 1 | (field409 ? 1 : 0));
            var7.field2691.method6122(class69.field971);
            var7.field2691.method6122(field687);
            class145.method2451(var7.field2691);
            var7.field2691.method5938(class150.field1661);
            var7.field2691.method5934(class408.field4314);
            class385 var10 = new class385(class230.field2789.method5457());
            class230.field2789.method5456(var10);
            var7.field2691.method6003(var10.field4184, 0, var10.field4184.length);
            var7.field2691.method5931(field410);
            var7.field2691.method5934(0);
            var7.field2691.method5994(class340.field3938.field3591);
            var7.field2691.method5992(class19.field96.field3591);
            var7.field2691.method5934(class38.field307.field3591);
            var7.field2691.method5972(class62.field917.field3591);
            var7.field2691.method5994(class124.field1440.field3591);
            var7.field2691.method5994(class127.field1454.field3591);
            var7.field2691.method5994(class139.field1521.field3591);
            var7.field2691.method5994(class199.field2277.field3591);
            var7.field2691.method5972(class106.field1301.field3591);
            var7.field2691.method5972(class75.field1107.field3591);
            var7.field2691.method5972(class292.field3693.field3591);
            var7.field2691.method5992(class271.field3536.field3591);
            var7.field2691.method5992(class38.field302.field3591);
            var7.field2691.method5934(class46.field391.field3591);
            var7.field2691.method5992(0);
            var7.field2691.method5992(class323.field3848.field3591);
            var7.field2691.method5992(class192.field2139.field3591);
            var7.field2691.method5992(class109.field1326.field3591);
            var7.field2691.method5972(class16.field85.field3591);
            var7.field2691.method5972(class192.field2149.field3591);
            var7.field2691.method5934(class121.field1417.field3591);
            var7.field2691.method5933(var20, var9, var7.field2691.field4182);
            var7.field2691.method6034(var7.field2691.field4182 - var8);
            field453.method1963(var7);
            field453.method1962();
            field453.field1205 = new class401(var20);
            int[] var11 = new int[4];

            for(int var12 = 0; var12 < 4; ++var12) {
               var11[var12] = 50 + var20[var12];
            }

            var3.method5885(var11);
            field673 = 6;
         }

         if (6 == field673 && ((class330)var2).method5280() > 0) {
            var19 = ((class330)var2).method5281();
            if (var19 == 21 && field413 == 20) {
               field673 = 12;
            } else if (var19 == 2) {
               field673 = 14;
            } else if (var19 == 15 && 40 == field413) {
               field453.field1209 = -1;
               field673 = 19;
            } else if (var19 == 64) {
               field673 = 10;
            } else if (23 == var19 && field440 < 1) {
               ++field440;
               field673 = 0;
            } else if (29 == var19) {
               field673 = 17;
            } else {
               if (69 != var19) {
                  class266.method4348(var19);
                  return;
               }

               field673 = 7;
            }
         }

         if (7 == field673 && ((class330)var2).method5280() >= 2) {
            ((class330)var2).method5282(var3.field4184, 0, 2);
            var3.field4182 = 0;
            class123.field1426 = var3.method6043();
            field673 = 8;
         }

         if (8 == field673 && ((class330)var2).method5280() >= class123.field1426) {
            var3.field4182 = 0;
            ((class330)var2).method5282(var3.field4184, var3.field4182, class123.field1426);
            class7[] var27 = new class7[]{class7.field17};
            class7 var21 = var27[var3.method5948()];

            try {
               switch(var21.field11) {
               case 0:
                  class1 var6 = new class1();
                  this.field446 = new class8(var3, var6);
                  field673 = 9;
                  break;
               default:
                  throw new IllegalArgumentException();
               }
            } catch (Exception var14) {
               class266.method4348(22);
               return;
            }
         }

         if (9 == field673 && this.field446.method37()) {
            this.field596 = this.field446.method48();
            this.field446.method40();
            this.field446 = null;
            if (this.field596 == null) {
               class266.method4348(22);
               return;
            }

            field453.method1975();
            class229 var22 = class160.method2843();
            var22.field2685 = null;
            var22.field2686 = 0;
            var22.field2691 = new class384(5000);
            var22.field2691.method5931(class231.field2794.field2796);
            var22.field2691.method6122(this.field596.field4182);
            var22.field2691.method5942(this.field596);
            field453.method1963(var22);
            field453.method1962();
            this.field596 = null;
            field673 = 6;
         }

         if (field673 == 10 && ((class330)var2).method5280() > 0) {
            class217.field2549 = ((class330)var2).method5281();
            field673 = 11;
         }

         if (field673 == 11 && ((class330)var2).method5280() >= class217.field2549) {
            ((class330)var2).method5282(var3.field4184, 0, class217.field2549);
            var3.field4182 = 0;
            field673 = 6;
         }

         if (field673 == 12 && ((class330)var2).method5280() > 0) {
            field590 = (((class330)var2).method5281() + 3) * 60;
            field673 = 13;
         }

         if (field673 == 13) {
            field439 = 0;
            method1272(class270.field3268, class270.field3348, field590 / 60 + class270.field3371);
            if (--field590 <= 0) {
               field673 = 0;
            }

         } else {
            if (field673 == 14 && ((class330)var2).method5280() >= 1) {
               class293.field3714 = ((class330)var2).method5281();
               field673 = 15;
            }

            if (field673 == 15 && ((class330)var2).method5280() >= class293.field3714) {
               var17 = ((class330)var2).method5281() == 1;
               ((class330)var2).method5282(var3.field4184, 0, 4);
               var3.field4182 = 0;
               boolean var25 = false;
               if (var17) {
                  var18 = var3.method5888() << 24;
                  var18 |= var3.method5888() << 16;
                  var18 |= var3.method5888() << 8;
                  var18 |= var3.method5888();
                  String var28 = class56.field809;
                  var8 = var28.length();
                  int var32 = 0;
                  int var33 = 0;

                  while(true) {
                     if (var33 >= var8) {
                        if (class38.field308.field1115.size() >= 10 && !class38.field308.field1115.containsKey(var32)) {
                           Iterator it = class38.field308.field1115.entrySet().iterator();
                           it.next();
                           it.remove();
                        }

                        class38.field308.field1115.put(var32, var18);
                        break;
                     }

                     var32 = (var32 << 5) - var32 + var28.charAt(var33);
                     ++var33;
                  }
               }

               if (field443) {
                  class38.field308.field1123 = class56.field809;
               } else {
                  class38.field308.field1123 = null;
               }

               class135.method2320();
               field577 = ((class330)var2).method5281();
               field603 = ((class330)var2).method5281() == 1;
               field665 = ((class330)var2).method5281();
               field665 <<= 8;
               field665 += ((class330)var2).method5281();
               field526 = ((class330)var2).method5281();
               ((class330)var2).method5282(var3.field4184, 0, 1);
               var3.field4182 = 0;
               class230[] var23 = class189.method3268();
               int var29 = var3.method5890();
               if (var29 < 0 || var29 >= var23.length) {
                  throw new IOException(var29 + " " + var3.field4182);
               }

               field453.field1206 = var23[var29];
               field453.field1209 = field453.field1206.field2740;
               ((class330)var2).method5282(var3.field4184, 0, 2);
               var3.field4182 = 0;
               field453.field1209 = var3.method6043();

               try {
                  class15.method113(class59.field874, "zap");
               } catch (Throwable var13) {
               }

               field673 = 16;
            }

            if (field673 == 16) {
               if (((class330)var2).method5280() >= field453.field1209) {
                  var3.field4182 = 0;
                  ((class330)var2).method5282(var3.field4184, 0, field453.field1209);
                  field458.method5075();
                  class120.method2199();
                  class44.method769(var3);
                  class20.field137 = -1;
                  class239.method4125(false, var3);
                  field453.field1206 = null;
               }

            } else {
               if (17 == field673 && ((class330)var2).method5280() >= 2) {
                  var3.field4182 = 0;
                  ((class330)var2).method5282(var3.field4184, 0, 2);
                  var3.field4182 = 0;
                  class328.field3870 = var3.method6043();
                  field673 = 18;
               }

               if (field673 == 18 && ((class330)var2).method5280() >= class328.field3870) {
                  var3.field4182 = 0;
                  ((class330)var2).method5282(var3.field4184, 0, class328.field3870);
                  var3.field4182 = 0;
                  String var30 = var3.method5957();
                  String var31 = var3.method5957();
                  String var26 = var3.method5957();
                  method1272(var30, var31, var26);
                  class17.method128(10);
               }

               if (19 == field673) {
                  if (-1 == field453.field1209) {
                     if (((class330)var2).method5280() < 2) {
                        return;
                     }

                     ((class330)var2).method5282(var3.field4184, 0, 2);
                     var3.field4182 = 0;
                     field453.field1209 = var3.method6043();
                  }

                  if (((class330)var2).method5280() >= field453.field1209) {
                     ((class330)var2).method5282(var3.field4184, 0, field453.field1209);
                     var3.field4182 = 0;
                     var19 = field453.field1209;
                     field458.method5064();
                     class289.method4616();
                     class44.method769(var3);
                     if (var19 != var3.field4182) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field439;
                  if (field439 > 2000) {
                     if (field440 < 1) {
                        if (class170.field1982 == class291.field3679) {
                           class291.field3679 = class5.field7;
                        } else {
                           class291.field3679 = class170.field1982;
                        }

                        ++field440;
                        field673 = 0;
                     } else {
                        class266.method4348(-3);
                     }
                  }
               }
            }
         }
      } catch (IOException var15) {
         if (field440 < 1) {
            if (class291.field3679 == class170.field1982) {
               class291.field3679 = class5.field7;
            } else {
               class291.field3679 = class170.field1982;
            }

            ++field440;
            field673 = 0;
         } else {
            class266.method4348(-2);
         }
      }
   }

   final void method825() {
      if (field423 > 1) {
         --field423;
      }

      if (field571 > 0) {
         --field571;
      }

      if (field456) {
         field456 = false;
         class175.method3140();
      } else {
         if (!field544) {
            class11.method94();
         }

         int var2;
         for(var2 = 0; var2 < 100 && this.method829(field453); ++var2) {
         }

         if (field413 == 30) {
            while(true) {
               class43 var3 = (class43)class42.field356.method4724();
               boolean var17;
               if (null == var3) {
                  var17 = false;
               } else {
                  var17 = true;
               }

               int var4;
               class229 var18;
               if (!var17) {
                  class229 var19;
                  int var20;
                  if (field458.field3782) {
                     var19 = class149.method2495(class227.field2576, field453.field1205);
                     var19.field2691.method5931(0);
                     var20 = var19.field2691.field4182;
                     field458.method5065(var19.field2691);
                     var19.field2691.method5945(var19.field2691.field4182 - var20);
                     field453.method1963(var19);
                     field458.method5059();
                  }

                  int var5;
                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  synchronized(class7.field14.field975) {
                     if (!field635) {
                        class7.field14.field967 = 0;
                     } else if (class20.field149 != 0 || class7.field14.field967 >= 40) {
                        var18 = null;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;

                        for(var8 = 0; var8 < class7.field14.field967 && (null == var18 || var18.field2691.field4182 - var4 < 246); ++var8) {
                           var5 = var8;
                           var9 = class7.field14.field969[var8];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           var10 = class7.field14.field968[var8];
                           if (var10 < -1) {
                              var10 = -1;
                           } else if (var10 > 65534) {
                              var10 = 65534;
                           }

                           if (var10 != field418 || var9 != field419) {
                              if (null == var18) {
                                 var18 = class149.method2495(class227.field2626, field453.field1205);
                                 var18.field2691.method5931(0);
                                 var4 = var18.field2691.field4182;
                                 class384 var10000 = var18.field2691;
                                 var10000.field4182 += 2;
                                 var6 = 0;
                                 var7 = 0;
                              }

                              if (field420 != -1L) {
                                 var11 = var10 - field418;
                                 var12 = var9 - field419;
                                 var13 = (int)((class7.field14.field970[var8] - field420) / 20L);
                                 var6 = (int)((long)var6 + (class7.field14.field970[var8] - field420) % 20L);
                              } else {
                                 var11 = var10;
                                 var12 = var9;
                                 var13 = Integer.MAX_VALUE;
                              }

                              field418 = var10;
                              field419 = var9;
                              if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                 var11 += 32;
                                 var12 += 32;
                                 var18.field2691.method6122((var13 << 12) + (var11 << 6) + var12);
                              } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                 var11 += 128;
                                 var12 += 128;
                                 var18.field2691.method5931(var13 + 128);
                                 var18.field2691.method6122(var12 + (var11 << 8));
                              } else if (var13 < 32) {
                                 var18.field2691.method5931(192 + var13);
                                 if (var10 != -1 && -1 != var9) {
                                    var18.field2691.method5934(var10 | var9 << 16);
                                 } else {
                                    var18.field2691.method5934(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var18.field2691.method6122('\ue000' + (var13 & 8191));
                                 if (var10 != -1 && var9 != -1) {
                                    var18.field2691.method5934(var10 | var9 << 16);
                                 } else {
                                    var18.field2691.method5934(Integer.MIN_VALUE);
                                 }
                              }

                              ++var7;
                              field420 = class7.field14.field970[var8];
                           }
                        }

                        if (var18 != null) {
                           var18.field2691.method5945(var18.field2691.field4182 - var4);
                           var8 = var18.field2691.field4182;
                           var18.field2691.field4182 = var4;
                           var18.field2691.method5931(var6 / var7);
                           var18.field2691.method5931(var6 % var7);
                           var18.field2691.field4182 = var8;
                           field453.method1963(var18);
                        }

                        if (var5 >= class7.field14.field967) {
                           class7.field14.field967 = 0;
                        } else {
                           class69 var43 = class7.field14;
                           var43.field967 -= var5;
                           System.arraycopy(class7.field14.field968, var5, class7.field14.field968, 0, class7.field14.field967);
                           System.arraycopy(class7.field14.field969, var5, class7.field14.field969, 0, class7.field14.field967);
                           System.arraycopy(class7.field14.field970, var5, class7.field14.field970, 0, class7.field14.field967);
                        }
                     }
                  }

                  class229 var26;
                  if (1 == class20.field149 || !class311.field3777 && class20.field149 == 4 || class20.field149 == 2) {
                     long var21 = class20.field152 - field417;
                     if (var21 > 32767L) {
                        var21 = 32767L;
                     }

                     field417 = class20.field152;
                     var4 = class20.field151;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > field687) {
                        var4 = field687;
                     }

                     var5 = class20.field150;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > class69.field971) {
                        var5 = class69.field971;
                     }

                     var6 = (int)var21;
                     var26 = class149.method2495(class227.field2580, field453.field1205);
                     var26.field2691.method6122((class20.field149 == 2 ? 1 : 0) + (var6 << 1));
                     var26.field2691.method6122(var5);
                     var26.field2691.method6122(var4);
                     field453.method1963(var26);
                  }

                  if (class11.field36 > 0) {
                     var19 = class149.method2495(class227.field2564, field453.field1205);
                     var19.field2691.method6122(0);
                     var20 = var19.field2691.field4182;
                     long var22 = class87.method1989();

                     for(var6 = 0; var6 < class11.field36; ++var6) {
                        long var27 = var22 - field636;
                        if (var27 > 16777215L) {
                           var27 = 16777215L;
                        }

                        field636 = var22;
                        var19.field2691.method6111((int)var27);
                        var19.field2691.method5931(class11.field54[var6]);
                     }

                     var19.field2691.method6034(var19.field2691.field4182 - var20);
                     field453.method1963(var19);
                  }

                  if (field608 > 0) {
                     --field608;
                  }

                  if (class11.field46[96] || class11.field46[97] || class11.field46[98] || class11.field46[99]) {
                     field492 = true;
                  }

                  if (field492 && field608 <= 0) {
                     field608 = 20;
                     field492 = false;
                     var19 = class149.method2495(class227.field2642, field453.field1205);
                     var19.field2691.method5983(field445);
                     var19.field2691.method6077(field476);
                     field453.method1963(var19);
                  }

                  if (class256.field3128 && !field421) {
                     field421 = true;
                     var19 = class149.method2495(class227.field2599, field453.field1205);
                     var19.field2691.method5931(1);
                     field453.method1963(var19);
                  }

                  if (!class256.field3128 && field421) {
                     field421 = false;
                     var19 = class149.method2495(class227.field2599, field453.field1205);
                     var19.field2691.method5931(0);
                     field453.method1963(var19);
                  }

                  if (null != class25.field202) {
                     class25.field202.method5650();
                  }

                  class61.method1617();
                  class239.method4119();
                  int[] var23;
                  if (field639 != class285.field3652) {
                     field639 = class285.field3652;
                     var2 = class285.field3652;
                     var23 = class377.field4167.field4280;
                     var4 = var23.length;

                     for(var5 = 0; var5 < var4; ++var5) {
                        var23[var5] = 0;
                     }

                     for(var5 = 1; var5 < 103; ++var5) {
                        var6 = (103 - var5) * 2048 + 24628;

                        for(var7 = 1; var7 < 103; ++var7) {
                           if (0 == (class62.field901[var2][var7][var5] & 24)) {
                              class166.field1925.method3531(var23, var6, 512, var2, var7, var5);
                           }

                           if (var2 < 3 && 0 != (class62.field901[1 + var2][var7][var5] & 8)) {
                              class166.field1925.method3531(var23, var6, 512, var2 + 1, var7, var5);
                           }

                           var6 += 4;
                        }
                     }

                     var5 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
                     var6 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
                     class377.field4167.method6400();

                     for(var7 = 1; var7 < 103; ++var7) {
                        for(var8 = 1; var8 < 103; ++var8) {
                           if ((class62.field901[var2][var8][var7] & 24) == 0) {
                              class360.method5698(var2, var8, var7, var5, var6);
                           }

                           if (var2 < 3 && 0 != (class62.field901[1 + var2][var8][var7] & 8)) {
                              class360.method5698(1 + var2, var8, var7, var5, var6);
                           }
                        }
                     }

                     field621 = 0;

                     for(var7 = 0; var7 < 104; ++var7) {
                        for(var8 = 0; var8 < 104; ++var8) {
                           long var34 = class166.field1925.method3628(class285.field3652, var7, var8);
                           if (0L != var34) {
                              var11 = class79.method1843(var34);
                              var12 = class124.method2243(var11).field1763;
                              if (var12 >= 0 && class73.method1770(var12).field1542) {
                                 field643[field621] = class73.method1770(var12).method2368(false);
                                 field614[field621] = var7;
                                 field642[field621] = var8;
                                 ++field621;
                              }
                           }
                        }
                     }

                     class264.field3194.method6340();
                  }

                  if (30 != field413) {
                     return;
                  }

                  class253.method4317();
                  class194.method3400();
                  ++field453.field1210;
                  if (field453.field1210 > 750) {
                     class175.method3140();
                     return;
                  }

                  var2 = class83.field1172;
                  var23 = class83.field1178;

                  for(var4 = 0; var4 < var2; ++var4) {
                     class70 var28 = field524[var23[var4]];
                     if (var28 != null) {
                        class17.method142(var28, 1);
                     }
                  }

                  class134.method2306();
                  class108.method2104();
                  ++field556;
                  if (0 != field511) {
                     field540 += 20;
                     if (field540 >= 400) {
                        field511 = 0;
                     }
                  }

                  if (null != class13.field78) {
                     ++field513;
                     if (field513 >= 15) {
                        class81.method1869(class13.field78);
                        class13.field78 = null;
                     }
                  }

                  class249 var24 = class245.field2923;
                  class249 var25 = class293.field3699;
                  class245.field2923 = null;
                  class293.field3699 = null;
                  field585 = null;
                  field589 = false;
                  field586 = false;
                  field451 = 0;

                  while(class317.method5085() && field451 < 128) {
                     if (field577 >= 2 && class11.field46[82] && 66 == class121.field1418) {
                        String var29 = "";

                        class45 var40;
                        for(Iterator var31 = class85.field1194.iterator(); var31.hasNext(); var29 = var29 + var40.field380 + ':' + var40.field388 + '\n') {
                           var40 = (class45)var31.next();
                        }

                        class59.field874.method152(var29);
                     } else if (field482 != 1 || class127.field1450 <= 0) {
                        field431[field451] = class121.field1418;
                        field634[field451] = class127.field1450;
                        ++field451;
                     }
                  }

                  if (class143.method2427() && class11.field46[82] && class11.field46[81] && field657 != 0) {
                     var4 = class20.field140.field999 - field657;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > 3) {
                        var4 = 3;
                     }

                     if (class20.field140.field999 != var4) {
                        var5 = class281.field3625 + class20.field140.field1076[0];
                        var6 = class78.field1134 + class20.field140.field1077[0];
                        var26 = class149.method2495(class227.field2635, field453.field1205);
                        var26.field2691.method5931(var4);
                        var26.field2691.method6122(var6);
                        var26.field2691.method6077(var5);
                        var26.field2691.method5934(0);
                        field453.method1963(var26);
                     }

                     field657 = 0;
                  }

                  if (field568 != -1) {
                     class246.method4174(field568, 0, 0, class69.field971, field687, 0, 0);
                  }

                  ++field593;

                  while(true) {
                     class68 var30;
                     class249 var32;
                     class249 var33;
                     do {
                        var30 = (class68)field612.method4699();
                        if (null == var30) {
                           while(true) {
                              do {
                                 var30 = (class68)field686.method4699();
                                 if (null == var30) {
                                    while(true) {
                                       do {
                                          var30 = (class68)field611.method4699();
                                          if (var30 == null) {
                                             this.method830();
                                             if (class25.field202 != null) {
                                                class25.field202.method5488(class285.field3652, (class20.field140.field1069 >> 7) + class281.field3625, (class20.field140.field1059 >> 7) + class78.field1134, false);
                                                class25.field202.method5509();
                                             }

                                             if (field581 != null) {
                                                this.method835();
                                             }

                                             class229 var41;
                                             if (field688 != null) {
                                                class81.method1869(field688);
                                                ++field521;
                                                if (0 == class20.field141) {
                                                   if (field520) {
                                                      if (field515 == field688 && field519 != field516) {
                                                         class249 var35 = field688;
                                                         byte var38 = 0;
                                                         if (1 == field655 && var35.field2962 == 206) {
                                                            var38 = 1;
                                                         }

                                                         if (var35.field3086[field519] <= 0) {
                                                            var38 = 0;
                                                         }

                                                         var7 = class241.method4140(var35);
                                                         boolean var36 = (var7 >> 29 & 1) != 0;
                                                         if (var36) {
                                                            var8 = field516;
                                                            var9 = field519;
                                                            var35.field3086[var9] = var35.field3086[var8];
                                                            var35.field3087[var9] = var35.field3087[var8];
                                                            var35.field3086[var8] = -1;
                                                            var35.field3087[var8] = 0;
                                                         } else if (1 == var38) {
                                                            var8 = field516;
                                                            var9 = field519;

                                                            while(var8 != var9) {
                                                               if (var8 > var9) {
                                                                  var35.method4238(var8 - 1, var8);
                                                                  --var8;
                                                               } else if (var8 < var9) {
                                                                  var35.method4238(1 + var8, var8);
                                                                  ++var8;
                                                               }
                                                            }
                                                         } else {
                                                            var35.method4238(field519, field516);
                                                         }

                                                         var41 = class149.method2495(class227.field2578, field453.field1205);
                                                         var41.field2691.method5972(field688.field2958);
                                                         var41.field2691.method6077(field516);
                                                         var41.field2691.method5983(field519);
                                                         var41.field2691.method5931(var38);
                                                         field453.method1963(var41);
                                                      }
                                                   } else if (this.method932()) {
                                                      this.method832(field404, field584);
                                                   } else if (field545 > 0) {
                                                      var4 = field404;
                                                      var5 = field584;
                                                      class28.method482(class106.field1305, var4, var5);
                                                      class106.field1305 = null;
                                                   }

                                                   field513 = 10;
                                                   class20.field149 = 0;
                                                   field688 = null;
                                                } else if (field521 >= 5 && (class20.field142 > field404 + 5 || class20.field142 < field404 - 5 || class20.field145 > field584 + 5 || class20.field145 < field584 - 5)) {
                                                   field520 = true;
                                                }
                                             }

                                             if (class200.method3536()) {
                                                var4 = class200.field2314;
                                                var5 = class200.field2315;
                                                class229 var37 = class149.method2495(class227.field2613, field453.field1205);
                                                var37.field2691.method5931(5);
                                                var37.field2691.method6077(var4 + class281.field3625);
                                                var37.field2691.method6122(class78.field1134 + var5);
                                                var37.field2691.method5931(class11.field46[82] ? (class11.field46[81] ? 2 : 1) : 0);
                                                field453.method1963(var37);
                                                class200.method3537();
                                                field508 = class20.field150;
                                                field463 = class20.field151;
                                                field511 = 1;
                                                field540 = 0;
                                                field644 = var4;
                                                field597 = var5;
                                             }

                                             if (class245.field2923 != var24) {
                                                if (var24 != null) {
                                                   class81.method1869(var24);
                                                }

                                                if (null != class245.field2923) {
                                                   class81.method1869(class245.field2923);
                                                }
                                             }

                                             if (var25 != class293.field3699 && field649 == field560) {
                                                if (null != var25) {
                                                   class81.method1869(var25);
                                                }

                                                if (null != class293.field3699) {
                                                   class81.method1869(class293.field3699);
                                                }
                                             }

                                             if (class293.field3699 != null) {
                                                if (field649 < field560) {
                                                   ++field649;
                                                   if (field649 == field560) {
                                                      class81.method1869(class293.field3699);
                                                   }
                                                }
                                             } else if (field649 > 0) {
                                                --field649;
                                             }

                                             if (0 == field482) {
                                                var4 = class20.field140.field1069;
                                                var5 = class20.field140.field1059;
                                                if (class11.field66 - var4 < -500 || class11.field66 - var4 > 500 || class273.field3553 - var5 < -500 || class273.field3553 - var5 > 500) {
                                                   class11.field66 = var4;
                                                   class273.field3553 = var5;
                                                }

                                                if (class11.field66 != var4) {
                                                   class11.field66 += (var4 - class11.field66) / 16;
                                                }

                                                if (class273.field3553 != var5) {
                                                   class273.field3553 += (var5 - class273.field3553) / 16;
                                                }

                                                var6 = class11.field66 >> 7;
                                                var7 = class273.field3553 >> 7;
                                                var8 = class123.method2216(class11.field66, class273.field3553, class285.field3652);
                                                var9 = 0;
                                                if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
                                                   for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                      for(var11 = var7 - 4; var11 <= 4 + var7; ++var11) {
                                                         var12 = class285.field3652;
                                                         if (var12 < 3 && 2 == (class62.field901[1][var10][var11] & 2)) {
                                                            ++var12;
                                                         }

                                                         var13 = var8 - class62.field911[var12][var10][var11];
                                                         if (var13 > var9) {
                                                            var9 = var13;
                                                         }
                                                      }
                                                   }
                                                }

                                                var10 = var9 * 192;
                                                if (var10 > 98048) {
                                                   var10 = 98048;
                                                }

                                                if (var10 < 32768) {
                                                   var10 = 32768;
                                                }

                                                if (var10 > field493) {
                                                   field493 += (var10 - field493) / 24;
                                                } else if (var10 < field493) {
                                                   field493 += (var10 - field493) / 80;
                                                }

                                                class271.field3533 = class123.method2216(class20.field140.field1069, class20.field140.field1059, class285.field3652) - field483;
                                             } else if (1 == field482) {
                                                class109.method2108();
                                                short var39 = -1;
                                                if (class11.field46[33]) {
                                                   var39 = 0;
                                                } else if (class11.field46[49]) {
                                                   var39 = 1024;
                                                }

                                                if (class11.field46[48]) {
                                                   if (var39 == 0) {
                                                      var39 = 1792;
                                                   } else if (1024 == var39) {
                                                      var39 = 1280;
                                                   } else {
                                                      var39 = 1536;
                                                   }
                                                } else if (class11.field46[50]) {
                                                   if (var39 == 0) {
                                                      var39 = 256;
                                                   } else if (var39 == 1024) {
                                                      var39 = 768;
                                                   } else {
                                                      var39 = 512;
                                                   }
                                                }

                                                byte var42 = 0;
                                                if (class11.field46[35]) {
                                                   var42 = -1;
                                                } else if (class11.field46[51]) {
                                                   var42 = 1;
                                                }

                                                var6 = 0;
                                                if (var39 >= 0 || var42 != 0) {
                                                   var6 = class11.field46[81] ? -410802453 * field488 * 701944259 : field487 * -2093914857 * 196485799;
                                                   var6 *= 16;
                                                   field441 = var39;
                                                   field486 = var42;
                                                }

                                                if (field434 < var6) {
                                                   field434 += var6 / 8;
                                                   if (field434 > var6) {
                                                      field434 = var6;
                                                   }
                                                } else if (field434 > var6) {
                                                   field434 = field434 * 9 / 10;
                                                }

                                                if (field434 > 0) {
                                                   var7 = field434 / 16;
                                                   if (field441 >= 0) {
                                                      var4 = field441 - class118.field1400 & 2047;
                                                      var8 = class198.field2266[var4];
                                                      var9 = class198.field2273[var4];
                                                      class11.field66 += var7 * var8 / 65536;
                                                      class273.field3553 += var7 * var9 / 65536;
                                                   }

                                                   if (0 != field486) {
                                                      class271.field3533 += field486 * var7;
                                                      if (class271.field3533 > 0) {
                                                         class271.field3533 = 0;
                                                      }
                                                   }
                                                } else {
                                                   field441 = -1;
                                                   field486 = -1;
                                                }

                                                if (class11.field46[13]) {
                                                   field453.method1963(class149.method2495(class227.field2634, field453.field1205));
                                                   field482 = 0;
                                                }
                                             }

                                             if (4 == class20.field141 && class311.field3777) {
                                                var4 = class20.field145 - field546;
                                                field658 = 2 * var4;
                                                field546 = var4 != -1 && var4 != 1 ? (class20.field145 + field546) / 2 : 722992051 * class20.field145 * 1434528635;
                                                var5 = field491 - class20.field142;
                                                field478 = 2 * var5;
                                                field491 = var5 != -1 && 1 != var5 ? (class20.field142 + field491) / 2 : 674629047 * class20.field142 * 1500047367;
                                             } else {
                                                if (class11.field46[96]) {
                                                   field478 += (-24 - field478) / 2;
                                                } else if (class11.field46[97]) {
                                                   field478 += (24 - field478) / 2;
                                                } else {
                                                   field478 /= 2;
                                                }

                                                if (class11.field46[98]) {
                                                   field658 += (12 - field658) / 2;
                                                } else if (class11.field46[99]) {
                                                   field658 += (-12 - field658) / 2;
                                                } else {
                                                   field658 /= 2;
                                                }

                                                field546 = class20.field145;
                                                field491 = class20.field142;
                                             }

                                             field445 = field478 / 2 + field445 & 2047;
                                             field476 += field658 / 2;
                                             if (field476 < 128) {
                                                field476 = 128;
                                             }

                                             if (field476 > 383) {
                                                field476 = 383;
                                             }

                                             if (field615) {
                                                class162.method2849();
                                             }

                                             for(var4 = 0; var4 < 5; ++var4) {
                                                int var10002 = field660[var4]++;
                                             }

                                             class38.field311.method1927();
                                             var4 = ++class20.field146 - 1;
                                             var6 = class11.field61;
                                             if (var4 > 15000 && var6 > 15000) {
                                                field571 = 250;
                                                class20.field146 = 14500;
                                                var41 = class149.method2495(class227.field2664, field453.field1205);
                                                field453.method1963(var41);
                                             }

                                             class13.field80.method1322();
                                             ++field453.field1216;
                                             if (field453.field1216 > 50) {
                                                var41 = class149.method2495(class227.field2574, field453.field1205);
                                                field453.method1963(var41);
                                             }

                                             try {
                                                field453.method1962();
                                             } catch (IOException var15) {
                                                class175.method3140();
                                             }

                                             return;
                                          }

                                          var32 = var30.field961;
                                          if (var32.field3031 < 0) {
                                             break;
                                          }

                                          var33 = class87.method1995(var32.field3001);
                                       } while(null == var33 || null == var33.field3061 || var32.field3031 >= var33.field3061.length || var33.field3061[var32.field3031] != var32);

                                       class95.method2055(var30);
                                    }
                                 }

                                 var32 = var30.field961;
                                 if (var32.field3031 < 0) {
                                    break;
                                 }

                                 var33 = class87.method1995(var32.field3001);
                              } while(null == var33 || var33.field3061 == null || var32.field3031 >= var33.field3061.length || var32 != var33.field3061[var32.field3031]);

                              class95.method2055(var30);
                           }
                        }

                        var32 = var30.field961;
                        if (var32.field3031 < 0) {
                           break;
                        }

                        var33 = class87.method1995(var32.field3001);
                     } while(var33 == null || null == var33.field3061 || var32.field3031 >= var33.field3061.length || var33.field3061[var32.field3031] != var32);

                     class95.method2055(var30);
                  }
               }

               var18 = class149.method2495(class227.field2591, field453.field1205);
               var18.field2691.method5931(0);
               var4 = var18.field2691.field4182;
               class71.method1744(var18.field2691);
               var18.field2691.method5945(var18.field2691.field4182 - var4);
               field453.method1963(var18);
            }
         }
      }
   }

   protected final void method163() {
      field625 = class87.method1989() + 500L;
      this.method827();
      if (field568 != -1) {
         this.method833(true);
      }

   }

   void method827() {
      int var2 = class69.field971;
      int var3 = field687;
      if (super.field104 < var2) {
         var2 = super.field104;
      }

      if (super.field98 < var3) {
         var3 = super.field98;
      }

      if (class38.field308 != null) {
         try {
            class15.method120(class59.field874, "resize", new Object[]{class238.method4117()});
         } catch (Throwable var5) {
         }
      }

   }

   final void method1114() {
      int var2;
      if (-1 != field568) {
         var2 = field568;
         if (class251.method4294(var2)) {
            class142.method2399(class249.field3039[var2], -1);
         }
      }

      for(var2 = 0; var2 < field591; ++var2) {
         if (field617[var2]) {
            field618[var2] = true;
         }

         field509[var2] = field617[var2];
         field617[var2] = false;
      }

      field616 = field452;
      field557 = -1;
      field558 = -1;
      field515 = null;
      if (field568 != -1) {
         field591 = 0;
         class42.method765(field568, 0, 0, class69.field971, field687, 0, 0, -1);
      }

      class394.method6295();
      if (field512) {
         if (1 == field511) {
            class84.field1190[field540 / 100].method6404(field508 - 8, field463 - 8);
         }

         if (2 == field511) {
            class84.field1190[4 + field540 / 100].method6404(field508 - 8, field463 - 8);
         }
      }

      int var3;
      int var4;
      if (!field544) {
         if (field557 != -1) {
            var2 = field557;
            var3 = field558;
            if ((field545 >= 2 || field561 != 0 || field563) && field578) {
               var4 = class160.method2842();
               String var5;
               if (field561 == 1 && field545 < 2) {
                  var5 = class270.field3380 + class270.field3267 + field530 + " " + class79.field1143;
               } else if (field563 && field545 < 2) {
                  var5 = field566 + class270.field3267 + field466 + " " + class79.field1143;
               } else {
                  String var6;
                  if (var4 < 0) {
                     var6 = "";
                  } else if (field551[var4].length() > 0) {
                     var6 = field485[var4] + class270.field3267 + field551[var4];
                  } else {
                     var6 = field485[var4];
                  }

                  var5 = var6;
               }

               if (field545 > 2) {
                  var5 = var5 + class44.method770(16777215) + " " + '/' + " " + (field545 - 2) + class270.field3432;
               }

               class130.field1468.method4861(var5, var2 + 4, var3 + 15, 16777215, 0, field452 / 1000);
            }
         }
      } else {
         var2 = class150.field1659;
         var3 = class335.field3907;
         var4 = class12.field69;
         int var14 = class52.field772;
         int var15 = 6116423;
         class394.method6265(var2, var3, var4, var14, var15);
         class394.method6265(var2 + 1, 1 + var3, var4 - 2, 16, 0);
         class394.method6292(var2 + 1, var3 + 18, var4 - 2, var14 - 19, 0);
         class130.field1468.method4853(class270.field3383, 3 + var2, 14 + var3, var15, -1);
         int var7 = class20.field142;
         int var8 = class20.field145;

         for(int var9 = 0; var9 < field545; ++var9) {
            int var10 = 31 + var3 + (field545 - 1 - var9) * 15;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < 3 + var10) {
               var11 = 16776960;
            }

            class302 var12 = class130.field1468;
            String var13;
            if (var9 < 0) {
               var13 = "";
            } else if (field551[var9].length() > 0) {
               var13 = field485[var9] + class270.field3267 + field551[var9];
            } else {
               var13 = field485[var9];
            }

            var12.method4853(var13, var2 + 3, var10, var11, 0);
         }

         class148.method2473(class150.field1659, class335.field3907, class12.field69, class52.field772);
      }

      if (3 == field624) {
         for(var2 = 0; var2 < field591; ++var2) {
            if (field509[var2]) {
               class394.method6264(field623[var2], field626[var2], field622[var2], field619[var2], 16711935, 128);
            } else if (field618[var2]) {
               class394.method6264(field623[var2], field626[var2], field622[var2], field619[var2], 16711680, 128);
            }
         }
      }

      class48.method1316(class285.field3652, class20.field140.field1069, class20.field140.field1059, field556);
      field556 = 0;
   }

   final boolean method829(class86 var1) {
      class330 var3 = var1.method1968();
      class384 var4 = var1.field1201;
      if (var3 == null) {
         return false;
      } else {
         String var6;
         int var7;
         try {
            int var23;
            if (var1.field1206 == null) {
               if (var1.field1211) {
                  if (!var3.method5294(1)) {
                     return false;
                  }

                  var3.method5282(var1.field1201.field4184, 0, 1);
                  var1.field1210 = 0;
                  var1.field1211 = false;
               }

               var4.field4182 = 0;
               if (var4.method5889()) {
                  if (!var3.method5294(1)) {
                     return false;
                  }

                  var3.method5282(var1.field1201.field4184, 1, 1);
                  var1.field1210 = 0;
               }

               var1.field1211 = true;
               class230[] var5 = class189.method3268();
               var23 = var4.method5890();
               if (var23 < 0 || var23 >= var5.length) {
                  throw new IOException(var23 + " " + var4.field4182);
               }

               var1.field1206 = var5[var23];
               var1.field1209 = var1.field1206.field2740;
            }

            if (-1 == var1.field1209) {
               if (!var3.method5294(1)) {
                  return false;
               }

               var1.method1968().method5282(var4.field4184, 0, 1);
               var1.field1209 = var4.field4184[0] & 255;
            }

            if (var1.field1209 == -2) {
               if (!var3.method5294(2)) {
                  return false;
               }

               var1.method1968().method5282(var4.field4184, 0, 2);
               var4.field4182 = 0;
               var1.field1209 = var4.method6043();
            }

            if (!var3.method5294(var1.field1209)) {
               return false;
            }

            var4.field4182 = 0;
            var3.method5282(var4.field4184, 0, var1.field1209);
            var1.field1210 = 0;
            field458.method5055();
            var1.field1213 = var1.field1214;
            var1.field1214 = var1.field1212;
            var1.field1212 = var1.field1206;
            boolean var37;
            if (var1.field1206 == class230.field2721) {
               var37 = var4.method6178();
               if (var37) {
                  if (class368.field4128 == null) {
                     class368.field4128 = new class288();
                  }
               } else {
                  class368.field4128 = null;
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2709) {
               if (-1 != field568) {
                  class163.method2852(field568, 0);
               }

               var1.field1206 = null;
               return true;
            }

            int var21;
            class249 var72;
            if (class230.field2732 == var1.field1206) {
               var21 = var4.method5995();
               var72 = class87.method1995(var21);

               for(var7 = 0; var7 < var72.field3086.length; ++var7) {
                  var72.field3086[var7] = -1;
                  var72.field3086[var7] = 0;
               }

               class81.method1869(var72);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2730 == var1.field1206) {
               class80.method1859(var4, var1.field1209);
               class155.method2619();
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2782) {
               field670 = var4.method6164();
               field647 = var4.method5979();
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2720) {
               for(var21 = 0; var21 < field524.length; ++var21) {
                  if (null != field524[var21]) {
                     field524[var21].field1053 = -1;
                  }
               }

               for(var21 = 0; var21 < field567.length; ++var21) {
                  if (null != field567[var21]) {
                     field567[var21].field1053 = -1;
                  }
               }

               var1.field1206 = null;
               return true;
            }

            String var63;
            boolean var65;
            if (class230.field2741 == var1.field1206) {
               var21 = var4.method5962();
               var65 = var4.method5948() == 1;
               var63 = "";
               boolean var58 = false;
               if (var65) {
                  var63 = var4.method5957();
                  if (class13.field80.method1325(new class406(var63, class52.field761))) {
                     var58 = true;
                  }
               }

               String var45 = var4.method5957();
               if (!var58) {
                  class121.method2204(var21, var63, var45);
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2771) {
               var21 = var4.method5997();
               var72 = class87.method1995(var21);
               var72.field2950 = 3;
               var72.field3002 = class20.field140.field979.method4198();
               class81.method1869(var72);
               var1.field1206 = null;
               return true;
            }

            int var16;
            byte var20;
            String var60;
            if (class230.field2726 == var1.field1206) {
               var20 = var4.method5949();
               var6 = var4.method5957();
               long var66 = (long)var4.method6043();
               long var41 = (long)var4.method5952();
               class272 var55 = (class272)class251.method4287(class85.method1959(), var4.method5948());
               long var50 = (var66 << 32) + var41;
               boolean var57 = false;
               class124 var62 = null;
               var62 = var20 >= 0 ? field638[var20] : class322.field3845;
               if (null == var62) {
                  var57 = true;
               } else {
                  var16 = 0;

                  while(true) {
                     if (var16 >= 100) {
                        if (var55.field3548 && class13.field80.method1325(new class406(var6, class52.field761))) {
                           var57 = true;
                        }
                        break;
                     }

                     if (var50 == field573[var16]) {
                        var57 = true;
                        break;
                     }

                     ++var16;
                  }
               }

               if (!var57) {
                  field573[field631] = var50;
                  field631 = (field631 + 1) % 100;
                  var60 = class303.method4915(class176.method3147(var4));
                  int var17 = var20 >= 0 ? 41 : 44;
                  if (var55.field3543 != -1) {
                     class130.method2276(var17, class77.method1822(var55.field3543) + var6, var60, var62.field1430);
                  } else {
                     class130.method2276(var17, var6, var60, var62.field1430);
                  }
               }

               var1.field1206 = null;
               return true;
            }

            int var31;
            int var32;
            int var36;
            int var38;
            if (class230.field2776 == var1.field1206) {
               field615 = true;
               class377.field4166 = var4.method5948();
               class192.field2148 = var4.method5948();
               class330.field3875 = var4.method6043();
               class143.field1578 = var4.method5948();
               class270.field3398 = var4.method5948();
               if (class270.field3398 >= 100) {
                  var21 = 64 + class377.field4166 * 128;
                  var23 = class192.field2148 * 128 + 64;
                  var7 = class123.method2216(var21, var23, class285.field3652) - class330.field3875;
                  var31 = var21 - class65.field934;
                  var32 = var7 - class337.field3924;
                  var36 = var23 - class358.field4012;
                  var38 = (int)Math.sqrt((double)(var31 * var31 + var36 * var36));
                  class117.field1398 = (int)(Math.atan2((double)var32, (double)var38) * 325.949D) & 2047;
                  class118.field1400 = (int)(Math.atan2((double)var31, (double)var36) * -325.949D) & 2047;
                  if (class117.field1398 < 128) {
                     class117.field1398 = 128;
                  }

                  if (class117.field1398 > 383) {
                     class117.field1398 = 383;
                  }
               }

               var1.field1206 = null;
               return true;
            }

            long var8;
            int var14;
            long var24;
            String var35;
            String var53;
            if (class230.field2738 == var1.field1206) {
               var35 = var4.method5957();
               var24 = (long)var4.method6043();
               var8 = (long)var4.method5952();
               class272 var44 = (class272)class251.method4287(class85.method1959(), var4.method5948());
               long var51 = (var24 << 32) + var8;
               boolean var46 = false;

               for(var14 = 0; var14 < 100; ++var14) {
                  if (var51 == field573[var14]) {
                     var46 = true;
                     break;
                  }
               }

               if (class13.field80.method1325(new class406(var35, class52.field761))) {
                  var46 = true;
               }

               if (!var46 && 0 == field522) {
                  field573[field631] = var51;
                  field631 = (field631 + 1) % 100;
                  var53 = class303.method4915(class286.method4581(class176.method3147(var4)));
                  byte var59;
                  if (var44.field3547) {
                     var59 = 7;
                  } else {
                     var59 = 3;
                  }

                  if (-1 != var44.field3543) {
                     class121.method2204(var59, class77.method1822(var44.field3543) + var35, var53);
                  } else {
                     class121.method2204(var59, var35, var53);
                  }
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2763) {
               class125.field1441 = class158.method2772(var4.method5948());
               var1.field1206 = null;
               return true;
            }

            if (class230.field2702 == var1.field1206) {
               class13.method99(class228.field2681);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2746) {
               class13.method99(class228.field2677);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2700 == var1.field1206) {
               class13.method99(class228.field2679);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2778) {
               var35 = var4.method5957();
               var23 = var4.method5977();
               var7 = var4.method5977();
               if (var7 >= 1 && var7 <= 8) {
                  if (var35.equalsIgnoreCase(class270.field3234)) {
                     var35 = null;
                  }

                  field532[var7 - 1] = var35;
                  field533[var7 - 1] = var23 == 0;
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2749) {
               var35 = var4.method5957();
               var6 = class303.method4915(class286.method4581(class176.method3147(var4)));
               class121.method2204(6, var35, var6);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2745 == var1.field1206) {
               field424 = var4.method5948();
               if (field424 == 1) {
                  field425 = var4.method6043();
               }

               if (field424 >= 2 && field424 <= 6) {
                  if (field424 == 2) {
                     field430 = 64;
                     field553 = 64;
                  }

                  if (3 == field424) {
                     field430 = 0;
                     field553 = 64;
                  }

                  if (4 == field424) {
                     field430 = 128;
                     field553 = 64;
                  }

                  if (field424 == 5) {
                     field430 = 64;
                     field553 = 0;
                  }

                  if (field424 == 6) {
                     field430 = 64;
                     field553 = 128;
                  }

                  field424 = 2;
                  field477 = var4.method6043();
                  field454 = var4.method6043();
                  field429 = var4.method5948();
               }

               if (field424 == 10) {
                  field426 = var4.method6043();
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2783) {
               var35 = var4.method5957();
               Object[] var70 = new Object[var35.length() + 1];

               for(var7 = var35.length() - 1; var7 >= 0; --var7) {
                  if (var35.charAt(var7) == 's') {
                     var70[var7 + 1] = var4.method5957();
                  } else {
                     var70[1 + var7] = new Integer(var4.method6172());
                  }
               }

               var70[0] = new Integer(var4.method6172());
               class68 var64 = new class68();
               var64.field955 = var70;
               class95.method2055(var64);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2761) {
               var20 = var4.method5981();
               var23 = var4.method6076();
               class244.field2912[var23] = var20;
               if (class244.field2911[var23] != var20) {
                  class244.field2911[var23] = var20;
               }

               class46.method801(var23);
               field594[++field552 - 1 & 31] = var23;
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2784) {
               class58.field859 = var4.method5948();
               class292.field3695 = var4.method5979();

               for(var21 = class292.field3695; var21 < class292.field3695 + 8; ++var21) {
                  for(var23 = class58.field859; var23 < 8 + class58.field859; ++var23) {
                     if (field536[class285.field3652][var21][var23] != null) {
                        field536[class285.field3652][var21][var23] = null;
                        class49.method1382(var21, var23);
                     }
                  }
               }

               for(class71 var71 = (class71)field537.method4687(); var71 != null; var71 = (class71)field537.method4678()) {
                  if (var71.field1016 >= class292.field3695 && var71.field1016 < class292.field3695 + 8 && var71.field1011 >= class58.field859 && var71.field1011 < class58.field859 + 8 && class285.field3652 == var71.field1018) {
                     var71.field1019 = 0;
                  }
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2751) {
               var21 = var4.method6172();
               class67 var68 = (class67)field569.method5746((long)var21);
               if (var68 != null) {
                  class162.method2850(var68, true);
               }

               if (null != field574) {
                  class81.method1869(field574);
                  field574 = null;
               }

               var1.field1206 = null;
               return true;
            }

            class249 var30;
            if (class230.field2764 == var1.field1206) {
               var21 = var4.method5963();
               var23 = var4.method5990();
               var30 = class87.method1995(var21);
               if (var30.field3005 != var23 || -1 == var23) {
                  var30.field3005 = var23;
                  var30.field3094 = 0;
                  var30.field3090 = 0;
                  class81.method1869(var30);
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2774) {
               byte[] var69 = new byte[var1.field1209];
               var4.method5891(var69, 0, var69.length);
               class385 var67 = new class385(var69);
               var63 = var67.method5957();
               class139.method2345(var63, true, false);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2719 == var1.field1206) {
               class108.method2105();
               field432 = var4.method5948();
               field517 = field593;
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2755) {
               for(var21 = 0; var21 < class244.field2911.length; ++var21) {
                  if (class244.field2911[var21] != class244.field2912[var21]) {
                     class244.field2911[var21] = class244.field2912[var21];
                     class46.method801(var21);
                     field594[++field552 - 1 & 31] = var21;
                  }
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2736 == var1.field1206) {
               field615 = false;

               for(var21 = 0; var21 < 5; ++var21) {
                  field656[var21] = false;
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2750) {
               var21 = var4.method5997();
               var65 = var4.method6164() == 1;
               var30 = class87.method1995(var21);
               if (var65 != var30.field2978) {
                  var30.field2978 = var65;
                  class81.method1869(var30);
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2737) {
               var21 = var4.method5995();
               var23 = var4.method6076();
               var7 = var23 >> 10 & 31;
               var31 = var23 >> 5 & 31;
               var32 = var23 & 31;
               var36 = (var31 << 11) + (var7 << 19) + (var32 << 3);
               class249 var48 = class87.method1995(var21);
               if (var48.field2983 != var36) {
                  var48.field2983 = var36;
                  class81.method1869(var48);
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2703 == var1.field1206) {
               if (null != class69.field972) {
                  class69.field972.method5106(var4);
               }

               class19.method300();
               var1.field1206 = null;
               return true;
            }

            if (class230.field2768 == var1.field1206) {
               class13.method99(class228.field2678);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2706) {
               class292.field3695 = var4.method5977();
               class58.field859 = var4.method5979();
               var1.field1206 = null;
               return true;
            }

            if (class230.field2707 == var1.field1206) {
               class13.field80.method1319(var4, var1.field1209);
               field610 = field593;
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2696) {
               field646 = var4.method5948();
               var1.field1206 = null;
               return true;
            }

            class249 var29;
            if (class230.field2724 == var1.field1206) {
               var21 = var4.method6172();
               var23 = var4.method6043();
               var7 = var4.method5988();
               var29 = class87.method1995(var21);
               var29.field3014 = var23 + (var7 << 16);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2753) {
               var21 = var4.method6172();
               var23 = var4.method6043();
               if (var21 < -70000) {
                  var23 += 32768;
               }

               if (var21 >= 0) {
                  var30 = class87.method1995(var21);
               } else {
                  var30 = null;
               }

               if (var30 != null) {
                  for(var31 = 0; var31 < var30.field3086.length; ++var31) {
                     var30.field3086[var31] = 0;
                     var30.field3087[var31] = 0;
                  }
               }

               class105.method2093(var23);
               var31 = var4.method6043();

               for(var32 = 0; var32 < var31; ++var32) {
                  var36 = var4.method5987();
                  var38 = var4.method5948();
                  if (var38 == 255) {
                     var38 = var4.method5997();
                  }

                  if (null != var30 && var32 < var30.field3086.length) {
                     var30.field3086[var32] = var36;
                     var30.field3087[var32] = var38;
                  }

                  class140.method2362(var23, var32, var36 - 1, var38);
               }

               if (null != var30) {
                  class81.method1869(var30);
               }

               class108.method2105();
               field641[++field575 - 1 & 31] = var23 & 32767;
               var1.field1206 = null;
               return true;
            }

            class249 var34;
            if (class230.field2748 == var1.field1206) {
               var21 = var4.method6043();
               var23 = var4.method5988();
               var7 = var4.method5987();
               var31 = var4.method5997();
               var34 = class87.method1995(var31);
               if (var23 != var34.field3009 || var34.field3010 != var7 || var34.field3000 != var21) {
                  var34.field3009 = var23;
                  var34.field3010 = var7;
                  var34.field3000 = var21;
                  class81.method1869(var34);
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2713) {
               var21 = var4.method5948();
               if (var4.method5948() == 0) {
                  field620[var21] = new class286();
                  var4.field4182 += 18;
               } else {
                  --var4.field4182;
                  field620[var21] = new class286(var4, false);
               }

               field607 = field593;
               var1.field1206 = null;
               return true;
            }

            if (class230.field2722 == var1.field1206) {
               class108.method2105();
               var21 = var4.method5948();
               var23 = var4.method5995();
               var7 = var4.method5979();
               field542[var21] = var23;
               field435[var21] = var7;
               field541[var21] = 1;

               for(var31 = 0; var31 < 98; ++var31) {
                  if (var23 >= class259.field3168[var31]) {
                     field541[var21] = var31 + 2;
                  }
               }

               field428[++field599 - 1 & 31] = var21;
               var1.field1206 = null;
               return true;
            }

            if (class230.field2758 == var1.field1206) {
               if (0 == var1.field1209) {
                  class69.field972 = null;
               } else {
                  if (class69.field972 == null) {
                     class69.field972 = new class320(class52.field761, class59.field874);
                  }

                  class69.field972.method5114(var4);
               }

               class19.method300();
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2767) {
               var21 = var4.method6172();
               var23 = var4.method6043();
               var30 = class87.method1995(var21);
               if (var30.field2950 != 1 || var23 != var30.field3002) {
                  var30.field2950 = 1;
                  var30.field3002 = var23;
                  class81.method1869(var30);
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2717 == var1.field1206) {
               var21 = var4.method5948();
               var23 = var4.method5948();
               var7 = var4.method5948();
               var31 = var4.method5948();
               field656[var21] = true;
               field437[var21] = var23;
               field609[var21] = var7;
               field659[var21] = var31;
               field660[var21] = 0;
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2708) {
               var21 = var4.method6172();
               if (field489 != var21) {
                  field489 = var21;
                  class340.method5393();
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2781 == var1.field1206) {
               class51.method1524();
               var20 = var4.method5949();
               class107 var61 = new class107(var4);
               class115 var52;
               if (var20 >= 0) {
                  var52 = field637[var20];
               } else {
                  var52 = class42.field355;
               }

               var61.method2096(var52);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2779 == var1.field1206) {
               var21 = var4.method6043();
               field568 = var21;
               this.method833(false);
               class312.method5077(var21);
               class113.method2114(field568);

               for(var23 = 0; var23 < 100; ++var23) {
                  field617[var23] = true;
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2756 == var1.field1206) {
               var21 = var4.method5988();
               if (65535 == var21) {
                  var21 = -1;
               }

               class42.method764(var21);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2698) {
               var21 = var4.method5988();
               if (65535 == var21) {
                  var21 = -1;
               }

               var23 = var4.method5991();
               class88.method2000(var21, var23);
               var1.field1206 = null;
               return true;
            }

            class67 var33;
            long var39;
            if (var1.field1206 == class230.field2747) {
               var21 = var1.field1209 + var4.field4182;
               var23 = var4.method6043();
               var7 = var4.method6043();
               if (field568 != var23) {
                  field568 = var23;
                  this.method833(false);
                  class312.method5077(field568);
                  class113.method2114(field568);

                  for(var31 = 0; var31 < 100; ++var31) {
                     field617[var31] = true;
                  }
               }

               class67 var11;
               for(; var7-- > 0; var11.field948 = true) {
                  var31 = var4.method6172();
                  var32 = var4.method6043();
                  var36 = var4.method5948();
                  var11 = (class67)field569.method5746((long)var31);
                  if (var11 != null && var32 != var11.field950) {
                     class162.method2850(var11, true);
                     var11 = null;
                  }

                  if (var11 == null) {
                     var11 = class107.method2098(var31, var32, var36);
                  }
               }

               for(var33 = (class67)field569.method5736(); var33 != null; var33 = (class67)field569.method5739()) {
                  if (var33.field948) {
                     var33.field948 = false;
                  } else {
                     class162.method2850(var33, true);
                  }
               }

               field469 = new class364(512);

               while(var4.field4182 < var21) {
                  var31 = var4.method6172();
                  var32 = var4.method6043();
                  var36 = var4.method6043();
                  var38 = var4.method6172();

                  for(int var47 = var32; var47 <= var36; ++var47) {
                     var39 = (long)var47 + ((long)var31 << 32);
                     field469.method5737(new class353(var38), var39);
                  }
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2766) {
               class45.method799(var4.method5957());
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2752) {
               var21 = var4.method5997();
               var23 = var4.method6172();
               class67 var42 = (class67)field569.method5746((long)var21);
               var33 = (class67)field569.method5746((long)var23);
               if (var33 != null) {
                  class162.method2850(var33, null == var42 || var42.field950 != var33.field950);
               }

               if (var42 != null) {
                  var42.method5437();
                  field569.method5737(var42, (long)var23);
               }

               var34 = class87.method1995(var21);
               if (null != var34) {
                  class81.method1869(var34);
               }

               var34 = class87.method1995(var23);
               if (var34 != null) {
                  class81.method1869(var34);
                  class81.method1868(class249.field3039[var34.field2958 >>> 16], var34, true);
               }

               if (-1 != field568) {
                  class163.method2852(field568, 1);
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2757) {
               class153.method2544(true, var4);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2692) {
               var21 = var4.method5977();
               var23 = var4.method5987();
               var7 = var4.method6172();
               var33 = (class67)field569.method5746((long)var7);
               if (var33 != null) {
                  class162.method2850(var33, var23 != var33.field950);
               }

               class107.method2098(var7, var23, var21);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2734 == var1.field1206) {
               var21 = var4.method5997();
               var6 = var4.method5957();
               var30 = class87.method1995(var21);
               if (!var6.equals(var30.field3042)) {
                  var30.field3042 = var6;
                  class81.method1869(var30);
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2733) {
               class119.method2188(var4, var1.field1209);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2695) {
               class292.field3695 = var4.method6164();
               class58.field859 = var4.method6164();

               while(var4.field4182 < var1.field1209) {
                  var21 = var4.method5948();
                  class228 var54 = class215.method3851()[var21];
                  class13.method99(var54);
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2727 == var1.field1206) {
               class51.method1524();
               var20 = var4.method5949();
               if (1 == var1.field1209) {
                  if (var20 >= 0) {
                     field637[var20] = null;
                  } else {
                     class42.field355 = null;
                  }

                  var1.field1206 = null;
                  return true;
               }

               if (var20 >= 0) {
                  field637[var20] = new class115(var4);
               } else {
                  class42.field355 = new class115(var4);
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2773 == var1.field1206) {
               var21 = var4.method6043();
               var23 = var4.method5948();
               var7 = var4.method6043();
               class128.method2256(var21, var23, var7);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2728 == var1.field1206) {
               for(var21 = 0; var21 < class282.field3631; ++var21) {
                  class140 var49 = class49.method1383(var21);
                  if (null != var49) {
                     class244.field2912[var21] = 0;
                     class244.field2911[var21] = 0;
                  }
               }

               class108.method2105();
               field552 += 32;
               var1.field1206 = null;
               return true;
            }

            if (class230.field2744 == var1.field1206) {
               class153.method2544(false, var4);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2718 == var1.field1206) {
               class13.field80.method1329();
               field610 = field593;
               var1.field1206 = null;
               return true;
            }

            if (class230.field2769 == var1.field1206) {
               class44.field372 = null;
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2735) {
               class13.method99(class228.field2680);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2694) {
               class239.method4125(false, var1.field1201);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2777) {
               var21 = var4.method6172();
               var23 = var4.method6043();
               if (var21 < -70000) {
                  var23 += 32768;
               }

               if (var21 >= 0) {
                  var30 = class87.method1995(var21);
               } else {
                  var30 = null;
               }

               for(; var4.field4182 < var1.field1209; class140.method2362(var23, var31, var32 - 1, var36)) {
                  var31 = var4.method5962();
                  var32 = var4.method6043();
                  var36 = 0;
                  if (0 != var32) {
                     var36 = var4.method5948();
                     if (255 == var36) {
                        var36 = var4.method6172();
                     }
                  }

                  if (null != var30 && var31 >= 0 && var31 < var30.field3086.length) {
                     var30.field3086[var31] = var32;
                     var30.field3087[var31] = var36;
                  }
               }

               if (var30 != null) {
                  class81.method1869(var30);
               }

               class108.method2105();
               field641[++field575 - 1 & 31] = var23 & 32767;
               var1.field1206 = null;
               return true;
            }

            if (class230.field2765 == var1.field1206) {
               var37 = var4.method5948() == 1;
               if (var37) {
                  class178.field2067 = class87.method1989() - var4.method5954();
                  class293.field3711 = new class279(var4, true);
               } else {
                  class293.field3711 = null;
               }

               field480 = field593;
               var1.field1206 = null;
               return true;
            }

            long var10;
            if (var1.field1206 == class230.field2785) {
               var35 = var4.method5957();
               var24 = var4.method5954();
               var8 = (long)var4.method6043();
               var10 = (long)var4.method5952();
               class272 var43 = (class272)class251.method4287(class85.method1959(), var4.method5948());
               var39 = (var8 << 32) + var10;
               boolean var56 = false;

               for(var16 = 0; var16 < 100; ++var16) {
                  if (field573[var16] == var39) {
                     var56 = true;
                     break;
                  }
               }

               if (var43.field3548 && class13.field80.method1325(new class406(var35, class52.field761))) {
                  var56 = true;
               }

               if (!var56 && field522 == 0) {
                  field573[field631] = var39;
                  field631 = (field631 + 1) % 100;
                  var60 = class303.method4915(class286.method4581(class176.method3147(var4)));
                  if (-1 != var43.field3543) {
                     class130.method2276(9, class77.method1822(var43.field3543) + var35, var60, class84.method1928(var24));
                  } else {
                     class130.method2276(9, var35, var60, class84.method1928(var24));
                  }
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2759 == var1.field1206) {
               field423 = var4.method6076() * 30;
               field517 = field593;
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2742) {
               var21 = var4.method5948();
               class178.method3185(var21);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2716) {
               field606 = field593;
               var20 = var4.method5949();
               if (var1.field1209 == 1) {
                  if (var20 >= 0) {
                     field638[var20] = null;
                  } else {
                     class322.field3845 = null;
                  }

                  var1.field1206 = null;
                  return true;
               }

               if (var20 >= 0) {
                  field638[var20] = new class124(var4);
               } else {
                  class322.field3845 = new class124(var4);
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2712 == var1.field1206) {
               class13.method99(class228.field2684);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2705 == var1.field1206) {
               var21 = var4.method5987();
               if (var21 == 65535) {
                  var21 = -1;
               }

               var23 = var4.method6172();
               var7 = var4.method5988();
               if (65535 == var7) {
                  var7 = -1;
               }

               var31 = var4.method5997();

               for(var32 = var21; var32 <= var7; ++var32) {
                  var10 = ((long)var31 << 32) + (long)var32;
                  class354 var40 = field469.method5746(var10);
                  if (var40 != null) {
                     var40.method5437();
                  }

                  field469.method5737(new class353(var23), var10);
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2729 == var1.field1206) {
               class13.field80.field713.method5080(var4, var1.field1209);
               class253.method4302();
               field610 = field593;
               var1.field1206 = null;
               return true;
            }

            if (class230.field2693 == var1.field1206) {
               class145.method2449();
               var1.field1206 = null;
               return false;
            }

            if (var1.field1206 == class230.field2739) {
               var21 = var4.method5995();
               var23 = var4.method6043();
               if (65535 == var23) {
                  var23 = -1;
               }

               var7 = var4.method5995();
               var29 = class87.method1995(var7);
               class157 var9;
               if (!var29.field2993) {
                  if (var23 == -1) {
                     var29.field2950 = 0;
                     var1.field1206 = null;
                     return true;
                  }

                  var9 = class11.method93(var23);
                  var29.field2950 = 4;
                  var29.field3002 = var23;
                  var29.field3009 = var9.field1801;
                  var29.field3010 = var9.field1822;
                  var29.field3000 = var9.field1800 * 100 / var21;
                  class81.method1869(var29);
               } else {
                  var29.field3088 = var23;
                  var29.field3089 = var21;
                  var9 = class11.method93(var23);
                  var29.field3009 = var9.field1801;
                  var29.field3010 = var9.field1822;
                  var29.field3011 = var9.field1803;
                  var29.field3007 = var9.field1804;
                  var29.field2960 = var9.field1805;
                  var29.field3000 = var9.field1800;
                  if (var9.field1806 == 1) {
                     var29.field2991 = 1;
                  } else {
                     var29.field2991 = 2;
                  }

                  if (var29.field3013 > 0) {
                     var29.field3000 = var29.field3000 * 32 / var29.field3013;
                  } else if (var29.field2969 > 0) {
                     var29.field3000 = var29.field3000 * 32 / var29.field2969;
                  }

                  class81.method1869(var29);
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2701 == var1.field1206) {
               var21 = var4.method5951();
               var23 = var4.method5989();
               var7 = var4.method5995();
               var29 = class87.method1995(var7);
               if (var23 != var29.field2947 || var29.field3019 != var21 || 0 != var29.field3063 || var29.field2964 != 0) {
                  var29.field2947 = var23;
                  var29.field3019 = var21;
                  var29.field3063 = 0;
                  var29.field2964 = 0;
                  class81.method1869(var29);
                  this.method834(var29);
                  if (0 == var29.field2977) {
                     class81.method1868(class249.field3039[var7 >> 16], var29, false);
                  }
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2762) {
               var21 = var4.method6043();
               var23 = var4.method5995();
               class244.field2912[var21] = var23;
               if (class244.field2911[var21] != var23) {
                  class244.field2911[var21] = var23;
               }

               class46.method801(var21);
               field594[++field552 - 1 & 31] = var21;
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2704) {
               field615 = true;
               class108.field1324 = var4.method5948();
               class155.field1714 = var4.method5948();
               class7.field15 = var4.method6043();
               class97.field1266 = var4.method5948();
               class217.field2546 = var4.method5948();
               if (class217.field2546 >= 100) {
                  class65.field934 = class108.field1324 * 128 + 64;
                  class358.field4012 = class155.field1714 * 128 + 64;
                  class337.field3924 = class123.method2216(class65.field934, class358.field4012, class285.field3652) - class7.field15;
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2780 == var1.field1206) {
               class13.method99(class228.field2675);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2725) {
               var21 = var4.method6172();
               var23 = var4.method6172();
               var7 = class264.method4339();
               class229 var28 = class149.method2495(class227.field2596, field453.field1205);
               var28.field2691.method5976(class19.field120);
               var28.field2691.method6067(var7);
               var28.field2691.method5994(var21);
               var28.field2691.method5972(var23);
               field453.method1963(var28);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2715) {
               var21 = var4.method6043();
               class203.method3692(var21);
               field641[++field575 - 1 & 31] = var21 & 32767;
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2711) {
               if (class44.field372 == null) {
                  class44.field372 = new class340(class287.field3664);
               }

               class393 var25 = class287.field3664.method5407(var4);
               class44.field372.field3936.method5750(var25.field4241, var25.field4242);
               field600[++field601 - 1 & 31] = var25.field4241;
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2772) {
               class13.method99(class228.field2676);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2699) {
               var4.field4182 += 28;
               if (var4.method5973()) {
                  class63.method1659(var4, var4.field4182 - 28);
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2697 == var1.field1206) {
               class239.method4125(true, var1.field1201);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2760 == var1.field1206) {
               var21 = var4.method5997();
               var23 = var4.method6076();
               var30 = class87.method1995(var21);
               if (null != var30 && 0 == var30.field2977) {
                  if (var23 > var30.field3091 - var30.field2990) {
                     var23 = var30.field3091 - var30.field2990;
                  }

                  if (var23 < 0) {
                     var23 = 0;
                  }

                  if (var23 != var30.field2968) {
                     var30.field2968 = var23;
                     class81.method1869(var30);
                  }
               }

               var1.field1206 = null;
               return true;
            }

            if (class230.field2710 == var1.field1206) {
               class108.method2105();
               field576 = var4.method5951();
               field517 = field593;
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2770) {
               class13.method99(class228.field2682);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2754) {
               var21 = var4.method6076();
               var23 = var4.method5997();
               var30 = class87.method1995(var23);
               if (var30.field2950 != 2 || var30.field3002 != var21) {
                  var30.field2950 = 2;
                  var30.field3002 = var21;
                  class81.method1869(var30);
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2714) {
               class48 var22 = new class48();
               var22.field701 = var4.method5957();
               var22.field697 = var4.method6043();
               var23 = var4.method6172();
               var22.field700 = var23;
               class17.method128(45);
               var3.method5279();
               var3 = null;
               class157.method2717(var22);
               var1.field1206 = null;
               return false;
            }

            if (var1.field1206 == class230.field2775) {
               class13.method99(class228.field2683);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2731) {
               var21 = var4.method5948();
               class250.method4286(var21);
               var1.field1206 = null;
               return false;
            }

            if (class230.field2786 == var1.field1206) {
               field644 = var4.method5948();
               if (255 == field644) {
                  field644 = 0;
               }

               field597 = var4.method5948();
               if (field597 == 255) {
                  field597 = 0;
               }

               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2743) {
               class44.field372 = new class340(class287.field3664);
               var1.field1206 = null;
               return true;
            }

            if (class230.field2788 == var1.field1206) {
               field606 = field593;
               var20 = var4.method5949();
               class121 var26 = new class121(var4);
               class124 var27;
               if (var20 >= 0) {
                  var27 = field638[var20];
               } else {
                  var27 = class322.field3845;
               }

               var26.method2203(var27);
               var1.field1206 = null;
               return true;
            }

            if (var1.field1206 == class230.field2723) {
               var20 = var4.method5949();
               var24 = (long)var4.method6043();
               var8 = (long)var4.method5952();
               var10 = var8 + (var24 << 32);
               boolean var12 = false;
               class124 var13 = var20 >= 0 ? field638[var20] : class322.field3845;
               if (null == var13) {
                  var12 = true;
               } else {
                  for(var14 = 0; var14 < 100; ++var14) {
                     if (field573[var14] == var10) {
                        var12 = true;
                        break;
                     }
                  }
               }

               if (!var12) {
                  field573[field631] = var10;
                  field631 = (1 + field631) % 100;
                  var53 = class176.method3147(var4);
                  int var15 = var20 >= 0 ? 43 : 46;
                  class130.method2276(var15, "", var53, var13.field1430);
               }

               var1.field1206 = null;
               return true;
            }

            class333.method5330("" + (var1.field1206 != null ? var1.field1206.field2787 * 1005948575 * -820114081 : -1) + class79.field1140 + (var1.field1214 != null ? var1.field1214.field2787 * 1005948575 * -820114081 : -1) + class79.field1140 + (var1.field1213 != null ? -820114081 * var1.field1213.field2787 * 1005948575 : -1) + class79.field1140 + var1.field1209, (Throwable)null);
            class145.method2449();
         } catch (IOException var18) {
            class175.method3140();
         } catch (Exception var19) {
            var6 = "" + (var1.field1206 != null ? var1.field1206.field2787 * 1005948575 * -820114081 : -1) + class79.field1140 + (var1.field1214 != null ? var1.field1214.field2787 * 1005948575 * -820114081 : -1) + class79.field1140 + (null != var1.field1213 ? var1.field1213.field2787 * 1005948575 * -820114081 : -1) + class79.field1140 + var1.field1209 + class79.field1140 + (class281.field3625 + class20.field140.field1076[0]) + class79.field1140 + (class20.field140.field1077[0] + class78.field1134) + class79.field1140;

            for(var7 = 0; var7 < var1.field1209 && var7 < 50; ++var7) {
               var6 = var6 + var4.field4184[var7] + class79.field1140;
            }

            class333.method5330(var6, var19);
            class145.method2449();
         }

         return true;
      }
   }

   final void method830() {
      class210.method3830();
      if (field688 == null) {
         if (null == field581) {
            int var2 = class20.field149;
            int var3;
            int var4;
            int var5;
            int var6;
            int var9;
            int var15;
            int var16;
            if (field544) {
               if (var2 != 1 && (class311.field3777 || var2 != 4)) {
                  var3 = class20.field142;
                  var4 = class20.field145;
                  if (var3 < class150.field1659 - 10 || var3 > 10 + class150.field1659 + class12.field69 || var4 < class335.field3907 - 10 || var4 > class52.field772 + class335.field3907 + 10) {
                     field544 = false;
                     var5 = class150.field1659;
                     var6 = class335.field3907;
                     var15 = class12.field69;
                     var16 = class52.field772;

                     for(var9 = 0; var9 < field591; ++var9) {
                        if (field622[var9] + field623[var9] > var5 && field623[var9] < var15 + var5 && field626[var9] + field619[var9] > var6 && field626[var9] < var16 + var6) {
                           field617[var9] = true;
                        }
                     }
                  }
               }

               if (var2 == 1 || !class311.field3777 && 4 == var2) {
                  var3 = class150.field1659;
                  var4 = class335.field3907;
                  var5 = class12.field69;
                  var6 = class20.field150;
                  var15 = class20.field151;
                  var16 = -1;

                  int var10;
                  for(var9 = 0; var9 < field545; ++var9) {
                     var10 = 15 * (field545 - 1 - var9) + var4 + 31;
                     if (var6 > var3 && var6 < var5 + var3 && var15 > var10 - 13 && var15 < 3 + var10) {
                        var16 = var9;
                     }
                  }

                  int var11;
                  int var12;
                  if (-1 != var16 && var16 >= 0) {
                     var9 = field678[var16];
                     var10 = field547[var16];
                     var11 = field548[var16];
                     var12 = field549[var16];
                     String var13 = field485[var16];
                     String var14 = field551[var16];
                     class122.method2214(var9, var10, var11, var12, var13, var14, class20.field150, class20.field151);
                  }

                  field544 = false;
                  var9 = class150.field1659;
                  var10 = class335.field3907;
                  var11 = class12.field69;
                  var12 = class52.field772;

                  for(int var19 = 0; var19 < field591; ++var19) {
                     if (field622[var19] + field623[var19] > var9 && field623[var19] < var9 + var11 && field619[var19] + field626[var19] > var10 && field626[var19] < var10 + var12) {
                        field617[var19] = true;
                     }
                  }
               }
            } else {
               var3 = class160.method2842();
               if ((1 == var2 || !class311.field3777 && var2 == 4) && var3 >= 0) {
                  var4 = field548[var3];
                  if (var4 == 39 || 40 == var4 || var4 == 41 || var4 == 42 || var4 == 43 || 33 == var4 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || 1005 == var4) {
                     label279: {
                        var5 = field678[var3];
                        var6 = field547[var3];
                        class249 var7 = class87.method1995(var6);
                        if (!class147.method2464(class241.method4140(var7))) {
                           var9 = class241.method4140(var7);
                           boolean var8 = 0 != (var9 >> 29 & 1);
                           if (!var8) {
                              break label279;
                           }
                        }

                        if (field688 != null && !field520 && field545 > 0 && !this.method932()) {
                           var16 = field404;
                           var9 = field584;
                           class28.method482(class106.field1305, var16, var9);
                           class106.field1305 = null;
                        }

                        field520 = false;
                        field521 = 0;
                        if (field688 != null) {
                           class81.method1869(field688);
                        }

                        field688 = class87.method1995(var6);
                        field516 = var5;
                        field404 = class20.field150;
                        field584 = class20.field151;
                        if (var3 >= 0) {
                           class106.field1305 = new class54();
                           class106.field1305.field791 = field678[var3];
                           class106.field1305.field787 = field547[var3];
                           class106.field1305.field786 = field548[var3];
                           class106.field1305.field789 = field549[var3];
                           class106.field1305.field790 = field485[var3];
                        }

                        class81.method1869(field688);
                        return;
                     }
                  }
               }

               if ((var2 == 1 || !class311.field3777 && 4 == var2) && this.method932()) {
                  var2 = 2;
               }

               if ((var2 == 1 || !class311.field3777 && var2 == 4) && field545 > 0 && var3 >= 0) {
                  var4 = field678[var3];
                  var5 = field547[var3];
                  var6 = field548[var3];
                  var15 = field549[var3];
                  String var17 = field485[var3];
                  String var18 = field551[var3];
                  class122.method2214(var4, var5, var6, var15, var17, var18, class20.field150, class20.field151);
               }

               if (var2 == 2 && field545 > 0) {
                  this.method832(class20.field150, class20.field151);
               }
            }

         }
      }
   }

   final boolean method932() {
      int var2 = class160.method2842();
      return (field528 == 1 && field545 > 2 || class75.method1808(var2)) && !field674[var2];
   }

   final void method832(int var1, int var2) {
      class151.method2522(var1, var2);
      class166.field1925.method3534(class285.field3652, var1, var2, false);
      field544 = true;
   }

   final void method833(boolean var1) {
      int var3 = field568;
      int var4 = class69.field971;
      int var5 = field687;
      if (class251.method4294(var3)) {
         class202.method3691(class249.field3039[var3], -1, var4, var5, var1);
      }

   }

   void method834(class249 var1) {
      class249 var3 = var1.field3001 == -1 ? null : class87.method1995(var1.field3001);
      int var4;
      int var5;
      if (var3 == null) {
         var4 = class69.field971;
         var5 = field687;
      } else {
         var4 = var3.field2973;
         var5 = var3.field2990;
      }

      class287.method4592(var1, var4, var5, false);
      class28.method483(var1, var4, var5);
   }

   final void method835() {
      class81.method1869(field581);
      ++class107.field1319;
      if (field589 && field586) {
         int var2 = class20.field142;
         int var3 = class20.field145;
         var2 -= field583;
         var3 -= field525;
         if (var2 < field587) {
            var2 = field587;
         }

         if (field581.field2973 + var2 > field587 + field582.field2973) {
            var2 = field587 + field582.field2973 - field581.field2973;
         }

         if (var3 < field588) {
            var3 = field588;
         }

         if (field581.field2990 + var3 > field588 + field582.field2990) {
            var3 = field588 + field582.field2990 - field581.field2990;
         }

         int var4 = var2 - field679;
         int var5 = var3 - field677;
         int var6 = field581.field3040;
         if (class107.field1319 > field581.field2957 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
            field592 = true;
         }

         int var7 = var2 - field587 + field582.field3054;
         int var8 = field582.field2968 + (var3 - field588);
         class68 var9;
         if (null != field581.field2995 && field592) {
            var9 = new class68();
            var9.field961 = field581;
            var9.field953 = var7;
            var9.field956 = var8;
            var9.field955 = field581.field2995;
            class95.method2055(var9);
         }

         if (class20.field141 == 0) {
            if (field592) {
               if (field581.field3081 != null) {
                  var9 = new class68();
                  var9.field961 = field581;
                  var9.field953 = var7;
                  var9.field956 = var8;
                  var9.field958 = field585;
                  var9.field955 = field581.field3081;
                  class95.method2055(var9);
               }

               if (null != field585 && class123.method2215(field581) != null) {
                  class229 var11 = class149.method2495(class227.field2662, field453.field1205);
                  var11.field2691.method5994(field581.field2958);
                  var11.field2691.method5984(field585.field3031);
                  var11.field2691.method6077(field581.field3088);
                  var11.field2691.method6077(field585.field3088);
                  var11.field2691.method5984(field581.field3031);
                  var11.field2691.method5934(field585.field2958);
                  field453.method1963(var11);
               }
            } else if (this.method932()) {
               this.method832(field679 + field583, field525 + field677);
            } else if (field545 > 0) {
               int var12 = field583 + field679;
               int var10 = field677 + field525;
               class28.method482(class106.field1305, var12, var10);
               class106.field1305 = null;
            }

            field581 = null;
         }

      } else {
         if (class107.field1319 > 1) {
            field581 = null;
         }

      }
   }

   public class406 method5086() {
      return class20.field140 != null ? class20.field140.field980 : null;
   }
}
