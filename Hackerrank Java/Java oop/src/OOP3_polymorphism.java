//Compile time polymorphism

//Method overloading
class Student1{
    String name;
    int age;
    public void display(String name){
        System.out.println("Name is"+name);
    }

    public void display(String name,int age){
        System.out.println("Name is "+name+" and age is "+age);
    }

    public void display(){
        System.out.println("Student is anonymous");
    }

}

public class OOP3_polymorphism {
    public static void main(String[] args){
        Student1 s1=new Student1();
        s1.display();
        s1.display("Soumya",12);
        s1.display("Soumya");

    }
}
