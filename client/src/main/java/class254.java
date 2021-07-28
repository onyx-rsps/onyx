import java.nio.ByteBuffer;

public class class254 extends class252 {
   static String[] field3126;
   ByteBuffer field3125;

   public class254() {
   }

   byte[] vmethod4786() {
      byte[] var2 = new byte[this.field3125.capacity()];
      this.field3125.position(0);
      this.field3125.get(var2);
      return var2;
   }

   public void vmethod4787(byte[] var1) {
      this.field3125 = ByteBuffer.allocateDirect(var1.length);
      this.field3125.position(0);
      this.field3125.put(var1);
   }
}
