package conditional;

import java.util.*;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();

        if (Number % 2 == 0) {
            System.out.println("Even");
        }

        else {
            System.out.println("Odd");
        }
    } 
}
