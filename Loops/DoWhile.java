package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int counter = 1;

        do {
            System.out.println("Hello World");
            counter++;
        }
        while(counter <= n);
    }
    
}
