import java.util.Scanner;

public class formula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double redius = in.nextDouble();
        double height = in.nextDouble();
        
        double volume = Math.PI * redius * redius * height;
        System.out.printf("Volume is: %2f ",volume);
    }
}