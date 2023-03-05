import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        int numberNumbers = 0;
        int  numberPairs = 0, numberOdd = 0;
        
        System.out.println("Number of numbers: ");
        numberNumbers = input.nextInt();
        
        int count = 0;
        do{
            System.out.println("Number: ");
            number =  input.nextInt();
            
            if (number % 2 == 0) numberPairs++;
            else numberOdd++;
            
            count++;
        }while(count < numberNumbers);
        
        System.out.println("number of pairs: "+numberPairs);
        System.out.println("amount of odd: "+ numberOdd);
    }
}
