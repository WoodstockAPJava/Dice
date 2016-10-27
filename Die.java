import java.awt.Color;
import java.awt.Graphics;

public class Die
{
  int xcor;
  int ycor;
  int size;
  Color dcolor;
  int value;
  int valueCounter;
  
  public Die(int x, int y)
  {
   xcor=x;
   ycor=y;
   size= 220;
   dcolor=(dcolor.blue);
   value=(int)(Math.random()*6)+1;  
  }
  public int counter(){
   return value;
  }
  

  public void draw(Graphics g)
  {
    g.setColor(dcolor);
    g.fillRect(xcor,ycor, size, size);
    g.setColor(dcolor.white);
    if (value==1){
       g.fillOval(xcor+90,ycor+90, 40 ,40);
     }
    else if (value== 3||value== 5){
      g.fillOval(xcor+90,ycor+90, 40 ,40);
      g.fillOval(xcor+45,ycor+45, 40 ,40);
      g.fillOval(xcor+135,ycor+135, 40 ,40);
      if (value==5){
        g.fillOval(xcor+135,ycor+45, 40 ,40);
        g.fillOval(xcor+45,ycor+135, 40 ,40);
        }
     }
     else if (value == 2||value == 4||value == 6){
      g.fillOval(xcor+45,ycor+45, 40 ,40);
      g.fillOval(xcor+135,ycor+135, 40 ,40);
      if (value==4||value==6){
         g.fillOval(xcor+135,ycor+45, 40 ,40);
         g.fillOval(xcor+45,ycor+135, 40 ,40);
         if (value==6){
            g.fillOval(xcor+135,ycor+90, 40 ,40);
            g.fillOval(xcor+45,ycor+90, 40 ,40);


        }   
      }
    }
  }
   
}
