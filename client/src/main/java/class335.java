public class class335 {
   static class396 field3919;
   public int field3907;
   public int field3908;
   public int field3909;
   public int field3910;
   public int field3911;
   public int field3912;
   public int field3913;
   public int field3914;
   public int field3915;
   public int field3916;
   public int field3917;

   public class335() {
      this.field3916 = -1;
      this.field3915 = -1;
      this.field3909 = -1;
      this.field3907 = -1;
      this.field3910 = -1;
      this.field3912 = -1;
      this.field3908 = -1;
      this.field3914 = -1;
      this.field3913 = -1;
      this.field3911 = -1;
      this.field3917 = -1;
   }

   public void method5931(class276 var1) {
      byte[] var3 = var1.method4927(class334.field3904.field3903);
      Buffer var4 = new Buffer(var3);

      while(true) {
         int var5 = var4.method6560();
         if (var5 == 0) {
            return;
         }

         switch(var5) {
         case 1:
            var4.method6564();
            break;
         case 2:
            this.field3916 = var4.method6577();
            this.field3915 = var4.method6577();
            this.field3909 = var4.method6577();
            this.field3907 = var4.method6577();
            this.field3910 = var4.method6577();
            this.field3912 = var4.method6577();
            this.field3908 = var4.method6577();
            this.field3914 = var4.method6577();
            this.field3913 = var4.method6577();
            this.field3911 = var4.method6577();
            this.field3917 = var4.method6577();
         }
      }
   }

   static int method5934(int var0, class58 var1, boolean var2) {
      if (var0 == 6800) {
         class50.field737[++class1.field3 - 1] = "";
         return 1;
      } else if (var0 != 6801 && var0 != 6802) {
         if (var0 == 6850) {
            class50.field737[++class1.field3 - 1] = "";
            return 1;
         } else if (var0 != 6851 && var0 != 6852) {
            if (var0 == 6853) {
               class50.field746[++class50.field745 - 1] = 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            class50.field746[++class50.field745 - 1] = -1;
            return 1;
         }
      } else {
         class50.field746[++class50.field745 - 1] = -1;
         return 1;
      }
   }
}
