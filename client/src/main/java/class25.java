public class class25 {
   int field203;
   int field205;
   int field206;
   int field207;
   int field208;
   int field209;
   int field210;
   int field211;
   int field212;
   int[] field202;
   int[] field204;

   class25() {
      this.field205 = 2;
      this.field204 = new int[2];
      this.field202 = new int[2];
      this.field204[0] = 0;
      this.field204[1] = 65535;
      this.field202[0] = 0;
      this.field202[1] = 65535;
   }

   final void method512(Buffer var1) {
      this.field212 = var1.method6560();
      this.field207 = var1.method6784();
      this.field206 = var1.method6784();
      this.method522(var1);
   }

   final void method514() {
      this.field203 = 0;
      this.field209 = 0;
      this.field210 = 0;
      this.field211 = 0;
      this.field208 = 0;
   }

   final void method522(Buffer var1) {
      this.field205 = var1.method6560();
      this.field204 = new int[this.field205];
      this.field202 = new int[this.field205];

      for(int var2 = 0; var2 < this.field205; ++var2) {
         this.field204[var2] = var1.method6655();
         this.field202[var2] = var1.method6655();
      }

   }

   final int method515(int var1) {
      if (this.field208 >= this.field203) {
         this.field211 = this.field202[this.field209++] << 15;
         if (this.field209 >= this.field205) {
            this.field209 = this.field205 - 1;
         }

         this.field203 = (int)((double)this.field204[this.field209] / 65536.0D * (double)var1);
         if (this.field203 > this.field208) {
            this.field210 = ((this.field202[this.field209] << 15) - this.field211) / (this.field203 - this.field208);
         }
      }

      this.field211 += this.field210;
      ++this.field208;
      return this.field211 - this.field210 >> 15;
   }
}
