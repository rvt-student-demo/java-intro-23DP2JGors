package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        
        int user_num1 = scanner.nextInt(), user_num2 = scanner.nextInt();

        if (user_num1 < user_num2) {
            System.out.println(user_num1 + " ir mazāks nekā " + user_num2);

        } else if(user_num1 > user_num2) {
            System.out.println(user_num1 + " ir lielāks nekā " + user_num2);

        }else {
            System.out.println(user_num1 + " ir vienāds ar " + user_num2);
        }

        
    }

}
