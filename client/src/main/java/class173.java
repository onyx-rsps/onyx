public class class173 extends class185 {
   final class180 field2015;
   final int field2016;
   final int field2017;
   final int field2018;

   class173(class244 var1, class244 var2, int var3, class180 var4) {
      super(var1, var2);
      this.field2016 = var3;
      this.field2015 = var4;
      class140 var5 = class72.method1825(this.vmethod3612());
      class397 var6 = var5.method2651(false);
      if (var6 != null) {
         this.field2017 = var6.field4269;
         this.field2018 = var6.field4270;
      } else {
         this.field2017 = 0;
         this.field2018 = 0;
      }

   }

   class180 vmethod3613() {
      return this.field2015;
   }

   public int vmethod3612() {
      return this.field2016;
   }

   int vmethod3631() {
      return this.field2017;
   }

   int vmethod3615() {
      return this.field2018;
   }
}
