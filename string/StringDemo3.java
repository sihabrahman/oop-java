
package string;

public class StringDemo3 {
    public static void main(String[] args) {
        String hello = "Hello World";
        System.out.println(hello);
        
        char at = hello.charAt(3); 
        //finds the char at given index number
        System.out.println(at);
        
        int asc = hello.codePointAt(0); 
        //asci value of the given index number
        System.out.println(asc);
        
        int pos1 = hello.indexOf('W'); 
        //shows the index number of W
        System.out.println(pos1);
        
        int pos2 = hello.lastIndexOf('o'); 
        //shows last found 'o' index number
        System.out.println(pos2);
    }
}
