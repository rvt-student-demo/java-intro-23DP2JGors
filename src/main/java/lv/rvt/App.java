package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int user_num = scanner.nextInt();

        int factorial = 1;

        for(int i = 1; i <= user_num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
            

    }
}

