import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of class RoundBalloon here.
 * 
 * @author (Hamlet) 
 * @version (09/13/2016 ver 01a)
 */
public class RoundBalloon extends Balloon
{
    //field(s)
    
    //constructor(s)
    public RoundBalloon()
    {
        super();
    }
    
    public RoundBalloon(int x, int y, int r, Color c)
    {
        super(x, y, r, c);
    }

    //method(s)
  /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   */
  public void draw(Graphics g, boolean makeItFilled)
  {
    g.setColor(getColor());
    int xCenter = getX();
    int yCenter = getY();
    int radius = getRadius();
    
    if (makeItFilled)
      g.fillOval(xCenter - radius,
                 yCenter - radius, 2*radius, 2*radius);
    else
      g.drawOval(xCenter - radius,
                 yCenter - radius, 2*radius, 2*radius);
  }    
}








