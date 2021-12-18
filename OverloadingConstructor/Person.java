
package OverloadingConstructor;

public class Person {
    String name, gender;
    int age;
    
    //Constructor
    //constructor has the same name as the class
    Person(){
        System.out.println("No Information");
    }
    
    Person(String n, String g){
        name = n;
        gender = g;
    }
    
    Person(String n, int a, String g){
        name = n;
        age = a;
        gender = g;
    }
    
    //method
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("\n");
    }
}
