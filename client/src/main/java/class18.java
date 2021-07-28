import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

public abstract class class18 extends Applet implements Runnable, FocusListener, WindowListener {
   protected static class129 field100;
   protected static int field119;
   protected static long[] field104;
   protected static long[] field111;
   static boolean field99;
   static class18 field114;
   static class274 field95;
   static class336 field127;
   static int field101;
   static int field102;
   static int field117;
   static int field125;
   static long field116;
   static long field122;
   static long field126;
   static volatile boolean field124;
   boolean field118;
   boolean field129;
   class9 field121;
   int field107;
   int field108;
   int field109;
   int field110;
   int field112;
   int field113;
   Canvas field105;
   Frame field98;
   Clipboard field96;
   final EventQueue field123;
   protected int field103;
   protected int field97;
   volatile boolean field106;
   volatile boolean field115;
   volatile long field120;

   static {
      field114 = null;
      field125 = 0;
      field116 = 0L;
      field99 = false;
      field101 = 20;
      field102 = 1;
      field119 = 0;
      field104 = new long[32];
      field111 = new long[32];
      field117 = 500;
      field124 = true;
      field122 = -1L;
      field126 = -1L;
   }

   protected class18() {
      this.field129 = false;
      this.field108 = 0;
      this.field109 = 0;
      this.field115 = true;
      this.field118 = false;
      this.field106 = false;
      this.field120 = 0L;
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
      }

      this.field123 = var1;
      class47.method1360(new class11());
   }

   protected final boolean method197() {
      String var2 = this.getDocumentBase().getHost().toLowerCase();
      if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if (var2.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                  var2 = var2.substring(0, var2.length() - 1);
               }

               if (var2.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.js5Error("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public final void destroy() {
      if (this == field114 && !field99) {
         field116 = class86.currentTime();
         class209.method4249(5000L);
         this.method211();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if (this == field114 && !field99) {
         this.field115 = true;
         if (class86.currentTime() - this.field120 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= class68.field970 && var2.height >= client.field686) {
               this.field106 = true;
            }
         }

      }
   }

   class336 method227() {
      Container var2 = this.method293();
      int var3 = Math.max(var2.getWidth(), this.field110);
      int var4 = Math.max(var2.getHeight(), this.field107);
      if (this.field98 != null) {
         Insets var5 = this.field98.getInsets();
         var3 -= var5.right + var5.left;
         var4 -= var5.bottom + var5.top;
      }

      return new class336(var3, var4);
   }

   Container method293() {
      return (Container)(this.field98 != null ? this.field98 : this);
   }

   protected void js5Error(String var1) {
      if (!this.field129) {
         this.field129 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
         }

      }
   }

   final void method256() {
      this.field118 = true;
   }

   final synchronized void method211() {
      if (!field99) {
         field99 = true;

         try {
            this.field105.removeFocusListener(this);
         } catch (Exception var6) {
         }

         try {
            this.vmethod905();
         } catch (Exception var5) {
         }

         if (this.field98 != null) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
            }
         }

         if (field100 != null) {
            try {
               field100.method2523();
            } catch (Exception var3) {
            }
         }

         this.vmethod899();
      }
   }

   final synchronized void method317() {
      Container var2 = this.method293();
      if (this.field105 != null) {
         this.field105.removeFocusListener(this);
         var2.remove(this.field105);
      }

      class68.field970 = Math.max(var2.getWidth(), this.field110);
      client.field686 = Math.max(var2.getHeight(), this.field107);
      Insets var3;
      if (this.field98 != null) {
         var3 = this.field98.getInsets();
         class68.field970 -= var3.right + var3.left;
         client.field686 -= var3.bottom + var3.top;
      }

      this.field105 = new class12(this);
      var2.setBackground(Color.BLACK);
      var2.setLayout((LayoutManager)null);
      var2.add(this.field105);
      this.field105.setSize(class68.field970, client.field686);
      this.field105.setVisible(true);
      this.field105.setBackground(Color.BLACK);
      if (var2 == this.field98) {
         var3 = this.field98.getInsets();
         this.field105.setLocation(this.field108 + var3.left, var3.top + this.field109);
      } else {
         this.field105.setLocation(this.field108, this.field109);
      }

      this.field105.addFocusListener(this);
      this.field105.requestFocus();
      this.field115 = true;
      if (class263.field3193 != null && class68.field970 == class263.field3193.field4253 && client.field686 == class263.field3193.field4252) {
         ((class17)class263.field3193).method179(this.field105);
         class263.field3193.vmethod6948(0, 0);
      } else {
         class263.field3193 = new class17(class68.field970, client.field686, this.field105);
      }

      this.field106 = false;
      this.field120 = class86.currentTime();
   }

   protected abstract void vmethod905();

   final void method202() {
      Container var2 = this.method293();
      if (var2 != null) {
         class336 var3 = this.method227();
         this.field103 = Math.max(var3.field3922, this.field110);
         this.field97 = Math.max(var3.field3920, this.field107);
         if (this.field103 <= 0) {
            this.field103 = 1;
         }

         if (this.field97 <= 0) {
            this.field97 = 1;
         }

         class68.field970 = Math.min(this.field103, this.field112);
         client.field686 = Math.min(this.field97, this.field113);
         this.field108 = (this.field103 - class68.field970) / 2;
         this.field109 = 0;
         this.field105.setSize(class68.field970, client.field686);
         class263.field3193 = new class17(class68.field970, client.field686, this.field105);
         if (var2 == this.field98) {
            Insets var4 = this.field98.getInsets();
            this.field105.setLocation(var4.left + this.field108, var4.top + this.field109);
         } else {
            this.field105.setLocation(this.field108, this.field109);
         }

         this.field115 = true;
         this.vmethod1106();
      }
   }

   protected abstract void vmethod1240();

   protected abstract void vmethod899();

   protected final void method224() {
      class54.field794 = null;
      class6.field12 = null;
      class94.field1249 = null;
   }

   protected final void method260(int var1, int var2, int var3) {
      try {
         if (field114 != null) {
            ++field125;
            if (field125 >= 3) {
               this.js5Error("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field114 = this;
         class68.field970 = var1;
         client.field686 = var2;
         class408.field4316 = var3;
         class408.field4317 = this;
         if (field100 == null) {
            field100 = new class129();
         }

         field100.method2512(this, 1);
      } catch (Exception var6) {
         class332.method5902((String)null, var6);
         this.js5Error("crash");
      }

   }

   void method208() {
      long var2 = class86.currentTime();
      long var4 = field111[class327.field3863];
      field111[class327.field3863] = var2;
      class327.field3863 = class327.field3863 + 1 & 31;
      if (var4 != 0L && var2 > var4) {
      }

      synchronized(this) {
         class255.field3127 = field124;
      }

      this.vmethod903();
   }

   void method209() {
      Container var2 = this.method293();
      long var3 = class86.currentTime();
      long var5 = field104[class132.field1484];
      field104[class132.field1484] = var3;
      class132.field1484 = class132.field1484 + 1 & 31;
      if (var5 != 0L && var3 > var5) {
         int var7 = (int)(var3 - var5);
         field119 = ((var7 >> 1) + 32000) / var7;
      }

      if (++field117 - 1 > 50) {
         field117 -= 50;
         this.field115 = true;
         this.field105.setSize(class68.field970, client.field686);
         this.field105.setVisible(true);
         if (var2 == this.field98) {
            Insets var8 = this.field98.getInsets();
            this.field105.setLocation(this.field108 + var8.left, this.field109 + var8.top);
         } else {
            this.field105.setLocation(this.field108, this.field109);
         }
      }

      if (this.field106) {
         this.method342();
      }

      this.method210();
      this.vmethod1219(this.field115);
      if (this.field115) {
         this.method204();
      }

      this.field115 = false;
   }

   protected abstract void vmethod903();

   protected final void method223(int var1, String var2, boolean var3) {
      try {
         Graphics var5 = this.field105.getGraphics();
         if (class6.field12 == null) {
            class6.field12 = new Font("Helvetica", 1, 13);
            class94.field1249 = this.field105.getFontMetrics(class6.field12);
         }

         if (var3) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class68.field970, client.field686);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (class54.field794 == null) {
               class54.field794 = this.field105.createImage(304, 34);
            }

            Graphics var7 = class54.field794.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var7.setFont(class6.field12);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class94.field1249.stringWidth(var2)) / 2, 22);
            var5.drawImage(class54.field794, class68.field970 / 2 - 152, client.field686 / 2 - 18, (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = class68.field970 / 2 - 152;
            int var9 = client.field686 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, var9 + 1, 301, 31);
            var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30);
            var5.setFont(class6.field12);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class94.field1249.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field105.repaint();
      }

   }

   final void method249(Object var1) {
      if (this.field123 != null) {
         for(int var3 = 0; var3 < 50 && this.field123.peekEvent() != null; ++var3) {
            class209.method4249(1L);
         }

         if (var1 != null) {
            this.field123.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   protected final void method200() {
      if (class129.field1468.toLowerCase().indexOf("microsoft") != -1) {
         class10.field39[186] = 57;
         class10.field39[187] = 27;
         class10.field39[188] = 71;
         class10.field39[189] = 26;
         class10.field39[190] = 72;
         class10.field39[191] = 73;
         class10.field39[192] = 58;
         class10.field39[219] = 42;
         class10.field39[220] = 74;
         class10.field39[221] = 43;
         class10.field39[222] = 59;
         class10.field39[223] = 28;
      } else {
         class10.field39[44] = 71;
         class10.field39[45] = 26;
         class10.field39[46] = 72;
         class10.field39[47] = 73;
         class10.field39[59] = 57;
         class10.field39[61] = 27;
         class10.field39[91] = 42;
         class10.field39[92] = 74;
         class10.field39[93] = 43;
         class10.field39[192] = 28;
         class10.field39[222] = 58;
         class10.field39[520] = 59;
      }

      Canvas var2 = this.field105;
      var2.setFocusTraversalKeysEnabled(false);
      var2.addKeyListener(class10.field58);
      var2.addFocusListener(class10.field58);
   }

   protected final void method201() {
      class180.method3577(this.field105);
   }

   protected class131 method198() {
      if (this.field121 == null) {
         this.field121 = new class9();
         this.field121.method68(this.field105);
      }

      return this.field121;
   }

   protected void method199() {
      this.field96 = this.getToolkit().getSystemClipboard();
   }

   protected abstract void vmethod1106();

   protected final void method301(int var1, int var2) {
      if (this.field112 != var1 || var2 != this.field113) {
         this.method256();
      }

      this.field112 = var1;
      this.field113 = var2;
   }

   final void method342() {
      Canvas var2 = this.field105;
      var2.removeKeyListener(class10.field58);
      var2.removeFocusListener(class10.field58);
      class10.field50 = -1;
      class175.method3534(this.field105);
      if (this.field121 != null) {
         this.field121.method70(this.field105);
      }

      this.method317();
      Canvas var3 = this.field105;
      var3.setFocusTraversalKeysEnabled(false);
      var3.addKeyListener(class10.field58);
      var3.addFocusListener(class10.field58);
      class180.method3577(this.field105);
      if (this.field121 != null) {
         this.field121.method68(this.field105);
      }

      this.method256();
   }

   final void method210() {
      class336 var2 = this.method227();
      if (this.field103 != var2.field3922 || var2.field3920 != this.field97 || this.field118) {
         this.method202();
         this.field118 = false;
      }

   }

   protected abstract void vmethod1219(boolean var1);

   void method204() {
      int var2 = this.field108;
      int var3 = this.field109;
      int var4 = this.field103 - class68.field970 - var2;
      int var5 = this.field97 - client.field686 - var3;
      if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
         try {
            Container var6 = this.method293();
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.field98) {
               Insets var9 = this.field98.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var11 = var6.getGraphics();
            var11.setColor(Color.black);
            if (var2 > 0) {
               var11.fillRect(var7, var8, var2, this.field97);
            }

            if (var3 > 0) {
               var11.fillRect(var7, var8, this.field103, var3);
            }

            if (var4 > 0) {
               var11.fillRect(var7 + this.field103 - var4, var8, var4, this.field97);
            }

            if (var5 > 0) {
               var11.fillRect(var7, var8 + this.field97 - var5, this.field103, var5);
            }
         } catch (Exception var10) {
         }
      }

   }

   protected void method195(String var1) {
      this.field96.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected final boolean method228() {
      return this.field98 != null;
   }

   public final void focusGained(FocusEvent var1) {
      field124 = true;
      this.field115 = true;
   }

   public void run() {
      try {
         if (class129.field1468 != null) {
            String var1 = class129.field1468.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class129.field1462;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.js5Error("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class281.method5041(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (class249.method4747(var4) && class277.method5010(var4) < 10) {
                     this.js5Error("wrongjava");
                     return;
                  }
               }

               field102 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method317();
         this.vmethod1240();

         Object var8;
         try {
            var8 = new class128();
         } catch (Throwable var6) {
            var8 = new class134();
         }

         class84.field1198 = (class136)var8;

         while(field116 == 0L || class86.currentTime() < field116) {
            class258.field3166 = class84.field1198.vmethod2612(field101, field102);

            for(int var5 = 0; var5 < class258.field3166; ++var5) {
               this.method208();
            }

            this.method209();
            this.method249(this.field105);
         }
      } catch (Exception var7) {
         class332.method5902((String)null, var7);
         this.js5Error("crash");
      }

      this.method211();
   }

   public final void start() {
      if (this == field114 && !field99) {
         field116 = 0L;
      }
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public final void focusLost(FocusEvent var1) {
      field124 = false;
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public abstract void init();

   public final void stop() {
      if (this == field114 && !field99) {
         field116 = class86.currentTime() + 4000L;
      }
   }

   public static boolean method345() {
      try {
         if (class234.field2818 == 2) {
            if (class180.field2079 == null) {
               class180.field2079 = class239.method4600(class234.field2819, class234.field2821, class96.field1263);
               if (class180.field2079 == null) {
                  return false;
               }
            }

            if (class142.field1575 == null) {
               class142.field1575 = new class27(class234.field2816, class234.field2814);
            }

            if (class234.field2815.method4402(class180.field2079, class234.field2817, class142.field1575, 22050)) {
               class234.field2815.method4457();
               class234.field2815.method4400(class146.field1611);
               class234.field2815.method4405(class180.field2079, class145.field1597);
               class234.field2818 = 0;
               class180.field2079 = null;
               class142.field1575 = null;
               class234.field2819 = null;
               return true;
            }
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class234.field2815.method4406();
         class234.field2818 = 0;
         class180.field2079 = null;
         class142.field1575 = null;
         class234.field2819 = null;
      }

      return false;
   }

   public static int method346(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + class273.method4875(var0.charAt(var4));
      }

      return var3;
   }

   static final void method343() {
      client.field603 = client.field592;
      class89.field1231 = true;
   }

   static final void method344(class248 var0, int var1, int var2) {
      if (var0.field2960 == 1) {
         class7.method47(var0.field3084, "", 24, 0, 0, var0.field2957);
      }

      String var4;
      if (var0.field2960 == 2 && !client.field562) {
         var4 = class24.method473(var0);
         if (var4 != null) {
            class7.method47(var4, class43.method850(65280) + var0.field3040, 25, 0, -1, var0.field2957);
         }
      }

      if (var0.field2960 == 3) {
         class7.method47("Close", "", 26, 0, 0, var0.field2957);
      }

      if (var0.field2960 == 4) {
         class7.method47(var0.field3084, "", 28, 0, 0, var0.field2957);
      }

      if (var0.field2960 == 5) {
         class7.method47(var0.field3084, "", 29, 0, 0, var0.field2957);
      }

      if (var0.field2960 == 6 && client.field573 == null) {
         class7.method47(var0.field3084, "", 30, 0, -1, var0.field2957);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      int var16;
      if (var0.field2976 == 2) {
         var16 = 0;

         for(var5 = 0; var5 < var0.field2989; ++var5) {
            for(var6 = 0; var6 < var0.field2972; ++var6) {
               var7 = (var0.field3024 + 32) * var6;
               var8 = (var0.field3025 + 32) * var5;
               if (var16 < 20) {
                  var7 += var0.field2945[var16];
                  var8 += var0.field3027[var16];
               }

               if (var1 >= var7 && var2 >= var8 && var1 < var7 + 32 && var2 < var8 + 32) {
                  client.field518 = var16;
                  client.field514 = var0;
                  if (var0.field3085[var16] > 0) {
                     class156 var9 = class10.method105(var0.field3085[var16] - 1);
                     if (client.field560 == 1 && class226.method4333(class240.method4608(var0))) {
                        if (var0.field2957 != class61.field911 || var16 != class10.field40) {
                           class7.method47("Use", client.field529 + " " + "->" + " " + class43.method850(16748608) + var9.field1835, 31, var9.field1801, var16, var0.field2957);
                        }
                     } else if (client.field562 && class226.method4333(class240.method4608(var0))) {
                        if ((class207.field2473 & 16) == 16) {
                           class7.method47(client.field565, client.field465 + " " + "->" + " " + class43.method850(16748608) + var9.field1835, 32, var9.field1801, var16, var0.field2957);
                        }
                     } else {
                        String[] var10 = var9.field1809;
                        int var11 = -1;
                        if (client.field553 && class79.method1911()) {
                           var11 = var9.method2994();
                        }

                        if (class226.method4333(class240.method4608(var0))) {
                           for(int var12 = 4; var12 >= 3; --var12) {
                              if (var12 != var11) {
                                 class376.method6457(var0, var9, var16, var12, false);
                              }
                           }
                        }

                        int var13 = class240.method4608(var0);
                        boolean var23 = (var13 >> 31 & 1) != 0;
                        if (var23) {
                           class7.method47("Use", class43.method850(16748608) + var9.field1835, 38, var9.field1801, var16, var0.field2957);
                        }

                        Object var10000 = null;
                        int var14;
                        if (class226.method4333(class240.method4608(var0))) {
                           for(var14 = 2; var14 >= 0; --var14) {
                              if (var14 != var11) {
                                 class376.method6457(var0, var9, var16, var14, false);
                              }
                           }

                           if (var11 >= 0) {
                              class376.method6457(var0, var9, var16, var11, true);
                           }
                        }

                        var10 = var0.field3029;
                        if (var10 != null) {
                           for(var14 = 4; var14 >= 0; --var14) {
                              if (var10[var14] != null) {
                                 byte var15 = 0;
                                 if (var14 == 0) {
                                    var15 = 39;
                                 }

                                 if (var14 == 1) {
                                    var15 = 40;
                                 }

                                 if (var14 == 2) {
                                    var15 = 41;
                                 }

                                 if (var14 == 3) {
                                    var15 = 42;
                                 }

                                 if (var14 == 4) {
                                    var15 = 43;
                                 }

                                 class7.method47(var10[var14], class43.method850(16748608) + var9.field1835, var15, var9.field1801, var16, var0.field2957);
                              }
                           }
                        }

                        class7.method47("Examine", class43.method850(16748608) + var9.field1835, 1005, var9.field1801, var16, var0.field2957);
                     }
                  }
               }

               ++var16;
            }
         }
      }

      if (var0.field2992) {
         if (client.field562) {
            if (class110.method2254(class240.method4608(var0)) && (class207.field2473 & 32) == 32) {
               class7.method47(client.field565, client.field465 + " " + "->" + " " + var0.field3036, 58, 0, var0.field3030, var0.field2957);
            }
         } else {
            for(var16 = 9; var16 >= 5; --var16) {
               var7 = class240.method4608(var0);
               boolean var21 = (var7 >> var16 + 1 & 1) != 0;
               String var17;
               if (!var21 && var0.field3054 == null) {
                  var17 = null;
               } else if (var0.field3037 != null && var0.field3037.length > var16 && var0.field3037[var16] != null && var0.field3037[var16].trim().length() != 0) {
                  var17 = var0.field3037[var16];
               } else {
                  var17 = null;
               }

               if (var17 != null) {
                  class7.method47(var17, var0.field3036, 1007, var16 + 1, var0.field3030, var0.field2957);
               }
            }

            var4 = class24.method473(var0);
            if (var4 != null) {
               class7.method47(var4, var0.field3036, 25, 0, var0.field3030, var0.field2957);
            }

            for(var5 = 4; var5 >= 0; --var5) {
               var8 = class240.method4608(var0);
               boolean var22 = (var8 >> var5 + 1 & 1) != 0;
               String var18;
               if (!var22 && var0.field3054 == null) {
                  var18 = null;
               } else if (var0.field3037 != null && var0.field3037.length > var5 && var0.field3037[var5] != null && var0.field3037[var5].trim().length() != 0) {
                  var18 = var0.field3037[var5];
               } else {
                  var18 = null;
               }

               if (var18 != null) {
                  class24.method460(var18, var0.field3036, 57, var5 + 1, var0.field3030, var0.field2957, var0.field3103);
               }
            }

            var6 = class240.method4608(var0);
            boolean var20 = (var6 & 1) != 0;
            if (var20) {
               class7.method47("Continue", "", 30, 0, var0.field3030, var0.field2957);
            }
         }
      }

   }
}
