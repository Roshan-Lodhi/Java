package function;

public class FunOver {

  /*   public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {                                                                                                                                                                                                                                                                                                      
        return a + b + c;
    }  */



    // function to calculate sum of 3 number 
    public static int sum(int a, int b) {  // Function overloading parameter
        return a + b;
    }

    // function to calculate integer sum  
    public static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 5 ));
       // System.out.println(sum(5, 2, 1));
        System.out.println(sum(3.2f, 4.8f));
        
    }
    
}
