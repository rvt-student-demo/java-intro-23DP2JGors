package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int last_num = scanner.nextInt();

        int summa = 0;

        for(int i = 1; i <= last_num; i ++) {
             summa += i;
        }
        System.out.println("The sum is " + summa);
        
            

    }
}

