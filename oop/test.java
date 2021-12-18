
package oop;

public class test {
    public static void main(String[] args) {
        
        //declare and create a new person1 object
        Person person1 = new Person("Sihab",25,"Male");
        //person1.setInfo("Sihab",25,"Male");
        person1.displayInfo();
        
        //declare and create a new person2 object
        Person person2 = new Person("S", 24, "Female");
        //person2.setInfo("S", 24, "Female");
        person2.displayInfo();
        
    }
}
