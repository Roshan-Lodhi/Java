package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static long sumOfMultiples(long k, long n) {
        long p=n/k;
        return k*(p*(p+1))/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long target = n-1;
            
            long sum3 = sumOfMultiples(3, target);
            long sum5 = sumOfMultiples(5, target);
            long sum15 = sumOfMultiples(15, target);
            
            long totalSum = sum3 +sum5 - sum15;
            
            System.out.println(totalSum);
        }
        
        in.close();
    }
}
