package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        String user_name = scanner.nextLine(); 
        while (user_name != "") {
            names.add(user_name);
            user_name = scanner.nextLine();
        } 
        System.out.print("Search for? ");
        String user_input = scanner.nextLine();

        boolean found = false;

        for (String name: names) {
            if (name.equals(user_input)) {
                System.out.println(user_input + " was found!");
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println(user_input + " was not found!");
        }
    }
}

