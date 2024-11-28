package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> wordlist = new ArrayList<>();

        int user_number = scanner.nextInt();

        while (user_number != 0) {
            wordlist.add(user_number);
            user_number = scanner.nextInt();
        }
        int sum = wordlist.get(1) + wordlist.get(2);
        System.out.println(sum);

        
    } 
    

    }

