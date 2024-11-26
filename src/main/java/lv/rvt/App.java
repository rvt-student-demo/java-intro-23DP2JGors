package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        printSquare(17, 3);
    } 
    public static void printSquare(int width, int lenght) {
        for(int i = 0; i < lenght; i++) {
            for(int u = 0; u < width; u++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }

    }

