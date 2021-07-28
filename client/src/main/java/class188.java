import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class188 extends class167 {
   static class335 field2121;
   static class397[] field2126;
   HashSet field2122;
   HashSet field2124;
   List field2123;

   class188() {
   }

   void method3664(class384 var1, boolean var2) {
      this.field2123 = new LinkedList();
      int var4 = var1.method6655();

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var1.method6577();
         class244 var7 = new class244(var1.method6784());
         boolean var8 = var1.method6560() == 1;
         if (var2 || !var8) {
            this.field2123.add(new class173((class244)null, var7, var6, (class180)null));
         }
      }

   }

   void method3666(class384 var1, class384 var2, int var3, boolean var4) {
      this.method3220(var1, var3);
      int var6 = var2.method6655();
      this.field2124 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class162 var8 = new class162();

         try {
            var8.method3146(var2);
         } catch (IllegalStateException var13) {
            continue;
         }

         this.field2124.add(var8);
      }

      var7 = var2.method6655();
      this.field2122 = new HashSet(var7);

      for(int var11 = 0; var11 < var7; ++var11) {
         class170 var9 = new class170();

         try {
            var9.method3442(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field2122.add(var9);
      }

      this.method3664(var2, var4);
   }

   public static class229[] method3672() {
      return new class229[]{class229.field2787, class229.field2746, class229.field2693, class229.field2692, class229.field2695, class229.field2768, class229.field2697, class229.field2719, class229.field2699, class229.field2700, class229.field2701, class229.field2702, class229.field2767, class229.field2704, class229.field2705, class229.field2706, class229.field2707, class229.field2757, class229.field2755, class229.field2710, class229.field2694, class229.field2712, class229.field2713, class229.field2714, class229.field2748, class229.field2711, class229.field2750, class229.field2718, class229.field2717, class229.field2728, class229.field2721, class229.field2703, class229.field2723, class229.field2724, class229.field2725, class229.field2726, class229.field2756, class229.field2715, class229.field2729, class229.field2730, class229.field2731, class229.field2774, class229.field2733, class229.field2734, class229.field2735, class229.field2736, class229.field2737, class229.field2738, class229.field2709, class229.field2740, class229.field2741, class229.field2742, class229.field2720, class229.field2744, class229.field2745, class229.field2727, class229.field2732, class229.field2781, class229.field2749, class229.field2770, class229.field2751, class229.field2752, class229.field2747, class229.field2754, class229.field2722, class229.field2769, class229.field2698, class229.field2758, class229.field2759, class229.field2760, class229.field2761, class229.field2762, class229.field2763, class229.field2708, class229.field2765, class229.field2766, class229.field2716, class229.field2783, class229.field2777, class229.field2743, class229.field2771, class229.field2772, class229.field2773, class229.field2691, class229.field2775, class229.field2776, class229.field2764, class229.field2778, class229.field2779, class229.field2780, class229.field2753, class229.field2782, class229.field2696, class229.field2784, class229.field2785};
   }

   static class47 method3665() {
      class47.field693 = 0;
      return class112.method2276();
   }
}
