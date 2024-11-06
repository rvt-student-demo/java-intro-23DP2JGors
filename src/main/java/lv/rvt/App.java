package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int user_input = scanner.nextInt();

            if (user_input < 0) {
                System.out.println("Unsuitable number");
            }
            else if (user_input > 0) {
                user_input *= user_input;
                System.out.println(user_input);
            }
            else {
                break;
            }
        }

    }

}
