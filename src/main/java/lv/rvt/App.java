package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers: ");
        int user_num = scanner.nextInt();

        int count = 0;
        float sum = 0;
        int odd = 0;
        int even = 0;
        

        while (true) {
            if (user_num == -1) {

                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + sum / count);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            } 
            else if (user_num != -1) {
                count++;
                sum += user_num;
                if (user_num % 2 == 0) {
                    even++;
                }else {
                    odd++;
                }
                user_num = scanner.nextInt();
            }
        }
            

    }
}

