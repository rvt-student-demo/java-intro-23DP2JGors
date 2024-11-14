package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        count(5);
    } 
    public static void count(int fromNumberToOne) {
        for (int i = fromNumberToOne; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

