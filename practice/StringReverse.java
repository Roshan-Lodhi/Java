package practice;
public class StringReverse {
    
    public static void main(String [] args) {
        
        String name = "ROSHAN";

       

        char [] n = name.toCharArray();
        int sp = 0;
        int ep = n.length-1;



        for(int i=0; i<n.length; i++){
            while (sp<ep){
            char temp = n[sp];
            n[sp] = n[ep];
            n [ep] = temp;
            sp++;
            ep--;
            }

        }

       String namee = String.valueOf(n);

       System.out.println(namee);
    }
    
}
