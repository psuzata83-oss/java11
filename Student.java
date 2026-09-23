//Question 1 — Student

//Create a Student class with:

//id
//name
//age

//Create the following overloaded constructors:

//Constructor with no arguments
//Constructor with id and name
//Constructor with id, name, and age

//Create three Student objects using the three different constructors and display their information.
class Student1{
    int id;
    String name;
    int age;


     Student1( int i , String n) {
        id=i;
        name=n;
    }

     Student1( int i ,String n , int a) {
        id=i;
        name=n;
        age=a;
    }
    void display(){
        System.out.println(id + " " + name + " " + age);

    }
}
public  class Student{

public static void main(String args[]){
    Student1  s1 = new Student1(1,"jhon");
    Student1 s2 = new Student1(
        
        
        
        
        
        2,"jane",20); 
       s1.display();
    s2.display();
}

    
}
