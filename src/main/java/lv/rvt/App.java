package lv.rvt;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        
        float num1 = scanner.nextFloat(), num2 = scanner.nextFloat();
        double square_root = Math.sqrt(num1 + num2);
        System.out.println(square_root);

        
    }

}
