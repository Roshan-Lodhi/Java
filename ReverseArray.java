import java.util.Scanner;
public class ReverseArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int arr []  = new int [n];

        for(int i=0; i<arr.length; i++){
            arr [i] = sc.nextInt();
        }

        int k = sc.nextInt(); 

          reverseArray (arr,0,arr.length-1);
          reverseArray (arr,0,k-1);
          reverseArray (arr,k,arr.length-1);
    }

    public static void reverseArray(int arr [], int sp, int ep){

        while (sp<ep){

            int temp = arr [sp];
            arr[sp] = arr [ep];
            arr[ep] = temp;
            sp++;
            ep--;

        }

        for(int num : arr){
            System.out.print(num);
        }
        

    }
    
    
}

