package function;

public class BinToDec {

    // Binary to Decimal
    public static void binTodec(int binNum) {

        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {

            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }

        System.out.println("decimal of " + myNum +" = " + decNum);
    }


    // Decimal to Binary
    public static void DecToBin(int n) {

        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {

            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
            
        }

        System.out.println("binary form of " + myNum + " = " + binNum);

    }

    public static void main(String[] args) {

       // binTodec(101);
        DecToBin(12);
        
    }
    
}


