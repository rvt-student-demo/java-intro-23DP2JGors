package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where from? ");
        int user_from = scanner.nextInt();

        System.out.print("Where to? ");
        int user_to = scanner.nextInt();

        for(int i = user_from; i <= user_to; i++){
            System.out.println(i);
        }
        
            

    }
}

