import java.util.Scanner;

public class Holo_Rectangle {
    public static void main(String[] args){
        System.out.println("Enter Numbers:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for(int j = 1 ; j <= y ; j++) {
                if (i == 1|| j == 1 || i == x || j == y ){
                System.err.print("*");
                }
                else {
                    System.err.print(" ");
                }
            }
            System.err.print("\n");
        }
    }
}