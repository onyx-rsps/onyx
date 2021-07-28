import java.io.IOException;
import java.net.Socket;

public class class330 extends class329 {
   static class190 field3878;
   class331 field3877;
   class332 field3875;
   Socket field3876;

   public class330(Socket var1, int var2, int var3) throws IOException {
      this.field3876 = var1;
      this.field3876.setSoTimeout(30000);
      this.field3876.setTcpNoDelay(true);
      this.field3876.setReceiveBufferSize(65536);
      this.field3876.setSendBufferSize(65536);
      this.field3877 = new class331(this.field3876.getInputStream(), var2);
      this.field3875 = new class332(this.field3876.getOutputStream(), var3);
   }

   public void vmethod5858() {
      this.field3875.method5903();

      try {
         this.field3876.close();
      } catch (IOException var3) {
      }

      this.field3877.method5882();
   }

   public boolean vmethod5862(int var1) throws IOException {
      return this.field3877.method5877(var1);
   }

   public int vmethod5856(byte[] var1, int var2, int var3) throws IOException {
      return this.field3877.method5879(var1, var2, var3);
   }

   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.field3875.method5916(var1, var2, var3);
   }

   public int available() throws IOException {
      return this.field3877.method5897();
   }

   public int read() throws IOException {
      return this.field3877.method5875();
   }

   protected void finalize() {
      this.vmethod5858();
   }

   public static void method5869(class276 var0) {
      class152.field1697 = var0;
   }
}
