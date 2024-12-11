package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int user_input = scanner.nextInt();

        while(user_input != -1) {
            numbers.add(user_input);
            user_input = scanner.nextInt();
        }
        int sum = 0;

        for (int number: numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
        }
    }

