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

public final class client extends class18 implements class317 {
   public static boolean field561;
   public static int field404;
   public static int field679;
   public static int field686;
   public static final class85 field452;
   static boolean field407;
   static boolean field408;
   static boolean field411;
   static boolean field414;
   static boolean field420;
   static boolean field421;
   static boolean field442;
   static boolean field454;
   static boolean field455;
   static boolean field456;
   static boolean field480;
   static boolean field489;
   static boolean field491;
   static boolean field511;
   static boolean field519;
   static boolean field522;
   static boolean field526;
   static boolean field543;
   static boolean field553;
   static boolean field554;
   static boolean field562;
   static boolean field577;
   static boolean field585;
   static boolean field588;
   static boolean field591;
   static boolean field602;
   static boolean field612;
   static boolean field614;
   static boolean field634;
   static boolean field647;
   static boolean[] field508;
   static boolean[] field532;
   static boolean[] field616;
   static boolean[] field617;
   static boolean[] field655;
   static boolean[] field673;
   static byte[] field446;
   static class114[] field636;
   static class123[] field637;
   static class159[] field464;
   static class21[] field653;
   static class246 field597;
   static class248 field514;
   static class248 field573;
   static class248 field579;
   static class248 field580;
   static class248 field581;
   static class248 field584;
   static class248 field687;
   static class285[] field619;
   static class295 field536;
   static class295 field537;
   static class295 field538;
   static class295 field610;
   static class295 field611;
   static class295 field685;
   static class295[][][] field535;
   static class311 field457;
   static class329 field644;
   static class356 field558;
   static class363 field468;
   static class363 field568;
   static class397[] field642;
   static class46 field517;
   static class57 field443;
   static class69[] field523;
   static class77[] field566;
   static class80 field432;
   static class80 field458;
   static class99 field447;
   static int field403;
   static int field405;
   static int field406;
   static int field409;
   static int field410;
   static int field412;
   static int field415;
   static int field417;
   static int field418;
   static int field422;
   static int field423;
   static int field424;
   static int field425;
   static int field426;
   static int field428;
   static int field429;
   static int field431;
   static int field433;
   static int field435;
   static int js5State;
   static int field438;
   static int field439;
   static int field440;
   static int field444;
   static int field450;
   static int field451;
   static int field453;
   static int field459;
   static int field460;
   static int field461;
   static int field462;
   static int field463;
   static int field469;
   static int field470;
   static int field471;
   static int field473;
   static int field475;
   static int field476;
   static int field477;
   static int field478;
   static int field479;
   static int field481;
   static int field482;
   static int field483;
   static int field485;
   static int field486;
   static int field487;
   static int field488;
   static int field490;
   static int field492;
   static int field497;
   static int field500;
   static int field503;
   static int field504;
   static int field505;
   static int field506;
   static int field507;
   static int field509;
   static int field510;
   static int field512;
   static int field513;
   static int field515;
   static int field516;
   static int field518;
   static int field520;
   static int field521;
   static int field524;
   static int field525;
   static int field527;
   static int field528;
   static int field534;
   static int field539;
   static int field544;
   static int field545;
   static int field549;
   static int field551;
   static int field552;
   static int field555;
   static int field556;
   static int field557;
   static int field559;
   static int field560;
   static int field563;
   static int field564;
   static int field567;
   static int field569;
   static int field570;
   static int field571;
   static int field574;
   static int field575;
   static int field576;
   static int field578;
   static int field582;
   static int field583;
   static int field586;
   static int field587;
   static int field589;
   static int field590;
   static int field592;
   static int field594;
   static int field596;
   static int field598;
   static int field600;
   static int field601;
   static int field603;
   static int field604;
   static int field605;
   static int field606;
   static int field607;
   static int field609;
   static int field615;
   static int field620;
   static int field623;
   static int field630;
   static int field632;
   static int field638;
   static int field639;
   static int field643;
   static int field645;
   static int field646;
   static int field648;
   static int field649;
   static int field654;
   static int field656;
   static int field657;
   static int field664;
   static int field668;
   static int field669;
   static int field670;
   static int field671;
   static int field672;
   static int field674;
   static int field675;
   static int field676;
   static int field678;
   static int field681;
   static int field682;
   static int field684;
   static int[] field427;
   static int[] field430;
   static int[] field434;
   static int[] field436;
   static int[] field441;
   static int[] field449;
   static int[] field474;
   static int[] field495;
   static int[] field496;
   static int[] field498;
   static int[] field499;
   static int[] field533;
   static int[] field540;
   static int[] field541;
   static int[] field546;
   static int[] field547;
   static int[] field548;
   static int[] field593;
   static int[] field599;
   static int[] field608;
   static int[] field613;
   static int[] field618;
   static int[] field621;
   static int[] field622;
   static int[] field625;
   static int[] field626;
   static int[] field627;
   static int[] field628;
   static int[] field633;
   static int[] field640;
   static int[] field641;
   static int[] field650;
   static int[] field651;
   static int[] field652;
   static int[] field658;
   static int[] field659;
   static int[] field661;
   static int[] field663;
   static int[] field665;
   static int[] field677;
   static int[] field683;
   static int[][] field501;
   static int[][][] field466;
   static String field465;
   static String field529;
   static String field565;
   static String field629;
   static String[] field484;
   static String[] field502;
   static String[] field531;
   static String[] field550;
   static ArrayList field680;
   static HashMap field494;
   static long field416;
   static long field419;
   static long field624;
   static long field635;
   static long[] field572;
   static short field448;
   static short field472;
   static short field542;
   static short field631;
   static short field660;
   static short field662;
   static short field666;
   static short field667;
   static final class45 field493;
   static final int[] field467;
   static final int[] field530;
   class384 field595;
   class7 field445;

   static {
      field634 = true;
      field404 = 1;
      field405 = 0;
      field406 = 0;
      field561 = false;
      field408 = false;
      field409 = -1;
      field473 = -1;
      field411 = false;
      field412 = 0;
      field414 = true;
      field451 = 0;
      field416 = 1L;
      field417 = -1;
      field418 = -1;
      field419 = -1L;
      field420 = true;
      field421 = false;
      field422 = 0;
      field423 = 0;
      field424 = 0;
      field425 = 0;
      field476 = 0;
      field453 = 0;
      field428 = 0;
      field429 = 0;
      field552 = 0;
      field458 = class80.field1159;
      field432 = class80.field1159;
      field410 = 0;
      js5State = 0;
      field435 = 0;
      field503 = 0;
      field672 = 0;
      field438 = 0;
      field439 = 0;
      field589 = 0;
      field447 = class99.field1267;
      field442 = false;
      field443 = new class57();
      field446 = null;
      field566 = new class77['\u8000'];
      field684 = 0;
      field449 = new int['\u8000'];
      field500 = 0;
      field474 = new int[250];
      field452 = new class85();
      field570 = 0;
      field455 = false;
      field456 = true;
      field457 = new class311();
      field494 = new HashMap();
      field459 = 0;
      field460 = 1;
      field461 = 0;
      field549 = 1;
      field463 = 0;
      field464 = new class159[4];
      field480 = false;
      field466 = new int[4][13][13];
      field467 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field555 = 0;
      field469 = 2301979;
      field470 = 5063219;
      field471 = 3353893;
      field632 = 7759444;
      field454 = false;
      field415 = 0;
      field475 = 128;
      field444 = 0;
      field477 = 0;
      field657 = 0;
      field490 = 0;
      field545 = 0;
      field481 = 0;
      field482 = 50;
      field433 = 0;
      field440 = 0;
      field485 = 0;
      field486 = 12;
      field487 = 6;
      field488 = 0;
      field489 = false;
      field607 = 0;
      field491 = false;
      field492 = 0;
      field649 = 0;
      field578 = 50;
      field495 = new int[field578];
      field496 = new int[field578];
      field441 = new int[field578];
      field498 = new int[field578];
      field499 = new int[field578];
      field661 = new int[field578];
      field663 = new int[field578];
      field502 = new String[field578];
      field501 = new int[104][104];
      field504 = 0;
      field505 = -1 * -286331153;
      field506 = -1;
      field507 = 0;
      field462 = 0;
      field539 = 0;
      field510 = 0;
      field511 = true;
      field512 = 0;
      field513 = 0;
      field515 = 0;
      field403 = 0;
      field583 = 0;
      field518 = 0;
      field519 = false;
      field520 = 0;
      field521 = 0;
      field522 = true;
      field523 = new class69[2048];
      field664 = -1;
      field525 = 0;
      field526 = true;
      field426 = 0;
      field528 = 0;
      field627 = new int[1000];
      field530 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      field531 = new String[8];
      field532 = new boolean[8];
      field533 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field534 = -1;
      field535 = new class295[4][104][104];
      field536 = new class295();
      field537 = new class295();
      field538 = new class295();
      field434 = new int[25];
      field540 = new int[25];
      field541 = new int[25];
      field527 = 0;
      field543 = false;
      field544 = 0;
      field677 = new int[500];
      field546 = new int[500];
      field547 = new int[500];
      field548 = new int[500];
      field484 = new String[500];
      field550 = new String[500];
      field673 = new boolean[500];
      field407 = false;
      field553 = false;
      field554 = false;
      field577 = true;
      field556 = -1;
      field557 = -1;
      field648 = 0;
      field559 = 50;
      field560 = 0;
      field529 = null;
      field562 = false;
      field563 = -1;
      field564 = -1;
      field565 = null;
      field465 = null;
      field567 = -1;
      field568 = new class363(8);
      field569 = 0;
      field483 = -1;
      field571 = 0;
      field654 = 0;
      field573 = null;
      field431 = 0;
      field575 = 0;
      field576 = 0;
      field509 = -1;
      field602 = false;
      field579 = null;
      field580 = null;
      field581 = null;
      field582 = 0;
      field524 = 0;
      field584 = null;
      field585 = false;
      field586 = -1;
      field587 = -1;
      field588 = false;
      field678 = -1;
      field676 = -1;
      field591 = false;
      field592 = 1;
      field593 = new int[32];
      field551 = 0;
      field640 = new int[32];
      field574 = 0;
      field427 = new int[32];
      field598 = 0;
      field599 = new int[32];
      field600 = 0;
      field601 = 0;
      field609 = 0;
      field603 = 0;
      field604 = 0;
      field605 = 0;
      field606 = 0;
      field479 = 0;
      field516 = 0;
      field656 = 0;
      field610 = new class295();
      field611 = new class295();
      field685 = new class295();
      field468 = new class363(512);
      field590 = 0;
      field615 = -2;
      field616 = new boolean[100];
      field617 = new boolean[100];
      field508 = new boolean[100];
      field622 = new int[100];
      field625 = new int[100];
      field621 = new int[100];
      field618 = new int[100];
      field623 = 0;
      field624 = 0L;
      field612 = true;
      field626 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field669 = 0;
      field646 = 0;
      field629 = "";
      field572 = new long[100];
      field630 = 0;
      field450 = 0;
      field633 = new int[128];
      field430 = new int[128];
      field635 = -1L;
      field636 = new class114[1];
      field637 = new class123[1];
      field638 = -1;
      field620 = 0;
      field613 = new int[1000];
      field641 = new int[1000];
      field642 = new class397[1000];
      field643 = 0;
      field596 = 0;
      field645 = 0;
      field639 = -1;
      field647 = false;
      field497 = 0;
      field628 = new int[50];
      field650 = new int[50];
      field651 = new int[50];
      field652 = new int[50];
      field653 = new class21[50];
      field614 = false;
      field655 = new boolean[5];
      field436 = new int[5];
      field608 = new int[5];
      field658 = new int[5];
      field659 = new int[5];
      field660 = 256;
      field631 = 205;
      field662 = 256;
      field448 = 320;
      field472 = 1;
      field542 = 32767;
      field666 = 1;
      field667 = 32767;
      field668 = 0;
      field478 = 0;
      field670 = 0;
      field671 = 0;
      field594 = 0;
      field597 = new class246();
      field674 = -1;
      field675 = -1;
      field558 = new class354();
      field619 = new class285[8];
      field517 = new class46();
      field679 = -1;
      field680 = new ArrayList(10);
      field681 = 0;
      field682 = 0;
      field493 = new class45();
      field683 = new int[50];
      field665 = new int[50];
   }

   public client() {
   }

   void method1212() {
      if (field412 != 1000) {
         long var3 = class86.currentTime();
         int var5 = (int)(var3 - class277.field3596);
         class277.field3596 = var3;
         if (var5 > 200) {
            var5 = 200;
         }

         class277.field3595 += var5;
         boolean var2;
         if (class277.field3605 == 0 && class277.field3606 == 0 && class277.field3603 == 0 && class277.field3598 == 0) {
            var2 = true;
         } else if (class277.field3613 == null) {
            var2 = false;
         } else {
            try {
               label209: {
                  if (class277.field3595 > 30000) {
                     throw new IOException();
                  }

                  class275 var6;
                  class384 var7;
                  while(class277.field3606 < 200 && class277.field3598 > 0) {
                     var6 = (class275)class277.field3597.method6317();
                     var7 = new class384(4);
                     var7.writeByte(1);
                     var7.method6723((int)var6.field3965);
                     class277.field3613.write(var7.payload, 0, 4);
                     class277.field3599.method6318(var6, var6.field3965);
                     --class277.field3598;
                     ++class277.field3606;
                  }

                  while(class277.field3605 < 200 && class277.field3603 > 0) {
                     var6 = (class275)class277.field3601.method5179();
                     var7 = new class384(4);
                     var7.writeByte(0);
                     var7.method6723((int)var6.field3965);
                     class277.field3613.write(var7.payload, 0, 4);
                     var6.method6012();
                     class277.field3610.method6318(var6, var6.field3965);
                     --class277.field3603;
                     ++class277.field3605;
                  }

                  for(int var18 = 0; var18 < 100; ++var18) {
                     int var19 = class277.field3613.available();
                     if (var19 < 0) {
                        throw new IOException();
                     }

                     if (var19 == 0) {
                        break;
                     }

                     class277.field3595 = 0;
                     byte var8 = 0;
                     if (class277.field3594 == null) {
                        var8 = 8;
                     } else if (class277.field3608 == 0) {
                        var8 = 1;
                     }

                     int var9;
                     int var10;
                     int var11;
                     int var13;
                     byte[] var10000;
                     int var10001;
                     class384 var26;
                     if (var8 > 0) {
                        var9 = var8 - class277.field3607.field4181 * -1084587701;
                        if (var9 > var19) {
                           var9 = var19;
                        }

                        class277.field3613.vmethod5856(class277.field3607.payload, class277.field3607.field4181 * -1084587701, var9);
                        if (class277.field3612 != 0) {
                           for(var10 = 0; var10 < var9; ++var10) {
                              var10000 = class277.field3607.payload;
                              var10001 = class277.field3607.field4181 * -1084587701 + var10;
                              var10000[var10001] ^= class277.field3612;
                           }
                        }

                        var26 = class277.field3607;
                        var26.field4181 = (var26.field4181 * -1084587701 + var9) * 99;
                        if (class277.field3607.field4181 * -1084587701 < var8) {
                           break;
                        }

                        if (class277.field3594 == null) {
                           class277.field3607.field4181 = 0;
                           var10 = class277.field3607.method6560();
                           var11 = class277.field3607.method6655();
                           int var12 = class277.field3607.method6560();
                           var13 = class277.field3607.method6784();
                           long var14 = (long)(var11 + (var10 << 16));
                           class275 var16 = (class275)class277.field3599.method6327(var14);
                           class58.field877 = true;
                           if (var16 == null) {
                              var16 = (class275)class277.field3610.method6327(var14);
                              class58.field877 = false;
                           }

                           if (var16 == null) {
                              throw new IOException();
                           }

                           int var17 = var12 == 0 ? 5 : 9;
                           class277.field3594 = var16;
                           class93.field1247 = new class384(var17 + var13 + class277.field3594.field3572);
                           class93.field1247.writeByte(var12);
                           class93.field1247.writeInt(var13);
                           class277.field3608 = 8;
                           class277.field3607.field4181 = 0;
                        } else if (class277.field3608 == 0) {
                           if (class277.field3607.payload[0] == -1) {
                              class277.field3608 = 1;
                              class277.field3607.field4181 = 0;
                           } else {
                              class277.field3594 = null;
                           }
                        }
                     } else {
                        var9 = class93.field1247.payload.length - class277.field3594.field3572;
                        var10 = 512 - class277.field3608;
                        if (var10 > var9 - class93.field1247.field4181 * -1084587701) {
                           var10 = var9 - class93.field1247.field4181 * -1084587701;
                        }

                        if (var10 > var19) {
                           var10 = var19;
                        }

                        class277.field3613.vmethod5856(class93.field1247.payload, class93.field1247.field4181 * -1084587701, var10);
                        if (class277.field3612 != 0) {
                           for(var11 = 0; var11 < var10; ++var11) {
                              var10000 = class93.field1247.payload;
                              var10001 = var11 + class93.field1247.field4181 * -1084587701;
                              var10000[var10001] ^= class277.field3612;
                           }
                        }

                        var26 = class93.field1247;
                        var26.field4181 = (var26.field4181 * -1084587701 + var10) * 99;
                        class277.field3608 += var10;
                        if (var9 == class93.field1247.field4181 * -1084587701) {
                           if (class277.field3594.field3965 == 16711935L) {
                              class277.field3602 = class93.field1247;

                              for(var11 = 0; var11 < 256; ++var11) {
                                 class274 var20 = class277.field3611[var11];
                                 if (var20 != null) {
                                    class277.field3602.field4181 = (var11 * 8 + 5) * 99;
                                    var13 = class277.field3602.method6784();
                                    int var21 = class277.field3602.method6784();
                                    var20.method4881(var13, var21);
                                 }
                              }
                           } else {
                              class277.field3609.reset();
                              class277.field3609.update(class93.field1247.payload, 0, var9);
                              var11 = (int)class277.field3609.getValue();
                              if (var11 != class277.field3594.field3573) {
                                 try {
                                    class277.field3613.vmethod5858();
                                 } catch (Exception var24) {
                                 }

                                 ++class277.field3600;
                                 class277.field3613 = null;
                                 class277.field3612 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                 var2 = false;
                                 break label209;
                              }

                              class277.field3600 = 0;
                              class277.field3604 = 0;
                              class277.field3594.field3576.method4905((int)(class277.field3594.field3965 & 65535L), class93.field1247.payload, (class277.field3594.field3965 & 16711680L) == 16711680L, class58.field877);
                           }

                           class277.field3594.method6014();
                           if (class58.field877) {
                              --class277.field3606;
                           } else {
                              --class277.field3605;
                           }

                           class277.field3608 = 0;
                           class277.field3594 = null;
                           class93.field1247 = null;
                        } else {
                           if (class277.field3608 != 512) {
                              break;
                           }

                           class277.field3608 = 0;
                        }
                     }
                  }

                  var2 = true;
               }
            } catch (IOException var25) {
               try {
                  class277.field3613.vmethod5858();
               } catch (Exception var23) {
               }

               ++class277.field3604;
               class277.field3613 = null;
               var2 = false;
            }
         }

         if (!var2) {
            this.doJS5Cycle();
         }

      }
   }

   public class405 vmethod5612() {
      return class19.field139 != null ? class19.field139.field979 : null;
   }

   void method911() {
      int var2 = class68.field970;
      int var3 = field686;
      if (super.field103 < var2) {
         var2 = super.field103;
      }

      if (super.field97 < var3) {
         var3 = super.field97;
      }

      if (class37.field307 != null) {
         try {
            class14.method155(class58.field873, "resize", new Object[]{class237.method4568()});
         } catch (Throwable var5) {
         }
      }

   }

   protected final void vmethod905() {
      if (class37.field310.method1989()) {
         class37.field310.method1963();
      }

      if (class6.field13 != null) {
         class6.field13.field965 = false;
      }

      class6.field13 = null;
      field452.method2033();
      class226.method4334();
      if (class19.field134 != null) {
         synchronized(class19.field134) {
            class19.field134 = null;
         }
      }

      class12.field78 = null;
      if (class178.field2069 != null) {
         class178.field2069.method454();
      }

      if (class141.field1559 != null) {
         class141.field1559.method454();
      }

      if (class277.field3613 != null) {
         class277.field3613.vmethod5858();
      }

      class248.method4721();
      if (class169.field1991 != null) {
         class169.field1991.method2052();
         class169.field1991 = null;
      }

      try {
         class130.field1476.method6398();

         for(int var4 = 0; var4 < class11.field70; ++var4) {
            class319.field3839[var4].method6398();
         }

         class130.field1478.method6398();
         class130.field1470.method6398();
      } catch (Exception var6) {
      }

   }

   protected final void vmethod1240() {
      int[] var2 = new int[]{20, 260, 10000};
      int[] var3 = new int[]{1000, 100, 500};
      if (var2 != null && var3 != null) {
         class309.field3773 = var2;
         class127.field1459 = new int[var2.length];
         class309.field3774 = new byte[var2.length][][];

         for(int var4 = 0; var4 < class309.field3773.length; ++var4) {
            class309.field3774[var4] = new byte[var3[var4]][];
         }
      } else {
         class309.field3773 = null;
         class127.field1459 = null;
         class309.field3774 = null;
      }

      class169.field1981 = field406 == 0 ? '\uaa4a' : field404 + '\u9c40';
      class4.field6 = field406 == 0 ? 443 : field404 + '\uc350';
      class290.field3678 = class169.field1981;
      class282.field3634 = class247.field2941;
      class243.field2914 = class247.field2943;
      class7.field25 = class247.field2940;
      class208.field2498 = class247.field2942;
      class169.field1991 = new class86();
      this.method200();
      this.method201();
      class12.field78 = this.method198();
      class307.field3765 = new class333(255, class130.field1476, class130.field1478, 500000);
      class37.field307 = class24.method497();
      this.method199();
      class65.method1728(this, class94.field1248);
      if (field406 != 0) {
         field421 = true;
      }

      class164.method3159(class37.field307.field1121);
      class12.field79 = new class48(class51.field760);
   }

   final void method917(boolean var1) {
      int var3 = field567;
      int var4 = class68.field970;
      int var5 = field686;
      if (class250.method4757(var3)) {
         class201.method4095(class248.field3038[var3], -1, var4, var5, var1);
      }

   }

   void error(int var1) {
      class238.field2878 = null;
      class84.js5Socket = null;
      js5State = 0;
      if (class169.field1981 == class290.field3678) {
         class290.field3678 = class4.field6;
      } else {
         class290.field3678 = class169.field1981;
      }

      ++field503;
      if (field503 < 2 || var1 != 7 && var1 != 9) {
         if (field503 >= 2 && var1 == 6) {
            this.js5Error("js5connect_outofdate");
            field412 = 1000;
         } else if (field503 >= 4) {
            if (field412 <= 5) {
               this.js5Error("js5connect");
               field412 = 1000;
            } else {
               field435 = 3000;
            }
         }
      } else if (field412 <= 5) {
         this.js5Error("js5connect_full");
         field412 = 1000;
      } else {
         field435 = 3000;
      }

   }

   final boolean method1024() {
      int var2 = class159.method3135();
      return (field527 == 1 && field544 * -286331153 > 2 || class74.method1863(var2)) && !field673[var2];
   }

   protected final void vmethod899() {
   }

   final boolean method913(class85 var1) {
      class329 var3 = var1.method2036();
      class383 var4 = var1.field1200;
      if (var3 == null) {
         return false;
      } else {
         int var7;
         String var19;
         try {
            int var6;
            if (var1.field1205 == null) {
               if (var1.field1210) {
                  if (!var3.vmethod5862(1)) {
                     return false;
                  }

                  var3.vmethod5856(var1.field1200.payload, 0, 1);
                  var1.field1209 = 0;
                  var1.field1210 = false;
               }

               var4.field4181 = 0;
               if (var4.method6501()) {
                  if (!var3.vmethod5862(1)) {
                     return false;
                  }

                  var3.vmethod5856(var1.field1200.payload, 1, 1);
                  var1.field1209 = 0;
               }

               var1.field1210 = true;
               class229[] var5 = class188.method3672();
               var6 = var4.method6502();
               if (var6 < 0 || var6 >= var5.length) {
                  throw new IOException(var6 + " " + var4.field4181 * -1084587701);
               }

               var1.field1205 = var5[var6];
               var1.field1208 = var1.field1205.field2739;
            }

            if (var1.field1208 == -1) {
               if (!var3.vmethod5862(1)) {
                  return false;
               }

               var1.method2036().vmethod5856(var4.payload, 0, 1);
               var1.field1208 = var4.payload[0] & 255;
            }

            if (var1.field1208 == -2) {
               if (!var3.vmethod5862(2)) {
                  return false;
               }

               var1.method2036().vmethod5856(var4.payload, 0, 2);
               var4.field4181 = 0;
               var1.field1208 = var4.method6655();
            }

            if (!var3.vmethod5862(var1.field1208)) {
               return false;
            }

            var4.field4181 = 0;
            var3.vmethod5856(var4.payload, 0, var1.field1208);
            var1.field1209 = 0;
            field457.method5574();
            var1.field1212 = var1.field1213;
            var1.field1213 = var1.field1211;
            var1.field1211 = var1.field1205;
            boolean var69;
            if (class229.field2720 == var1.field1205) {
               var69 = var4.method6790();
               if (var69) {
                  if (class367.field4127 == null) {
                     class367.field4127 = new class287();
                  }
               } else {
                  class367.field4127 = null;
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2708 == var1.field1205) {
               if (field567 != -1) {
                  class162.method3145(field567, 0);
               }

               var1.field1205 = null;
               return true;
            }

            int var59;
            class248 var68;
            if (class229.field2731 == var1.field1205) {
               var59 = var4.method6607();
               var68 = class86.method2063(var59);

               for(var7 = 0; var7 < var68.field3085.length; ++var7) {
                  var68.field3085[var7] = -1;
                  var68.field3085[var7] = 0;
               }

               class80.method1934(var68);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2729 == var1.field1205) {
               class79.method1920(var4, var1.field1208);
               class154.method2912();
               var1.field1205 = null;
               return true;
            }

            if (class229.field2781 == var1.field1205) {
               field669 = var4.method6776();
               field646 = var4.method6591();
               var1.field1205 = null;
               return true;
            }

            if (class229.field2719 == var1.field1205) {
               for(var59 = 0; var59 < field523.length; ++var59) {
                  if (field523[var59] != null) {
                     field523[var59].field1052 = -1;
                  }
               }

               for(var59 = 0; var59 < field566.length; ++var59) {
                  if (field566[var59] != null) {
                     field566[var59].field1052 = -1;
                  }
               }

               var1.field1205 = null;
               return true;
            }

            boolean var58;
            String var72;
            if (class229.field2740 == var1.field1205) {
               var59 = var4.method6574();
               var58 = var4.method6560() == 1;
               var72 = "";
               boolean var55 = false;
               if (var58) {
                  var72 = var4.method6569();
                  if (class12.field79.method1368(new class405(var72, class51.field760))) {
                     var55 = true;
                  }
               }

               String var53 = var4.method6569();
               if (!var55) {
                  class120.method2408(var59, var72, var53);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2770 == var1.field1205) {
               var59 = var4.method6609();
               var68 = class86.method2063(var59);
               var68.field2949 = 3;
               var68.field3001 = class19.field139.field978.method4661();
               class80.method1934(var68);
               var1.field1205 = null;
               return true;
            }

            int var16;
            byte var18;
            String var25;
            if (class229.field2725 == var1.field1205) {
               var18 = var4.method6561();
               var19 = var4.method6569();
               long var21 = (long)var4.method6655();
               long var23 = (long)var4.method6564();
               class271 var56 = (class271)class250.method4750(class84.method2027(), var4.method6560());
               long var12 = (var21 << 32) + var23;
               boolean var57 = false;
               class123 var15 = null;
               var15 = var18 >= 0 ? field637[var18] : class321.field3844;
               if (var15 == null) {
                  var57 = true;
               } else {
                  var16 = 0;

                  while(true) {
                     if (var16 >= 100) {
                        if (var56.field3547 && class12.field79.method1368(new class405(var19, class51.field760))) {
                           var57 = true;
                        }
                        break;
                     }

                     if (var12 == field572[var16]) {
                        var57 = true;
                        break;
                     }

                     ++var16;
                  }
               }

               if (!var57) {
                  field572[field630] = var12;
                  field630 = (field630 + 1) % 100;
                  var25 = class302.method5434(class175.method3535(var4));
                  int var17 = var18 >= 0 ? 41 : 44;
                  if (var56.field3542 != -1) {
                     class129.method2531(var17, class76.method1877(var56.field3542) + var19, var25, var15.field1429);
                  } else {
                     class129.method2531(var17, var19, var25, var15.field1429);
                  }
               }

               var1.field1205 = null;
               return true;
            }

            int var8;
            int var10;
            int var26;
            int var27;
            if (class229.field2775 == var1.field1205) {
               field614 = true;
               class376.field4165 = var4.method6560();
               class191.field2147 = var4.method6560();
               class329.field3874 = var4.method6655();
               class142.field1577 = var4.method6560();
               class269.field3397 = var4.method6560();
               if (class269.field3397 >= 100) {
                  var59 = class376.field4165 * 128 + 64;
                  var6 = class191.field2147 * 128 + 64;
                  var7 = class122.method2438(var59, var6, class284.field3651) - class329.field3874;
                  var8 = var59 - class64.field933;
                  var26 = var7 - class336.field3923;
                  var10 = var6 - class357.field4011;
                  var27 = (int)Math.sqrt((double)(var8 * var8 + var10 * var10));
                  class116.field1397 = (int)(Math.atan2((double)var26, (double)var27) * 325.949D) & 2047;
                  class117.field1399 = (int)(Math.atan2((double)var8, (double)var10) * -325.949D) & 2047;
                  if (class116.field1397 < 128) {
                     class116.field1397 = 128;
                  }

                  if (class116.field1397 > 383) {
                     class116.field1397 = 383;
                  }
               }

               var1.field1205 = null;
               return true;
            }

            int var14;
            long var28;
            long var30;
            String var35;
            String var49;
            if (class229.field2737 == var1.field1205) {
               var49 = var4.method6569();
               var28 = (long)var4.method6655();
               var30 = (long)var4.method6564();
               class271 var32 = (class271)class250.method4750(class84.method2027(), var4.method6560());
               long var33 = (var28 << 32) + var30;
               boolean var13 = false;

               for(var14 = 0; var14 < 100; ++var14) {
                  if (var33 == field572[var14]) {
                     var13 = true;
                     break;
                  }
               }

               if (class12.field79.method1368(new class405(var49, class51.field760))) {
                  var13 = true;
               }

               if (!var13 && field521 == 0) {
                  field572[field630] = var33;
                  field630 = (field630 + 1) % 100;
                  var35 = class302.method5434(class285.method5089(class175.method3535(var4)));
                  byte var76;
                  if (var32.field3546) {
                     var76 = 7;
                  } else {
                     var76 = 3;
                  }

                  if (var32.field3542 != -1) {
                     class120.method2408(var76, class76.method1877(var32.field3542) + var49, var35);
                  } else {
                     class120.method2408(var76, var49, var35);
                  }
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2762 == var1.field1205) {
               class124.field1440 = class157.method3065(var4.method6560());
               var1.field1205 = null;
               return true;
            }

            if (class229.field2701 == var1.field1205) {
               class12.method114(class227.field2680);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2745 == var1.field1205) {
               class12.method114(class227.field2676);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2699 == var1.field1205) {
               class12.method114(class227.field2678);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2777 == var1.field1205) {
               var49 = var4.method6569();
               var6 = var4.method6589();
               var7 = var4.method6589();
               if (var7 >= 1 && var7 <= 8) {
                  if (var49.equalsIgnoreCase("null")) {
                     var49 = null;
                  }

                  field531[var7 - 1] = var49;
                  field532[var7 - 1] = var6 == 0;
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2748 == var1.field1205) {
               var49 = var4.method6569();
               var19 = class302.method5434(class285.method5089(class175.method3535(var4)));
               class120.method2408(6, var49, var19);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2744 == var1.field1205) {
               field423 = var4.method6560();
               if (field423 == 1) {
                  field424 = var4.method6655();
               }

               if (field423 >= 2 && field423 <= 6) {
                  if (field423 == 2) {
                     field429 = 64;
                     field552 = 64;
                  }

                  if (field423 == 3) {
                     field429 = 0;
                     field552 = 64;
                  }

                  if (field423 == 4) {
                     field429 = 128;
                     field552 = 64;
                  }

                  if (field423 == 5) {
                     field429 = 64;
                     field552 = 0;
                  }

                  if (field423 == 6) {
                     field429 = 64;
                     field552 = 128;
                  }

                  field423 = 2;
                  field476 = var4.method6655();
                  field453 = var4.method6655();
                  field428 = var4.method6560();
               }

               if (field423 == 10) {
                  field425 = var4.method6655();
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2782 == var1.field1205) {
               var49 = var4.method6569();
               Object[] var67 = new Object[var49.length() + 1];

               for(var7 = var49.length() - 1; var7 >= 0; --var7) {
                  if (var49.charAt(var7) == 's') {
                     var67[var7 + 1] = var4.method6569();
                  } else {
                     var67[var7 + 1] = new Integer(var4.method6784());
                  }
               }

               var67[0] = new Integer(var4.method6784());
               class67 var73 = new class67();
               var73.field954 = var67;
               class94.method2123(var73);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2760 == var1.field1205) {
               var18 = var4.method6593();
               var6 = var4.method6688();
               class243.field2911[var6] = var18;
               if (class243.field2910[var6] != var18) {
                  class243.field2910[var6] = var18;
               }

               class45.method881(var6);
               field593[++field551 - 1 & 31] = var6;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2783 == var1.field1205) {
               class57.field858 = var4.method6560();
               class291.field3694 = var4.method6591();

               for(var59 = class291.field3694; var59 < class291.field3694 + 8; ++var59) {
                  for(var6 = class57.field858; var6 < class57.field858 + 8; ++var6) {
                     if (field535[class284.field3651][var59][var6] != null) {
                        field535[class284.field3651][var59][var6] = null;
                        class48.method1425(var59, var6);
                     }
                  }
               }

               for(class70 var51 = (class70)field536.method5202(); var51 != null; var51 = (class70)field536.method5193()) {
                  if (var51.field1015 >= class291.field3694 && var51.field1015 < class291.field3694 + 8 && var51.field1010 >= class57.field858 && var51.field1010 < class57.field858 + 8 && var51.field1017 == class284.field3651) {
                     var51.field1018 = 0;
                  }
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2750 == var1.field1205) {
               var59 = var4.method6784();
               class66 var66 = (class66)field568.method6327((long)var59);
               if (var66 != null) {
                  class161.method3143(var66, true);
               }

               if (field573 != null) {
                  class80.method1934(field573);
                  field573 = null;
               }

               var1.field1205 = null;
               return true;
            }

            class248 var64;
            if (class229.field2763 == var1.field1205) {
               var59 = var4.method6575();
               var6 = var4.method6602();
               var64 = class86.method2063(var59);
               if (var6 != var64.field3004 || var6 == -1) {
                  var64.field3004 = var6;
                  var64.field3093 = 0;
                  var64.field3089 = 0;
                  class80.method1934(var64);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2773 == var1.field1205) {
               byte[] var50 = new byte[var1.field1208];
               var4.method6503(var50, 0, var50.length);
               class384 var65 = new class384(var50);
               var72 = var65.method6569();
               class138.method2628(var72, true, false);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2718 == var1.field1205) {
               class107.method2223();
               field431 = var4.method6560();
               field516 = field592;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2754 == var1.field1205) {
               for(var59 = 0; var59 < class243.field2910.length; ++var59) {
                  if (class243.field2910[var59] != class243.field2911[var59]) {
                     class243.field2910[var59] = class243.field2911[var59];
                     class45.method881(var59);
                     field593[++field551 - 1 & 31] = var59;
                  }
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2735 == var1.field1205) {
               field614 = false;

               for(var59 = 0; var59 < 5; ++var59) {
                  field655[var59] = false;
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2749 == var1.field1205) {
               var59 = var4.method6609();
               var58 = var4.method6776() == 1;
               var64 = class86.method2063(var59);
               if (var58 != var64.field2977) {
                  var64.field2977 = var58;
                  class80.method1934(var64);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2736 == var1.field1205) {
               var59 = var4.method6607();
               var6 = var4.method6688();
               var7 = var6 >> 10 & 31;
               var8 = var6 >> 5 & 31;
               var26 = var6 & 31;
               var10 = (var8 << 11) + (var7 << 19) + (var26 << 3);
               class248 var54 = class86.method2063(var59);
               if (var10 != var54.field2982) {
                  var54.field2982 = var10;
                  class80.method1934(var54);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2702 == var1.field1205) {
               if (class68.field971 != null) {
                  class68.field971.method5638(var4);
               }

               class18.method343();
               var1.field1205 = null;
               return true;
            }

            if (class229.field2767 == var1.field1205) {
               class12.method114(class227.field2677);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2705 == var1.field1205) {
               class291.field3694 = var4.method6589();
               class57.field858 = var4.method6591();
               var1.field1205 = null;
               return true;
            }

            if (class229.field2706 == var1.field1205) {
               class12.field79.method1362(var4, var1.field1208);
               field609 = field592;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2695 == var1.field1205) {
               field645 = var4.method6560();
               var1.field1205 = null;
               return true;
            }

            class248 var75;
            if (class229.field2723 == var1.field1205) {
               var59 = var4.method6784();
               var6 = var4.method6655();
               var7 = var4.method6600();
               var75 = class86.method2063(var59);
               var75.field3013 = var6 + (var7 << 16);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2752 == var1.field1205) {
               var59 = var4.method6784();
               var6 = var4.method6655();
               if (var59 < -70000) {
                  var6 += 32768;
               }

               if (var59 >= 0) {
                  var64 = class86.method2063(var59);
               } else {
                  var64 = null;
               }

               if (var64 != null) {
                  for(var8 = 0; var8 < var64.field3085.length; ++var8) {
                     var64.field3085[var8] = 0;
                     var64.field3086[var8] = 0;
                  }
               }

               class104.method2194(var6);
               var8 = var4.method6655();

               for(var26 = 0; var26 < var8; ++var26) {
                  var10 = var4.method6599();
                  var27 = var4.method6560();
                  if (var27 == 255) {
                     var27 = var4.method6609();
                  }

                  if (var64 != null && var26 < var64.field3085.length) {
                     var64.field3085[var26] = var10;
                     var64.field3086[var26] = var27;
                  }

                  class139.method2645(var6, var26, var10 - 1, var27);
               }

               if (var64 != null) {
                  class80.method1934(var64);
               }

               class107.method2223();
               field640[++field574 - 1 & 31] = var6 & 32767;
               var1.field1205 = null;
               return true;
            }

            class248 var52;
            if (class229.field2747 == var1.field1205) {
               var59 = var4.method6655();
               var6 = var4.method6600();
               var7 = var4.method6599();
               var8 = var4.method6609();
               var52 = class86.method2063(var8);
               if (var6 != var52.field3008 || var7 != var52.field3009 || var59 != var52.field2999) {
                  var52.field3008 = var6;
                  var52.field3009 = var7;
                  var52.field2999 = var59;
                  class80.method1934(var52);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2712 == var1.field1205) {
               var59 = var4.method6560();
               if (var4.method6560() == 0) {
                  field619[var59] = new class285();
                  var4.field4181 += 1782;
               } else {
                  var4.field4181 -= 99;
                  field619[var59] = new class285(var4, false);
               }

               field606 = field592;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2721 == var1.field1205) {
               class107.method2223();
               var59 = var4.method6560();
               var6 = var4.method6607();
               var7 = var4.method6591();
               field541[var59] = var6;
               field434[var59] = var7;
               field540[var59] = 1;

               for(var8 = 0; var8 < 98; ++var8) {
                  if (var6 >= class258.field3167[var8]) {
                     field540[var59] = var8 + 2;
                  }
               }

               field427[++field598 - 1 & 31] = var59;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2757 == var1.field1205) {
               if (var1.field1208 == 0) {
                  class68.field971 = null;
               } else {
                  if (class68.field971 == null) {
                     class68.field971 = new class319(class51.field760, class58.field873);
                  }

                  class68.field971.method5650(var4);
               }

               class18.method343();
               var1.field1205 = null;
               return true;
            }

            if (class229.field2766 == var1.field1205) {
               var59 = var4.method6784();
               var6 = var4.method6655();
               var64 = class86.method2063(var59);
               if (var64.field2949 != 1 || var6 != var64.field3001) {
                  var64.field2949 = 1;
                  var64.field3001 = var6;
                  class80.method1934(var64);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2716 == var1.field1205) {
               var59 = var4.method6560();
               var6 = var4.method6560();
               var7 = var4.method6560();
               var8 = var4.method6560();
               field655[var59] = true;
               field436[var59] = var6;
               field608[var59] = var7;
               field658[var59] = var8;
               field659[var59] = 0;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2707 == var1.field1205) {
               var59 = var4.method6784();
               if (var59 != field488) {
                  field488 = var59;
                  class339.method5964();
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2780 == var1.field1205) {
               class50.method1567();
               var18 = var4.method6561();
               class106 var63 = new class106(var4);
               class114 var71;
               if (var18 >= 0) {
                  var71 = field636[var18];
               } else {
                  var71 = class41.field354;
               }

               var63.method2205(var71);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2778 == var1.field1205) {
               var59 = var4.method6655();
               field567 = var59;
               this.method917(false);
               class311.method5596(var59);
               class112.method2275(field567);

               for(var6 = 0; var6 < 100; ++var6) {
                  field616[var6] = true;
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2755 == var1.field1205) {
               var59 = var4.method6600();
               if (var59 == 65535) {
                  var59 = -1;
               }

               class41.method844(var59);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2697 == var1.field1205) {
               var59 = var4.method6600();
               if (var59 == 65535) {
                  var59 = -1;
               }

               var6 = var4.method6603();
               class87.method2068(var59, var6);
               var1.field1205 = null;
               return true;
            }

            long var39;
            class66 var77;
            if (class229.field2746 == var1.field1205) {
               var59 = var4.field4181 * -1084587701 + var1.field1208;
               var6 = var4.method6655();
               var7 = var4.method6655();
               if (var6 != field567) {
                  field567 = var6;
                  this.method917(false);
                  class311.method5596(field567);
                  class112.method2275(field567);

                  for(var8 = 0; var8 < 100; ++var8) {
                     field616[var8] = true;
                  }
               }

               class66 var11;
               for(; var7-- > 0; var11.field947 = true) {
                  var8 = var4.method6784();
                  var26 = var4.method6655();
                  var10 = var4.method6560();
                  var11 = (class66)field568.method6327((long)var8);
                  if (var11 != null && var26 != var11.field949) {
                     class161.method3143(var11, true);
                     var11 = null;
                  }

                  if (var11 == null) {
                     var11 = class106.method2207(var8, var26, var10);
                  }
               }

               for(var77 = (class66)field568.method6317(); var77 != null; var77 = (class66)field568.method6320()) {
                  if (var77.field947) {
                     var77.field947 = false;
                  } else {
                     class161.method3143(var77, true);
                  }
               }

               field468 = new class363(512);

               while(var4.field4181 * -1084587701 < var59) {
                  var8 = var4.method6784();
                  var26 = var4.method6655();
                  var10 = var4.method6655();
                  var27 = var4.method6784();

                  for(int var78 = var26; var78 <= var10; ++var78) {
                     var39 = (long)var78 + ((long)var8 << 32);
                     field468.method6318(new class352(var27), var39);
                  }
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2765 == var1.field1205) {
               class44.method879(var4.method6569());
               var1.field1205 = null;
               return true;
            }

            if (class229.field2751 == var1.field1205) {
               var59 = var4.method6609();
               var6 = var4.method6784();
               class66 var70 = (class66)field568.method6327((long)var59);
               var77 = (class66)field568.method6327((long)var6);
               if (var77 != null) {
                  class161.method3143(var77, var70 == null || var70.field949 != var77.field949);
               }

               if (var70 != null) {
                  var70.method6014();
                  field568.method6318(var70, (long)var6);
               }

               var52 = class86.method2063(var59);
               if (var52 != null) {
                  class80.method1934(var52);
               }

               var52 = class86.method2063(var6);
               if (var52 != null) {
                  class80.method1934(var52);
                  class80.method1933(class248.field3038[var52.field2957 >>> 16], var52, true);
               }

               if (field567 != -1) {
                  class162.method3145(field567, 1);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2756 == var1.field1205) {
               class152.method2837(true, var4);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2691 == var1.field1205) {
               var59 = var4.method6589();
               var6 = var4.method6599();
               var7 = var4.method6784();
               var77 = (class66)field568.method6327((long)var7);
               if (var77 != null) {
                  class161.method3143(var77, var6 != var77.field949);
               }

               class106.method2207(var7, var6, var59);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2733 == var1.field1205) {
               var59 = var4.method6609();
               var19 = var4.method6569();
               var64 = class86.method2063(var59);
               if (!var19.equals(var64.field3041)) {
                  var64.field3041 = var19;
                  class80.method1934(var64);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2732 == var1.field1205) {
               class118.method2392(var4, var1.field1208);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2694 == var1.field1205) {
               class291.field3694 = var4.method6776();
               class57.field858 = var4.method6776();

               while(var4.field4181 * -1084587701 < var1.field1208) {
                  var59 = var4.method6560();
                  class227 var62 = class214.method4269()[var59];
                  class12.method114(var62);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2726 == var1.field1205) {
               class50.method1567();
               var18 = var4.method6561();
               if (var1.field1208 == 1) {
                  if (var18 >= 0) {
                     field636[var18] = null;
                  } else {
                     class41.field354 = null;
                  }

                  var1.field1205 = null;
                  return true;
               }

               if (var18 >= 0) {
                  field636[var18] = new class114(var4);
               } else {
                  class41.field354 = new class114(var4);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2772 == var1.field1205) {
               var59 = var4.method6655();
               var6 = var4.method6560();
               var7 = var4.method6655();
               class127.method2504(var59, var6, var7);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2727 == var1.field1205) {
               for(var59 = 0; var59 < class281.field3630; ++var59) {
                  class139 var61 = class48.method1426(var59);
                  if (var61 != null) {
                     class243.field2911[var59] = 0;
                     class243.field2910[var59] = 0;
                  }
               }

               class107.method2223();
               field551 += 32;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2743 == var1.field1205) {
               class152.method2837(false, var4);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2717 == var1.field1205) {
               class12.field79.method1372();
               field609 = field592;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2768 == var1.field1205) {
               class43.field371 = null;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2734 == var1.field1205) {
               class12.method114(class227.field2679);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2693 == var1.field1205) {
               class238.method4593(false, var1.field1200);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2776 == var1.field1205) {
               var59 = var4.method6784();
               var6 = var4.method6655();
               if (var59 < -70000) {
                  var6 += 32768;
               }

               if (var59 >= 0) {
                  var64 = class86.method2063(var59);
               } else {
                  var64 = null;
               }

               for(; var4.field4181 * -1084587701 < var1.field1208; class139.method2645(var6, var8, var26 - 1, var10)) {
                  var8 = var4.method6574();
                  var26 = var4.method6655();
                  var10 = 0;
                  if (var26 != 0) {
                     var10 = var4.method6560();
                     if (var10 == 255) {
                        var10 = var4.method6784();
                     }
                  }

                  if (var64 != null && var8 >= 0 && var8 < var64.field3085.length) {
                     var64.field3085[var8] = var26;
                     var64.field3086[var8] = var10;
                  }
               }

               if (var64 != null) {
                  class80.method1934(var64);
               }

               class107.method2223();
               field640[++field574 - 1 & 31] = var6 & 32767;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2764 == var1.field1205) {
               var69 = var4.method6560() == 1;
               if (var69) {
                  class177.field2066 = class86.currentTime() - var4.method6566();
                  class292.field3710 = new class278(var4, true);
               } else {
                  class292.field3710 = null;
               }

               field479 = field592;
               var1.field1205 = null;
               return true;
            }

            long var41;
            if (class229.field2784 == var1.field1205) {
               var49 = var4.method6569();
               var28 = var4.method6566();
               var30 = (long)var4.method6655();
               var41 = (long)var4.method6564();
               class271 var79 = (class271)class250.method4750(class84.method2027(), var4.method6560());
               var39 = (var30 << 32) + var41;
               boolean var74 = false;

               for(var16 = 0; var16 < 100; ++var16) {
                  if (field572[var16] == var39) {
                     var74 = true;
                     break;
                  }
               }

               if (var79.field3547 && class12.field79.method1368(new class405(var49, class51.field760))) {
                  var74 = true;
               }

               if (!var74 && field521 == 0) {
                  field572[field630] = var39;
                  field630 = (field630 + 1) % 100;
                  var25 = class302.method5434(class285.method5089(class175.method3535(var4)));
                  if (var79.field3542 != -1) {
                     class129.method2531(9, class76.method1877(var79.field3542) + var49, var25, class83.method1996(var28));
                  } else {
                     class129.method2531(9, var49, var25, class83.method1996(var28));
                  }
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2758 == var1.field1205) {
               field422 = var4.method6688() * 30;
               field516 = field592;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2741 == var1.field1205) {
               var59 = var4.method6560();
               class177.method3573(var59);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2715 == var1.field1205) {
               field605 = field592;
               var18 = var4.method6561();
               if (var1.field1208 == 1) {
                  if (var18 >= 0) {
                     field637[var18] = null;
                  } else {
                     class321.field3844 = null;
                  }

                  var1.field1205 = null;
                  return true;
               }

               if (var18 >= 0) {
                  field637[var18] = new class123(var4);
               } else {
                  class321.field3844 = new class123(var4);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2711 == var1.field1205) {
               class12.method114(class227.field2683);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2704 == var1.field1205) {
               var59 = var4.method6599();
               if (var59 == 65535) {
                  var59 = -1;
               }

               var6 = var4.method6784();
               var7 = var4.method6600();
               if (var7 == 65535) {
                  var7 = -1;
               }

               var8 = var4.method6609();

               for(var26 = var59; var26 <= var7; ++var26) {
                  var41 = ((long)var8 << 32) + (long)var26;
                  class353 var43 = field468.method6327(var41);
                  if (var43 != null) {
                     var43.method6014();
                  }

                  field468.method6318(new class352(var6), var41);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2728 == var1.field1205) {
               class12.field79.field712.method5602(var4, var1.field1208);
               class252.method4765();
               field609 = field592;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2692 == var1.field1205) {
               class144.method2732();
               var1.field1205 = null;
               return false;
            }

            if (class229.field2738 == var1.field1205) {
               var59 = var4.method6607();
               var6 = var4.method6655();
               if (var6 == 65535) {
                  var6 = -1;
               }

               var7 = var4.method6607();
               var75 = class86.method2063(var7);
               class156 var9;
               if (!var75.field2992) {
                  if (var6 == -1) {
                     var75.field2949 = 0;
                     var1.field1205 = null;
                     return true;
                  }

                  var9 = class10.method105(var6);
                  var75.field2949 = 4;
                  var75.field3001 = var6;
                  var75.field3008 = var9.field1800;
                  var75.field3009 = var9.field1821;
                  var75.field2999 = var9.field1799 * 100 / var59;
                  class80.method1934(var75);
               } else {
                  var75.field3087 = var6;
                  var75.field3088 = var59;
                  var9 = class10.method105(var6);
                  var75.field3008 = var9.field1800;
                  var75.field3009 = var9.field1821;
                  var75.field3010 = var9.field1802;
                  var75.field3006 = var9.field1803;
                  var75.field2959 = var9.field1804;
                  var75.field2999 = var9.field1799;
                  if (var9.field1805 == 1) {
                     var75.field2990 = 1;
                  } else {
                     var75.field2990 = 2;
                  }

                  if (var75.field3012 > 0) {
                     var75.field2999 = var75.field2999 * 32 / var75.field3012;
                  } else if (var75.field2968 > 0) {
                     var75.field2999 = var75.field2999 * 32 / var75.field2968;
                  }

                  class80.method1934(var75);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2700 == var1.field1205) {
               var59 = var4.method6563();
               var6 = var4.method6601();
               var7 = var4.method6607();
               var75 = class86.method2063(var7);
               if (var6 != var75.field2946 || var59 != var75.field3018 || var75.field3062 != 0 || var75.field2963 != 0) {
                  var75.field2946 = var6;
                  var75.field3018 = var59;
                  var75.field3062 = 0;
                  var75.field2963 = 0;
                  class80.method1934(var75);
                  this.method918(var75);
                  if (var75.field2976 == 0) {
                     class80.method1933(class248.field3038[var7 >> 16], var75, false);
                  }
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2761 == var1.field1205) {
               var59 = var4.method6655();
               var6 = var4.method6607();
               class243.field2911[var59] = var6;
               if (class243.field2910[var59] != var6) {
                  class243.field2910[var59] = var6;
               }

               class45.method881(var59);
               field593[++field551 - 1 & 31] = var59;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2703 == var1.field1205) {
               field614 = true;
               class107.field1323 = var4.method6560();
               class154.field1713 = var4.method6560();
               class6.field14 = var4.method6655();
               class96.field1265 = var4.method6560();
               class216.field2545 = var4.method6560();
               if (class216.field2545 >= 100) {
                  class64.field933 = class107.field1323 * 128 + 64;
                  class357.field4011 = class154.field1713 * 128 + 64;
                  class336.field3923 = class122.method2438(class64.field933, class357.field4011, class284.field3651) - class6.field14;
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2779 == var1.field1205) {
               class12.method114(class227.field2674);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2724 == var1.field1205) {
               var59 = var4.method6784();
               var6 = var4.method6784();
               var7 = class263.method4823();
               class228 var37 = class148.method2788(class226.field2595, field452.field1204);
               var37.field2690.method6588(class18.field119);
               var37.field2690.method6679(var7);
               var37.field2690.method6606(var59);
               var37.field2690.method6584(var6);
               field452.method2031(var37);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2714 == var1.field1205) {
               var59 = var4.method6655();
               class202.method4096(var59);
               field640[++field574 - 1 & 31] = var59 & 32767;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2710 == var1.field1205) {
               if (class43.field371 == null) {
                  class43.field371 = new class339(class286.field3663);
               }

               class392 var48 = class286.field3663.method5981(var4);
               class43.field371.field3935.vmethod6337(var48.field4240, var48.field4241);
               field599[++field600 - 1 & 31] = var48.field4240;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2771 == var1.field1205) {
               class12.method114(class227.field2675);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2698 == var1.field1205) {
               var4.field4181 += 2772;
               if (var4.method6585()) {
                  class62.method1708(var4, var4.field4181 * -1084587701 - 28);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2696 == var1.field1205) {
               class238.method4593(true, var1.field1200);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2759 == var1.field1205) {
               var59 = var4.method6609();
               var6 = var4.method6688();
               var64 = class86.method2063(var59);
               if (var64 != null && var64.field2976 == 0) {
                  if (var6 > var64.field3090 - var64.field2989) {
                     var6 = var64.field3090 - var64.field2989;
                  }

                  if (var6 < 0) {
                     var6 = 0;
                  }

                  if (var6 != var64.field2967) {
                     var64.field2967 = var6;
                     class80.method1934(var64);
                  }
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2709 == var1.field1205) {
               class107.method2223();
               field575 = var4.method6563();
               field516 = field592;
               var1.field1205 = null;
               return true;
            }

            if (class229.field2769 == var1.field1205) {
               class12.method114(class227.field2681);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2753 == var1.field1205) {
               var59 = var4.method6688();
               var6 = var4.method6609();
               var64 = class86.method2063(var6);
               if (var64.field2949 != 2 || var59 != var64.field3001) {
                  var64.field2949 = 2;
                  var64.field3001 = var59;
                  class80.method1934(var64);
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2713 == var1.field1205) {
               class47 var47 = new class47();
               var47.field700 = var4.method6569();
               var47.field696 = var4.method6655();
               var6 = var4.method6784();
               var47.field699 = var6;
               class16.method163(45);
               var3.vmethod5858();
               var3 = null;
               class156.method3010(var47);
               var1.field1205 = null;
               return false;
            }

            if (class229.field2774 == var1.field1205) {
               class12.method114(class227.field2682);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2730 == var1.field1205) {
               var59 = var4.method6560();
               class249.method4749(var59);
               var1.field1205 = null;
               return false;
            }

            if (class229.field2785 == var1.field1205) {
               field643 = var4.method6560();
               if (field643 == 255) {
                  field643 = 0;
               }

               field596 = var4.method6560();
               if (field596 == 255) {
                  field596 = 0;
               }

               var1.field1205 = null;
               return true;
            }

            if (class229.field2742 == var1.field1205) {
               class43.field371 = new class339(class286.field3663);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2787 == var1.field1205) {
               field605 = field592;
               var18 = var4.method6561();
               class120 var60 = new class120(var4);
               class123 var20;
               if (var18 >= 0) {
                  var20 = field637[var18];
               } else {
                  var20 = class321.field3844;
               }

               var60.method2407(var20);
               var1.field1205 = null;
               return true;
            }

            if (class229.field2722 == var1.field1205) {
               var18 = var4.method6561();
               var28 = (long)var4.method6655();
               var30 = (long)var4.method6564();
               var41 = var30 + (var28 << 32);
               boolean var38 = false;
               class123 var44 = var18 >= 0 ? field637[var18] : class321.field3844;
               if (var44 == null) {
                  var38 = true;
               } else {
                  for(var14 = 0; var14 < 100; ++var14) {
                     if (field572[var14] == var41) {
                        var38 = true;
                        break;
                     }
                  }
               }

               if (!var38) {
                  field572[field630] = var41;
                  field630 = (field630 + 1) % 100;
                  var35 = class175.method3535(var4);
                  int var36 = var18 >= 0 ? 43 : 46;
                  class129.method2531(var36, "", var35, var44.field1429);
               }

               var1.field1205 = null;
               return true;
            }

            class332.method5902("" + (var1.field1205 != null ? var1.field1205.field2786 : -1) + "," + (var1.field1213 != null ? var1.field1213.field2786 : -1) + "," + (var1.field1212 != null ? var1.field1212.field2786 : -1) + "," + var1.field1208, (Throwable)null);
            class144.method2732();
         } catch (IOException var45) {
            class174.method3507();
         } catch (Exception var46) {
            var19 = "" + (var1.field1205 != null ? var1.field1205.field2786 : -1) + "," + (var1.field1213 != null ? var1.field1213.field2786 : -1) + "," + (var1.field1212 != null ? var1.field1212.field2786 : -1) + "," + var1.field1208 + "," + (class19.field139.field1075[0] + class280.field3624) + "," + (class19.field139.field1076[0] + class77.field1133) + ",";

            for(var7 = 0; var7 < var1.field1208 && var7 < 50; ++var7) {
               var19 = var19 + var4.payload[var7] + ",";
            }

            class332.method5902(var19, var46);
            class144.method2732();
         }

         return true;
      }
   }

   protected final void vmethod903() {
      ++field451;
      this.method1212();
      class268.method4847();

      int var2;
      try {
         if (class234.field2818 == 1) {
            var2 = class234.field2815.method4401();
            if (var2 > 0 && class234.field2815.method4410()) {
               var2 -= class123.field1438;
               if (var2 < 0) {
                  var2 = 0;
               }

               class234.field2815.method4400(var2);
            } else {
               class234.field2815.method4406();
               class234.field2815.method4404();
               if (class234.field2819 != null) {
                  class234.field2818 = 2;
               } else {
                  class234.field2818 = 0;
               }

               class180.field2079 = null;
               class142.field1575 = null;
            }
         }
      } catch (Exception var67) {
         var67.printStackTrace();
         class234.field2815.method4406();
         class234.field2818 = 0;
         class180.field2079 = null;
         class142.field1575 = null;
         class234.field2819 = null;
      }

      class262.method4817();
      int var3;
      synchronized(class10.field58) {
         ++class10.field60;
         class10.field57 = class10.field59;
         class10.field35 = 0;
         class10.field64 = 0;
         Arrays.fill(class10.field46, false);
         Arrays.fill(class10.field38, false);
         if (class10.field50 < 0) {
            Arrays.fill(class10.field45, false);
            class10.field50 = class10.field49;
         } else {
            while(class10.field50 != class10.field49) {
               var3 = class10.field48[class10.field49];
               class10.field49 = class10.field49 + 1 & 127;
               if (var3 < 0) {
                  var3 = ~var3;
                  if (class10.field45[var3]) {
                     class10.field45[var3] = false;
                     class10.field38[var3] = true;
                     class10.field55[class10.field64] = var3;
                     ++class10.field64;
                  }
               } else {
                  if (!class10.field45[var3] && class10.field35 < class10.field53.length - 1) {
                     class10.field46[var3] = true;
                     class10.field53[++class10.field35 - 1] = var3;
                  }

                  class10.field45[var3] = true;
               }
            }
         }

         if (class10.field35 > 0) {
            class10.field60 = 0;
         }

         class10.field59 = class10.field52;
      }

      synchronized(class19.field134) {
         class19.field140 = class19.field142;
         class19.field141 = class19.field137;
         class19.field144 = class19.field138;
         class19.field143 = class19.field132;
         class19.field148 = class19.field153;
         class19.field149 = class19.field135;
         class19.field150 = class19.field146;
         class19.field151 = class19.field147;
         class19.field153 = 0;
      }

      if (class12.field78 != null) {
         var2 = class12.field78.vmethod2550();
         field656 = var2;
      }

      if (field412 == 0) {
         class185.method3644();
         class84.field1198.vmethod2605();

         for(var2 = 0; var2 < 32; ++var2) {
            class18.field104[var2] = 0L;
         }

         for(var2 = 0; var2 < 32; ++var2) {
            class18.field111[var2] = 0L;
         }

         class258.field3166 = 0;
      } else if (field412 == 5) {
         class155.method2938(this);
         class185.method3644();
         class84.field1198.vmethod2605();

         for(var2 = 0; var2 < 32; ++var2) {
            class18.field104[var2] = 0L;
         }

         for(var2 = 0; var2 < 32; ++var2) {
            class18.field111[var2] = 0L;
         }

         class258.field3166 = 0;
      } else if (field412 != 10 && field412 != 11) {
         if (field412 == 20) {
            class155.method2938(this);
            this.method1175();
         } else if (field412 == 25) {
            class231.method4358(false);
            field459 = 0;
            boolean var71 = true;

            for(var3 = 0; var3 < class226.field2672.length; ++var3) {
               if (class250.field3109[var3] != -1 && class226.field2672[var3] == null) {
                  class226.field2672[var3] = class198.field2276.method4920(class250.field3109[var3], 0);
                  if (class226.field2672[var3] == null) {
                     var71 = false;
                     ++field459;
                  }
               }

               if (class96.field1262[var3] != -1 && class355.field4010[var3] == null) {
                  class355.field4010[var3] = class198.field2276.method4921(class96.field1262[var3], 0, class43.field369[var3]);
                  if (class355.field4010[var3] == null) {
                     var71 = false;
                     ++field459;
                  }
               }
            }

            if (!var71) {
               field463 = 1;
            } else {
               field461 = 0;
               var71 = true;

               int var6;
               class384 var10;
               int var11;
               int var12;
               int var13;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var49;
               for(var3 = 0; var3 < class226.field2672.length; ++var3) {
                  byte[] var4 = class355.field4010[var3];
                  if (var4 != null) {
                     var49 = (class234.field2820[var3] >> 8) * 64 - class280.field3624;
                     var6 = (class234.field2820[var3] & 255) * 64 - class77.field1133;
                     if (field480) {
                        var49 = 10;
                        var6 = 10;
                     }

                     boolean var9 = true;
                     var10 = new class384(var4);
                     var11 = -1;

                     label1153:
                     while(true) {
                        var12 = var10.method6783();
                        if (var12 == 0) {
                           var71 &= var9;
                           break;
                        }

                        var11 += var12;
                        var13 = 0;
                        boolean var14 = false;

                        while(true) {
                           while(!var14) {
                              var15 = var10.method6574();
                              if (var15 == 0) {
                                 continue label1153;
                              }

                              var13 += var15 - 1;
                              var16 = var13 & 63;
                              var17 = var13 >> 6 & 63;
                              var18 = var10.method6560() >> 2;
                              var19 = var17 + var49;
                              var20 = var16 + var6;
                              if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                                 class155 var21 = class123.method2465(var11);
                                 if (var18 != 22 || !field408 || var21.field1753 != 0 || var21.field1751 == 1 || var21.field1758) {
                                    if (!var21.method2925()) {
                                       ++field461;
                                       var9 = false;
                                    }

                                    var14 = true;
                                 }
                              }
                           }

                           var15 = var10.method6574();
                           if (var15 == 0) {
                              break;
                           }

                           var10.method6560();
                        }
                     }
                  }
               }

               if (!var71) {
                  field463 = 2;
               } else {
                  if (field463 != 0) {
                     class11.method112("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
                  }

                  class262.method4817();
                  class165.field1924.method4062();

                  for(var3 = 0; var3 < 4; ++var3) {
                     field464[var3].method3101();
                  }

                  int var50;
                  for(var3 = 0; var3 < 4; ++var3) {
                     for(var50 = 0; var50 < 104; ++var50) {
                        for(var49 = 0; var49 < 104; ++var49) {
                           class61.field900[var3][var50][var49] = 0;
                        }
                     }
                  }

                  class262.method4817();
                  class61.field901 = 99;
                  class339.field3936 = new byte[4][104][104];
                  class60.field894 = new byte[4][104][104];
                  class61.field915 = new byte[4][104][104];
                  class61.field909 = new byte[4][104][104];
                  class163.field1914 = new int[4][105][105];
                  class250.field3113 = new byte[4][105][105];
                  class61.field904 = new int[105][105];
                  class53.field787 = new int[104];
                  class61.field902 = new int[104];
                  class256.field3137 = new int[104];
                  class337.field3925 = new int[104];
                  class80.field1161 = new int[104];
                  var3 = class226.field2672.length;

                  for(class49 var68 = (class49)class49.field719.method5202(); var68 != null; var68 = (class49)class49.field719.method5193()) {
                     if (var68.field726 != null) {
                        class81.field1162.method384(var68.field726);
                        var68.field726 = null;
                     }

                     if (var68.field724 != null) {
                        class81.field1162.method384(var68.field724);
                        var68.field724 = null;
                     }
                  }

                  class49.field719.method5186();
                  class231.method4358(true);
                  int var7;
                  int var22;
                  int var23;
                  int var54;
                  int var74;
                  if (!field480) {
                     byte[] var51;
                     for(var50 = 0; var50 < var3; ++var50) {
                        var49 = (class234.field2820[var50] >> 8) * 64 - class280.field3624;
                        var6 = (class234.field2820[var50] & 255) * 64 - class77.field1133;
                        var51 = class226.field2672[var50];
                        if (var51 != null) {
                           class262.method4817();
                           class56.method1632(var51, var49, var6, class19.field136 * 8 - 48, class7.field26 * 8 - 48, field464);
                        }
                     }

                     for(var50 = 0; var50 < var3; ++var50) {
                        var49 = (class234.field2820[var50] >> 8) * 64 - class280.field3624;
                        var6 = (class234.field2820[var50] & 255) * 64 - class77.field1133;
                        var51 = class226.field2672[var50];
                        if (var51 == null && class7.field26 < 800) {
                           class262.method4817();
                           class165.method3189(var49, var6, 64, 64);
                        }
                     }

                     class231.method4358(true);

                     for(var50 = 0; var50 < var3; ++var50) {
                        byte[] var5 = class355.field4010[var50];
                        if (var5 != null) {
                           var6 = (class234.field2820[var50] >> 8) * 64 - class280.field3624;
                           var7 = (class234.field2820[var50] & 255) * 64 - class77.field1133;
                           class262.method4817();
                           class199 var52 = class165.field1924;
                           class159[] var53 = field464;
                           var10 = new class384(var5);
                           var11 = -1;

                           while(true) {
                              var12 = var10.method6783();
                              if (var12 == 0) {
                                 break;
                              }

                              var11 += var12;
                              var13 = 0;

                              while(true) {
                                 var74 = var10.method6574();
                                 if (var74 == 0) {
                                    break;
                                 }

                                 var13 += var74 - 1;
                                 var15 = var13 & 63;
                                 var16 = var13 >> 6 & 63;
                                 var17 = var13 >> 12;
                                 var18 = var10.method6560();
                                 var19 = var18 >> 2;
                                 var20 = var18 & 3;
                                 var54 = var16 + var6;
                                 var22 = var15 + var7;
                                 if (var54 > 0 && var22 > 0 && var54 < 103 && var22 < 103) {
                                    var23 = var17;
                                    if ((class61.field900[1][var54][var22] & 2) == 2) {
                                       var23 = var17 - 1;
                                    }

                                    class159 var24 = null;
                                    if (var23 >= 0) {
                                       var24 = var53[var23];
                                    }

                                    method1314(var17, var54, var22, var11, var20, var19, var52, var24);
                                 }
                              }
                           }
                        }
                     }
                  }

                  int var8;
                  int var55;
                  int var73;
                  if (field480) {
                     var50 = 0;

                     label1052:
                     while(true) {
                        if (var50 >= 4) {
                           for(var50 = 0; var50 < 13; ++var50) {
                              for(var49 = 0; var49 < 13; ++var49) {
                                 var6 = field466[0][var50][var49];
                                 if (var6 == -1) {
                                    class165.method3189(var50 * 8, var49 * 8, 8, 8);
                                 }
                              }
                           }

                           class231.method4358(true);
                           var50 = 0;

                           while(true) {
                              if (var50 >= 4) {
                                 break label1052;
                              }

                              class262.method4817();

                              for(var49 = 0; var49 < 13; ++var49) {
                                 for(var6 = 0; var6 < 13; ++var6) {
                                    var7 = field466[var50][var49][var6];
                                    if (var7 != -1) {
                                       var8 = var7 >> 24 & 3;
                                       var73 = var7 >> 1 & 3;
                                       var55 = var7 >> 14 & 1023;
                                       var11 = var7 >> 3 & 2047;
                                       var12 = (var55 / 8 << 8) + var11 / 8;

                                       for(var13 = 0; var13 < class234.field2820.length; ++var13) {
                                          if (class234.field2820[var13] == var12 && class355.field4010[var13] != null) {
                                             class137.method2615(class355.field4010[var13], var50, var49 * 8, var6 * 8, var8, (var55 & 7) * 8, (var11 & 7) * 8, var73, class165.field1924, field464);
                                             break;
                                          }
                                       }
                                    }
                                 }
                              }

                              ++var50;
                           }
                        }

                        class262.method4817();

                        for(var49 = 0; var49 < 13; ++var49) {
                           for(var6 = 0; var6 < 13; ++var6) {
                              boolean var72 = false;
                              var8 = field466[var50][var49][var6];
                              if (var8 != -1) {
                                 var73 = var8 >> 24 & 3;
                                 var55 = var8 >> 1 & 3;
                                 var11 = var8 >> 14 & 1023;
                                 var12 = var8 >> 3 & 2047;
                                 var13 = (var11 / 8 << 8) + var12 / 8;

                                 for(var74 = 0; var74 < class234.field2820.length; ++var74) {
                                    if (class234.field2820[var74] == var13 && class226.field2672[var74] != null) {
                                       class168.method3398(class226.field2672[var74], var50, var49 * 8, var6 * 8, var73, (var11 & 7) * 8, (var12 & 7) * 8, var55, field464);
                                       var72 = true;
                                       break;
                                    }
                                 }
                              }

                              if (!var72) {
                                 class291.method5155(var50, var49 * 8, var6 * 8);
                              }
                           }
                        }

                        ++var50;
                     }
                  }

                  class231.method4358(true);
                  class262.method4817();
                  class199 var69 = class165.field1924;
                  class159[] var70 = field464;

                  for(var6 = 0; var6 < 4; ++var6) {
                     for(var7 = 0; var7 < 104; ++var7) {
                        for(var8 = 0; var8 < 104; ++var8) {
                           if ((class61.field900[var6][var7][var8] & 1) == 1) {
                              var73 = var6;
                              if ((class61.field900[1][var7][var8] & 2) == 2) {
                                 var73 = var6 - 1;
                              }

                              if (var73 >= 0) {
                                 var70[var73].method3100(var7, var8);
                              }
                           }
                        }
                     }
                  }

                  class61.field913 += (int)(Math.random() * 5.0D) - 2;
                  if (class61.field913 < -8) {
                     class61.field913 = -8;
                  }

                  if (class61.field913 > 8) {
                     class61.field913 = 8;
                  }

                  class61.field899 += (int)(Math.random() * 5.0D) - 2;
                  if (class61.field899 < -16) {
                     class61.field899 = -16;
                  }

                  if (class61.field899 > 16) {
                     class61.field899 = 16;
                  }

                  int[] var10000;
                  for(var6 = 0; var6 < 4; ++var6) {
                     byte[][] var79 = class250.field3113[var6];
                     var13 = (int)Math.sqrt(5100.0D);
                     var74 = var13 * 768 >> 8;

                     int var56;
                     for(var15 = 1; var15 < 103; ++var15) {
                        for(var16 = 1; var16 < 103; ++var16) {
                           var17 = class61.field910[var6][var16 + 1][var15] - class61.field910[var6][var16 - 1][var15];
                           var18 = class61.field910[var6][var16][var15 + 1] - class61.field910[var6][var16][var15 - 1];
                           var19 = (int)Math.sqrt((double)(var18 * var18 + var17 * var17 + 65536));
                           var20 = (var17 << 8) / var19;
                           var54 = 65536 / var19;
                           var22 = (var18 << 8) / var19;
                           var23 = (var22 * -50 + var20 * -50 + var54 * -10) / var74 + 96;
                           var56 = (var79[var16 - 1][var15] >> 2) + (var79[var16][var15 - 1] >> 2) + (var79[var16 + 1][var15] >> 3) + (var79[var16][var15 + 1] >> 3) + (var79[var16][var15] >> 1);
                           class61.field904[var16][var15] = var23 - var56;
                        }
                     }

                     for(var15 = 0; var15 < 104; ++var15) {
                        class53.field787[var15] = 0;
                        class61.field902[var15] = 0;
                        class256.field3137[var15] = 0;
                        class337.field3925[var15] = 0;
                        class80.field1161[var15] = 0;
                     }

                     for(var15 = -5; var15 < 109; ++var15) {
                        for(var16 = 0; var16 < 104; ++var16) {
                           var17 = var15 + 5;
                           int var10002;
                           if (var17 >= 0 && var17 < 104) {
                              var18 = class339.field3936[var6][var17][var16] & 255;
                              if (var18 > 0) {
                                 var20 = var18 - 1;
                                 class150 var75 = (class150)class150.field1679.method4306((long)var20);
                                 class150 var57;
                                 if (var75 != null) {
                                    var57 = var75;
                                 } else {
                                    byte[] var58 = class150.field1682.method4920(1, var20);
                                    var75 = new class150();
                                    if (var58 != null) {
                                       var75.method2809(new class384(var58), var20);
                                    }

                                    var75.method2808();
                                    class150.field1679.method4308(var75, (long)var20);
                                    var57 = var75;
                                 }

                                 var10000 = class53.field787;
                                 var10000[var16] += var57.field1681;
                                 var10000 = class61.field902;
                                 var10000[var16] += var57.field1685;
                                 var10000 = class256.field3137;
                                 var10000[var16] += var57.field1683;
                                 var10000 = class337.field3925;
                                 var10000[var16] += var57.field1684;
                                 var10002 = class80.field1161[var16]++;
                              }
                           }

                           var18 = var15 - 5;
                           if (var18 >= 0 && var18 < 104) {
                              var19 = class339.field3936[var6][var18][var16] & 255;
                              if (var19 > 0) {
                                 var54 = var19 - 1;
                                 class150 var81 = (class150)class150.field1679.method4306((long)var54);
                                 class150 var59;
                                 if (var81 != null) {
                                    var59 = var81;
                                 } else {
                                    byte[] var60 = class150.field1682.method4920(1, var54);
                                    var81 = new class150();
                                    if (var60 != null) {
                                       var81.method2809(new class384(var60), var54);
                                    }

                                    var81.method2808();
                                    class150.field1679.method4308(var81, (long)var54);
                                    var59 = var81;
                                 }

                                 var10000 = class53.field787;
                                 var10000[var16] -= var59.field1681;
                                 var10000 = class61.field902;
                                 var10000[var16] -= var59.field1685;
                                 var10000 = class256.field3137;
                                 var10000[var16] -= var59.field1683;
                                 var10000 = class337.field3925;
                                 var10000[var16] -= var59.field1684;
                                 var10002 = class80.field1161[var16]--;
                              }
                           }
                        }

                        if (var15 >= 1 && var15 < 103) {
                           var16 = 0;
                           var17 = 0;
                           var18 = 0;
                           var19 = 0;
                           var20 = 0;

                           for(var54 = -5; var54 < 109; ++var54) {
                              var22 = var54 + 5;
                              if (var22 >= 0 && var22 < 104) {
                                 var16 += class53.field787[var22];
                                 var17 += class61.field902[var22];
                                 var18 += class256.field3137[var22];
                                 var19 += class337.field3925[var22];
                                 var20 += class80.field1161[var22];
                              }

                              var23 = var54 - 5;
                              if (var23 >= 0 && var23 < 104) {
                                 var16 -= class53.field787[var23];
                                 var17 -= class61.field902[var23];
                                 var18 -= class256.field3137[var23];
                                 var19 -= class337.field3925[var23];
                                 var20 -= class80.field1161[var23];
                              }

                              if (var54 >= 1 && var54 < 103 && (!field408 || (class61.field900[0][var15][var54] & 2) != 0 || (class61.field900[var6][var15][var54] & 16) == 0)) {
                                 if (var6 < class61.field901) {
                                    class61.field901 = var6;
                                 }

                                 var56 = class339.field3936[var6][var15][var54] & 255;
                                 int var25 = class60.field894[var6][var15][var54] & 255;
                                 if (var56 > 0 || var25 > 0) {
                                    int var26 = class61.field910[var6][var15][var54];
                                    int var27 = class61.field910[var6][var15 + 1][var54];
                                    int var28 = class61.field910[var6][var15 + 1][var54 + 1];
                                    int var29 = class61.field910[var6][var15][var54 + 1];
                                    int var30 = class61.field904[var15][var54];
                                    int var31 = class61.field904[var15 + 1][var54];
                                    int var32 = class61.field904[var15 + 1][var54 + 1];
                                    int var33 = class61.field904[var15][var54 + 1];
                                    int var34 = -1;
                                    int var35 = -1;
                                    int var36;
                                    int var37;
                                    int var38;
                                    if (var56 > 0) {
                                       var36 = var16 * 256 / var19;
                                       var37 = var17 / var20;
                                       var38 = var18 / var20;
                                       var34 = class62.method1703(var36, var37, var38);
                                       var36 = var36 + class61.field913 & 255;
                                       var38 += class61.field899;
                                       if (var38 < 0) {
                                          var38 = 0;
                                       } else if (var38 > 255) {
                                          var38 = 255;
                                       }

                                       var35 = class62.method1703(var36, var37, var38);
                                    }

                                    class157 var39;
                                    if (var6 > 0) {
                                       boolean var77 = true;
                                       if (var56 == 0 && class61.field915[var6][var15][var54] != 0) {
                                          var77 = false;
                                       }

                                       if (var25 > 0) {
                                          var38 = var25 - 1;
                                          var39 = (class157)class157.field1842.method4306((long)var38);
                                          class157 var61;
                                          if (var39 != null) {
                                             var61 = var39;
                                          } else {
                                             byte[] var40 = class157.field1854.method4920(4, var38);
                                             var39 = new class157();
                                             if (var40 != null) {
                                                var39.method3051(new class384(var40), var38);
                                             }

                                             var39.method3050();
                                             class157.field1842.method4308(var39, (long)var38);
                                             var61 = var39;
                                          }

                                          if (!var61.field1845) {
                                             var77 = false;
                                          }
                                       }

                                       if (var77 && var27 == var26 && var28 == var26 && var29 == var26) {
                                          var10000 = class163.field1914[var6][var15];
                                          var10000[var54] |= 2340;
                                       }
                                    }

                                    var36 = 0;
                                    if (var35 != -1) {
                                       var36 = class197.field2267[class52.method1584(var35, 96)];
                                    }

                                    if (var25 == 0) {
                                       var69.method4081(var6, var15, var54, 0, 0, -1, var26, var27, var28, var29, class52.method1584(var34, var30), class52.method1584(var34, var31), class52.method1584(var34, var32), class52.method1584(var34, var33), 0, 0, 0, 0, var36, 0);
                                    } else {
                                       var37 = class61.field915[var6][var15][var54] + 1;
                                       byte var78 = class61.field909[var6][var15][var54];
                                       int var62 = var25 - 1;
                                       class157 var41 = (class157)class157.field1842.method4306((long)var62);
                                       if (var41 != null) {
                                          var39 = var41;
                                       } else {
                                          byte[] var42 = class157.field1854.method4920(4, var62);
                                          var41 = new class157();
                                          if (var42 != null) {
                                             var41.method3051(new class384(var42), var62);
                                          }

                                          var41.method3050();
                                          class157.field1842.method4308(var41, (long)var62);
                                          var39 = var41;
                                       }

                                       int var63 = var39.field1855;
                                       int var43;
                                       int var44;
                                       int var45;
                                       int var46;
                                       if (var63 >= 0) {
                                          var44 = class197.field2268.vmethod4253(var63);
                                          var43 = -1;
                                       } else if (var39.field1843 == 16711935) {
                                          var43 = -2;
                                          var63 = -1;
                                          var44 = -2;
                                       } else {
                                          var43 = class62.method1703(var39.field1846, var39.field1848, var39.field1849);
                                          var45 = var39.field1846 + class61.field913 & 255;
                                          var46 = var39.field1849 + class61.field899;
                                          if (var46 < 0) {
                                             var46 = 0;
                                          } else if (var46 > 255) {
                                             var46 = 255;
                                          }

                                          var44 = class62.method1703(var45, var39.field1848, var46);
                                       }

                                       var45 = 0;
                                       if (var44 != -2) {
                                          var45 = class197.field2267[class51.method1570(var44, 96)];
                                       }

                                       if (var39.field1847 != -1) {
                                          var46 = var39.field1850 + class61.field913 & 255;
                                          int var47 = var39.field1852 + class61.field899;
                                          if (var47 < 0) {
                                             var47 = 0;
                                          } else if (var47 > 255) {
                                             var47 = 255;
                                          }

                                          var44 = class62.method1703(var46, var39.field1851, var47);
                                          var45 = class197.field2267[class51.method1570(var44, 96)];
                                       }

                                       var69.method4081(var6, var15, var54, var37, var78, var63, var26, var27, var28, var29, class52.method1584(var34, var30), class52.method1584(var34, var31), class52.method1584(var34, var32), class52.method1584(var34, var33), class51.method1570(var43, var30), class51.method1570(var43, var31), class51.method1570(var43, var32), class51.method1570(var43, var33), var36, var45);
                                    }
                                 }
                              }
                           }
                        }
                     }

                     for(var15 = 1; var15 < 103; ++var15) {
                        for(var16 = 1; var16 < 103; ++var16) {
                           if ((class61.field900[var6][var16][var15] & 8) != 0) {
                              var54 = 0;
                           } else if (var6 > 0 && (class61.field900[1][var16][var15] & 2) != 0) {
                              var54 = var6 - 1;
                           } else {
                              var54 = var6;
                           }

                           var69.method3906(var6, var16, var15, var54);
                        }
                     }

                     class339.field3936[var6] = null;
                     class60.field894[var6] = null;
                     class61.field915[var6] = null;
                     class61.field909[var6] = null;
                     class250.field3113[var6] = null;
                  }

                  var69.method3932(-50, -10, -50);

                  for(var6 = 0; var6 < 104; ++var6) {
                     for(var7 = 0; var7 < 104; ++var7) {
                        if ((class61.field900[1][var6][var7] & 2) == 2) {
                           var69.method4016(var6, var7);
                        }
                     }
                  }

                  var6 = 1;
                  var7 = 2;
                  var8 = 4;

                  for(var73 = 0; var73 < 4; ++var73) {
                     if (var73 > 0) {
                        var6 <<= 3;
                        var7 <<= 3;
                        var8 <<= 3;
                     }

                     for(var55 = 0; var55 <= var73; ++var55) {
                        for(var11 = 0; var11 <= 104; ++var11) {
                           for(var12 = 0; var12 <= 104; ++var12) {
                              short var76;
                              if ((class163.field1914[var55][var12][var11] & var6) != 0) {
                                 var13 = var11;
                                 var74 = var11;
                                 var15 = var55;

                                 for(var16 = var55; var13 > 0 && (class163.field1914[var55][var12][var13 - 1] & var6) != 0; --var13) {
                                 }

                                 while(var74 < 104 && (class163.field1914[var55][var12][var74 + 1] & var6) != 0) {
                                    ++var74;
                                 }

                                 label737:
                                 while(var15 > 0) {
                                    for(var17 = var13; var17 <= var74; ++var17) {
                                       if ((class163.field1914[var15 - 1][var12][var17] & var6) == 0) {
                                          break label737;
                                       }
                                    }

                                    --var15;
                                 }

                                 label726:
                                 while(var16 < var73) {
                                    for(var17 = var13; var17 <= var74; ++var17) {
                                       if ((class163.field1914[var16 + 1][var12][var17] & var6) == 0) {
                                          break label726;
                                       }
                                    }

                                    ++var16;
                                 }

                                 var17 = (var74 - var13 + 1) * (var16 + 1 - var15);
                                 if (var17 >= 8) {
                                    var76 = 240;
                                    var19 = class61.field910[var16][var12][var13] - var76;
                                    var20 = class61.field910[var15][var12][var13];
                                    class199.method3905(var73, 1, var12 * 128, var12 * 128, var13 * 128, var74 * 128 + 128, var19, var20);

                                    for(var54 = var15; var54 <= var16; ++var54) {
                                       for(var22 = var13; var22 <= var74; ++var22) {
                                          var10000 = class163.field1914[var54][var12];
                                          var10000[var22] &= ~var6;
                                       }
                                    }
                                 }
                              }

                              if ((class163.field1914[var55][var12][var11] & var7) != 0) {
                                 var13 = var12;
                                 var74 = var12;
                                 var15 = var55;

                                 for(var16 = var55; var13 > 0 && (class163.field1914[var55][var13 - 1][var11] & var7) != 0; --var13) {
                                 }

                                 while(var74 < 104 && (class163.field1914[var55][var74 + 1][var11] & var7) != 0) {
                                    ++var74;
                                 }

                                 label790:
                                 while(var15 > 0) {
                                    for(var17 = var13; var17 <= var74; ++var17) {
                                       if ((class163.field1914[var15 - 1][var17][var11] & var7) == 0) {
                                          break label790;
                                       }
                                    }

                                    --var15;
                                 }

                                 label779:
                                 while(var16 < var73) {
                                    for(var17 = var13; var17 <= var74; ++var17) {
                                       if ((class163.field1914[var16 + 1][var17][var11] & var7) == 0) {
                                          break label779;
                                       }
                                    }

                                    ++var16;
                                 }

                                 var17 = (var16 + 1 - var15) * (var74 - var13 + 1);
                                 if (var17 >= 8) {
                                    var76 = 240;
                                    var19 = class61.field910[var16][var13][var11] - var76;
                                    var20 = class61.field910[var15][var13][var11];
                                    class199.method3905(var73, 2, var13 * 128, var74 * 128 + 128, var11 * 128, var11 * 128, var19, var20);

                                    for(var54 = var15; var54 <= var16; ++var54) {
                                       for(var22 = var13; var22 <= var74; ++var22) {
                                          var10000 = class163.field1914[var54][var22];
                                          var10000[var11] &= ~var7;
                                       }
                                    }
                                 }
                              }

                              if ((class163.field1914[var55][var12][var11] & var8) != 0) {
                                 var13 = var12;
                                 var74 = var12;
                                 var15 = var11;

                                 for(var16 = var11; var15 > 0 && (class163.field1914[var55][var12][var15 - 1] & var8) != 0; --var15) {
                                 }

                                 while(var16 < 104 && (class163.field1914[var55][var12][var16 + 1] & var8) != 0) {
                                    ++var16;
                                 }

                                 label843:
                                 while(var13 > 0) {
                                    for(var17 = var15; var17 <= var16; ++var17) {
                                       if ((class163.field1914[var55][var13 - 1][var17] & var8) == 0) {
                                          break label843;
                                       }
                                    }

                                    --var13;
                                 }

                                 label832:
                                 while(var74 < 104) {
                                    for(var17 = var15; var17 <= var16; ++var17) {
                                       if ((class163.field1914[var55][var74 + 1][var17] & var8) == 0) {
                                          break label832;
                                       }
                                    }

                                    ++var74;
                                 }

                                 if ((var74 - var13 + 1) * (var16 - var15 + 1) >= 4) {
                                    var17 = class61.field910[var55][var13][var15];
                                    class199.method3905(var73, 4, var13 * 128, var74 * 128 + 128, var15 * 128, var16 * 128 + 128, var17, var17);

                                    for(var18 = var13; var18 <= var74; ++var18) {
                                       for(var19 = var15; var19 <= var16; ++var19) {
                                          var10000 = class163.field1914[var55][var18];
                                          var10000[var19] &= ~var8;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  class231.method4358(true);
                  var6 = class61.field901;
                  if (var6 > class284.field3651) {
                     var6 = class284.field3651;
                  }

                  if (var6 < class284.field3651 - 1) {
                     var6 = class284.field3651 - 1;
                  }

                  if (field408) {
                     class165.field1924.method3960(class61.field901);
                  } else {
                     class165.field1924.method3960(0);
                  }

                  for(var7 = 0; var7 < 104; ++var7) {
                     for(var8 = 0; var8 < 104; ++var8) {
                        class48.method1425(var7, var8);
                     }
                  }

                  class262.method4817();
                  class161.method3141();
                  class155.field1737.method4309();
                  class228 var80;
                  if (class58.field873.method228()) {
                     var80 = class148.method2788(class226.field2621, field452.field1204);
                     var80.field2690.writeInt(1057001181);
                     field452.method2031(var80);
                  }

                  if (!field480) {
                     var7 = (class19.field136 - 6) / 8;
                     var8 = (class19.field136 + 6) / 8;
                     var73 = (class7.field26 - 6) / 8;
                     var55 = (class7.field26 + 6) / 8;

                     for(var11 = var7 - 1; var11 <= var8 + 1; ++var11) {
                        for(var12 = var73 - 1; var12 <= var55 + 1; ++var12) {
                           if (var11 < var7 || var11 > var8 || var12 < var73 || var12 > var55) {
                              class198.field2276.method4943("m" + var11 + "_" + var12);
                              class198.field2276.method4943("l" + var11 + "_" + var12);
                           }
                        }
                     }
                  }

                  class16.method163(30);
                  class262.method4817();
                  class339.field3936 = null;
                  class60.field894 = null;
                  class61.field915 = null;
                  class61.field909 = null;
                  class163.field1914 = null;
                  class250.field3113 = null;
                  class61.field904 = null;
                  class53.field787 = null;
                  class61.field902 = null;
                  class256.field3137 = null;
                  class337.field3925 = null;
                  class80.field1161 = null;
                  var80 = class148.method2788(class226.field2576, field452.field1204);
                  field452.method2031(var80);
                  class84.field1198.vmethod2605();

                  for(var8 = 0; var8 < 32; ++var8) {
                     class18.field104[var8] = 0L;
                  }

                  for(var8 = 0; var8 < 32; ++var8) {
                     class18.field111[var8] = 0L;
                  }

                  class258.field3166 = 0;
               }
            }
         }
      } else {
         class155.method2938(this);
      }

      if (field412 == 30) {
         this.method909();
      } else if (field412 == 40 || field412 == 45) {
         this.method1175();
      }

   }

   final void method916(int var1, int var2) {
      class150.method2815(var1, var2);
      class165.field1924.method3938(class284.field3651, var1, var2, false);
      field543 = true;
   }

   void doJS5Cycle() {
      if (class277.field3600 >= 4) {
         this.js5Error("js5crc");
         field412 = 1000;
      } else {
         if (class277.field3604 >= 4) {
            if (field412 <= 5) {
               this.js5Error("js5io");
               field412 = 1000;
               return;
            }

            field435 = 3000;
            class277.field3604 = 3;
         }

         if (--field435 + 1 <= 0) {
            try {
               if (js5State == 0) {
                  class238.field2878 = class18.field100.method2513(class243.field2917, class290.field3678);
                  ++js5State;
               }

               if (js5State == 1) {
                  if (class238.field2878.field1510 == 2) {
                     this.error(-1);
                     return;
                  }

                  if (class238.field2878.field1510 == 1) {
                     ++js5State;
                  }
               }

               if (js5State == 2) {
                  if (field456) {
                     Socket var3 = (Socket)class238.field2878.field1509;
                     class330 var2 = new class330(var3, 40000, 5000);
                     class84.js5Socket = var2;
                  } else {
                     class84.js5Socket = new class133((Socket)class238.field2878.field1509, class18.field100, 5000);
                  }

                  class384 handshakeBuf = new class384(5);
                  handshakeBuf.writeByte(15);
                  handshakeBuf.writeInt(198);
                  class84.js5Socket.write(handshakeBuf.payload, 0, 5);
                  ++js5State;
                  class146.idleTime = class86.currentTime();
               }

               if (js5State == 3) {
                  if (class84.js5Socket.available() > 0 || !field456 && field412 <= 5) {
                     int status = class84.js5Socket.read();
                     if (status != 0) {
                        this.error(status);
                        return;
                     }

                     ++js5State;
                  } else if (class86.currentTime() - class146.idleTime > 30000L) {
                     this.error(-2);
                     return;
                  }
               }

               if (js5State == 4) {
                  class124.method2470(class84.js5Socket, field412 > 20);
                  class238.field2878 = null;
                  class84.js5Socket = null;
                  js5State = 0;
                  field503 = 0;
               }
            } catch (IOException var5) {
               this.error(-3);
            }

         }
      }
   }

   final void method1194() {
      int var2;
      if (field567 != -1) {
         var2 = field567;
         if (class250.method4757(var2)) {
            class141.method2682(class248.field3038[var2], -1);
         }
      }

      for(var2 = 0; var2 < field590; ++var2) {
         if (field616[var2]) {
            field617[var2] = true;
         }

         field508[var2] = field616[var2];
         field616[var2] = false;
      }

      field615 = field451;
      field556 = -1;
      field557 = -1;
      field514 = null;
      if (field567 != -1) {
         field590 = 0;
         class41.method845(field567, 0, 0, class68.field970, field686, 0, 0, -1);
      }

      class393.method6910();
      if (field511) {
         if (field510 == 1) {
            class83.field1189[field539 / 100].method7024(field507 - 8, field462 - 8);
         }

         if (field510 == 2) {
            class83.field1189[field539 / 100 + 4].method7024(field507 - 8, field462 - 8);
         }
      }

      int var3;
      int var4;
      if (!field543) {
         if (field556 != -1) {
            var2 = field556;
            var3 = field557;
            if ((field544 * -286331153 >= 2 || field560 != 0 || field562) && field577) {
               var4 = class159.method3135();
               String var14;
               if (field560 == 1 && field544 * -286331153 < 2) {
                  var14 = "Use" + " " + field529 + " " + "->";
               } else if (field562 && field544 * -286331153 < 2) {
                  var14 = field565 + " " + field465 + " " + "->";
               } else {
                  String var15;
                  if (var4 < 0) {
                     var15 = "";
                  } else if (field550[var4].length() > 0) {
                     var15 = field484[var4] + " " + field550[var4];
                  } else {
                     var15 = field484[var4];
                  }

                  var14 = var15;
               }

               if (field544 * -286331153 > 2) {
                  var14 = var14 + class43.method850(16777215) + " " + '/' + " " + (field544 * -286331153 - 2) + " more options";
               }

               class129.field1467.method5380(var14, var2 + 4, var3 + 15, 16777215, 0, field451 / 1000);
            }
         }
      } else {
         var2 = class149.field1658;
         var3 = class334.field3906;
         var4 = class11.field68;
         int var5 = class51.field771;
         int var6 = 6116423;
         class393.method6880(var2, var3, var4, var5, var6);
         class393.method6880(var2 + 1, var3 + 1, var4 - 2, 16, 0);
         class393.method6907(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
         class129.field1467.method5372("Choose Option", var2 + 3, var3 + 14, var6, -1);
         int var7 = class19.field141;
         int var8 = class19.field144;

         for(int var9 = 0; var9 < field544 * -286331153; ++var9) {
            int var10 = (field544 * -286331153 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
               var11 = 16776960;
            }

            class301 var12 = class129.field1467;
            String var13;
            if (var9 < 0) {
               var13 = "";
            } else if (field550[var9].length() > 0) {
               var13 = field484[var9] + " " + field550[var9];
            } else {
               var13 = field484[var9];
            }

            var12.method5372(var13, var2 + 3, var10, var11, 0);
         }

         class147.method2761(class149.field1658, class334.field3906, class11.field68, class51.field771);
      }

      if (field623 == 3) {
         for(var2 = 0; var2 < field590; ++var2) {
            if (field508[var2]) {
               class393.method6879(field622[var2], field625[var2], field621[var2], field618[var2], 16711935, 128);
            } else if (field617[var2]) {
               class393.method6879(field622[var2], field625[var2], field621[var2], field618[var2], 16711680, 128);
            }
         }
      }

      class47.method1359(class284.field3651, class19.field139.field1068, class19.field139.field1058, field555);
      field555 = 0;
   }

   protected final void vmethod1106() {
      field624 = class86.currentTime() + 500L;
      this.method911();
      if (field567 != -1) {
         this.method917(true);
      }

   }

   protected final void vmethod1219(boolean var1) {
      boolean var3 = class18.method345();
      if (var3 && field647 && class178.field2069 != null) {
         class178.field2069.method453();
      }

      if ((field412 == 10 || field412 == 20 || field412 == 30) && 0L != field624 && class86.currentTime() > field624) {
         class164.method3159(class237.method4568());
      }

      int var4;
      if (var1) {
         for(var4 = 0; var4 < 100; ++var4) {
            field616[var4] = true;
         }
      }

      if (field412 == 0) {
         this.method223(class55.field805, class55.field806, var1);
      } else if (field412 == 5) {
         class292.method5172(class129.field1467, class46.field397, class257.field3164);
      } else if (field412 != 10 && field412 != 11) {
         if (field412 == 20) {
            class292.method5172(class129.field1467, class46.field397, class257.field3164);
         } else if (field412 == 25) {
            if (field463 == 1) {
               if (field459 > field460) {
                  field460 = field459;
               }

               var4 = (field460 * 50 - field459 * 50) / field460;
               class11.method112("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else if (field463 == 2) {
               if (field461 > field549) {
                  field549 = field461;
               }

               var4 = (field549 * 50 - field461 * 50) / field549 + 50;
               class11.method112("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else {
               class11.method112("Loading - please wait.", false);
            }
         } else if (field412 == 30) {
            this.method1194();
         } else if (field412 == 40) {
            class11.method112("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if (field412 == 45) {
            class11.method112("Please wait...", false);
         }
      } else {
         class292.method5172(class129.field1467, class46.field397, class257.field3164);
      }

      if (field412 == 30 && field623 == 0 && !var1 && !field612) {
         for(var4 = 0; var4 < field590; ++var4) {
            if (field617[var4]) {
               class263.field3193.vmethod6947(field622[var4], field625[var4], field621[var4], field618[var4]);
               field617[var4] = false;
            }
         }
      } else if (field412 > 0) {
         class263.field3193.vmethod6948(0, 0);

         for(var4 = 0; var4 < field590; ++var4) {
            field617[var4] = false;
         }
      }

   }

   final void method909() {
      if (field422 > 1) {
         --field422;
      }

      if (field570 > 0) {
         --field570;
      }

      if (field455) {
         field455 = false;
         class174.method3507();
      } else {
         if (!field543) {
            class10.method106();
         }

         int var2;
         for(var2 = 0; var2 < 100 && this.method913(field452); ++var2) {
         }

         if (field412 == 30) {
            while(true) {
               class42 var3 = (class42)class41.field355.method5239();
               boolean var32;
               if (var3 == null) {
                  var32 = false;
               } else {
                  var32 = true;
               }

               int var4;
               class228 var33;
               if (!var32) {
                  class228 var15;
                  int var16;
                  if (field457.field3781) {
                     var15 = class148.method2788(class226.field2575, field452.field1204);
                     var15.field2690.writeByte(0);
                     var16 = var15.field2690.field4181 * -1084587701;
                     field457.method5584(var15.field2690);
                     var15.field2690.method6557(var15.field2690.field4181 * -1084587701 - var16);
                     field452.method2031(var15);
                     field457.method5578();
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
                  synchronized(class6.field13.field974) {
                     if (!field634) {
                        class6.field13.field966 = 0;
                     } else if (class19.field148 != 0 || class6.field13.field966 >= 40) {
                        var33 = null;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;

                        for(var8 = 0; var8 < class6.field13.field966 && (var33 == null || var33.field2690.field4181 * -1084587701 - var4 < 246); ++var8) {
                           var5 = var8;
                           var9 = class6.field13.field968[var8];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           var10 = class6.field13.field967[var8];
                           if (var10 < -1) {
                              var10 = -1;
                           } else if (var10 > 65534) {
                              var10 = 65534;
                           }

                           if (var10 != field417 || var9 != field418) {
                              if (var33 == null) {
                                 var33 = class148.method2788(class226.field2625, field452.field1204);
                                 var33.field2690.writeByte(0);
                                 var4 = var33.field2690.field4181 * -1084587701;
                                 class383 var10000 = var33.field2690;
                                 var10000.field4181 = (var10000.field4181 * -1084587701 + 2) * 99;
                                 var6 = 0;
                                 var7 = 0;
                              }

                              if (field419 != -1L) {
                                 var11 = var10 - field417;
                                 var12 = var9 - field418;
                                 var13 = (int)((class6.field13.field969[var8] - field419) / 20L);
                                 var6 = (int)((long)var6 + (class6.field13.field969[var8] - field419) % 20L);
                              } else {
                                 var11 = var10;
                                 var12 = var9;
                                 var13 = Integer.MAX_VALUE;
                              }

                              field417 = var10;
                              field418 = var9;
                              if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                 var11 += 32;
                                 var12 += 32;
                                 var33.field2690.method6734((var13 << 12) + var12 + (var11 << 6));
                              } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                 var11 += 128;
                                 var12 += 128;
                                 var33.field2690.writeByte(var13 + 128);
                                 var33.field2690.method6734(var12 + (var11 << 8));
                              } else if (var13 < 32) {
                                 var33.field2690.writeByte(var13 + 192);
                                 if (var10 != -1 && var9 != -1) {
                                    var33.field2690.writeInt(var10 | var9 << 16);
                                 } else {
                                    var33.field2690.writeInt(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var33.field2690.method6734((var13 & 8191) + '\ue000');
                                 if (var10 != -1 && var9 != -1) {
                                    var33.field2690.writeInt(var10 | var9 << 16);
                                 } else {
                                    var33.field2690.writeInt(Integer.MIN_VALUE);
                                 }
                              }

                              ++var7;
                              field419 = class6.field13.field969[var8];
                           }
                        }

                        if (var33 != null) {
                           var33.field2690.method6557(var33.field2690.field4181 * -1084587701 - var4);
                           var8 = var33.field2690.field4181 * -1084587701;
                           var33.field2690.field4181 = var4 * 99;
                           var33.field2690.writeByte(var6 / var7);
                           var33.field2690.writeByte(var6 % var7);
                           var33.field2690.field4181 = var8 * 99;
                           field452.method2031(var33);
                        }

                        if (var5 >= class6.field13.field966) {
                           class6.field13.field966 = 0;
                        } else {
                           class68 var47 = class6.field13;
                           var47.field966 -= var5;
                           System.arraycopy(class6.field13.field967, var5, class6.field13.field967, 0, class6.field13.field966);
                           System.arraycopy(class6.field13.field968, var5, class6.field13.field968, 0, class6.field13.field966);
                           System.arraycopy(class6.field13.field969, var5, class6.field13.field969, 0, class6.field13.field966);
                        }
                     }
                  }

                  class228 var19;
                  if (class19.field148 == 1 || !class310.field3776 && class19.field148 == 4 || class19.field148 == 2) {
                     long var17 = class19.field151 - field416 * -1L;
                     if (var17 > 32767L) {
                        var17 = 32767L;
                     }

                     field416 = class19.field151 * -1L;
                     var4 = class19.field150;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > field686) {
                        var4 = field686;
                     }

                     var5 = class19.field149;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > class68.field970) {
                        var5 = class68.field970;
                     }

                     var6 = (int)var17;
                     var19 = class148.method2788(class226.field2579, field452.field1204);
                     var19.field2690.method6734((class19.field148 == 2 ? 1 : 0) + (var6 << 1));
                     var19.field2690.method6734(var5);
                     var19.field2690.method6734(var4);
                     field452.method2031(var19);
                  }

                  if (class10.field35 > 0) {
                     var15 = class148.method2788(class226.field2563, field452.field1204);
                     var15.field2690.method6734(0);
                     var16 = var15.field2690.field4181 * -1084587701;
                     long var20 = class86.currentTime();

                     for(var6 = 0; var6 < class10.field35; ++var6) {
                        long var22 = var20 - field635;
                        if (var22 > 16777215L) {
                           var22 = 16777215L;
                        }

                        field635 = var20;
                        var15.field2690.method6723((int)var22);
                        var15.field2690.writeByte(class10.field53[var6]);
                     }

                     var15.field2690.method6646(var15.field2690.field4181 * -1084587701 - var16);
                     field452.method2031(var15);
                  }

                  if (field607 > 0) {
                     --field607;
                  }

                  if (class10.field45[96] || class10.field45[97] || class10.field45[98] || class10.field45[99]) {
                     field491 = true;
                  }

                  if (field491 && field607 <= 0) {
                     field607 = 20;
                     field491 = false;
                     var15 = class148.method2788(class226.field2641, field452.field1204);
                     var15.field2690.method6595(field444);
                     var15.field2690.method6689(field475);
                     field452.method2031(var15);
                  }

                  if (class255.field3127 && !field420) {
                     field420 = true;
                     var15 = class148.method2788(class226.field2598, field452.field1204);
                     var15.field2690.writeByte(1);
                     field452.method2031(var15);
                  }

                  if (!class255.field3127 && field420) {
                     field420 = false;
                     var15 = class148.method2788(class226.field2598, field452.field1204);
                     var15.field2690.writeByte(0);
                     field452.method2031(var15);
                  }

                  if (class24.field201 != null) {
                     class24.field201.method6231();
                  }

                  class60.method1666();
                  class238.method4571();
                  int[] var34;
                  if (field638 != class284.field3651) {
                     field638 = class284.field3651;
                     var2 = class284.field3651;
                     var34 = class376.field4166.field4279;
                     var4 = var34.length;

                     for(var5 = 0; var5 < var4; ++var5) {
                        var34[var5] = 0;
                     }

                     for(var5 = 1; var5 < 103; ++var5) {
                        var6 = (103 - var5) * 2048 + 24628;

                        for(var7 = 1; var7 < 103; ++var7) {
                           if ((class61.field900[var2][var7][var5] & 24) == 0) {
                              class165.field1924.method3935(var34, var6, 512, var2, var7, var5);
                           }

                           if (var2 < 3 && (class61.field900[var2 + 1][var7][var5] & 8) != 0) {
                              class165.field1924.method3935(var34, var6, 512, var2 + 1, var7, var5);
                           }

                           var6 += 4;
                        }
                     }

                     var5 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
                     var6 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
                     class376.field4166.method7020();

                     for(var7 = 1; var7 < 103; ++var7) {
                        for(var8 = 1; var8 < 103; ++var8) {
                           if ((class61.field900[var2][var8][var7] & 24) == 0) {
                              class359.method6279(var2, var8, var7, var5, var6);
                           }

                           if (var2 < 3 && (class61.field900[var2 + 1][var8][var7] & 8) != 0) {
                              class359.method6279(var2 + 1, var8, var7, var5, var6);
                           }
                        }
                     }

                     field620 = 0;

                     for(var7 = 0; var7 < 104; ++var7) {
                        for(var8 = 0; var8 < 104; ++var8) {
                           long var24 = class165.field1924.method4032(class284.field3651, var7, var8);
                           if (0L != var24) {
                              var11 = class78.method1904(var24);
                              var12 = class123.method2465(var11).field1762;
                              if (var12 >= 0 && class72.method1825(var12).field1541) {
                                 field642[field620] = class72.method1825(var12).method2651(false);
                                 field613[field620] = var7;
                                 field641[field620] = var8;
                                 ++field620;
                              }
                           }
                        }
                     }

                     class263.field3193.method6955();
                  }

                  if (field412 != 30) {
                     return;
                  }

                  class252.method4780();
                  class193.method3804();
                  ++field452.field1209;
                  if (field452.field1209 > 750) {
                     class174.method3507();
                     return;
                  }

                  var2 = class82.field1171;
                  var34 = class82.field1177;

                  for(var4 = 0; var4 < var2; ++var4) {
                     class69 var26 = field523[var34[var4]];
                     if (var26 != null) {
                        class16.method177(var26, 1);
                     }
                  }

                  class133.method2561();
                  class107.method2222();
                  ++field555;
                  if (field510 != 0) {
                     field539 += 20;
                     if (field539 >= 400) {
                        field510 = 0;
                     }
                  }

                  if (class12.field77 != null) {
                     ++field512;
                     if (field512 >= 15) {
                        class80.method1934(class12.field77);
                        class12.field77 = null;
                     }
                  }

                  class248 var40 = class244.field2922;
                  class248 var35 = class292.field3698;
                  class244.field2922 = null;
                  class292.field3698 = null;
                  field584 = null;
                  field588 = false;
                  field585 = false;
                  field450 = 0;

                  while(class316.method5611() && field450 < 128) {
                     if (field576 >= 2 && class10.field45[82] && class120.field1417 == 66) {
                        String var42 = "";

                        class44 var41;
                        for(Iterator var27 = class84.field1193.iterator(); var27.hasNext(); var42 = var42 + var41.field379 + ':' + var41.field387 + '\n') {
                           var41 = (class44)var27.next();
                        }

                        class58.field873.method195(var42);
                     } else if (field481 != 1 || class126.field1449 <= 0) {
                        field430[field450] = class120.field1417;
                        field633[field450] = class126.field1449;
                        ++field450;
                     }
                  }

                  if (class142.method2710() && class10.field45[82] && class10.field45[81] && field656 != 0) {
                     var4 = class19.field139.field998 - field656;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > 3) {
                        var4 = 3;
                     }

                     if (var4 != class19.field139.field998) {
                        var5 = class19.field139.field1075[0] + class280.field3624;
                        var6 = class19.field139.field1076[0] + class77.field1133;
                        var19 = class148.method2788(class226.field2634, field452.field1204);
                        var19.field2690.writeByte(var4);
                        var19.field2690.method6734(var6);
                        var19.field2690.method6689(var5);
                        var19.field2690.writeInt(0);
                        field452.method2031(var19);
                     }

                     field656 = 0;
                  }

                  if (field567 != -1) {
                     class245.method4637(field567, 0, 0, class68.field970, field686, 0, 0);
                  }

                  ++field592;

                  while(true) {
                     class67 var28;
                     class248 var43;
                     class248 var44;
                     do {
                        var28 = (class67)field611.method5214();
                        if (var28 == null) {
                           while(true) {
                              do {
                                 var28 = (class67)field685.method5214();
                                 if (var28 == null) {
                                    while(true) {
                                       do {
                                          var28 = (class67)field610.method5214();
                                          if (var28 == null) {
                                             this.method914();
                                             if (class24.field201 != null) {
                                                class24.field201.method6069(class284.field3651, (class19.field139.field1068 >> 7) + class280.field3624, (class19.field139.field1058 >> 7) + class77.field1133, false);
                                                class24.field201.method6090();
                                             }

                                             if (field580 != null) {
                                                this.method919();
                                             }

                                             class228 var29;
                                             if (field687 != null) {
                                                class80.method1934(field687);
                                                ++field520;
                                                if (class19.field140 == 0) {
                                                   if (field519) {
                                                      if (field514 == field687 && field518 != field515) {
                                                         class248 var46 = field687;
                                                         byte var36 = 0;
                                                         if (field654 == 1 && var46.field2961 == 206) {
                                                            var36 = 1;
                                                         }

                                                         if (var46.field3085[field518] <= 0) {
                                                            var36 = 0;
                                                         }

                                                         var7 = class240.method4608(var46);
                                                         boolean var37 = (var7 >> 29 & 1) != 0;
                                                         if (var37) {
                                                            var8 = field515;
                                                            var9 = field518;
                                                            var46.field3085[var9] = var46.field3085[var8];
                                                            var46.field3086[var9] = var46.field3086[var8];
                                                            var46.field3085[var8] = -1;
                                                            var46.field3086[var8] = 0;
                                                         } else if (var36 == 1) {
                                                            var8 = field515;
                                                            var9 = field518;

                                                            while(var8 != var9) {
                                                               if (var8 > var9) {
                                                                  var46.method4701(var8 - 1, var8);
                                                                  --var8;
                                                               } else if (var8 < var9) {
                                                                  var46.method4701(var8 + 1, var8);
                                                                  ++var8;
                                                               }
                                                            }
                                                         } else {
                                                            var46.method4701(field518, field515);
                                                         }

                                                         var29 = class148.method2788(class226.field2577, field452.field1204);
                                                         var29.field2690.method6584(field687.field2957);
                                                         var29.field2690.method6689(field515);
                                                         var29.field2690.method6595(field518);
                                                         var29.field2690.writeByte(var36);
                                                         field452.method2031(var29);
                                                      }
                                                   } else if (this.method1024()) {
                                                      this.method916(field403, field583);
                                                   } else if (field544 * -286331153 > 0) {
                                                      var4 = field403;
                                                      var5 = field583;
                                                      class27.method542(class105.field1304, var4, var5);
                                                      class105.field1304 = null;
                                                   }

                                                   field512 = 10;
                                                   class19.field148 = 0;
                                                   field687 = null;
                                                } else if (field520 >= 5 && (class19.field141 > field403 + 5 || class19.field141 < field403 - 5 || class19.field144 > field583 + 5 || class19.field144 < field583 - 5)) {
                                                   field519 = true;
                                                }
                                             }

                                             if (class199.method3940()) {
                                                var4 = class199.field2313;
                                                var5 = class199.field2314;
                                                class228 var45 = class148.method2788(class226.field2612, field452.field1204);
                                                var45.field2690.writeByte(5);
                                                var45.field2690.method6689(var4 + class280.field3624);
                                                var45.field2690.method6734(var5 + class77.field1133);
                                                var45.field2690.writeByte(class10.field45[82] ? (class10.field45[81] ? 2 : 1) : 0);
                                                field452.method2031(var45);
                                                class199.method3941();
                                                field507 = class19.field149;
                                                field462 = class19.field150;
                                                field510 = 1;
                                                field539 = 0;
                                                field643 = var4;
                                                field596 = var5;
                                             }

                                             if (var40 != class244.field2922) {
                                                if (var40 != null) {
                                                   class80.method1934(var40);
                                                }

                                                if (class244.field2922 != null) {
                                                   class80.method1934(class244.field2922);
                                                }
                                             }

                                             if (var35 != class292.field3698 && field648 == field559) {
                                                if (var35 != null) {
                                                   class80.method1934(var35);
                                                }

                                                if (class292.field3698 != null) {
                                                   class80.method1934(class292.field3698);
                                                }
                                             }

                                             if (class292.field3698 != null) {
                                                if (field648 < field559) {
                                                   ++field648;
                                                   if (field648 == field559) {
                                                      class80.method1934(class292.field3698);
                                                   }
                                                }
                                             } else if (field648 > 0) {
                                                --field648;
                                             }

                                             if (field481 == 0) {
                                                var4 = class19.field139.field1068;
                                                var5 = class19.field139.field1058;
                                                if (class10.field65 - var4 < -500 || class10.field65 - var4 > 500 || class272.field3552 - var5 < -500 || class272.field3552 - var5 > 500) {
                                                   class10.field65 = var4;
                                                   class272.field3552 = var5;
                                                }

                                                if (var4 != class10.field65) {
                                                   class10.field65 += (var4 - class10.field65) / 16;
                                                }

                                                if (var5 != class272.field3552) {
                                                   class272.field3552 += (var5 - class272.field3552) / 16;
                                                }

                                                var6 = class10.field65 >> 7;
                                                var7 = class272.field3552 >> 7;
                                                var8 = class122.method2438(class10.field65, class272.field3552, class284.field3651);
                                                var9 = 0;
                                                if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
                                                   for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                      for(var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
                                                         var12 = class284.field3651;
                                                         if (var12 < 3 && (class61.field900[1][var10][var11] & 2) == 2) {
                                                            ++var12;
                                                         }

                                                         var13 = var8 - class61.field910[var12][var10][var11];
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

                                                if (var10 > field492) {
                                                   field492 += (var10 - field492) / 24;
                                                } else if (var10 < field492) {
                                                   field492 += (var10 - field492) / 80;
                                                }

                                                class270.field3532 = class122.method2438(class19.field139.field1068, class19.field139.field1058, class284.field3651) - field482;
                                             } else if (field481 == 1) {
                                                class108.method2226();
                                                short var38 = -1;
                                                if (class10.field45[33]) {
                                                   var38 = 0;
                                                } else if (class10.field45[49]) {
                                                   var38 = 1024;
                                                }

                                                if (class10.field45[48]) {
                                                   if (var38 == 0) {
                                                      var38 = 1792;
                                                   } else if (var38 == 1024) {
                                                      var38 = 1280;
                                                   } else {
                                                      var38 = 1536;
                                                   }
                                                } else if (class10.field45[50]) {
                                                   if (var38 == 0) {
                                                      var38 = 256;
                                                   } else if (var38 == 1024) {
                                                      var38 = 768;
                                                   } else {
                                                      var38 = 512;
                                                   }
                                                }

                                                byte var39 = 0;
                                                if (class10.field45[35]) {
                                                   var39 = -1;
                                                } else if (class10.field45[51]) {
                                                   var39 = 1;
                                                }

                                                var6 = 0;
                                                if (var38 >= 0 || var39 != 0) {
                                                   var6 = class10.field45[81] ? field487 : field486;
                                                   var6 *= 16;
                                                   field440 = var38;
                                                   field485 = var39;
                                                }

                                                if (field433 * 954437177 < var6) {
                                                   field433 = (var6 / 8 + field433 * 954437177) * 9;
                                                   if (field433 * 954437177 > var6) {
                                                      field433 = var6 * 9;
                                                   }
                                                } else if (field433 * 954437177 > var6) {
                                                   field433 = field433 / 10 * 9;
                                                }

                                                if (field433 * 954437177 > 0) {
                                                   var7 = field433 * 954437177 / 16;
                                                   if (field440 >= 0) {
                                                      var4 = field440 - class117.field1399 & 2047;
                                                      var8 = class197.field2265[var4];
                                                      var9 = class197.field2272[var4];
                                                      class10.field65 += var7 * var8 / 65536;
                                                      class272.field3552 += var7 * var9 / 65536;
                                                   }

                                                   if (field485 != 0) {
                                                      class270.field3532 += var7 * field485;
                                                      if (class270.field3532 > 0) {
                                                         class270.field3532 = 0;
                                                      }
                                                   }
                                                } else {
                                                   field440 = -1;
                                                   field485 = -1;
                                                }

                                                if (class10.field45[13]) {
                                                   field452.method2031(class148.method2788(class226.field2633, field452.field1204));
                                                   field481 = 0;
                                                }
                                             }

                                             if (class19.field140 == 4 && class310.field3776) {
                                                var4 = class19.field144 - field545;
                                                field657 = var4 * 2;
                                                field545 = var4 != -1 && var4 != 1 ? (class19.field144 + field545) / 2 : class19.field144;
                                                var5 = field490 - class19.field141;
                                                field477 = var5 * 2;
                                                field490 = var5 != -1 && var5 != 1 ? (class19.field141 + field490) / 2 : class19.field141;
                                             } else {
                                                if (class10.field45[96]) {
                                                   field477 += (-24 - field477) / 2;
                                                } else if (class10.field45[97]) {
                                                   field477 += (24 - field477) / 2;
                                                } else {
                                                   field477 /= 2;
                                                }

                                                if (class10.field45[98]) {
                                                   field657 += (12 - field657) / 2;
                                                } else if (class10.field45[99]) {
                                                   field657 += (-12 - field657) / 2;
                                                } else {
                                                   field657 /= 2;
                                                }

                                                field545 = class19.field144;
                                                field490 = class19.field141;
                                             }

                                             field444 = field477 / 2 + field444 & 2047;
                                             field475 += field657 / 2;
                                             if (field475 < 128) {
                                                field475 = 128;
                                             }

                                             if (field475 > 383) {
                                                field475 = 383;
                                             }

                                             if (field614) {
                                                class161.method3142();
                                             }

                                             for(var4 = 0; var4 < 5; ++var4) {
                                                int var10002 = field659[var4]++;
                                             }

                                             class37.field310.method1995();
                                             var4 = ++class19.field145 - 1;
                                             var6 = class10.field60;
                                             if (var4 > 15000 && var6 > 15000) {
                                                field570 = 250;
                                                class19.field145 = 14500;
                                                var29 = class148.method2788(class226.field2663, field452.field1204);
                                                field452.method2031(var29);
                                             }

                                             class12.field79.method1365();
                                             ++field452.field1215;
                                             if (field452.field1215 > 50) {
                                                var29 = class148.method2788(class226.field2573, field452.field1204);
                                                field452.method2031(var29);
                                             }

                                             try {
                                                field452.method2030();
                                             } catch (IOException var30) {
                                                class174.method3507();
                                             }

                                             return;
                                          }

                                          var43 = var28.field960;
                                          if (var43.field3030 < 0) {
                                             break;
                                          }

                                          var44 = class86.method2063(var43.field3000);
                                       } while(var44 == null || var44.field3060 == null || var43.field3030 >= var44.field3060.length || var43 != var44.field3060[var43.field3030]);

                                       class94.method2123(var28);
                                    }
                                 }

                                 var43 = var28.field960;
                                 if (var43.field3030 < 0) {
                                    break;
                                 }

                                 var44 = class86.method2063(var43.field3000);
                              } while(var44 == null || var44.field3060 == null || var43.field3030 >= var44.field3060.length || var43 != var44.field3060[var43.field3030]);

                              class94.method2123(var28);
                           }
                        }

                        var43 = var28.field960;
                        if (var43.field3030 < 0) {
                           break;
                        }

                        var44 = class86.method2063(var43.field3000);
                     } while(var44 == null || var44.field3060 == null || var43.field3030 >= var44.field3060.length || var43 != var44.field3060[var43.field3030]);

                     class94.method2123(var28);
                  }
               }

               var33 = class148.method2788(class226.field2590, field452.field1204);
               var33.field2690.writeByte(0);
               var4 = var33.field2690.field4181 * -1084587701;
               class70.method1799(var33.field2690);
               var33.field2690.method6557(var33.field2690.field4181 * -1084587701 - var4);
               field452.method2031(var33);
            }
         }
      }
   }

   final void method1175() {
      Object var2 = field452.method2036();
      class383 var3 = field452.field1200;

      try {
         if (field672 == 0) {
            if (class98.field1266 == null && (field443.method1644() || field438 > 250)) {
               class98.field1266 = field443.method1638();
               field443.method1636();
               field443 = null;
            }

            if (class98.field1266 != null) {
               if (var2 != null) {
                  ((class329)var2).vmethod5858();
                  var2 = null;
               }

               class265.field3213 = null;
               field455 = false;
               field438 = 0;
               field672 = 1;
            }
         }

         if (field672 == 1) {
            if (class265.field3213 == null) {
               class265.field3213 = class18.field100.method2513(class243.field2917, class290.field3678);
            }

            if (class265.field3213.field1510 == 2) {
               throw new IOException();
            }

            if (class265.field3213.field1510 == 1) {
               if (field456) {
                  Socket var5 = (Socket)class265.field3213.field1509;
                  class330 var4 = new class330(var5, 40000, 5000);
                  var2 = var4;
               } else {
                  var2 = new class133((Socket)class265.field3213.field1509, class18.field100, 5000);
               }

               field452.method2032((class329)var2);
               class265.field3213 = null;
               field672 = 2;
            }
         }

         if (field672 == 2) {
            field452.method2043();
            class228 var23 = class63.method1711();
            var23.field2690.writeByte(class230.field2791.field2795);
            field452.method2031(var23);
            field452.method2030();
            var3.field4181 = 0;
            field672 = 3;
         }

         boolean var13;
         int var14;
         if (field672 == 3) {
            if (class178.field2069 != null) {
               class178.field2069.method479();
            }

            if (class141.field1559 != null) {
               class141.field1559.method479();
            }

            var13 = true;
            if (field456 && !((class329)var2).vmethod5862(1)) {
               var13 = false;
            }

            if (var13) {
               var14 = ((class329)var2).read();
               if (class178.field2069 != null) {
                  class178.field2069.method479();
               }

               if (class141.field1559 != null) {
                  class141.field1559.method479();
               }

               if (var14 != 0) {
                  class265.method4837(var14);
                  return;
               }

               var3.field4181 = 0;
               field672 = 4;
            }
         }

         int var34;
         if (field672 == 4) {
            if (var3.field4181 * -1084587701 < 8) {
               var34 = ((class329)var2).available();
               if (var34 > 8 - var3.field4181 * -1084587701) {
                  var34 = 8 - var3.field4181 * -1084587701;
               }

               if (var34 > 0) {
                  ((class329)var2).vmethod5856(var3.payload, var3.field4181 * -1084587701, var34);
                  var3.field4181 = (var3.field4181 * -1084587701 + var34) * 99;
               }
            }

            if (var3.field4181 * -1084587701 == 8) {
               var3.field4181 = 0;
               class186.field2119 = var3.method6566();
               field672 = 5;
            }
         }

         int var8;
         int var9;
         if (field672 == 5) {
            field452.field1200.field4181 = 0;
            field452.method2043();
            class383 var24 = new class383(500);
            int[] var26 = new int[]{class98.field1266.nextInt(), class98.field1266.nextInt(), class98.field1266.nextInt(), class98.field1266.nextInt()};
            var24.field4181 = 0;
            var24.writeByte(1);
            var24.writeInt(var26[0]);
            var24.writeInt(var26[1]);
            var24.writeInt(var26[2]);
            var24.writeInt(var26[3]);
            var24.method6548(class186.field2119);
            if (field412 == 40) {
               var24.writeInt(class41.field356[0]);
               var24.writeInt(class41.field356[1]);
               var24.writeInt(class41.field356[2]);
               var24.writeInt(class41.field356[3]);
            } else {
               var24.writeByte(field447.vmethod6962());
               switch(field447.field1269) {
               case 0:
               case 1:
                  var24.method6723(class282.field3639);
                  var24.field4181 += 99;
                  break;
               case 2:
                  var24.field4181 = (var24.field4181 * -1084587701 + 4) * 99;
                  break;
               case 3:
                  var24.writeInt((Integer)class37.field307.field1114.get(class165.method3194(class55.field808)));
               }

               var24.writeByte(class388.field4230.vmethod6962());
               var24.method6550(class55.field817);
            }

            var24.method6583(class54.field792, class54.field791);
            class41.field356 = var26;
            class228 var7 = class159.method3136();
            var7.field2684 = null;
            var7.field2685 = 0;
            var7.field2690 = new class383(5000);
            var7.field2690.field4181 = 0;
            if (field412 == 40) {
               var7.field2690.writeByte(class230.field2792.field2795);
            } else {
               var7.field2690.writeByte(class230.field2789.field2795);
            }

            var7.field2690.method6734(0);
            var8 = var7.field2690.field4181 * -1084587701;
            var7.field2690.writeInt(198);
            var7.field2690.writeInt(1);
            var7.field2690.writeByte(field409);
            var7.field2690.writeByte(field473);
            var7.field2690.method6615(var24.payload, 0, var24.field4181 * -1084587701);
            var9 = var7.field2690.field4181 * -1084587701;
            var7.field2690.method6550(class55.field808);
            var7.field2690.writeByte((field612 ? 1 : 0) << 1 | (field408 ? 1 : 0));
            var7.field2690.method6734(class68.field970);
            var7.field2690.method6734(field686);
            class144.method2734(var7.field2690);
            var7.field2690.method6550(class149.field1660);
            var7.field2690.writeInt(class407.field4313);
            class384 var10 = new class384(class229.field2788.method6038());
            class229.field2788.method6037(var10);
            var7.field2690.method6615(var10.payload, 0, var10.payload.length);
            var7.field2690.writeByte(field409);
            var7.field2690.writeInt(0);
            var7.field2690.method6606(class339.field3937.field3590);
            var7.field2690.method6604(class18.field95.field3590);
            var7.field2690.writeInt(class37.field306.field3590);
            var7.field2690.method6584(class61.field916.field3590);
            var7.field2690.method6606(class123.field1439.field3590);
            var7.field2690.method6606(class126.field1453.field3590);
            var7.field2690.method6606(class138.field1520.field3590);
            var7.field2690.method6606(class198.field2276.field3590);
            var7.field2690.method6584(class105.field1300.field3590);
            var7.field2690.method6584(class74.field1106.field3590);
            var7.field2690.method6584(class291.field3692.field3590);
            var7.field2690.method6604(class270.field3535.field3590);
            var7.field2690.method6604(class37.field301.field3590);
            var7.field2690.writeInt(class45.field390.field3590);
            var7.field2690.method6604(0);
            var7.field2690.method6604(class322.field3847.field3590);
            var7.field2690.method6604(class191.field2138.field3590);
            var7.field2690.method6604(class108.field1325.field3590);
            var7.field2690.method6584(class15.field84.field3590);
            var7.field2690.method6584(class191.field2148.field3590);
            var7.field2690.writeInt(class120.field1416.field3590);
            var7.field2690.method6545(var26, var9, var7.field2690.field4181 * -1084587701);
            var7.field2690.method6646(var7.field2690.field4181 * -1084587701 - var8);
            field452.method2031(var7);
            field452.method2030();
            field452.field1204 = new class400(var26);
            int[] var11 = new int[4];

            for(int var12 = 0; var12 < 4; ++var12) {
               var11[var12] = var26[var12] + 50;
            }

            var3.method6497(var11);
            field672 = 6;
         }

         if (field672 == 6 && ((class329)var2).available() > 0) {
            var34 = ((class329)var2).read();
            if (var34 == 21 && field412 == 20) {
               field672 = 12;
            } else if (var34 == 2) {
               field672 = 14;
            } else if (var34 == 15 && field412 == 40) {
               field452.field1208 = -1;
               field672 = 19;
            } else if (var34 == 64) {
               field672 = 10;
            } else if (var34 == 23 && field439 < 1) {
               ++field439;
               field672 = 0;
            } else if (var34 == 29) {
               field672 = 17;
            } else {
               if (var34 != 69) {
                  class265.method4837(var34);
                  return;
               }

               field672 = 7;
            }
         }

         if (field672 == 7 && ((class329)var2).available() >= 2) {
            ((class329)var2).vmethod5856(var3.payload, 0, 2);
            var3.field4181 = 0;
            class122.field1425 = var3.method6655();
            field672 = 8;
         }

         if (field672 == 8 && ((class329)var2).available() >= class122.field1425) {
            var3.field4181 = 0;
            ((class329)var2).vmethod5856(var3.payload, var3.field4181 * -1084587701, class122.field1425);
            class6[] var25 = new class6[]{class6.field16};
            class6 var28 = var25[var3.method6560()];

            try {
               switch(var28.field10) {
               case 0:
                  class0 var6 = new class0();
                  this.field445 = new class7(var3, var6);
                  field672 = 9;
                  break;
               default:
                  throw new IllegalArgumentException();
               }
            } catch (Exception var21) {
               class265.method4837(22);
               return;
            }
         }

         if (field672 == 9 && this.field445.method46()) {
            this.field595 = this.field445.method57();
            this.field445.method49();
            this.field445 = null;
            if (this.field595 == null) {
               class265.method4837(22);
               return;
            }

            field452.method2043();
            class228 var29 = class159.method3136();
            var29.field2684 = null;
            var29.field2685 = 0;
            var29.field2690 = new class383(5000);
            var29.field2690.writeByte(class230.field2793.field2795);
            var29.field2690.method6734(this.field595.field4181 * -1084587701);
            var29.field2690.method6554(this.field595);
            field452.method2031(var29);
            field452.method2030();
            this.field595 = null;
            field672 = 6;
         }

         if (field672 == 10 && ((class329)var2).available() > 0) {
            class216.field2548 = ((class329)var2).read();
            field672 = 11;
         }

         if (field672 == 11 && ((class329)var2).available() >= class216.field2548) {
            ((class329)var2).vmethod5856(var3.payload, 0, class216.field2548);
            var3.field4181 = 0;
            field672 = 6;
         }

         if (field672 == 12 && ((class329)var2).available() > 0) {
            field589 = (((class329)var2).read() + 3) * 60;
            field672 = 13;
         }

         if (field672 == 13) {
            field438 = 0;
            method1315("You have only just left another world.", "Your profile will be transferred in:", field589 / 60 + " seconds.");
            if (--field589 <= 0) {
               field672 = 0;
            }

         } else {
            if (field672 == 14 && ((class329)var2).available() >= 1) {
               class292.field3713 = ((class329)var2).read();
               field672 = 15;
            }

            if (field672 == 15 && ((class329)var2).available() >= class292.field3713) {
               var13 = ((class329)var2).read() == 1;
               ((class329)var2).vmethod5856(var3.payload, 0, 4);
               var3.field4181 = 0;
               boolean var35 = false;
               if (var13) {
                  var14 = var3.method6500() << 24;
                  var14 |= var3.method6500() << 16;
                  var14 |= var3.method6500() << 8;
                  var14 |= var3.method6500();
                  String var33 = class55.field808;
                  var8 = var33.length();
                  var9 = 0;
                  int var15 = 0;

                  while(true) {
                     if (var15 >= var8) {
                        if (class37.field307.field1114.size() >= 10 && !class37.field307.field1114.containsKey(var9)) {
                           Iterator var17 = class37.field307.field1114.entrySet().iterator();
                           var17.next();
                           var17.remove();
                        }

                        class37.field307.field1114.put(var9, var14);
                        break;
                     }

                     var9 = (var9 << 5) - var9 + var33.charAt(var15);
                     ++var15;
                  }
               }

               if (field442) {
                  class37.field307.field1122 = class55.field808;
               } else {
                  class37.field307.field1122 = null;
               }

               class134.method2603();
               field576 = ((class329)var2).read();
               field602 = ((class329)var2).read() == 1;
               field664 = ((class329)var2).read();
               field664 <<= 8;
               field664 += ((class329)var2).read();
               field525 = ((class329)var2).read();
               ((class329)var2).vmethod5856(var3.payload, 0, 1);
               var3.field4181 = 0;
               class229[] var30 = class188.method3672();
               int var18 = var3.method6502();
               if (var18 < 0 || var18 >= var30.length) {
                  throw new IOException(var18 + " " + var3.field4181 * -1084587701);
               }

               field452.field1205 = var30[var18];
               field452.field1208 = field452.field1205.field2739;
               ((class329)var2).vmethod5856(var3.payload, 0, 2);
               var3.field4181 = 0;
               field452.field1208 = var3.method6655();

               try {
                  class14.method148(class58.field873, "zap");
               } catch (Throwable var20) {
               }

               field672 = 16;
            }

            if (field672 == 16) {
               if (((class329)var2).available() >= field452.field1208) {
                  var3.field4181 = 0;
                  ((class329)var2).vmethod5856(var3.payload, 0, field452.field1208);
                  field457.method5594();
                  class119.method2403();
                  class43.method849(var3);
                  class19.field136 = -1;
                  class238.method4593(false, var3);
                  field452.field1205 = null;
               }

            } else {
               if (field672 == 17 && ((class329)var2).available() >= 2) {
                  var3.field4181 = 0;
                  ((class329)var2).vmethod5856(var3.payload, 0, 2);
                  var3.field4181 = 0;
                  class327.field3869 = var3.method6655();
                  field672 = 18;
               }

               if (field672 == 18 && ((class329)var2).available() >= class327.field3869) {
                  var3.field4181 = 0;
                  ((class329)var2).vmethod5856(var3.payload, 0, class327.field3869);
                  var3.field4181 = 0;
                  String var27 = var3.method6569();
                  String var31 = var3.method6569();
                  String var32 = var3.method6569();
                  method1315(var27, var31, var32);
                  class16.method163(10);
               }

               if (field672 == 19) {
                  if (field452.field1208 == -1) {
                     if (((class329)var2).available() < 2) {
                        return;
                     }

                     ((class329)var2).vmethod5856(var3.payload, 0, 2);
                     var3.field4181 = 0;
                     field452.field1208 = var3.method6655();
                  }

                  if (((class329)var2).available() >= field452.field1208) {
                     ((class329)var2).vmethod5856(var3.payload, 0, field452.field1208);
                     var3.field4181 = 0;
                     var34 = field452.field1208;
                     field457.method5583();
                     class288.method5124();
                     class43.method849(var3);
                     if (var34 != var3.field4181 * -1084587701) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field438;
                  if (field438 > 2000) {
                     if (field439 < 1) {
                        if (class169.field1981 == class290.field3678) {
                           class290.field3678 = class4.field6;
                        } else {
                           class290.field3678 = class169.field1981;
                        }

                        ++field439;
                        field672 = 0;
                     } else {
                        class265.method4837(-3);
                     }
                  }
               }
            }
         }
      } catch (IOException var22) {
         if (field439 < 1) {
            if (class290.field3678 == class169.field1981) {
               class290.field3678 = class4.field6;
            } else {
               class290.field3678 = class169.field1981;
            }

            ++field439;
            field672 = 0;
         } else {
            class265.method4837(-2);
         }
      }
   }

   final void method914() {
      class209.method4248();
      if (field687 == null) {
         if (field580 == null) {
            int var3;
            int var5;
            int var6;
            int var9;
            int var19;
            label224: {
               int var2 = class19.field148;
               int var4;
               int var7;
               if (field543) {
                  if (var2 != 1 && (class310.field3776 || var2 != 4)) {
                     var3 = class19.field141;
                     var4 = class19.field144;
                     if (var3 < class149.field1658 - 10 || var3 > class149.field1658 + class11.field68 + 10 || var4 < class334.field3906 - 10 || var4 > class51.field771 + class334.field3906 + 10) {
                        field543 = false;
                        var5 = class149.field1658;
                        var6 = class334.field3906;
                        var7 = class11.field68;
                        var19 = class51.field771;

                        for(var9 = 0; var9 < field590; ++var9) {
                           if (field621[var9] + field622[var9] > var5 && field622[var9] < var7 + var5 && field625[var9] + field618[var9] > var6 && field625[var9] < var19 + var6) {
                              field616[var9] = true;
                           }
                        }
                     }
                  }

                  if (var2 == 1 || !class310.field3776 && var2 == 4) {
                     var3 = class149.field1658;
                     var4 = class334.field3906;
                     var5 = class11.field68;
                     var6 = class19.field149;
                     var7 = class19.field150;
                     var19 = -1;

                     int var10;
                     for(var9 = 0; var9 < field544 * -286331153; ++var9) {
                        var10 = var4 + (field544 * -286331153 - 1 - var9) * 15 + 31;
                        if (var6 > var3 && var6 < var5 + var3 && var7 > var10 - 13 && var7 < var10 + 3) {
                           var19 = var9;
                        }
                     }

                     int var11;
                     int var12;
                     if (var19 != -1 && var19 >= 0) {
                        var9 = field677[var19];
                        var10 = field546[var19];
                        var11 = field547[var19];
                        var12 = field548[var19];
                        String var15 = field484[var19];
                        String var14 = field550[var19];
                        class121.method2421(var9, var10, var11, var12, var15, var14, class19.field149, class19.field150);
                     }

                     field543 = false;
                     var9 = class149.field1658;
                     var10 = class334.field3906;
                     var11 = class11.field68;
                     var12 = class51.field771;

                     for(int var13 = 0; var13 < field590; ++var13) {
                        if (field621[var13] + field622[var13] > var9 && field622[var13] < var9 + var11 && field618[var13] + field625[var13] > var10 && field625[var13] < var10 + var12) {
                           field616[var13] = true;
                        }
                     }
                  }
               } else {
                  var3 = class159.method3135();
                  if ((var2 == 1 || !class310.field3776 && var2 == 4) && var3 >= 0) {
                     var4 = field547[var3];
                     if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
                        var5 = field677[var3];
                        var6 = field546[var3];
                        class248 var16 = class86.method2063(var6);
                        if (class146.method2747(class240.method4608(var16))) {
                           break label224;
                        }

                        var9 = class240.method4608(var16);
                        boolean var8 = (var9 >> 29 & 1) != 0;
                        if (var8) {
                           break label224;
                        }
                     }
                  }

                  if ((var2 == 1 || !class310.field3776 && var2 == 4) && this.method1024()) {
                     var2 = 2;
                  }

                  if ((var2 == 1 || !class310.field3776 && var2 == 4) && field544 * -286331153 > 0 && var3 >= 0) {
                     var4 = field677[var3];
                     var5 = field546[var3];
                     var6 = field547[var3];
                     var7 = field548[var3];
                     String var17 = field484[var3];
                     String var18 = field550[var3];
                     class121.method2421(var4, var5, var6, var7, var17, var18, class19.field149, class19.field150);
                  }

                  if (var2 == 2 && field544 * -286331153 > 0) {
                     this.method916(class19.field149, class19.field150);
                  }
               }

               return;
            }

            if (field687 != null && !field519 && field544 * -286331153 > 0 && !this.method1024()) {
               var19 = field403;
               var9 = field583;
               class27.method542(class105.field1304, var19, var9);
               class105.field1304 = null;
            }

            field519 = false;
            field520 = 0;
            if (field687 != null) {
               class80.method1934(field687);
            }

            field687 = class86.method2063(var6);
            field515 = var5;
            field403 = class19.field149;
            field583 = class19.field150;
            if (var3 >= 0) {
               class105.field1304 = new class53();
               class105.field1304.field790 = field677[var3];
               class105.field1304.field786 = field546[var3];
               class105.field1304.field785 = field547[var3];
               class105.field1304.field788 = field548[var3];
               class105.field1304.field789 = field484[var3];
            }

            class80.method1934(field687);
         }
      }
   }

   final void method919() {
      class80.method1934(field580);
      ++class106.field1318;
      if (field588 && field585) {
         int var2 = class19.field141;
         int var3 = class19.field144;
         var2 -= field582;
         var3 -= field524;
         if (var2 < field586) {
            var2 = field586;
         }

         if (var2 + field580.field2972 > field586 + field581.field2972) {
            var2 = field586 + field581.field2972 - field580.field2972;
         }

         if (var3 < field587) {
            var3 = field587;
         }

         if (var3 + field580.field2989 > field587 + field581.field2989) {
            var3 = field587 + field581.field2989 - field580.field2989;
         }

         int var4 = var2 - field678;
         int var5 = var3 - field676;
         int var6 = field580.field3039;
         if (class106.field1318 > field580.field2956 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
            field591 = true;
         }

         int var7 = var2 - field586 + field581.field3053;
         int var8 = var3 - field587 + field581.field2967;
         class67 var9;
         if (field580.field2994 != null && field591) {
            var9 = new class67();
            var9.field960 = field580;
            var9.field952 = var7;
            var9.field955 = var8;
            var9.field954 = field580.field2994;
            class94.method2123(var9);
         }

         if (class19.field140 == 0) {
            if (field591) {
               if (field580.field3080 != null) {
                  var9 = new class67();
                  var9.field960 = field580;
                  var9.field952 = var7;
                  var9.field955 = var8;
                  var9.field957 = field584;
                  var9.field954 = field580.field3080;
                  class94.method2123(var9);
               }

               if (field584 != null && class122.method2437(field580) != null) {
                  class228 var12 = class148.method2788(class226.field2661, field452.field1204);
                  var12.field2690.method6606(field580.field2957);
                  var12.field2690.method6596(field584.field3030);
                  var12.field2690.method6689(field580.field3087);
                  var12.field2690.method6689(field584.field3087);
                  var12.field2690.method6596(field580.field3030);
                  var12.field2690.writeInt(field584.field2957);
                  field452.method2031(var12);
               }
            } else if (this.method1024()) {
               this.method916(field678 + field582, field524 + field676);
            } else if (field544 * -286331153 > 0) {
               int var11 = field582 + field678;
               int var10 = field676 + field524;
               class27.method542(class105.field1304, var11, var10);
               class105.field1304 = null;
            }

            field580 = null;
         }

      } else {
         if (class106.field1318 > 1) {
            field580 = null;
         }

      }
   }

   void method918(class248 var1) {
      class248 var3 = var1.field3000 == -1 ? null : class86.method2063(var1.field3000);
      int var4;
      int var5;
      if (var3 == null) {
         var4 = class68.field970;
         var5 = field686;
      } else {
         var4 = var3.field2972;
         var5 = var3.field2989;
      }

      class286.method5100(var1, var4, var5, false);
      class27.method543(var1, var4, var5);
   }

   public final void init() {
      if (this.method197()) {
         for(int var1 = 0; var1 <= 20; ++var1) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
               switch(var1) {
               case 1:
                  field456 = Integer.parseInt(var2) != 0;
               case 2:
               case 11:
               case 13:
               case 16:
               default:
                  break;
               case 3:
                  if (var2.equalsIgnoreCase("true")) {
                     field561 = true;
                  } else {
                     field561 = false;
                  }
                  break;
               case 4:
                  if (field409 == -1) {
                     field409 = Integer.parseInt(var2);
                  }
                  break;
               case 5:
                  field405 = Integer.parseInt(var2);
                  break;
               case 6:
                  class283.field3643 = class291.method5137(Integer.parseInt(var2));
                  break;
               case 7:
                  int var4 = Integer.parseInt(var2);
                  class264[] var5 = class61.method1701();
                  int var6 = 0;

                  class264 var3;
                  while(true) {
                     if (var6 >= var5.length) {
                        var3 = null;
                        break;
                     }

                     class264 var7 = var5[var6];
                     if (var4 == var7.field3199) {
                        var3 = var7;
                        break;
                     }

                     ++var6;
                  }

                  class201.field2349 = var3;
                  break;
               case 8:
                  if (var2.equalsIgnoreCase("true")) {
                  }
                  break;
               case 9:
                  class149.field1660 = var2;
                  break;
               case 10:
                  class68.field975 = (class265)class250.method4750(class207.method4245(), Integer.parseInt(var2));
                  if (class68.field975 == class265.field3205) {
                     class51.field760 = class366.field4122;
                  } else {
                     class51.field760 = class366.field4121;
                  }
                  break;
               case 12:
                  field404 = Integer.parseInt(var2);
                  break;
               case 14:
                  class407.field4313 = Integer.parseInt(var2);
                  break;
               case 15:
                  field406 = Integer.parseInt(var2);
                  break;
               case 17:
                  class309.field3775 = var2;
               }
            }
         }

         class250.method4756();
         class243.field2917 = this.getCodeBase().getHost();
         String var8 = class201.field2349.field3201;
         byte var9 = 0;

         try {
            class213.method4265("oldschool", var8, var9, 21);
         } catch (Exception var10) {
            class332.method5902((String)null, var10);
         }

         class58.field873 = this;
         class96.field1258 = field409;
         if (field473 == -1) {
            field473 = 0;
         }

         this.method260(765, 503, 198);
      }
   }

   static void method1315(String var0, String var1, String var2) {
      class55.field822 = var0;
      class55.field813 = var1;
      class55.field815 = var2;
   }

   static final int method1313(long var0, String var2) {
      Random var4 = new Random();
      class384 var5 = new class384(128);
      class384 var6 = new class384(128);
      int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
      var5.writeByte(10);

      int var8;
      for(var8 = 0; var8 < 4; ++var8) {
         var5.writeInt(var4.nextInt());
      }

      var5.writeInt(var7[0]);
      var5.writeInt(var7[1]);
      var5.method6548(var0);
      var5.method6548(0L);

      for(var8 = 0; var8 < 4; ++var8) {
         var5.writeInt(var4.nextInt());
      }

      var5.method6583(class52.field775, class52.field772);
      var6.writeByte(10);

      for(var8 = 0; var8 < 3; ++var8) {
         var6.writeInt(var4.nextInt());
      }

      var6.method6548(var4.nextLong());
      var6.method6635(var4.nextLong());
      class144.method2734(var6);
      var6.method6548(var4.nextLong());
      var6.method6583(class52.field775, class52.field772);
      var8 = class280.method5040(var2);
      if (var8 % 8 != 0) {
         var8 += 8 - var8 % 8;
      }

      class384 var9 = new class384(var8);
      var9.method6550(var2);
      var9.field4181 = var8 * 99;
      var9.method6544(var7);
      class384 var10 = new class384(var9.field4181 * -1084587701 + var6.field4181 * -1084587701 + var5.field4181 * -1084587701 + 5);
      var10.writeByte(2);
      var10.writeByte(var5.field4181 * -1084587701);
      var10.method6615(var5.payload, 0, var5.field4181 * -1084587701);
      var10.writeByte(var6.field4181 * -1084587701);
      var10.method6615(var6.payload, 0, var6.field4181 * -1084587701);
      var10.method6734(var9.field4181 * -1084587701);
      var10.method6615(var9.payload, 0, var9.field4181 * -1084587701);
      byte[] var12 = var10.payload;
      int var14 = var12.length;
      StringBuilder var15 = new StringBuilder();

      int var18;
      for(int var16 = 0; var16 < var14 + 0; var16 += 3) {
         int var17 = var12[var16] & 255;
         var15.append(class304.field3755[var17 >>> 2]);
         if (var16 < var14 - 1) {
            var18 = var12[var16 + 1] & 255;
            var15.append(class304.field3755[(var17 & 3) << 4 | var18 >>> 4]);
            if (var16 < var14 - 2) {
               int var19 = var12[var16 + 2] & 255;
               var15.append(class304.field3755[(var18 & 15) << 2 | var19 >>> 6]).append(class304.field3755[var19 & 63]);
            } else {
               var15.append(class304.field3755[(var18 & 15) << 2]).append("=");
            }
         } else {
            var15.append(class304.field3755[(var17 & 3) << 4]).append("==");
         }
      }

      String var13 = var15.toString();
      var13 = var13;

      try {
         URL var21 = new URL(class91.method2099("services", false) + "m=accountappeal/login.ws");
         URLConnection var27 = var21.openConnection();
         var27.setDoInput(true);
         var27.setDoOutput(true);
         var27.setConnectTimeout(5000);
         OutputStreamWriter var22 = new OutputStreamWriter(var27.getOutputStream());
         var22.write("data2=" + class136.method2611(var13) + "&dest=" + class136.method2611("passwordchoice.ws"));
         var22.flush();
         InputStream var23 = var27.getInputStream();
         var10 = new class384(new byte[1000]);

         do {
            var18 = var23.read(var10.payload, var10.field4181 * -1084587701, 1000 - var10.field4181 * -1084587701);
            if (var18 == -1) {
               var22.close();
               var23.close();
               String var24 = new String(var10.payload);
               if (var24.startsWith("OFFLINE")) {
                  return 4;
               } else if (var24.startsWith("WRONG")) {
                  return 7;
               } else if (var24.startsWith("RELOAD")) {
                  return 3;
               } else if (var24.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var10.method6580(var7);

                  while(var10.field4181 * -1084587701 > 0 && var10.payload[var10.field4181 * -1084587701 - 1] == 0) {
                     var10.field4181 -= 99;
                  }

                  var24 = new String(var10.payload, 0, var10.field4181 * -1084587701);
                  boolean var28;
                  if (var24 == null) {
                     var28 = false;
                  } else {
                     label87: {
                        try {
                           new URL(var24);
                        } catch (MalformedURLException var25) {
                           var28 = false;
                           break label87;
                        }

                        var28 = true;
                     }
                  }

                  if (var28) {
                     class138.method2628(var24, true, false);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var10.field4181 = (var10.field4181 * -1084587701 + var18) * 99;
         } while(var10.field4181 * -1084587701 < 1000);

         return 5;
      } catch (Throwable var26) {
         var26.printStackTrace();
         return 5;
      }
   }

   static final void method1314(int var0, int var1, int var2, int var3, int var4, int var5, class199 var6, class159 var7) {
      if (!field408 || (class61.field900[0][var1][var2] & 2) != 0 || (class61.field900[var0][var1][var2] & 16) == 0) {
         if (var0 < class61.field901) {
            class61.field901 = var0;
         }

         class155 var9 = class123.method2465(var3);
         int var10;
         int var11;
         if (var4 != 1 && var4 != 3) {
            var10 = var9.field1749;
            var11 = var9.field1750;
         } else {
            var10 = var9.field1750;
            var11 = var9.field1749;
         }

         int var12;
         int var13;
         if (var10 + var1 <= 104) {
            var12 = (var10 >> 1) + var1;
            var13 = (var10 + 1 >> 1) + var1;
         } else {
            var12 = var1;
            var13 = var1 + 1;
         }

         int var14;
         int var15;
         if (var11 + var2 <= 104) {
            var14 = (var11 >> 1) + var2;
            var15 = var2 + (var11 + 1 >> 1);
         } else {
            var14 = var2;
            var15 = var2 + 1;
         }

         int[][] var16 = class61.field910[var0];
         int var17 = var16[var13][var15] + var16[var12][var15] + var16[var12][var14] + var16[var13][var14] >> 2;
         int var18 = (var1 << 7) + (var10 << 6);
         int var19 = (var2 << 7) + (var11 << 6);
         long var20 = class171.method3480(var1, var2, 2, var9.field1753 == 0, var3);
         int var22 = var5 + (var4 << 6);
         if (var9.field1774 == 1) {
            var22 += 256;
         }

         if (var9.method2933()) {
            class167.method3287(var0, var1, var2, var9, var4);
         }

         Object var23;
         if (var5 == 22) {
            if (!field408 || var9.field1753 != 0 || var9.field1751 == 1 || var9.field1758) {
               if (var9.field1757 == -1 && var9.field1761 == null) {
                  var23 = var9.method2926(22, var4, var16, var18, var17, var19);
               } else {
                  var23 = new class59(var3, 22, var4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
               }

               var6.method4029(var0, var1, var2, var17, (class200)var23, var20, var22);
               if (var9.field1751 == 1 && var7 != null) {
                  var7.method3127(var1, var2);
               }

            }
         } else {
            int var24;
            if (var5 != 10 && var5 != 11) {
               int[] var10000;
               if (var5 >= 12) {
                  if (var9.field1757 == -1 && var9.field1761 == null) {
                     var23 = var9.method2926(var5, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class59(var3, var5, var4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                  }

                  var6.method3911(var0, var1, var2, var17, 1, 1, (class200)var23, 0, var20, var22);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     var10000 = class163.field1914[var0][var1];
                     var10000[var2] |= 2340;
                  }

                  if (var9.field1751 != 0 && var7 != null) {
                     var7.method3133(var1, var2, var10, var11, var9.field1778);
                  }

               } else if (var5 == 0) {
                  if (var9.field1757 == -1 && var9.field1761 == null) {
                     var23 = var9.method2926(0, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class59(var3, 0, var4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                  }

                  var6.method3909(var0, var1, var2, var17, (class200)var23, (class200)null, class61.field907[var4], 0, var20, var22);
                  if (var4 == 0) {
                     if (var9.field1764) {
                        class250.field3113[var0][var1][var2] = 50;
                        class250.field3113[var0][var1][var2 + 1] = 50;
                     }

                     if (var9.field1756) {
                        var10000 = class163.field1914[var0][var1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 1) {
                     if (var9.field1764) {
                        class250.field3113[var0][var1][var2 + 1] = 50;
                        class250.field3113[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var9.field1756) {
                        var10000 = class163.field1914[var0][var1];
                        var10000[var2 + 1] |= 1170;
                     }
                  } else if (var4 == 2) {
                     if (var9.field1764) {
                        class250.field3113[var0][var1 + 1][var2] = 50;
                        class250.field3113[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var9.field1756) {
                        var10000 = class163.field1914[var0][var1 + 1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 3) {
                     if (var9.field1764) {
                        class250.field3113[var0][var1][var2] = 50;
                        class250.field3113[var0][var1 + 1][var2] = 50;
                     }

                     if (var9.field1756) {
                        var10000 = class163.field1914[var0][var1];
                        var10000[var2] |= 1170;
                     }
                  }

                  if (var9.field1751 != 0 && var7 != null) {
                     var7.method3102(var1, var2, var5, var4, var9.field1778);
                  }

                  if (var9.field1744 != 16) {
                     var6.method3917(var0, var1, var2, var9.field1744);
                  }

               } else if (var5 == 1) {
                  if (var9.field1757 == -1 && var9.field1761 == null) {
                     var23 = var9.method2926(1, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class59(var3, 1, var4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                  }

                  var6.method3909(var0, var1, var2, var17, (class200)var23, (class200)null, class61.field908[var4], 0, var20, var22);
                  if (var9.field1764) {
                     if (var4 == 0) {
                        class250.field3113[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        class250.field3113[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        class250.field3113[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        class250.field3113[var0][var1][var2] = 50;
                     }
                  }

                  if (var9.field1751 != 0 && var7 != null) {
                     var7.method3102(var1, var2, var5, var4, var9.field1778);
                  }

               } else {
                  int var29;
                  if (var5 == 2) {
                     var29 = var4 + 1 & 3;
                     Object var30;
                     Object var31;
                     if (var9.field1757 == -1 && var9.field1761 == null) {
                        var30 = var9.method2926(2, var4 + 4, var16, var18, var17, var19);
                        var31 = var9.method2926(2, var29, var16, var18, var17, var19);
                     } else {
                        var30 = new class59(var3, 2, var4 + 4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                        var31 = new class59(var3, 2, var29, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                     }

                     var6.method3909(var0, var1, var2, var17, (class200)var30, (class200)var31, class61.field907[var4], class61.field907[var29], var20, var22);
                     if (var9.field1756) {
                        if (var4 == 0) {
                           var10000 = class163.field1914[var0][var1];
                           var10000[var2] |= 585;
                           var10000 = class163.field1914[var0][var1];
                           var10000[var2 + 1] |= 1170;
                        } else if (var4 == 1) {
                           var10000 = class163.field1914[var0][var1];
                           var10000[1 + var2] |= 1170;
                           var10000 = class163.field1914[var0][var1 + 1];
                           var10000[var2] |= 585;
                        } else if (var4 == 2) {
                           var10000 = class163.field1914[var0][var1 + 1];
                           var10000[var2] |= 585;
                           var10000 = class163.field1914[var0][var1];
                           var10000[var2] |= 1170;
                        } else if (var4 == 3) {
                           var10000 = class163.field1914[var0][var1];
                           var10000[var2] |= 1170;
                           var10000 = class163.field1914[var0][var1];
                           var10000[var2] |= 585;
                        }
                     }

                     if (var9.field1751 != 0 && var7 != null) {
                        var7.method3102(var1, var2, var5, var4, var9.field1778);
                     }

                     if (var9.field1744 != 16) {
                        var6.method3917(var0, var1, var2, var9.field1744);
                     }

                  } else if (var5 == 3) {
                     if (var9.field1757 == -1 && var9.field1761 == null) {
                        var23 = var9.method2926(3, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class59(var3, 3, var4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                     }

                     var6.method3909(var0, var1, var2, var17, (class200)var23, (class200)null, class61.field908[var4], 0, var20, var22);
                     if (var9.field1764) {
                        if (var4 == 0) {
                           class250.field3113[var0][var1][var2 + 1] = 50;
                        } else if (var4 == 1) {
                           class250.field3113[var0][var1 + 1][var2 + 1] = 50;
                        } else if (var4 == 2) {
                           class250.field3113[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           class250.field3113[var0][var1][var2] = 50;
                        }
                     }

                     if (var9.field1751 != 0 && var7 != null) {
                        var7.method3102(var1, var2, var5, var4, var9.field1778);
                     }

                  } else if (var5 == 9) {
                     if (var9.field1757 == -1 && var9.field1761 == null) {
                        var23 = var9.method2926(var5, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class59(var3, var5, var4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                     }

                     var6.method3911(var0, var1, var2, var17, 1, 1, (class200)var23, 0, var20, var22);
                     if (var9.field1751 != 0 && var7 != null) {
                        var7.method3133(var1, var2, var10, var11, var9.field1778);
                     }

                     if (var9.field1744 != 16) {
                        var6.method3917(var0, var1, var2, var9.field1744);
                     }

                  } else if (var5 == 4) {
                     if (var9.field1757 == -1 && var9.field1761 == null) {
                        var23 = var9.method2926(4, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class59(var3, 4, var4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                     }

                     var6.method3910(var0, var1, var2, var17, (class200)var23, (class200)null, class61.field907[var4], 0, 0, 0, var20, var22);
                  } else {
                     long var32;
                     Object var34;
                     if (var5 == 5) {
                        var29 = 16;
                        var32 = var6.method3927(var0, var1, var2);
                        if (var32 != 0L) {
                           var29 = class123.method2465(class78.method1904(var32)).field1744;
                        }

                        if (var9.field1757 == -1 && var9.field1761 == null) {
                           var34 = var9.method2926(4, var4, var16, var18, var17, var19);
                        } else {
                           var34 = new class59(var3, 4, var4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                        }

                        var6.method3910(var0, var1, var2, var17, (class200)var34, (class200)null, class61.field907[var4], 0, var29 * class61.field905[var4], var29 * class61.field912[var4], var20, var22);
                     } else if (var5 == 6) {
                        var29 = 8;
                        var32 = var6.method3927(var0, var1, var2);
                        if (var32 != 0L) {
                           var29 = class123.method2465(class78.method1904(var32)).field1744 / 2;
                        }

                        if (var9.field1757 == -1 && var9.field1761 == null) {
                           var34 = var9.method2926(4, var4 + 4, var16, var18, var17, var19);
                        } else {
                           var34 = new class59(var3, 4, var4 + 4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                        }

                        var6.method3910(var0, var1, var2, var17, (class200)var34, (class200)null, 256, var4, var29 * class61.field903[var4], var29 * class61.field914[var4], var20, var22);
                     } else if (var5 == 7) {
                        var24 = var4 + 2 & 3;
                        if (var9.field1757 == -1 && var9.field1761 == null) {
                           var23 = var9.method2926(4, var24 + 4, var16, var18, var17, var19);
                        } else {
                           var23 = new class59(var3, 4, var24 + 4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                        }

                        var6.method3910(var0, var1, var2, var17, (class200)var23, (class200)null, 256, var24, 0, 0, var20, var22);
                     } else if (var5 == 8) {
                        var29 = 8;
                        var32 = var6.method3927(var0, var1, var2);
                        if (0L != var32) {
                           var29 = class123.method2465(class78.method1904(var32)).field1744 / 2;
                        }

                        int var28 = var4 + 2 & 3;
                        Object var27;
                        if (var9.field1757 == -1 && var9.field1761 == null) {
                           var34 = var9.method2926(4, var4 + 4, var16, var18, var17, var19);
                           var27 = var9.method2926(4, var28 + 4, var16, var18, var17, var19);
                        } else {
                           var34 = new class59(var3, 4, var4 + 4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                           var27 = new class59(var3, 4, var28 + 4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
                        }

                        var6.method3910(var0, var1, var2, var17, (class200)var34, (class200)var27, 256, var4, var29 * class61.field903[var4], var29 * class61.field914[var4], var20, var22);
                     }
                  }
               }
            } else {
               if (var9.field1757 == -1 && var9.field1761 == null) {
                  var23 = var9.method2926(10, var4, var16, var18, var17, var19);
               } else {
                  var23 = new class59(var3, 10, var4, var0, var1, var2, var9.field1757, var9.field1733, (class200)null);
               }

               if (var23 != null && var6.method3911(var0, var1, var2, var17, var10, var11, (class200)var23, var5 == 11 ? 256 : 0, var20, var22) && var9.field1764) {
                  var24 = 15;
                  if (var23 instanceof class206) {
                     var24 = ((class206)var23).method4139() / 4;
                     if (var24 > 30) {
                        var24 = 30;
                     }
                  }

                  for(int var25 = 0; var25 <= var10; ++var25) {
                     for(int var26 = 0; var26 <= var11; ++var26) {
                        if (var24 > class250.field3113[var0][var25 + var1][var26 + var2]) {
                           class250.field3113[var0][var25 + var1][var26 + var2] = (byte)var24;
                        }
                     }
                  }
               }

               if (var9.field1751 != 0 && var7 != null) {
                  var7.method3133(var1, var2, var10, var11, var9.field1778);
               }

            }
         }
      }
   }
}
