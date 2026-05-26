package conditional;

import java.util.*;

public class Primeno {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 != 0 && n % n == 0) {
            System.out.println("Prime No");
        }
        else {
            System.out.println("No");
        }
    }
}
