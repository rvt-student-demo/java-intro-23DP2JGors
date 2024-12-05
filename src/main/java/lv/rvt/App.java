package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<>();

        int user_num = scanner.nextInt();

        while (user_num != -1) {
            numlist.add(user_num);
            user_num = scanner.nextInt();
                }
                System.out.print("Search for: ");
                int user_input = scanner.nextInt();
    
                for (int i = 0; i <= numlist.size(); i++) {
                    if (user_input == numlist.get(i)) {
                        System.out.println(user_input + " is at index " + i);
            }
        }
        
        
    } 
    

    }

