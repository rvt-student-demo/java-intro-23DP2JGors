package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> wordlist = new ArrayList<>();

        int user_input = scanner.nextInt();
        while(user_input != -1){
            wordlist.add(user_input);
            user_input = scanner.nextInt();
        }
        System.out.print("from where? ");
        int user_from = scanner.nextInt();
        System.out.print("To where? ");
        int user_to = scanner.nextInt();

        for(int i = user_from; i <= user_to; i++) {
            System.out.println(wordlist.get(i));
        }
        
        
    } 
    

    }

