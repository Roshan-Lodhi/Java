package conditional;

import java.util.*;

public class Largestno {
    public static void main(String[] args) {
        int A = 6, B = 3, C =1;
        
        if ( (A >= B) &&  (A >= C) ) {
            System.out.println("largest is A");
        }
        else if (B >= C) {
            System.out.println("largest is B");
        }
        else {
            System.out.println("largest is C");
        }
  
    }

}


