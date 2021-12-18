
package string;

public class StringDemo6 {
    public static void main(String[] args) {
        
        //Primitive to String
        int i = 10;
        String s = Integer.toString(i);
        System.out.println(s);
        
        double j = 8.5;
        String r = Double.toString(j);
        System.out.println(r);
        
        boolean k = false;
        String t = Boolean.toString(k);
        System.out.println(t);
        
        //String to Primitive
        String a = "100";
        int x = Integer.parseInt(a);
        System.out.println(x);
        
        String b = "12.5";
        double y = Double.parseDouble(b);
        System.out.println(y);
        
        int z = Integer.valueOf(a);
        System.out.println(z);
    }
}
