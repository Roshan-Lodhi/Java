public class SwapTrwoString {

    public static void main(String[] args) {
         
         String str1 = "Roshan";
         String str2 = "Lodhi";

         str1 = str1.concat(str2);
         str2 = str1.substring(0, str1.length() - str2.length());
         str1 = str1.substring(str2.length());


         System.out.println(str1);
         System.out.println(str2);
    }
    
}
