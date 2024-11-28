package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordlist = new ArrayList<>();

        String user_input = scanner.nextLine();
        while(user_input != ""){
            wordlist.add(user_input);
            user_input = scanner.nextLine();
        }
        int index = wordlist.size() - 1;
        System.out.println(wordlist.get(0));
        System.out.println(wordlist.get(index));
        
        
    } 
    

    }

