import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Die
{
   int X, Y, value, size;
   Color color;
   int valCount;
   
   public Die(int x, int y)
   {
      X = x;
      Y = y;
      color = Color.BLACK;
      value = (int)(Math.random()*6)+1;
      size = 50;
   }
   public int counter(){
      return value;
   }
   

   public void draw(Graphics g)
   {
      g.setColor(color);
      g.drawRoundRect(X, Y, size, size, 8, 8);
      g.fillRoundRect(X, Y, size, size, 8, 8);
      if(value == 1){
         g.setColor(Color.WHITE);
         g.fillOval((X+20), (Y+20), 10, 10);
      }
      if(value == 2){
         g.setColor(Color.WHITE);
         g.fillOval((X+10), (Y+10), 10, 10);
         g.fillOval((X+30), (Y+30), 10, 10);
      }
      if(value == 3){
         g.setColor(Color.WHITE);
         g.fillOval((X+10), (Y+10), 10, 10);
         g.fillOval((X+30), (Y+30), 10, 10);
         g.fillOval((X+20), (Y+20), 10, 10);
      }
      if(value == 4){
         g.setColor(Color.WHITE);
         g.fillOval((X+10), (Y+10), 10, 10);
         g.fillOval((X+30), (Y+30), 10, 10);
         g.fillOval((X+10), (Y+30), 10, 10);
         g.fillOval((X+30), (Y+10), 10, 10);
      }
      if(value == 5){
         g.setColor(Color.WHITE);
         g.fillOval((X+10), (Y+10), 10, 10);
         g.fillOval((X+30), (Y+30), 10, 10);
         g.fillOval((X+10), (Y+30), 10, 10);
         g.fillOval((X+30), (Y+10), 10, 10);
         g.fillOval((X+20), (Y+20), 10, 10);
      }
      if(value == 6){
         g.setColor(Color.WHITE);
         g.fillOval((X+10), (Y+5), 10, 10);
         g.fillOval((X+30), (Y+35), 10, 10);
         g.fillOval((X+10), (Y+35), 10, 10);
         g.fillOval((X+30), (Y+5), 10, 10);
         g.fillOval((X+10), (Y+20), 10, 10);
         g.fillOval((X+30), (Y+20), 10, 10);
      }
   }
   
}
