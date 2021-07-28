import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class class213 {
   int field2520;
   int field2521;
   int field2523;
   int field2524;
   int field2525;
   int field2526;
   int field2529;
   int field2530;
   public class200 field2527;
   public class200 field2528;
   public long field2522;

   class213() {
      this.field2522 = 0L;
      this.field2530 = 0;
   }

   public static boolean method4266(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var2 = class303.field3754;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               char var4 = var2[var3];
               if (var0 == var4) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public static void method4265(String var0, String var1, int var2, int var3) throws IOException {
      class11.field70 = var3;
      class80.field1160 = var2;

      try {
         class75.field1123 = System.getProperty("os.name");
      } catch (Exception var16) {
         class75.field1123 = "Unknown";
      }

      class190.field2131 = class75.field1123.toLowerCase();

      try {
         class234.field2822 = System.getProperty("user.home");
         if (class234.field2822 != null) {
            class234.field2822 = class234.field2822 + "/";
         }
      } catch (Exception var15) {
      }

      try {
         if (class190.field2131.startsWith("win")) {
            if (class234.field2822 == null) {
               class234.field2822 = System.getenv("USERPROFILE");
            }
         } else if (class234.field2822 == null) {
            class234.field2822 = System.getenv("HOME");
         }

         if (class234.field2822 != null) {
            class234.field2822 = class234.field2822 + "/";
         }
      } catch (Exception var14) {
      }

      if (class234.field2822 == null) {
         class234.field2822 = "~/";
      }

      class95.field1253 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class234.field2822, "/tmp/", ""};
      class254.field3126 = new String[]{".jagex_cache_" + class80.field1160, ".file_store_" + class80.field1160};
      int var10 = 0;

      label115:
      while(var10 < 4) {
         class130.field1474 = class12.method125(var0, var1, var10);
         if (!class130.field1474.exists()) {
            class130.field1474.mkdirs();
         }

         File[] var6 = class130.field1474.listFiles();
         if (var6 == null) {
            break;
         }

         File[] var7 = var6;
         int var8 = 0;

         while(true) {
            if (var8 >= var7.length) {
               break label115;
            }

            File var9 = var7[var8];
            if (!class51.method1577(var9, false)) {
               ++var10;
               break;
            }

            ++var8;
         }
      }

      class229.method4354(class130.field1474);

      try {
         File var5 = new File(class234.field2822, "random.dat");
         int var12;
         if (var5.exists()) {
            class130.field1470 = new class369(new class368(var5, "rw", 25L), 24, 0);
         } else {
            label97:
            for(int var11 = 0; var11 < class254.field3126.length; ++var11) {
               for(var12 = 0; var12 < class95.field1253.length; ++var12) {
                  File var13 = new File(class95.field1253[var12] + class254.field3126[var11] + File.separatorChar + "random.dat");
                  if (var13.exists()) {
                     class130.field1470 = new class369(new class368(var13, "rw", 25L), 24, 0);
                     break label97;
                  }
               }
            }
         }

         if (class130.field1470 == null) {
            RandomAccessFile var18 = new RandomAccessFile(var5, "rw");
            var12 = var18.read();
            var18.seek(0L);
            var18.write(var12);
            var18.seek(0L);
            var18.close();
            class130.field1470 = new class369(new class368(var5, "rw", 25L), 24, 0);
         }
      } catch (IOException var17) {
      }

      class130.field1476 = new class369(new class368(class62.method1704("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
      class130.field1478 = new class369(new class368(class62.method1704("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
      class319.field3839 = new class369[class11.field70];

      for(var10 = 0; var10 < class11.field70; ++var10) {
         class319.field3839[var10] = new class369(new class368(class62.method1704("main_file_cache.idx" + var10), "rw", 1048576L), 6000, 0);
      }

   }

   static int method4264(int var0, class58 var1, boolean var2) {
      class248 var4 = var2 ? class285.field3659 : class50.field749;
      if (var0 == 1800) {
         class50.field746[++class50.field745 - 1] = class103.method2182(class240.method4608(var4));
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var4.field3036 == null) {
               class50.field737[++class1.field3 - 1] = "";
            } else {
               class50.field737[++class1.field3 - 1] = var4.field3036;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class50.field746[--class50.field745];
         --var5;
         if (var4.field3037 != null && var5 < var4.field3037.length && var4.field3037[var5] != null) {
            class50.field737[++class1.field3 - 1] = var4.field3037[var5];
         } else {
            class50.field737[++class1.field3 - 1] = "";
         }

         return 1;
      }
   }

   static int method4267(int var0, int var1) {
      class64 var3 = (class64)class64.field934.method6327((long)var0);
      if (var3 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var3.field930.length ? var3.field930[var1] : -1;
      }
   }
}
