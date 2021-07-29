import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;

public class class20 implements MouseListener, MouseMotionListener, FocusListener {
   public static class20 field135;
   public static int field141;
   public static int field142;
   public static int field145;
   public static int field149;
   public static int field150;
   public static int field151;
   public static long field144;
   public static long field152;
   public static volatile int field136;
   public static volatile int field138;
   public static volatile int field139;
   public static volatile int field143;
   public static volatile int field146;
   public static volatile int field147;
   public static volatile int field154;
   public static volatile long field133;
   public static volatile long field148;
   static class70 field140;
   static int field137;

   static {
      field135 = new class20();
      field146 = 0;
      field143 = 0;
      field138 = -1;
      field139 = -1;
      field133 = -1L;
      field141 = 0;
      field142 = 0;
      field145 = 0;
      field144 = 0L;
      field154 = 0;
      field136 = 0;
      field147 = 0;
      field148 = 0L;
      field149 = 0;
      field150 = 0;
      field151 = 0;
      field152 = 0L;
   }

   class20() {
   }

   final int method308(MouseEvent var1) {
      int var3 = var1.getButton();
      if (!var1.isAltDown() && var3 != 2) {
         return !var1.isMetaDown() && 3 != var3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (null != field135) {
         field146 = 0;
         field136 = var1.getX();
         field147 = var1.getY();
         field148 = Clock.now();
         field154 = this.method308(var1);
         if (field154 != 0) {
            field143 = field154;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   static void method306() {
      Iterator var1 = class85.field1194.iterator();

      while(var1.hasNext()) {
         class45 var2 = (class45)var1.next();
         var2.method781();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (field135 != null) {
         field146 = 0;
         field143 = 0;
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

   public final synchronized void mouseExited(MouseEvent var1) {
      if (field135 != null) {
         field146 = 0;
         field138 = -1;
         field139 = -1;
         field133 = var1.getWhen();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (field135 != null) {
         field146 = 0;
         field138 = var1.getX();
         field139 = var1.getY();
         field133 = var1.getWhen();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (null != field135) {
         field143 = 0;
      }

   }

   static final void method326(String var0) {
      class121.method2204(30, "", var0);
   }

   static final void method325(int var0, int var1) {
      if (null != client.field638[var0]) {
         if (var1 >= 0 && var1 < client.field638[var0].method2230()) {
            class106 var3 = (class106)client.field638[var0].field1436.get(var1);
            if (var3.field1306 == -1) {
               class86 var4 = client.field453;
               class229 var5 = class149.method2495(class227.field2646, var4.field1205);
               var5.field2691.writeByte(3 + class281.method4532(var3.field1303.method6521()));
               var5.field2691.writeByte(var0);
               var5.field2691.method6122(var1);
               var5.field2691.method5938(var3.field1303.method6521());
               var4.method1963(var5);
            }
         }
      }
   }
}
