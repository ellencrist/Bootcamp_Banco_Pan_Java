import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tabuada = input.nextInt();
        System.out.println("Enter which table you want:");

        System.out.println("Tabuada: "+ tabuada);

        for( int count = 1; count <= 10; count++){
            System.out.println(tabuada + "x" +count + "="+(tabuada*count));
        }


    }
}
