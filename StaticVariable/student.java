
package StaticVariable;

public class student {
    
    String name;
    int id;
    static String department = "CSE";
    
    student(String n, int i){
        name = n;
        id = i;
    }
    
    void displayinfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Dept: "+department);
        System.out.println("\n");
    }
}
