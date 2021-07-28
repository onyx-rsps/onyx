import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class365 implements class364 {
   Map field4112;
   final class391 field4110;

   public class365(class391 var1) {
      this.field4110 = var1;
   }

   public int vmethod6340(int var1) {
      if (this.field4112 != null) {
         class392 var3 = (class392)this.field4112.get(var1);
         if (var3 != null) {
            return (Integer)var3.field4241;
         }
      }

      return (Integer)this.field4110.vmethod6867(var1);
   }

   public void vmethod6337(int var1, Object var2) {
      if (this.field4112 == null) {
         this.field4112 = new HashMap();
         this.field4112.put(var1, new class392(var1, var2));
      } else {
         class392 var4 = (class392)this.field4112.get(var1);
         if (var4 == null) {
            this.field4112.put(var1, new class392(var1, var2));
         } else {
            var4.field4241 = var2;
         }
      }

   }

   public Iterator iterator() {
      return this.field4112 == null ? Collections.emptyList().iterator() : this.field4112.values().iterator();
   }
}
