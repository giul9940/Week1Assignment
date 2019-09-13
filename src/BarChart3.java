import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;
import TurtleGraphics.SketchPadWindow;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        PenBar b1 = new PenBar(), b2 = new PenBar(), b3 = new PenBar(), b4 = new PenBar();
        System.out.print("Enter the width for bar 1: ");
        b1.width = s.nextInt();
        System.out.print("Enter the width for bar 2: ");
        b2.width = s.nextInt();
        System.out.print("Enter");
    }
    
    public static void makeBar(Pen p, PenBar pb, int x, int y, int w, Color c){
        pb.x = x;
        pb.y = y;
       
        pb.barColor = c;
    }
    
    
}
