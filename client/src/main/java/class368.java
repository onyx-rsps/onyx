import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class368 {
   RandomAccessFile field4130;
   long field4128;
   final long field4129;

   public class368(File var1, String var2, long var3) throws IOException {
      if (-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.field4130 = new RandomAccessFile(var1, var2);
      this.field4129 = var3;
      this.field4128 = 0L;
      int var5 = this.field4130.read();
      if (var5 != -1 && !var2.equals("r")) {
         this.field4130.seek(0L);
         this.field4130.write(var5);
      }

      this.field4130.seek(0L);
   }

   public final void method6371(boolean var1) throws IOException {
      if (this.field4130 != null) {
         if (var1) {
            try {
               this.field4130.getFD().sync();
            } catch (SyncFailedException var4) {
            }
         }

         this.field4130.close();
         this.field4130 = null;
      }

   }

   public final long method6357() throws IOException {
      return this.field4130.length();
   }

   public final void method6360() throws IOException {
      this.method6371(false);
   }

   public final int method6363(byte[] var1, int var2, int var3) throws IOException {
      int var5 = this.field4130.read(var1, var2, var3);
      if (var5 > 0) {
         this.field4128 += (long)var5;
      }

      return var5;
   }

   final void method6358(long var1) throws IOException {
      this.field4130.seek(var1);
      this.field4128 = var1;
   }

   public final void method6364(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + this.field4128 > this.field4129) {
         this.field4130.seek(this.field4129);
         this.field4130.write(1);
         throw new EOFException();
      } else {
         this.field4130.write(var1, var2, var3);
         this.field4128 += (long)var3;
      }
   }

   protected void finalize() throws Throwable {
      if (this.field4130 != null) {
         System.out.println("");
         this.method6360();
      }

   }
}
