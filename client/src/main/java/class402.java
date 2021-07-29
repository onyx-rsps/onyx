import java.util.zip.Inflater;

public class class402 {
   Inflater field4301;

   public class402() {
      this(-1, 1000000);
   }

   class402(int var1, int var2) {
   }

   public void method7132(Buffer var1, byte[] var2) {
      if (var1.payload[var1.field4181 * -1084587701] == 31 && var1.payload[var1.field4181 * -1084587701 + 1] == -117) {
         if (this.field4301 == null) {
            this.field4301 = new Inflater(true);
         }

         try {
            this.field4301.setInput(var1.payload, var1.field4181 * -1084587701 + 10, var1.payload.length - (var1.field4181 * -1084587701 + 8 + 10));
            this.field4301.inflate(var2);
         } catch (Exception var5) {
            this.field4301.reset();
            throw new RuntimeException("");
         }

         this.field4301.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
