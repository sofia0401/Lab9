package Task1;
import java.awt.*;

public class Arc extends Shape {

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        color=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        x= (int) (Math.random()*700);
        y=(int)(Math.random()*300);
        g2.setPaint(color);
        g2.fillArc(x,y,(int)(Math.random()*400),(int)(Math.random()*400),(int)(Math.random()*361),(int)(Math.random()*361));
    }
}

