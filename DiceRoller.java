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
   
   public DiceRoller()
   {
      setBackground(Color.WHITE);                              // background color
      setBorder(BorderFactory.createLineBorder(Color.BLACK));  // border color
      addKeyListener(this);
      addMouseListener(this);
   }
  
   protected void paintComponent(Graphics g)
   {
      int valueCounter=0;
      Graphics2D g2d = (Graphics2D)g;
      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      super.paintComponent(g2d);
      
      //
      // START DRAWING CODE
      //
      for (int i=10; i<1680; i=i+240){
         Die unoD = new Die(i,30);
         unoD.draw(g);
         valueCounter=valueCounter+unoD.counter();
      }
      Die unoD = new Die(10,280);
      unoD.draw(g);
      valueCounter=valueCounter+unoD.counter();
      Die uneD = new Die(250,280);
      uneD.draw(g);
      valueCounter=valueCounter+unoD.counter();
      Color myNewBlack = new Color (0, 0, 0);
      g.setColor(myNewBlack);
      g.drawString(Integer.toString(valueCounter), 30, 600);
      


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
