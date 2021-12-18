
package OverloadingConstructor;

public class Test {
    public static void main(String[] args) {
        
        Person person1 = new Person();
        
        Person person2 = new Person("Sihab", "Male");
        person2.displayInfo();
        
        Person person3 = new Person("Leah", 24, "Female");
        person3.displayInfo();
    }
}
