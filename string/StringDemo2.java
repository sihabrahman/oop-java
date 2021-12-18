
package string;

public class StringDemo2 {
    public static void main(String[] args) {
        
        String firstName = "Sihab";
        String lastName = " Rahman";
        
        String fullName = firstName.concat(lastName); 
        //adding two sting together
        System.out.println(fullName);
        
        String upperName = fullName.toUpperCase(); 
        //all letter uppercase
        System.out.println(upperName);
        
        String lowerName = fullName.toLowerCase(); 
        // all letter lowercase
        System.out.println(lowerName);
        
        boolean f = firstName.startsWith("Si"); 
        //if the firstName starts with Si
        System.out.println(f);
        
        boolean l = lastName.endsWith("an"); 
        //if the lastName ends with an
        System.out.println(l);
        
        String[] names = {"Sakib", "Tamim", "Bijoy"};
        for(String x: names){
            System.out.println(x);
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }

    }
}    
