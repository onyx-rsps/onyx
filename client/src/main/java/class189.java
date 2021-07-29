import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class189 extends class168 {
   static class336 field2122;
   static class398[] field2127;
   HashSet field2123;
   HashSet field2125;
   List field2124;

   class189() {
   }

   void method3262(class385 var1, class385 var2, int var3, boolean var4) {
      this.method2890(var1, var3);
      int var6 = var2.method6043();
      this.field2125 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class163 var8 = new class163();

         try {
            var8.method2853(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field2125.add(var8);
      }

      var7 = var2.method6043();
      this.field2123 = new HashSet(var7);

      for(int var13 = 0; var13 < var7; ++var13) {
         class171 var9 = new class171();

         try {
            var9.method3112(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field2123.add(var9);
      }

      this.method3260(var2, var4);
   }

   void method3260(class385 var1, boolean var2) {
      this.field2124 = new LinkedList();
      int var4 = var1.method6043();

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var1.method5965();
         class245 var7 = new class245(var1.method6172());
         boolean var8 = var1.method5948() == 1;
         if (var2 || !var8) {
            this.field2124.add(new class174((class245)null, var7, var6, (class181)null));
         }
      }

   }

   public static class230[] method3268() {
      return new class230[]{class230.field2788, class230.field2747, class230.field2694, class230.field2693, class230.field2696, class230.field2769, class230.field2698, class230.field2720, class230.field2700, class230.field2701, class230.field2702, class230.field2703, class230.field2768, class230.field2705, class230.field2706, class230.field2707, class230.field2708, class230.field2758, class230.field2756, class230.field2711, class230.field2695, class230.field2713, class230.field2714, class230.field2715, class230.field2749, class230.field2712, class230.field2751, class230.field2719, class230.field2718, class230.field2729, class230.field2722, class230.field2704, class230.field2724, class230.field2725, class230.field2726, class230.field2727, class230.field2757, class230.field2716, class230.field2730, class230.field2731, class230.field2732, class230.field2775, class230.field2734, class230.field2735, class230.field2736, class230.field2737, class230.field2738, class230.field2739, class230.field2710, class230.field2741, class230.field2742, class230.field2743, class230.field2721, class230.field2745, class230.field2746, class230.field2728, class230.field2733, class230.field2782, class230.field2750, class230.field2771, class230.field2752, class230.field2753, class230.field2748, class230.field2755, class230.field2723, class230.field2770, class230.field2699, class230.field2759, class230.field2760, class230.field2761, class230.field2762, class230.field2763, class230.field2764, class230.field2709, class230.field2766, class230.field2767, class230.field2717, class230.field2784, class230.field2778, class230.field2744, class230.field2772, class230.field2773, class230.field2774, class230.field2692, class230.field2776, class230.field2777, class230.field2765, class230.field2779, class230.field2780, class230.field2781, class230.field2754, class230.field2783, class230.field2697, class230.field2785, class230.field2786};
   }

   static class48 method3261() {
      class48.field694 = 0;
      return class113.method2115();
   }
}
