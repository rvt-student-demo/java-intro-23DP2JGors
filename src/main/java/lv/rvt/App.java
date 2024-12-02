package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<>();

        int user_input = scanner.nextInt();
        while (user_input != -1) {
            numlist.add(user_input);
            user_input = scanner.nextInt();
        }

        int greatest = numlist.get(0);

        for (int i = 0; i < numlist.size(); i++) {
            if (greatest < numlist.get(i)) {
                greatest = numlist.get(i);
            }
        }
        System.out.println("The greatest number in list: " + greatest);
        
        
    } 
    

    }

