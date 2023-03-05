import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        int number;
        int largest = 0;
        int sum = 0;

        int count = 0;
        do{
            System.out.println("Number: ");
            number = input.nextInt();
            
            sum = sum + number;
            if(number > largest) largest = number;
            
            count = count + 1;
            
        }while(count < 5);
        
        System.out.println("Largest number: "+largest);
        System.out.println("Avarage:" + (sum/5));




    }
}
