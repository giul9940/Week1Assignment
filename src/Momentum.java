import java.util.Scanner;

public class Momentum {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mass, velocity, momentum;        
        System.out.print("Enter the object's mass (kg's): ");
        mass = scan.nextDouble(); //the number equals what the user typed
        System.out.print("Enter the object's velocity (m/s): ");
        velocity = scan.nextDouble(); //the number equals what the user typed
        momentum = mass * velocity; //multiply mass and velocity together to get momentum
        System.out.format("The objects momentum is %.2f\n", momentum);
    }
    
}
