package practice;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
         
        // if ( n % n == 0 && n % 2 != 0) {
        //     System.out.println(" prime no"); 
        // }
        // else{
        //     System.out.println("Not");
        // }
      
       System.out.println("Prime numbers " + n);
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        
            if (isPrime) {
                System.out.println(num);
            }
        } 

    }

}
