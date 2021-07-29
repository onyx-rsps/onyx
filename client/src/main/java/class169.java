import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class169 {
   static class86 field1991;
   static int field1981;
   boolean field1974;
   boolean field1978;
   class168[][] field1976;
   class188 field1990;
   class396[] field1980;
   class397 field1989;
   int field1973;
   int field1985;
   int field1986;
   int field1987;
   HashMap field1977;
   HashMap field1979;
   final class276 field1982;
   final class276 field1984;
   final HashMap field1983;
   public int field1988;

   public class169(class396[] var1, HashMap var2, class276 var3, class276 var4) {
      this.field1978 = false;
      this.field1974 = false;
      this.field1979 = new HashMap();
      this.field1988 = 0;
      this.field1980 = var1;
      this.field1983 = var2;
      this.field1984 = var3;
      this.field1982 = var4;
   }

   void method3429() {
      if (this.field1977 == null) {
         this.field1977 = new HashMap();
      }

      this.field1977.clear();

      for(int var2 = 0; var2 < this.field1976.length; ++var2) {
         for(int var3 = 0; var3 < this.field1976[var2].length; ++var3) {
            List var4 = this.field1976[var2][var3].method3321();
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               class185 var6 = (class185)var5.next();
               if (var6.method3616()) {
                  int var7 = var6.vmethod3612();
                  if (!this.field1977.containsKey(var7)) {
                     LinkedList var8 = new LinkedList();
                     var8.add(var6);
                     this.field1977.put(var7, var8);
                  } else {
                     List var9 = (List)this.field1977.get(var7);
                     var9.add(var6);
                  }
               }
            }
         }
      }

   }

   class177 method3407(int var1, int var2, int var3, int var4) {
      class177 var6 = new class177(this);
      int var7 = this.field1973 + var1;
      int var8 = var2 + this.field1985;
      int var9 = var3 + this.field1973;
      int var10 = var4 + this.field1985;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      int var14 = var10 / 64;
      var6.field2063 = var13 - var11 + 1;
      var6.field2062 = var14 - var12 + 1;
      var6.field2064 = var11 - this.field1990.method3279();
      var6.field2065 = var12 - this.field1990.method3235();
      if (var6.field2064 < 0) {
         var6.field2063 += var6.field2064;
         var6.field2064 = 0;
      }

      if (var6.field2064 > this.field1976.length - var6.field2063) {
         var6.field2063 = this.field1976.length - var6.field2064;
      }

      if (var6.field2065 < 0) {
         var6.field2062 += var6.field2065;
         var6.field2065 = 0;
      }

      if (var6.field2065 > this.field1976[0].length - var6.field2062) {
         var6.field2062 = this.field1976[0].length - var6.field2065;
      }

      var6.field2063 = Math.min(var6.field2063, this.field1976.length);
      var6.field2062 = Math.min(var6.field2062, this.field1976[0].length);
      return var6;
   }

   float method3411(int var1, int var2) {
      float var4 = (float)var1 / (float)var2;
      if (var4 > 8.0F) {
         return 8.0F;
      } else if (var4 < 1.0F) {
         return 1.0F;
      } else {
         int var5 = Math.round(var4);
         return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
      }
   }

   public boolean method3427() {
      return this.field1978;
   }

   public HashMap method3425() {
      this.method3429();
      return this.field1977;
   }

   public void method3426(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (this.field1989 != null) {
         this.field1989.method7001(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field1977 == null) {
               this.method3429();
            }

            Iterator var9 = var5.iterator();

            while(true) {
               List var11;
               do {
                  if (!var9.hasNext()) {
                     return;
                  }

                  int var10 = (Integer)var9.next();
                  var11 = (List)this.field1977.get(var10);
               } while(var11 == null);

               Iterator var12 = var11.iterator();

               while(var12.hasNext()) {
                  class185 var13 = (class185)var12.next();
                  int var14 = var3 * (var13.field2109.field2919 - this.field1973) / this.field1986;
                  int var15 = var4 - (var13.field2109.field2921 - this.field1985) * var4 / this.field1987;
                  class393.method6878(var14 + var1, var15 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public void method3402(class276 var1, String var2, boolean var3) {
      if (!this.field1974) {
         this.field1978 = false;
         this.field1974 = true;
         System.nanoTime();
         int var5 = var1.method4936(class186.field2117.field2113);
         int var6 = var1.method4938(var5, var2);
         Buffer var7 = new Buffer(var1.method4940(class186.field2117.field2113, var2));
         Buffer var8 = new Buffer(var1.method4940(class186.field2115.field2113, var2));
         System.nanoTime();
         System.nanoTime();
         this.field1990 = new class188();

         try {
            this.field1990.method3666(var7, var8, var6, var3);
         } catch (IllegalStateException var20) {
            return;
         }

         this.field1990.method3248();
         this.field1990.method3238();
         this.field1990.method3239();
         this.field1973 = this.field1990.method3279() * 64;
         this.field1985 = this.field1990.method3235() * 64;
         this.field1986 = (this.field1990.method3234() - this.field1990.method3279() + 1) * 64;
         this.field1987 = (this.field1990.method3236() - this.field1990.method3235() + 1) * 64;
         int var17 = this.field1990.method3234() - this.field1990.method3279() + 1;
         int var10 = this.field1990.method3236() - this.field1990.method3235() + 1;
         System.nanoTime();
         System.nanoTime();
         class139.method2644();
         this.field1976 = new class168[var17][var10];
         Iterator var11 = this.field1990.field2124.iterator();

         while(var11.hasNext()) {
            class162 var12 = (class162)var11.next();
            int var13 = var12.field2048;
            int var14 = var12.field2052;
            int var15 = var13 - this.field1990.method3279();
            int var16 = var14 - this.field1990.method3235();
            this.field1976[var15][var16] = new class168(var13, var14, this.field1990.method3231(), this.field1983);
            this.field1976[var15][var16].method3290(var12, this.field1990.field2123);
         }

         for(int var18 = 0; var18 < var17; ++var18) {
            for(int var19 = 0; var19 < var10; ++var19) {
               if (this.field1976[var18][var19] == null) {
                  this.field1976[var18][var19] = new class168(this.field1990.method3279() + var18, this.field1990.method3235() + var19, this.field1990.method3231(), this.field1983);
                  this.field1976[var18][var19].method3291(this.field1990.field2122, this.field1990.field2123);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.method4939(class186.field2114.field2113, var2)) {
            byte[] var21 = var1.method4940(class186.field2114.field2113, var2);
            this.field1989 = class75.method1865(var21);
         }

         System.nanoTime();
         var1.method4933();
         var1.method4935();
         this.field1978 = true;
      }
   }

   public List method3409(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var12 = new LinkedList();
      if (!this.field1978) {
         return var12;
      } else {
         class177 var13 = this.method3407(var1, var2, var3, var4);
         float var14 = this.method3411(var7, var3 - var1);
         int var15 = (int)(64.0F * var14);
         int var16 = this.field1973 + var1;
         int var17 = var2 + this.field1985;

         for(int var18 = var13.field2064; var18 < var13.field2064 + var13.field2063; ++var18) {
            for(int var19 = var13.field2065; var19 < var13.field2062 + var13.field2065; ++var19) {
               List var20 = this.field1976[var18][var19].method3320(var5 + var15 * (this.field1976[var18][var19].field1968 * 64 - var16) / 64, var8 + var6 - var15 * (this.field1976[var18][var19].field1962 * 64 - var17 + 64) / 64, var15, var9, var10);
               if (!var20.isEmpty()) {
                  var12.addAll(var20);
               }
            }
         }

         return var12;
      }
   }

   public final void method3403() {
      this.field1977 = null;
   }

   public final void method3404(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var10 = class393.field4249;
      int var11 = class393.field4244;
      int var12 = class393.field4245;
      int[] var13 = new int[4];
      class393.method6874(var13);
      class177 var14 = this.method3407(var1, var2, var3, var4);
      float var15 = this.method3411(var7 - var5, var3 - var1);
      int var16 = (int)Math.ceil((double)var15);
      this.field1988 = var16;
      if (!this.field1979.containsKey(var16)) {
         class189 var17 = new class189(var16);
         var17.method3677();
         this.field1979.put(var16, var17);
      }

      int var24 = var14.field2063 + var14.field2064 - 1;
      int var18 = var14.field2065 + var14.field2062 - 1;

      int var19;
      int var20;
      for(var19 = var14.field2064; var19 <= var24; ++var19) {
         for(var20 = var14.field2065; var20 <= var18; ++var20) {
            this.field1976[var19][var20].method3298(var16, (class189)this.field1979.get(var16), this.field1980, this.field1984, this.field1982);
         }
      }

      class393.method6927(var10, var11, var12);
      class393.method6875(var13);
      var19 = (int)(64.0F * var15);
      var20 = this.field1973 + var1;
      int var21 = var2 + this.field1985;

      for(int var22 = var14.field2064; var22 < var14.field2063 + var14.field2064; ++var22) {
         for(int var23 = var14.field2065; var23 < var14.field2065 + var14.field2062; ++var23) {
            this.field1976[var22][var23].method3289(var5 + var19 * (this.field1976[var22][var23].field1968 * 64 - var20) / 64, var8 - var19 * (this.field1976[var22][var23].field1962 * 64 - var21 + 64) / 64, var19);
         }
      }

   }

   public final void method3436(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class177 var15 = this.method3407(var1, var2, var3, var4);
      float var16 = this.method3411(var7 - var5, var3 - var1);
      int var17 = (int)(var16 * 64.0F);
      int var18 = this.field1973 + var1;
      int var19 = var2 + this.field1985;

      int var20;
      int var21;
      for(var20 = var15.field2064; var20 < var15.field2064 + var15.field2063; ++var20) {
         for(var21 = var15.field2065; var21 < var15.field2062 + var15.field2065; ++var21) {
            if (var13) {
               this.field1976[var20][var21].method3294();
            }

            this.field1976[var20][var21].method3299(var5 + var17 * (this.field1976[var20][var21].field1968 * 64 - var18) / 64, var8 - var17 * (this.field1976[var20][var21].field1962 * 64 - var19 + 64) / 64, var17, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var20 = var15.field2064; var20 < var15.field2064 + var15.field2063; ++var20) {
            for(var21 = var15.field2065; var21 < var15.field2062 + var15.field2065; ++var21) {
               this.field1976[var20][var21].method3313(var10, var11, var12);
            }
         }
      }

   }
}
