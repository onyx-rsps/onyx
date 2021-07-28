import java.util.Iterator;

public class class171 implements class187 {
   int field1997;
   int field1998;
   int field1999;
   int field2000;
   int field2001;
   int field2002;
   int field2003;
   int field2004;
   int field2005;
   int field2006;

   class171() {
   }

   public boolean vmethod3650(int var1, int var2) {
      return var1 >= (this.field1998 << 6) + (this.field2000 << 3) && var1 <= (this.field1998 << 6) + (this.field2000 << 3) + 7 && var2 >= (this.field2005 << 6) + (this.field2001 << 3) && var2 <= (this.field2005 << 6) + (this.field2001 << 3) + 7;
   }

   public boolean vmethod3652(int var1, int var2, int var3) {
      if (var1 >= this.field1997 && var1 < this.field1997 + this.field2002) {
         return var2 >= (this.field1999 << 6) + (this.field2003 << 3) && var2 <= (this.field1999 << 6) + (this.field2003 << 3) + 7 && var3 >= (this.field2006 << 6) + (this.field2004 << 3) && var3 <= (this.field2006 << 6) + (this.field2004 << 3) + 7;
      } else {
         return false;
      }
   }

   public void vmethod3649(class167 var1) {
      if (var1.field1952 > this.field1998) {
         var1.field1952 = this.field1998;
      }

      if (var1.field1950 < this.field1998) {
         var1.field1950 = this.field1998;
      }

      if (var1.field1951 > this.field2005) {
         var1.field1951 = this.field2005;
      }

      if (var1.field1956 < this.field2005) {
         var1.field1956 = this.field2005;
      }

   }

   public class244 vmethod3653(int var1, int var2) {
      if (!this.vmethod3650(var1, var2)) {
         return null;
      } else {
         int var4 = this.field1999 * 64 - this.field1998 * 64 + (this.field2003 * 8 - this.field2000 * 8) + var1;
         int var5 = this.field2006 * 64 - this.field2005 * 64 + var2 + (this.field2004 * 8 - this.field2001 * 8);
         return new class244(this.field1997, var4, var5);
      }
   }

   public int[] vmethod3651(int var1, int var2, int var3) {
      if (!this.vmethod3652(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field1998 * 64 - this.field1999 * 64 + var2 + (this.field2000 * 8 - this.field2003 * 8), var3 + (this.field2005 * 64 - this.field2006 * 64) + (this.field2001 * 8 - this.field2004 * 8)};
         return var5;
      }
   }

   void method3469() {
   }

   public void vmethod3660(class384 var1) {
      this.field1997 = var1.method6560();
      this.field2002 = var1.method6560();
      this.field1999 = var1.method6655();
      this.field2003 = var1.method6560();
      this.field2006 = var1.method6655();
      this.field2004 = var1.method6560();
      this.field1998 = var1.method6655();
      this.field2000 = var1.method6560();
      this.field2005 = var1.method6655();
      this.field2001 = var1.method6560();
      this.method3469();
   }

   static void method3482() {
      Iterator var1 = class84.field1193.iterator();

      while(var1.hasNext()) {
         class44 var2 = (class44)var1.next();
         var2.method857();
      }

   }

   public static long method3480(int var0, int var1, int var2, boolean var3, int var4) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }
}
