import java.util.Scanner;
public class Recur {
    public static void main(String[] args){
        Scanner cha = new Scanner(System.in);
        System.out.println("Enter the number");
        int c = cha.nextInt();
        
        System.out.println("Enter another number");
        int j = cha.nextInt();
        
        if(c > j) {
            System.out.println(c + " is greater than " + j);
            
        }else if ( c==j) {
            System.out.println(c + " is equal to " + j);
        }else{
            System.out.println(c + " is less than to " + j);
        }
    }
}