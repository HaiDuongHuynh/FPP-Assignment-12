import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Type in an integer from 0 to 100:");
            int a = s.nextInt();
            if(a >100 || a<0){
                throw new UnsupportedOperationException("Number must between 0 to 100!");
            }


        } catch(InputMismatchException a){
            System.out.println("The value must be an Integer!");
        }
    }
}