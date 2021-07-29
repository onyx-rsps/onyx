import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class168 {
   public static class220 field1961;
   class162 field1964;
   int field1962;
   int field1966;
   int field1967;
   int field1968;
   HashMap field1969;
   LinkedList field1965;
   List field1957;
   final HashMap field1970;

   static {
      field1961 = new class220(37748736, 256);
   }

   class168(int var1, int var2, int var3, HashMap var4) {
      this.field1968 = var1;
      this.field1962 = var2;
      this.field1965 = new LinkedList();
      this.field1957 = new LinkedList();
      this.field1969 = new HashMap();
      this.field1966 = var3 | -16777216;
      this.field1970 = var4;
   }

   void method3304(int var1, int var2, class176 var3) {
      for(int var5 = 0; var5 < var3.field2051; ++var5) {
         class178[] var6 = var3.field2058[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            class178[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class178 var9 = var7[var8];
               if (class114.method2353(var9.field2068)) {
                  class155 var10 = class123.method2465(var9.field2070);
                  int var11 = var10.field1753 != 0 ? -3407872 : -3355444;
                  if (var9.field2068 == class257.field3148.field3162) {
                     this.method3322(var1, var2, var9.field2067, var11);
                  }

                  if (var9.field2068 == class257.field3139.field3162) {
                     this.method3322(var1, var2, var9.field2067, -3355444);
                     this.method3322(var1, var2, var9.field2067 + 1, var11);
                  }

                  if (var9.field2068 == class257.field3142.field3162) {
                     if (var9.field2067 == 0) {
                        class393.method6886(this.field1967 * var1, this.field1967 * (63 - var2), 1, var11);
                     }

                     if (var9.field2067 == 1) {
                        class393.method6886(this.field1967 * var1 + this.field1967 - 1, this.field1967 * (63 - var2), 1, var11);
                     }

                     if (var9.field2067 == 2) {
                        class393.method6886(this.field1967 + this.field1967 * var1 - 1, this.field1967 * (63 - var2) + this.field1967 - 1, 1, var11);
                     }

                     if (var9.field2067 == 3) {
                        class393.method6886(this.field1967 * var1, this.field1967 * (63 - var2) + this.field1967 - 1, 1, var11);
                     }
                  }

                  if (var9.field2068 == class257.field3159.field3162) {
                     int var12 = var9.field2067 % 2;
                     int var13;
                     if (var12 == 0) {
                        for(var13 = 0; var13 < this.field1967; ++var13) {
                           class393.method6886(var13 + this.field1967 * var1, (64 - var2) * this.field1967 - 1 - var13, 1, var11);
                        }
                     } else {
                        for(var13 = 0; var13 < this.field1967; ++var13) {
                           class393.method6886(var13 + this.field1967 * var1, var13 + this.field1967 * (63 - var2), 1, var11);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method3309(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      float var7 = var6 / 2.0F;
      Iterator var8 = this.field1969.entrySet().iterator();

      while(var8.hasNext()) {
         Entry var9 = (Entry)var8.next();
         class244 var10 = (class244)var9.getKey();
         int var11 = (int)((float)var1 + var6 * (float)var10.field2919 - var7);
         int var12 = (int)((float)(var2 + var4) - (float)var10.field2921 * var6 - var7);
         class185 var13 = (class185)var9.getValue();
         if (var13 != null && var13.method3616()) {
            var13.field2111 = var11;
            var13.field2108 = var12;
            class140 var14 = class72.method1825(var13.vmethod3612());
            if (!var3.contains(var14.method2664())) {
               this.method3312(var13, var11, var12, var6);
            }
         }
      }

   }

   void method3307(int var1, int var2, class176 var3, class396[] var4) {
      for(int var6 = 0; var6 < var3.field2051; ++var6) {
         class178[] var7 = var3.field2058[var6][var1][var2];
         if (var7 != null && var7.length != 0) {
            class178[] var8 = var7;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class178 var10 = var8[var9];
               if (!class65.method1729(var10.field2068)) {
                  int var12 = var10.field2068;
                  boolean var11 = var12 == class257.field3161.field3162;
                  if (!var11) {
                     continue;
                  }
               }

               class155 var13 = class123.method2465(var10.field2070);
               if (var13.field1763 != -1) {
                  if (var13.field1763 != 46 && var13.field1763 != 52) {
                     var4[var13.field1763].method6967(this.field1967 * var1, this.field1967 * (63 - var2), this.field1967 * 2, this.field1967 * 2);
                  } else {
                     var4[var13.field1763].method6967(this.field1967 * var1, this.field1967 * (63 - var2), this.field1967 * 2 + 1, this.field1967 * 2 + 1);
                  }
               }
            }
         }
      }

   }

   void method3315(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      Iterator var7 = this.field1957.iterator();

      while(var7.hasNext()) {
         class185 var8 = (class185)var7.next();
         if (var8.method3616()) {
            int var9 = var8.field2109.field2919 % 64;
            int var10 = var8.field2109.field2921 % 64;
            var8.field2111 = (int)((float)var9 * var6 + (float)var1);
            var8.field2108 = (int)((float)var2 + (float)(63 - var10) * var6);
            if (!var3.contains(var8.vmethod3612())) {
               this.method3312(var8, var8.field2111, var8.field2108, var6);
            }
         }
      }

   }

   void method3384(int var1, int var2, class176 var3, class189 var4, class179 var5) {
      int var7 = var3.field2054[0][var1][var2] - 1;
      int var8 = var3.field2061[0][var1][var2] - 1;
      if (var7 == -1 && var8 == -1) {
         class393.method6880(this.field1967 * var1, this.field1967 * (63 - var2), this.field1967, this.field1967, this.field1966);
      }

      int var9 = 16711935;
      if (var8 != -1) {
         var9 = class104.method2204(var8, this.field1966);
      }

      if (var8 > -1 && var3.field2056[0][var1][var2] == 0) {
         class393.method6880(this.field1967 * var1, this.field1967 * (63 - var2), this.field1967, this.field1967, var9);
      } else {
         int var10 = this.method3306(var1, var2, var3, var5);
         if (var8 == -1) {
            class393.method6880(this.field1967 * var1, this.field1967 * (63 - var2), this.field1967, this.field1967, var10);
         } else {
            var4.method3684(this.field1967 * var1, this.field1967 * (63 - var2), var10, var9, this.field1967, this.field1967, var3.field2056[0][var1][var2], var3.field2057[0][var1][var2]);
         }
      }
   }

   int method3392(class397 var1, class146 var2) {
      switch(var2.field1610) {
      case 0:
         return -var1.field4269 / 2;
      case 2:
         return 0;
      default:
         return -var1.field4269;
      }
   }

   void method3295(List var1) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class173 var4 = (class173)var3.next();
         if (class72.method1825(var4.field2016).field1529 && var4.field2109.field2919 >> 6 == this.field1968 && var4.field2109.field2921 >> 6 == this.field1962) {
            class173 var5 = new class173(var4.field2109, var4.field2109, var4.field2016, this.method3318(var4.field2016));
            this.field1957.add(var5);
         }
      }

   }

   void method3300(int var1, int var2, class176 var3, class189 var4, class396[] var5) {
      this.method3304(var1, var2, var3);
      this.method3307(var1, var2, var3, var5);
   }

   class180 method3319(class140 var1) {
      if (var1.field1536 != null && this.field1970 != null && this.field1970.get(class164.field1916) != null) {
         class164 var3 = class164.method3161(var1.field1538);
         if (var3 == null) {
            return null;
         } else {
            class301 var4 = (class301)this.field1970.get(var3);
            if (var4 == null) {
               return null;
            } else {
               int var5 = var4.method5401(var1.field1536, 1000000);
               String[] var6 = new String[var5];
               var4.method5386(var1.field1536, (int[])null, var6);
               int var7 = var6.length * var4.field3737 / 2;
               int var8 = 0;
               String[] var9 = var6;

               for(int var10 = 0; var10 < var9.length; ++var10) {
                  String var11 = var9[var10];
                  int var12 = var4.method5367(var11);
                  if (var12 > var8) {
                     var8 = var12;
                  }
               }

               return new class180(var1.field1536, var8, var7, var3);
            }
         }
      } else {
         return null;
      }
   }

   void method3310(HashSet var1, int var2, int var3) {
      Iterator var5 = this.field1957.iterator();

      while(var5.hasNext()) {
         class185 var6 = (class185)var5.next();
         if (var6.method3616()) {
            class140 var7 = class72.method1825(var6.vmethod3612());
            if (var7 != null && var1.contains(var7.method2664())) {
               this.method3311(var7, var6.field2111, var6.field2108, var2, var3);
            }
         }
      }

   }

   void method3335(int var1, int var2, class176 var3, class189 var4) {
      for(int var6 = 1; var6 < var3.field2051; ++var6) {
         int var7 = var3.field2061[var6][var1][var2] - 1;
         if (var7 > -1) {
            int var8 = class104.method2204(var7, this.field1966);
            if (var3.field2056[var6][var1][var2] == 0) {
               class393.method6880(this.field1967 * var1, this.field1967 * (63 - var2), this.field1967, this.field1967, var8);
            } else {
               var4.method3684(this.field1967 * var1, this.field1967 * (63 - var2), 0, var8, this.field1967, this.field1967, var3.field2056[var6][var1][var2], var3.field2057[var6][var1][var2]);
            }
         }
      }

   }

   void method3362(class140 var1, int var2, int var3) {
      class397 var5 = var1.method2651(false);
      if (var5 != null) {
         int var6 = this.method3392(var5, var1.field1539);
         int var7 = this.method3317(var5, var1.field1549);
         var5.method7024(var6 + var2, var3 + var7);
      }

   }

   int method3317(class397 var1, class148 var2) {
      switch(var2.field1657) {
      case 0:
         return -var1.field4270 / 2;
      case 1:
         return 0;
      default:
         return -var1.field4270;
      }
   }

   void method3314(class185 var1, class140 var2, int var3, int var4, float var5) {
      class180 var7 = var1.vmethod3613();
      if (var7 != null) {
         if (var7.field2081.method3160(var5)) {
            class301 var8 = (class301)this.field1970.get(var7.field2081);
            var8.method5376(var7.field2080, var3 - var7.field2078 / 2, var4, var7.field2078, var7.field2084, -16777216 | var2.field1547, 0, 1, 0, var8.field3737 / 2);
         }
      }
   }

   boolean method3297(class276 var1) {
      this.field1969.clear();
      if (this.field1964 != null) {
         this.field1964.method3539(var1);
         if (this.field1964.method3549()) {
            this.method3395(0, 0, 64, 64, this.field1964);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var3 = true;

         Iterator var4;
         class170 var5;
         for(var4 = this.field1965.iterator(); var4.hasNext(); var3 &= var5.method3549()) {
            var5 = (class170)var4.next();
            var5.method3539(var1);
         }

         if (var3) {
            var4 = this.field1965.iterator();

            while(var4.hasNext()) {
               var5 = (class170)var4.next();
               this.method3395(var5.method3458() * 8, var5.method3449() * 8, 8, 8, var5);
            }
         }

         return var3;
      }
   }

   void method3395(int var1, int var2, int var3, int var4, class176 var5) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         label44:
         for(int var8 = var2; var8 < var2 + var4; ++var8) {
            for(int var9 = 0; var9 < var5.field2051; ++var9) {
               class178[] var10 = var5.field2058[var9][var7][var8];
               if (var10 != null && var10.length != 0) {
                  class178[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     class178 var13 = var11[var12];
                     class155 var14 = class123.method2465(var13.field2070);
                     if (class80.method1935(var14)) {
                        this.method3293(var14, var9, var7, var8, var5);
                        continue label44;
                     }
                  }
               }
            }
         }
      }

   }

   int method3306(int var1, int var2, class176 var3, class179 var4) {
      return var3.field2054[0][var1][var2] == 0 ? this.field1966 : var4.method3574(var1, var2);
   }

   List method3321() {
      LinkedList var2 = new LinkedList();
      var2.addAll(this.field1957);
      var2.addAll(this.field1969.values());
      return var2;
   }

   class180 method3318(int var1) {
      class140 var3 = class72.method1825(var1);
      return this.method3319(var3);
   }

   void method3311(class140 var1, int var2, int var3, int var4, int var5) {
      class397 var7 = var1.method2651(false);
      if (var7 != null) {
         var7.method7024(var2 - var7.field4269 / 2, var3 - var7.field4270 / 2);
         if (var4 % var5 < var5 / 2) {
            class393.method6878(var2, var3, 15, 16776960, 128);
            class393.method6878(var2, var3, 7, 16777215, 256);
         }

      }
   }

   void method3293(class155 var1, int var2, int var3, int var4, class176 var5) {
      class244 var7 = new class244(var2, var3 + this.field1968 * 64, this.field1962 * 64 + var4);
      class244 var8 = null;
      if (this.field1964 != null) {
         var8 = new class244(this.field1964.field2060 + var2, var3 + this.field1964.field2050 * 64, var4 + this.field1964.field2047 * 64);
      } else {
         class170 var9 = (class170)var5;
         var8 = new class244(var2 + var9.field2060, var9.field2050 * 64 + var3 + var9.method3453() * 8, var9.field2047 * 64 + var4 + var9.method3447() * 8);
      }

      class140 var10;
      Object var11;
      if (var1.field1761 != null) {
         var11 = new class165(var8, var7, var1.field1752, this);
      } else {
         var10 = class72.method1825(var1.field1762);
         var11 = new class173(var8, var7, var10.field1533, this.method3319(var10));
      }

      var10 = class72.method1825(((class185)var11).vmethod3612());
      if (var10.field1529) {
         this.field1969.put(new class244(0, var3, var4), var11);
      }

   }

   void method3294() {
      Iterator var2 = this.field1969.values().iterator();

      while(var2.hasNext()) {
         class185 var3 = (class185)var2.next();
         if (var3 instanceof class165) {
            ((class165)var3).method3170();
         }
      }

   }

   void method3312(class185 var1, int var2, int var3, float var4) {
      class140 var6 = class72.method1825(var1.vmethod3612());
      this.method3362(var6, var2, var3);
      this.method3314(var1, var6, var2, var3, var4);
   }

   void method3322(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         class393.method6932(this.field1967 * var1, this.field1967 * (63 - var2), this.field1967, var4);
      }

      if (var3 == 1) {
         class393.method6886(this.field1967 * var1, this.field1967 * (63 - var2), this.field1967, var4);
      }

      if (var3 == 2) {
         class393.method6932(this.field1967 * var1 + this.field1967 - 1, this.field1967 * (63 - var2), this.field1967, var4);
      }

      if (var3 == 3) {
         class393.method6886(this.field1967 * var1, this.field1967 * (63 - var2) + this.field1967 - 1, this.field1967, var4);
      }

   }

   void method3313(HashSet var1, int var2, int var3) {
      Iterator var5 = this.field1969.values().iterator();

      while(var5.hasNext()) {
         class185 var6 = (class185)var5.next();
         if (var6.method3616()) {
            int var7 = var6.vmethod3612();
            if (var1.contains(var7)) {
               class140 var8 = class72.method1825(var7);
               this.method3311(var8, var6.field2111, var6.field2108, var2, var3);
            }
         }
      }

      this.method3310(var1, var2, var3);
   }

   void method3301(class189 var1, class396[] var2, class179 var3) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method3384(var5, var6, this.field1964, var1, var3);
            this.method3335(var5, var6, this.field1964, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method3300(var5, var6, this.field1964, var1, var2);
         }
      }

   }

   void method3302(class189 var1, class396[] var2, class179 var3) {
      Iterator var5 = this.field1965.iterator();

      class170 var6;
      int var7;
      int var8;
      while(var5.hasNext()) {
         var6 = (class170)var5.next();

         for(var7 = var6.method3458() * 8; var7 < var6.method3458() * 8 + 8; ++var7) {
            for(var8 = var6.method3449() * 8; var8 < var6.method3449() * 8 + 8; ++var8) {
               this.method3384(var7, var8, var6, var1, var3);
               this.method3335(var7, var8, var6, var1);
            }
         }
      }

      var5 = this.field1965.iterator();

      while(var5.hasNext()) {
         var6 = (class170)var5.next();

         for(var7 = var6.method3458() * 8; var7 < var6.method3458() * 8 + 8; ++var7) {
            for(var8 = var6.method3449() * 8; var8 < var6.method3449() * 8 + 8; ++var8) {
               this.method3300(var7, var8, var6, var1, var2);
            }
         }
      }

   }

   void method3299(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.method3309(var1, var2, var4, var3);
      this.method3315(var1, var2, var4, var3);
   }

   List method3320(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var7 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var8 = this.field1969.values().iterator();

            class185 var9;
            while(var8.hasNext()) {
               var9 = (class185)var8.next();
               if (var9.method3616() && var9.method3610(var4, var5)) {
                  var7.add(var9);
               }
            }

            var8 = this.field1957.iterator();

            while(var8.hasNext()) {
               var9 = (class185)var8.next();
               if (var9.method3616() && var9.method3610(var4, var5)) {
                  var7.add(var9);
               }
            }

            return var7;
         } else {
            return var7;
         }
      } else {
         return var7;
      }
   }

   void method3296() {
      if (this.field1964 != null) {
         this.field1964.method3537();
      } else {
         Iterator var2 = this.field1965.iterator();

         while(var2.hasNext()) {
            class170 var3 = (class170)var2.next();
            var3.method3537();
         }
      }

   }

   void method3298(int var1, class189 var2, class396[] var3, class276 var4, class276 var5) {
      this.field1967 = var1;
      if (this.field1964 != null || !this.field1965.isEmpty()) {
         if (class265.method4836(this.field1968, this.field1962, var1) == null) {
            boolean var7 = true;
            var7 &= this.method3297(var4);
            int var9;
            if (this.field1964 != null) {
               var9 = this.field1964.field2046;
            } else {
               var9 = ((class176)this.field1965.getFirst()).field2046;
            }

            var7 &= var5.method4924(var9);
            if (var7) {
               byte[] var8 = var5.method4927(var9);
               class179 var10;
               if (var8 == null) {
                  var10 = new class179();
               } else {
                  var10 = new class179(class75.method1865(var8).field4279);
               }

               class397 var12 = new class397(this.field1967 * 64, this.field1967 * 64);
               var12.method7020();
               if (this.field1964 != null) {
                  this.method3301(var2, var3, var10);
               } else {
                  this.method3302(var2, var3, var10);
               }

               int var13 = this.field1968;
               int var14 = this.field1962;
               int var15 = this.field1967;
               field1961.method4279(var12, class154.method2919(var13, var14, var15), var12.field4279.length * 4);
               this.method3296();
            }
         }
      }
   }

   void method3289(int var1, int var2, int var3) {
      class397 var5 = class265.method4836(this.field1968, this.field1962, this.field1967);
      if (var5 != null) {
         if (var3 == this.field1967 * 64) {
            var5.method7066(var1, var2);
         } else {
            var5.method7035(var1, var2, var3, var3);
         }

      }
   }

   void method3290(class162 var1, List var2) {
      this.field1969.clear();
      this.field1964 = var1;
      this.method3295(var2);
   }

   void method3291(HashSet var1, List var2) {
      this.field1969.clear();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         class170 var5 = (class170)var4.next();
         if (var5.method3545() == this.field1968 && var5.method3543() == this.field1962) {
            this.field1965.add(var5);
         }
      }

      this.method3295(var2);
   }

   static class58 method3400(int var0, int var1, int var2) {
      int var4 = class266.method4839(var1, var0);
      class58 var5 = class116.method2372(var4, var0);
      if (var5 != null) {
         return var5;
      } else {
         int var6 = (-3 - var2 << 8) + var0;
         class58 var8 = (class58)class58.field861.method4306((long)(var6 << 16));
         class58 var7;
         if (var8 != null) {
            var7 = var8;
         } else {
            String var9 = String.valueOf(var6);
            int var10 = class45.field390.method4936(var9);
            if (var10 == -1) {
               var7 = null;
            } else {
               byte[] var11 = class45.field390.method4927(var10);
               if (var11 != null) {
                  if (var11.length <= 1) {
                     var7 = null;
                     return var7 != null ? var7 : null;
                  }

                  var8 = class210.method4251(var11);
                  if (var8 != null) {
                     class58.field861.method4308(var8, (long)(var6 << 16));
                     var7 = var8;
                     return var7 != null ? var7 : null;
                  }
               }

               var7 = null;
            }
         }

         return var7 != null ? var7 : null;
      }
   }

   static final void method3398(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class159[] var8) {
      int var11;
      for(int var10 = 0; var10 < 8; ++var10) {
         for(var11 = 0; var11 < 8; ++var11) {
            if (var10 + var2 > 0 && var10 + var2 < 103 && var3 + var11 > 0 && var3 + var11 < 103) {
               int[] var10000 = var8[var1].field1888[var10 + var2];
               var10000[var3 + var11] &= -16777217;
            }
         }
      }

      Buffer var29 = new Buffer(var0);

      for(var11 = 0; var11 < 4; ++var11) {
         for(int var12 = 0; var12 < 64; ++var12) {
            for(int var13 = 0; var13 < 64; ++var13) {
               if (var11 == var4 && var12 >= var5 && var12 < var5 + 8 && var13 >= var6 && var13 < var6 + 8) {
                  int var18 = var12 & 7;
                  int var19 = var13 & 7;
                  int var20 = var7 & 3;
                  int var17;
                  if (var20 == 0) {
                     var17 = var18;
                  } else if (var20 == 1) {
                     var17 = var19;
                  } else if (var20 == 2) {
                     var17 = 7 - var18;
                  } else {
                     var17 = 7 - var19;
                  }

                  int var23 = var2 + var17;
                  int var26 = var12 & 7;
                  int var27 = var13 & 7;
                  int var28 = var7 & 3;
                  int var25;
                  if (var28 == 0) {
                     var25 = var27;
                  } else if (var28 == 1) {
                     var25 = 7 - var26;
                  } else if (var28 == 2) {
                     var25 = 7 - var27;
                  } else {
                     var25 = var26;
                  }

                  class125.method2484(var29, var1, var23, var25 + var3, 0, 0, var7);
               } else {
                  class125.method2484(var29, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   public static int method3383(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0 - (var3 - 1);
      } else {
         return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
      }
   }
}
