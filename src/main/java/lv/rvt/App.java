package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        
        int user_num = scanner.nextInt();

        if (user_num < 0) {
            System.out.println(user_num * -1);
        }
        else {
            System.out.println(user_num);
        }

        
    }

}
