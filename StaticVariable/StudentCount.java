
package StaticVariable;

public class StudentCount {
    
    static int count = 0;
    
    StudentCount(){
        count++;
    }
    
    void displayInfo(){
        System.out.println("count: "+count);
    }
}

