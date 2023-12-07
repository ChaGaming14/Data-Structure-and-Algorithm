import java.util.Scanner;

public class display_num {

    public static void display_num(int n) {
        if (n >= 1) {
            display_num(n - 1);  
            System.out.println(n);  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number: ");
        int maxNumber = scanner.nextInt();

        display_num(maxNumber);
    }
