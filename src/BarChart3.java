import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;
import TurtleGraphics.SketchPadWindow;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PenBar b1 = new PenBar(), b2 = new PenBar(), b3 = new PenBar(), b4 = new PenBar();
        System.out.print("Enter the width for bar 1: ");
        b1.width = s.nextInt();
        System.out.print("Enter the width for bar 2: ");
        b2.width = s.nextInt();
        System.out.print("Enter the width for bar 3: ");
        b3.width = s.nextInt();
        System.out.print("Enter the width for bar 4: ");
        b4.width = s.nextInt();
        
        Pen p = new StandardPen(new SketchPadWindow(800,600));
       
        makeBar(p, b1, -380, 200, b1.width, Color.green);
        makeBar(p, b2, -380, 100, b2.width, Color.blue);
        makeBar(p, b3, -380, 0, b3.width, Color.yellow);
        makeBar(p, b4, -380, -100, b4.width, Color.orange);
    }
    
    public static void makeBar(Pen p, PenBar pb, int x, int y, int w, Color c){
        pb.x = x;
        pb.y = y;       
        pb.barColor = c;
        pb.draw(p);
    }
    
    
    
}
