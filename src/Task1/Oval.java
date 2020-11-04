package Task1;
import java.awt.*;

public class Oval extends Shape {
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        color=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        x= (int) (Math.random()*700);
        y=(int)(Math.random()*400);
        g2.setPaint(color);
        g2.fillOval(x,y,(int)(Math.random()*350),(int)(Math.random()*350));
    }
}



