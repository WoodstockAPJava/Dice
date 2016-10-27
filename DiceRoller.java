import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.Timer;

public class DiceRoller extends JPanel implements KeyListener, MouseListener
{
   private Die die1; 
   public DiceRoller()
   {
      
      setBackground(Color.WHITE);                              // background color
      setBorder(BorderFactory.createLineBorder(Color.BLACK));  // border color
      addKeyListener(this);
      addMouseListener(this);
         }
  
   protected void paintComponent(Graphics g)
   {
      Graphics2D g2d = (Graphics2D)g;
      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      super.paintComponent(g2d);
      g.setColor (Color.black);
      
      //
      // START DRAWING CODE
      int count=0;
      for (int i=0;i<9;i++){
         die1=new Die(i*50,200);
         die1.draw(g);
         count = count + die1.getValue();
       
         }
      String t = "Count is " + Integer.toString(count) ;
      g.drawString(t,200, 150); 

      //
      // END DRAWING CODE
      //
      
   }

   public void addNotify() {
      super.addNotify();
      requestFocus();
   }
    
   public void mouseClicked(MouseEvent e) {
      repaint();
   }

   public void keyPressed(KeyEvent e) {
      if (e.getKeyCode() == KeyEvent.VK_SPACE) { 
         repaint();
      }
   }    
      
   public void mousePressed(MouseEvent e) {}
   public void mouseExited(MouseEvent e) {}
   public void mouseEntered(MouseEvent e) {}
   public void mouseReleased(MouseEvent e) {}
   public void keyTyped(KeyEvent e) {}
   public void keyReleased(KeyEvent e) {}   
        
   public static void main(String[] args)
   {
      JFrame window = new JFrame("Dice Roller");               // window title
      window.setSize(500, 300);                                // initial window width, height
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      DiceRoller panel = new DiceRoller();
      Container c = window.getContentPane();
      c.add(panel);
      window.setVisible(true);
   }

}
