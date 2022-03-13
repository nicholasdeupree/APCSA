// Chapter 5 Question 27

// ________________________________________________

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  private Color skyColor;

  public Rainbow()
  {
    skyColor = Color.CYAN;
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    int xCenter, yCenter;
    xCenter = (int)(width/2.0);
    yCenter = (int)(height * 2.0/3.0);
    // Declare and initialize the radius of the large semicircle:
    int largeRadius = (int)(width/4.0);

    g.setColor(Color.RED);

    // Draw the large semicircle:
    g.fillArc( xCenter- largeRadius,yCenter - largeRadius,largeRadius*2,largeRadius*2,0,180);

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    int smallRadius = (int) (height/4.0);
    int mediumRadius = (int)(Math.sqrt(smallRadius*largeRadius)+.5);

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    g.setColor(Color.green);
    g.fillArc(xCenter - mediumRadius, yCenter - mediumRadius, 
            mediumRadius * 2, mediumRadius * 2, 0, 180);
    g.setColor(Color.magenta);
    g.fillArc(xCenter - smallRadius, yCenter - smallRadius, 
            smallRadius * 2, smallRadius * 2, 0, 180);

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings.
    // Draw the sky-color semicircle.
    int skyRadius = (int)((largeRadius - (3 * mediumRadius) + 
            (3 * smallRadius)) + 0.5);
    g.setColor(skyColor);
    g.fillArc(xCenter - skyRadius, yCenter - skyRadius, 
            skyRadius * 2, skyRadius * 2, 0, 180);
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}