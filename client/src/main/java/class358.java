import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class358 {
   static final class360 field4028;
   static final class360 field4053;
   static final class360 field4075;
   boolean field4051;
   boolean field4062;
   boolean field4067;
   class167 field4034;
   class167 field4036;
   class167 field4066;
   class169 field4037;
   class244 field4073;
   class276 field4026;
   class276 field4031;
   class276 field4043;
   class301 field4074;
   class357 field4038;
   class396[] field4032;
   class397 field4065;
   float field4021;
   float field4044;
   int field4024;
   int field4027;
   int field4029;
   int field4039;
   int field4041;
   int field4045;
   int field4046;
   int field4048;
   int field4049;
   int field4050;
   int field4054;
   int field4055;
   int field4056;
   int field4058;
   int field4059;
   int field4060;
   int field4061;
   int field4068;
   int field4069;
   int field4076;
   int field4077;
   int field4078;
   int field4079;
   HashMap field4042;
   HashMap field4057;
   HashSet field4022;
   HashSet field4047;
   HashSet field4052;
   HashSet field4063;
   HashSet field4064;
   HashSet field4072;
   Iterator field4030;
   List field4070;
   long field4071;
   final int[] field4020;
   public boolean field4025;

   static {
      field4053 = class360.field4086;
      field4028 = class360.field4087;
      field4075 = class360.field4095;
   }

   public class358() {
      this.field4041 = -1;
      this.field4069 = -1;
      this.field4045 = -1;
      this.field4046 = -1;
      this.field4059 = -1;
      this.field4048 = -1;
      this.field4049 = 3;
      this.field4050 = 50;
      this.field4051 = false;
      this.field4052 = null;
      this.field4076 = -1;
      this.field4054 = -1;
      this.field4055 = -1;
      this.field4056 = -1;
      this.field4078 = -1;
      this.field4058 = -1;
      this.field4062 = true;
      this.field4063 = new HashSet();
      this.field4064 = new HashSet();
      this.field4047 = new HashSet();
      this.field4022 = new HashSet();
      this.field4067 = false;
      this.field4068 = 0;
      this.field4020 = new int[]{1008, 1009, 1010, 1011, 1012};
      this.field4072 = new HashSet();
      this.field4073 = null;
      this.field4025 = false;
      this.field4077 = -1;
      this.field4027 = -1;
      this.field4079 = -1;
   }

   public class167 method6073(int var1, int var2, int var3) {
      Iterator var5 = this.field4042.values().iterator();

      class167 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class167)var5.next();
      } while(!var6.method3222(var1, var2, var3));

      return var6;
   }

   boolean method6098() {
      return this.field4041 != -1 && this.field4069 != -1;
   }

   public class167 method6092(int var1) {
      Iterator var3 = this.field4042.values().iterator();

      class167 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class167)var3.next();
      } while(var4.method3227() != var1);

      return var4;
   }

   float method6119(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (var1 == 37) {
         return 1.5F;
      } else if (var1 == 50) {
         return 2.0F;
      } else if (var1 == 75) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   void method6221(class167 var1) {
      this.field4066 = var1;
      this.field4037 = new class169(this.field4032, this.field4057, this.field4031, this.field4026);
      this.field4038.method6049(this.field4066.method3229());
   }

   void method6078(class167 var1) {
      if (this.field4066 == null || var1 != this.field4066) {
         this.method6221(var1);
         this.method6190(-1, -1, -1);
      }
   }

   public int method6097() {
      return this.field4066 == null ? -1 : this.field4029 + this.field4066.method3279() * 64;
   }

   void method6068() {
      if (class367.field4127 != null) {
         this.field4021 = this.field4044;
      } else {
         if (this.field4021 < this.field4044) {
            this.field4021 = Math.min(this.field4044, this.field4021 + this.field4021 / 30.0F);
         }

         if (this.field4021 > this.field4044) {
            this.field4021 = Math.max(this.field4044, this.field4021 - this.field4021 / 30.0F);
         }

      }
   }

   void method6115() {
      this.field4022.clear();
      this.field4022.addAll(this.field4063);
      this.field4022.addAll(this.field4047);
   }

   void method6190(int var1, int var2, int var3) {
      if (this.field4066 != null) {
         int[] var5 = this.field4066.method3258(var1, var2, var3);
         if (var5 == null) {
            var5 = this.field4066.method3258(this.field4066.method3238(), this.field4066.method3248(), this.field4066.method3239());
         }

         this.method6070(var5[0] - this.field4066.method3279() * 64, var5[1] - this.field4066.method3235() * 64, true);
         this.field4041 = -1;
         this.field4069 = -1;
         this.field4021 = this.method6119(this.field4066.method3255());
         this.field4044 = this.field4021;
         this.field4070 = null;
         this.field4030 = null;
         this.field4037.method3403();
      }
   }

   public int method6100() {
      return this.field4045;
   }

   public int method6142() {
      return this.field4066 == null ? -1 : this.field4024 + this.field4066.method3235() * 64;
   }

   void method6063() {
      if (this.method6098()) {
         int var2 = this.field4041 - this.field4029;
         int var3 = this.field4069 - this.field4024;
         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         if (var3 != 0) {
            var3 /= Math.min(8, Math.abs(var3));
         }

         this.method6070(var2 + this.field4029, var3 + this.field4024, true);
         if (this.field4041 == this.field4029 && this.field4069 == this.field4024) {
            this.field4041 = -1;
            this.field4069 = -1;
         }

      }
   }

   final void method6071() {
      this.field4058 = -1;
      this.field4078 = -1;
      this.field4056 = -1;
      this.field4055 = -1;
   }

   public void method6093(int var1, int var2) {
      if (this.field4066 != null && this.field4066.method3223(var1, var2)) {
         this.field4041 = var1 - this.field4066.method3279() * 64;
         this.field4069 = var2 - this.field4066.method3235() * 64;
      }
   }

   public void method6094(int var1, int var2) {
      if (this.field4066 != null) {
         this.method6070(var1 - this.field4066.method3279() * 64, var2 - this.field4066.method3235() * 64, true);
         this.field4041 = -1;
         this.field4069 = -1;
      }
   }

   void method6067(int var1, int var2, boolean var3, long var4) {
      if (this.field4066 != null) {
         int var6 = (int)((float)this.field4029 + ((float)(var1 - this.field4059) - (float)this.method6100() * this.field4021 / 2.0F) / this.field4021);
         int var7 = (int)((float)this.field4024 - ((float)(var2 - this.field4048) - (float)this.method6101() * this.field4021 / 2.0F) / this.field4021);
         this.field4073 = this.field4066.method3225(var6 + this.field4066.method3279() * 64, var7 + this.field4066.method3235() * 64);
         if (this.field4073 != null && var3) {
            if (class142.method2710() && class10.field45[82] && class10.field45[81]) {
               class342.method5996(this.field4073.field2919, this.field4073.field2921, this.field4073.field2920, false);
            } else {
               boolean var8 = true;
               if (this.field4062) {
                  int var9 = var1 - this.field4060;
                  int var10 = var2 - this.field4061;
                  if (var4 - this.field4071 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if (var8) {
                  class228 var11 = class148.method2788(class226.field2666, client.field452.field1204);
                  var11.field2690.method6604(this.field4073.method4628());
                  client.field452.method2031(var11);
                  this.field4071 = 0L;
               }
            }
         }
      } else {
         this.field4073 = null;
      }

   }

   final void method6070(int var1, int var2, boolean var3) {
      this.field4029 = var1;
      this.field4024 = var2;
      class86.currentTime();
      if (var3) {
         this.method6071();
      }

   }

   public int method6101() {
      return this.field4046;
   }

   public class185 method6120() {
      if (this.field4030 == null) {
         return null;
      } else {
         class185 var2;
         do {
            if (!this.field4030.hasNext()) {
               return null;
            }

            var2 = (class185)this.field4030.next();
         } while(var2.vmethod3612() == -1);

         return var2;
      }
   }

   boolean method6083(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field4065 == null) {
         return true;
      } else if (this.field4065.field4269 == var1 && this.field4065.field4270 == var2) {
         if (this.field4037.field1988 != this.field4039) {
            return true;
         } else if (this.field4079 != client.field679) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var3 + var1 < var5 || var2 + var4 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void method6229(int var1, int var2, int var3, int var4, int var5) {
      byte var7 = 20;
      int var8 = var3 / 2 + var1;
      int var9 = var4 / 2 + var2 - 18 - var7;
      class393.method6880(var1, var2, var3, var4, -16777216);
      class393.method6907(var8 - 152, var9, 304, 34, -65536);
      class393.method6880(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
      this.field4074.method5441("Loading...", var8, var9 + var7, -1, -1);
   }

   void method6084(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class367.field4127 != null) {
         int var8 = 512 / (this.field4037.field1988 * 2);
         int var9 = var3 + 512;
         int var10 = var4 + 512;
         float var11 = 1.0F;
         var9 = (int)((float)var9 / var11);
         var10 = (int)((float)var10 / var11);
         int var12 = this.method6097() - var5 / 2 - var8;
         int var13 = this.method6142() - var6 / 2 - var8;
         int var14 = var1 - (var12 + var8 - this.field4077) * this.field4037.field1988;
         int var15 = var2 - this.field4037.field1988 * (var8 - (var13 - this.field4027));
         if (this.method6083(var9, var10, var14, var15, var3, var4)) {
            if (this.field4065 != null && this.field4065.field4269 == var9 && this.field4065.field4270 == var10) {
               Arrays.fill(this.field4065.field4279, 0);
            } else {
               this.field4065 = new class397(var9, var10);
            }

            this.field4077 = this.method6097() - var5 / 2 - var8;
            this.field4027 = this.method6142() - var6 / 2 - var8;
            this.field4039 = this.field4037.field1988;
            class367.field4127.method5106(this.field4077, this.field4027, this.field4065, (float)this.field4039 / var11);
            this.field4079 = client.field679;
            var14 = var1 - (var8 + var12 - this.field4077) * this.field4037.field1988;
            var15 = var2 - this.field4037.field1988 * (var8 - (var13 - this.field4027));
         }

         class393.method6879(var1, var2, var3, var4, 0, 128);
         if (var11 == 1.0F) {
            this.field4065.method7009(var14, var15, 192);
         } else {
            this.field4065.method7012(var14, var15, (int)((float)var9 * var11), (int)(var11 * (float)var10), 192);
         }
      }

   }

   public void method6082(int var1, int var2, int var3, int var4, int var5) {
      int[] var7 = new int[4];
      class393.method6874(var7);
      class393.method6894(var1, var2, var3 + var1, var2 + var4);
      class393.method6880(var1, var2, var3, var4, -16777216);
      int var8 = this.field4038.method6055();
      if (var8 < 100) {
         this.method6229(var1, var2, var3, var4, var8);
      } else {
         if (!this.field4037.method3427()) {
            this.field4037.method3402(this.field4043, this.field4066.method3229(), client.field561);
            if (!this.field4037.method3427()) {
               return;
            }
         }

         if (this.field4052 != null) {
            ++this.field4054;
            if (this.field4054 % this.field4050 == 0) {
               this.field4054 = 0;
               ++this.field4076;
            }

            if (this.field4076 >= this.field4049 && !this.field4051) {
               this.field4052 = null;
            }
         }

         int var9 = (int)Math.ceil((double)((float)var3 / this.field4021));
         int var10 = (int)Math.ceil((double)((float)var4 / this.field4021));
         this.field4037.method3404(this.field4029 - var9 / 2, this.field4024 - var10 / 2, var9 / 2 + this.field4029, var10 / 2 + this.field4024, var1, var2, var3 + var1, var2 + var4);
         if (!this.field4067) {
            boolean var11 = false;
            if (var5 - this.field4068 > 100) {
               this.field4068 = var5;
               var11 = true;
            }

            this.field4037.method3436(this.field4029 - var9 / 2, this.field4024 - var10 / 2, var9 / 2 + this.field4029, var10 / 2 + this.field4024, var1, var2, var3 + var1, var2 + var4, this.field4022, this.field4052, this.field4054, this.field4050, var11);
         }

         this.method6084(var1, var2, var3, var4, var9, var10);
         if (class142.method2710() && this.field4025 && this.field4073 != null) {
            this.field4074.method5372("Coord: " + this.field4073, class393.field4248 + 10, class393.field4246 + 20, 16776960, -1);
         }

         this.field4045 = var9;
         this.field4046 = var10;
         this.field4059 = var1;
         this.field4048 = var2;
         class393.method6875(var7);
      }
   }

   public void method6231() {
      class168.field1961.method4280(5);
   }

   public void method6085(int var1, int var2, int var3, int var4) {
      if (this.field4038.method6051()) {
         if (!this.field4037.method3427()) {
            this.field4037.method3402(this.field4043, this.field4066.method3229(), client.field561);
            if (!this.field4037.method3427()) {
               return;
            }
         }

         this.field4037.method3426(var1, var2, var3, var4, this.field4052, this.field4054, this.field4050);
      }
   }

   public void method6125(class276 var1, class276 var2, class276 var3, class301 var4, HashMap var5, class396[] var6) {
      this.field4032 = var6;
      this.field4043 = var1;
      this.field4031 = var2;
      this.field4026 = var3;
      this.field4074 = var4;
      this.field4057 = new HashMap();
      this.field4057.put(class164.field1916, var5.get(field4053));
      this.field4057.put(class164.field1921, var5.get(field4028));
      this.field4057.put(class164.field1917, var5.get(field4075));
      this.field4038 = new class357(var1);
      int var8 = this.field4043.method4936(class186.field2117.field2113);
      int[] var9 = this.field4043.method4989(var8);
      this.field4042 = new HashMap(var9.length);

      for(int var10 = 0; var10 < var9.length; ++var10) {
         Buffer var11 = new Buffer(this.field4043.method4920(var8, var9[var10]));
         class167 var12 = new class167();
         var12.method3220(var11, var9[var10]);
         this.field4042.put(var12.method3229(), var12);
         if (var12.method3219()) {
            this.field4034 = var12;
         }
      }

      this.method6078(this.field4034);
      this.field4036 = null;
   }

   public void method6069(int var1, int var2, int var3, boolean var4) {
      class167 var6 = this.method6073(var1, var2, var3);
      if (var6 == null) {
         if (!var4) {
            return;
         }

         var6 = this.field4034;
      }

      boolean var7 = false;
      if (var6 != this.field4036 || var4) {
         this.field4036 = var6;
         this.method6078(var6);
         var7 = true;
      }

      if (var7 || var4) {
         this.method6190(var1, var2, var3);
      }

   }

   public void method6090() {
      this.field4038.method6050();
   }

   public void method6065(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.field4038.method6051()) {
         this.method6068();
         this.method6063();
         if (var3) {
            int var9 = (int)Math.ceil((double)((float)var6 / this.field4021));
            int var10 = (int)Math.ceil((double)((float)var7 / this.field4021));
            List var11 = this.field4037.method3409(this.field4029 - var9 / 2 - 1, this.field4024 - var10 / 2 - 1, var9 / 2 + this.field4029 + 1, var10 / 2 + this.field4024 + 1, var4, var5, var6, var7, var1, var2);
            HashSet var12 = new HashSet();

            Iterator var13;
            class185 var14;
            class67 var15;
            class190 var16;
            for(var13 = var11.iterator(); var13.hasNext(); class94.method2123(var15)) {
               var14 = (class185)var13.next();
               var12.add(var14);
               var15 = new class67();
               var16 = new class190(var14.vmethod3612(), var14.field2110, var14.field2109);
               var15.method1732(new Object[]{var16, var1, var2});
               if (this.field4072.contains(var14)) {
                  var15.method1733(17);
               } else {
                  var15.method1733(15);
               }
            }

            var13 = this.field4072.iterator();

            while(var13.hasNext()) {
               var14 = (class185)var13.next();
               if (!var12.contains(var14)) {
                  var15 = new class67();
                  var16 = new class190(var14.vmethod3612(), var14.field2110, var14.field2109);
                  var15.method1732(new Object[]{var16, var1, var2});
                  var15.method1733(16);
                  class94.method2123(var15);
               }
            }

            this.field4072 = var12;
         }
      }
   }

   public void method6077(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field4038.method6051()) {
         int var8 = (int)Math.ceil((double)((float)var3 / this.field4021));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field4021));
         List var10 = this.field4037.method3409(this.field4029 - var8 / 2 - 1, this.field4024 - var9 / 2 - 1, var8 / 2 + this.field4029 + 1, var9 / 2 + this.field4024 + 1, var1, var2, var3, var4, var5, var6);
         if (!var10.isEmpty()) {
            Iterator var11 = var10.iterator();

            boolean var14;
            do {
               if (!var11.hasNext()) {
                  return;
               }

               class185 var12 = (class185)var11.next();
               class140 var13 = class72.method1825(var12.vmethod3612());
               var14 = false;

               for(int var15 = this.field4020.length - 1; var15 >= 0; --var15) {
                  if (var13.field1532[var15] != null) {
                     class7.method47(var13.field1532[var15], var13.field1542, this.field4020[var15], var12.vmethod3612(), var12.field2110.method4628(), var12.field2109.method4628());
                     var14 = true;
                  }
               }
            } while(!var14);

         }
      }
   }

   public void method6075(int var1) {
      class167 var3 = this.method6092(var1);
      if (var3 != null) {
         this.method6078(var3);
      }

   }

   public int method6089() {
      if (1.0D == (double)this.field4044) {
         return 25;
      } else if (1.5D == (double)this.field4044) {
         return 37;
      } else if ((double)this.field4044 == 2.0D) {
         return 50;
      } else if (3.0D == (double)this.field4044) {
         return 75;
      } else {
         return 4.0D == (double)this.field4044 ? 100 : 200;
      }
   }

   public void method6066(int var1, int var2, boolean var3, boolean var4) {
      long var6 = class86.currentTime();
      this.method6067(var1, var2, var4, var6);
      if (this.method6098() || !var4 && !var3) {
         this.method6071();
      } else {
         if (var4) {
            this.field4078 = var1;
            this.field4058 = var2;
            this.field4055 = this.field4029;
            this.field4056 = this.field4024;
         }

         if (this.field4055 != -1) {
            int var8 = var1 - this.field4078;
            int var9 = var2 - this.field4058;
            this.method6070(this.field4055 - (int)((float)var8 / this.field4044), (int)((float)var9 / this.field4044) + this.field4056, false);
         }
      }

      if (var4) {
         this.field4071 = var6;
         this.field4060 = var1;
         this.field4061 = var2;
      }

   }

   public void method6193(int var1) {
      this.field4044 = this.method6119(var1);
   }

   public boolean method6091() {
      return this.field4038.method6051();
   }

   public class244 method6099() {
      return this.field4066 == null ? null : this.field4066.method3225(this.method6097(), this.method6142());
   }

   public void method6095(int var1, int var2, int var3) {
      if (this.field4066 != null) {
         int[] var5 = this.field4066.method3258(var1, var2, var3);
         if (var5 != null) {
            this.method6093(var5[0], var5[1]);
         }

      }
   }

   public void method6121(int var1, int var2, int var3) {
      if (this.field4066 != null) {
         int[] var5 = this.field4066.method3258(var1, var2, var3);
         if (var5 != null) {
            this.method6094(var5[0], var5[1]);
         }

      }
   }

   public int method6076() {
      return this.field4066 == null ? -1 : this.field4066.method3227();
   }

   public void method6150() {
      this.field4049 = 3;
   }

   public class167 method6132() {
      return this.field4066;
   }

   public void method6104() {
      this.field4050 = 50;
   }

   public void method6102(int var1) {
      if (var1 >= 1) {
         this.field4049 = var1;
      }

   }

   public void method6252() {
      this.field4052 = null;
   }

   public void method6103(int var1) {
      if (var1 >= 1) {
         this.field4050 = var1;
      }

   }

   public void method6106(int var1) {
      this.field4052 = new HashSet();
      this.field4052.add(var1);
      this.field4076 = 0;
      this.field4054 = 0;
   }

   public void method6105(boolean var1) {
      this.field4051 = var1;
   }

   public void method6107(int var1) {
      this.field4052 = new HashSet();
      this.field4076 = 0;
      this.field4054 = 0;

      for(int var3 = 0; var3 < class140.field1531; ++var3) {
         if (class72.method1825(var3) != null && class72.method1825(var3).field1552 == var1) {
            this.field4052.add(class72.method1825(var3).field1533);
         }
      }

   }

   public void method6118(int var1, int var2, class244 var3, class244 var4) {
      class67 var6 = new class67();
      class190 var7 = new class190(var2, var3, var4);
      var6.method1732(new Object[]{var7});
      switch(var1) {
      case 1008:
         var6.method1733(10);
         break;
      case 1009:
         var6.method1733(11);
         break;
      case 1010:
         var6.method1733(12);
         break;
      case 1011:
         var6.method1733(13);
         break;
      case 1012:
         var6.method1733(14);
      }

      class94.method2123(var6);
   }

   public class185 method6200() {
      if (!this.field4038.method6051()) {
         return null;
      } else if (!this.field4037.method3427()) {
         return null;
      } else {
         HashMap var2 = this.field4037.method3425();
         this.field4070 = new LinkedList();
         Iterator var3 = var2.values().iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            this.field4070.addAll(var4);
         }

         this.field4030 = this.field4070.iterator();
         return this.method6120();
      }
   }

   public void method6109(boolean var1) {
      this.field4067 = !var1;
   }

   public boolean method6087() {
      return !this.field4067;
   }

   public void method6222(int var1, boolean var2) {
      if (!var2) {
         this.field4063.add(var1);
      } else {
         this.field4063.remove(var1);
      }

      this.method6115();
   }

   public void method6111(int var1, boolean var2) {
      if (!var2) {
         this.field4064.add(var1);
      } else {
         this.field4064.remove(var1);
      }

      for(int var4 = 0; var4 < class140.field1531; ++var4) {
         if (class72.method1825(var4) != null && class72.method1825(var4).field1552 == var1) {
            int var5 = class72.method1825(var4).field1533;
            if (!var2) {
               this.field4047.add(var5);
            } else {
               this.field4047.remove(var5);
            }
         }
      }

      this.method6115();
   }

   public boolean method6113(int var1) {
      return !this.field4063.contains(var1);
   }

   public void method6080(class167 var1, class244 var2, class244 var3, boolean var4) {
      if (var1 != null) {
         if (this.field4066 == null || var1 != this.field4066) {
            this.method6221(var1);
         }

         if (!var4 && this.field4066.method3222(var2.field2920, var2.field2919, var2.field2921)) {
            this.method6190(var2.field2920, var2.field2919, var2.field2921);
         } else {
            this.method6190(var3.field2920, var3.field2919, var3.field2921);
         }

      }
   }

   public boolean method6189(int var1) {
      return !this.field4064.contains(var1);
   }

   public class244 method6117(int var1, class244 var2) {
      if (!this.field4038.method6051()) {
         return null;
      } else if (!this.field4037.method3427()) {
         return null;
      } else if (!this.field4066.method3223(var2.field2919, var2.field2921)) {
         return null;
      } else {
         HashMap var4 = this.field4037.method3425();
         List var5 = (List)var4.get(var1);
         if (var5 != null && !var5.isEmpty()) {
            class185 var6 = null;
            int var7 = -1;
            Iterator var8 = var5.iterator();

            while(true) {
               class185 var9;
               int var12;
               do {
                  if (!var8.hasNext()) {
                     return var6.field2109;
                  }

                  var9 = (class185)var8.next();
                  int var10 = var9.field2109.field2919 - var2.field2919;
                  int var11 = var9.field2109.field2921 - var2.field2921;
                  var12 = var10 * var10 + var11 * var11;
                  if (var12 == 0) {
                     return var9.field2109;
                  }
               } while(var12 >= var7 && var6 != null);

               var6 = var9;
               var7 = var12;
            }
         } else {
            return null;
         }
      }
   }

   static class230[] method6273() {
      return new class230[]{class230.field2792, class230.field2790, class230.field2789, class230.field2793, class230.field2791, class230.field2796};
   }
}
