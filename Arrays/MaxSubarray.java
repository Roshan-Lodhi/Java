package Arrays;

import java.util.*;

public class MaxSubarray {

    public static void MaxSubarraySum(int number[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++) {
            int start = i;

            for(int j=i; j<number.length; j++) {

                int end = j;
                currSum = 0;

                for(int k=start; k<=end; k++) { //print

                    //subarray Sum
                    currSum += number[k];
                }

                System.out.println(currSum);

                if(maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println("max sum = " + maxSum);   
    }

    public static void main(String[] args) {

        int numbers[] = {1, -2, 6, -1, 3};
        MaxSubarraySum(numbers);

    }
    
}
