public class class355 extends class353 {
   static byte[][] field4010;
   boolean field3979;
   boolean field3992;
   int field3985;
   int field3988;
   int field3989;
   int field3990;
   int field3991;
   int field3995;
   int field3996;
   int field3997;
   int field4001;
   int field4002;
   int field4003;
   int field4004;
   int field4005;
   int field4008;
   int field4009;
   int[] field3998;
   String field3977;
   String field3986;
   String field3987;
   String field3993;
   String field3999;
   String field4000;
   String field4007;

   class355(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
      this.field3998 = new int[3];
      this.field3985 = var1;
      this.field3979 = var2;
      this.field3996 = var3;
      this.field3988 = var4;
      this.field3989 = var5;
      this.field3990 = var6;
      this.field3991 = var7;
      this.field3992 = var8;
      this.field4009 = var9;
      this.field3995 = var10;
      this.field4005 = var11;
      this.field3997 = var12;
      this.field3977 = var13;
      this.field3986 = var14;
      this.field3999 = var15;
      this.field4000 = var16;
      this.field4001 = var17;
      this.field4002 = var18;
      this.field4003 = var19;
      this.field4004 = var20;
      this.field3987 = var21;
      this.field4007 = var22;
      this.field3998 = var23;
      this.field4008 = var24;
      this.field3993 = var25;
   }

   public int method6038() {
      byte var2 = 39;
      int var3 = var2 + class281.method5053(this.field3977);
      var3 += class281.method5053(this.field3986);
      var3 += class281.method5053(this.field3999);
      var3 += class281.method5053(this.field4000);
      var3 += class281.method5053(this.field3987);
      var3 += class281.method5053(this.field4007);
      var3 += class281.method5053(this.field3993);
      return var3;
   }

   public void method6037(Buffer var1) {
      var1.writeByte(8);
      var1.writeByte(this.field3985);
      var1.writeByte(this.field3979 ? 1 : 0);
      var1.method6734(this.field3996);
      var1.writeByte(this.field3988);
      var1.writeByte(this.field3989);
      var1.writeByte(this.field3990);
      var1.writeByte(this.field3991);
      var1.writeByte(this.field3992 ? 1 : 0);
      var1.method6734(this.field4009);
      var1.writeByte(this.field3995);
      var1.method6723(this.field4005);
      var1.method6734(this.field3997);
      var1.method6551(this.field3977);
      var1.method6551(this.field3986);
      var1.method6551(this.field3999);
      var1.method6551(this.field4000);
      var1.writeByte(this.field4002);
      var1.method6734(this.field4001);
      var1.method6551(this.field3987);
      var1.method6551(this.field4007);
      var1.writeByte(this.field4003);
      var1.writeByte(this.field4004);

      for(int var3 = 0; var3 < this.field3998.length; ++var3) {
         var1.writeInt(this.field3998[var3]);
      }

      var1.writeInt(this.field4008);
      var1.method6551(this.field3993);
   }
}
