public class Node {
   public Node field3965;
   public Node field3967;
   public long key;

   public Node() {
   }

   public void method5437() {
      if (this.field3967 != null) {
         this.field3967.field3965 = this.field3965;
         this.field3965.field3967 = this.field3967;
         this.field3965 = null;
         this.field3967 = null;
      }
   }
}
