
package string;

public class StringDemo1 {
    public static void main(String[] args) {
        //String Class
        
        String s1 = "Sihab"; //directly assigning a value to a string
        String s2 = new String("Sihab"); //creating a object and assign value
        
        //string is a sequence of character
        char[] s3 = {'s','i','h','a','b'}; //char type array
        System.out.println(s3);
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        
        int len = s1.length(); //length of s1
        System.out.println(len);
        
        //checking if s1 & s2 are equals
        if(s1==s2){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        } //not equals because, it'll compare the reference/object not values
        
        if(s1.equals(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        } //compares values
        
        if(s1.contains(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        } //compares values
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        } //compares values ignoring case sensitivity
        
        boolean con = s1.contains("rahman"); //checks if rahman is in s1
        System.out.println(con);
        
        boolean b = s1.isEmpty(); //checks if s1 is empty string
        System.out.println(b);
    }
}
