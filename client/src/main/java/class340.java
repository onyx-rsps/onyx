public abstract class class340 extends class216 implements class391 {
   protected class340(class265 var1, class291 var2, int var3) {
      super(var1, var2, var3);
   }

   protected abstract class342 vmethod6414(int var1);

   public int method5968() {
      return super.field2547;
   }

   public Object vmethod6867(int var1) {
      class342 var3 = this.vmethod6414(var1);
      return var3 != null && var3.method5987() ? var3.method5994() : null;
   }

   public class392 method5981(Buffer var1) {
      int var3 = var1.method6655();
      class342 var4 = this.vmethod6414(var3);
      class392 var5 = new class392(var3);
      Class var6 = var4.field3940.field4160;
      if (var6 == Integer.class) {
         var5.field4241 = var1.method6784();
      } else if (var6 == Long.class) {
         var5.field4241 = var1.method6566();
      } else if (var6 == String.class) {
         var5.field4241 = var1.method6706();
      } else {
         try {
            class387 var7 = (class387)var6.newInstance();
            var7.method6838(var1);
            var5.field4241 = var7;
         } catch (InstantiationException var8) {
         } catch (IllegalAccessException var9) {
         }
      }

      return var5;
   }
}
