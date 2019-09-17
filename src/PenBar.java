import TurtleGraphics.Pen;
import java.awt.Color;


public class PenBar {
    int x, y;
    int width;
    Color barColor;
    
    void draw(Pen p){
        p.up();
        p.move(x,y);
        p.down();
        p.setDirection(0);
        p.setColor(barColor);
        p.setWidth(50);
        p.move(width);
        p.up();
        p.move(30);
        p.down();
        p.drawString("Value: " + width);
    }
}
