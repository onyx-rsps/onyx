import java.lang.ref.SoftReference;

public class class221 extends class224 {
   SoftReference field2554;

   class221(Object var1, int var2) {
      super(var2);
      this.field2554 = new SoftReference(var1);
   }

   boolean vmethod4327() {
      return true;
   }

   Object vmethod4325() {
      return this.field2554.get();
   }
}
