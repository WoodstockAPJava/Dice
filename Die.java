import java.awt.Color;
import java.awt.Graphics;

public class Die
{
  private int xCoordinate, yCoordinate, dieValue;
  public Die(){
   int xCoordinate = 0;
   int yCoordinate = 0;
   int sideLength = 10;
   
   int dieValue = (int) ((Math.random()*6)+1);

  }
  public Die(int x, int y)
  {
  
   xCoordinate = x;
   yCoordinate = y;
   dieValue = (int) ((Math.random()*6)+1);

  }
  public int getX()
  {
    return xCoordinate;
  }

  public int getY()
  {
    return yCoordinate;
  }
  public int getValue()
  {
    return dieValue;
  }


  public void draw(Graphics g)
  {
   int x = getX();
   int y = getY();
   int dieValue = getValue();
   
   g.drawRoundRect(x, y, 50, 50, 30, 30);
   
   if (dieValue == 1){
      g.fillOval(x+20,y+20,10,10);
   }
   if (dieValue == 2){

      g.fillOval(x+10,y+10,10,10);
      g.fillOval(x+30,y+30,10,10);
   }
   if (dieValue == 3){

      g.fillOval(x+10,y+10,10,10);
      g.fillOval(x+20,y+20,10,10);
      g.fillOval(x+30,y+30,10,10);
   }
   if (dieValue == 4){

      g.fillOval(x+10,y+10,10,10);
      g.fillOval(x+10,y+30,10,10);
      g.fillOval(x+30,y+10,10,10);
      g.fillOval(x+30,y+30,10,10);
   }
   if (dieValue == 5){

      g.fillOval(x+10,y+10,10,10);
      g.fillOval(x+10,y+30,10,10);
      g.fillOval(x+30,y+10,10,10);
      g.fillOval(x+30,y+30,10,10);
      g.fillOval(x+20,y+20,10,10);
   }
   if (dieValue == 6){
 
      g.fillOval(x+10,y+10,10,10);
      g.fillOval(x+10,y+30,10,10);
      g.fillOval(x+30,y+10,10,10);
      g.fillOval(x+30,y+30,10,10);
      g.fillOval(x+10,y+20,10,10);
      g.fillOval(x+30,y+20,10,10);
   }
   
   

  }
  public void setDieValue()
  {
   int dieValue=1;
   
  }
   
}
