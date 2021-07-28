import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class class17 extends class394 {
   Component field93;
   Image field94;

   class17(int var1, int var2, Component var3) {
      super.field4253 = var1;
      super.field4252 = var2;
      super.field4251 = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.field4251, super.field4251.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field4253, super.field4252), var4, (Point)null);
      this.field94 = new BufferedImage(var5, var6, false, new Hashtable());
      this.method179(var3);
      this.method6955();
   }

   final void method182(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var7 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field94, 0, 0, this.field93);
         var1.setClip(var7);
      } catch (Exception var8) {
         this.field93.repaint();
      }

   }

   final void method192(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field94, var2, var3, this.field93);
      } catch (Exception var6) {
         this.field93.repaint();
      }

   }

   final void method179(Component var1) {
      this.field93 = var1;
   }

   public final void vmethod6948(int var1, int var2) {
      this.method192(this.field93.getGraphics(), var1, var2);
   }

   public final void vmethod6947(int var1, int var2, int var3, int var4) {
      this.method182(this.field93.getGraphics(), var1, var2, var3, var4);
   }
}
