package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int user_num = scanner.nextInt();
            if (user_num == 4) {
                break;
            }
        }

    }

}
