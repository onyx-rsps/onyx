import java.awt.Image;
import java.math.BigInteger;

public class RSA {
   static Image field795;
   static final BigInteger publicModulus;
   static final BigInteger publicExponent;

   static {
      publicExponent = new BigInteger("10001", 16);
      publicModulus = new BigInteger(ClientLauncher.INSTANCE.getMODULUS(), 16);
   }

   public static synchronized byte[] method1544(int var0) {
      return class310.method5045(var0, false);
   }
}
