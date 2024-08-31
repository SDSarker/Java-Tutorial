class Student {
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Student created");
    }

    public void printInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }
}


public class OOP2 {
    public static void main(String[] args){
        Student s1 = new Student("Soumya",18);      //parameterized constructor

        s1.printInfo();
    }
}
