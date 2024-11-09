package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        int summa = 0;

        while (true) {
            System.out.println("Give a number: ");
            int user_input = scanner.nextInt();

            if (user_input == 0) {
                System.out.println("Sum of the numbers: " + summa);
                break;
            } else if (user_input != 0) {
                summa += user_input;
            }
        
            

    }

}
}
