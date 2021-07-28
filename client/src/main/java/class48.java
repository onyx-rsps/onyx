public class class48 {
   int field713;
   final class366 field710;
   public final class316 field712;
   public final class318 field711;

   class48(class366 var1) {
      this.field713 = 0;
      this.field710 = var1;
      this.field711 = new class318(var1);
      this.field712 = new class316(var1);
   }

   final boolean method1361(class405 var1) {
      class320 var3 = (class320)this.field711.method5733(var1);
      return var3 != null && var3.method5827();
   }

   final boolean method1371() {
      return this.field712.method5797() || this.field712.method5744() >= 100 && client.field525 != 1;
   }

   final boolean method1380() {
      return this.field711.method5797() || this.field711.method5744() >= 200 && client.field525 != 1;
   }

   final boolean method1367(class405 var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1.equals(class19.field139.field979)) {
         return true;
      } else {
         return this.field711.method5624(var1, var2);
      }
   }

   final boolean method1368(class405 var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.field712.method5754(var1);
      }
   }

   final void method1362(class384 var1, int var2) {
      this.field711.method5618(var1, var2);
      this.field713 = 2;
      class107.method2225();
   }

   final void method1372() {
      this.field713 = 1;
   }

   boolean method1405() {
      return this.field713 == 2;
   }

   final void method1369(String var1) {
      if (var1 != null) {
         class405 var3 = new class405(var1, this.field710);
         if (var3.method7143()) {
            if (this.method1380()) {
               class158.method3098();
            } else if (class19.field139.field979.equals(var3)) {
               class19.method369("You can't add yourself to your own friend list");
            } else if (this.method1367(var3, false)) {
               class19.method369(var1 + " is already on your friend list");
            } else if (this.method1368(var3)) {
               class19.method369("Please remove " + var1 + " from your ignore list first");
            } else {
               class228 var4 = class148.method2788(class226.field2564, client.field452.field1204);
               var4.field2690.writeByte(class280.method5040(var1));
               var4.field2690.method6550(var1);
               client.field452.method2031(var4);
            }
         }
      }
   }

   final void method1373(String var1) {
      if (var1 != null) {
         class405 var3 = new class405(var1, this.field710);
         if (var3.method7143()) {
            if (this.field711.method5736(var3)) {
               client.field609 = client.field592;
               class228 var4 = class148.method2788(class226.field2636, client.field452.field1204);
               var4.field2690.writeByte(class280.method5040(var1));
               var4.field2690.method6550(var1);
               client.field452.method2031(var4);
            }

            class107.method2225();
         }
      }
   }

   final void method1427(String var1) {
      if (var1 != null) {
         class405 var3 = new class405(var1, this.field710);
         if (var3.method7143()) {
            if (this.method1371()) {
               class315.method5598();
            } else if (class19.field139.field979.equals(var3)) {
               class270.method4850();
            } else if (this.method1368(var3)) {
               class19.method369(var1 + " is already on your ignore list");
            } else if (this.method1367(var3, false)) {
               class19.method369("Please remove " + var1 + " from your friend list first");
            } else {
               class376.method6465(var1);
            }
         }
      }
   }

   final void method1413(String var1) {
      if (var1 != null) {
         class405 var3 = new class405(var1, this.field710);
         if (var3.method7143()) {
            if (this.field712.method5736(var3)) {
               class124.method2471();
               class228 var4 = class148.method2788(class226.field2578, client.field452.field1204);
               var4.field2690.writeByte(class280.method5040(var1));
               var4.field2690.method6550(var1);
               client.field452.method2031(var4);
            }

            class252.method4765();
         }
      }
   }

   final void method1365() {
      for(class321 var2 = (class321)this.field711.field3829.method5309(); var2 != null; var2 = (class321)this.field711.field3829.method5310()) {
         if ((long)var2.field3846 < class86.currentTime() / 1000L - 5L) {
            if (var2.field3845 > 0) {
               class120.method2408(5, "", var2.field3843 + " has logged in.");
            }

            if (var2.field3845 == 0) {
               class120.method2408(5, "", var2.field3843 + " has logged out.");
            }

            var2.method6009();
         }
      }

   }

   final void method1366() {
      this.field713 = 0;
      this.field711.method5729();
      this.field712.method5729();
   }

   public static class139 method1426(int var0) {
      class139 var2 = (class139)class139.field1525.method4306((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class139.field1528.method4920(16, var0);
         var2 = new class139();
         if (var3 != null) {
            var2.method2630(new class384(var3));
         }

         class139.field1525.method4308(var2, (long)var0);
         return var2;
      }
   }

   static final void method1425(int var0, int var1) {
      class295 var3 = client.field535[class284.field3651][var0][var1];
      if (var3 == null) {
         class165.field1924.method3922(class284.field3651, var0, var1);
      } else {
         long var4 = -99999999L;
         class81 var6 = null;

         class81 var7;
         for(var7 = (class81)var3.method5202(); var7 != null; var7 = (class81)var3.method5193()) {
            class156 var8 = class10.method105(var7.field1166);
            long var9 = (long)var8.field1806;
            if (var8.field1805 == 1) {
               var9 *= (long)(var7.field1163 + 1);
            }

            if (var9 > var4) {
               var4 = var9;
               var6 = var7;
            }
         }

         if (var6 == null) {
            class165.field1924.method3922(class284.field3651, var0, var1);
         } else {
            var3.method5188(var6);
            class81 var13 = null;
            class81 var12 = null;

            for(var7 = (class81)var3.method5202(); var7 != null; var7 = (class81)var3.method5193()) {
               if (var7.field1166 != var6.field1166) {
                  if (var13 == null) {
                     var13 = var7;
                  }

                  if (var7.field1166 != var13.field1166 && var12 == null) {
                     var12 = var7;
                  }
               }
            }

            long var10 = class171.method3480(var0, var1, 3, false, 0);
            class165.field1924.method3908(class284.field3651, var0, var1, class122.method2438(var0 * 128 + 64, var1 * 128 + 64, class284.field3651), var6, var10, var13, var12);
         }
      }
   }

   public static void method1384(class276 var0) {
      class151.field1691 = var0;
   }
}
