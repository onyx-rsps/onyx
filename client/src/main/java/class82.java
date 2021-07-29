public class class82 {
   static boolean field1182;
   static byte[] field1170;
   static byte[] field1174;
   static Buffer field1181;
   static Buffer[] field1167;
   static int field1171;
   static int field1173;
   static int field1179;
   static int[] field1169;
   static int[] field1175;
   static int[] field1176;
   static int[] field1177;
   static int[] field1178;
   static int[] field1180;

   static {
      field1174 = new byte[2048];
      field1170 = new byte[2048];
      field1167 = new Buffer[2048];
      field1171 = 0;
      field1177 = new int[2048];
      field1173 = 0;
      field1169 = new int[2048];
      field1176 = new int[2048];
      field1175 = new int[2048];
      field1178 = new int[2048];
      field1179 = 0;
      field1180 = new int[2048];
      field1181 = new Buffer(new byte[5000]);
   }

   public static void method1954(class276 var0, int var1, int var2, int var3, boolean var4) {
      class234.field2818 = 1;
      class234.field2819 = var0;
      class234.field2821 = var1;
      class96.field1263 = var2;
      class146.field1611 = var3;
      class145.field1597 = var4;
      class123.field1438 = 10000;
   }

   public static boolean method1953(int var0) {
      return (var0 >> 20 & 1) != 0;
   }
}
