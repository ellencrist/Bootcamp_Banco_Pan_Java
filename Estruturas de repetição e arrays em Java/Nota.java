import java.util.Scanner;;
public class Nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int schoolGrade;

        System.out.println("enter the school grade: ");
        schoolGrade = input.nextInt();

        while(schoolGrade < 0 | schoolGrade > 10){
            System.out.println("invalid note! Type again: ");
            schoolGrade = input.nextInt();
        }
        System.out.println("end of the program :)");


    }
}
