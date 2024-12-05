package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<>();

        int user_num = scanner.nextInt();

        while (user_num != 9999) {
            numlist.add(user_num);
            user_num = scanner.nextInt();
                }

                int smallest = numlist.get(0);
                
                for (int i = 0; i < numlist.size(); i++) {
                    if (numlist.get(i) < smallest) {
                        smallest = numlist.get(i);
                        }
                    }
                    System.out.println("Smallest number: " + smallest);

                    for (int i = 0; i < numlist.size(); i++){
                        if (numlist.get(i) == smallest) {
                            System.out.println("Found at index: " + i);
                    }
                }
            }
        }

