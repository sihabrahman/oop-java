
package string;

public class WrapperDemo {
    public static void main(String[] args) {
        
        //Primitive -> Object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y="+y);
        
        Integer z = x; //Integer.valueOf(x) -> Autoboxing
        System.out.println("z="+z);
        
        //Object -> Primitive
        Double d = new Double (8.5);
        System.out.println(d);
        
        double e = d; //d.doubleValue() -> Unboxing
        System.out.println("e="+e);
    }
}
