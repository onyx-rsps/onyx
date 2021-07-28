import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class9 implements class131, MouseWheelListener {
   int field30;

   class9() {
      this.field30 = 0;
   }

   void method68(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void method70(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized int vmethod2550() {
      int var2 = this.field30;
      this.field30 = 0;
      return var2;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field30 += var1.getWheelRotation();
   }
}
