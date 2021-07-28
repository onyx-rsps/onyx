import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class13 extends class24 {
   byte[] field83;
   int field81;
   AudioFormat field80;
   SourceDataLine field82;

   class13() {
   }

   protected void vmethod470() {
      this.field82.flush();
   }

   protected void vmethod462() {
      if (this.field82 != null) {
         this.field82.close();
         this.field82 = null;
      }

   }

   protected void vmethod459(int var1) throws LineUnavailableException {
      try {
         Info var3 = new Info(SourceDataLine.class, this.field80, var1 << (class24.field198 ? 2 : 1));
         this.field82 = (SourceDataLine)AudioSystem.getLine(var3);
         this.field82.open();
         this.field82.start();
         this.field81 = var1;
      } catch (LineUnavailableException var4) {
         if (class124.method2467(var1) != 1) {
            this.vmethod459(class26.method530(var1));
         } else {
            this.field82 = null;
            throw var4;
         }
      }
   }

   protected int vmethod483() {
      return this.field81 - (this.field82.available() >> (class24.field198 ? 2 : 1));
   }

   protected void vmethod457() {
      int var1 = 256;
      if (class24.field198) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field182[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field83[var2 * 2] = (byte)(var3 >> 8);
         this.field83[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field82.write(this.field83, 0, var1 << 1);
   }

   protected void vmethod458() {
      this.field80 = new AudioFormat((float)class281.field3633, 16, class24.field198 ? 2 : 1, true, false);
      this.field83 = new byte[256 << (class24.field198 ? 2 : 1)];
   }
}
