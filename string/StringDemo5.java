
package string;

public class StringDemo5 {
    public static void main(String[] args) {
        String s1 = "Sihab";
        StringBuffer sb = new StringBuffer(s1);
        //String can't be changed directly unless we create a new object but buffer can be manipulated directly.
        System.out.println(sb);
        
        sb.append(" Rahman "); //add to string
        sb.append(25);
        System.out.println(sb);
        
        sb.reverse(); //reverse string
        System.out.println(sb);
        
        sb.delete(0, 6); //delete from index - to index
        System.out.println(sb);
        
        sb.setLength(4); //set string to specific length
        System.out.println(sb);
    }
}
