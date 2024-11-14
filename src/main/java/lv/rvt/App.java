package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        number(3, 10);
    } 
    public static void number(int begining, float end) {
        for (int i = begining; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

