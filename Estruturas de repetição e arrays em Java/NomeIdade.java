import java.util.Scanner;

public class NomeIdade{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;

        while(true){
            System.out.println("Enter your name");
            name = scan.next();
            if (name.equals("0")) break;
            
            System.out.println("Enter your age: ");
            age = scan.nextInt();
            if (age==0) break;

        }
        System.out.println("you've finished the program");
    }

}