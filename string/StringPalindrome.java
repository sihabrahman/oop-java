
package string;

public class StringPalindrome {
    public static void main(String[] args) {
        
        String s1 = "madam";
        //converting to a buffer for manipulating
        StringBuffer sb = new StringBuffer(s1);
        
        String s2 = sb.reverse().toString();
        //used toSting to convert the buffer to a string
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
