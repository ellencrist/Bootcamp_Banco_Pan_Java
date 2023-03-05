import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Factorial: ");
        int factorial = input.nextInt();
        
        int multiplication = 1;

        System.out.print(factorial + "! = ");
        for(int i = factorial; i >= 1; i -- ){
            multiplication = multiplication * i;
        }
        System.out.println(multiplication);










    }
}
