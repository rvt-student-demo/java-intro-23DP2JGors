package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        printSquare(4);
    } 
    public static void printSquare(int size) {
        for(int i = 0; i < size; i++) {
            for(int u = 0; u < size; u++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }

    }

