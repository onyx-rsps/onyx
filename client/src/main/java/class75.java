import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import javax.imageio.ImageIO;

public class class75 {
   public static class276 field1119;
   static int field1111;
   static String field1123;
   boolean field1112;
   boolean field1113;
   boolean field1116;
   double field1117;
   int field1115;
   int field1118;
   int field1120;
   int field1121;
   String field1122;
   LinkedHashMap field1114;

   static {
      field1111 = 7;
   }

   class75() {
      this.field1121 = 1;
      this.field1122 = null;
      this.field1116 = false;
      this.field1117 = 0.8D;
      this.field1118 = 127;
      this.field1120 = 127;
      this.field1115 = 127;
      this.field1114 = new LinkedHashMap();
      this.method1869(true);
   }

   class75(class384 var1) {
      this.field1121 = 1;
      this.field1122 = null;
      this.field1116 = false;
      this.field1117 = 0.8D;
      this.field1118 = 127;
      this.field1120 = 127;
      this.field1115 = 127;
      this.field1114 = new LinkedHashMap();
      if (var1 != null && var1.payload != null) {
         int var2 = var1.method6560();
         if (var2 >= 0 && var2 <= field1111) {
            if (var1.method6560() == 1) {
               this.field1112 = true;
            }

            if (var2 > 1) {
               this.field1113 = var1.method6560() == 1;
            }

            if (var2 > 3) {
               this.field1121 = var1.method6560();
            }

            if (var2 > 2) {
               int var3 = var1.method6560();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.method6784();
                  int var6 = var1.method6784();
                  this.field1114.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field1122 = var1.method6568();
            }

            if (var2 > 5) {
               this.field1116 = var1.method6790();
            }

            if (var2 > 6) {
               this.field1117 = (double)var1.method6560() / 100.0D;
               this.field1118 = var1.method6560();
               this.field1120 = var1.method6560();
               this.field1115 = var1.method6560();
            }
         } else {
            this.method1869(true);
         }
      } else {
         this.method1869(true);
      }

   }

   void method1869(boolean var1) {
   }

   class384 method1875() {
      class384 var2 = new class384(100);
      var2.writeByte(field1111);
      var2.writeByte(this.field1112 ? 1 : 0);
      var2.writeByte(this.field1113 ? 1 : 0);
      var2.writeByte(this.field1121);
      var2.writeByte(this.field1114.size());
      Iterator var3 = this.field1114.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var2.writeInt((Integer)var4.getKey());
         var2.writeInt((Integer)var4.getValue());
      }

      var2.method6550(this.field1122 != null ? this.field1122 : "");
      var2.method6549(this.field1116);
      var2.writeByte((int)(this.field1117 * 100.0D));
      var2.writeByte(this.field1118);
      var2.writeByte(this.field1120);
      var2.writeByte(this.field1115);
      return var2;
   }

   public static final class397 method1865(byte[] var0) {
      BufferedImage var2 = null;

      try {
         var2 = ImageIO.read(new ByteArrayInputStream(var0));
         int var3 = var2.getWidth();
         int var4 = var2.getHeight();
         int[] var5 = new int[var3 * var4];
         PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
         var6.grabPixels();
         return new class397(var5, var3, var4);
      } catch (IOException var8) {
      } catch (InterruptedException var9) {
      }

      return new class397(0, 0);
   }

   public static int[] method1874() {
      int[] var1 = new int[class10.field64];

      for(int var2 = 0; var2 < class10.field64; ++var2) {
         var1[var2] = class10.field55[var2];
      }

      return var1;
   }
}
