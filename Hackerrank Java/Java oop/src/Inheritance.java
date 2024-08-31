class Shape{
    public void area(){
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape{
    public void area(int h,int b){
        System.out.println((1/2)*b*h);
    }
}                //single level inheritance

class EquilateralTriangle extends Triangle{
    public void area(int a){
        System.out.println((3/4)*(a*a));
    }
}               //multilevel inheritance

class Circle extends Shape{
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}


//same class same name different methods: Compile time polymorphism
//different class same name : runtime polymorphism
public class Inheritance {
    public static void main(String[] str){

    }
}
