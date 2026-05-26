package Loops;

import java.util.Scanner;

public class JavaBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break; 
            }
            System.out.println(n);
        } 
        while(true);


       /* for(int i = 1; i < 5; i++ ) {
            if (i == 3) {
                break;   
            }

            System.out.println(i);
        }
        System.out.println("i am out of the loop"); */
    }
    
}
