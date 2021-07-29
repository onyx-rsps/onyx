public abstract class class342 implements class215 {
   class376 field3940;

   class342(int var1) {
   }

   boolean method5987() {
      return this.field3940 != null;
   }

   Object method5994() {
      if (this.field3940 == class376.field4163) {
         return 0;
      } else if (this.field3940 == class376.field4159) {
         return -1L;
      } else {
         return this.field3940 == class376.field4164 ? "" : null;
      }
   }

   public void method5988(Buffer var1) {
      while(true) {
         int var3 = var1.method6560();
         if (var3 == 0) {
            return;
         }

         class338[] var4 = new class338[]{class338.field3930, class338.field3933, class338.field3928, class338.field3929};
         class338 var5 = (class338)class250.method4750(var4, var3);
         if (var5 != null) {
            switch(var5.field3931) {
            case 0:
               int var6 = var1.method6560();
               this.field3940 = class174.method3524(var6);
               if (this.field3940 != null) {
                  break;
               }

               throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
            case 1:
               class250.method4750(class179.method3576(), var1.method6560());
               break;
            case 2:
            default:
               throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var5);
            case 3:
               var1.method6706();
            }
         } else {
            this.vmethod5986(var1, var3);
         }
      }
   }

   abstract void vmethod5986(Buffer var1, int var2);

   public static void method5996(int var0, int var1, int var2, boolean var3) {
      class228 var5 = class148.method2788(class226.field2634, client.field452.field1204);
      var5.field2690.writeByte(var2);
      var5.field2690.method6734(var1);
      var5.field2690.method6689(var0);
      var5.field2690.writeInt(var3 ? client.field488 : 0);
      client.field452.method2031(var5);
   }
}
