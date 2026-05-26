package conditional;

import java.util.*;

public class Ifelse {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("Adult");
        }

        if (age > 13 && age < 18) {
            System.out.println("Teenager");
        }

        else {
            System.out.println("Not Adult");
        }
    } 
}
