public abstract class class343 implements class216 {
   class377 field3941;

   class343(int var1) {
   }

   public void method5411(Buffer var1) {
      while(true) {
         int var3 = var1.method5948();
         if (var3 == 0) {
            return;
         }

         class339[] var4 = new class339[]{class339.field3931, class339.field3934, class339.field3929, class339.field3930};
         class339 var5 = (class339)class251.method4287(var4, var3);
         if (null != var5) {
            switch(var5.field3932) {
            case 0:
               int var6 = var1.method5948();
               this.field3941 = class175.method3143(var6);
               if (null != this.field3941) {
                  break;
               }

               throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
            case 1:
               class251.method4287(class180.method3188(), var1.method5948());
               break;
            case 2:
            default:
               throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var5);
            case 3:
               var1.method6094();
            }
         } else {
            this.method5409(var1, var3);
         }
      }
   }

   boolean method5410() {
      return this.field3941 != null;
   }

   Object method5417() {
      if (this.field3941 == class377.field4164) {
         return 0;
      } else if (class377.field4160 == this.field3941) {
         return -1L;
      } else {
         return this.field3941 == class377.field4165 ? "" : null;
      }
   }

   public static void method5419(int var0, int var1, int var2, boolean var3) {
      class229 var5 = class149.method2495(class227.field2635, client.field453.field1205);
      var5.field2691.writeByte(var2);
      var5.field2691.method6122(var1);
      var5.field2691.method6077(var0);
      var5.field2691.writeInt(var3 ? client.field489 * -1636832173 * -2076624933 : 0);
      client.field453.method1963(var5);
   }

   abstract void method5409(Buffer var1, int var2);
}
