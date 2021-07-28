import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;

public class class19 implements MouseListener, MouseMotionListener, FocusListener {
   public static class19 field134;
   public static int field140;
   public static int field141;
   public static int field144;
   public static int field148;
   public static int field149;
   public static int field150;
   public static long field143;
   public static long field151;
   public static volatile int field135;
   public static volatile int field137;
   public static volatile int field138;
   public static volatile int field142;
   public static volatile int field145;
   public static volatile int field146;
   public static volatile int field153;
   public static volatile long field132;
   public static volatile long field147;
   static class69 field139;
   static int field136;

   static {
      field134 = new class19();
      field145 = 0;
      field142 = 0;
      field137 = -1;
      field138 = -1;
      field132 = -1L;
      field140 = 0;
      field141 = 0;
      field144 = 0;
      field143 = 0L;
      field153 = 0;
      field135 = 0;
      field146 = 0;
      field147 = 0L;
      field148 = 0;
      field149 = 0;
      field150 = 0;
      field151 = 0L;
   }

   class19() {
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (field134 != null) {
         field145 = 0;
         field137 = var1.getX();
         field138 = var1.getY();
         field132 = var1.getWhen();
      }

   }

   final int method351(MouseEvent var1) {
      int var3 = var1.getButton();
      if (!var1.isAltDown() && var3 != 2) {
         return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (field134 != null) {
         field145 = 0;
         field135 = var1.getX();
         field146 = var1.getY();
         field147 = class86.currentTime();
         field153 = this.method351(var1);
         if (field153 != 0) {
            field142 = field153;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (field134 != null) {
         field145 = 0;
         field137 = -1;
         field138 = -1;
         field132 = var1.getWhen();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (field134 != null) {
         field145 = 0;
         field142 = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field134 != null) {
         field142 = 0;
      }

   }

   static void method349() {
      Iterator var1 = class84.field1193.iterator();

      while(var1.hasNext()) {
         class44 var2 = (class44)var1.next();
         var2.method861();
      }

   }

   static final void method369(String var0) {
      class120.method2408(30, "", var0);
   }

   static final void method368(int var0, int var1) {
      if (client.field637[var0] != null) {
         if (var1 >= 0 && var1 < client.field637[var0].method2452()) {
            class105 var3 = (class105)client.field637[var0].field1435.get(var1);
            if (var3.field1305 == -1) {
               class85 var4 = client.field452;
               class228 var5 = class148.method2788(class226.field2645, var4.field1204);
               var5.field2690.writeByte(3 + class280.method5040(var3.field1302.method7141()));
               var5.field2690.writeByte(var0);
               var5.field2690.method6734(var1);
               var5.field2690.method6550(var3.field1302.method7141());
               var4.method2031(var5);
            }
         }
      }
   }
}
