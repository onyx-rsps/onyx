import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class278 {
   public static Comparator field3615;
   public static Comparator field3617;
   public static Comparator field3618;
   public static Comparator field3619;
   public final List field3616;

   static {
      field3615 = new class281();
      new class283();
      field3617 = new class286();
      field3619 = new class280();
      field3618 = new class279();
   }

   public class278(class384 var1, boolean var2) {
      int var3 = var1.method6655();
      boolean var4 = var1.method6560() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.method6655();
      this.field3616 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field3616.add(new class284(var1, var5, var3));
      }

   }

   public void method5018(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.field3616, var1);
      } else {
         Collections.sort(this.field3616, Collections.reverseOrder(var1));
      }

   }
}
