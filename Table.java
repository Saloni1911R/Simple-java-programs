import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for(int i = 1; i <= 5 ; i++) {
            int a = number*i;
            System.out.println(number + " x " + i + " = "+ a);
        }
    }
}
