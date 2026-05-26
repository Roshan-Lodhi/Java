package Patterns;

public class StarPattern {
    public static void main(String[] args) {
        
      /* for(int line=1; line<=4; line++) {

            for(int star=1; star<=line; star++) {

                System.out.print("*");

            }
            System.out.println();

        } */

        // inverted star pattern
        
        int n = 4;
        for(int i=1; i<=4; i++) {

            for(int j=1; j<=(n-i+1); j++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }
    
}
