package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        printTriangle(4);;
    } 
    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    }

