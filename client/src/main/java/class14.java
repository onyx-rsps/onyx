import java.applet.Applet;
import netscape.javascript.JSObject;

public class class14 {
   public static Object method155(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   public static void method147(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   public static Object method148(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }
}
