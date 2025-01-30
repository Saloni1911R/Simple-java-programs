import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
    System.out.println("Enter the Number");
    Scanner sr = new Scanner(System.in);
    int a = sr.nextInt();
    if(a % 2 == 0) {
        System.out.println(a + " Even");
    }
    else {
        System.out.println(a + " Odd");
    }
    }
}