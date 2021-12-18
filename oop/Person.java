
package oop;

public class Person {
    String name, gender;
    int age;
    
    //Constructor
    Person(String n, int a, String g){
        name = n;
        age = a;
        gender = g;
    }
    
    //Parameterized method
    void setInfo(String n, int a, String g){
        name = n;
        age = a;
        gender = g;
    }
    
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("\n");
    }
}
