package function;

public class Prime {

    public static boolean isPrime(int n) {


    //    // boolean isPrime = true;
    //     for(int i=2; i<=n-1; i++) {
    //         if (n % i == 0) {
        
    //           //  isPrime = false;
    //           //  break;

    //             return false;
                
    //         }

    //     }
    //    // return isPrime;
    //     return true;
        
        if ( n == 2) {
            return false;
        }
        for(int i=2; i<= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        
        }
        return true;

    }

    public static void primeInRange(int n) {
        for(int i=2; i<=n; i++) {
            if (isPrime(i)) { //true
                System.out.print(i+" ");
                
            }
            
        }
        System.out.println();
        
    }
    
    public static void main(String args[]) {

       // System.out.println(isPrime(4));
        primeInRange(20);
    }
    
}
