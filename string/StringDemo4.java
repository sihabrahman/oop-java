
package string;

public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = " Hello World";
        System.out.println(s1);
        
        String s2 = s1.replace('o', 'p');
        //replacing char 'o' with 'p' in s1
        System.out.println(s2);
        
        String[] s3 = s1.split(" ");
        for(String x : s3){
            System.out.println(x);
        }
    }
}
